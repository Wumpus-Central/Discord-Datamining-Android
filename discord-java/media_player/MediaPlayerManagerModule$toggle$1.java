package com.discord.media_player;

import com.discord.media_player.reactevents.MediaPlayerPause;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.exoplayer2.SimpleExoPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaPlayerManagerModule$toggle$1 extends s implements Function1<SimpleExoPlayer, Unit> {
    final /* synthetic */ boolean $play;
    final /* synthetic */ double $portal;
    final /* synthetic */ MediaPlayerManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerManagerModule$toggle$1(boolean z10, MediaPlayerManagerModule mediaPlayerManagerModule, double d10) {
        super(1);
        this.$play = z10;
        this.this$0 = mediaPlayerManagerModule;
        this.$portal = d10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimpleExoPlayer simpleExoPlayer) {
        invoke2(simpleExoPlayer);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SimpleExoPlayer player) {
        ReactEvents reactEvents;
        ReactApplicationContext reactApplicationContext;
        q.g(player, "player");
        if (this.$play && player.P() == 4) {
            player.c0(0L);
        }
        player.o(this.$play);
        reactEvents = this.this$0.reactEvents;
        reactApplicationContext = this.this$0.reactContext;
        reactEvents.emitModuleEvent(reactApplicationContext, new MediaPlayerPause(this.$portal, !this.$play));
    }
}
