package p429xi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.C10094h;
import nf.C11090s;
import nf.C11093t;
import tf.C13076c;

@Metadata(m15074d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001al\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u0010\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a\u001c\u0010\u0012\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u000bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m15073d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "", "c", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "", "onCancellation", "d", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;)V", "fatalCompletion", "b", "e", "a", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: xi.a */
/* loaded from: classes8.dex */
public final class C14169a {
    /* renamed from: a */
    private static final void m1471a(Continuation<?> continuation, Throwable th2) {
        C11090s.C11091a aVar = C11090s.f24606l;
        continuation.resumeWith(C11090s.m10940b(C11093t.m10931a(th2)));
        throw th2;
    }

    /* renamed from: b */
    public static final void m1470b(Continuation<? super Unit> continuation, Continuation<?> continuation2) {
        Continuation c;
        try {
            c = C13076c.m4647c(continuation);
            C11090s.C11091a aVar = C11090s.f24606l;
            C10094h.m14305c(c, C11090s.m10940b(Unit.f22042a), null, 2, null);
        } catch (Throwable th2) {
            m1471a(continuation2, th2);
        }
    }

    /* renamed from: c */
    public static final <T> void m1469c(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        Continuation a;
        Continuation c;
        try {
            a = C13076c.m4649a(function1, continuation);
            c = C13076c.m4647c(a);
            C11090s.C11091a aVar = C11090s.f24606l;
            C10094h.m14305c(c, C11090s.m10940b(Unit.f22042a), null, 2, null);
        } catch (Throwable th2) {
            m1471a(continuation, th2);
        }
    }

    /* renamed from: d */
    public static final <R, T> void m1468d(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation, Function1<? super Throwable, Unit> function1) {
        Continuation b;
        Continuation c;
        try {
            b = C13076c.m4648b(function2, r, continuation);
            c = C13076c.m4647c(b);
            C11090s.C11091a aVar = C11090s.f24606l;
            C10094h.m14306b(c, C11090s.m10940b(Unit.f22042a), function1);
        } catch (Throwable th2) {
            m1471a(continuation, th2);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m1467e(Function2 function2, Object obj, Continuation continuation, Function1 function1, int i, Object obj2) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        m1468d(function2, obj, continuation, function1);
    }
}
