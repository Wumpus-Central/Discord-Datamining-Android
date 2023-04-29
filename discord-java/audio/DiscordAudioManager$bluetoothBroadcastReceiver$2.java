package com.discord.audio;

import com.discord.audio.enums.BluetoothHeadsetAudioState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DiscordAudioManager$bluetoothBroadcastReceiver$2 extends n implements Function1<BluetoothHeadsetAudioState.Update, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$bluetoothBroadcastReceiver$2(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onHeadsetAudioStateUpdate", "onHeadsetAudioStateUpdate(Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BluetoothHeadsetAudioState.Update update) {
        invoke2(update);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BluetoothHeadsetAudioState.Update p02) {
        q.g(p02, "p0");
        ((DiscordAudioManager) this.receiver).onHeadsetAudioStateUpdate(p02);
    }
}
