package com.discord.audio;

import com.discord.audio.enums.BluetoothHeadsetAudioState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9674n;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DiscordAudioManager$bluetoothBroadcastReceiver$2 extends C9674n implements Function1<BluetoothHeadsetAudioState.Update, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$bluetoothBroadcastReceiver$2(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onHeadsetAudioStateUpdate", "onHeadsetAudioStateUpdate(Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BluetoothHeadsetAudioState.Update update) {
        invoke2(update);
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BluetoothHeadsetAudioState.Update p0) {
        C9677q.m14633g(p0, "p0");
        ((DiscordAudioManager) this.receiver).onHeadsetAudioStateUpdate(p0);
    }
}
