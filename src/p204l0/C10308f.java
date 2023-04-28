package p204l0;

import android.media.MediaCodecInfo;
import android.util.Range;

/* renamed from: l0.f */
/* loaded from: classes.dex */
public final class C10308f {
    /* renamed from: a */
    public static Range<Integer> m13651a(MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        Range<Integer> qualityRange;
        qualityRange = encoderCapabilities.getQualityRange();
        return qualityRange;
    }
}
