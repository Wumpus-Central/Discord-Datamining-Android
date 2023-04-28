package p359u3;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: u3.e */
/* loaded from: classes7.dex */
public class RunnableFutureC13187e<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: k */
    private final Handler f29578k;

    /* renamed from: l */
    private final FutureTask<V> f29579l;

    public RunnableFutureC13187e(Handler handler, Callable<V> callable) {
        this.f29578k = handler;
        this.f29579l = new FutureTask<>(callable);
    }

    /* renamed from: b */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f29579l.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f29579l.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f29579l.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f29579l.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f29579l.run();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return this.f29579l.get(j, timeUnit);
    }

    public RunnableFutureC13187e(Handler handler, Runnable runnable, V v) {
        this.f29578k = handler;
        this.f29579l = new FutureTask<>(runnable, v);
    }
}
