package com.discord.misc.utilities.backoff;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.discord.misc.utilities.backoff.ExponentialBackoff", f = "ExponentialBackoff.kt", l = {63, 65, 76, 77}, m = "performBackoff")
/* loaded from: classes7.dex */
public final class ExponentialBackoff$performBackoff$1<T> extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExponentialBackoff this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExponentialBackoff$performBackoff$1(ExponentialBackoff exponentialBackoff, Continuation<? super ExponentialBackoff$performBackoff$1> continuation) {
        super(continuation);
        this.this$0 = exponentialBackoff;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performBackoff(null, null, this);
    }
}
