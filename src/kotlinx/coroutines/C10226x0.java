package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C10092g;
import kotlinx.coroutines.internal.C10095h0;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\"\u0018\u0010\u000e\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0010\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, m15073d2 = {"T", "Lkotlinx/coroutines/w0;", "", "mode", "", "a", "Lkotlin/coroutines/Continuation;", "delegate", "", "undispatched", "d", "e", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.x0 */
/* loaded from: classes8.dex */
public final class C10226x0 {
    /* renamed from: a */
    public static final <T> void m13965a(AbstractC10222w0<? super T> w0Var, int i) {
        boolean z;
        Continuation<? super T> c = w0Var.mo13976c();
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z || !(c instanceof C10092g) || m13964b(i) != m13964b(w0Var.f22472m)) {
            m13962d(w0Var, c, z);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((C10092g) c).f22280n;
        CoroutineContext context = c.getContext();
        if (coroutineDispatcher.mo4545I0(context)) {
            coroutineDispatcher.mo4546G0(context, w0Var);
        } else {
            m13961e(w0Var);
        }
    }

    /* renamed from: b */
    public static final boolean m13964b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m13963c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m13962d(AbstractC10222w0<? super T> w0Var, Continuation<? super T> continuation, boolean z) {
        Object obj;
        C10224w2<?> w2Var;
        Object h = w0Var.mo13972h();
        Throwable d = w0Var.mo13975d(h);
        if (d != null) {
            C11090s.C11091a aVar = C11090s.f24606l;
            obj = C11093t.m10931a(d);
        } else {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj = w0Var.mo13974e(h);
        }
        Object b = C11090s.m10940b(obj);
        if (z) {
            C10092g gVar = (C10092g) continuation;
            Continuation<T> continuation2 = gVar.f22281o;
            Object obj2 = gVar.f22283q;
            CoroutineContext context = continuation2.getContext();
            Object c = C10095h0.m14301c(context, obj2);
            if (c != C10095h0.f22286a) {
                w2Var = C10025f0.m14456g(continuation2, context, c);
            } else {
                w2Var = null;
            }
            try {
                gVar.f22281o.resumeWith(b);
                Unit unit = Unit.f22042a;
            } finally {
                if (w2Var == null || w2Var.m13967V0()) {
                    C10095h0.m14303a(context, c);
                }
            }
        } else {
            continuation.resumeWith(b);
        }
    }

    /* renamed from: e */
    private static final void m13961e(AbstractC10222w0<?> w0Var) {
        AbstractC10022e1 b = C10167r2.f22370a.m14102b();
        if (b.m14468R0()) {
            b.m14471N0(w0Var);
            return;
        }
        b.m14470P0(true);
        try {
            m13962d(w0Var, w0Var.mo13976c(), true);
            do {
            } while (b.m14466U0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
