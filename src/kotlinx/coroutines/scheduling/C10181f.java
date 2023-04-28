package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC10136k1;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J+\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, m15073d2 = {"Lkotlinx/coroutines/scheduling/f;", "Lkotlinx/coroutines/k1;", "Lkotlinx/coroutines/scheduling/a;", "K0", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "G0", "H0", "Lkotlinx/coroutines/scheduling/i;", "", "tailDispatch", "L0", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/i;Z)V", "", "n", "I", "corePoolSize", "o", "maxPoolSize", "", "p", "J", "idleWorkerKeepAliveNs", "", "q", "Ljava/lang/String;", "schedulerName", "r", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.scheduling.f */
/* loaded from: classes8.dex */
public class C10181f extends AbstractC10136k1 {

    /* renamed from: n */
    private final int f22407n;

    /* renamed from: o */
    private final int f22408o;

    /* renamed from: p */
    private final long f22409p;

    /* renamed from: q */
    private final String f22410q;

    /* renamed from: r */
    private ExecutorC10173a f22411r = m14057K0();

    public C10181f(int i, int i2, long j, String str) {
        this.f22407n = i;
        this.f22408o = i2;
        this.f22409p = j;
        this.f22410q = str;
    }

    /* renamed from: K0 */
    private final ExecutorC10173a m14057K0() {
        return new ExecutorC10173a(this.f22407n, this.f22408o, this.f22409p, this.f22410q);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: G0 */
    public void mo4546G0(CoroutineContext coroutineContext, Runnable runnable) {
        ExecutorC10173a.m14085n(this.f22411r, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: H0 */
    public void mo14052H0(CoroutineContext coroutineContext, Runnable runnable) {
        ExecutorC10173a.m14085n(this.f22411r, runnable, null, true, 2, null);
    }

    /* renamed from: L0 */
    public final void m14056L0(Runnable runnable, AbstractC10184i iVar, boolean z) {
        this.f22411r.m14086l(runnable, iVar, z);
    }
}
