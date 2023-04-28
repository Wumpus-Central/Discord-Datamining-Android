package kotlinx.coroutines.scheduling;

import cg.AbstractC4002c;
import com.facebook.react.uimanager.ViewDefaults;
import eg.C6884j;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C10010c;
import kotlinx.coroutines.C10149n0;
import kotlinx.coroutines.internal.C10081a0;
import kotlinx.coroutines.internal.C10087d0;

@Metadata(m15074d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0003RSTB+\u0012\u0006\u0010>\u001a\u00020\f\u0012\u0006\u0010?\u001a\u00020\f\u0012\b\b\u0002\u0010B\u001a\u00020\u0013\u0012\b\b\u0002\u0010E\u001a\u000207¢\u0006\u0004\bP\u0010QJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\nJ)\u0010!\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\u00102\n\u0010'\u001a\u00060%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J-\u00102\u001a\u00020\u00102\n\u0010/\u001a\u00060%j\u0002`&2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020\u00032\n\u0010/\u001a\u00060%j\u0002`&2\u0006\u00101\u001a\u000200¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0010¢\u0006\u0004\b6\u0010+J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010=R\u0014\u0010B\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u0002078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010HR\u001e\u0010N\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000K8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0011\u0010O\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bO\u0010\u0018¨\u0006U"}, m15073d2 = {"Lkotlinx/coroutines/scheduling/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/scheduling/h;", "task", "", "b", "(Lkotlinx/coroutines/scheduling/h;)Z", "Lkotlinx/coroutines/scheduling/a$c;", "r", "()Lkotlinx/coroutines/scheduling/a$c;", "worker", "", "p", "(Lkotlinx/coroutines/scheduling/a$c;)I", "skipUnpark", "", "H", "(Z)V", "", "state", "S", "(J)Z", "Y", "()Z", "g", "()I", "tailDispatch", "R", "(Lkotlinx/coroutines/scheduling/a$c;Lkotlinx/coroutines/scheduling/h;Z)Lkotlinx/coroutines/scheduling/h;", "i", "oldIndex", "newIndex", "t", "(Lkotlinx/coroutines/scheduling/a$c;II)V", "s", "(Lkotlinx/coroutines/scheduling/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "C", "(J)V", "block", "Lkotlinx/coroutines/scheduling/i;", "taskContext", "l", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;Z)V", "h", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;)Lkotlinx/coroutines/scheduling/h;", "Q", "", "toString", "()Ljava/lang/String;", "z", "(Lkotlinx/coroutines/scheduling/h;)V", "k", "I", "corePoolSize", "maxPoolSize", "m", "J", "idleWorkerKeepAliveNs", "n", "Ljava/lang/String;", "schedulerName", "Lkotlinx/coroutines/scheduling/d;", "o", "Lkotlinx/coroutines/scheduling/d;", "globalCpuQueue", "globalBlockingQueue", "Lkotlinx/coroutines/internal/a0;", "q", "Lkotlinx/coroutines/internal/a0;", "workers", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", "a", "c", "d", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.a */
/* loaded from: classes8.dex */
public final class ExecutorC10173a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: k */
    public final int f22381k;

    /* renamed from: l */
    public final int f22382l;

    /* renamed from: m */
    public final long f22383m;

    /* renamed from: n */
    public final String f22384n;

    /* renamed from: o */
    public final C10179d f22385o;

    /* renamed from: p */
    public final C10179d f22386p;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: q */
    public final C10081a0<C10175c> f22387q;

    /* renamed from: r */
    public static final C0311a f22376r = new C0311a(null);

    /* renamed from: v */
    public static final C10087d0 f22380v = new C10087d0("NOT_IN_STACK");

    /* renamed from: s */
    private static final /* synthetic */ AtomicLongFieldUpdater f22377s = AtomicLongFieldUpdater.newUpdater(ExecutorC10173a.class, "parkedWorkersStack");

    /* renamed from: t */
    static final /* synthetic */ AtomicLongFieldUpdater f22378t = AtomicLongFieldUpdater.newUpdater(ExecutorC10173a.class, "controlState");

    /* renamed from: u */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22379u = AtomicIntegerFieldUpdater.newUpdater(ExecutorC10173a.class, "_isTerminated");

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, m15073d2 = {"Lkotlinx/coroutines/scheduling/a$a;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lkotlinx/coroutines/internal/d0;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/d0;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    /* loaded from: classes8.dex */
    public static final class C0311a {
        private C0311a() {
        }

        public /* synthetic */ C0311a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* renamed from: kotlinx.coroutines.scheduling.a$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C10174b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22388a;

        static {
            int[] iArr = new int[EnumC10176d.values().length];
            iArr[EnumC10176d.PARKING.ordinal()] = 1;
            iArr[EnumC10176d.BLOCKING.ordinal()] = 2;
            iArr[EnumC10176d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[EnumC10176d.DORMANT.ordinal()] = 4;
            iArr[EnumC10176d.TERMINATED.ordinal()] = 5;
            f22388a = iArr;
        }
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m15073d2 = {"Lkotlinx/coroutines/scheduling/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "k", "l", "m", "n", "o", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.a$d */
    /* loaded from: classes8.dex */
    public enum EnumC10176d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC10173a(int i, int i2, long j, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f22381k = i;
        this.f22382l = i2;
        this.f22383m = j;
        this.f22384n = str;
        boolean z4 = true;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j <= 0 ? false : z4) {
                        this.f22385o = new C10179d();
                        this.f22386p = new C10179d();
                        this.parkedWorkersStack = 0L;
                        this.f22387q = new C10081a0<>(i + 1);
                        this.controlState = i << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: H */
    private final void m14096H(boolean z) {
        long addAndGet = f22378t.addAndGet(this, 2097152L);
        if (!z && !m14091Y() && !m14093S(addAndGet)) {
            m14091Y();
        }
    }

    /* renamed from: R */
    private final AbstractRunnableC10183h m14094R(C10175c cVar, AbstractRunnableC10183h hVar, boolean z) {
        if (cVar == null) {
            return hVar;
        }
        if (cVar.f22391l == EnumC10176d.TERMINATED) {
            return hVar;
        }
        if (hVar.f22413l.mo14053b() == 0 && cVar.f22391l == EnumC10176d.BLOCKING) {
            return hVar;
        }
        cVar.f22395p = true;
        return cVar.f22390k.m14050a(hVar, z);
    }

    /* renamed from: S */
    private final boolean m14093S(long j) {
        int c;
        c = C6884j.m23961c(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0);
        if (c < this.f22381k) {
            int g = m14089g();
            if (g == 1 && this.f22381k > 1) {
                m14089g();
            }
            if (g > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: U */
    static /* synthetic */ boolean m14092U(ExecutorC10173a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.controlState;
        }
        return aVar.m14093S(j);
    }

    /* renamed from: Y */
    private final boolean m14091Y() {
        C10175c r;
        do {
            r = m14083r();
            if (r == null) {
                return false;
            }
        } while (!C10175c.f22389r.compareAndSet(r, -1, 0));
        LockSupport.unpark(r);
        return true;
    }

    /* renamed from: b */
    private final boolean m14090b(AbstractRunnableC10183h hVar) {
        boolean z = true;
        if (hVar.f22413l.mo14053b() != 1) {
            z = false;
        }
        if (z) {
            return this.f22386p.m14231a(hVar);
        }
        return this.f22385o.m14231a(hVar);
    }

    /* renamed from: g */
    private final int m14089g() {
        int c;
        boolean z;
        synchronized (this.f22387q) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            boolean z2 = false;
            c = C6884j.m23961c(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (c >= this.f22381k) {
                return 0;
            }
            if (i >= this.f22382l) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 <= 0 || this.f22387q.m14340b(i2) != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C10175c cVar = new C10175c(this, i2);
                this.f22387q.m14339c(i2, cVar);
                if (i2 == ((int) (2097151 & f22378t.incrementAndGet(this)))) {
                    z2 = true;
                }
                if (z2) {
                    cVar.start();
                    return c + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: i */
    private final C10175c m14087i() {
        C10175c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C10175c) {
            cVar = (C10175c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !C9971q.m14638b(ExecutorC10173a.this, this)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: n */
    public static /* synthetic */ void m14085n(ExecutorC10173a aVar, Runnable runnable, AbstractC10184i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = C10187l.f22421f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.m14086l(runnable, iVar, z);
    }

    /* renamed from: p */
    private final int m14084p(C10175c cVar) {
        Object h = cVar.m14072h();
        while (h != f22380v) {
            if (h == null) {
                return 0;
            }
            C10175c cVar2 = (C10175c) h;
            int g = cVar2.m14073g();
            if (g != 0) {
                return g;
            }
            h = cVar2.m14072h();
        }
        return -1;
    }

    /* renamed from: r */
    private final C10175c m14083r() {
        while (true) {
            long j = this.parkedWorkersStack;
            C10175c b = this.f22387q.m14340b((int) (2097151 & j));
            if (b == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int p = m14084p(b);
            if (p >= 0 && f22377s.compareAndSet(this, j, p | j2)) {
                b.m14064p(f22380v);
                return b;
            }
        }
    }

    /* renamed from: C */
    public final void m14097C(long j) {
        int i;
        AbstractRunnableC10183h hVar;
        if (f22379u.compareAndSet(this, 0, 1)) {
            C10175c i2 = m14087i();
            synchronized (this.f22387q) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i3 = 1;
                while (true) {
                    C10175c b = this.f22387q.m14340b(i3);
                    C9971q.m14636d(b);
                    C10175c cVar = b;
                    if (cVar != i2) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        cVar.f22390k.m14044g(this.f22386p);
                    }
                    if (i3 == i) {
                        break;
                    }
                    i3++;
                }
            }
            this.f22386p.m14230b();
            this.f22385o.m14230b();
            while (true) {
                if (i2 != null) {
                    hVar = i2.m14074f(true);
                    if (hVar != null) {
                        continue;
                        m14080z(hVar);
                    }
                }
                hVar = this.f22385o.m14228d();
                if (hVar == null && (hVar = this.f22386p.m14228d()) == null) {
                    break;
                }
                m14080z(hVar);
            }
            if (i2 != null) {
                i2.m14061s(EnumC10176d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    /* renamed from: Q */
    public final void m14095Q() {
        if (!m14091Y() && !m14092U(this, 0L, 1, null)) {
            m14091Y();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m14097C(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m14085n(this, runnable, null, false, 6, null);
    }

    /* renamed from: h */
    public final AbstractRunnableC10183h m14088h(Runnable runnable, AbstractC10184i iVar) {
        long a = C10187l.f22420e.mo14055a();
        if (!(runnable instanceof AbstractRunnableC10183h)) {
            return new C10186k(runnable, a, iVar);
        }
        AbstractRunnableC10183h hVar = (AbstractRunnableC10183h) runnable;
        hVar.f22412k = a;
        hVar.f22413l = iVar;
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: l */
    public final void m14086l(Runnable runnable, AbstractC10184i iVar, boolean z) {
        boolean z2;
        C10010c.m14496a();
        AbstractRunnableC10183h h = m14088h(runnable, iVar);
        C10175c i = m14087i();
        AbstractRunnableC10183h R = m14094R(i, h, z);
        if (R == null || m14090b(R)) {
            if (!z || i == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (h.f22413l.mo14053b() != 0) {
                m14096H(z2);
            } else if (!z2) {
                m14095Q();
            }
        } else {
            throw new RejectedExecutionException(this.f22384n + " was terminated");
        }
    }

    /* renamed from: s */
    public final boolean m14082s(C10175c cVar) {
        long j;
        int g;
        if (cVar.m14072h() != f22380v) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            g = cVar.m14073g();
            cVar.m14064p(this.f22387q.m14340b((int) (2097151 & j)));
        } while (!f22377s.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | g));
        return true;
    }

    /* renamed from: t */
    public final void m14081t(C10175c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = m14084p(cVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && f22377s.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.f22387q.m14341a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            C10175c b = this.f22387q.m14340b(i6);
            if (b != null) {
                int f = b.f22390k.m14045f();
                int i7 = C10174b.f22388a[b.f22391l.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(f);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (f > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(f);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.f22384n + '@' + C10149n0.m14164b(this) + "[Pool Size {core = " + this.f22381k + ", max = " + this.f22382l + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f22385o.m14229c() + ", global blocking queue size = " + this.f22386p.m14229c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f22381k - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: z */
    public final void m14080z(AbstractRunnableC10183h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\b@\u0010BJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0019R*\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0011R\u0014\u0010/\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010.R\u0016\u00101\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00103R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010<\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0016\u0010=\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\u0016\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u0010>¨\u0006C"}, m15073d2 = {"Lkotlinx/coroutines/scheduling/a$c;", "Ljava/lang/Thread;", "", "q", "()Z", "", "n", "()V", "r", "j", "Lkotlinx/coroutines/scheduling/h;", "task", "d", "(Lkotlinx/coroutines/scheduling/h;)V", "", "taskMode", "c", "(I)V", "b", "l", "u", "mode", "i", "scanLocalQueue", "e", "(Z)Lkotlinx/coroutines/scheduling/h;", "m", "()Lkotlinx/coroutines/scheduling/h;", "blockingOnly", "t", "Lkotlinx/coroutines/scheduling/a$d;", "newState", "s", "(Lkotlinx/coroutines/scheduling/a$d;)Z", "run", "upperBound", "k", "(I)I", "f", "index", "indexInArray", "I", "g", "()I", "o", "Lkotlinx/coroutines/scheduling/o;", "Lkotlinx/coroutines/scheduling/o;", "localQueue", "Lkotlinx/coroutines/scheduling/a$d;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "mayHaveLocalTasks", "<init>", "(Lkotlinx/coroutines/scheduling/a;)V", "(Lkotlinx/coroutines/scheduling/a;I)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.a$c */
    /* loaded from: classes8.dex */
    public final class C10175c extends Thread {

        /* renamed from: r */
        static final /* synthetic */ AtomicIntegerFieldUpdater f22389r = AtomicIntegerFieldUpdater.newUpdater(C10175c.class, "workerCtl");
        private volatile int indexInArray;

        /* renamed from: k */
        public final C10190o f22390k;

        /* renamed from: l */
        public EnumC10176d f22391l;

        /* renamed from: m */
        private long f22392m;

        /* renamed from: n */
        private long f22393n;
        private volatile Object nextParkedWorker;

        /* renamed from: o */
        private int f22394o;

        /* renamed from: p */
        public boolean f22395p;
        volatile /* synthetic */ int workerCtl;

        private C10175c() {
            setDaemon(true);
            this.f22390k = new C10190o();
            this.f22391l = EnumC10176d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = ExecutorC10173a.f22380v;
            this.f22394o = AbstractC4002c.f6576k.mo33125c();
        }

        /* renamed from: b */
        private final void m14078b(int i) {
            if (i != 0) {
                ExecutorC10173a.f22378t.addAndGet(ExecutorC10173a.this, -2097152L);
                if (this.f22391l != EnumC10176d.TERMINATED) {
                    this.f22391l = EnumC10176d.DORMANT;
                }
            }
        }

        /* renamed from: c */
        private final void m14077c(int i) {
            if (i != 0 && m14061s(EnumC10176d.BLOCKING)) {
                ExecutorC10173a.this.m14095Q();
            }
        }

        /* renamed from: d */
        private final void m14076d(AbstractRunnableC10183h hVar) {
            int b = hVar.f22413l.mo14053b();
            m14071i(b);
            m14077c(b);
            ExecutorC10173a.this.m14080z(hVar);
            m14078b(b);
        }

        /* renamed from: e */
        private final AbstractRunnableC10183h m14075e(boolean z) {
            boolean z2;
            AbstractRunnableC10183h m;
            AbstractRunnableC10183h m2;
            if (z) {
                if (m14069k(ExecutorC10173a.this.f22381k * 2) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (m2 = m14067m()) != null) {
                    return m2;
                }
                AbstractRunnableC10183h h = this.f22390k.m14043h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (m = m14067m()) != null) {
                    return m;
                }
            } else {
                AbstractRunnableC10183h m3 = m14067m();
                if (m3 != null) {
                    return m3;
                }
            }
            return m14060t(false);
        }

        /* renamed from: i */
        private final void m14071i(int i) {
            this.f22392m = 0L;
            if (this.f22391l == EnumC10176d.PARKING) {
                this.f22391l = EnumC10176d.BLOCKING;
            }
        }

        /* renamed from: j */
        private final boolean m14070j() {
            return this.nextParkedWorker != ExecutorC10173a.f22380v;
        }

        /* renamed from: l */
        private final void m14068l() {
            if (this.f22392m == 0) {
                this.f22392m = System.nanoTime() + ExecutorC10173a.this.f22383m;
            }
            LockSupport.parkNanos(ExecutorC10173a.this.f22383m);
            if (System.nanoTime() - this.f22392m >= 0) {
                this.f22392m = 0L;
                m14059u();
            }
        }

        /* renamed from: m */
        private final AbstractRunnableC10183h m14067m() {
            if (m14069k(2) == 0) {
                AbstractRunnableC10183h d = ExecutorC10173a.this.f22385o.m14228d();
                if (d != null) {
                    return d;
                }
                return ExecutorC10173a.this.f22386p.m14228d();
            }
            AbstractRunnableC10183h d2 = ExecutorC10173a.this.f22386p.m14228d();
            if (d2 != null) {
                return d2;
            }
            return ExecutorC10173a.this.f22385o.m14228d();
        }

        /* renamed from: n */
        private final void m14066n() {
            loop0: while (true) {
                boolean z = false;
                while (!ExecutorC10173a.this.isTerminated() && this.f22391l != EnumC10176d.TERMINATED) {
                    AbstractRunnableC10183h f = m14074f(this.f22395p);
                    if (f != null) {
                        this.f22393n = 0L;
                        m14076d(f);
                    } else {
                        this.f22395p = false;
                        if (this.f22393n == 0) {
                            m14062r();
                        } else if (!z) {
                            z = true;
                        } else {
                            m14061s(EnumC10176d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f22393n);
                            this.f22393n = 0L;
                        }
                    }
                }
            }
            m14061s(EnumC10176d.TERMINATED);
        }

        /* renamed from: q */
        private final boolean m14063q() {
            boolean z;
            if (this.f22391l == EnumC10176d.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC10173a aVar = ExecutorC10173a.this;
            while (true) {
                long j = aVar.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                    if (ExecutorC10173a.f22378t.compareAndSet(aVar, j, j - 4398046511104L)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.f22391l = EnumC10176d.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: r */
        private final void m14062r() {
            if (!m14070j()) {
                ExecutorC10173a.this.m14082s(this);
                return;
            }
            this.workerCtl = -1;
            while (m14070j() && this.workerCtl == -1 && !ExecutorC10173a.this.isTerminated() && this.f22391l != EnumC10176d.TERMINATED) {
                m14061s(EnumC10176d.PARKING);
                Thread.interrupted();
                m14068l();
            }
        }

        /* renamed from: t */
        private final AbstractRunnableC10183h m14060t(boolean z) {
            long j;
            int i = (int) (ExecutorC10173a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int k = m14069k(i);
            ExecutorC10173a aVar = ExecutorC10173a.this;
            long j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                k++;
                if (k > i) {
                    k = 1;
                }
                C10175c b = aVar.f22387q.m14340b(k);
                if (!(b == null || b == this)) {
                    if (z) {
                        j = this.f22390k.m14040k(b.f22390k);
                    } else {
                        j = this.f22390k.m14039l(b.f22390k);
                    }
                    if (j == -1) {
                        return this.f22390k.m14043h();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f22393n = j2;
            return null;
        }

        /* renamed from: u */
        private final void m14059u() {
            ExecutorC10173a aVar = ExecutorC10173a.this;
            synchronized (aVar.f22387q) {
                if (!aVar.isTerminated()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f22381k) {
                        if (f22389r.compareAndSet(this, -1, 1)) {
                            int i = this.indexInArray;
                            m14065o(0);
                            aVar.m14081t(this, i, 0);
                            int andDecrement = (int) (ExecutorC10173a.f22378t.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != i) {
                                C10175c b = aVar.f22387q.m14340b(andDecrement);
                                C9971q.m14636d(b);
                                C10175c cVar = b;
                                aVar.f22387q.m14339c(i, cVar);
                                cVar.m14065o(i);
                                aVar.m14081t(cVar, andDecrement, i);
                            }
                            aVar.f22387q.m14339c(andDecrement, null);
                            Unit unit = Unit.f22042a;
                            this.f22391l = EnumC10176d.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public final AbstractRunnableC10183h m14074f(boolean z) {
            AbstractRunnableC10183h hVar;
            if (m14063q()) {
                return m14075e(z);
            }
            if (z) {
                hVar = this.f22390k.m14043h();
                if (hVar == null) {
                    hVar = ExecutorC10173a.this.f22386p.m14228d();
                }
            } else {
                hVar = ExecutorC10173a.this.f22386p.m14228d();
            }
            if (hVar == null) {
                return m14060t(true);
            }
            return hVar;
        }

        /* renamed from: g */
        public final int m14073g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object m14072h() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final int m14069k(int i) {
            int i2 = this.f22394o;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f22394o = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & ViewDefaults.NUMBER_OF_LINES) % i;
        }

        /* renamed from: o */
        public final void m14065o(int i) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ExecutorC10173a.this.f22384n);
            sb2.append("-worker-");
            if (i == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i);
            }
            sb2.append(str);
            setName(sb2.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void m14064p(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m14066n();
        }

        /* renamed from: s */
        public final boolean m14061s(EnumC10176d dVar) {
            boolean z;
            EnumC10176d dVar2 = this.f22391l;
            if (dVar2 == EnumC10176d.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ExecutorC10173a.f22378t.addAndGet(ExecutorC10173a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f22391l = dVar;
            }
            return z;
        }

        public C10175c(ExecutorC10173a aVar, int i) {
            this();
            m14065o(i);
        }
    }
}
