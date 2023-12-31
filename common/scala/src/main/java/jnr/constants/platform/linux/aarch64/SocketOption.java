// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2021-10-12 23:15:17 +0200
package jnr.constants.platform.linux.aarch64;
public enum SocketOption implements jnr.constants.Constant {
SO_DEBUG(0x1L),
SO_ACCEPTCONN(0x1eL),
SO_REUSEADDR(0x2L),
SO_KEEPALIVE(0x9L),
SO_DONTROUTE(0x5L),
SO_BROADCAST(0x6L),
// SO_USELOOPBACK not defined
SO_LINGER(0xdL),
SO_OOBINLINE(0xaL),
SO_REUSEPORT(0xfL),
SO_TIMESTAMP(0x1dL),
// SO_ACCEPTFILTER not defined
// SO_DONTTRUNC not defined
// SO_WANTMORE not defined
// SO_WANTOOBFLAG not defined
SO_SNDBUF(0x7L),
SO_RCVBUF(0x8L),
SO_SNDLOWAT(0x13L),
SO_RCVLOWAT(0x12L),
SO_SNDTIMEO(0x15L),
SO_RCVTIMEO(0x14L),
SO_ERROR(0x4L),
SO_TYPE(0x3L),
// SO_NREAD not defined
// SO_NKE not defined
// SO_NOSIGPIPE not defined
// SO_NOADDRERR not defined
// SO_NWRITE not defined
// SO_REUSESHAREUID not defined
// SO_LABEL not defined
// SO_PEERLABEL not defined
SO_ATTACH_FILTER(0x1aL),
SO_BINDTODEVICE(0x19L),
SO_DETACH_FILTER(0x1bL),
SO_NO_CHECK(0xbL),
SO_PASSCRED(0x10L),
SO_PEERCRED(0x11L),
SO_PEERNAME(0x1cL),
SO_PRIORITY(0xcL),
SO_SNDBUFFORCE(0x20L),
SO_RCVBUFFORCE(0x21L),
SO_GET_FILTER(0x1aL),
SO_TIMESTAMPNS(0x23L),
// SO_RECVUCRED not defined
// SO_MAC_EXEMPT not defined
// SO_ALLZONES not defined
SO_PEERSEC(0x1fL),
SO_PASSSEC(0x22L),
SO_MARK(0x24L),
SO_TIMESTAMPING(0x25L),
SO_PROTOCOL(0x26L),
SO_DOMAIN(0x27L),
SO_RXQ_OVFL(0x28L),
SO_WIFI_STATUS(0x29L),
SO_PEEK_OFF(0x2aL),
SO_NOFCS(0x2bL),
SO_LOCK_FILTER(0x2cL),
SO_SELECT_ERR_QUEUE(0x2dL),
SO_BUSY_POLL(0x2eL),
SO_MAX_PACING_RATE(0x2fL),
SO_BPF_EXTENSIONS(0x30L),
SO_SECURITY_AUTHENTICATION(0x16L),
SO_SECURITY_ENCRYPTION_NETWORK(0x18L),
SO_SECURITY_ENCRYPTION_TRANSPORT(0x17L);
private final long value;
private SocketOption(long value) { this.value = value; }
public static final long MIN_VALUE = 0x1L;
public static final long MAX_VALUE = 0x30L;

static final class StringTable {
  public static final java.util.Map<SocketOption, String> descriptions = generateTable();
  public static final java.util.Map<SocketOption, String> generateTable() {
    java.util.Map<SocketOption, String> map = new java.util.EnumMap<SocketOption, String>(SocketOption.class);
  map.put(SO_DEBUG, "SO_DEBUG");
  map.put(SO_ACCEPTCONN, "SO_ACCEPTCONN");
  map.put(SO_REUSEADDR, "SO_REUSEADDR");
  map.put(SO_KEEPALIVE, "SO_KEEPALIVE");
  map.put(SO_DONTROUTE, "SO_DONTROUTE");
  map.put(SO_BROADCAST, "SO_BROADCAST");
  map.put(SO_LINGER, "SO_LINGER");
  map.put(SO_OOBINLINE, "SO_OOBINLINE");
  map.put(SO_REUSEPORT, "SO_REUSEPORT");
  map.put(SO_TIMESTAMP, "SO_TIMESTAMP");
  map.put(SO_SNDBUF, "SO_SNDBUF");
  map.put(SO_RCVBUF, "SO_RCVBUF");
  map.put(SO_SNDLOWAT, "SO_SNDLOWAT");
  map.put(SO_RCVLOWAT, "SO_RCVLOWAT");
  map.put(SO_SNDTIMEO, "SO_SNDTIMEO");
  map.put(SO_RCVTIMEO, "SO_RCVTIMEO");
  map.put(SO_ERROR, "SO_ERROR");
  map.put(SO_TYPE, "SO_TYPE");
  map.put(SO_ATTACH_FILTER, "SO_ATTACH_FILTER");
  map.put(SO_BINDTODEVICE, "SO_BINDTODEVICE");
  map.put(SO_DETACH_FILTER, "SO_DETACH_FILTER");
  map.put(SO_NO_CHECK, "SO_NO_CHECK");
  map.put(SO_PASSCRED, "SO_PASSCRED");
  map.put(SO_PEERCRED, "SO_PEERCRED");
  map.put(SO_PEERNAME, "SO_PEERNAME");
  map.put(SO_PRIORITY, "SO_PRIORITY");
  map.put(SO_SNDBUFFORCE, "SO_SNDBUFFORCE");
  map.put(SO_RCVBUFFORCE, "SO_RCVBUFFORCE");
  map.put(SO_GET_FILTER, "SO_GET_FILTER");
  map.put(SO_TIMESTAMPNS, "SO_TIMESTAMPNS");
  map.put(SO_PEERSEC, "SO_PEERSEC");
  map.put(SO_PASSSEC, "SO_PASSSEC");
  map.put(SO_MARK, "SO_MARK");
  map.put(SO_TIMESTAMPING, "SO_TIMESTAMPING");
  map.put(SO_PROTOCOL, "SO_PROTOCOL");
  map.put(SO_DOMAIN, "SO_DOMAIN");
  map.put(SO_RXQ_OVFL, "SO_RXQ_OVFL");
  map.put(SO_WIFI_STATUS, "SO_WIFI_STATUS");
  map.put(SO_PEEK_OFF, "SO_PEEK_OFF");
  map.put(SO_NOFCS, "SO_NOFCS");
  map.put(SO_LOCK_FILTER, "SO_LOCK_FILTER");
  map.put(SO_SELECT_ERR_QUEUE, "SO_SELECT_ERR_QUEUE");
  map.put(SO_BUSY_POLL, "SO_BUSY_POLL");
  map.put(SO_MAX_PACING_RATE, "SO_MAX_PACING_RATE");
  map.put(SO_BPF_EXTENSIONS, "SO_BPF_EXTENSIONS");
  map.put(SO_SECURITY_AUTHENTICATION, "SO_SECURITY_AUTHENTICATION");
  map.put(SO_SECURITY_ENCRYPTION_NETWORK, "SO_SECURITY_ENCRYPTION_NETWORK");
  map.put(SO_SECURITY_ENCRYPTION_TRANSPORT, "SO_SECURITY_ENCRYPTION_TRANSPORT");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
