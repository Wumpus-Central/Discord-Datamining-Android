package kotlinx.coroutines;

import eg.C6884j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9933g;
import p339sf.AbstractC12889d;
import si.C12905a;
import tf.C13076c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0019\u0010\b\u001a\u00020\u0000*\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m15073d2 = {"", "timeMillis", "", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsi/a;", "duration", "b", "d", "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/s0;", "c", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/s0;", "delay", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.t0 */
/* loaded from: classes8.dex */
public final class C10210t0 {
    /* renamed from: a */
    public static final Object m13992a(long j, Continuation<? super Unit> continuation) {
        Continuation c;
        Object d;
        Object d2;
        if (j <= 0) {
            return Unit.f22042a;
        }
        c = C13076c.m4647c(continuation);
        C10156p pVar = new C10156p(c, 1);
        pVar.m14150C();
        if (j < Long.MAX_VALUE) {
            m13990c(pVar.getContext()).mo4538t(j, pVar);
        }
        Object y = pVar.m14117y();
        d = C13080d.m4646d();
        if (y == d) {
            C9933g.m14691c(continuation);
        }
        d2 = C13080d.m4646d();
        if (y == d2) {
            return y;
        }
        return Unit.f22042a;
    }

    /* renamed from: b */
    public static final Object m13991b(long j, Continuation<? super Unit> continuation) {
        Object d;
        Object a = m13992a(m13989d(j), continuation);
        d = C13080d.m4646d();
        return a == d ? a : Unit.f22042a;
    }

    /* renamed from: c */
    public static final AbstractC10169s0 m13990c(CoroutineContext coroutineContext) {
        CoroutineContext.AbstractC9924b i = coroutineContext.mo3484i(AbstractC12889d.f28964h);
        AbstractC10169s0 s0Var = i instanceof AbstractC10169s0 ? (AbstractC10169s0) i : null;
        return s0Var == null ? C10157p0.m14115a() : s0Var;
    }

    /* renamed from: d */
    public static final long m13989d(long j) {
        long d;
        if (C12905a.m5131g(j, C12905a.f28981l.m5111b()) <= 0) {
            return 0L;
        }
        d = C6884j.m23960d(C12905a.m5124n(j), 1L);
        return d;
    }
}
