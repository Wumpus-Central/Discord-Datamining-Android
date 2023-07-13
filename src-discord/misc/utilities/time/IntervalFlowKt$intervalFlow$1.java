package com.discord.misc.utilities.time;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$1", f = "IntervalFlow.kt", l = {14, 16, 17}, m = "invokeSuspend")

final class IntervalFlowKt$intervalFlow$1 extends k implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    final  long $initialDelay;
    final  long $period;
    private  Object L$0;
    int label;

    
    
    public IntervalFlowKt$intervalFlow$1(long j10, long j11, Continuation<? super IntervalFlowKt$intervalFlow$1> continuation) {
        super(2, continuation);
        this.$initialDelay = j10;
        this.$period = j11;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IntervalFlowKt$intervalFlow$1 intervalFlowKt$intervalFlow$1 = new IntervalFlowKt$intervalFlow$1(this.$initialDelay, this.$period, continuation);
        intervalFlowKt$intervalFlow$1.L$0 = obj;
        return intervalFlowKt$intervalFlow$1;
    }

    public final Object invoke(FlowCollector<? super Unit> flowCollector, Continuation<? super Unit> continuation) {
        return ((IntervalFlowKt$intervalFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.f20663a);
    }

    
    
    
    
    @Override 
    
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
