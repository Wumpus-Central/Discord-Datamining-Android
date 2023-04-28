package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC10000a1;
import kotlinx.coroutines.AbstractC10169s0;
import kotlinx.coroutines.C10157p0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(m15074d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\b\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0002J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001J\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096\u0001J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0015\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003H\u0017R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001e\u0010!\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010&\u001a\u00060\"j\u0002`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m15073d2 = {"Lkotlinx/coroutines/internal/l;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/s0;", "", "L0", "block", "K0", "", "timeMillis", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/a1;", "R", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "t", "run", "G0", "H0", "m", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "", "n", "I", "parallelism", "runningWorkers", "Lkotlinx/coroutines/internal/r;", "p", "Lkotlinx/coroutines/internal/r;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "q", "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.l */
/* loaded from: classes8.dex */
public final class RunnableC10105l extends CoroutineDispatcher implements Runnable, AbstractC10169s0 {

    /* renamed from: m */
    private final CoroutineDispatcher f22300m;

    /* renamed from: n */
    private final int f22301n;

    /* renamed from: o */
    private final /* synthetic */ AbstractC10169s0 f22302o;

    /* renamed from: p */
    private final C10117r<Runnable> f22303p;

    /* renamed from: q */
    private final Object f22304q;
    private volatile int runningWorkers;

    public RunnableC10105l(CoroutineDispatcher coroutineDispatcher, int i) {
        AbstractC10169s0 s0Var;
        this.f22300m = coroutineDispatcher;
        this.f22301n = i;
        if (coroutineDispatcher instanceof AbstractC10169s0) {
            s0Var = (AbstractC10169s0) coroutineDispatcher;
        } else {
            s0Var = null;
        }
        this.f22302o = s0Var == null ? C10157p0.m14115a() : s0Var;
        this.f22303p = new C10117r<>(false);
        this.f22304q = new Object();
    }

    /* renamed from: K0 */
    private final boolean m14270K0(Runnable runnable) {
        this.f22303p.m14231a(runnable);
        if (this.runningWorkers >= this.f22301n) {
            return true;
        }
        return false;
    }

    /* renamed from: L0 */
    private final boolean m14269L0() {
        synchronized (this.f22304q) {
            if (this.runningWorkers >= this.f22301n) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: G0 */
    public void mo4546G0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!m14270K0(runnable) && m14269L0()) {
            this.f22300m.mo4546G0(this, this);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: H0 */
    public void mo14052H0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!m14270K0(runnable) && m14269L0()) {
            this.f22300m.mo14052H0(this, this);
        }
    }

    @Override // kotlinx.coroutines.AbstractC10169s0
    /* renamed from: R */
    public AbstractC10000a1 mo4537R(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f22302o.mo4537R(j, runnable, coroutineContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        r1 = r4.f22304q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f22303p.m14229c() != 0) goto L_0x003d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        r4.runningWorkers++;
        r2 = kotlin.Unit.f22042a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            kotlinx.coroutines.internal.r<java.lang.Runnable> r2 = r4.f22303p
            java.lang.Object r2 = r2.m14228d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch: all -> 0x0010
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            sf.f r3 = p339sf.C12893f.f28966k
            kotlinx.coroutines.C10077i0.m14350a(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            kotlinx.coroutines.CoroutineDispatcher r2 = r4.f22300m
            boolean r2 = r2.mo4545I0(r4)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.CoroutineDispatcher r0 = r4.f22300m
            r0.mo4546G0(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f22304q
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: all -> 0x0047
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: all -> 0x0047
            kotlinx.coroutines.internal.r<java.lang.Runnable> r2 = r4.f22303p     // Catch: all -> 0x0047
            int r2 = r2.m14229c()     // Catch: all -> 0x0047
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch: all -> 0x0047
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: all -> 0x0047
            kotlin.Unit r2 = kotlin.Unit.f22042a     // Catch: all -> 0x0047
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.RunnableC10105l.run():void");
    }

    @Override // kotlinx.coroutines.AbstractC10169s0
    /* renamed from: t */
    public void mo4538t(long j, CancellableContinuation<? super Unit> cancellableContinuation) {
        this.f22302o.mo4538t(j, cancellableContinuation);
    }
}
