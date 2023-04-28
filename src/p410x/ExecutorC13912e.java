package p410x;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: x.e */
/* loaded from: classes.dex */
final class ExecutorC13912e implements Executor {

    /* renamed from: l */
    private static volatile Executor f31364l;

    /* renamed from: k */
    private final ExecutorService f31365k = Executors.newFixedThreadPool(2, new ThreadFactoryC13913a());

    /* renamed from: x.e$a */
    /* loaded from: classes.dex */
    class ThreadFactoryC13913a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f31366a = new AtomicInteger(0);

        ThreadFactoryC13913a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f31366a.getAndIncrement())));
            return thread;
        }
    }

    ExecutorC13912e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m2325a() {
        if (f31364l != null) {
            return f31364l;
        }
        synchronized (ExecutorC13912e.class) {
            if (f31364l == null) {
                f31364l = new ExecutorC13912e();
            }
        }
        return f31364l;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f31365k.execute(runnable);
    }
}
