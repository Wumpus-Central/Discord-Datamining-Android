package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b1;
import kotlinx.coroutines.j;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.v0;
import pf.t;
import vf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2", f = "AudioPlayerView.kt", l = {365}, m = "invokeSuspend")

public final class AudioPlayerView$toggleDurationEmitter$2 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private  Object L$0;
    int label;
    final  AudioPlayerView this$0;

    
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$toggleDurationEmitter$2$1", f = "AudioPlayerView.kt", l = {366}, m = "invokeSuspend")
    
    
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override 
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21601a);
        }

        @Override 
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.label;
            if (i10 == 0) {
                t.b(obj);
                this.label = 1;
                if (v0.a(50L, this) == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f21601a;
        }
    }

    
    
    public AudioPlayerView$toggleDurationEmitter$2(AudioPlayerView audioPlayerView, Continuation<? super AudioPlayerView$toggleDurationEmitter$2> continuation) {
        super(2, continuation);
        this.this$0 = audioPlayerView;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AudioPlayerView$toggleDurationEmitter$2 audioPlayerView$toggleDurationEmitter$2 = new AudioPlayerView$toggleDurationEmitter$2(this.this$0, continuation);
        audioPlayerView$toggleDurationEmitter$2.L$0 = obj;
        return audioPlayerView$toggleDurationEmitter$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioPlayerView$toggleDurationEmitter$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f21601a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        CoroutineScope coroutineScope;
        AudioPlayerViewState audioPlayerViewState;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else if (i10 == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (m0.h(coroutineScope)) {
            audioPlayerViewState = this.this$0.state;
            if (!audioPlayerViewState.shouldEmitDuration$chat_release()) {
                break;
            }
            this.this$0.configureProgress();
            AudioPlayerView.configureDuration$default(this.this$0, null, false, 3, null);
            CoroutineDispatcher a10 = b1.a();
            AnonymousClass1 r42 = new AnonymousClass1(null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (j.g(a10, r42, this) == d10) {
                return d10;
            }
        }
        return Unit.f21601a;
    }
}
