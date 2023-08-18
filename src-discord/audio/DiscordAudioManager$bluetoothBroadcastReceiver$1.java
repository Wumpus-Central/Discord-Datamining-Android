package com.discord.audio;

import com.discord.audio.enums.BluetoothProfileConnectionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class DiscordAudioManager$bluetoothBroadcastReceiver$1 extends n implements Function1<BluetoothProfileConnectionState.Update, Unit> {
    
    public DiscordAudioManager$bluetoothBroadcastReceiver$1(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onHeadsetConnectionStateUpdate", "onHeadsetConnectionStateUpdate(Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;)V", 0);
    }

    @Override 
    public   Unit invoke(BluetoothProfileConnectionState.Update update) {
        invoke2(update);
        return Unit.f21210a;
    }

    
    public final void invoke2(BluetoothProfileConnectionState.Update p02) {
        q.h(p02, "p0");
        ((DiscordAudioManager) this.receiver).onHeadsetConnectionStateUpdate(p02);
    }
}
