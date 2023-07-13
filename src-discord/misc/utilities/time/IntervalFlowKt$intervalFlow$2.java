package com.discord.misc.utilities.time;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$2", f = "IntervalFlow.kt", l = {26, 28, 29}, m = "invokeSuspend")

final class IntervalFlowKt$intervalFlow$2 extends k implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    final  long $initialDelayMs;
    final  long $periodMs;
    private  Object L$0;
    int label;

    
    
    public IntervalFlowKt$intervalFlow$2(long j10, long j11, Continuation<? super IntervalFlowKt$intervalFlow$2> continuation) {
        super(2, continuation);
        this.$initialDelayMs = j10;
        this.$periodMs = j11;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IntervalFlowKt$intervalFlow$2 intervalFlowKt$intervalFlow$2 = new IntervalFlowKt$intervalFlow$2(this.$initialDelayMs, this.$periodMs, continuation);
        intervalFlowKt$intervalFlow$2.L$0 = obj;
        return intervalFlowKt$intervalFlow$2;
    }

    public final Object invoke(FlowCollector<? super Unit> flowCollector, Continuation<? super Unit> continuation) {
        return ((IntervalFlowKt$intervalFlow$2) create(flowCollector, continuation)).invokeSuspend(Unit.f20663a);
    }

    
    
    
    
    @Override 
    
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
