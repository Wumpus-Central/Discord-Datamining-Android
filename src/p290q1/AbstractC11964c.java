package p290q1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: q1.c */
/* loaded from: classes.dex */
abstract class AbstractC11964c<Params, Progress, Result> {

    /* renamed from: p */
    private static final ThreadFactory f26786p;

    /* renamed from: q */
    private static final BlockingQueue<Runnable> f26787q;

    /* renamed from: r */
    public static final Executor f26788r;

    /* renamed from: s */
    private static HandlerC11969f f26789s;

    /* renamed from: t */
    private static volatile Executor f26790t;

    /* renamed from: k */
    private final AbstractCallableC11971h<Params, Result> f26791k;

    /* renamed from: l */
    private final FutureTask<Result> f26792l;

    /* renamed from: m */
    private volatile EnumC11970g f26793m = EnumC11970g.PENDING;

    /* renamed from: n */
    final AtomicBoolean f26794n = new AtomicBoolean();

    /* renamed from: o */
    final AtomicBoolean f26795o = new AtomicBoolean();

    /* renamed from: q1.c$a */
    /* loaded from: classes.dex */
    static class ThreadFactoryC11965a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f26796a = new AtomicInteger(1);

        ThreadFactoryC11965a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f26796a.getAndIncrement());
        }
    }

    /* renamed from: q1.c$b */
    /* loaded from: classes.dex */
    class C11966b extends AbstractCallableC11971h<Params, Result> {
        C11966b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            AbstractC11964c.this.f26795o.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC11964c.this.mo8106b(this.f26806a);
                Binder.flushPendingCommands();
                return result;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    /* renamed from: q1.c$c */
    /* loaded from: classes.dex */
    class C0379c extends FutureTask<Result> {
        C0379c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC11964c.this.m8095m(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                AbstractC11964c.this.m8095m(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: q1.c$d */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11967d {

        /* renamed from: a */
        static final /* synthetic */ int[] f26799a;

        static {
            int[] iArr = new int[EnumC11970g.values().length];
            f26799a = iArr;
            try {
                iArr[EnumC11970g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26799a[EnumC11970g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1.c$e */
    /* loaded from: classes.dex */
    public static class C11968e<Data> {

        /* renamed from: a */
        final AbstractC11964c f26800a;

        /* renamed from: b */
        final Data[] f26801b;

        C11968e(AbstractC11964c cVar, Data... dataArr) {
            this.f26800a = cVar;
            this.f26801b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1.c$f */
    /* loaded from: classes.dex */
    public static class HandlerC11969f extends Handler {
        HandlerC11969f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C11968e eVar = (C11968e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f26800a.m8104d(eVar.f26801b[0]);
            } else if (i == 2) {
                eVar.f26800a.m8097k(eVar.f26801b);
            }
        }
    }

    /* renamed from: q1.c$g */
    /* loaded from: classes.dex */
    public enum EnumC11970g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: q1.c$h */
    /* loaded from: classes.dex */
    private static abstract class AbstractCallableC11971h<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        Params[] f26806a;

        AbstractCallableC11971h() {
        }
    }

    static {
        ThreadFactoryC11965a aVar = new ThreadFactoryC11965a();
        f26786p = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f26787q = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f26788r = threadPoolExecutor;
        f26790t = threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC11964c() {
        C11966b bVar = new C11966b();
        this.f26791k = bVar;
        this.f26792l = new C0379c(bVar);
    }

    /* renamed from: e */
    private static Handler m8103e() {
        HandlerC11969f fVar;
        synchronized (AbstractC11964c.class) {
            if (f26789s == null) {
                f26789s = new HandlerC11969f();
            }
            fVar = f26789s;
        }
        return fVar;
    }

    /* renamed from: a */
    public final boolean m8107a(boolean z) {
        this.f26794n.set(true);
        return this.f26792l.cancel(z);
    }

    /* renamed from: b */
    protected abstract Result mo8106b(Params... paramsArr);

    /* renamed from: c */
    public final AbstractC11964c<Params, Progress, Result> m8105c(Executor executor, Params... paramsArr) {
        if (this.f26793m != EnumC11970g.PENDING) {
            int i = C11967d.f26799a[this.f26793m.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f26793m = EnumC11970g.RUNNING;
            m8098j();
            this.f26791k.f26806a = paramsArr;
            executor.execute(this.f26792l);
            return this;
        }
    }

    /* renamed from: d */
    void m8104d(Result result) {
        if (m8102f()) {
            mo8100h(result);
        } else {
            mo8099i(result);
        }
        this.f26793m = EnumC11970g.FINISHED;
    }

    /* renamed from: f */
    public final boolean m8102f() {
        return this.f26794n.get();
    }

    /* renamed from: g */
    protected void m8101g() {
    }

    /* renamed from: h */
    protected void mo8100h(Result result) {
        m8101g();
    }

    /* renamed from: i */
    protected void mo8099i(Result result) {
    }

    /* renamed from: j */
    protected void m8098j() {
    }

    /* renamed from: k */
    protected void m8097k(Progress... progressArr) {
    }

    /* renamed from: l */
    Result m8096l(Result result) {
        m8103e().obtainMessage(1, new C11968e(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: m */
    void m8095m(Result result) {
        if (!this.f26795o.get()) {
            m8096l(result);
        }
    }
}
