package p108fh;

import fi.AbstractC7223a0;
import fi.AbstractC7267g0;
import fi.AbstractC7292l0;
import fi.AbstractC7304o0;
import fi.AbstractC7317r;
import fi.AbstractC7335v1;
import fi.C7232c1;
import fi.C7270h0;
import fi.C7322s1;
import fi.C7331u1;
import ki.C9883a;
import kotlin.jvm.internal.C9971q;

/* renamed from: fh.g */
/* loaded from: classes8.dex */
public final class C7175g extends AbstractC7317r implements AbstractC7292l0 {

    /* renamed from: l */
    private final AbstractC7304o0 f15588l;

    public C7175g(AbstractC7304o0 delegate) {
        C9971q.m14633g(delegate, "delegate");
        this.f15588l = delegate;
    }

    /* renamed from: Z0 */
    private final AbstractC7304o0 m23279Z0(AbstractC7304o0 o0Var) {
        AbstractC7304o0 U0 = o0Var.mo5166U0(false);
        if (!C9883a.m15087r(o0Var)) {
            return U0;
        }
        return new C7175g(U0);
    }

    @Override // fi.AbstractC7297n
    /* renamed from: D0 */
    public boolean mo22993D0() {
        return true;
    }

    @Override // fi.AbstractC7297n
    /* renamed from: I */
    public AbstractC7267g0 mo22992I(AbstractC7267g0 replacement) {
        C9971q.m14633g(replacement, "replacement");
        AbstractC7335v1 Q0 = replacement.mo22868Q0();
        if (!C9883a.m15087r(Q0) && !C7322s1.m22935l(Q0)) {
            return Q0;
        }
        if (Q0 instanceof AbstractC7304o0) {
            return m23279Z0((AbstractC7304o0) Q0);
        }
        if (Q0 instanceof AbstractC7223a0) {
            AbstractC7223a0 a0Var = (AbstractC7223a0) Q0;
            return C7331u1.m22898d(C7270h0.m23056d(m23279Z0(a0Var.m23170V0()), m23279Z0(a0Var.m23169W0())), C7331u1.m22901a(Q0));
        }
        throw new IllegalStateException(("Incorrect type: " + Q0).toString());
    }

    @Override // fi.AbstractC7317r, fi.AbstractC7267g0
    /* renamed from: O0 */
    public boolean mo5171O0() {
        return false;
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: U0 */
    public AbstractC7304o0 mo5169R0(boolean z) {
        return z ? mo22923W0().mo5166U0(true) : this;
    }

    @Override // fi.AbstractC7317r
    /* renamed from: W0 */
    protected AbstractC7304o0 mo22923W0() {
        return this.f15588l;
    }

    /* renamed from: a1 */
    public C7175g mo5165V0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        return new C7175g(mo22923W0().mo5165V0(newAttributes));
    }

    /* renamed from: b1 */
    public C7175g mo22921Y0(AbstractC7304o0 delegate) {
        C9971q.m14633g(delegate, "delegate");
        return new C7175g(delegate);
    }
}
