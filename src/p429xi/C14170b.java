package p429xi;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9964l0;
import kotlinx.coroutines.C10013c2;
import kotlinx.coroutines.C10172s2;
import kotlinx.coroutines.C10234z;
import kotlinx.coroutines.internal.C10083b0;
import kotlinx.coroutines.internal.C10095h0;
import nf.C11090s;
import nf.C11093t;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aT\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aT\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u001aV\u0010\u0010\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\n\u001a\u00028\u00012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aV\u0010\u0012\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\n\u001a\u00028\u00012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m15073d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "", "b", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "c", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "a", "Lkotlinx/coroutines/internal/b0;", "block", "d", "(Lkotlinx/coroutines/internal/b0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "e", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: xi.b */
/* loaded from: classes8.dex */
public final class C14170b {
    /* renamed from: a */
    public static final <R, T> void m1466a(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        Object d;
        Continuation a = C9933g.m14693a(continuation);
        try {
            CoroutineContext context = continuation.getContext();
            Object c = C10095h0.m14301c(context, null);
            Object invoke = ((Function2) C9964l0.m14653d(function2, 2)).invoke(r, a);
            C10095h0.m14303a(context, c);
            d = C13080d.m4646d();
            if (invoke != d) {
                a.resumeWith(C11090s.m10940b(invoke));
            }
        } catch (Throwable th2) {
            C11090s.C11091a aVar = C11090s.f24606l;
            a.resumeWith(C11090s.m10940b(C11093t.m10931a(th2)));
        }
    }

    /* renamed from: b */
    public static final <T> void m1465b(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        Object d;
        Continuation a = C9933g.m14693a(continuation);
        try {
            Object invoke = ((Function1) C9964l0.m14653d(function1, 1)).invoke(a);
            d = C13080d.m4646d();
            if (invoke != d) {
                a.resumeWith(C11090s.m10940b(invoke));
            }
        } catch (Throwable th2) {
            C11090s.C11091a aVar = C11090s.f24606l;
            a.resumeWith(C11090s.m10940b(C11093t.m10931a(th2)));
        }
    }

    /* renamed from: c */
    public static final <R, T> void m1464c(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        Object d;
        Continuation a = C9933g.m14693a(continuation);
        try {
            Object invoke = ((Function2) C9964l0.m14653d(function2, 2)).invoke(r, a);
            d = C13080d.m4646d();
            if (invoke != d) {
                a.resumeWith(C11090s.m10940b(invoke));
            }
        } catch (Throwable th2) {
            C11090s.C11091a aVar = C11090s.f24606l;
            a.resumeWith(C11090s.m10940b(C11093t.m10931a(th2)));
        }
    }

    /* renamed from: d */
    public static final <T, R> Object m1463d(C10083b0<? super T> b0Var, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object obj;
        Object d;
        Object d2;
        Object d3;
        try {
            obj = ((Function2) C9964l0.m14653d(function2, 2)).invoke(r, b0Var);
        } catch (Throwable th2) {
            obj = new C10234z(th2, false, 2, null);
        }
        d = C13080d.m4646d();
        if (obj == d) {
            d3 = C13080d.m4646d();
            return d3;
        }
        Object o0 = b0Var.m14520o0(obj);
        if (o0 == C10013c2.f22142b) {
            d2 = C13080d.m4646d();
            return d2;
        } else if (!(o0 instanceof C10234z)) {
            return C10013c2.m14488h(o0);
        } else {
            throw ((C10234z) o0).f22488a;
        }
    }

    /* renamed from: e */
    public static final <T, R> Object m1462e(C10083b0<? super T> b0Var, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object obj;
        Object d;
        Object d2;
        Object d3;
        boolean z = false;
        try {
            obj = ((Function2) C9964l0.m14653d(function2, 2)).invoke(r, b0Var);
        } catch (Throwable th2) {
            obj = new C10234z(th2, false, 2, null);
        }
        d = C13080d.m4646d();
        if (obj == d) {
            d3 = C13080d.m4646d();
            return d3;
        }
        Object o0 = b0Var.m14520o0(obj);
        if (o0 == C10013c2.f22142b) {
            d2 = C13080d.m4646d();
            return d2;
        }
        if (o0 instanceof C10234z) {
            Throwable th3 = ((C10234z) o0).f22488a;
            if (!(th3 instanceof C10172s2) || ((C10172s2) th3).f22375k != b0Var) {
                z = true;
            }
            if (z) {
                throw th3;
            } else if (obj instanceof C10234z) {
                throw ((C10234z) obj).f22488a;
            }
        } else {
            obj = C10013c2.m14488h(o0);
        }
        return obj;
    }
}
