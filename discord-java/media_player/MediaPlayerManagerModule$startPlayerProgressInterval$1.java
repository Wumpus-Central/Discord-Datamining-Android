package com.discord.media_player;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nf.t;
import tf.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1", f = "MediaPlayerManagerModule.kt", l = {119, 128}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MediaPlayerManagerModule$startPlayerProgressInterval$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MediaPlayer $mediaPlayer;
    final /* synthetic */ double $portal;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaPlayerManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1", f = "MediaPlayerManagerModule.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MediaPlayer $mediaPlayer;
        final /* synthetic */ double $portal;
        int label;
        final /* synthetic */ MediaPlayerManagerModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MediaPlayer mediaPlayer, MediaPlayerManagerModule mediaPlayerManagerModule, double d10, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mediaPlayer = mediaPlayer;
            this.this$0 = mediaPlayerManagerModule;
            this.$portal = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$mediaPlayer, this.this$0, this.$portal, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            d.d();
            if (this.label == 0) {
                t.b(obj);
                if (this.$mediaPlayer.isPlaying()) {
                    this.this$0.onMediaPlayerProgress(this.$portal, this.$mediaPlayer.currentPositionMs(), this.$mediaPlayer.durationMs());
                }
                return Unit.f22042a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerManagerModule$startPlayerProgressInterval$1(MediaPlayer mediaPlayer, MediaPlayerManagerModule mediaPlayerManagerModule, double d10, Continuation<? super MediaPlayerManagerModule$startPlayerProgressInterval$1> continuation) {
        super(2, continuation);
        this.$mediaPlayer = mediaPlayer;
        this.this$0 = mediaPlayerManagerModule;
        this.$portal = d10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaPlayerManagerModule$startPlayerProgressInterval$1 mediaPlayerManagerModule$startPlayerProgressInterval$1 = new MediaPlayerManagerModule$startPlayerProgressInterval$1(this.$mediaPlayer, this.this$0, this.$portal, continuation);
        mediaPlayerManagerModule$startPlayerProgressInterval$1.L$0 = obj;
        return mediaPlayerManagerModule$startPlayerProgressInterval$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaPlayerManagerModule$startPlayerProgressInterval$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005d -> B:12:0x0031). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = tf.b.d()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r1 = r12.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            nf.t.b(r13)
            r13 = r1
            goto L_0x0030
        L_0x0017:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001f:
            java.lang.Object r1 = r12.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            nf.t.b(r13)
            r13 = r1
            r1 = r12
            goto L_0x0053
        L_0x0029:
            nf.t.b(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
        L_0x0030:
            r1 = r12
        L_0x0031:
            boolean r4 = kotlinx.coroutines.k0.h(r13)
            if (r4 == 0) goto L_0x0060
            kotlinx.coroutines.f2 r4 = kotlinx.coroutines.y0.c()
            com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1 r11 = new com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1$1
            com.discord.media_player.MediaPlayer r6 = r1.$mediaPlayer
            com.discord.media_player.MediaPlayerManagerModule r7 = r1.this$0
            double r8 = r1.$portal
            r10 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r10)
            r1.L$0 = r13
            r1.label = r3
            java.lang.Object r4 = kotlinx.coroutines.j.g(r4, r11, r1)
            if (r4 != r0) goto L_0x0053
            return r0
        L_0x0053:
            r1.L$0 = r13
            r1.label = r2
            r4 = 100
            java.lang.Object r4 = kotlinx.coroutines.t0.a(r4, r1)
            if (r4 != r0) goto L_0x0031
            return r0
        L_0x0060:
            kotlin.Unit r13 = kotlin.Unit.f22042a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}