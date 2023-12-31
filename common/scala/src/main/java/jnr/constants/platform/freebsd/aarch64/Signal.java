// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2021-10-08 17:37:34 +0200
package jnr.constants.platform.freebsd.aarch64;
public enum Signal implements jnr.constants.Constant {
SIGHUP(1L),
SIGINT(2L),
SIGQUIT(3L),
SIGILL(4L),
SIGTRAP(5L),
SIGABRT(6L),
SIGIOT(6L),
SIGBUS(10L),
SIGFPE(8L),
SIGKILL(9L),
SIGUSR1(30L),
SIGSEGV(11L),
SIGUSR2(31L),
SIGPIPE(13L),
SIGALRM(14L),
SIGTERM(15L),
// SIGSTKFLT not defined
// SIGCLD not defined
SIGCHLD(20L),
SIGCONT(19L),
SIGSTOP(17L),
SIGTSTP(18L),
SIGTTIN(21L),
SIGTTOU(22L),
SIGURG(16L),
SIGXCPU(24L),
SIGXFSZ(25L),
SIGVTALRM(26L),
SIGPROF(27L),
SIGWINCH(28L),
// SIGPOLL not defined
SIGIO(23L),
// SIGPWR not defined
SIGSYS(12L),
// SIGUNUSED not defined
SIGRTMIN(65L),
SIGRTMAX(126L),
NSIG(32L);
private final long value;
private Signal(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 126L;

static final class StringTable {
  public static final java.util.Map<Signal, String> descriptions = generateTable();
  public static final java.util.Map<Signal, String> generateTable() {
    java.util.Map<Signal, String> map = new java.util.EnumMap<Signal, String>(Signal.class);
  map.put(SIGHUP, "SIGHUP");
  map.put(SIGINT, "SIGINT");
  map.put(SIGQUIT, "SIGQUIT");
  map.put(SIGILL, "SIGILL");
  map.put(SIGTRAP, "SIGTRAP");
  map.put(SIGABRT, "SIGABRT");
  map.put(SIGIOT, "SIGIOT");
  map.put(SIGBUS, "SIGBUS");
  map.put(SIGFPE, "SIGFPE");
  map.put(SIGKILL, "SIGKILL");
  map.put(SIGUSR1, "SIGUSR1");
  map.put(SIGSEGV, "SIGSEGV");
  map.put(SIGUSR2, "SIGUSR2");
  map.put(SIGPIPE, "SIGPIPE");
  map.put(SIGALRM, "SIGALRM");
  map.put(SIGTERM, "SIGTERM");
  map.put(SIGCHLD, "SIGCHLD");
  map.put(SIGCONT, "SIGCONT");
  map.put(SIGSTOP, "SIGSTOP");
  map.put(SIGTSTP, "SIGTSTP");
  map.put(SIGTTIN, "SIGTTIN");
  map.put(SIGTTOU, "SIGTTOU");
  map.put(SIGURG, "SIGURG");
  map.put(SIGXCPU, "SIGXCPU");
  map.put(SIGXFSZ, "SIGXFSZ");
  map.put(SIGVTALRM, "SIGVTALRM");
  map.put(SIGPROF, "SIGPROF");
  map.put(SIGWINCH, "SIGWINCH");
  map.put(SIGIO, "SIGIO");
  map.put(SIGSYS, "SIGSYS");
  map.put(SIGRTMIN, "SIGRTMIN");
  map.put(SIGRTMAX, "SIGRTMAX");
  map.put(NSIG, "NSIG");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
