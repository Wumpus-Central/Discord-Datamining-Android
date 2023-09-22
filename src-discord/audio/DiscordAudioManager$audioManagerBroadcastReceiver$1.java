package com.discord.audio;

import com.discord.audio.enums.WiredHeadsetState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class DiscordAudioManager$audioManagerBroadcastReceiver$1 extends n implements Function1<WiredHeadsetState, Unit> {
    
    public DiscordAudioManager$audioManagerBroadcastReceiver$1(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onWiredHeadsetPlug", "onWiredHeadsetPlug(Lcom/discord/audio/enums/WiredHeadsetState;)V", 0);
    }

    @Override 
    public   Unit invoke(WiredHeadsetState wiredHeadsetState) {
        invoke2(wiredHeadsetState);
        return Unit.f21600a;
    }

    
    public final void invoke2(WiredHeadsetState p02) {
        q.h(p02, "p0");
        ((DiscordAudioManager) this.receiver).onWiredHeadsetPlug(p02);
    }
}
