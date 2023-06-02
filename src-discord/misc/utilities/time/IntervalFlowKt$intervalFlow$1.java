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
/* loaded from: classes8.dex */
final class IntervalFlowKt$intervalFlow$1 extends k implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $initialDelay;
    final /* synthetic */ long $period;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntervalFlowKt$intervalFlow$1(long j10, long j11, Continuation<? super IntervalFlowKt$intervalFlow$1> continuation) {
        super(2, continuation);
        this.$initialDelay = j10;
        this.$period = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IntervalFlowKt$intervalFlow$1 intervalFlowKt$intervalFlow$1 = new IntervalFlowKt$intervalFlow$1(this.$initialDelay, this.$period, continuation);
        intervalFlowKt$intervalFlow$1.L$0 = obj;
        return intervalFlowKt$intervalFlow$1;
    }

    public final Object invoke(FlowCollector<? super Unit> flowCollector, Continuation<? super Unit> continuation) {
        return ((IntervalFlowKt$intervalFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.f22080a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:15:0x0040). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = pg.b.d()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r4) goto L_0x0011
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
        L_0x0011:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            jg.t.b(r8)
            goto L_0x003f
        L_0x0019:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0021:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            jg.t.b(r8)
            r8 = r7
            goto L_0x004d
        L_0x002a:
            jg.t.b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            long r5 = r7.$initialDelay
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.t0.b(r5, r7)
            if (r8 != r0) goto L_0x003f
            return r0
        L_0x003f:
            r8 = r7
        L_0x0040:
            kotlin.Unit r4 = kotlin.Unit.f22080a
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r4 = r1.emit(r4, r8)
            if (r4 != r0) goto L_0x004d
            return r0
        L_0x004d:
            long r4 = r8.$period
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r4 = kotlinx.coroutines.t0.b(r4, r8)
            if (r4 != r0) goto L_0x0040
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
