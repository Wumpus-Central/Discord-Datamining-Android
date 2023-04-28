package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9840j;
import kotlinx.coroutines.C9926t0;
import kotlinx.coroutines.C9946y0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$2", m14701f = "AudioPlayerView.kt", m14700l = {487}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AudioPlayerView$reset$2 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9636e(m14702c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$2$1", m14701f = "AudioPlayerView.kt", m14700l = {488}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$reset$2$1 */
    /* loaded from: classes4.dex */
    public static final class C32801 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C32801(Continuation<? super C32801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32801(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32801) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C12962d.m4646d();
            int i = this.label;
            if (i == 0) {
                C10848t.m10930b(obj);
                this.label = 1;
                if (C9926t0.m13992a(500L, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C10848t.m10930b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f25780a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$reset$2(AudioPlayerView audioPlayerView, Continuation<? super AudioPlayerView$reset$2> continuation) {
        super(2, continuation);
        this.this$0 = audioPlayerView;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioPlayerView$reset$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioPlayerView$reset$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        AudioPlayerViewState audioPlayerViewState;
        AudioPlayerViewState audioPlayerViewState2;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            CoroutineDispatcher a = C9946y0.m13947a();
            C32801 r1 = new C32801(null);
            this.label = 1;
            if (C9840j.m14192g(a, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C10848t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.wasPlayingBeforeBeingPaused = false;
        AudioPlayerView audioPlayerView = this.this$0;
        audioPlayerViewState = audioPlayerView.state;
        audioPlayerView.configurePlayButton(audioPlayerViewState);
        AudioPlayerView audioPlayerView2 = this.this$0;
        audioPlayerViewState2 = audioPlayerView2.state;
        audioPlayerView2.configureAudioWave(audioPlayerViewState2);
        this.this$0.getBinding().wave.reset();
        return Unit.f25780a;
    }
}
