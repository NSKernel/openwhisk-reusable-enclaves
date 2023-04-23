// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-05-11 03:41:38 +0000
package jnr.constants.platform.aix;
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
SIGCLD(20L),
SIGCHLD(20L),
SIGCONT(19L),
SIGSTOP(17L),
SIGTSTP(18L),
SIGTTIN(21L),
SIGTTOU(22L),
SIGURG(16L),
SIGXCPU(24L),
SIGXFSZ(25L),
SIGVTALRM(34L),
SIGPROF(32L),
SIGWINCH(28L),
SIGPOLL(23L),
SIGIO(23L),
SIGPWR(29L),
SIGSYS(12L),
// SIGUNUSED not defined
SIGRTMIN(50L),
SIGRTMAX(57L),
NSIG(256L);
private final long value;
private Signal(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 256L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
