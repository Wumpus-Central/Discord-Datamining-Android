package p410x;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.C2114c;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p120gc.AbstractFutureC7576b;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x.c */
/* loaded from: classes.dex */
public final class ScheduledExecutorServiceC13907c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: l */
    private static ThreadLocal<ScheduledExecutorService> f31349l = new C13908a();

    /* renamed from: k */
    private final Handler f31350k;

    /* renamed from: x.c$a */
    /* loaded from: classes.dex */
    class C13908a extends ThreadLocal<ScheduledExecutorService> {
        C13908a() {
        }

        /* renamed from: a */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return C13905a.m2336d();
            }
            if (Looper.myLooper() != null) {
                return new ScheduledExecutorServiceC13907c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: x.c$b */
    /* loaded from: classes.dex */
    class CallableC13909b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f31351a;

        CallableC13909b(Runnable runnable) {
            this.f31351a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f31351a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x.c$c */
    /* loaded from: classes.dex */
    public static class RunnableScheduledFutureC0449c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: k */
        final AtomicReference<C2114c.C2115a<V>> f31353k = new AtomicReference<>(null);

        /* renamed from: l */
        private final long f31354l;

        /* renamed from: m */
        private final Callable<V> f31355m;

        /* renamed from: n */
        private final AbstractFutureC7576b<V> f31356n;

        /* renamed from: x.c$c$a */
        /* loaded from: classes.dex */
        class a implements C2114c.AbstractC0030c<V> {

            /* renamed from: a */
            final /* synthetic */ Handler f31357a;

            /* renamed from: b */
            final /* synthetic */ Callable f31358b;

            /* renamed from: x.c$c$a$a */
            /* loaded from: classes.dex */
            class RunnableC0450a implements Runnable {
                RunnableC0450a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC0449c.this.f31353k.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f31357a.removeCallbacks(RunnableScheduledFutureC0449c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f31357a = handler;
                this.f31358b = callable;
            }

            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public Object mo1403a(C2114c.C2115a<V> aVar) {
                aVar.m38963a(new RunnableC0450a(), C13905a.m2339a());
                RunnableScheduledFutureC0449c.this.f31353k.set(aVar);
                return "HandlerScheduledFuture-" + this.f31358b.toString();
            }
        }

        RunnableScheduledFutureC0449c(Handler handler, long j, Callable<V> callable) {
            this.f31354l = j;
            this.f31355m = callable;
            this.f31356n = C2114c.m38964a(new a(handler, callable));
        }

        /* renamed from: b */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.f31356n.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return this.f31356n.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f31354l - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f31356n.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f31356n.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            C2114c.C2115a<V> andSet = this.f31353k.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.m38961c(this.f31355m.call());
                } catch (Exception e) {
                    andSet.m38958f(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public V get(long j, TimeUnit timeUnit) {
            return this.f31356n.get(j, timeUnit);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScheduledExecutorServiceC13907c(Handler handler) {
        this.f31350k = handler;
    }

    /* renamed from: a */
    private RejectedExecutionException m2331a() {
        return new RejectedExecutionException(this.f31350k + " is shutting down");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ScheduledExecutorService m2330b() {
        ScheduledExecutorService scheduledExecutorService = f31349l.get();
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            ScheduledExecutorServiceC13907c cVar = new ScheduledExecutorServiceC13907c(new Handler(myLooper));
            f31349l.set(cVar);
            return cVar;
        }
        throw new IllegalStateException("Current thread has no looper!");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC13907c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f31350k.post(runnable)) {
            throw m2331a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new CallableC13909b(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC13907c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC13907c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC13907c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC13907c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        RunnableScheduledFutureC0449c cVar = new RunnableScheduledFutureC0449c(this.f31350k, uptimeMillis, callable);
        return this.f31350k.postAtTime(cVar, uptimeMillis) ? cVar : C14186f.m1422g(m2331a());
    }
}
