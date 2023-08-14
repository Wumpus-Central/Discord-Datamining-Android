package com.discord.misc.utilities.backoff;

import jf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.v0;
import pf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.misc.utilities.backoff.ExponentialBackoff$fail$1", f = "ExponentialBackoff.kt", l = {38, 39}, m = "invokeSuspend")

public final class ExponentialBackoff$fail$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  Function1<Continuation<? super Unit>, Object> $action;
    int label;
    final  ExponentialBackoff this$0;

    
    
    
    public ExponentialBackoff$fail$1(ExponentialBackoff exponentialBackoff, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super ExponentialBackoff$fail$1> continuation) {
        super(2, continuation);
        this.this$0 = exponentialBackoff;
        this.$action = function1;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExponentialBackoff$fail$1(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExponentialBackoff$fail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21036a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        long j10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            j10 = this.this$0.currentDelay;
            this.label = 1;
            if (v0.a(j10, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else if (i10 == 2) {
            t.b(obj);
            return Unit.f21036a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Function1<Continuation<? super Unit>, Object> function1 = this.$action;
        this.label = 2;
        if (function1.invoke(this) == d10) {
            return d10;
        }
        return Unit.f21036a;
    }
}
