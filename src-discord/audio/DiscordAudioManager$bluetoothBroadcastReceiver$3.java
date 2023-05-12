package com.discord.audio;

import android.bluetooth.BluetoothHeadset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DiscordAudioManager$bluetoothBroadcastReceiver$3 extends n implements Function1<BluetoothHeadset, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$bluetoothBroadcastReceiver$3(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onHeadsetProxyConnectionUpdate", "onHeadsetProxyConnectionUpdate(Landroid/bluetooth/BluetoothHeadset;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BluetoothHeadset bluetoothHeadset) {
        invoke2(bluetoothHeadset);
        return Unit.f22036a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BluetoothHeadset bluetoothHeadset) {
        ((DiscordAudioManager) this.receiver).onHeadsetProxyConnectionUpdate(bluetoothHeadset);
    }
}
