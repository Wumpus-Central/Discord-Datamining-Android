package com.discord.audio;

import com.discord.audio.enums.WiredHeadsetState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DiscordAudioManager$audioManagerBroadcastReceiver$1 extends n implements Function1<WiredHeadsetState, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$audioManagerBroadcastReceiver$1(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onWiredHeadsetPlug", "onWiredHeadsetPlug(Lcom/discord/audio/enums/WiredHeadsetState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WiredHeadsetState wiredHeadsetState) {
        invoke2(wiredHeadsetState);
        return Unit.f22035a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(WiredHeadsetState p02) {
        q.g(p02, "p0");
        ((DiscordAudioManager) this.receiver).onWiredHeadsetPlug(p02);
    }
}
