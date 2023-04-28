package com.discord.media.engine.video;

import com.discord.media.engine.video.AttachedVideoSinks;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;
import org.webrtc.VideoFrame;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class AttachedVideoSinks$addSink$1 extends C9968n implements Function1<VideoFrame, Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AttachedVideoSinks$addSink$1(Object obj) {
        super(1, obj, AttachedVideoSinks.VideoOutputSinks.class, "onFrame", "onFrame(Lorg/webrtc/VideoFrame;)Z", 0);
    }

    public final Boolean invoke(VideoFrame p0) {
        C9971q.m14633g(p0, "p0");
        return Boolean.valueOf(((AttachedVideoSinks.VideoOutputSinks) this.receiver).onFrame(p0));
    }
}
