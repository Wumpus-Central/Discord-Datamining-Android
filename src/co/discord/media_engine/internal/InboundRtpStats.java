package co.discord.media_engine.internal;

import co.discord.media_engine.C4081a;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\n\u0010\t\u001a\u00060\u0003j\u0002`\n\u0012\n\u0010\u000b\u001a\u00060\u0003j\u0002`\n\u0012\n\u0010\f\u001a\u00060\u0003j\u0002`\n¢\u0006\u0002\u0010\rJ\r\u0010\u0016\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0017\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0018\u001a\u00060\u0007j\u0002`\bHÆ\u0003J\r\u0010\u0019\u001a\u00060\u0003j\u0002`\nHÆ\u0003J\r\u0010\u001a\u001a\u00060\u0003j\u0002`\nHÆ\u0003J\r\u0010\u001b\u001a\u00060\u0003j\u0002`\nHÆ\u0003J]\u0010\u001c\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\b\u0002\u0010\t\u001a\u00060\u0003j\u0002`\n2\f\b\u0002\u0010\u000b\u001a\u00060\u0003j\u0002`\n2\f\b\u0002\u0010\f\u001a\u00060\u0003j\u0002`\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0015\u0010\t\u001a\u00060\u0003j\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000b\u001a\u00060\u0003j\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0015\u0010\f\u001a\u00060\u0003j\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006#"}, m15073d2 = {"Lco/discord/media_engine/internal/InboundRtpStats;", "", "packets", "", "Lco/discord/media_engine/internal/U32;", "jitter", "packetsLost", "", "Lco/discord/media_engine/internal/I32;", "headerBytes", "Lco/discord/media_engine/internal/U64;", "paddingBytes", "payloadBytes", "(JJIJJJ)V", "getHeaderBytes", "()J", "getJitter", "getPackets", "getPacketsLost", "()I", "getPaddingBytes", "getPayloadBytes", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class InboundRtpStats {
    private final long headerBytes;
    private final long jitter;
    private final long packets;
    private final int packetsLost;
    private final long paddingBytes;
    private final long payloadBytes;

    public InboundRtpStats(long j, long j2, int i, long j3, long j4, long j5) {
        this.packets = j;
        this.jitter = j2;
        this.packetsLost = i;
        this.headerBytes = j3;
        this.paddingBytes = j4;
        this.payloadBytes = j5;
    }

    public final long component1() {
        return this.packets;
    }

    public final long component2() {
        return this.jitter;
    }

    public final int component3() {
        return this.packetsLost;
    }

    public final long component4() {
        return this.headerBytes;
    }

    public final long component5() {
        return this.paddingBytes;
    }

    public final long component6() {
        return this.payloadBytes;
    }

    public final InboundRtpStats copy(long j, long j2, int i, long j3, long j4, long j5) {
        return new InboundRtpStats(j, j2, i, j3, j4, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboundRtpStats)) {
            return false;
        }
        InboundRtpStats inboundRtpStats = (InboundRtpStats) obj;
        return this.packets == inboundRtpStats.packets && this.jitter == inboundRtpStats.jitter && this.packetsLost == inboundRtpStats.packetsLost && this.headerBytes == inboundRtpStats.headerBytes && this.paddingBytes == inboundRtpStats.paddingBytes && this.payloadBytes == inboundRtpStats.payloadBytes;
    }

    public final long getHeaderBytes() {
        return this.headerBytes;
    }

    public final long getJitter() {
        return this.jitter;
    }

    public final long getPackets() {
        return this.packets;
    }

    public final int getPacketsLost() {
        return this.packetsLost;
    }

    public final long getPaddingBytes() {
        return this.paddingBytes;
    }

    public final long getPayloadBytes() {
        return this.payloadBytes;
    }

    public int hashCode() {
        return (((((((((C4081a.m32873a(this.packets) * 31) + C4081a.m32873a(this.jitter)) * 31) + this.packetsLost) * 31) + C4081a.m32873a(this.headerBytes)) * 31) + C4081a.m32873a(this.paddingBytes)) * 31) + C4081a.m32873a(this.payloadBytes);
    }

    public String toString() {
        return "InboundRtpStats(packets=" + this.packets + ", jitter=" + this.jitter + ", packetsLost=" + this.packetsLost + ", headerBytes=" + this.headerBytes + ", paddingBytes=" + this.paddingBytes + ", payloadBytes=" + this.payloadBytes + ')';
    }
}
