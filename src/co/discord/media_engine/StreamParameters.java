package co.discord.media_engine;

import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m15073d2 = {"Lco/discord/media_engine/StreamParameters;", "", "type", "Lco/discord/media_engine/MediaType;", "rid", "", "ssrc", "", "rtxSsrc", AppStateModule.APP_STATE_ACTIVE, "", "maxBitrate", "quality", "maxPixelCount", "(Lco/discord/media_engine/MediaType;Ljava/lang/String;IIZIII)V", "getActive", "()Z", "getMaxBitrate", "()I", "getMaxPixelCount", "getQuality", "getRid", "()Ljava/lang/String;", "getRtxSsrc", "getSsrc", "getType", "()Lco/discord/media_engine/MediaType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class StreamParameters {
    private final boolean active;
    private final int maxBitrate;
    private final int maxPixelCount;
    private final int quality;
    private final String rid;
    private final int rtxSsrc;
    private final int ssrc;
    private final MediaType type;

    public StreamParameters(MediaType type, String rid, int i, int i2, boolean z, int i3, int i4, int i5) {
        C9971q.m14633g(type, "type");
        C9971q.m14633g(rid, "rid");
        this.type = type;
        this.rid = rid;
        this.ssrc = i;
        this.rtxSsrc = i2;
        this.active = z;
        this.maxBitrate = i3;
        this.quality = i4;
        this.maxPixelCount = i5;
    }

    public final MediaType component1() {
        return this.type;
    }

    public final String component2() {
        return this.rid;
    }

    public final int component3() {
        return this.ssrc;
    }

    public final int component4() {
        return this.rtxSsrc;
    }

    public final boolean component5() {
        return this.active;
    }

    public final int component6() {
        return this.maxBitrate;
    }

    public final int component7() {
        return this.quality;
    }

    public final int component8() {
        return this.maxPixelCount;
    }

    public final StreamParameters copy(MediaType type, String rid, int i, int i2, boolean z, int i3, int i4, int i5) {
        C9971q.m14633g(type, "type");
        C9971q.m14633g(rid, "rid");
        return new StreamParameters(type, rid, i, i2, z, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamParameters)) {
            return false;
        }
        StreamParameters streamParameters = (StreamParameters) obj;
        return this.type == streamParameters.type && C9971q.m14638b(this.rid, streamParameters.rid) && this.ssrc == streamParameters.ssrc && this.rtxSsrc == streamParameters.rtxSsrc && this.active == streamParameters.active && this.maxBitrate == streamParameters.maxBitrate && this.quality == streamParameters.quality && this.maxPixelCount == streamParameters.maxPixelCount;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final int getMaxBitrate() {
        return this.maxBitrate;
    }

    public final int getMaxPixelCount() {
        return this.maxPixelCount;
    }

    public final int getQuality() {
        return this.quality;
    }

    public final String getRid() {
        return this.rid;
    }

    public final int getRtxSsrc() {
        return this.rtxSsrc;
    }

    public final int getSsrc() {
        return this.ssrc;
    }

    public final MediaType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((this.type.hashCode() * 31) + this.rid.hashCode()) * 31) + this.ssrc) * 31) + this.rtxSsrc) * 31;
        boolean z = this.active;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return ((((((hashCode + i) * 31) + this.maxBitrate) * 31) + this.quality) * 31) + this.maxPixelCount;
    }

    public String toString() {
        return "StreamParameters(type=" + this.type + ", rid=" + this.rid + ", ssrc=" + this.ssrc + ", rtxSsrc=" + this.rtxSsrc + ", active=" + this.active + ", maxBitrate=" + this.maxBitrate + ", quality=" + this.quality + ", maxPixelCount=" + this.maxPixelCount + ')';
    }
}
