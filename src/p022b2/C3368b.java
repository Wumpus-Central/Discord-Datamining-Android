package p022b2;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: b2.b */
/* loaded from: classes.dex */
final class C3368b {

    /* renamed from: d */
    private static final C3368b f5365d = new C3368b();

    /* renamed from: a */
    private final ExecutorService f5366a;

    /* renamed from: b */
    private final ScheduledExecutorService f5367b;

    /* renamed from: c */
    private final Executor f5368c;

    /* renamed from: b2.b$b */
    /* loaded from: classes.dex */
    private static class ExecutorC0076b implements Executor {

        /* renamed from: k */
        private ThreadLocal<Integer> f5369k;

        private ExecutorC0076b() {
            this.f5369k = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m34583a() {
            Integer num = this.f5369k.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f5369k.remove();
            } else {
                this.f5369k.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* renamed from: b */
        private int m34582b() {
            Integer num = this.f5369k.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f5369k.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (m34582b() <= 15) {
                    runnable.run();
                } else {
                    C3368b.m34586a().execute(runnable);
                }
            } finally {
                m34583a();
            }
        }
    }

    private C3368b() {
        ExecutorService executorService;
        if (!m34584c()) {
            executorService = Executors.newCachedThreadPool();
        } else {
            executorService = C3366a.m34588b();
        }
        this.f5366a = executorService;
        this.f5367b = Executors.newSingleThreadScheduledExecutor();
        this.f5368c = new ExecutorC0076b();
    }

    /* renamed from: a */
    public static ExecutorService m34586a() {
        return f5365d.f5366a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Executor m34585b() {
        return f5365d.f5368c;
    }

    /* renamed from: c */
    private static boolean m34584c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
