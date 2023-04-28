package co.discord.media_engine.internal;

import co.discord.media_engine.C4081a;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\f\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013\u0012\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0016J\r\u0010'\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010(\u001a\u00060\u0012j\u0002`\u0013HÆ\u0003J\r\u0010)\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010*\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\r\u0010,\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\r\u0010/\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u00100\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u009d\u0001\u00103\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\b\u0002\u0010\u0007\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\f\b\u0002\u0010\u000b\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\f\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\b\u0002\u0010\u0011\u001a\u00060\u0012j\u0002`\u00132\f\b\u0002\u0010\u0014\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0015\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001cR\u0015\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0015\u0010\f\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0014\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0015\u0010\u0015\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018¨\u00069"}, m15073d2 = {"Lco/discord/media_engine/internal/Substream;", "", "avgDelay", "", "Lco/discord/media_engine/internal/I32;", "frameCounts", "Lco/discord/media_engine/internal/FrameCounts;", "height", "isFlexFEC", "", "isRTX", "maxDelay", "retransmitBitrate", "rtcpStats", "Lco/discord/media_engine/internal/RtcpStats;", "rtpStats", "Lco/discord/media_engine/internal/RtpStats;", "ssrc", "", "Lco/discord/media_engine/internal/U32;", "totalBitrate", "width", "(ILco/discord/media_engine/internal/FrameCounts;IZZIILco/discord/media_engine/internal/RtcpStats;Lco/discord/media_engine/internal/RtpStats;JII)V", "getAvgDelay", "()I", "getFrameCounts", "()Lco/discord/media_engine/internal/FrameCounts;", "getHeight", "()Z", "getMaxDelay", "getRetransmitBitrate", "getRtcpStats", "()Lco/discord/media_engine/internal/RtcpStats;", "getRtpStats", "()Lco/discord/media_engine/internal/RtpStats;", "getSsrc", "()J", "getTotalBitrate", "getWidth", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class Substream {
    private final int avgDelay;
    private final FrameCounts frameCounts;
    private final int height;
    private final boolean isFlexFEC;
    private final boolean isRTX;
    private final int maxDelay;
    private final int retransmitBitrate;
    private final RtcpStats rtcpStats;
    private final RtpStats rtpStats;
    private final long ssrc;
    private final int totalBitrate;
    private final int width;

    public Substream(int i, FrameCounts frameCounts, int i2, boolean z, boolean z2, int i3, int i4, RtcpStats rtcpStats, RtpStats rtpStats, long j, int i5, int i6) {
        C9971q.m14633g(frameCounts, "frameCounts");
        C9971q.m14633g(rtcpStats, "rtcpStats");
        C9971q.m14633g(rtpStats, "rtpStats");
        this.avgDelay = i;
        this.frameCounts = frameCounts;
        this.height = i2;
        this.isFlexFEC = z;
        this.isRTX = z2;
        this.maxDelay = i3;
        this.retransmitBitrate = i4;
        this.rtcpStats = rtcpStats;
        this.rtpStats = rtpStats;
        this.ssrc = j;
        this.totalBitrate = i5;
        this.width = i6;
    }

    public final int component1() {
        return this.avgDelay;
    }

    public final long component10() {
        return this.ssrc;
    }

    public final int component11() {
        return this.totalBitrate;
    }

    public final int component12() {
        return this.width;
    }

    public final FrameCounts component2() {
        return this.frameCounts;
    }

    public final int component3() {
        return this.height;
    }

    public final boolean component4() {
        return this.isFlexFEC;
    }

    public final boolean component5() {
        return this.isRTX;
    }

    public final int component6() {
        return this.maxDelay;
    }

    public final int component7() {
        return this.retransmitBitrate;
    }

    public final RtcpStats component8() {
        return this.rtcpStats;
    }

    public final RtpStats component9() {
        return this.rtpStats;
    }

    public final Substream copy(int i, FrameCounts frameCounts, int i2, boolean z, boolean z2, int i3, int i4, RtcpStats rtcpStats, RtpStats rtpStats, long j, int i5, int i6) {
        C9971q.m14633g(frameCounts, "frameCounts");
        C9971q.m14633g(rtcpStats, "rtcpStats");
        C9971q.m14633g(rtpStats, "rtpStats");
        return new Substream(i, frameCounts, i2, z, z2, i3, i4, rtcpStats, rtpStats, j, i5, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Substream)) {
            return false;
        }
        Substream substream = (Substream) obj;
        return this.avgDelay == substream.avgDelay && C9971q.m14638b(this.frameCounts, substream.frameCounts) && this.height == substream.height && this.isFlexFEC == substream.isFlexFEC && this.isRTX == substream.isRTX && this.maxDelay == substream.maxDelay && this.retransmitBitrate == substream.retransmitBitrate && C9971q.m14638b(this.rtcpStats, substream.rtcpStats) && C9971q.m14638b(this.rtpStats, substream.rtpStats) && this.ssrc == substream.ssrc && this.totalBitrate == substream.totalBitrate && this.width == substream.width;
    }

    public final int getAvgDelay() {
        return this.avgDelay;
    }

    public final FrameCounts getFrameCounts() {
        return this.frameCounts;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMaxDelay() {
        return this.maxDelay;
    }

    public final int getRetransmitBitrate() {
        return this.retransmitBitrate;
    }

    public final RtcpStats getRtcpStats() {
        return this.rtcpStats;
    }

    public final RtpStats getRtpStats() {
        return this.rtpStats;
    }

    public final long getSsrc() {
        return this.ssrc;
    }

    public final int getTotalBitrate() {
        return this.totalBitrate;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = ((((this.avgDelay * 31) + this.frameCounts.hashCode()) * 31) + this.height) * 31;
        boolean z = this.isFlexFEC;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.isRTX;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((((((((((((((i5 + i) * 31) + this.maxDelay) * 31) + this.retransmitBitrate) * 31) + this.rtcpStats.hashCode()) * 31) + this.rtpStats.hashCode()) * 31) + C4081a.m32873a(this.ssrc)) * 31) + this.totalBitrate) * 31) + this.width;
    }

    public final boolean isFlexFEC() {
        return this.isFlexFEC;
    }

    public final boolean isRTX() {
        return this.isRTX;
    }

    public String toString() {
        return "Substream(avgDelay=" + this.avgDelay + ", frameCounts=" + this.frameCounts + ", height=" + this.height + ", isFlexFEC=" + this.isFlexFEC + ", isRTX=" + this.isRTX + ", maxDelay=" + this.maxDelay + ", retransmitBitrate=" + this.retransmitBitrate + ", rtcpStats=" + this.rtcpStats + ", rtpStats=" + this.rtpStats + ", ssrc=" + this.ssrc + ", totalBitrate=" + this.totalBitrate + ", width=" + this.width + ')';
    }
}
