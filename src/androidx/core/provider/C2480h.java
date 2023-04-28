package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.AbstractC2511b;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.provider.h */
/* loaded from: classes.dex */
class C2480h {

    /* renamed from: androidx.core.provider.h$a */
    /* loaded from: classes.dex */
    private static class ThreadFactoryC2481a implements ThreadFactory {

        /* renamed from: a */
        private String f3427a;

        /* renamed from: b */
        private int f3428b;

        /* renamed from: androidx.core.provider.h$a$a */
        /* loaded from: classes.dex */
        private static class C0040a extends Thread {

            /* renamed from: k */
            private final int f3429k;

            C0040a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f3429k = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f3429k);
                super.run();
            }
        }

        ThreadFactoryC2481a(String str, int i) {
            this.f3427a = str;
            this.f3428b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0040a(runnable, this.f3427a, this.f3428b);
        }
    }

    /* renamed from: androidx.core.provider.h$b */
    /* loaded from: classes.dex */
    private static class RunnableC2482b<T> implements Runnable {

        /* renamed from: k */
        private Callable<T> f3430k;

        /* renamed from: l */
        private AbstractC2511b<T> f3431l;

        /* renamed from: m */
        private Handler f3432m;

        /* renamed from: androidx.core.provider.h$b$a */
        /* loaded from: classes.dex */
        class RunnableC2483a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ AbstractC2511b f3433k;

            /* renamed from: l */
            final /* synthetic */ Object f3434l;

            RunnableC2483a(AbstractC2511b bVar, Object obj) {
                this.f3433k = bVar;
                this.f3434l = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f3433k.accept(this.f3434l);
            }
        }

        RunnableC2482b(Handler handler, Callable<T> callable, AbstractC2511b<T> bVar) {
            this.f3430k = callable;
            this.f3431l = bVar;
            this.f3432m = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.f3430k.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f3432m.post(new RunnableC2483a(this.f3431l, t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ThreadPoolExecutor m37666a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2481a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> void m37665b(Executor executor, Callable<T> callable, AbstractC2511b<T> bVar) {
        executor.execute(new RunnableC2482b(C2465b.m37707a(), callable, bVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> T m37664c(ExecutorService executorService, Callable<T> callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
