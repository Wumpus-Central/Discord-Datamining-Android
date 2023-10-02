package com.discord.media_player;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pf.t;
import vf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1", f = "MediaPlayerManagerModule.kt", l = {119, 128}, m = "invokeSuspend")

public final class MediaPlayerManagerModule$startPlayerProgressInterval$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  MediaPlayer $mediaPlayer;
    final  double $portal;
    private  Object L$0;
    int label;
    final  MediaPlayerManagerModule this$0;

    
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1", f = "MediaPlayerManagerModule.kt", l = {}, m = "invokeSuspend")
    
    
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final  MediaPlayer $mediaPlayer;
        final  double $portal;
        int label;
        final  MediaPlayerManagerModule this$0;

        
        AnonymousClass1(MediaPlayer mediaPlayer, MediaPlayerManagerModule mediaPlayerManagerModule, double d10, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mediaPlayer = mediaPlayer;
            this.this$0 = mediaPlayerManagerModule;
            this.$portal = d10;
        }

        @Override 
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$mediaPlayer, this.this$0, this.$portal, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21601a);
        }

        @Override 
        public final Object invokeSuspend(Object obj) {
            d.d();
            if (this.label == 0) {
                t.b(obj);
                if (this.$mediaPlayer.isPlaying()) {
                    this.this$0.onMediaPlayerProgress(this.$portal, this.$mediaPlayer.currentPositionMs(), this.$mediaPlayer.durationMs());
                }
                return Unit.f21601a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    
    
    public MediaPlayerManagerModule$startPlayerProgressInterval$1(MediaPlayer mediaPlayer, MediaPlayerManagerModule mediaPlayerManagerModule, double d10, Continuation<? super MediaPlayerManagerModule$startPlayerProgressInterval$1> continuation) {
        super(2, continuation);
        this.$mediaPlayer = mediaPlayer;
        this.this$0 = mediaPlayerManagerModule;
        this.$portal = d10;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaPlayerManagerModule$startPlayerProgressInterval$1 mediaPlayerManagerModule$startPlayerProgressInterval$1 = new MediaPlayerManagerModule$startPlayerProgressInterval$1(this.$mediaPlayer, this.this$0, this.$portal, continuation);
        mediaPlayerManagerModule$startPlayerProgressInterval$1.L$0 = obj;
        return mediaPlayerManagerModule$startPlayerProgressInterval$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaPlayerManagerModule$startPlayerProgressInterval$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21601a);
    }

    
    
    
    
    @Override 
    
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
