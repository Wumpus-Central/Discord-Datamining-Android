package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m15073d2 = {"Lkotlinx/coroutines/h;", "T", "Lkotlinx/coroutines/a;", "", "state", "", "F", "U0", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "m", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/e1;", "n", "Lkotlinx/coroutines/e1;", "eventLoop", "", "m0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/e1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.h */
/* loaded from: classes8.dex */
public final class C10072h<T> extends AbstractC9998a<T> {

    /* renamed from: m */
    private final Thread f22258m;

    /* renamed from: n */
    private final AbstractC10022e1 f22259n;

    public C10072h(CoroutineContext coroutineContext, Thread thread, AbstractC10022e1 e1Var) {
        super(coroutineContext, true, true);
        this.f22258m = thread;
        this.f22259n = e1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.C10005b2
    /* renamed from: F */
    public void mo13982F(Object obj) {
        if (!C9971q.m14638b(Thread.currentThread(), this.f22258m)) {
            Thread thread = this.f22258m;
            C10010c.m14496a();
            LockSupport.unpark(thread);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: U0 */
    public final T m14353U0() {
        long j;
        C10010c.m14496a();
        try {
            AbstractC10022e1 e1Var = this.f22259n;
            C10234z zVar = null;
            if (e1Var != null) {
                AbstractC10022e1.m14469Q0(e1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                AbstractC10022e1 e1Var2 = this.f22259n;
                if (e1Var2 != null) {
                    j = e1Var2.mo14451T0();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!mo14526g()) {
                    C10010c.m14496a();
                    LockSupport.parkNanos(this, j);
                } else {
                    AbstractC10022e1 e1Var3 = this.f22259n;
                    if (e1Var3 != null) {
                        AbstractC10022e1.m14473L0(e1Var3, false, 1, null);
                    }
                    C10010c.m14496a();
                    T t = (T) C10013c2.m14488h(m14525g0());
                    if (t instanceof C10234z) {
                        zVar = (C10234z) t;
                    }
                    if (zVar == null) {
                        return t;
                    }
                    throw zVar.f22488a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m14552G(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            C10010c.m14496a();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.C10005b2
    /* renamed from: m0 */
    protected boolean mo14335m0() {
        return true;
    }
}
