package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function2;
import p429xi.C14170b;
import tf.C13080d;

@Metadata(m15074d1 = {"\u00000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\r\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\n\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0010H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m15073d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "c", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "U", "Lkotlinx/coroutines/t2;", "coroutine", "b", "(Lkotlinx/coroutines/t2;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "time", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/s2;", "a", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.u2 */
/* loaded from: classes8.dex */
public final class C10216u2 {
    /* renamed from: a */
    public static final C10172s2 m13987a(long j, Job job) {
        return new C10172s2("Timed out waiting for " + j + " ms", job);
    }

    /* renamed from: b */
    private static final <U, T extends U> Object m13986b(RunnableC10212t2<U, ? super T> t2Var, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        C10227x1.m13954g(t2Var, C10210t0.m13990c(t2Var.f22269m.getContext()).mo4537R(t2Var.f22466n, t2Var, t2Var.getContext()));
        return C14170b.m1462e(t2Var, t2Var, function2);
    }

    /* renamed from: c */
    public static final <T> Object m13985c(long j, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object d;
        if (j > 0) {
            Object b = m13986b(new RunnableC10212t2(j, continuation), function2);
            d = C13080d.m4646d();
            if (b == d) {
                C9933g.m14691c(continuation);
            }
            return b;
        }
        throw new C10172s2("Timed out immediately");
    }
}
