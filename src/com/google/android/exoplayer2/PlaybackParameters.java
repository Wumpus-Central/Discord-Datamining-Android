package com.google.android.exoplayer2;

import p119g9.C7510a;
import p119g9.C7557q0;

/* loaded from: classes7.dex */
public final class PlaybackParameters {

    /* renamed from: d */
    public static final PlaybackParameters f9028d = new PlaybackParameters(1.0f);

    /* renamed from: a */
    public final float f9029a;

    /* renamed from: b */
    public final float f9030b;

    /* renamed from: c */
    private final int f9031c;

    public PlaybackParameters(float f) {
        this(f, 1.0f);
    }

    /* renamed from: a */
    public long m30540a(long j) {
        return j * this.f9031c;
    }

    /* renamed from: b */
    public PlaybackParameters m30539b(float f) {
        return new PlaybackParameters(f, this.f9030b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaybackParameters.class != obj.getClass()) {
            return false;
        }
        PlaybackParameters playbackParameters = (PlaybackParameters) obj;
        if (this.f9029a == playbackParameters.f9029a && this.f9030b == playbackParameters.f9030b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f9029a)) * 31) + Float.floatToRawIntBits(this.f9030b);
    }

    public String toString() {
        return C7557q0.m22209D("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f9029a), Float.valueOf(this.f9030b));
    }

    public PlaybackParameters(float f, float f2) {
        boolean z = true;
        C7510a.m22371a(f > 0.0f);
        C7510a.m22371a(f2 <= 0.0f ? false : z);
        this.f9029a = f;
        this.f9030b = f2;
        this.f9031c = Math.round(f * 1000.0f);
    }
}
