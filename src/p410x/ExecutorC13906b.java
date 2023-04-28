package p410x;

import java.util.concurrent.Executor;

/* renamed from: x.b */
/* loaded from: classes.dex */
final class ExecutorC13906b implements Executor {

    /* renamed from: k */
    private static volatile ExecutorC13906b f31348k;

    ExecutorC13906b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m2332a() {
        if (f31348k != null) {
            return f31348k;
        }
        synchronized (ExecutorC13906b.class) {
            if (f31348k == null) {
                f31348k = new ExecutorC13906b();
            }
        }
        return f31348k;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
