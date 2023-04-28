package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C10080a;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tJ\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006$"}, m15073d2 = {"Lkotlinx/coroutines/e1;", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "unconfined", "", "M0", "T0", "U0", "V0", "Lkotlinx/coroutines/w0;", "task", "", "N0", "P0", "K0", "shutdown", "m", "J", "useCount", "n", "Z", "shared", "Lkotlinx/coroutines/internal/a;", "o", "Lkotlinx/coroutines/internal/a;", "unconfinedQueue", "O0", "()J", "nextTime", "R0", "()Z", "isUnconfinedLoopActive", "S0", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.e1 */
/* loaded from: classes8.dex */
public abstract class AbstractC10022e1 extends CoroutineDispatcher {

    /* renamed from: m */
    private long f22158m;

    /* renamed from: n */
    private boolean f22159n;

    /* renamed from: o */
    private C10080a<AbstractC10222w0<?>> f22160o;

    /* renamed from: L0 */
    public static /* synthetic */ void m14473L0(AbstractC10022e1 e1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            e1Var.m14474K0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: M0 */
    private final long m14472M0(boolean z) {
        return z ? 4294967296L : 1L;
    }

    /* renamed from: Q0 */
    public static /* synthetic */ void m14469Q0(AbstractC10022e1 e1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            e1Var.m14470P0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: K0 */
    public final void m14474K0(boolean z) {
        long M0 = this.f22158m - m14472M0(z);
        this.f22158m = M0;
        if (M0 <= 0 && this.f22159n) {
            shutdown();
        }
    }

    /* renamed from: N0 */
    public final void m14471N0(AbstractC10222w0<?> w0Var) {
        C10080a<AbstractC10222w0<?>> aVar = this.f22160o;
        if (aVar == null) {
            aVar = new C10080a<>();
            this.f22160o = aVar;
        }
        aVar.m14345a(w0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O0 */
    public long mo14452O0() {
        C10080a<AbstractC10222w0<?>> aVar = this.f22160o;
        if (aVar != null && !aVar.m14343c()) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: P0 */
    public final void m14470P0(boolean z) {
        this.f22158m += m14472M0(z);
        if (!z) {
            this.f22159n = true;
        }
    }

    /* renamed from: R0 */
    public final boolean m14468R0() {
        return this.f22158m >= m14472M0(true);
    }

    /* renamed from: S0 */
    public final boolean m14467S0() {
        C10080a<AbstractC10222w0<?>> aVar = this.f22160o;
        if (aVar != null) {
            return aVar.m14343c();
        }
        return true;
    }

    /* renamed from: T0 */
    public long mo14451T0() {
        return !m14466U0() ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: U0 */
    public final boolean m14466U0() {
        AbstractC10222w0<?> d;
        C10080a<AbstractC10222w0<?>> aVar = this.f22160o;
        if (aVar == null || (d = aVar.m14342d()) == null) {
            return false;
        }
        d.run();
        return true;
    }

    /* renamed from: V0 */
    public boolean m14465V0() {
        return false;
    }

    public void shutdown() {
    }
}
