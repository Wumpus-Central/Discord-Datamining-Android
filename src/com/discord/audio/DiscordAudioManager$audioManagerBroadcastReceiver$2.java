package com.discord.audio;

import com.discord.audio.enums.ScoAudioState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DiscordAudioManager$audioManagerBroadcastReceiver$2 extends C9968n implements Function1<ScoAudioState.Update, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$audioManagerBroadcastReceiver$2(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onScoAudioStateUpdate", "onScoAudioStateUpdate(Lcom/discord/audio/enums/ScoAudioState$Update;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScoAudioState.Update update) {
        invoke2(update);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ScoAudioState.Update p0) {
        C9971q.m14633g(p0, "p0");
        ((DiscordAudioManager) this.receiver).onScoAudioStateUpdate(p0);
    }
}
