package com.discord.audio;

import android.bluetooth.BluetoothDevice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DiscordAudioManager$bluetoothBroadcastReceiver$4 extends n implements Function1<BluetoothDevice, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$bluetoothBroadcastReceiver$4(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onActiveDeviceUpdate", "onActiveDeviceUpdate(Landroid/bluetooth/BluetoothDevice;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BluetoothDevice bluetoothDevice) {
        invoke2(bluetoothDevice);
        return Unit.f22035a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BluetoothDevice bluetoothDevice) {
        ((DiscordAudioManager) this.receiver).onActiveDeviceUpdate(bluetoothDevice);
    }
}
