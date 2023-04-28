package co.discord.media_engine;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m15073d2 = {"Lco/discord/media_engine/OutboundAudio;", "", "packetsSent", "", "packetsLost", "", "(JI)V", "getPacketsLost", "()I", "getPacketsSent", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class OutboundAudio {
    private final int packetsLost;
    private final long packetsSent;

    public OutboundAudio(long j, int i) {
        this.packetsSent = j;
        this.packetsLost = i;
    }

    public static /* synthetic */ OutboundAudio copy$default(OutboundAudio outboundAudio, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = outboundAudio.packetsSent;
        }
        if ((i2 & 2) != 0) {
            i = outboundAudio.packetsLost;
        }
        return outboundAudio.copy(j, i);
    }

    public final long component1() {
        return this.packetsSent;
    }

    public final int component2() {
        return this.packetsLost;
    }

    public final OutboundAudio copy(long j, int i) {
        return new OutboundAudio(j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutboundAudio)) {
            return false;
        }
        OutboundAudio outboundAudio = (OutboundAudio) obj;
        return this.packetsSent == outboundAudio.packetsSent && this.packetsLost == outboundAudio.packetsLost;
    }

    public final int getPacketsLost() {
        return this.packetsLost;
    }

    public final long getPacketsSent() {
        return this.packetsSent;
    }

    public int hashCode() {
        return (C4081a.m32873a(this.packetsSent) * 31) + this.packetsLost;
    }

    public String toString() {
        return "OutboundAudio(packetsSent=" + this.packetsSent + ", packetsLost=" + this.packetsLost + ')';
    }
}
