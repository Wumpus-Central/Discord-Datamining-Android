package p022b2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: b2.a */
/* loaded from: classes.dex */
final class C3366a {

    /* renamed from: b */
    private static final C3366a f5360b = new C3366a();

    /* renamed from: c */
    private static final int f5361c;

    /* renamed from: d */
    static final int f5362d;

    /* renamed from: e */
    static final int f5363e;

    /* renamed from: a */
    private final Executor f5364a = new ExecutorC3367b();

    /* renamed from: b2.a$b */
    /* loaded from: classes.dex */
    private static class ExecutorC3367b implements Executor {
        private ExecutorC3367b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f5361c = availableProcessors;
        f5362d = availableProcessors + 1;
        f5363e = (availableProcessors * 2) + 1;
    }

    private C3366a() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m34589a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        threadPoolExecutor.allowCoreThreadTimeOut(z);
    }

    /* renamed from: b */
    public static ExecutorService m34588b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f5362d, f5363e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m34589a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static Executor m34587c() {
        return f5360b.f5364a;
    }
}
