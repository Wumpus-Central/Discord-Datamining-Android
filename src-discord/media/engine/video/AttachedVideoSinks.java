package com.discord.media.engine.video;

import com.discord.media.engine.MediaEngine;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0006J\u001e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J \u0010\u0013\u001a\u00020\u00072\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/media/engine/video/AttachedVideoSinks;", "", "()V", "activeSinksChangeCallback", "Lkotlin/Function2;", "", "", "", "streamOutputMap", "", "Lcom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks;", "addSink", "mediaEngine", "Lcom/discord/media/engine/MediaEngine;", "sink", "Lorg/webrtc/VideoSink;", "streamId", "anySinksActive", "removeSink", "setActiveSinksChangeCallback", "callback", "VideoOutputSinks", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AttachedVideoSinks {
    private static Function2<? super String, ? super Boolean, Unit> activeSinksChangeCallback;
    public static final AttachedVideoSinks INSTANCE = new AttachedVideoSinks();
    private static final Map<String, VideoOutputSinks> streamOutputMap = new ConcurrentHashMap();

    
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks;", "", "sink", "Lorg/webrtc/VideoSink;", "(Lorg/webrtc/VideoSink;)V", "sinks", "", "add", "", "isEmpty", "onFrame", "frame", "Lorg/webrtc/VideoFrame;", "remove", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class VideoOutputSinks {
        private final Set<VideoSink> sinks;

        public VideoOutputSinks(VideoSink sink) {
            Set<VideoSink> g10;
            q.h(sink, "sink");
            g10 = w.g(sink);
            this.sinks = g10;
        }

        public final synchronized boolean add(VideoSink sink) {
            q.h(sink, "sink");
            return this.sinks.add(sink);
        }

        public final synchronized boolean isEmpty() {
            return this.sinks.isEmpty();
        }

        public final synchronized boolean onFrame(VideoFrame frame) {
            q.h(frame, "frame");
            for (VideoSink videoSink : this.sinks) {
                videoSink.onFrame(frame);
            }
            frame.release();
            return true;
        }

        public final synchronized boolean remove(VideoSink sink) {
            q.h(sink, "sink");
            return this.sinks.remove(sink);
        }
    }

    private AttachedVideoSinks() {
    }

    public final void addSink(MediaEngine mediaEngine, VideoSink sink, String streamId) {
        q.h(mediaEngine, "mediaEngine");
        q.h(sink, "sink");
        q.h(streamId, "streamId");
        Map<String, VideoOutputSinks> map = streamOutputMap;
        VideoOutputSinks videoOutputSinks = map.get(streamId);
        if (videoOutputSinks != null) {
            synchronized (videoOutputSinks) {
                videoOutputSinks.add(sink);
            }
            return;
        }
        VideoOutputSinks videoOutputSinks2 = new VideoOutputSinks(sink);
        map.put(streamId, videoOutputSinks2);
        mediaEngine.setVideoOutputSink$media_engine_release(streamId, new AttachedVideoSinks$addSink$2(videoOutputSinks2));
        Function2<? super String, ? super Boolean, Unit> function2 = activeSinksChangeCallback;
        if (function2 != null) {
            function2.invoke(streamId, Boolean.TRUE);
        }
    }

    public final boolean anySinksActive() {
        return !streamOutputMap.isEmpty();
    }

    public final void removeSink(MediaEngine mediaEngine, VideoSink sink, String streamId) {
        boolean z10;
        Function2<? super String, ? super Boolean, Unit> function2;
        q.h(mediaEngine, "mediaEngine");
        q.h(sink, "sink");
        q.h(streamId, "streamId");
        Map<String, VideoOutputSinks> map = streamOutputMap;
        VideoOutputSinks videoOutputSinks = map.get(streamId);
        if (videoOutputSinks != null) {
            synchronized (videoOutputSinks) {
                videoOutputSinks.remove(sink);
                if (videoOutputSinks.isEmpty()) {
                    mediaEngine.setVideoOutputSink$media_engine_release(streamId, null);
                    map.remove(streamId);
                    z10 = true;
                } else {
                    z10 = false;
                }
                Unit unit = Unit.f21215a;
            }
            if (z10 && (function2 = activeSinksChangeCallback) != null) {
                function2.invoke(streamId, Boolean.FALSE);
            }
        }
    }

    public final void setActiveSinksChangeCallback(Function2<? super String, ? super Boolean, Unit> callback) {
        q.h(callback, "callback");
        activeSinksChangeCallback = callback;
    }
}
