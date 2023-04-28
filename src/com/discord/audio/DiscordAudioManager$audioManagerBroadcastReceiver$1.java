package com.discord.audio;

import com.discord.audio.enums.WiredHeadsetState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DiscordAudioManager$audioManagerBroadcastReceiver$1 extends C9968n implements Function1<WiredHeadsetState, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$audioManagerBroadcastReceiver$1(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onWiredHeadsetPlug", "onWiredHeadsetPlug(Lcom/discord/audio/enums/WiredHeadsetState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WiredHeadsetState wiredHeadsetState) {
        invoke2(wiredHeadsetState);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(WiredHeadsetState p0) {
        C9971q.m14633g(p0, "p0");
        ((DiscordAudioManager) this.receiver).onWiredHeadsetPlug(p0);
    }
}
