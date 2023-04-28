package io.sentry;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.l3 */
/* loaded from: classes8.dex */
final class C8929l3 implements AbstractC8913k0 {

    /* renamed from: a */
    private final ScheduledExecutorService f19636a;

    C8929l3(ScheduledExecutorService scheduledExecutorService) {
        this.f19636a = scheduledExecutorService;
    }

    @Override // io.sentry.AbstractC8913k0
    /* renamed from: a */
    public void mo17613a(long j) {
        synchronized (this.f19636a) {
            if (!this.f19636a.isShutdown()) {
                this.f19636a.shutdown();
                try {
                    if (!this.f19636a.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        this.f19636a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f19636a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // io.sentry.AbstractC8913k0
    /* renamed from: b */
    public Future<?> mo17612b(Runnable runnable, long j) {
        return this.f19636a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.AbstractC8913k0
    public Future<?> submit(Runnable runnable) {
        return this.f19636a.submit(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8929l3() {
        this(Executors.newSingleThreadScheduledExecutor());
    }
}
