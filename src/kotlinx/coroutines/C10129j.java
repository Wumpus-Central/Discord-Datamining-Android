package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(m15074d1 = {"kotlinx/coroutines/k", "kotlinx/coroutines/l"}, m15073d2 = {}, m15072k = 4, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.j */
/* loaded from: classes8.dex */
public final class C10129j {
    /* renamed from: a */
    public static final <T> AbstractC10161q0<T> m14198a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC10140l0 l0Var, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return C10139l.m14177a(coroutineScope, coroutineContext, l0Var, function2);
    }

    /* renamed from: c */
    public static final Job m14196c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC10140l0 l0Var, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C10139l.m14175c(coroutineScope, coroutineContext, l0Var, function2);
    }

    /* renamed from: d */
    public static /* synthetic */ Job m14195d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC10140l0 l0Var, Function2 function2, int i, Object obj) {
        return C10139l.m14174d(coroutineScope, coroutineContext, l0Var, function2, i, obj);
    }

    /* renamed from: e */
    public static final <T> T m14194e(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return (T) C10134k.m14189a(coroutineContext, function2);
    }

    /* renamed from: g */
    public static final <T> Object m14192g(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return C10139l.m14173e(coroutineContext, function2, continuation);
    }
}
