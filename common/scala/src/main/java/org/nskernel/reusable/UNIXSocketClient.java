package org.nskernel.reusable;

import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.util.concurrent.TimeUnit;
import jnr.unixsocket.UnixSocketAddress;
import jnr.unixsocket.UnixSocketChannel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;

public class UNIXSocketClient {
    static final int BUFSIZE = 10 * 1024 * 1024; // 10M buf
    static int DELAY = 0;   // Milliseconds to delay between sends

    public static byte[] reencryptToWorkerEnclave(byte[] payload_zip, long payloadSize_zip) throws Exception {
        // Process ZIP
        byte[] payload = new byte[BUFSIZE];
        int payloadSize = -1;
        String payloadName = new String();
        
        System.out.println("Entering unzipping...\n");
        ByteArrayInputStream payloadByteStream = new ByteArrayInputStream(payload_zip);
        ZipInputStream zis = new ZipInputStream(payloadByteStream);
        System.out.println("Now unzipping...\n");
        try {
            ZipEntry entry = zis.getNextEntry();
            int temp_read_size;
            //while(entry != null) {
            //    assertEquals("README", entry.getName());
            //    ...
            //    entry = zais.getNextZipEntry();
            //}
            payloadName = entry.getName();
            payloadSize = (int)entry.getSize();
            System.out.println("WASM Payload Name: " + payloadName + " size " + payloadSize);
            System.out.println("payload buffer size = " + payload.length);
            payloadSize = 0;
            while ((temp_read_size = zis.read(payload, payloadSize, BUFSIZE - payloadSize)) > 0) {
                //System.out.println("Read " + temp_read_size);
                payloadSize += temp_read_size;
            }
            System.out.println("WASM Payload Size: " + payloadSize);
        } catch (Exception e) {
            System.out.println("Unzip failed: " + e.toString());
        }finally {
            zis.close();
        }

        java.io.File path = new java.io.File("/tmp/UNIX.domain");
        int retries = 0;
        while (!path.exists()) {
            TimeUnit.MILLISECONDS.sleep(500L);
            retries++;
            if (retries > 10) {
                throw new IOException(
                    String.format(
                        "File %s does not exist after retry",
                        path.getAbsolutePath()
                    )
                );
            }
        }
        UnixSocketAddress address = new UnixSocketAddress(path);
        UnixSocketChannel channel = UnixSocketChannel.open(address);
        System.out.println("connected to " + channel.getRemoteSocketAddress());

        ByteBuffer sendBuf = ByteBuffer.allocate(BUFSIZE + 24);
        sendBuf.order(ByteOrder.LITTLE_ENDIAN);
	    final int FIFO_DH_MSG_REQ = 4;
	    // int type
	    // long long total_msg_size
	    // int sockfd // leave 0
	    // ======^header^=======
	    // int session id
	    // long long max_payload_size
	    // long long payload_size
	    // ByteArray payload (in secure_message_t format but we don't care)
	    sendBuf.putInt(FIFO_DH_MSG_REQ);
	    sendBuf.putLong((long)payloadSize + 20); // payload + size
	    sendBuf.putInt(0); // Always 0
	    sendBuf.putInt(0); // Always 0
	    sendBuf.putLong(BUFSIZE);
	    sendBuf.putLong((long)payloadSize);
        sendBuf.put(payload, 0, payloadSize);
        sendBuf.flip();
        byte[] workArray = new byte[sendBuf.remaining()];
        System.out.println("!!!!!!!!!! Bytes Written " + channel.write(sendBuf));
        System.out.println("BUFSIZE = " + (long)BUFSIZE + " getLong = " + sendBuf.getLong(8));
        System.out.println("payloadSize = " + (long)payloadSize + " getLong = " + sendBuf.getLong(16));
        

        channel.shutdownOutput();
        ByteBuffer result = ByteBuffer.allocate(BUFSIZE + 24);
        result.order(ByteOrder.LITTLE_ENDIAN);
        int c;
        while ((c = channel.read(result)) > 0) {
            System.out.printf("Read = %d\n", c);
        }
        
        // Supposed to be executed only once
        result.flip();
	// Now get the buffer
	System.out.println("Type (5) " + result.getInt());
	System.out.println("msg_size " + result.getLong()); // payload + size
	System.out.println("fd " + result.getInt()); // Always 0
	System.out.println("actual size " + result.remaining());
	workArray = new byte[result.remaining()];
	result.get(workArray);
        result.clear();
        channel.close();

        // Rezip
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipOutputStream zos = new ZipOutputStream(baos);
        ZipEntry outEntry = new ZipEntry(payloadName);
        zos.putNextEntry(outEntry);
        zos.write(workArray, 0, payloadSize);
        zos.flush();
        zos.close();

        return baos.toByteArray();
    }
}
