package com.discord.media_player;

import com.google.android.exoplayer2.SimpleExoPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaPlayerManagerModule$setMuted$1 extends s implements Function1<SimpleExoPlayer, Unit> {
    final  boolean $muted;

    
    
    public MediaPlayerManagerModule$setMuted$1(boolean z10) {
        super(1);
        this.$muted = z10;
    }

    @Override 
    public   Unit invoke(SimpleExoPlayer simpleExoPlayer) {
        invoke2(simpleExoPlayer);
        return Unit.f21025a;
    }

    
    public final void invoke2(SimpleExoPlayer player) {
        q.h(player, "player");
        player.e1(this.$muted ? 0.0f : 1.0f);
    }
}
