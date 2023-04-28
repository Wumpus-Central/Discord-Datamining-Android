package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9840j;
import kotlinx.coroutines.C9946y0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1", m14701f = "AudioWaveView.kt", m14700l = {153}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AudioWaveView$recalculateSampleData$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $numChunks;
    final /* synthetic */ byte[] $originalSampleData;
    Object L$0;
    int label;
    final /* synthetic */ AudioWaveView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9636e(m14702c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1$1", m14701f = "AudioWaveView.kt", m14700l = {}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1$1 */
    /* loaded from: classes4.dex */
    public static final class C32831 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        final /* synthetic */ int $numChunks;
        final /* synthetic */ byte[] $originalSampleData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32831(byte[] bArr, int i, Continuation<? super C32831> continuation) {
            super(2, continuation);
            this.$originalSampleData = bArr;
            this.$numChunks = i;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32831(this.$originalSampleData, this.$numChunks, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((C32831) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Object invokeSuspend(Object obj) {
            C12962d.m4646d();
            if (this.label == 0) {
                C10848t.m10930b(obj);
                return Sampler.INSTANCE.downSample(this.$originalSampleData, this.$numChunks);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioWaveView$recalculateSampleData$1(AudioWaveView audioWaveView, byte[] bArr, int i, Continuation<? super AudioWaveView$recalculateSampleData$1> continuation) {
        super(2, continuation);
        this.this$0 = audioWaveView;
        this.$originalSampleData = bArr;
        this.$numChunks = i;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioWaveView$recalculateSampleData$1(this.this$0, this.$originalSampleData, this.$numChunks, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioWaveView$recalculateSampleData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        AudioWaveView audioWaveView;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            AudioWaveView audioWaveView2 = this.this$0;
            CoroutineDispatcher a = C9946y0.m13947a();
            C32831 r3 = new C32831(this.$originalSampleData, this.$numChunks, null);
            this.L$0 = audioWaveView2;
            this.label = 1;
            Object g = C9840j.m14192g(a, r3, this);
            if (g == d) {
                return d;
            }
            audioWaveView = audioWaveView2;
            obj = g;
        } else if (i == 1) {
            audioWaveView = (AudioWaveView) this.L$0;
            C10848t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        audioWaveView.setDownSampleData((byte[]) obj);
        this.this$0.invalidate();
        return Unit.f25780a;
    }
}
