package co.discord.media_engine.internal;

import co.discord.media_engine.C4081a;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BY\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\u000b\u001a\u00060\bj\u0002`\t\u0012\n\u0010\f\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\bj\u0002`\t¢\u0006\u0002\u0010\u000eJ\r\u0010\u0018\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0019\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J\r\u0010\u001a\u001a\u00060\bj\u0002`\tHÆ\u0003J\r\u0010\u001b\u001a\u00060\bj\u0002`\tHÆ\u0003J\r\u0010\u001c\u001a\u00060\bj\u0002`\tHÆ\u0003J\r\u0010\u001d\u001a\u00060\bj\u0002`\tHÆ\u0003J\r\u0010\u001e\u001a\u00060\bj\u0002`\tHÆ\u0003Jk\u0010\u001f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00062\f\b\u0002\u0010\u0007\u001a\u00060\bj\u0002`\t2\f\b\u0002\u0010\n\u001a\u00060\bj\u0002`\t2\f\b\u0002\u0010\u000b\u001a\u00060\bj\u0002`\t2\f\b\u0002\u0010\f\u001a\u00060\bj\u0002`\t2\f\b\u0002\u0010\r\u001a\u00060\bj\u0002`\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u000b\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\f\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\r\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006&"}, m15073d2 = {"Lco/discord/media_engine/internal/RtcpStats;", "", "fractionLost", "", "Lco/discord/media_engine/internal/U8;", "packetsLost", "Lco/discord/media_engine/internal/I32;", "firPackets", "", "Lco/discord/media_engine/internal/U32;", "nackPackets", "nackRequests", "pliPackets", "uniqueNackRequests", "(IIJJJJJ)V", "getFirPackets", "()J", "getFractionLost", "()I", "getNackPackets", "getNackRequests", "getPacketsLost", "getPliPackets", "getUniqueNackRequests", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class RtcpStats {
    private final long firPackets;
    private final int fractionLost;
    private final long nackPackets;
    private final long nackRequests;
    private final int packetsLost;
    private final long pliPackets;
    private final long uniqueNackRequests;

    public RtcpStats(int i, int i2, long j, long j2, long j3, long j4, long j5) {
        this.fractionLost = i;
        this.packetsLost = i2;
        this.firPackets = j;
        this.nackPackets = j2;
        this.nackRequests = j3;
        this.pliPackets = j4;
        this.uniqueNackRequests = j5;
    }

    public final int component1() {
        return this.fractionLost;
    }

    public final int component2() {
        return this.packetsLost;
    }

    public final long component3() {
        return this.firPackets;
    }

    public final long component4() {
        return this.nackPackets;
    }

    public final long component5() {
        return this.nackRequests;
    }

    public final long component6() {
        return this.pliPackets;
    }

    public final long component7() {
        return this.uniqueNackRequests;
    }

    public final RtcpStats copy(int i, int i2, long j, long j2, long j3, long j4, long j5) {
        return new RtcpStats(i, i2, j, j2, j3, j4, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtcpStats)) {
            return false;
        }
        RtcpStats rtcpStats = (RtcpStats) obj;
        return this.fractionLost == rtcpStats.fractionLost && this.packetsLost == rtcpStats.packetsLost && this.firPackets == rtcpStats.firPackets && this.nackPackets == rtcpStats.nackPackets && this.nackRequests == rtcpStats.nackRequests && this.pliPackets == rtcpStats.pliPackets && this.uniqueNackRequests == rtcpStats.uniqueNackRequests;
    }

    public final long getFirPackets() {
        return this.firPackets;
    }

    public final int getFractionLost() {
        return this.fractionLost;
    }

    public final long getNackPackets() {
        return this.nackPackets;
    }

    public final long getNackRequests() {
        return this.nackRequests;
    }

    public final int getPacketsLost() {
        return this.packetsLost;
    }

    public final long getPliPackets() {
        return this.pliPackets;
    }

    public final long getUniqueNackRequests() {
        return this.uniqueNackRequests;
    }

    public int hashCode() {
        return (((((((((((this.fractionLost * 31) + this.packetsLost) * 31) + C4081a.m32873a(this.firPackets)) * 31) + C4081a.m32873a(this.nackPackets)) * 31) + C4081a.m32873a(this.nackRequests)) * 31) + C4081a.m32873a(this.pliPackets)) * 31) + C4081a.m32873a(this.uniqueNackRequests);
    }

    public String toString() {
        return "RtcpStats(fractionLost=" + this.fractionLost + ", packetsLost=" + this.packetsLost + ", firPackets=" + this.firPackets + ", nackPackets=" + this.nackPackets + ", nackRequests=" + this.nackRequests + ", pliPackets=" + this.pliPackets + ", uniqueNackRequests=" + this.uniqueNackRequests + ')';
    }
}
