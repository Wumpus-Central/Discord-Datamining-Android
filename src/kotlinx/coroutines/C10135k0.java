package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.C10083b0;
import kotlinx.coroutines.internal.C10090f;
import p429xi.C14170b;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aJ\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u001a\u001e\u0010\u0015\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0014\"\u001b\u0010\u001b\u001a\u00020\u0016*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "i", "b", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "g", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "d", "", "message", "", "c", "", "h", "(Lkotlinx/coroutines/CoroutineScope;)Z", "isActive$annotations", "(Lkotlinx/coroutines/CoroutineScope;)V", "isActive", "kotlinx-coroutines-core"}, m15072k = 2, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.k0 */
/* loaded from: classes8.dex */
public final class C10135k0 {
    /* renamed from: a */
    public static final CoroutineScope m14187a(CoroutineContext coroutineContext) {
        AbstractC10225x b;
        if (coroutineContext.mo3484i(Job.f22120e) == null) {
            b = C10236z1.m13940b(null, 1, null);
            coroutineContext = coroutineContext.mo3485f0(b);
        }
        return new C10090f(coroutineContext);
    }

    /* renamed from: b */
    public static final CoroutineScope m14186b() {
        return new C10090f(C10159p2.m14110b(null, 1, null).mo3485f0(C10230y0.m13945c()));
    }

    /* renamed from: c */
    public static final void m14185c(CoroutineScope coroutineScope, String str, Throwable th2) {
        m14184d(coroutineScope, C10132j1.m14191a(str, th2));
    }

    /* renamed from: d */
    public static final void m14184d(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getCoroutineContext().mo3484i(Job.f22120e);
        if (job != null) {
            job.mo3911h(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m14183e(CoroutineScope coroutineScope, String str, Throwable th2, int i, Object obj) {
        if ((i & 2) != 0) {
            th2 = null;
        }
        m14185c(coroutineScope, str, th2);
    }

    /* renamed from: f */
    public static /* synthetic */ void m14182f(CoroutineScope coroutineScope, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m14184d(coroutineScope, cancellationException);
    }

    /* renamed from: g */
    public static final <R> Object m14181g(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        Object d;
        C10083b0 b0Var = new C10083b0(continuation.getContext(), continuation);
        Object d2 = C14170b.m1463d(b0Var, b0Var, function2);
        d = C13080d.m4646d();
        if (d2 == d) {
            C9933g.m14691c(continuation);
        }
        return d2;
    }

    /* renamed from: h */
    public static final boolean m14180h(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getCoroutineContext().mo3484i(Job.f22120e);
        if (job != null) {
            return job.mo3873b();
        }
        return true;
    }

    /* renamed from: i */
    public static final CoroutineScope m14179i(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        return new C10090f(coroutineScope.getCoroutineContext().mo3485f0(coroutineContext));
    }
}
