package com.discord.audio;

import com.discord.audio.DiscordAudioManager;
import com.discord.audio.react.events.AudioManagerAudioDevicesUpdated;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "devices", "", "Lcom/discord/audio/DiscordAudioManager$AudioDevice;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class AudioManagerModule$initialize$1 extends s implements Function1<List<? extends DiscordAudioManager.AudioDevice>, Unit> {
    final  AudioManagerModule this$0;

    
    
    public AudioManagerModule$initialize$1(AudioManagerModule audioManagerModule) {
        super(1);
        this.this$0 = audioManagerModule;
    }

    @Override 
    public   Unit invoke(List<? extends DiscordAudioManager.AudioDevice> list) {
        invoke2((List<DiscordAudioManager.AudioDevice>) list);
        return Unit.f20664a;
    }

    
    public final void invoke2(List<DiscordAudioManager.AudioDevice> devices) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        q.g(devices, "devices");
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.reactContext;
        reactEvents.emitModuleEvent(reactApplicationContext, new AudioManagerAudioDevicesUpdated(devices));
    }
}
