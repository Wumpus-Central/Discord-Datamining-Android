package co.discord.media_engine.internal;

import co.discord.media_engine.C4081a;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\b\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\tJ\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0010\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J\r\u0010\u0011\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0012\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003JA\u0010\u0013\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00062\f\b\u0002\u0010\u0007\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\b\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, m15073d2 = {"Lco/discord/media_engine/internal/PacketStats;", "", "headerBytes", "", "Lco/discord/media_engine/internal/U64;", "packets", "Lco/discord/media_engine/internal/U32;", "paddingBytes", "payloadBytes", "(JJJJ)V", "getHeaderBytes", "()J", "getPackets", "getPaddingBytes", "getPayloadBytes", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class PacketStats {
    private final long headerBytes;
    private final long packets;
    private final long paddingBytes;
    private final long payloadBytes;

    public PacketStats(long j, long j2, long j3, long j4) {
        this.headerBytes = j;
        this.packets = j2;
        this.paddingBytes = j3;
        this.payloadBytes = j4;
    }

    public final long component1() {
        return this.headerBytes;
    }

    public final long component2() {
        return this.packets;
    }

    public final long component3() {
        return this.paddingBytes;
    }

    public final long component4() {
        return this.payloadBytes;
    }

    public final PacketStats copy(long j, long j2, long j3, long j4) {
        return new PacketStats(j, j2, j3, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PacketStats)) {
            return false;
        }
        PacketStats packetStats = (PacketStats) obj;
        return this.headerBytes == packetStats.headerBytes && this.packets == packetStats.packets && this.paddingBytes == packetStats.paddingBytes && this.payloadBytes == packetStats.payloadBytes;
    }

    public final long getHeaderBytes() {
        return this.headerBytes;
    }

    public final long getPackets() {
        return this.packets;
    }

    public final long getPaddingBytes() {
        return this.paddingBytes;
    }

    public final long getPayloadBytes() {
        return this.payloadBytes;
    }

    public int hashCode() {
        return (((((C4081a.m32873a(this.headerBytes) * 31) + C4081a.m32873a(this.packets)) * 31) + C4081a.m32873a(this.paddingBytes)) * 31) + C4081a.m32873a(this.payloadBytes);
    }

    public String toString() {
        return "PacketStats(headerBytes=" + this.headerBytes + ", packets=" + this.packets + ", paddingBytes=" + this.paddingBytes + ", payloadBytes=" + this.payloadBytes + ')';
    }
}
