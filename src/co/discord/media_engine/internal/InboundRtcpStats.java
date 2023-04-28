package co.discord.media_engine.internal;

import co.discord.media_engine.C4081a;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\b\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\tJ\r\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0011\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0012\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0013\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0014\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003JO\u0010\u0015\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0007\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\b\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m15073d2 = {"Lco/discord/media_engine/internal/InboundRtcpStats;", "", "firPackets", "", "Lco/discord/media_engine/internal/U32;", "nackPackets", "nackRequests", "pliPackets", "uniqueNackRequests", "(JJJJJ)V", "getFirPackets", "()J", "getNackPackets", "getNackRequests", "getPliPackets", "getUniqueNackRequests", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class InboundRtcpStats {
    private final long firPackets;
    private final long nackPackets;
    private final long nackRequests;
    private final long pliPackets;
    private final long uniqueNackRequests;

    public InboundRtcpStats(long j, long j2, long j3, long j4, long j5) {
        this.firPackets = j;
        this.nackPackets = j2;
        this.nackRequests = j3;
        this.pliPackets = j4;
        this.uniqueNackRequests = j5;
    }

    public final long component1() {
        return this.firPackets;
    }

    public final long component2() {
        return this.nackPackets;
    }

    public final long component3() {
        return this.nackRequests;
    }

    public final long component4() {
        return this.pliPackets;
    }

    public final long component5() {
        return this.uniqueNackRequests;
    }

    public final InboundRtcpStats copy(long j, long j2, long j3, long j4, long j5) {
        return new InboundRtcpStats(j, j2, j3, j4, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboundRtcpStats)) {
            return false;
        }
        InboundRtcpStats inboundRtcpStats = (InboundRtcpStats) obj;
        return this.firPackets == inboundRtcpStats.firPackets && this.nackPackets == inboundRtcpStats.nackPackets && this.nackRequests == inboundRtcpStats.nackRequests && this.pliPackets == inboundRtcpStats.pliPackets && this.uniqueNackRequests == inboundRtcpStats.uniqueNackRequests;
    }

    public final long getFirPackets() {
        return this.firPackets;
    }

    public final long getNackPackets() {
        return this.nackPackets;
    }

    public final long getNackRequests() {
        return this.nackRequests;
    }

    public final long getPliPackets() {
        return this.pliPackets;
    }

    public final long getUniqueNackRequests() {
        return this.uniqueNackRequests;
    }

    public int hashCode() {
        return (((((((C4081a.m32873a(this.firPackets) * 31) + C4081a.m32873a(this.nackPackets)) * 31) + C4081a.m32873a(this.nackRequests)) * 31) + C4081a.m32873a(this.pliPackets)) * 31) + C4081a.m32873a(this.uniqueNackRequests);
    }

    public String toString() {
        return "InboundRtcpStats(firPackets=" + this.firPackets + ", nackPackets=" + this.nackPackets + ", nackRequests=" + this.nackRequests + ", pliPackets=" + this.pliPackets + ", uniqueNackRequests=" + this.uniqueNackRequests + ')';
    }
}
