package p373uj;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0003\u0012\u0016\tB\u000f\u0012\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u0004R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006)"}, m15073d2 = {"Luj/e;", "", "Luj/a;", "task", "", "e", "j", "", "delayNanos", "c", "Luj/d;", "taskQueue", "h", "(Luj/d;)V", "d", "i", "f", "", "a", "I", "nextQueueName", "", "b", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "Luj/e$a;", "g", "Luj/e$a;", "()Luj/e$a;", "backend", "<init>", "(Luj/e$a;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: uj.e */
/* loaded from: classes8.dex */
public final class C13370e {

    /* renamed from: i */
    private static final Logger f29934i;

    /* renamed from: b */
    private boolean f29937b;

    /* renamed from: c */
    private long f29938c;

    /* renamed from: g */
    private final AbstractC13371a f29942g;

    /* renamed from: j */
    public static final C13372b f29935j = new C13372b(null);

    /* renamed from: h */
    public static final C13370e f29933h = new C13370e(new C13373c(C12729c.m5632K(C12729c.f28590i + " TaskRunner", true)));

    /* renamed from: a */
    private int f29936a = 10000;

    /* renamed from: d */
    private final List<C13369d> f29939d = new ArrayList();

    /* renamed from: e */
    private final List<C13369d> f29940e = new ArrayList();

    /* renamed from: f */
    private final Runnable f29941f = new RunnableC13374d();

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, m15073d2 = {"Luj/e$a;", "", "", "c", "Luj/e;", "taskRunner", "", "b", "nanos", "a", "Ljava/lang/Runnable;", "runnable", "execute", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: uj.e$a */
    /* loaded from: classes8.dex */
    public interface AbstractC13371a {
        /* renamed from: a */
        void mo3813a(C13370e eVar, long j);

        /* renamed from: b */
        void mo3812b(C13370e eVar);

        /* renamed from: c */
        long mo3811c();

        void execute(Runnable runnable);
    }

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m15073d2 = {"Luj/e$b;", "", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Luj/e;", "INSTANCE", "Luj/e;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: uj.e$b */
    /* loaded from: classes8.dex */
    public static final class C13372b {
        private C13372b() {
        }

        public /* synthetic */ C13372b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m3814a() {
            return C13370e.f29934i;
        }
    }

    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0014"}, m15073d2 = {"Luj/e$c;", "Luj/e$a;", "", "c", "Luj/e;", "taskRunner", "", "b", "nanos", "a", "Ljava/lang/Runnable;", "runnable", "execute", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: uj.e$c */
    /* loaded from: classes8.dex */
    public static final class C13373c implements AbstractC13371a {

        /* renamed from: a */
        private final ThreadPoolExecutor f29943a;

        public C13373c(ThreadFactory threadFactory) {
            C9971q.m14633g(threadFactory, "threadFactory");
            this.f29943a = new ThreadPoolExecutor(0, (int) ViewDefaults.NUMBER_OF_LINES, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p373uj.C13370e.AbstractC13371a
        /* renamed from: a */
        public void mo3813a(C13370e taskRunner, long j) {
            C9971q.m14633g(taskRunner, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        @Override // p373uj.C13370e.AbstractC13371a
        /* renamed from: b */
        public void mo3812b(C13370e taskRunner) {
            C9971q.m14633g(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // p373uj.C13370e.AbstractC13371a
        /* renamed from: c */
        public long mo3811c() {
            return System.nanoTime();
        }

        @Override // p373uj.C13370e.AbstractC13371a
        public void execute(Runnable runnable) {
            C9971q.m14633g(runnable, "runnable");
            this.f29943a.execute(runnable);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"uj/e$d", "Ljava/lang/Runnable;", "", "run", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: uj.e$d */
    /* loaded from: classes8.dex */
    public static final class RunnableC13374d implements Runnable {
        RunnableC13374d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC13366a d;
            long j;
            while (true) {
                synchronized (C13370e.this) {
                    d = C13370e.this.m3821d();
                }
                if (d != null) {
                    C13369d d2 = d.m3844d();
                    C9971q.m14636d(d2);
                    boolean isLoggable = C13370e.f29935j.m3814a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = d2.m3831h().m3818g().mo3811c();
                        C13367b.m3839c(d, d2, "starting");
                    } else {
                        j = -1;
                    }
                    try {
                        C13370e.this.m3815j(d);
                        Unit unit = Unit.f22042a;
                        if (isLoggable) {
                            C13367b.m3839c(d, d2, "finished run in " + C13367b.m3840b(d2.m3831h().m3818g().mo3811c() - j));
                        }
                    } catch (Throwable th2) {
                        if (isLoggable) {
                            C13367b.m3839c(d, d2, "failed a run in " + C13367b.m3840b(d2.m3831h().m3818g().mo3811c() - j));
                        }
                        throw th2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C13370e.class.getName());
        C9971q.m14634f(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f29934i = logger;
    }

    public C13370e(AbstractC13371a backend) {
        C9971q.m14633g(backend, "backend");
        this.f29942g = backend;
    }

    /* renamed from: c */
    private final void m3822c(AbstractC13366a aVar, long j) {
        boolean z;
        if (!C12729c.f28589h || Thread.holdsLock(this)) {
            C13369d d = aVar.m3844d();
            C9971q.m14636d(d);
            if (d.m3836c() == aVar) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                boolean d2 = d.m3835d();
                d.m3826m(false);
                d.m3827l(null);
                this.f29939d.remove(d);
                if (j != -1 && !d2 && !d.m3832g()) {
                    d.m3828k(aVar, j, true);
                }
                if (!d.m3834e().isEmpty()) {
                    this.f29940e.add(d);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: e */
    private final void m3820e(AbstractC13366a aVar) {
        if (!C12729c.f28589h || Thread.holdsLock(this)) {
            aVar.m3842g(-1L);
            C13369d d = aVar.m3844d();
            C9971q.m14636d(d);
            d.m3834e().remove(aVar);
            this.f29940e.remove(d);
            d.m3827l(aVar);
            this.f29939d.add(d);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m3815j(AbstractC13366a aVar) {
        if (!C12729c.f28589h || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(aVar.m3846b());
            try {
                long f = aVar.mo469f();
                synchronized (this) {
                    m3822c(aVar, f);
                    Unit unit = Unit.f22042a;
                }
                currentThread.setName(name);
            } catch (Throwable th2) {
                synchronized (this) {
                    m3822c(aVar, -1L);
                    Unit unit2 = Unit.f22042a;
                    currentThread.setName(name);
                    throw th2;
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread2 = Thread.currentThread();
            C9971q.m14634f(currentThread2, "Thread.currentThread()");
            sb2.append(currentThread2.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    /* renamed from: d */
    public final AbstractC13366a m3821d() {
        boolean z;
        if (!C12729c.f28589h || Thread.holdsLock(this)) {
            while (!this.f29940e.isEmpty()) {
                long c = this.f29942g.mo3811c();
                Iterator<C13369d> it = this.f29940e.iterator();
                long j = Long.MAX_VALUE;
                AbstractC13366a aVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    AbstractC13366a aVar2 = it.next().m3834e().get(0);
                    long max = Math.max(0L, aVar2.m3845c() - c);
                    if (max > 0) {
                        j = Math.min(max, j);
                    } else if (aVar != null) {
                        z = true;
                        break;
                    } else {
                        aVar = aVar2;
                    }
                }
                if (aVar != null) {
                    m3820e(aVar);
                    if (z || (!this.f29937b && (!this.f29940e.isEmpty()))) {
                        this.f29942g.execute(this.f29941f);
                    }
                    return aVar;
                } else if (this.f29937b) {
                    if (j < this.f29938c - c) {
                        this.f29942g.mo3812b(this);
                    }
                    return null;
                } else {
                    this.f29937b = true;
                    this.f29938c = c + j;
                    try {
                        try {
                            this.f29942g.mo3813a(this, j);
                        } catch (InterruptedException unused) {
                            m3819f();
                        }
                    } finally {
                        this.f29937b = false;
                    }
                }
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: f */
    public final void m3819f() {
        for (int size = this.f29939d.size() - 1; size >= 0; size--) {
            this.f29939d.get(size).m3837b();
        }
        for (int size2 = this.f29940e.size() - 1; size2 >= 0; size2--) {
            C13369d dVar = this.f29940e.get(size2);
            dVar.m3837b();
            if (dVar.m3834e().isEmpty()) {
                this.f29940e.remove(size2);
            }
        }
    }

    /* renamed from: g */
    public final AbstractC13371a m3818g() {
        return this.f29942g;
    }

    /* renamed from: h */
    public final void m3817h(C13369d taskQueue) {
        C9971q.m14633g(taskQueue, "taskQueue");
        if (!C12729c.f28589h || Thread.holdsLock(this)) {
            if (taskQueue.m3836c() == null) {
                if (!taskQueue.m3834e().isEmpty()) {
                    C12729c.m5617a(this.f29940e, taskQueue);
                } else {
                    this.f29940e.remove(taskQueue);
                }
            }
            if (this.f29937b) {
                this.f29942g.mo3812b(this);
            } else {
                this.f29942g.execute(this.f29941f);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    /* renamed from: i */
    public final C13369d m3816i() {
        int i;
        synchronized (this) {
            i = this.f29936a;
            this.f29936a = i + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i);
        return new C13369d(this, sb2.toString());
    }
}
