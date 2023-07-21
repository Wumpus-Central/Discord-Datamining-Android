package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import ff.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.l;
import lf.d;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mediaViewAttached", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class AudioPlayerView$attachStateChangeListener$1 extends s implements Function1<Boolean, Unit> {
    final  AudioPlayerView this$0;

    
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$attachStateChangeListener$1$1", f = "AudioPlayerView.kt", l = {93}, m = "invokeSuspend")
    
    
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final  AudioPlayerView this$0;

        
        AnonymousClass1(AudioPlayerView audioPlayerView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = audioPlayerView;
        }

        @Override 
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20664a);
        }

        @Override 
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.label;
            if (i10 == 0) {
                t.b(obj);
                Flow<AudioPlayerManager.AudioSource> currentPlayerSourceFlow = AudioPlayerManager.INSTANCE.getCurrentPlayerSourceFlow();
                final AudioPlayerView audioPlayerView = this.this$0;
                FlowCollector<? super AudioPlayerManager.AudioSource> flowCollector = new FlowCollector() { 
                    @Override 
                    public   Object emit(Object obj2, Continuation continuation) {
                        return emit((AudioPlayerManager.AudioSource) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(AudioPlayerManager.AudioSource audioSource, Continuation<? super Unit> continuation) {
                        AudioPlayerViewState audioPlayerViewState;
                        AudioPlayerViewState audioPlayerViewState2;
                        AudioPlayerViewState audioPlayerViewState3;
                        audioPlayerViewState = AudioPlayerView.this.state;
                        if (!q.b(audioSource, audioPlayerViewState.getAudioSource())) {
                            AudioPlayerView audioPlayerView2 = AudioPlayerView.this;
                            audioPlayerViewState2 = audioPlayerView2.state;
                            audioPlayerView2.configurePlayButton(audioPlayerViewState2);
                            AudioPlayerView audioPlayerView3 = AudioPlayerView.this;
                            audioPlayerViewState3 = audioPlayerView3.state;
                            audioPlayerView3.toggleDurationEmitter(audioPlayerViewState3.shouldEmitDuration$chat_release());
                        }
                        return Unit.f20664a;
                    }
                };
                this.label = 1;
                if (currentPlayerSourceFlow.collect(flowCollector, this) == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f20664a;
        }
    }

    
    
    public AudioPlayerView$attachStateChangeListener$1(AudioPlayerView audioPlayerView) {
        super(1);
        this.this$0 = audioPlayerView;
    }

    @Override 
    public   Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f20664a;
    }

    public final void invoke(boolean z10) {
        Job job;
        AudioPlayerViewState audioPlayerViewState;
        Job d10;
        job = this.this$0.playerJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        if (z10) {
            AudioPlayerView audioPlayerView = this.this$0;
            d10 = l.d(CoroutineViewUtilsKt.getAttachedScope(audioPlayerView), null, null, new AnonymousClass1(this.this$0, null), 3, null);
            audioPlayerView.playerJob = d10;
        }
        AudioPlayerView audioPlayerView2 = this.this$0;
        audioPlayerViewState = audioPlayerView2.state;
        AudioPlayerView.setState$default(audioPlayerView2, AudioPlayerViewState.m325copyP6IPuNM$default(audioPlayerViewState, null, null, z10, 3, null), false, 2, null);
    }
}
