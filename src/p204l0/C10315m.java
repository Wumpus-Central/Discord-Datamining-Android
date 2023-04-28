package p204l0;

import android.media.MediaCodecInfo;
import android.util.Range;

/* renamed from: l0.m */
/* loaded from: classes.dex */
public final class C10315m {
    /* renamed from: a */
    public static Range<Integer>[] m13642a(MediaCodecInfo.AudioCapabilities audioCapabilities) {
        Range<Integer>[] inputChannelCountRanges;
        inputChannelCountRanges = audioCapabilities.getInputChannelCountRanges();
        return inputChannelCountRanges;
    }

    /* renamed from: b */
    public static int m13641b(MediaCodecInfo.AudioCapabilities audioCapabilities) {
        int minInputChannelCount;
        minInputChannelCount = audioCapabilities.getMinInputChannelCount();
        return minInputChannelCount;
    }
}
