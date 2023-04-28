package p112g2;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p074e2.C6639l;

/* renamed from: g2.e */
/* loaded from: classes.dex */
public class C7401e implements AbstractC7395b {

    /* renamed from: a */
    private ScheduledThreadPoolExecutor f15951a;

    /* renamed from: g2.e$a */
    /* loaded from: classes.dex */
    class RejectedExecutionHandlerC7402a implements RejectedExecutionHandler {

        /* renamed from: a */
        final /* synthetic */ String f15952a;

        RejectedExecutionHandlerC7402a(String str) {
            this.f15952a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C6639l.m24863j().mo24886a("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f15952a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2.e$b */
    /* loaded from: classes.dex */
    public class CallableC7403b implements Callable<V> {

        /* renamed from: a */
        final /* synthetic */ Callable f15954a;

        CallableC7403b(Callable callable) {
            this.f15954a = callable;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [V, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public V call() {
            try {
                return this.f15954a.call();
            } catch (Throwable th2) {
                C6639l.m24863j().mo24885b("Callable error [%s] of type [%s]", th2.getMessage(), th2.getClass().getCanonicalName());
                return null;
            }
        }
    }

    public C7401e(String str, boolean z) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC7405g(str), new RejectedExecutionHandlerC7402a(str));
        this.f15951a = scheduledThreadPoolExecutor;
        if (!z) {
            scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
            this.f15951a.allowCoreThreadTimeOut(true);
        }
    }

    @Override // p112g2.AbstractC7395b
    /* renamed from: a */
    public void mo22739a() {
        this.f15951a.shutdownNow();
    }

    @Override // p112g2.AbstractC7395b
    /* renamed from: b */
    public ScheduledFuture<?> mo22738b(Runnable runnable, long j, long j2) {
        return this.f15951a.scheduleWithFixedDelay(new RunnableC7396c(runnable), j, j2, TimeUnit.MILLISECONDS);
    }

    @Override // p112g2.AbstractC7395b
    /* renamed from: c */
    public ScheduledFuture<?> mo22737c(Runnable runnable, long j) {
        return this.f15951a.schedule(new RunnableC7396c(runnable), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: d */
    public <V> ScheduledFuture<V> m22736d(Callable<V> callable, long j) {
        return this.f15951a.schedule(new CallableC7403b(callable), j, TimeUnit.MILLISECONDS);
    }
}
