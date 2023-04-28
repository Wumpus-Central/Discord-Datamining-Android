package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractC10022e1;
import kotlinx.coroutines.C10015d0;
import kotlinx.coroutines.C10025f0;
import kotlinx.coroutines.C10167r2;
import kotlinx.coroutines.C10224w2;
import kotlinx.coroutines.Job;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aH\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0012\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u0012\u0004\b\u0013\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m15073d2 = {"T", "Lkotlin/coroutines/Continuation;", "Lnf/s;", "result", "Lkotlin/Function1;", "", "", "onCancellation", "b", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/g;", "", "d", "Lkotlinx/coroutines/internal/d0;", "a", "Lkotlinx/coroutines/internal/d0;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.h */
/* loaded from: classes8.dex */
public final class C10094h {

    /* renamed from: a */
    private static final C10087d0 f22284a = new C10087d0("UNDEFINED");

    /* renamed from: b */
    public static final C10087d0 f22285b = new C10087d0("REUSABLE_CLAIMED");

    /* renamed from: a */
    public static final /* synthetic */ C10087d0 m14307a() {
        return f22284a;
    }

    /* renamed from: b */
    public static final <T> void m14306b(Continuation<? super T> continuation, Object obj, Function1<? super Throwable, Unit> function1) {
        boolean z;
        C10224w2<?> w2Var;
        if (continuation instanceof C10092g) {
            C10092g gVar = (C10092g) continuation;
            Object b = C10015d0.m14486b(obj, function1);
            if (gVar.f22280n.mo4545I0(gVar.getContext())) {
                gVar.f22282p = b;
                gVar.f22472m = 1;
                gVar.f22280n.mo4546G0(gVar.getContext(), gVar);
                return;
            }
            AbstractC10022e1 b2 = C10167r2.f22370a.m14102b();
            if (b2.m14468R0()) {
                gVar.f22282p = b;
                gVar.f22472m = 1;
                b2.m14471N0(gVar);
                return;
            }
            b2.m14470P0(true);
            try {
                Job job = (Job) gVar.getContext().mo3484i(Job.f22120e);
                if (job == null || job.mo3873b()) {
                    z = false;
                } else {
                    CancellationException C = job.mo14559C();
                    gVar.mo13977a(b, C);
                    C11090s.C11091a aVar = C11090s.f24606l;
                    gVar.resumeWith(C11090s.m10940b(C11093t.m10931a(C)));
                    z = true;
                }
                if (!z) {
                    Continuation<T> continuation2 = gVar.f22281o;
                    Object obj2 = gVar.f22283q;
                    CoroutineContext context = continuation2.getContext();
                    Object c = C10095h0.m14301c(context, obj2);
                    if (c != C10095h0.f22286a) {
                        w2Var = C10025f0.m14456g(continuation2, context, c);
                    } else {
                        w2Var = null;
                    }
                    gVar.f22281o.resumeWith(obj);
                    Unit unit = Unit.f22042a;
                    if (w2Var == null || w2Var.m13967V0()) {
                        C10095h0.m14303a(context, c);
                    }
                }
                do {
                } while (b2.m14466U0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        continuation.resumeWith(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m14305c(Continuation continuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        m14306b(continuation, obj, function1);
    }

    /* renamed from: d */
    public static final boolean m14304d(C10092g<? super Unit> gVar) {
        Unit unit = Unit.f22042a;
        AbstractC10022e1 b = C10167r2.f22370a.m14102b();
        if (b.m14467S0()) {
            return false;
        }
        if (b.m14468R0()) {
            gVar.f22282p = unit;
            gVar.f22472m = 1;
            b.m14471N0(gVar);
            return true;
        }
        b.m14470P0(true);
        try {
            gVar.run();
            do {
            } while (b.m14466U0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
