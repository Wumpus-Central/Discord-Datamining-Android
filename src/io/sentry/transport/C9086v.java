package io.sentry.transport;

import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.transport.v */
/* loaded from: classes8.dex */
final class C9086v extends ThreadPoolExecutor {

    /* renamed from: k */
    private final int f19938k;

    /* renamed from: l */
    private final AbstractC8869g0 f19939l;

    /* renamed from: m */
    private final C9091z f19940m = new C9091z();

    /* renamed from: io.sentry.transport.v$a */
    /* loaded from: classes8.dex */
    static final class FutureC9087a<T> implements Future<T> {
        FutureC9087a() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public C9086v(int i, int i2, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, AbstractC8869g0 g0Var) {
        super(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f19938k = i2;
        this.f19939l = g0Var;
    }

    /* renamed from: a */
    private boolean m17107a() {
        return this.f19940m.m17093b() < this.f19938k;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th2) {
        try {
            super.afterExecute(runnable, th2);
        } finally {
            this.f19940m.m17094a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m17106b(long j) {
        try {
            this.f19940m.m17091d(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            this.f19939l.mo17723b(EnumC8942n3.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (m17107a()) {
            this.f19940m.m17092c();
            return super.submit(runnable);
        }
        this.f19939l.mo17722c(EnumC8942n3.WARNING, "Submit cancelled", new Object[0]);
        return new FutureC9087a();
    }
}
