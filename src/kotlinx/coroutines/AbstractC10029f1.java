package kotlinx.coroutines;

import androidx.concurrent.futures.C2113b;
import eg.C6882h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.AbstractC10169s0;
import kotlinx.coroutines.internal.AbstractC10102j0;
import kotlinx.coroutines.internal.C10087d0;
import kotlinx.coroutines.internal.C10100i0;
import kotlinx.coroutines.internal.C10118s;

@Metadata(m15074d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:;B\u0007¢\u0006\u0004\b7\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0004¢\u0006\u0004\b,\u0010\rR$\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010#¨\u0006<"}, m15073d2 = {"Lkotlinx/coroutines/f1;", "Lkotlinx/coroutines/g1;", "Lkotlinx/coroutines/s0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "d1", "(Ljava/lang/Runnable;)Z", "b1", "()Ljava/lang/Runnable;", "", "a1", "()V", "Lkotlinx/coroutines/f1$c;", "l1", "(Lkotlinx/coroutines/f1$c;)Z", "", "now", "delayedTask", "", "i1", "(JLkotlinx/coroutines/f1$c;)I", "f1", "shutdown", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "t", "(JLkotlinx/coroutines/CancellableContinuation;)V", "block", "Lkotlinx/coroutines/a1;", "j1", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/a1;", "T0", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "G0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "c1", "(Ljava/lang/Runnable;)V", "h1", "(JLkotlinx/coroutines/f1$c;)V", "g1", "value", "g", "()Z", "k1", "(Z)V", "isCompleted", "e1", "isEmpty", "O0", "nextTime", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.f1 */
/* loaded from: classes8.dex */
public abstract class AbstractC10029f1 extends AbstractC10070g1 implements AbstractC10169s0 {

    /* renamed from: p */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22166p = AtomicReferenceFieldUpdater.newUpdater(AbstractC10029f1.class, Object.class, "_queue");

    /* renamed from: q */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22167q = AtomicReferenceFieldUpdater.newUpdater(AbstractC10029f1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m15073d2 = {"Lkotlinx/coroutines/f1$a;", "Lkotlinx/coroutines/f1$c;", "", "run", "", "toString", "Lkotlinx/coroutines/CancellableContinuation;", "m", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "nanoTime", "<init>", "(Lkotlinx/coroutines/f1;JLkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.f1$a */
    /* loaded from: classes8.dex */
    private final class C10030a extends AbstractRunnableC10032c {

        /* renamed from: m */
        private final CancellableContinuation<Unit> f22168m;

        /* JADX WARN: Multi-variable type inference failed */
        public C10030a(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
            super(j);
            this.f22168m = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22168m.mo14120v(AbstractC10029f1.this, Unit.f22042a);
        }

        @Override // kotlinx.coroutines.AbstractC10029f1.AbstractRunnableC10032c
        public String toString() {
            return super.toString() + this.f22168m;
        }
    }

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m15073d2 = {"Lkotlinx/coroutines/f1$b;", "Lkotlinx/coroutines/f1$c;", "", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "m", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.f1$b */
    /* loaded from: classes8.dex */
    private static final class C10031b extends AbstractRunnableC10032c {

        /* renamed from: m */
        private final Runnable f22170m;

        public C10031b(long j, Runnable runnable) {
            super(j);
            this.f22170m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22170m.run();
        }

        @Override // kotlinx.coroutines.AbstractC10029f1.AbstractRunnableC10032c
        public String toString() {
            return super.toString() + this.f22170m;
        }
    }

    @Metadata(m15074d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, m15073d2 = {"Lkotlinx/coroutines/f1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/a1;", "Lkotlinx/coroutines/internal/j0;", "other", "", "d", "", "now", "", "f", "Lkotlinx/coroutines/f1$d;", "delayed", "Lkotlinx/coroutines/f1;", "eventLoop", "e", "", "dispose", "", "toString", "k", "J", "nanoTime", "", "_heap", "Ljava/lang/Object;", "l", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lkotlinx/coroutines/internal/i0;", "value", "b", "()Lkotlinx/coroutines/internal/i0;", "a", "(Lkotlinx/coroutines/internal/i0;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.f1$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractRunnableC10032c implements Runnable, Comparable<AbstractRunnableC10032c>, AbstractC10000a1, AbstractC10102j0 {
        private volatile Object _heap;

        /* renamed from: k */
        public long f22171k;

        /* renamed from: l */
        private int f22172l = -1;

        public AbstractRunnableC10032c(long j) {
            this.f22171k = j;
        }

        @Override // kotlinx.coroutines.internal.AbstractC10102j0
        /* renamed from: a */
        public void mo14277a(C10100i0<?> i0Var) {
            C10087d0 d0Var;
            boolean z;
            Object obj = this._heap;
            d0Var = C10078i1.f22263a;
            if (obj != d0Var) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this._heap = i0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.internal.AbstractC10102j0
        /* renamed from: b */
        public C10100i0<?> mo14276b() {
            Object obj = this._heap;
            if (obj instanceof C10100i0) {
                return (C10100i0) obj;
            }
            return null;
        }

        /* renamed from: d */
        public int compareTo(AbstractRunnableC10032c cVar) {
            int i = ((this.f22171k - cVar.f22171k) > 0L ? 1 : ((this.f22171k - cVar.f22171k) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.AbstractC10000a1
        public final synchronized void dispose() {
            C10087d0 d0Var;
            C10033d dVar;
            C10087d0 d0Var2;
            Object obj = this._heap;
            d0Var = C10078i1.f22263a;
            if (obj != d0Var) {
                if (obj instanceof C10033d) {
                    dVar = (C10033d) obj;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.m14285g(this);
                }
                d0Var2 = C10078i1.f22263a;
                this._heap = d0Var2;
            }
        }

        /* renamed from: e */
        public final synchronized int m14436e(long j, C10033d dVar, AbstractC10029f1 f1Var) {
            C10087d0 d0Var;
            Object obj = this._heap;
            d0Var = C10078i1.f22263a;
            if (obj == d0Var) {
                return 2;
            }
            synchronized (dVar) {
                AbstractRunnableC10032c b = dVar.m14290b();
                if (f1Var.m14444g()) {
                    return 1;
                }
                if (b == null) {
                    dVar.f22173b = j;
                } else {
                    long j2 = b.f22171k;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - dVar.f22173b > 0) {
                        dVar.f22173b = j;
                    }
                }
                long j3 = this.f22171k;
                long j4 = dVar.f22173b;
                if (j3 - j4 < 0) {
                    this.f22171k = j4;
                }
                dVar.m14291a(this);
                return 0;
            }
        }

        /* renamed from: f */
        public final boolean m14435f(long j) {
            return j - this.f22171k >= 0;
        }

        @Override // kotlinx.coroutines.internal.AbstractC10102j0
        public int getIndex() {
            return this.f22172l;
        }

        @Override // kotlinx.coroutines.internal.AbstractC10102j0
        public void setIndex(int i) {
            this.f22172l = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f22171k + ']';
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m15073d2 = {"Lkotlinx/coroutines/f1$d;", "Lkotlinx/coroutines/internal/i0;", "Lkotlinx/coroutines/f1$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.f1$d */
    /* loaded from: classes8.dex */
    public static final class C10033d extends C10100i0<AbstractRunnableC10032c> {

        /* renamed from: b */
        public long f22173b;

        public C10033d(long j) {
            this.f22173b = j;
        }
    }

    /* renamed from: a1 */
    private final void m14449a1() {
        C10087d0 d0Var;
        C10087d0 d0Var2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22166p;
                d0Var = C10078i1.f22264b;
                if (C2113b.m38965a(atomicReferenceFieldUpdater, this, null, d0Var)) {
                    return;
                }
            } else if (obj instanceof C10118s) {
                ((C10118s) obj).m14224d();
                return;
            } else {
                d0Var2 = C10078i1.f22264b;
                if (obj != d0Var2) {
                    C10118s sVar = new C10118s(8, true);
                    sVar.m14227a((Runnable) obj);
                    if (C2113b.m38965a(f22166p, this, obj, sVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b1 */
    private final Runnable m14448b1() {
        C10087d0 d0Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C10118s) {
                C10118s sVar = (C10118s) obj;
                Object j = sVar.m14218j();
                if (j != C10118s.f22323h) {
                    return (Runnable) j;
                }
                C2113b.m38965a(f22166p, this, obj, sVar.m14219i());
            } else {
                d0Var = C10078i1.f22264b;
                if (obj == d0Var) {
                    return null;
                }
                if (C2113b.m38965a(f22166p, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: d1 */
    private final boolean m14447d1(Runnable runnable) {
        C10087d0 d0Var;
        while (true) {
            Object obj = this._queue;
            if (m14444g()) {
                return false;
            }
            if (obj == null) {
                if (C2113b.m38965a(f22166p, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C10118s) {
                C10118s sVar = (C10118s) obj;
                int a = sVar.m14227a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    C2113b.m38965a(f22166p, this, obj, sVar.m14219i());
                } else if (a == 2) {
                    return false;
                }
            } else {
                d0Var = C10078i1.f22264b;
                if (obj == d0Var) {
                    return false;
                }
                C10118s sVar2 = new C10118s(8, true);
                sVar2.m14227a((Runnable) obj);
                sVar2.m14227a(runnable);
                if (C2113b.m38965a(f22166p, this, obj, sVar2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: f1 */
    private final void m14445f1() {
        AbstractRunnableC10032c i;
        C10010c.m14496a();
        long nanoTime = System.nanoTime();
        while (true) {
            C10033d dVar = (C10033d) this._delayed;
            if (dVar != null && (i = dVar.m14283i()) != null) {
                mo14160X0(nanoTime, i);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: g */
    public final boolean m14444g() {
        return this._isCompleted;
    }

    /* renamed from: i1 */
    private final int m14441i1(long j, AbstractRunnableC10032c cVar) {
        if (m14444g()) {
            return 1;
        }
        C10033d dVar = (C10033d) this._delayed;
        if (dVar == null) {
            C2113b.m38965a(f22167q, this, null, new C10033d(j));
            Object obj = this._delayed;
            C9971q.m14636d(obj);
            dVar = (C10033d) obj;
        }
        return cVar.m14436e(j, dVar, this);
    }

    /* renamed from: k1 */
    private final void m14439k1(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: l1 */
    private final boolean m14438l1(AbstractRunnableC10032c cVar) {
        C10033d dVar = (C10033d) this._delayed;
        return (dVar != null ? dVar.m14287e() : null) == cVar;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: G0 */
    public final void mo4546G0(CoroutineContext coroutineContext, Runnable runnable) {
        mo14159c1(runnable);
    }

    @Override // kotlinx.coroutines.AbstractC10022e1
    /* renamed from: O0 */
    protected long mo14452O0() {
        AbstractRunnableC10032c e;
        C10087d0 d0Var;
        if (super.mo14452O0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C10118s)) {
                d0Var = C10078i1.f22264b;
                if (obj == d0Var) {
                    return Long.MAX_VALUE;
                }
                return 0L;
            } else if (!((C10118s) obj).m14221g()) {
                return 0L;
            }
        }
        C10033d dVar = (C10033d) this._delayed;
        if (dVar == null || (e = dVar.m14287e()) == null) {
            return Long.MAX_VALUE;
        }
        long j = e.f22171k;
        C10010c.m14496a();
        return C6882h.m23977d(j - System.nanoTime(), 0L);
    }

    @Override // kotlinx.coroutines.AbstractC10169s0
    /* renamed from: R */
    public AbstractC10000a1 mo4537R(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return AbstractC10169s0.C10170a.m14098a(this, j, runnable, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    @Override // kotlinx.coroutines.AbstractC10022e1
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo14451T0() {
        /*
            r9 = this;
            boolean r0 = r9.m14466U0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.f1$d r0 = (kotlinx.coroutines.AbstractC10029f1.C10033d) r0
            if (r0 == 0) goto L_0x0045
            boolean r3 = r0.m14288d()
            if (r3 != 0) goto L_0x0045
            kotlinx.coroutines.C10010c.m14496a()
            long r3 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.j0 r5 = r0.m14290b()     // Catch: all -> 0x0042
            r6 = 0
            if (r5 != 0) goto L_0x0026
            monitor-exit(r0)
            goto L_0x003d
        L_0x0026:
            kotlinx.coroutines.f1$c r5 = (kotlinx.coroutines.AbstractC10029f1.AbstractRunnableC10032c) r5     // Catch: all -> 0x0042
            boolean r7 = r5.m14435f(r3)     // Catch: all -> 0x0042
            r8 = 0
            if (r7 == 0) goto L_0x0034
            boolean r5 = r9.m14447d1(r5)     // Catch: all -> 0x0042
            goto L_0x0035
        L_0x0034:
            r5 = r8
        L_0x0035:
            if (r5 == 0) goto L_0x003c
            kotlinx.coroutines.internal.j0 r5 = r0.m14284h(r8)     // Catch: all -> 0x0042
            r6 = r5
        L_0x003c:
            monitor-exit(r0)
        L_0x003d:
            kotlinx.coroutines.f1$c r6 = (kotlinx.coroutines.AbstractC10029f1.AbstractRunnableC10032c) r6
            if (r6 != 0) goto L_0x001c
            goto L_0x0045
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0045:
            java.lang.Runnable r0 = r9.m14448b1()
            if (r0 == 0) goto L_0x004f
            r0.run()
            return r1
        L_0x004f:
            long r0 = r9.mo14452O0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC10029f1.mo14451T0():long");
    }

    /* renamed from: c1 */
    public void mo14159c1(Runnable runnable) {
        if (m14447d1(runnable)) {
            m14354Y0();
        } else {
            RunnableC10153o0.f22357r.mo14159c1(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e1 */
    public boolean m14446e1() {
        C10087d0 d0Var;
        if (!m14467S0()) {
            return false;
        }
        C10033d dVar = (C10033d) this._delayed;
        if (dVar != null && !dVar.m14288d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C10118s) {
                return ((C10118s) obj).m14221g();
            }
            d0Var = C10078i1.f22264b;
            if (obj != d0Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g1 */
    public final void m14443g1() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: h1 */
    public final void m14442h1(long j, AbstractRunnableC10032c cVar) {
        int i1 = m14441i1(j, cVar);
        if (i1 != 0) {
            if (i1 == 1) {
                mo14160X0(j, cVar);
            } else if (i1 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m14438l1(cVar)) {
            m14354Y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j1 */
    public final AbstractC10000a1 m14440j1(long j, Runnable runnable) {
        long c = C10078i1.m14346c(j);
        if (c >= 4611686018427387903L) {
            return C10075h2.f22261k;
        }
        C10010c.m14496a();
        long nanoTime = System.nanoTime();
        C10031b bVar = new C10031b(c + nanoTime, runnable);
        m14442h1(nanoTime, bVar);
        return bVar;
    }

    @Override // kotlinx.coroutines.AbstractC10022e1
    public void shutdown() {
        C10167r2.f22370a.m14101c();
        m14439k1(true);
        m14449a1();
        do {
        } while (mo14451T0() <= 0);
        m14445f1();
    }

    @Override // kotlinx.coroutines.AbstractC10169s0
    /* renamed from: t */
    public void mo4538t(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
        long c = C10078i1.m14346c(j);
        if (c < 4611686018427387903L) {
            C10010c.m14496a();
            long nanoTime = System.nanoTime();
            C10030a aVar = new C10030a(c + nanoTime, cancellableContinuation);
            m14442h1(nanoTime, aVar);
            C10164r.m14107a(cancellableContinuation, aVar);
        }
    }
}
