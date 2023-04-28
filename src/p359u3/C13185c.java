package p359u3;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: u3.c */
/* loaded from: classes7.dex */
public class C13185c extends C13183b implements AbstractExecutorServiceC13188f {
    public C13185c(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }

    @Override // p359u3.C13183b, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
