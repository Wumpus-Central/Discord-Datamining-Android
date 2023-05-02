package com.discord.audio;

import com.discord.audio.enums.BluetoothProfileConnectionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DiscordAudioManager$bluetoothBroadcastReceiver$1 extends n implements Function1<BluetoothProfileConnectionState.Update, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$bluetoothBroadcastReceiver$1(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onHeadsetConnectionStateUpdate", "onHeadsetConnectionStateUpdate(Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BluetoothProfileConnectionState.Update update) {
        invoke2(update);
        return Unit.f22035a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BluetoothProfileConnectionState.Update p02) {
        q.g(p02, "p0");
        ((DiscordAudioManager) this.receiver).onHeadsetConnectionStateUpdate(p02);
    }
}
