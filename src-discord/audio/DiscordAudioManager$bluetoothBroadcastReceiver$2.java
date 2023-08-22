package com.discord.audio;

import com.discord.audio.enums.BluetoothHeadsetAudioState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class DiscordAudioManager$bluetoothBroadcastReceiver$2 extends n implements Function1<BluetoothHeadsetAudioState.Update, Unit> {
    
    public DiscordAudioManager$bluetoothBroadcastReceiver$2(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onHeadsetAudioStateUpdate", "onHeadsetAudioStateUpdate(Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;)V", 0);
    }

    @Override 
    public   Unit invoke(BluetoothHeadsetAudioState.Update update) {
        invoke2(update);
        return Unit.f21213a;
    }

    
    public final void invoke2(BluetoothHeadsetAudioState.Update p02) {
        q.h(p02, "p0");
        ((DiscordAudioManager) this.receiver).onHeadsetAudioStateUpdate(p02);
    }
}
