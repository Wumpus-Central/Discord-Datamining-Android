package fi;

import kotlin.jvm.internal.C9971q;

/* renamed from: fi.s */
/* loaded from: classes8.dex */
public abstract class AbstractC7320s extends AbstractC7317r {

    /* renamed from: l */
    private final AbstractC7304o0 f15804l;

    public AbstractC7320s(AbstractC7304o0 delegate) {
        C9971q.m14633g(delegate, "delegate");
        this.f15804l = delegate;
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: U0 */
    public AbstractC7304o0 mo5169R0(boolean z) {
        if (z == mo5171O0()) {
            return this;
        }
        return mo22923W0().mo5166U0(z).mo5165V0(mo5173M0());
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: V0 */
    public AbstractC7304o0 mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        if (newAttributes != mo5173M0()) {
            return new C7315q0(this, newAttributes);
        }
        return this;
    }

    @Override // fi.AbstractC7317r
    /* renamed from: W0 */
    protected AbstractC7304o0 mo22923W0() {
        return this.f15804l;
    }
}
