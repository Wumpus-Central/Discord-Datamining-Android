package com.discord.p000native.engine;

import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/discord/native/engine/ConnectionInfo;", "", "isConnected", "", "protocol", "", "localAddress", "localPort", "", "(ZLjava/lang/String;Ljava/lang/String;I)V", "()Z", "getLocalAddress", "()Ljava/lang/String;", "getLocalPort", "()I", "getProtocol", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)


public final class ConnectionInfo {
    private final boolean isConnected;
    private final String localAddress;
    private final int localPort;
    private final String protocol;

    public ConnectionInfo(boolean z10, String protocol, String localAddress, int i10) {
        q.h(protocol, "protocol");
        q.h(localAddress, "localAddress");
        this.isConnected = z10;
        this.protocol = protocol;
        this.localAddress = localAddress;
        this.localPort = i10;
    }

    public static  ConnectionInfo copy$default(ConnectionInfo connectionInfo, boolean z10, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = connectionInfo.isConnected;
        }
        if ((i11 & 2) != 0) {
            str = connectionInfo.protocol;
        }
        if ((i11 & 4) != 0) {
            str2 = connectionInfo.localAddress;
        }
        if ((i11 & 8) != 0) {
            i10 = connectionInfo.localPort;
        }
        return connectionInfo.copy(z10, str, str2, i10);
    }

    public final boolean component1() {
        return this.isConnected;
    }

    public final String component2() {
        return this.protocol;
    }

    public final String component3() {
        return this.localAddress;
    }

    public final int component4() {
        return this.localPort;
    }

    public final ConnectionInfo copy(boolean z10, String protocol, String localAddress, int i10) {
        q.h(protocol, "protocol");
        q.h(localAddress, "localAddress");
        return new ConnectionInfo(z10, protocol, localAddress, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionInfo)) {
            return false;
        }
        ConnectionInfo connectionInfo = (ConnectionInfo) obj;
        return this.isConnected == connectionInfo.isConnected && q.c(this.protocol, connectionInfo.protocol) && q.c(this.localAddress, connectionInfo.localAddress) && this.localPort == connectionInfo.localPort;
    }

    public final String getLocalAddress() {
        return this.localAddress;
    }

    public final int getLocalPort() {
        return this.localPort;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        boolean z10 = this.isConnected;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return (((((i10 * 31) + this.protocol.hashCode()) * 31) + this.localAddress.hashCode()) * 31) + this.localPort;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public String toString() {
        boolean z10 = this.isConnected;
        String str = this.protocol;
        String str2 = this.localAddress;
        int i10 = this.localPort;
        return "ConnectionInfo(isConnected=" + z10 + ", protocol=" + str + ", localAddress=" + str2 + ", localPort=" + i10 + ")";
    }
}
