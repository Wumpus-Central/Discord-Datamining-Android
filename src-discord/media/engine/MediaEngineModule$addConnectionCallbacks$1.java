package com.discord.media.engine;

import com.discord.media.engine.video.events.UserSpeakingEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "userId", "", "isSpeaking", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MediaEngineModule$addConnectionCallbacks$1 extends s implements Function2<String, Integer, Unit> {
    final  int $connectionId;
    final  MediaEngineModule this$0;

    
    
    public MediaEngineModule$addConnectionCallbacks$1(MediaEngineModule mediaEngineModule, int i10) {
        super(2);
        this.this$0 = mediaEngineModule;
        this.$connectionId = i10;
    }

    @Override 
    public   Unit invoke(String str, Integer num) {
        invoke(str, num.intValue());
        return Unit.f21601a;
    }

    public final void invoke(String userId, int i10) {
        ReactEvents reactEvents;
        q.h(userId, "userId");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new UserSpeakingEvent(this.$connectionId, userId, i10));
    }
}
