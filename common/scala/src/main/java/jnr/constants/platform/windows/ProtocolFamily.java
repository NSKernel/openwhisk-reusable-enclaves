// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2021-10-12 23:01:34 +0200
package jnr.constants.platform.windows;
public enum ProtocolFamily implements jnr.constants.Constant {
PF_UNSPEC(0L),
// PF_LOCAL not defined
PF_UNIX(1L),
PF_INET(2L),
PF_IMPLINK(3L),
PF_PUP(4L),
PF_CHAOS(5L),
PF_NS(6L),
PF_ISO(7L),
PF_OSI(7L),
PF_ECMA(8L),
PF_DATAKIT(9L),
PF_CCITT(10L),
PF_SNA(11L),
PF_DECnet(12L),
PF_DLI(13L),
PF_LAT(14L),
PF_HYLINK(15L),
PF_APPLETALK(16L),
// PF_ROUTE not defined
// PF_LINK not defined
// PF_XTP not defined
// PF_COIP not defined
// PF_CNT not defined
// PF_SIP not defined
PF_IPX(6L),
// PF_RTIP not defined
// PF_PIP not defined
// PF_NDRV not defined
// PF_ISDN not defined
// PF_KEY not defined
PF_INET6(23L),
// PF_NATM not defined
// PF_SYSTEM not defined
// PF_NETBIOS not defined
// PF_PPP not defined
PF_ATM(22L),
// PF_NETGRAPH not defined
// PF_NETLINK not defined
// PF_RDS not defined
// PF_PPPOX not defined
// PF_LLC not defined
// PF_IB not defined
// PF_MPLS not defined
// PF_CAN not defined
// PF_TIPC not defined
// PF_BLUETOOTH not defined
// PF_ALG not defined
// PF_VSOCK not defined
// PF_KCM not defined
// PF_XDP not defined
PF_MAX(33L);
private final long value;
private ProtocolFamily(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 33L;

static final class StringTable {
  public static final java.util.Map<ProtocolFamily, String> descriptions = generateTable();
  public static final java.util.Map<ProtocolFamily, String> generateTable() {
    java.util.Map<ProtocolFamily, String> map = new java.util.EnumMap<ProtocolFamily, String>(ProtocolFamily.class);
  map.put(PF_UNSPEC, "PF_UNSPEC");
  map.put(PF_UNIX, "PF_UNIX");
  map.put(PF_INET, "PF_INET");
  map.put(PF_IMPLINK, "PF_IMPLINK");
  map.put(PF_PUP, "PF_PUP");
  map.put(PF_CHAOS, "PF_CHAOS");
  map.put(PF_NS, "PF_NS");
  map.put(PF_ISO, "PF_ISO");
  map.put(PF_OSI, "PF_OSI");
  map.put(PF_ECMA, "PF_ECMA");
  map.put(PF_DATAKIT, "PF_DATAKIT");
  map.put(PF_CCITT, "PF_CCITT");
  map.put(PF_SNA, "PF_SNA");
  map.put(PF_DECnet, "PF_DECnet");
  map.put(PF_DLI, "PF_DLI");
  map.put(PF_LAT, "PF_LAT");
  map.put(PF_HYLINK, "PF_HYLINK");
  map.put(PF_APPLETALK, "PF_APPLETALK");
  map.put(PF_IPX, "PF_IPX");
  map.put(PF_INET6, "PF_INET6");
  map.put(PF_ATM, "PF_ATM");
  map.put(PF_MAX, "PF_MAX");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
