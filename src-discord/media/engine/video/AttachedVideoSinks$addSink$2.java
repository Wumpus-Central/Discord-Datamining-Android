package com.discord.media.engine.video;

import com.discord.media.engine.video.AttachedVideoSinks;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;
import org.webrtc.VideoFrame;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class AttachedVideoSinks$addSink$2 extends n implements Function1<VideoFrame, Boolean> {
    
    public AttachedVideoSinks$addSink$2(Object obj) {
        super(1, obj, AttachedVideoSinks.VideoOutputSinks.class, "onFrame", "onFrame(Lorg/webrtc/VideoFrame;)Z", 0);
    }

    public final Boolean invoke(VideoFrame p02) {
        q.h(p02, "p0");
        return Boolean.valueOf(((AttachedVideoSinks.VideoOutputSinks) this.receiver).onFrame(p02));
    }
}
