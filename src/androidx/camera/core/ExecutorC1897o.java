package androidx.camera.core;

import androidx.core.util.C2517g;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p390w.AbstractC13584d0;

/* renamed from: androidx.camera.core.o */
/* loaded from: classes.dex */
class ExecutorC1897o implements Executor {

    /* renamed from: m */
    private static final ThreadFactory f1903m = new ThreadFactoryC1898a();

    /* renamed from: k */
    private final Object f1904k = new Object();

    /* renamed from: l */
    private ThreadPoolExecutor f1905l = m39567b();

    /* renamed from: androidx.camera.core.o$a */
    /* loaded from: classes.dex */
    class ThreadFactoryC1898a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f1906a = new AtomicInteger(0);

        ThreadFactoryC1898a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f1906a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: b */
    private static ThreadPoolExecutor m39567b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f1903m);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: androidx.camera.core.n
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                C1915r1.m39525c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m39566c(AbstractC13584d0 d0Var) {
        ThreadPoolExecutor threadPoolExecutor;
        C2517g.m37588g(d0Var);
        synchronized (this.f1904k) {
            if (this.f1905l.isShutdown()) {
                this.f1905l = m39567b();
            }
            threadPoolExecutor = this.f1905l;
        }
        int max = Math.max(1, d0Var.mo3307b().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        C2517g.m37588g(runnable);
        synchronized (this.f1904k) {
            this.f1905l.execute(runnable);
        }
    }
}
