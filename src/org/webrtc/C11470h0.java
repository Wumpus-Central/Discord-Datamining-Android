package org.webrtc;

import android.support.annotation.Nullable;

/* renamed from: org.webrtc.h0 */
/* loaded from: classes8.dex */
public final /* synthetic */ class C11470h0 {
    @Nullable
    @Deprecated
    /* renamed from: a */
    public static VideoDecoder m9579a(VideoDecoderFactory videoDecoderFactory, String str) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    @CalledByNative
    @Nullable
    /* renamed from: b */
    public static VideoDecoder m9578b(VideoDecoderFactory videoDecoderFactory, VideoCodecInfo videoCodecInfo) {
        return videoDecoderFactory.createDecoder(videoCodecInfo.getName());
    }

    @CalledByNative
    /* renamed from: c */
    public static VideoCodecInfo[] m9577c(VideoDecoderFactory videoDecoderFactory) {
        return new VideoCodecInfo[0];
    }
}
