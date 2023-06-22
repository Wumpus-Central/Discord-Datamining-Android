package com.discord.audio;

import com.discord.audio.enums.ScoAudioState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class DiscordAudioManager$audioManagerBroadcastReceiver$2 extends n implements Function1<ScoAudioState.Update, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$audioManagerBroadcastReceiver$2(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onScoAudioStateUpdate", "onScoAudioStateUpdate(Lcom/discord/audio/enums/ScoAudioState$Update;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScoAudioState.Update update) {
        invoke2(update);
        return Unit.f22113a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ScoAudioState.Update p02) {
        q.g(p02, "p0");
        ((DiscordAudioManager) this.receiver).onScoAudioStateUpdate(p02);
    }
}
