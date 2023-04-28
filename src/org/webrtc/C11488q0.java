package org.webrtc;

import android.support.annotation.Nullable;
import org.webrtc.VideoProcessor;

/* renamed from: org.webrtc.q0 */
/* loaded from: classes8.dex */
public final /* synthetic */ class C11488q0 {
    /* renamed from: a */
    public static void m9571a(VideoProcessor videoProcessor, VideoFrame videoFrame, VideoProcessor.FrameAdaptationParameters frameAdaptationParameters) {
        VideoFrame b = m9570b(videoFrame, frameAdaptationParameters);
        if (b != null) {
            videoProcessor.onFrameCaptured(b);
            b.release();
        }
    }

    @Nullable
    /* renamed from: b */
    public static VideoFrame m9570b(VideoFrame videoFrame, VideoProcessor.FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        return new VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }
}
