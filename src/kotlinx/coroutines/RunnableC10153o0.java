package kotlinx.coroutines;

import eg.C6884j;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC10029f1;

@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b,\u0010 J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016R\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0014\u0010+\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, m15073d2 = {"Lkotlinx/coroutines/o0;", "Lkotlinx/coroutines/f1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "r1", "Ljava/lang/Thread;", "n1", "", "q1", "m1", "task", "c1", "", "now", "Lkotlinx/coroutines/f1$c;", "delayedTask", "X0", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/a1;", "R", "run", "s", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "()V", "", "debugStatus", "I", "o1", "()Z", "isShutDown", "p1", "isShutdownRequested", "W0", "()Ljava/lang/Thread;", "thread", "<init>", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.o0 */
/* loaded from: classes8.dex */
public final class RunnableC10153o0 extends AbstractC10029f1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: r */
    public static final RunnableC10153o0 f22357r;

    /* renamed from: s */
    private static final long f22358s;

    static {
        Long l;
        RunnableC10153o0 o0Var = new RunnableC10153o0();
        f22357r = o0Var;
        AbstractC10022e1.m14469Q0(o0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f22358s = timeUnit.toNanos(l.longValue());
    }

    private RunnableC10153o0() {
    }

    /* renamed from: m1 */
    private final synchronized void m14158m1() {
        if (m14155p1()) {
            debugStatus = 3;
            m14443g1();
            notifyAll();
        }
    }

    /* renamed from: n1 */
    private final synchronized Thread m14157n1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: o1 */
    private final boolean m14156o1() {
        return debugStatus == 4;
    }

    /* renamed from: p1 */
    private final boolean m14155p1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: q1 */
    private final synchronized boolean m14154q1() {
        if (m14155p1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: r1 */
    private final void m14153r1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC10029f1, kotlinx.coroutines.AbstractC10169s0
    /* renamed from: R */
    public AbstractC10000a1 mo4537R(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return m14440j1(j, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC10070g1
    /* renamed from: W0 */
    protected Thread mo14161W0() {
        Thread thread = _thread;
        return thread == null ? m14157n1() : thread;
    }

    @Override // kotlinx.coroutines.AbstractC10070g1
    /* renamed from: X0 */
    protected void mo14160X0(long j, AbstractC10029f1.AbstractRunnableC10032c cVar) {
        m14153r1();
    }

    @Override // kotlinx.coroutines.AbstractC10029f1
    /* renamed from: c1 */
    public void mo14159c1(Runnable runnable) {
        if (m14156o1()) {
            m14153r1();
        }
        super.mo14159c1(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        C10167r2.f22370a.m14100d(this);
        C10010c.m14496a();
        try {
            if (m14154q1()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long T0 = mo14451T0();
                    if (T0 == Long.MAX_VALUE) {
                        C10010c.m14496a();
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f22358s + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m14158m1();
                            C10010c.m14496a();
                            if (!m14446e1()) {
                                mo14161W0();
                                return;
                            }
                            return;
                        }
                        T0 = C6884j.m23956h(T0, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (T0 > 0) {
                        if (m14155p1()) {
                            _thread = null;
                            m14158m1();
                            C10010c.m14496a();
                            if (!m14446e1()) {
                                mo14161W0();
                                return;
                            }
                            return;
                        }
                        C10010c.m14496a();
                        LockSupport.parkNanos(this, T0);
                    }
                }
            }
        } finally {
            _thread = null;
            m14158m1();
            C10010c.m14496a();
            if (!m14446e1()) {
                mo14161W0();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC10029f1, kotlinx.coroutines.AbstractC10022e1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
