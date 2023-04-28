package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import p372ui.AbstractC13358t;

@Metadata(m15074d1 = {"kotlinx/coroutines/flow/e", "kotlinx/coroutines/flow/f", "kotlinx/coroutines/flow/g", "kotlinx/coroutines/flow/h", "kotlinx/coroutines/flow/i"}, m15073d2 = {}, m15072k = 4, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.d */
/* loaded from: classes8.dex */
public final class C10039d {
    /* renamed from: a */
    public static final <T> Flow<T> m14432a(Function2<? super ProducerScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C10040e.m14426a(function2);
    }

    /* renamed from: b */
    public static final <T> Flow<T> m14431b(Flow<? extends T> flow, long j) {
        return C10044h.m14419a(flow, j);
    }

    /* renamed from: c */
    public static final <T> Object m14430c(FlowCollector<? super T> flowCollector, AbstractC13358t<? extends T> tVar, Continuation<? super Unit> continuation) {
        return C10041f.m14423b(flowCollector, tVar, continuation);
    }

    /* renamed from: d */
    public static final void m14429d(FlowCollector<?> flowCollector) {
        C10050i.m14414a(flowCollector);
    }

    /* renamed from: e */
    public static final <T> Flow<T> m14428e(Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C10040e.m14425b(function2);
    }

    /* renamed from: f */
    public static final <T> Flow<T> m14427f(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return C10043g.m14420b(flow, coroutineContext);
    }
}
