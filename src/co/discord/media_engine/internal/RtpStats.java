package co.discord.media_engine.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m15073d2 = {"Lco/discord/media_engine/internal/RtpStats;", "", "fec", "Lco/discord/media_engine/internal/PacketStats;", "retransmitted", "transmitted", "(Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;)V", "getFec", "()Lco/discord/media_engine/internal/PacketStats;", "getRetransmitted", "getTransmitted", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class RtpStats {
    private final PacketStats fec;
    private final PacketStats retransmitted;
    private final PacketStats transmitted;

    public RtpStats(PacketStats fec, PacketStats retransmitted, PacketStats transmitted) {
        C9971q.m14633g(fec, "fec");
        C9971q.m14633g(retransmitted, "retransmitted");
        C9971q.m14633g(transmitted, "transmitted");
        this.fec = fec;
        this.retransmitted = retransmitted;
        this.transmitted = transmitted;
    }

    public static /* synthetic */ RtpStats copy$default(RtpStats rtpStats, PacketStats packetStats, PacketStats packetStats2, PacketStats packetStats3, int i, Object obj) {
        if ((i & 1) != 0) {
            packetStats = rtpStats.fec;
        }
        if ((i & 2) != 0) {
            packetStats2 = rtpStats.retransmitted;
        }
        if ((i & 4) != 0) {
            packetStats3 = rtpStats.transmitted;
        }
        return rtpStats.copy(packetStats, packetStats2, packetStats3);
    }

    public final PacketStats component1() {
        return this.fec;
    }

    public final PacketStats component2() {
        return this.retransmitted;
    }

    public final PacketStats component3() {
        return this.transmitted;
    }

    public final RtpStats copy(PacketStats fec, PacketStats retransmitted, PacketStats transmitted) {
        C9971q.m14633g(fec, "fec");
        C9971q.m14633g(retransmitted, "retransmitted");
        C9971q.m14633g(transmitted, "transmitted");
        return new RtpStats(fec, retransmitted, transmitted);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtpStats)) {
            return false;
        }
        RtpStats rtpStats = (RtpStats) obj;
        return C9971q.m14638b(this.fec, rtpStats.fec) && C9971q.m14638b(this.retransmitted, rtpStats.retransmitted) && C9971q.m14638b(this.transmitted, rtpStats.transmitted);
    }

    public final PacketStats getFec() {
        return this.fec;
    }

    public final PacketStats getRetransmitted() {
        return this.retransmitted;
    }

    public final PacketStats getTransmitted() {
        return this.transmitted;
    }

    public int hashCode() {
        return (((this.fec.hashCode() * 31) + this.retransmitted.hashCode()) * 31) + this.transmitted.hashCode();
    }

    public String toString() {
        return "RtpStats(fec=" + this.fec + ", retransmitted=" + this.retransmitted + ", transmitted=" + this.transmitted + ')';
    }
}
