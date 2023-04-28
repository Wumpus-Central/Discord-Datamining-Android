package co.discord.media_engine.internal;

import co.discord.media_engine.C4081a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b2\b\u0080\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\f\u001a\u00060\u0005j\u0002`\b\u0012\n\u0010\r\u001a\u00060\u0005j\u0002`\b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011\u0012\n\u0010\u0012\u001a\u00060\u0005j\u0002`\b\u0012\n\u0010\u0013\u001a\u00060\u0005j\u0002`\b\u0012\n\u0010\u0014\u001a\u00060\u0005j\u0002`\b\u0012\n\u0010\u0015\u001a\u00060\u0005j\u0002`\b\u0012\n\u0010\u0016\u001a\u00060\u0010j\u0002`\u0017\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\n\u0010\u001c\u001a\u00060\u0005j\u0002`\b¢\u0006\u0002\u0010\u001dJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\r\u00106\u001a\u00060\u0005j\u0002`\bHÆ\u0003J\r\u00107\u001a\u00060\u0005j\u0002`\bHÆ\u0003J\r\u00108\u001a\u00060\u0005j\u0002`\bHÆ\u0003J\r\u00109\u001a\u00060\u0005j\u0002`\bHÆ\u0003J\r\u0010:\u001a\u00060\u0010j\u0002`\u0017HÆ\u0003J\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003¢\u0006\u0002\u00101J\t\u0010<\u001a\u00020\nHÆ\u0003J\r\u0010=\u001a\u00060\u0005j\u0002`\bHÆ\u0003J\r\u0010>\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010?\u001a\u00060\u0005j\u0002`\bHÆ\u0003J\t\u0010@\u001a\u00020\nHÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\r\u0010B\u001a\u00060\u0005j\u0002`\bHÆ\u0003J\r\u0010C\u001a\u00060\u0005j\u0002`\bHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\r\u0010E\u001a\u00060\u0010j\u0002`\u0011HÆ\u0003Jê\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\b\u0002\u0010\f\u001a\u00060\u0005j\u0002`\b2\f\b\u0002\u0010\r\u001a\u00060\u0005j\u0002`\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\f\b\u0002\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\f\b\u0002\u0010\u0012\u001a\u00060\u0005j\u0002`\b2\f\b\u0002\u0010\u0013\u001a\u00060\u0005j\u0002`\b2\f\b\u0002\u0010\u0014\u001a\u00060\u0005j\u0002`\b2\f\b\u0002\u0010\u0015\u001a\u00060\u0005j\u0002`\b2\f\b\u0002\u0010\u0016\u001a\u00060\u0010j\u0002`\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001b\u001a\u00020\n2\f\b\u0002\u0010\u001c\u001a\u00060\u0005j\u0002`\bHÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\n2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0005HÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001a\u00060\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0015\u0010\f\u001a\u00060\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0015\u0010\r\u001a\u00060\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0015\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0012\u001a\u00060\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0015\u0010\u0013\u001a\u00060\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0015\u0010\u0014\u001a\u00060\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0015\u0010\u0015\u001a\u00060\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0015\u0010\u0016\u001a\u00060\u0010j\u0002`\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0015\u0010\u001c\u001a\u00060\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001f¨\u0006L"}, m15073d2 = {"Lco/discord/media_engine/internal/OutboundVideo;", "", "codecName", "", "codecPayloadType", "", "Lco/discord/media_engine/internal/U8;", "avgEncodeTime", "Lco/discord/media_engine/internal/I32;", "bwLimitedResolution", "", "cpuLimitedResolution", "encodeFrameRate", "encodeUsage", "encoderImplementationName", "framesEncoded", "", "Lco/discord/media_engine/internal/U32;", "inputFrameRate", "mediaBitrate", "numberOfCPUAdaptChanges", "numberOfQualityAdaptChanges", "qpSum", "Lco/discord/media_engine/internal/I64;", "substreams", "", "Lco/discord/media_engine/internal/Substream;", "suspended", "targetMediaBitrate", "(Ljava/lang/String;IIZZIILjava/lang/String;JIIIIJ[Lco/discord/media_engine/internal/Substream;ZI)V", "getAvgEncodeTime", "()I", "getBwLimitedResolution", "()Z", "getCodecName", "()Ljava/lang/String;", "getCodecPayloadType", "getCpuLimitedResolution", "getEncodeFrameRate", "getEncodeUsage", "getEncoderImplementationName", "getFramesEncoded", "()J", "getInputFrameRate", "getMediaBitrate", "getNumberOfCPUAdaptChanges", "getNumberOfQualityAdaptChanges", "getQpSum", "getSubstreams", "()[Lco/discord/media_engine/internal/Substream;", "[Lco/discord/media_engine/internal/Substream;", "getSuspended", "getTargetMediaBitrate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;IIZZIILjava/lang/String;JIIIIJ[Lco/discord/media_engine/internal/Substream;ZI)Lco/discord/media_engine/internal/OutboundVideo;", "equals", "other", "hashCode", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class OutboundVideo {
    private final int avgEncodeTime;
    private final boolean bwLimitedResolution;
    private final String codecName;
    private final int codecPayloadType;
    private final boolean cpuLimitedResolution;
    private final int encodeFrameRate;
    private final int encodeUsage;
    private final String encoderImplementationName;
    private final long framesEncoded;
    private final int inputFrameRate;
    private final int mediaBitrate;
    private final int numberOfCPUAdaptChanges;
    private final int numberOfQualityAdaptChanges;
    private final long qpSum;
    private final Substream[] substreams;
    private final boolean suspended;
    private final int targetMediaBitrate;

    public OutboundVideo(String codecName, int i, int i2, boolean z, boolean z2, int i3, int i4, String encoderImplementationName, long j, int i5, int i6, int i7, int i8, long j2, Substream[] substreams, boolean z3, int i9) {
        C9971q.m14633g(codecName, "codecName");
        C9971q.m14633g(encoderImplementationName, "encoderImplementationName");
        C9971q.m14633g(substreams, "substreams");
        this.codecName = codecName;
        this.codecPayloadType = i;
        this.avgEncodeTime = i2;
        this.bwLimitedResolution = z;
        this.cpuLimitedResolution = z2;
        this.encodeFrameRate = i3;
        this.encodeUsage = i4;
        this.encoderImplementationName = encoderImplementationName;
        this.framesEncoded = j;
        this.inputFrameRate = i5;
        this.mediaBitrate = i6;
        this.numberOfCPUAdaptChanges = i7;
        this.numberOfQualityAdaptChanges = i8;
        this.qpSum = j2;
        this.substreams = substreams;
        this.suspended = z3;
        this.targetMediaBitrate = i9;
    }

    public final String component1() {
        return this.codecName;
    }

    public final int component10() {
        return this.inputFrameRate;
    }

    public final int component11() {
        return this.mediaBitrate;
    }

    public final int component12() {
        return this.numberOfCPUAdaptChanges;
    }

    public final int component13() {
        return this.numberOfQualityAdaptChanges;
    }

    public final long component14() {
        return this.qpSum;
    }

    public final Substream[] component15() {
        return this.substreams;
    }

    public final boolean component16() {
        return this.suspended;
    }

    public final int component17() {
        return this.targetMediaBitrate;
    }

    public final int component2() {
        return this.codecPayloadType;
    }

    public final int component3() {
        return this.avgEncodeTime;
    }

    public final boolean component4() {
        return this.bwLimitedResolution;
    }

    public final boolean component5() {
        return this.cpuLimitedResolution;
    }

    public final int component6() {
        return this.encodeFrameRate;
    }

    public final int component7() {
        return this.encodeUsage;
    }

    public final String component8() {
        return this.encoderImplementationName;
    }

    public final long component9() {
        return this.framesEncoded;
    }

    public final OutboundVideo copy(String codecName, int i, int i2, boolean z, boolean z2, int i3, int i4, String encoderImplementationName, long j, int i5, int i6, int i7, int i8, long j2, Substream[] substreams, boolean z3, int i9) {
        C9971q.m14633g(codecName, "codecName");
        C9971q.m14633g(encoderImplementationName, "encoderImplementationName");
        C9971q.m14633g(substreams, "substreams");
        return new OutboundVideo(codecName, i, i2, z, z2, i3, i4, encoderImplementationName, j, i5, i6, i7, i8, j2, substreams, z3, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutboundVideo)) {
            return false;
        }
        OutboundVideo outboundVideo = (OutboundVideo) obj;
        return C9971q.m14638b(this.codecName, outboundVideo.codecName) && this.codecPayloadType == outboundVideo.codecPayloadType && this.avgEncodeTime == outboundVideo.avgEncodeTime && this.bwLimitedResolution == outboundVideo.bwLimitedResolution && this.cpuLimitedResolution == outboundVideo.cpuLimitedResolution && this.encodeFrameRate == outboundVideo.encodeFrameRate && this.encodeUsage == outboundVideo.encodeUsage && C9971q.m14638b(this.encoderImplementationName, outboundVideo.encoderImplementationName) && this.framesEncoded == outboundVideo.framesEncoded && this.inputFrameRate == outboundVideo.inputFrameRate && this.mediaBitrate == outboundVideo.mediaBitrate && this.numberOfCPUAdaptChanges == outboundVideo.numberOfCPUAdaptChanges && this.numberOfQualityAdaptChanges == outboundVideo.numberOfQualityAdaptChanges && this.qpSum == outboundVideo.qpSum && C9971q.m14638b(this.substreams, outboundVideo.substreams) && this.suspended == outboundVideo.suspended && this.targetMediaBitrate == outboundVideo.targetMediaBitrate;
    }

    public final int getAvgEncodeTime() {
        return this.avgEncodeTime;
    }

    public final boolean getBwLimitedResolution() {
        return this.bwLimitedResolution;
    }

    public final String getCodecName() {
        return this.codecName;
    }

    public final int getCodecPayloadType() {
        return this.codecPayloadType;
    }

    public final boolean getCpuLimitedResolution() {
        return this.cpuLimitedResolution;
    }

    public final int getEncodeFrameRate() {
        return this.encodeFrameRate;
    }

    public final int getEncodeUsage() {
        return this.encodeUsage;
    }

    public final String getEncoderImplementationName() {
        return this.encoderImplementationName;
    }

    public final long getFramesEncoded() {
        return this.framesEncoded;
    }

    public final int getInputFrameRate() {
        return this.inputFrameRate;
    }

    public final int getMediaBitrate() {
        return this.mediaBitrate;
    }

    public final int getNumberOfCPUAdaptChanges() {
        return this.numberOfCPUAdaptChanges;
    }

    public final int getNumberOfQualityAdaptChanges() {
        return this.numberOfQualityAdaptChanges;
    }

    public final long getQpSum() {
        return this.qpSum;
    }

    public final Substream[] getSubstreams() {
        return this.substreams;
    }

    public final boolean getSuspended() {
        return this.suspended;
    }

    public final int getTargetMediaBitrate() {
        return this.targetMediaBitrate;
    }

    public int hashCode() {
        int hashCode = ((((this.codecName.hashCode() * 31) + this.codecPayloadType) * 31) + this.avgEncodeTime) * 31;
        boolean z = this.bwLimitedResolution;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.cpuLimitedResolution;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int hashCode2 = (((((((((((((((((((((i5 + i6) * 31) + this.encodeFrameRate) * 31) + this.encodeUsage) * 31) + this.encoderImplementationName.hashCode()) * 31) + C4081a.m32873a(this.framesEncoded)) * 31) + this.inputFrameRate) * 31) + this.mediaBitrate) * 31) + this.numberOfCPUAdaptChanges) * 31) + this.numberOfQualityAdaptChanges) * 31) + C4081a.m32873a(this.qpSum)) * 31) + Arrays.hashCode(this.substreams)) * 31;
        boolean z3 = this.suspended;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return ((hashCode2 + i) * 31) + this.targetMediaBitrate;
    }

    public String toString() {
        return "OutboundVideo(codecName=" + this.codecName + ", codecPayloadType=" + this.codecPayloadType + ", avgEncodeTime=" + this.avgEncodeTime + ", bwLimitedResolution=" + this.bwLimitedResolution + ", cpuLimitedResolution=" + this.cpuLimitedResolution + ", encodeFrameRate=" + this.encodeFrameRate + ", encodeUsage=" + this.encodeUsage + ", encoderImplementationName=" + this.encoderImplementationName + ", framesEncoded=" + this.framesEncoded + ", inputFrameRate=" + this.inputFrameRate + ", mediaBitrate=" + this.mediaBitrate + ", numberOfCPUAdaptChanges=" + this.numberOfCPUAdaptChanges + ", numberOfQualityAdaptChanges=" + this.numberOfQualityAdaptChanges + ", qpSum=" + this.qpSum + ", substreams=" + Arrays.toString(this.substreams) + ", suspended=" + this.suspended + ", targetMediaBitrate=" + this.targetMediaBitrate + ')';
    }
}
