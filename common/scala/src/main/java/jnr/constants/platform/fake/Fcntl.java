// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2020-02-16 14:57:29 +0000
package jnr.constants.platform.fake;
public enum Fcntl implements jnr.constants.Constant {
FAPPEND(0),
FREAD(1),
FWRITE(2),
FASYNC(3),
FFSYNC(4),
FNONBLOCK(5),
FNDELAY(6),
F_DUPFD(7),
F_GETFD(8),
F_SETFD(9),
F_GETFL(10),
F_SETFL(11),
F_GETOWN(12),
F_SETOWN(13),
F_GETLK(14),
F_SETLK(15),
F_SETLKW(16),
F_CHKCLEAN(17),
F_PREALLOCATE(18),
F_SETSIZE(19),
F_RDADVISE(20),
F_RDAHEAD(21),
F_READBOOTSTRAP(22),
F_WRITEBOOTSTRAP(23),
F_NOCACHE(24),
F_LOG2PHYS(25),
F_GETPATH(26),
F_FULLFSYNC(27),
F_PATHPKG_CHECK(28),
F_FREEZE_FS(29),
F_THAW_FS(30),
F_GLOBAL_NOCACHE(31),
F_ADDSIGS(32),
F_MARKDEPENDENCY(33),
F_RDLCK(34),
F_UNLCK(35),
F_WRLCK(36),
F_ALLOCATECONTIG(37),
F_ALLOCATEALL(38),
F_GETPIPE_SZ(39),
F_SETPIPE_SZ(40);
private final long value;
private Fcntl(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 40L;
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
