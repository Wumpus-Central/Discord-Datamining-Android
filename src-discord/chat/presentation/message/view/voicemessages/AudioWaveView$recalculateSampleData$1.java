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
import pf.t;
import vf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1", f = "AudioWaveView.kt", l = {153}, m = "invokeSuspend")

public final class AudioWaveView$recalculateSampleData$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  int $numChunks;
    final  byte[] $originalSampleData;
    Object L$0;
    int label;
    final  AudioWaveView this$0;

    
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1$1", f = "AudioWaveView.kt", l = {}, m = "invokeSuspend")
    
    
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        final  int $numChunks;
        final  byte[] $originalSampleData;
        int label;

        
        AnonymousClass1(byte[] bArr, int i10, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$originalSampleData = bArr;
            this.$numChunks = i10;
        }

        @Override 
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$originalSampleData, this.$numChunks, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21601a);
        }

        @Override 
        public final Object invokeSuspend(Object obj) {
            d.d();
            if (this.label == 0) {
                t.b(obj);
                return Sampler.INSTANCE.downSample(this.$originalSampleData, this.$numChunks);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    
    
    public AudioWaveView$recalculateSampleData$1(AudioWaveView audioWaveView, byte[] bArr, int i10, Continuation<? super AudioWaveView$recalculateSampleData$1> continuation) {
        super(2, continuation);
        this.this$0 = audioWaveView;
        this.$originalSampleData = bArr;
        this.$numChunks = i10;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioWaveView$recalculateSampleData$1(this.this$0, this.$originalSampleData, this.$numChunks, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioWaveView$recalculateSampleData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21601a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        AudioWaveView audioWaveView;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            AudioWaveView audioWaveView2 = this.this$0;
            CoroutineDispatcher a10 = b1.a();
            AnonymousClass1 r32 = new AnonymousClass1(this.$originalSampleData, this.$numChunks, null);
            this.L$0 = audioWaveView2;
            this.label = 1;
            Object g10 = j.g(a10, r32, this);
            if (g10 == d10) {
                return d10;
            }
            audioWaveView = audioWaveView2;
            obj = g10;
        } else if (i10 == 1) {
            audioWaveView = (AudioWaveView) this.L$0;
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        audioWaveView.setDownSampleData((byte[]) obj);
        this.this$0.invalidate();
        return Unit.f21601a;
    }
}
