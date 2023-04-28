package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9840j;
import kotlinx.coroutines.C9846k0;
import kotlinx.coroutines.C9926t0;
import kotlinx.coroutines.C9946y0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2", m14701f = "AudioPlayerView.kt", m14700l = {357}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AudioPlayerView$toggleDurationEmitter$2 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9636e(m14702c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2$1", m14701f = "AudioPlayerView.kt", m14700l = {358}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2$1 */
    /* loaded from: classes4.dex */
    public static final class C32811 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C32811(Continuation<? super C32811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32811(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32811) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C12962d.m4646d();
            int i = this.label;
            if (i == 0) {
                C10848t.m10930b(obj);
                this.label = 1;
                if (C9926t0.m13992a(50L, this) == d) {
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
    public AudioPlayerView$toggleDurationEmitter$2(AudioPlayerView audioPlayerView, Continuation<? super AudioPlayerView$toggleDurationEmitter$2> continuation) {
        super(2, continuation);
        this.this$0 = audioPlayerView;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AudioPlayerView$toggleDurationEmitter$2 audioPlayerView$toggleDurationEmitter$2 = new AudioPlayerView$toggleDurationEmitter$2(this.this$0, continuation);
        audioPlayerView$toggleDurationEmitter$2.L$0 = obj;
        return audioPlayerView$toggleDurationEmitter$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioPlayerView$toggleDurationEmitter$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineScope coroutineScope;
        AudioPlayerViewState audioPlayerViewState;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            C10848t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (C9846k0.m14180h(coroutineScope)) {
            audioPlayerViewState = this.this$0.state;
            if (!audioPlayerViewState.shouldEmitDuration$chat_release()) {
                break;
            }
            this.this$0.configureProgress();
            AudioPlayerView.configureDuration$default(this.this$0, null, false, 3, null);
            CoroutineDispatcher a = C9946y0.m13947a();
            C32811 r4 = new C32811(null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (C9840j.m14192g(a, r4, this) == d) {
                return d;
            }
        }
        return Unit.f25780a;
    }
}
