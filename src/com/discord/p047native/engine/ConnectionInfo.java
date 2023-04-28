package com.discord.p047native.engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0019"}, m15073d2 = {"Lcom/discord/native/engine/ConnectionInfo;", "", "isConnected", "", "protocol", "", "localAddress", "localPort", "", "(ZLjava/lang/String;Ljava/lang/String;I)V", "()Z", "getLocalAddress", "()Ljava/lang/String;", "getLocalPort", "()I", "getProtocol", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* renamed from: com.discord.native.engine.ConnectionInfo */
/* loaded from: classes5.dex */
public final class ConnectionInfo {
    private final boolean isConnected;
    private final String localAddress;
    private final int localPort;
    private final String protocol;

    public ConnectionInfo(boolean z, String protocol, String localAddress, int i) {
        C9971q.m14633g(protocol, "protocol");
        C9971q.m14633g(localAddress, "localAddress");
        this.isConnected = z;
        this.protocol = protocol;
        this.localAddress = localAddress;
        this.localPort = i;
    }

    public static /* synthetic */ ConnectionInfo copy$default(ConnectionInfo connectionInfo, boolean z, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = connectionInfo.isConnected;
        }
        if ((i2 & 2) != 0) {
            str = connectionInfo.protocol;
        }
        if ((i2 & 4) != 0) {
            str2 = connectionInfo.localAddress;
        }
        if ((i2 & 8) != 0) {
            i = connectionInfo.localPort;
        }
        return connectionInfo.copy(z, str, str2, i);
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

    public final ConnectionInfo copy(boolean z, String protocol, String localAddress, int i) {
        C9971q.m14633g(protocol, "protocol");
        C9971q.m14633g(localAddress, "localAddress");
        return new ConnectionInfo(z, protocol, localAddress, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionInfo)) {
            return false;
        }
        ConnectionInfo connectionInfo = (ConnectionInfo) obj;
        return this.isConnected == connectionInfo.isConnected && C9971q.m14638b(this.protocol, connectionInfo.protocol) && C9971q.m14638b(this.localAddress, connectionInfo.localAddress) && this.localPort == connectionInfo.localPort;
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
        boolean z = this.isConnected;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (((((i * 31) + this.protocol.hashCode()) * 31) + this.localAddress.hashCode()) * 31) + this.localPort;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public String toString() {
        return "ConnectionInfo(isConnected=" + this.isConnected + ", protocol=" + this.protocol + ", localAddress=" + this.localAddress + ", localPort=" + this.localPort + ')';
    }
}
