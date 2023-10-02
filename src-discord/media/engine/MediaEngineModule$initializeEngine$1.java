package com.discord.media.engine;

import com.discord.media.engine.video.events.NoInputCallbackEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "input", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngineModule$initializeEngine$1 extends s implements Function1<Boolean, Unit> {
    final  MediaEngineModule this$0;

    
    
    public MediaEngineModule$initializeEngine$1(MediaEngineModule mediaEngineModule) {
        super(1);
        this.this$0 = mediaEngineModule;
    }

    @Override 
    public   Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f21601a;
    }

    public final void invoke(boolean z10) {
        ReactEvents reactEvents;
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new NoInputCallbackEvent(z10));
    }
}
