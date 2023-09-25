// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-03 11:41:26 +0200
package jnr.constants.platform.windows;
public enum TCP implements jnr.constants.Constant {
TCP_NODELAY(1L);
// TCP_MAX_SACK not defined
// TCP_MSS not defined
// TCP_MINMSS not defined
// TCP_MINMSSOVERLOAD not defined
// TCP_MAXWIN not defined
// TCP_MAX_WINSHIFT not defined
// TCP_MAXBURST not defined
// TCP_MAXHLEN not defined
// TCP_MAXOLEN not defined
// TCP_MAXSEG not defined
// TCP_NOPUSH not defined
// TCP_NOOPT not defined
// TCP_KEEPALIVE not defined
// TCP_NSTATES not defined
// TCP_RETRANSHZ not defined
// TCP_CORK not defined
// TCP_DEFER_ACCEPT not defined
// TCP_INFO not defined
// TCP_KEEPCNT not defined
// TCP_KEEPIDLE not defined
// TCP_KEEPINTVL not defined
// TCP_LINGER2 not defined
// TCP_MD5SIG not defined
// TCP_QUICKACK not defined
// TCP_SYNCNT not defined
// TCP_WINDOW_CLAMP not defined
// TCP_FASTOPEN not defined
// TCP_CONGESTION not defined
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
public static final long MAX_VALUE = 1L;

static final class StringTable {
  public static final java.util.Map<TCP, String> descriptions = generateTable();
  public static final java.util.Map<TCP, String> generateTable() {
    java.util.Map<TCP, String> map = new java.util.EnumMap<TCP, String>(TCP.class);
  map.put(TCP_NODELAY, "TCP_NODELAY");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}