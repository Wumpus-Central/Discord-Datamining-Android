package com.discord.media.engine;

import com.discord.p000native.engine.NativeEngine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import org.webrtc.VideoFrame;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "videoFrame", "Lorg/webrtc/VideoFrame;", "onFrame"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngine$setVideoOutputSink$1$1 implements NativeEngine.VideoFrameCallback {
    final  Function1<VideoFrame, Boolean> $callback;

    
    
    public MediaEngine$setVideoOutputSink$1$1(Function1<? super VideoFrame, Boolean> function1) {
        this.$callback = function1;
    }

    @Override 
    public final boolean onFrame(VideoFrame videoFrame) {
        q.h(videoFrame, "videoFrame");
        return this.$callback.invoke(videoFrame).booleanValue();
    }
}
