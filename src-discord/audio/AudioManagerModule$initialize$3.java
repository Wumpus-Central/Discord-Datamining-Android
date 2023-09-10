package com.discord.audio;

import com.discord.audio.react.events.AudioManagerMediaVolumeChanged;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "volume", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class AudioManagerModule$initialize$3 extends s implements Function1<Integer, Unit> {
    final  AudioManagerModule this$0;

    
    
    public AudioManagerModule$initialize$3(AudioManagerModule audioManagerModule) {
        super(1);
        this.this$0 = audioManagerModule;
    }

    @Override 
    public   Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f21442a;
    }

    public final void invoke(int i10) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.reactContext;
        reactEvents.emitModuleEvent(reactApplicationContext, new AudioManagerMediaVolumeChanged(i10));
    }
}
