// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2019-09-24 00:13:52 +0000
package jnr.constants.platform.dragonflybsd;
public enum PRIO implements jnr.constants.Constant {
PRIO_MIN(-20L),
PRIO_PROCESS(0L),
PRIO_PGRP(1L),
PRIO_USER(2L),
PRIO_MAX(20L);
private final long value;
private PRIO(long value) { this.value = value; }
public static final long MIN_VALUE = -20L;
public static final long MAX_VALUE = 20L;

static final class StringTable {
  public static final java.util.Map<PRIO, String> descriptions = generateTable();
  public static final java.util.Map<PRIO, String> generateTable() {
    java.util.Map<PRIO, String> map = new java.util.EnumMap<PRIO, String>(PRIO.class);
  map.put(PRIO_MIN, "PRIO_MIN");
  map.put(PRIO_PROCESS, "PRIO_PROCESS");
  map.put(PRIO_PGRP, "PRIO_PGRP");
  map.put(PRIO_USER, "PRIO_USER");
  map.put(PRIO_MAX, "PRIO_MAX");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
