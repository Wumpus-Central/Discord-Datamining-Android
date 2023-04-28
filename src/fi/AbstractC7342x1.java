package fi;

import java.util.List;
import kotlin.jvm.internal.C9971q;
import p448yh.AbstractC14411h;

/* renamed from: fi.x1 */
/* loaded from: classes8.dex */
public abstract class AbstractC7342x1 extends AbstractC7267g0 {
    public AbstractC7342x1() {
        super(null);
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: L0 */
    public List<AbstractC7290k1> mo5174L0() {
        return mo22867R0().mo5174L0();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: M0 */
    public C7232c1 mo5173M0() {
        return mo22867R0().mo5173M0();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: N0 */
    public AbstractC7268g1 mo5172N0() {
        return mo22867R0().mo5172N0();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: O0 */
    public boolean mo5171O0() {
        return mo22867R0().mo5171O0();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: Q0 */
    public final AbstractC7335v1 mo22868Q0() {
        AbstractC7267g0 R0 = mo22867R0();
        while (R0 instanceof AbstractC7342x1) {
            R0 = ((AbstractC7342x1) R0).mo22867R0();
        }
        C9971q.m14635e(R0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (AbstractC7335v1) R0;
    }

    /* renamed from: R0 */
    protected abstract AbstractC7267g0 mo22867R0();

    /* renamed from: S0 */
    public boolean mo22866S0() {
        return true;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: o */
    public AbstractC14411h mo5161o() {
        return mo22867R0().mo5161o();
    }

    public String toString() {
        if (mo22866S0()) {
            return mo22867R0().toString();
        }
        return "<Not computed yet>";
    }
}
