package com.discord.media.engine.video.egl_renderer;

import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import org.webrtc.VideoFrame;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m15073d2 = {"rotatedAspectRatio", "", "Lorg/webrtc/VideoFrame;", "getRotatedAspectRatio", "(Lorg/webrtc/VideoFrame;)F", "media_engine_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class WebRtcExtensionsKt {
    public static final float getRotatedAspectRatio(VideoFrame videoFrame) {
        C9677q.m14633g(videoFrame, "<this>");
        return videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
    }
}
