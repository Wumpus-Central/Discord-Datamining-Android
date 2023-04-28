package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C10210t0;
import kotlinx.coroutines.CoroutineScope;
import nf.C11093t;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1$1$1", m14701f = "AudioWaveView.kt", m14700l = {136}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AudioWaveView$finishAnimation$1$1$1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioWaveView$finishAnimation$1$1$1(Continuation<? super AudioWaveView$finishAnimation$1$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioWaveView$finishAnimation$1$1$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioWaveView$finishAnimation$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = C13080d.m4646d();
        int i = this.label;
        if (i == 0) {
            C11093t.m10930b(obj);
            this.label = 1;
            if (C10210t0.m13992a(50L, this) == d) {
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
