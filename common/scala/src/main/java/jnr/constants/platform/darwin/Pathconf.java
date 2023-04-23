// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-09-01 12:33:26 -0500
package jnr.constants.platform.darwin;
public enum Pathconf implements jnr.constants.Constant {
_PC_FILESIZEBITS(18L),
_PC_LINK_MAX(1L),
_PC_MAX_CANON(2L),
_PC_MAX_INPUT(3L),
_PC_NAME_MAX(4L),
_PC_PATH_MAX(5L),
_PC_PIPE_BUF(6L),
_PC_2_SYMLINKS(15L),
_PC_ALLOC_SIZE_MIN(16L),
_PC_REC_INCR_XFER_SIZE(20L),
_PC_REC_MAX_XFER_SIZE(21L),
_PC_REC_MIN_XFER_SIZE(22L),
_PC_REC_XFER_ALIGN(23L),
_PC_SYMLINK_MAX(24L),
_PC_CHOWN_RESTRICTED(7L),
_PC_NO_TRUNC(8L),
_PC_VDISABLE(9L),
_PC_ASYNC_IO(17L),
_PC_PRIO_IO(19L),
_PC_SYNC_IO(25L);
private final long value;
private Pathconf(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 25L;

static final class StringTable {
  public static final java.util.Map<Pathconf, String> descriptions = generateTable();
  public static final java.util.Map<Pathconf, String> generateTable() {
    java.util.Map<Pathconf, String> map = new java.util.EnumMap<Pathconf, String>(Pathconf.class);
  map.put(_PC_FILESIZEBITS, "_PC_FILESIZEBITS");
  map.put(_PC_LINK_MAX, "_PC_LINK_MAX");
  map.put(_PC_MAX_CANON, "_PC_MAX_CANON");
  map.put(_PC_MAX_INPUT, "_PC_MAX_INPUT");
  map.put(_PC_NAME_MAX, "_PC_NAME_MAX");
  map.put(_PC_PATH_MAX, "_PC_PATH_MAX");
  map.put(_PC_PIPE_BUF, "_PC_PIPE_BUF");
  map.put(_PC_2_SYMLINKS, "_PC_2_SYMLINKS");
  map.put(_PC_ALLOC_SIZE_MIN, "_PC_ALLOC_SIZE_MIN");
  map.put(_PC_REC_INCR_XFER_SIZE, "_PC_REC_INCR_XFER_SIZE");
  map.put(_PC_REC_MAX_XFER_SIZE, "_PC_REC_MAX_XFER_SIZE");
  map.put(_PC_REC_MIN_XFER_SIZE, "_PC_REC_MIN_XFER_SIZE");
  map.put(_PC_REC_XFER_ALIGN, "_PC_REC_XFER_ALIGN");
  map.put(_PC_SYMLINK_MAX, "_PC_SYMLINK_MAX");
  map.put(_PC_CHOWN_RESTRICTED, "_PC_CHOWN_RESTRICTED");
  map.put(_PC_NO_TRUNC, "_PC_NO_TRUNC");
  map.put(_PC_VDISABLE, "_PC_VDISABLE");
  map.put(_PC_ASYNC_IO, "_PC_ASYNC_IO");
  map.put(_PC_PRIO_IO, "_PC_PRIO_IO");
  map.put(_PC_SYNC_IO, "_PC_SYNC_IO");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
