package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C10088e;

@Metadata(m15074d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J.\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001c\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, m15073d2 = {"Lkotlinx/coroutines/l1;", "Lkotlinx/coroutines/k1;", "Lkotlinx/coroutines/s0;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "M0", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "", "K0", "G0", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "t", "Lkotlinx/coroutines/a1;", "R", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/Executor;", "n", "Ljava/util/concurrent/Executor;", "L0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.l1 */
/* loaded from: classes8.dex */
public final class C10142l1 extends AbstractC10136k1 implements AbstractC10169s0 {

    /* renamed from: n */
    private final Executor f22350n;

    public C10142l1(Executor executor) {
        this.f22350n = executor;
        C10088e.m14330a(m14168L0());
    }

    /* renamed from: K0 */
    private final void m14169K0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        C10227x1.m13958c(coroutineContext, C10132j1.m14191a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: M0 */
    private final ScheduledFuture<?> m14167M0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m14169K0(coroutineContext, e);
            return null;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: G0 */
    public void mo4546G0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor L0 = m14168L0();
            C10010c.m14496a();
            L0.execute(runnable);
        } catch (RejectedExecutionException e) {
            C10010c.m14496a();
            m14169K0(coroutineContext, e);
            C10230y0.m13946b().mo4546G0(coroutineContext, runnable);
        }
    }

    /* renamed from: L0 */
    public Executor m14168L0() {
        return this.f22350n;
    }

    @Override // kotlinx.coroutines.AbstractC10169s0
    /* renamed from: R */
    public AbstractC10000a1 mo4537R(long j, Runnable runnable, CoroutineContext coroutineContext) {
        ScheduledExecutorService scheduledExecutorService;
        Executor L0 = m14168L0();
        ScheduledFuture<?> scheduledFuture = null;
        if (L0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) L0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = m14167M0(scheduledExecutorService, runnable, coroutineContext, j);
        }
        if (scheduledFuture != null) {
            return new C10235z0(scheduledFuture);
        }
        return RunnableC10153o0.f22357r.mo4537R(j, runnable, coroutineContext);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor L0 = m14168L0();
        ExecutorService executorService = L0 instanceof ExecutorService ? (ExecutorService) L0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10142l1) && ((C10142l1) obj).m14168L0() == m14168L0();
    }

    public int hashCode() {
        return System.identityHashCode(m14168L0());
    }

    @Override // kotlinx.coroutines.AbstractC10169s0
    /* renamed from: t */
    public void mo4538t(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
        ScheduledExecutorService scheduledExecutorService;
        Executor L0 = m14168L0();
        ScheduledFuture<?> scheduledFuture = null;
        if (L0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) L0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = m14167M0(scheduledExecutorService, new RunnableC10143l2(this, cancellableContinuation), cancellableContinuation.getContext(), j);
        }
        if (scheduledFuture != null) {
            C10227x1.m13955f(cancellableContinuation, scheduledFuture);
        } else {
            RunnableC10153o0.f22357r.mo4538t(j, cancellableContinuation);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return m14168L0().toString();
    }
}
