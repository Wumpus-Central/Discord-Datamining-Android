package p213l9;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l9.j */
/* loaded from: classes5.dex */
public final class C10369j extends ThreadPoolExecutor {

    /* renamed from: k */
    final /* synthetic */ C10373n f22757k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10369j(C10373n nVar) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f22757k = nVar;
        setThreadFactory(new ThreadFactoryC10371l(null));
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C10368i(this, runnable, t);
    }
}
