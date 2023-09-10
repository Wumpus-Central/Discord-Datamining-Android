package com.discord.media.engine;

import com.discord.media.engine.video.events.OnBroadcastThumbnailEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "imgdata", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngineModule$setBroadcastThumbnailParams$1 extends s implements Function1<String, Unit> {
    final  MediaEngineModule this$0;

    
    
    public MediaEngineModule$setBroadcastThumbnailParams$1(MediaEngineModule mediaEngineModule) {
        super(1);
        this.this$0 = mediaEngineModule;
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f21442a;
    }

    
    public final void invoke2(String imgdata) {
        ReactEvents reactEvents;
        q.h(imgdata, "imgdata");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.this$0.getReactContext(), new OnBroadcastThumbnailEvent(imgdata));
    }
}
