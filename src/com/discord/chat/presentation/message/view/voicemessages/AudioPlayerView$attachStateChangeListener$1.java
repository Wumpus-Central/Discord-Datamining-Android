package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10139l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C11093t;
import tf.C13080d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "mediaViewAttached", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class AudioPlayerView$attachStateChangeListener$1 extends AbstractC9973s implements Function1<Boolean, Unit> {
    final /* synthetic */ AudioPlayerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$attachStateChangeListener$1$1", m14701f = "AudioPlayerView.kt", m14700l = {85}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView$attachStateChangeListener$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudioPlayerView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AudioPlayerView audioPlayerView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = audioPlayerView;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C13080d.m4646d();
            int i = this.label;
            if (i == 0) {
                C11093t.m10930b(obj);
                Flow<AudioPlayerManager.AudioSource> currentPlayerSourceFlow = AudioPlayerManager.INSTANCE.getCurrentPlayerSourceFlow();
                final AudioPlayerView audioPlayerView = this.this$0;
                FlowCollector<? super AudioPlayerManager.AudioSource> flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.attachStateChangeListener.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AudioPlayerManager.AudioSource) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(AudioPlayerManager.AudioSource audioSource, Continuation<? super Unit> continuation) {
                        AudioPlayerViewState audioPlayerViewState;
                        AudioPlayerViewState audioPlayerViewState2;
                        AudioPlayerViewState audioPlayerViewState3;
                        audioPlayerViewState = AudioPlayerView.this.state;
                        if (!C9971q.m14638b(audioSource, audioPlayerViewState.getAudioSource())) {
                            AudioPlayerView audioPlayerView2 = AudioPlayerView.this;
                            audioPlayerViewState2 = audioPlayerView2.state;
                            audioPlayerView2.configurePlayButton(audioPlayerViewState2);
                            AudioPlayerView audioPlayerView3 = AudioPlayerView.this;
                            audioPlayerViewState3 = audioPlayerView3.state;
                            audioPlayerView3.toggleDurationEmitter(audioPlayerViewState3.shouldEmitDuration$chat_release());
                        }
                        return Unit.f22042a;
                    }
                };
                this.label = 1;
                if (currentPlayerSourceFlow.collect(flowCollector, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C11093t.m10930b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f22042a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerView$attachStateChangeListener$1(AudioPlayerView audioPlayerView) {
        super(1);
        this.this$0 = audioPlayerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f22042a;
    }

    public final void invoke(boolean z) {
        Job job;
        AudioPlayerViewState audioPlayerViewState;
        Job d;
        job = this.this$0.playerJob;
        if (job != null) {
            Job.C9996a.m14571a(job, null, 1, null);
        }
        if (z) {
            AudioPlayerView audioPlayerView = this.this$0;
            d = C10139l.m14174d(CoroutineViewUtilsKt.getAttachedScope(audioPlayerView), null, null, new AnonymousClass1(this.this$0, null), 3, null);
            audioPlayerView.playerJob = d;
        }
        AudioPlayerView audioPlayerView2 = this.this$0;
        audioPlayerViewState = audioPlayerView2.state;
        AudioPlayerView.setState$default(audioPlayerView2, AudioPlayerViewState.m41874copyP6IPuNM$default(audioPlayerViewState, null, null, z, 3, null), false, 2, null);
    }
}
