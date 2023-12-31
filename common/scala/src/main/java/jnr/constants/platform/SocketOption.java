// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2021-10-13 00:37:21 +0200
package jnr.constants.platform;
public enum SocketOption implements jnr.constants.Constant {
SO_DEBUG,
SO_ACCEPTCONN,
SO_REUSEADDR,
SO_KEEPALIVE,
SO_DONTROUTE,
SO_BROADCAST,
SO_USELOOPBACK,
SO_LINGER,
SO_OOBINLINE,
SO_REUSEPORT,
SO_TIMESTAMP,
SO_ACCEPTFILTER,
SO_DONTTRUNC,
SO_WANTMORE,
SO_WANTOOBFLAG,
SO_SNDBUF,
SO_RCVBUF,
SO_SNDLOWAT,
SO_RCVLOWAT,
SO_SNDTIMEO,
SO_RCVTIMEO,
SO_ERROR,
SO_TYPE,
SO_NREAD,
SO_NKE,
SO_NOSIGPIPE,
SO_NOADDRERR,
SO_NWRITE,
SO_REUSESHAREUID,
SO_LABEL,
SO_PEERLABEL,
SO_ATTACH_FILTER,
SO_BINDTODEVICE,
SO_DETACH_FILTER,
SO_NO_CHECK,
SO_PASSCRED,
SO_PEERCRED,
SO_PEERNAME,
SO_PRIORITY,
SO_SNDBUFFORCE,
SO_RCVBUFFORCE,
SO_GET_FILTER,
SO_TIMESTAMPNS,
SO_RECVUCRED,
SO_MAC_EXEMPT,
SO_ALLZONES,
SO_PEERSEC,
SO_PASSSEC,
SO_MARK,
SO_TIMESTAMPING,
SO_PROTOCOL,
SO_DOMAIN,
SO_RXQ_OVFL,
SO_WIFI_STATUS,
SO_PEEK_OFF,
SO_NOFCS,
SO_LOCK_FILTER,
SO_SELECT_ERR_QUEUE,
SO_BUSY_POLL,
SO_MAX_PACING_RATE,
SO_BPF_EXTENSIONS,
SO_SECURITY_AUTHENTICATION,
SO_SECURITY_ENCRYPTION_NETWORK,
SO_SECURITY_ENCRYPTION_TRANSPORT,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<SocketOption> resolver = 
ConstantResolver.getResolver(SocketOption.class, 20000, 29999);
public final int value() { return (int) resolver.longValue(this); }
public final int intValue() { return (int) resolver.longValue(this); }
public final long longValue() { return resolver.longValue(this); }
public final String description() { return resolver.description(this); }
public final boolean defined() { return resolver.defined(this); }
public final String toString() { return description(); }
public static SocketOption valueOf(long value) { 
    return resolver.valueOf(value);
}
}
