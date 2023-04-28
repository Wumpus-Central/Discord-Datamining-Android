package co.discord.media_engine.internal;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\bJ\r\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u0011\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003JA\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m15073d2 = {"Lco/discord/media_engine/internal/Screenshare;", "", "capturedFramesDropped", "", "Lco/discord/media_engine/internal/I32;", "capturedFramesCount", "capturedFramesMean", "capturedFramesStdev", "(IIII)V", "getCapturedFramesCount", "()I", "getCapturedFramesDropped", "getCapturedFramesMean", "getCapturedFramesStdev", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class Screenshare {
    private final int capturedFramesCount;
    private final int capturedFramesDropped;
    private final int capturedFramesMean;
    private final int capturedFramesStdev;

    public Screenshare(int i, int i2, int i3, int i4) {
        this.capturedFramesDropped = i;
        this.capturedFramesCount = i2;
        this.capturedFramesMean = i3;
        this.capturedFramesStdev = i4;
    }

    public static /* synthetic */ Screenshare copy$default(Screenshare screenshare, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = screenshare.capturedFramesDropped;
        }
        if ((i5 & 2) != 0) {
            i2 = screenshare.capturedFramesCount;
        }
        if ((i5 & 4) != 0) {
            i3 = screenshare.capturedFramesMean;
        }
        if ((i5 & 8) != 0) {
            i4 = screenshare.capturedFramesStdev;
        }
        return screenshare.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.capturedFramesDropped;
    }

    public final int component2() {
        return this.capturedFramesCount;
    }

    public final int component3() {
        return this.capturedFramesMean;
    }

    public final int component4() {
        return this.capturedFramesStdev;
    }

    public final Screenshare copy(int i, int i2, int i3, int i4) {
        return new Screenshare(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Screenshare)) {
            return false;
        }
        Screenshare screenshare = (Screenshare) obj;
        return this.capturedFramesDropped == screenshare.capturedFramesDropped && this.capturedFramesCount == screenshare.capturedFramesCount && this.capturedFramesMean == screenshare.capturedFramesMean && this.capturedFramesStdev == screenshare.capturedFramesStdev;
    }

    public final int getCapturedFramesCount() {
        return this.capturedFramesCount;
    }

    public final int getCapturedFramesDropped() {
        return this.capturedFramesDropped;
    }

    public final int getCapturedFramesMean() {
        return this.capturedFramesMean;
    }

    public final int getCapturedFramesStdev() {
        return this.capturedFramesStdev;
    }

    public int hashCode() {
        return (((((this.capturedFramesDropped * 31) + this.capturedFramesCount) * 31) + this.capturedFramesMean) * 31) + this.capturedFramesStdev;
    }

    public String toString() {
        return "Screenshare(capturedFramesDropped=" + this.capturedFramesDropped + ", capturedFramesCount=" + this.capturedFramesCount + ", capturedFramesMean=" + this.capturedFramesMean + ", capturedFramesStdev=" + this.capturedFramesStdev + ')';
    }
}
