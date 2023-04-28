package p431y;

import androidx.camera.core.C1915r1;
import androidx.core.util.C2517g;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p120gc.AbstractFutureC7576b;

/* renamed from: y.g */
/* loaded from: classes.dex */
abstract class AbstractC14192g<V> implements AbstractFutureC7576b<V> {

    /* renamed from: y.g$a */
    /* loaded from: classes.dex */
    static class C14193a<V> extends AbstractC14192g<V> {

        /* renamed from: k */
        private final Throwable f32037k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14193a(Throwable th2) {
            this.f32037k = th2;
        }

        @Override // p431y.AbstractC14192g, java.util.concurrent.Future
        public V get() {
            throw new ExecutionException(this.f32037k);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f32037k + "]]";
        }
    }

    /* renamed from: y.g$b */
    /* loaded from: classes.dex */
    static final class ScheduledFutureC14194b<V> extends C14193a<V> implements ScheduledFuture<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ScheduledFutureC14194b(Throwable th2) {
            super(th2);
        }

        /* renamed from: c */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* renamed from: y.g$c */
    /* loaded from: classes.dex */
    static final class C14195c<V> extends AbstractC14192g<V> {

        /* renamed from: l */
        static final AbstractC14192g<Object> f32038l = new C14195c(null);

        /* renamed from: k */
        private final V f32039k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14195c(V v) {
            this.f32039k = v;
        }

        @Override // p431y.AbstractC14192g, java.util.concurrent.Future
        public V get() {
            return this.f32039k;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f32039k + "]]";
        }
    }

    AbstractC14192g() {
    }

    /* renamed from: b */
    public static <V> AbstractFutureC7576b<V> m1411b() {
        return C14195c.f32038l;
    }

    @Override // p120gc.AbstractFutureC7576b
    /* renamed from: a */
    public void mo1409a(Runnable runnable, Executor executor) {
        C2517g.m37588g(runnable);
        C2517g.m37588g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            C1915r1.m39524d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        C2517g.m37588g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
