// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-20 19:22:09 +0000
package jnr.constants.platform.freebsd;
public enum Shutdown implements jnr.constants.Constant {
SHUT_RD(0L),
SHUT_WR(1L),
SHUT_RDWR(2L);
private final long value;
private Shutdown(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 2L;

static final class StringTable {
  public static final java.util.Map<Shutdown, String> descriptions = generateTable();
  public static final java.util.Map<Shutdown, String> generateTable() {
    java.util.Map<Shutdown, String> map = new java.util.EnumMap<Shutdown, String>(Shutdown.class);
  map.put(SHUT_RD, "SHUT_RD");
  map.put(SHUT_WR, "SHUT_WR");
  map.put(SHUT_RDWR, "SHUT_RDWR");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
