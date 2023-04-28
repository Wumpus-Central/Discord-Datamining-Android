package p359u3;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p414x3.C13925a;

/* renamed from: u3.b */
/* loaded from: classes7.dex */
public class C13183b extends AbstractExecutorService {

    /* renamed from: r */
    private static final Class<?> f29568r = C13183b.class;

    /* renamed from: k */
    private final String f29569k;

    /* renamed from: l */
    private final Executor f29570l;

    /* renamed from: m */
    private volatile int f29571m;

    /* renamed from: n */
    private final BlockingQueue<Runnable> f29572n;

    /* renamed from: o */
    private final RunnableC0426b f29573o;

    /* renamed from: p */
    private final AtomicInteger f29574p;

    /* renamed from: q */
    private final AtomicInteger f29575q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u3.b$b */
    /* loaded from: classes7.dex */
    public class RunnableC0426b implements Runnable {
        private RunnableC0426b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) C13183b.this.f29572n.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    C13925a.m2274x(C13183b.f29568r, "%s: Worker has nothing to run", C13183b.this.f29569k);
                }
                int decrementAndGet = C13183b.this.f29574p.decrementAndGet();
                if (!C13183b.this.f29572n.isEmpty()) {
                    C13183b.this.m4390f();
                } else {
                    C13925a.m2273y(C13183b.f29568r, "%s: worker finished; %d workers left", C13183b.this.f29569k, Integer.valueOf(decrementAndGet));
                }
            } catch (Throwable th2) {
                int decrementAndGet2 = C13183b.this.f29574p.decrementAndGet();
                if (!C13183b.this.f29572n.isEmpty()) {
                    C13183b.this.m4390f();
                } else {
                    C13925a.m2273y(C13183b.f29568r, "%s: worker finished; %d workers left", C13183b.this.f29569k, Integer.valueOf(decrementAndGet2));
                }
                throw th2;
            }
        }
    }

    public C13183b(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i > 0) {
            this.f29569k = str;
            this.f29570l = executor;
            this.f29571m = i;
            this.f29572n = blockingQueue;
            this.f29573o = new RunnableC0426b();
            this.f29574p = new AtomicInteger(0);
            this.f29575q = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m4390f() {
        int i = this.f29574p.get();
        while (i < this.f29571m) {
            int i2 = i + 1;
            if (this.f29574p.compareAndSet(i, i2)) {
                C13925a.m2272z(f29568r, "%s: starting worker %d of %d", this.f29569k, Integer.valueOf(i2), Integer.valueOf(this.f29571m));
                this.f29570l.execute(this.f29573o);
                return;
            }
            C13925a.m2274x(f29568r, "%s: race in startWorkerIfNeeded; retrying", this.f29569k);
            i = this.f29574p.get();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        } else if (this.f29572n.offer(runnable)) {
            int size = this.f29572n.size();
            int i = this.f29575q.get();
            if (size > i && this.f29575q.compareAndSet(i, size)) {
                C13925a.m2273y(f29568r, "%s: max pending work in queue = %d", this.f29569k, Integer.valueOf(size));
            }
            m4390f();
        } else {
            throw new RejectedExecutionException(this.f29569k + " queue is full, size=" + this.f29572n.size());
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

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
