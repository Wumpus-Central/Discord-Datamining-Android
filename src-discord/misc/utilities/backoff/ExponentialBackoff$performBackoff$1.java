package com.discord.misc.utilities.backoff;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.discord.misc.utilities.backoff.ExponentialBackoff", f = "ExponentialBackoff.kt", l = {63, 65, 76, 77}, m = "performBackoff")

public final class ExponentialBackoff$performBackoff$1<T> extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
     Object result;
    final  ExponentialBackoff this$0;

    
    
    public ExponentialBackoff$performBackoff$1(ExponentialBackoff exponentialBackoff, Continuation<? super ExponentialBackoff$performBackoff$1> continuation) {
        super(continuation);
        this.this$0 = exponentialBackoff;
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performBackoff(null, null, this);
    }
}
