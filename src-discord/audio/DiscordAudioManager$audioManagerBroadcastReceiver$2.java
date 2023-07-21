package com.discord.audio;

import com.discord.audio.enums.ScoAudioState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class DiscordAudioManager$audioManagerBroadcastReceiver$2 extends n implements Function1<ScoAudioState.Update, Unit> {
    
    public DiscordAudioManager$audioManagerBroadcastReceiver$2(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onScoAudioStateUpdate", "onScoAudioStateUpdate(Lcom/discord/audio/enums/ScoAudioState$Update;)V", 0);
    }

    @Override 
    public   Unit invoke(ScoAudioState.Update update) {
        invoke2(update);
        return Unit.f20664a;
    }

    
    public final void invoke2(ScoAudioState.Update p02) {
        q.g(p02, "p0");
        ((DiscordAudioManager) this.receiver).onScoAudioStateUpdate(p02);
    }
}
