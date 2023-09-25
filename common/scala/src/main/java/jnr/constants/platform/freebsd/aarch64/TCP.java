// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2021-10-08 17:37:37 +0200
package jnr.constants.platform.freebsd.aarch64;
public enum TCP implements jnr.constants.Constant {
TCP_MAX_SACK(4L),
TCP_MSS(536L),
TCP_MINMSS(216L),
// TCP_MINMSSOVERLOAD not defined
TCP_MAXWIN(65535L),
TCP_MAX_WINSHIFT(14L),
TCP_MAXBURST(4L),
TCP_MAXHLEN(60L),
TCP_MAXOLEN(40L),
TCP_NODELAY(1L),
TCP_MAXSEG(2L),
TCP_NOPUSH(4L),
TCP_NOOPT(8L),
// TCP_KEEPALIVE not defined
// TCP_NSTATES not defined
// TCP_RETRANSHZ not defined
// TCP_CORK not defined
// TCP_DEFER_ACCEPT not defined
TCP_INFO(32L),
TCP_KEEPCNT(1024L),
TCP_KEEPIDLE(256L),
TCP_KEEPINTVL(512L),
// TCP_LINGER2 not defined
TCP_MD5SIG(16L),
// TCP_QUICKACK not defined
// TCP_SYNCNT not defined
// TCP_WINDOW_CLAMP not defined
TCP_FASTOPEN(1025L),
TCP_CONGESTION(64L);
// TCP_COOKIE_TRANSACTIONS not defined
// TCP_QUEUE_SEQ not defined
// TCP_REPAIR not defined
// TCP_REPAIR_OPTIONS not defined
// TCP_REPAIR_QUEUE not defined
// TCP_THIN_DUPACK not defined
// TCP_THIN_LINEAR_TIMEOUTS not defined
// TCP_TIMESTAMP not defined
// TCP_USER_TIMEOUT not defined
private final long value;
private TCP(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 65535L;

static final class StringTable {
  public static final java.util.Map<TCP, String> descriptions = generateTable();
  public static final java.util.Map<TCP, String> generateTable() {
    java.util.Map<TCP, String> map = new java.util.EnumMap<TCP, String>(TCP.class);
  map.put(TCP_MAX_SACK, "TCP_MAX_SACK");
  map.put(TCP_MSS, "TCP_MSS");
  map.put(TCP_MINMSS, "TCP_MINMSS");
  map.put(TCP_MAXWIN, "TCP_MAXWIN");
  map.put(TCP_MAX_WINSHIFT, "TCP_MAX_WINSHIFT");
  map.put(TCP_MAXBURST, "TCP_MAXBURST");
  map.put(TCP_MAXHLEN, "TCP_MAXHLEN");
  map.put(TCP_MAXOLEN, "TCP_MAXOLEN");
  map.put(TCP_NODELAY, "TCP_NODELAY");
  map.put(TCP_MAXSEG, "TCP_MAXSEG");
  map.put(TCP_NOPUSH, "TCP_NOPUSH");
  map.put(TCP_NOOPT, "TCP_NOOPT");
  map.put(TCP_INFO, "TCP_INFO");
  map.put(TCP_KEEPCNT, "TCP_KEEPCNT");
  map.put(TCP_KEEPIDLE, "TCP_KEEPIDLE");
  map.put(TCP_KEEPINTVL, "TCP_KEEPINTVL");
  map.put(TCP_MD5SIG, "TCP_MD5SIG");
  map.put(TCP_FASTOPEN, "TCP_FASTOPEN");
  map.put(TCP_CONGESTION, "TCP_CONGESTION");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}