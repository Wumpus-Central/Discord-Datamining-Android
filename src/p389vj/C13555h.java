package p389vj;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p015ak.C1457k;
import p307qj.C12208a;
import p307qj.C12248r;
import p327rj.C12729c;
import p373uj.AbstractC13366a;
import p373uj.C13369d;
import p373uj.C13370e;
import p389vj.C13545e;

@Metadata(m15074d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u001b\u0018\u0000 *2\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J.\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!¨\u0006+"}, m15073d2 = {"Lvj/h;", "", "Lvj/f;", "connection", "", "now", "", "d", "Lqj/a;", "address", "Lvj/e;", "call", "", "Lqj/r;", "routes", "", "requireMultiplexed", "a", "", "e", "c", "b", "J", "keepAliveDurationNs", "Luj/d;", "Luj/d;", "cleanupQueue", "vj/h$b", "Lvj/h$b;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "I", "maxIdleConnections", "Luj/e;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Luj/e;IJLjava/util/concurrent/TimeUnit;)V", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: vj.h */
/* loaded from: classes8.dex */
public final class C13555h {

    /* renamed from: f */
    public static final C13556a f30321f = new C13556a(null);

    /* renamed from: a */
    private final long f30322a;

    /* renamed from: b */
    private final C13369d f30323b;

    /* renamed from: c */
    private final C13557b f30324c = new C13557b(C12729c.f28590i + " ConnectionPool");

    /* renamed from: d */
    private final ConcurrentLinkedQueue<C13549f> f30325d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private final int f30326e;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Lvj/h$a;", "", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: vj.h$a */
    /* loaded from: classes8.dex */
    public static final class C13556a {
        private C13556a() {
        }

        public /* synthetic */ C13556a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"vj/h$b", "Luj/a;", "", "f", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: vj.h$b */
    /* loaded from: classes8.dex */
    public static final class C13557b extends AbstractC13366a {
        C13557b(String str) {
            super(str, false, 2, null);
        }

        @Override // p373uj.AbstractC13366a
        /* renamed from: f */
        public long mo469f() {
            return C13555h.this.m3363b(System.nanoTime());
        }
    }

    public C13555h(C13370e taskRunner, int i, long j, TimeUnit timeUnit) {
        boolean z;
        C9971q.m14633g(taskRunner, "taskRunner");
        C9971q.m14633g(timeUnit, "timeUnit");
        this.f30326e = i;
        this.f30322a = timeUnit.toNanos(j);
        this.f30323b = taskRunner.m3816i();
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
        }
    }

    /* renamed from: d */
    private final int m3361d(C13549f fVar, long j) {
        if (!C12729c.f28589h || Thread.holdsLock(fVar)) {
            List<Reference<C13545e>> n = fVar.m3377n();
            int i = 0;
            while (i < n.size()) {
                Reference<C13545e> reference = n.get(i);
                if (reference.get() != null) {
                    i++;
                } else {
                    C1457k.f517c.m41079g().mo41089m("A connection to " + fVar.m3396A().m7268a().m7399l() + " was leaked. Did you forget to close a response body?", ((C13545e.C13547b) reference).m3397a());
                    n.remove(i);
                    fVar.m3393D(true);
                    if (n.isEmpty()) {
                        fVar.m3394C(j - this.f30322a);
                        return 0;
                    }
                }
            }
            return n.size();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(fVar);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: a */
    public final boolean m3364a(C12208a address, C13545e call, List<C12248r> list, boolean z) {
        C9971q.m14633g(address, "address");
        C9971q.m14633g(call, "call");
        Iterator<C13549f> it = this.f30325d.iterator();
        while (it.hasNext()) {
            C13549f connection = it.next();
            C9971q.m14634f(connection, "connection");
            synchronized (connection) {
                if (z) {
                    if (!connection.m3369v()) {
                        Unit unit = Unit.f22042a;
                    }
                }
                if (connection.m3371t(address, list)) {
                    call.m3424d(connection);
                    return true;
                }
                Unit unit2 = Unit.f22042a;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long m3363b(long j) {
        Iterator<C13549f> it = this.f30325d.iterator();
        int i = 0;
        long j2 = Long.MIN_VALUE;
        C13549f fVar = null;
        int i2 = 0;
        while (it.hasNext()) {
            C13549f connection = it.next();
            C9971q.m14634f(connection, "connection");
            synchronized (connection) {
                if (m3361d(connection, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long o = j - connection.m3376o();
                    if (o > j2) {
                        Unit unit = Unit.f22042a;
                        fVar = connection;
                        j2 = o;
                    } else {
                        Unit unit2 = Unit.f22042a;
                    }
                }
            }
        }
        long j3 = this.f30322a;
        if (j2 >= j3 || i > this.f30326e) {
            C9971q.m14636d(fVar);
            synchronized (fVar) {
                if (!fVar.m3377n().isEmpty()) {
                    return 0L;
                }
                if (fVar.m3376o() + j2 != j) {
                    return 0L;
                }
                fVar.m3393D(true);
                this.f30325d.remove(fVar);
                C12729c.m5607k(fVar.m3392E());
                if (this.f30325d.isEmpty()) {
                    this.f30323b.m3838a();
                }
                return 0L;
            }
        } else if (i > 0) {
            return j3 - j2;
        } else {
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
    }

    /* renamed from: c */
    public final boolean m3362c(C13549f connection) {
        C9971q.m14633g(connection, "connection");
        if (C12729c.f28589h && !Thread.holdsLock(connection)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9971q.m14634f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(connection);
            throw new AssertionError(sb2.toString());
        } else if (connection.m3375p() || this.f30326e == 0) {
            connection.m3393D(true);
            this.f30325d.remove(connection);
            if (this.f30325d.isEmpty()) {
                this.f30323b.m3838a();
            }
            return true;
        } else {
            C13369d.m3829j(this.f30323b, this.f30324c, 0L, 2, null);
            return false;
        }
    }

    /* renamed from: e */
    public final void m3360e(C13549f connection) {
        C9971q.m14633g(connection, "connection");
        if (!C12729c.f28589h || Thread.holdsLock(connection)) {
            this.f30325d.add(connection);
            C13369d.m3829j(this.f30323b, this.f30324c, 0L, 2, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9971q.m14634f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(connection);
        throw new AssertionError(sb2.toString());
    }
}
