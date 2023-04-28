package p359u3;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: u3.d */
/* loaded from: classes7.dex */
public class ScheduledExecutorServiceC13186d extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: k */
    private final Handler f29577k;

    public ScheduledExecutorServiceC13186d(Handler handler) {
        this.f29577k = handler;
    }

    /* renamed from: a */
    public boolean m4389a() {
        return Thread.currentThread() == this.f29577k.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public <T> RunnableFutureC13187e<T> newTaskFor(Runnable runnable, T t) {
        return new RunnableFutureC13187e<>(this.f29577k, runnable, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public <T> RunnableFutureC13187e<T> newTaskFor(Callable<T> callable) {
        return new RunnableFutureC13187e<>(this.f29577k, callable);
    }

    /* renamed from: d */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, null);
    }

    /* renamed from: e */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        runnable.getClass();
        RunnableFutureC13187e<T> b = newTaskFor(runnable, t);
        execute(b);
        return b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f29577k.post(runnable);
    }

    /* renamed from: f */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        callable.getClass();
        RunnableFutureC13187e<T> c = newTaskFor(callable);
        execute(c);
        return c;
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
        RunnableFutureC13187e b = newTaskFor(runnable, null);
        this.f29577k.postDelayed(b, timeUnit.toMillis(j));
        return b;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        RunnableFutureC13187e c = newTaskFor(callable);
        this.f29577k.postDelayed(c, timeUnit.toMillis(j));
        return c;
    }
}
