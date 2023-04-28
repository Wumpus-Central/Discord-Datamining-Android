package p410x;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: x.d */
/* loaded from: classes.dex */
final class ExecutorC13910d implements Executor {

    /* renamed from: l */
    private static volatile Executor f31361l;

    /* renamed from: k */
    private final ExecutorService f31362k = Executors.newSingleThreadExecutor(new ThreadFactoryC13911a());

    /* renamed from: x.d$a */
    /* loaded from: classes.dex */
    class ThreadFactoryC13911a implements ThreadFactory {
        ThreadFactoryC13911a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    ExecutorC13910d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m2326a() {
        if (f31361l != null) {
            return f31361l;
        }
        synchronized (ExecutorC13910d.class) {
            if (f31361l == null) {
                f31361l = new ExecutorC13910d();
            }
        }
        return f31361l;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f31362k.execute(runnable);
    }
}
