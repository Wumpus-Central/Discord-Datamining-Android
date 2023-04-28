package com.discord.misc.utilities.backoff;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9926t0;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.misc.utilities.backoff.ExponentialBackoff$fail$1", m14701f = "ExponentialBackoff.kt", m14700l = {38, 39}, m14699m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExponentialBackoff$fail$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $action;
    int label;
    final /* synthetic */ ExponentialBackoff this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExponentialBackoff$fail$1(ExponentialBackoff exponentialBackoff, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super ExponentialBackoff$fail$1> continuation) {
        super(2, continuation);
        this.this$0 = exponentialBackoff;
        this.$action = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExponentialBackoff$fail$1(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExponentialBackoff$fail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        long j;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            j = this.this$0.currentDelay;
            this.label = 1;
            if (C9926t0.m13992a(j, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C10848t.m10930b(obj);
        } else if (i == 2) {
            C10848t.m10930b(obj);
            return Unit.f25780a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Function1<Continuation<? super Unit>, Object> function1 = this.$action;
        this.label = 2;
        if (function1.invoke(this) == d) {
            return d;
        }
        return Unit.f25780a;
    }
}
