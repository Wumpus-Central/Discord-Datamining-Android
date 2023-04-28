package org.webrtc;

/* loaded from: classes8.dex */
public interface VideoSink {
    @CalledByNative
    void onFrame(VideoFrame videoFrame);
}
