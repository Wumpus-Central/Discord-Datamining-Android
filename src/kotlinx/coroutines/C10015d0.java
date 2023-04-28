package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\u000b\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m15073d2 = {"T", "Lnf/s;", "Lkotlin/Function1;", "", "", "onCancellation", "", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuation;", "caller", "c", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/Continuation;", "uCont", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.d0 */
/* loaded from: classes8.dex */
public final class C10015d0 {
    /* renamed from: a */
    public static final <T> Object m14487a(Object obj, Continuation<? super T> continuation) {
        if (!(obj instanceof C10234z)) {
            return C11090s.m10940b(obj);
        }
        C11090s.C11091a aVar = C11090s.f24606l;
        return C11090s.m10940b(C11093t.m10931a(((C10234z) obj).f22488a));
    }

    /* renamed from: b */
    public static final <T> Object m14486b(Object obj, Function1<? super Throwable, Unit> function1) {
        Throwable e = C11090s.m10937e(obj);
        if (e != null) {
            return new C10234z(e, false, 2, null);
        }
        if (function1 != null) {
            return new C9999a0(obj, function1);
        }
        return obj;
    }

    /* renamed from: c */
    public static final <T> Object m14485c(Object obj, CancellableContinuation<?> cancellableContinuation) {
        Throwable e = C11090s.m10937e(obj);
        if (e == null) {
            return obj;
        }
        return new C10234z(e, false, 2, null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m14484d(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return m14486b(obj, function1);
    }
}
