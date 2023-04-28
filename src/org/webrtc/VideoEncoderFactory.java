package org.webrtc;

import android.support.annotation.Nullable;

/* loaded from: classes8.dex */
public interface VideoEncoderFactory {

    /* loaded from: classes8.dex */
    public interface VideoEncoderSelector {
        @CalledByNative("VideoEncoderSelector")
        @Nullable
        VideoCodecInfo onAvailableBitrate(int i);

        @CalledByNative("VideoEncoderSelector")
        void onCurrentEncoder(VideoCodecInfo videoCodecInfo);

        @CalledByNative("VideoEncoderSelector")
        @Nullable
        VideoCodecInfo onEncoderBroken();
    }

    @CalledByNative
    @Nullable
    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    VideoEncoderSelector getEncoderSelector();

    @CalledByNative
    VideoCodecInfo[] getImplementations();

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs();
}
