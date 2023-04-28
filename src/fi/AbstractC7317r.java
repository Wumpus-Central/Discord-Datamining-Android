package fi;

import gi.AbstractC7664g;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import p448yh.AbstractC14411h;

/* renamed from: fi.r */
/* loaded from: classes8.dex */
public abstract class AbstractC7317r extends AbstractC7304o0 {
    @Override // fi.AbstractC7267g0
    /* renamed from: L0 */
    public List<AbstractC7290k1> mo5174L0() {
        return mo22923W0().mo5174L0();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: M0 */
    public C7232c1 mo5173M0() {
        return mo22923W0().mo5173M0();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: N0 */
    public AbstractC7268g1 mo5172N0() {
        return mo22923W0().mo5172N0();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: O0 */
    public boolean mo5171O0() {
        return mo22923W0().mo5171O0();
    }

    /* renamed from: W0 */
    protected abstract AbstractC7304o0 mo22923W0();

    /* renamed from: X0 */
    public AbstractC7304o0 mo5168S0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7267g0 h = kotlinTypeRefiner.mo21694h(mo22923W0());
        C9971q.m14635e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return mo22921Y0((AbstractC7304o0) h);
    }

    /* renamed from: Y0 */
    public abstract AbstractC7317r mo22921Y0(AbstractC7304o0 o0Var);

    @Override // fi.AbstractC7267g0
    /* renamed from: o */
    public AbstractC14411h mo5161o() {
        return mo22923W0().mo5161o();
    }
}
