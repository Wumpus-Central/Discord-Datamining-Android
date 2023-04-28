package p112g2;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p074e2.C6639l;

/* renamed from: g2.d */
/* loaded from: classes.dex */
public class C7397d implements AbstractC7407h {

    /* renamed from: a */
    private final List<Runnable> f15940a = new ArrayList();

    /* renamed from: b */
    private boolean f15941b = false;

    /* renamed from: c */
    private boolean f15942c = false;

    /* renamed from: d */
    private ThreadPoolExecutor f15943d;

    /* renamed from: g2.d$a */
    /* loaded from: classes.dex */
    class RejectedExecutionHandlerC7398a implements RejectedExecutionHandler {

        /* renamed from: a */
        final /* synthetic */ String f15944a;

        RejectedExecutionHandlerC7398a(String str) {
            this.f15944a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C6639l.m24863j().mo24886a("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f15944a);
        }
    }

    /* renamed from: g2.d$b */
    /* loaded from: classes.dex */
    class RunnableC7399b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ long f15946k;

        /* renamed from: l */
        final /* synthetic */ Runnable f15947l;

        RunnableC7399b(long j, Runnable runnable) {
            this.f15946k = j;
            this.f15947l = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(this.f15946k);
            } catch (InterruptedException e) {
                C6639l.m24863j().mo24886a("Sleep delay exception: %s", e.getMessage());
            }
            C7397d.this.submit(this.f15947l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2.d$c */
    /* loaded from: classes.dex */
    public class RunnableC7400c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Runnable f15949k;

        RunnableC7400c(Runnable runnable) {
            this.f15949k = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable;
            C7397d.this.m22740h(this.f15949k);
            while (true) {
                synchronized (C7397d.this.f15940a) {
                    if (!C7397d.this.f15942c) {
                        if (C7397d.this.f15940a.isEmpty()) {
                            C7397d.this.f15941b = false;
                            return;
                        } else {
                            runnable = (Runnable) C7397d.this.f15940a.get(0);
                            C7397d.this.f15940a.remove(0);
                        }
                    } else {
                        return;
                    }
                }
                C7397d.this.m22740h(runnable);
            }
        }
    }

    public C7397d(String str) {
        this.f15943d = new ThreadPoolExecutor(0, ViewDefaults.NUMBER_OF_LINES, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC7405g(str), new RejectedExecutionHandlerC7398a(str));
    }

    /* renamed from: g */
    private void m22741g(Runnable runnable) {
        this.f15943d.submit(new RunnableC7400c(runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m22740h(Runnable runnable) {
        try {
            if (!this.f15942c) {
                runnable.run();
            }
        } catch (Throwable th2) {
            C6639l.m24863j().mo24886a("Execution failed: %s", th2.getMessage());
        }
    }

    @Override // p112g2.AbstractC7404f
    /* renamed from: a */
    public void mo22735a() {
        synchronized (this.f15940a) {
            this.f15942c = true;
            this.f15940a.clear();
            this.f15943d.shutdown();
        }
    }

    @Override // p112g2.AbstractC7407h
    /* renamed from: b */
    public void mo22734b(Runnable runnable, long j) {
        synchronized (this.f15940a) {
            if (!this.f15942c) {
                this.f15943d.submit(new RunnableC7399b(j, runnable));
            }
        }
    }

    @Override // p112g2.AbstractC7404f
    public void submit(Runnable runnable) {
        synchronized (this.f15940a) {
            if (!this.f15942c) {
                if (!this.f15941b) {
                    this.f15941b = true;
                    m22741g(runnable);
                } else {
                    this.f15940a.add(runnable);
                }
            }
        }
    }
}
