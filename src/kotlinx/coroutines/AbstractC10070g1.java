package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractC10029f1;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m15073d2 = {"Lkotlinx/coroutines/g1;", "Lkotlinx/coroutines/e1;", "", "Y0", "", "now", "Lkotlinx/coroutines/f1$c;", "delayedTask", "X0", "Ljava/lang/Thread;", "W0", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.g1 */
/* loaded from: classes8.dex */
public abstract class AbstractC10070g1 extends AbstractC10022e1 {
    /* renamed from: W0 */
    protected abstract Thread mo14161W0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X0 */
    public void mo14160X0(long j, AbstractC10029f1.AbstractRunnableC10032c cVar) {
        RunnableC10153o0.f22357r.m14442h1(j, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y0 */
    public final void m14354Y0() {
        Thread W0 = mo14161W0();
        if (Thread.currentThread() != W0) {
            C10010c.m14496a();
            LockSupport.unpark(W0);
        }
    }
}
