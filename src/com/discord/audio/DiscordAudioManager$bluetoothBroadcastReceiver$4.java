package com.discord.audio;

import android.bluetooth.BluetoothDevice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DiscordAudioManager$bluetoothBroadcastReceiver$4 extends C9968n implements Function1<BluetoothDevice, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$bluetoothBroadcastReceiver$4(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onActiveDeviceUpdate", "onActiveDeviceUpdate(Landroid/bluetooth/BluetoothDevice;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BluetoothDevice bluetoothDevice) {
        invoke2(bluetoothDevice);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BluetoothDevice bluetoothDevice) {
        ((DiscordAudioManager) this.receiver).onActiveDeviceUpdate(bluetoothDevice);
    }
}
