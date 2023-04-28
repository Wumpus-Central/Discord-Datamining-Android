package vi;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9964l0;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.C10095h0;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a]\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m15073d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "d", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: vi.e */
/* loaded from: classes8.dex */
public final class C13517e {
    /* renamed from: a */
    public static final /* synthetic */ FlowCollector m3495a(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        return m3492d(flowCollector, coroutineContext);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: b */
    public static final <T, V> Object m3494b(CoroutineContext coroutineContext, V v, Object obj, Function2<? super V, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object d;
        Object c = C10095h0.m14301c(coroutineContext, obj);
        try {
            Object invoke = ((Function2) C9964l0.m14653d(function2, 2)).invoke(v, new C13536r(continuation, coroutineContext));
            C10095h0.m14303a(coroutineContext, c);
            d = C13080d.m4646d();
            if (invoke == d) {
                C9933g.m14691c(continuation);
            }
            return invoke;
        } catch (Throwable th2) {
            C10095h0.m14303a(coroutineContext, c);
            throw th2;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m3493c(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = C10095h0.m14302b(coroutineContext);
        }
        return m3494b(coroutineContext, obj, obj2, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final <T> FlowCollector<T> m3492d(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        if (flowCollector instanceof C13535q) {
            return flowCollector;
        }
        return new C13537s(flowCollector, coroutineContext);
    }
}
