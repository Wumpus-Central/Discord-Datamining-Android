package com.discord.audio;

import android.bluetooth.BluetoothDevice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class DiscordAudioManager$bluetoothBroadcastReceiver$4 extends n implements Function1<BluetoothDevice, Unit> {
    
    public DiscordAudioManager$bluetoothBroadcastReceiver$4(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onActiveDeviceUpdate", "onActiveDeviceUpdate(Landroid/bluetooth/BluetoothDevice;)V", 0);
    }

    @Override 
    public   Unit invoke(BluetoothDevice bluetoothDevice) {
        invoke2(bluetoothDevice);
        return Unit.f21436a;
    }

    
    public final void invoke2(BluetoothDevice bluetoothDevice) {
        ((DiscordAudioManager) this.receiver).onActiveDeviceUpdate(bluetoothDevice);
    }
}
