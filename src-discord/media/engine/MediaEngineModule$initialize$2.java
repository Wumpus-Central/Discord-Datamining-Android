package com.discord.media.engine;

import com.discord.media.engine.video.events.OnVoiceEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "level", "", "speaking", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngineModule$initialize$2 extends s implements Function2<Float, Integer, Unit> {
    final  MediaEngineModule this$0;

    
    
    public MediaEngineModule$initialize$2(MediaEngineModule mediaEngineModule) {
        super(2);
        this.this$0 = mediaEngineModule;
    }

    @Override 
    public   Unit invoke(Float f10, Integer num) {
        invoke(f10.floatValue(), num.intValue());
        return Unit.f21215a;
    }

    public final void invoke(float f10, int i10) {
        ReactEvents reactEvents;
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new OnVoiceEvent(f10, i10));
    }
}
