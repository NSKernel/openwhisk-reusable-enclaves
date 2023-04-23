// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2021-06-03 02:36:58 +0000
package jnr.constants.platform.linux.s390x;
public enum TCP implements jnr.constants.Constant {
TCP_MSS(512L),
// TCP_MAX_SACK not defined
// TCP_MINMSS not defined
// TCP_MINMSSOVERLOAD not defined
TCP_MAXWIN(65535L),
TCP_MAX_WINSHIFT(14L),
// TCP_MAXBURST not defined
// TCP_MAXHLEN not defined
// TCP_MAXOLEN not defined
TCP_NODELAY(1L),
TCP_MAXSEG(2L),
// TCP_NOPUSH not defined
// TCP_NOOPT not defined
// TCP_KEEPALIVE not defined
// TCP_NSTATES not defined
// TCP_RETRANSHZ not defined
TCP_CORK(3L),
TCP_DEFER_ACCEPT(9L),
TCP_INFO(11L),
TCP_KEEPCNT(6L),
TCP_KEEPIDLE(4L),
TCP_KEEPINTVL(5L),
TCP_LINGER2(8L),
TCP_MD5SIG(14L),
TCP_QUICKACK(12L),
TCP_SYNCNT(7L),
TCP_WINDOW_CLAMP(10L),
TCP_FASTOPEN(23L),
TCP_CONGESTION(13L),
TCP_COOKIE_TRANSACTIONS(15L),
TCP_QUEUE_SEQ(21L),
TCP_REPAIR(19L),
TCP_REPAIR_OPTIONS(22L),
TCP_REPAIR_QUEUE(20L),
TCP_THIN_DUPACK(17L),
TCP_THIN_LINEAR_TIMEOUTS(16L),
TCP_TIMESTAMP(24L),
TCP_USER_TIMEOUT(18L);
private final long value;
private TCP(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 65535L;

static final class StringTable {
  public static final java.util.Map<TCP, String> descriptions = generateTable();
  public static final java.util.Map<TCP, String> generateTable() {
    java.util.Map<TCP, String> map = new java.util.EnumMap<TCP, String>(TCP.class);
  map.put(TCP_MSS, "TCP_MSS");
  map.put(TCP_MAXWIN, "TCP_MAXWIN");
  map.put(TCP_MAX_WINSHIFT, "TCP_MAX_WINSHIFT");
  map.put(TCP_NODELAY, "TCP_NODELAY");
  map.put(TCP_MAXSEG, "TCP_MAXSEG");
  map.put(TCP_CORK, "TCP_CORK");
  map.put(TCP_DEFER_ACCEPT, "TCP_DEFER_ACCEPT");
  map.put(TCP_INFO, "TCP_INFO");
  map.put(TCP_KEEPCNT, "TCP_KEEPCNT");
  map.put(TCP_KEEPIDLE, "TCP_KEEPIDLE");
  map.put(TCP_KEEPINTVL, "TCP_KEEPINTVL");
  map.put(TCP_LINGER2, "TCP_LINGER2");
  map.put(TCP_MD5SIG, "TCP_MD5SIG");
  map.put(TCP_QUICKACK, "TCP_QUICKACK");
  map.put(TCP_SYNCNT, "TCP_SYNCNT");
  map.put(TCP_WINDOW_CLAMP, "TCP_WINDOW_CLAMP");
  map.put(TCP_FASTOPEN, "TCP_FASTOPEN");
  map.put(TCP_CONGESTION, "TCP_CONGESTION");
  map.put(TCP_COOKIE_TRANSACTIONS, "TCP_COOKIE_TRANSACTIONS");
  map.put(TCP_QUEUE_SEQ, "TCP_QUEUE_SEQ");
  map.put(TCP_REPAIR, "TCP_REPAIR");
  map.put(TCP_REPAIR_OPTIONS, "TCP_REPAIR_OPTIONS");
  map.put(TCP_REPAIR_QUEUE, "TCP_REPAIR_QUEUE");
  map.put(TCP_THIN_DUPACK, "TCP_THIN_DUPACK");
  map.put(TCP_THIN_LINEAR_TIMEOUTS, "TCP_THIN_LINEAR_TIMEOUTS");
  map.put(TCP_TIMESTAMP, "TCP_TIMESTAMP");
  map.put(TCP_USER_TIMEOUT, "TCP_USER_TIMEOUT");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
