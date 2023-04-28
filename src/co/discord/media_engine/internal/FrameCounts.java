package co.discord.media_engine.internal;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0006J\r\u0010\n\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J%\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m15073d2 = {"Lco/discord/media_engine/internal/FrameCounts;", "", "deltaFrames", "", "Lco/discord/media_engine/internal/I32;", "keyFrames", "(II)V", "getDeltaFrames", "()I", "getKeyFrames", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class FrameCounts {
    private final int deltaFrames;
    private final int keyFrames;

    public FrameCounts(int i, int i2) {
        this.deltaFrames = i;
        this.keyFrames = i2;
    }

    public static /* synthetic */ FrameCounts copy$default(FrameCounts frameCounts, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = frameCounts.deltaFrames;
        }
        if ((i3 & 2) != 0) {
            i2 = frameCounts.keyFrames;
        }
        return frameCounts.copy(i, i2);
    }

    public final int component1() {
        return this.deltaFrames;
    }

    public final int component2() {
        return this.keyFrames;
    }

    public final FrameCounts copy(int i, int i2) {
        return new FrameCounts(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameCounts)) {
            return false;
        }
        FrameCounts frameCounts = (FrameCounts) obj;
        return this.deltaFrames == frameCounts.deltaFrames && this.keyFrames == frameCounts.keyFrames;
    }

    public final int getDeltaFrames() {
        return this.deltaFrames;
    }

    public final int getKeyFrames() {
        return this.keyFrames;
    }

    public int hashCode() {
        return (this.deltaFrames * 31) + this.keyFrames;
    }

    public String toString() {
        return "FrameCounts(deltaFrames=" + this.deltaFrames + ", keyFrames=" + this.keyFrames + ')';
    }
}
