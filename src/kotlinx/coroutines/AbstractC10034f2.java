package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\u0007\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m15073d2 = {"Lkotlinx/coroutines/f2;", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "toString", "L0", "K0", "()Lkotlinx/coroutines/f2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.f2 */
/* loaded from: classes8.dex */
public abstract class AbstractC10034f2 extends CoroutineDispatcher {
    /* renamed from: K0 */
    public abstract AbstractC10034f2 mo4544K0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L0 */
    public final String m14434L0() {
        AbstractC10034f2 f2Var;
        AbstractC10034f2 c = C10230y0.m13945c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            f2Var = c.mo4544K0();
        } catch (UnsupportedOperationException unused) {
            f2Var = null;
        }
        if (this == f2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String L0 = m14434L0();
        if (L0 != null) {
            return L0;
        }
        return C10149n0.m14165a(this) + '@' + C10149n0.m14164b(this);
    }
}
