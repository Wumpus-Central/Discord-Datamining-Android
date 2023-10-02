package com.discord.media.engine;

import com.discord.media.engine.video.events.FirstFrameCallbackEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "userId", "", "ssrc", "", "Lcom/discord/media/engine/types/SSRC64;", "streamId", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MediaEngineModule$addConnectionCallbacks$4 extends s implements Function3<String, Long, String, Unit> {
    final  int $connectionId;
    final  MediaEngineModule this$0;

    
    
    public MediaEngineModule$addConnectionCallbacks$4(MediaEngineModule mediaEngineModule, int i10) {
        super(3);
        this.this$0 = mediaEngineModule;
        this.$connectionId = i10;
    }

    @Override 
    public   Unit invoke(String str, Long l10, String str2) {
        invoke(str, l10.longValue(), str2);
        return Unit.f21601a;
    }

    public final void invoke(String userId, long j10, String streamId) {
        ReactEvents reactEvents;
        q.h(userId, "userId");
        q.h(streamId, "streamId");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new FirstFrameCallbackEvent(this.$connectionId, userId, j10, streamId));
    }
}
