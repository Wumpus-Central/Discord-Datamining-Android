package com.discord.audio;

import android.bluetooth.BluetoothHeadset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class DiscordAudioManager$bluetoothBroadcastReceiver$3 extends n implements Function1<BluetoothHeadset, Unit> {
    
    public DiscordAudioManager$bluetoothBroadcastReceiver$3(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onHeadsetProxyConnectionUpdate", "onHeadsetProxyConnectionUpdate(Landroid/bluetooth/BluetoothHeadset;)V", 0);
    }

    @Override 
    public   Unit invoke(BluetoothHeadset bluetoothHeadset) {
        invoke2(bluetoothHeadset);
        return Unit.f21442a;
    }

    
    public final void invoke2(BluetoothHeadset bluetoothHeadset) {
        ((DiscordAudioManager) this.receiver).onHeadsetProxyConnectionUpdate(bluetoothHeadset);
    }
}
