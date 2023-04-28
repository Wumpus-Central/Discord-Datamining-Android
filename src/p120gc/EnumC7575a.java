package p120gc;

import java.util.concurrent.Executor;

/* renamed from: gc.a */
/* loaded from: classes3.dex */
enum EnumC7575a implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
