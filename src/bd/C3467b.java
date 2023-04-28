package bd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bd.b */
/* loaded from: classes3.dex */
public class C3467b {

    /* renamed from: a */
    private static final AbstractC3466a f5610a;

    /* renamed from: b */
    private static volatile AbstractC3466a f5611b;

    /* renamed from: bd.b$b */
    /* loaded from: classes3.dex */
    private static class C0084b implements AbstractC3466a {
        private C0084b() {
        }

        @Override // bd.AbstractC3466a
        /* renamed from: a */
        public ExecutorService mo34328a(ThreadFactory threadFactory, EnumC3469c cVar) {
            return m34327b(1, threadFactory, cVar);
        }

        /* renamed from: b */
        public ExecutorService m34327b(int i, ThreadFactory threadFactory, EnumC3469c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0084b bVar = new C0084b();
        f5610a = bVar;
        f5611b = bVar;
    }

    /* renamed from: a */
    public static AbstractC3466a m34329a() {
        return f5611b;
    }
}
