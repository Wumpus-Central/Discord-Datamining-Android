package fi;

import gi.AbstractC7664g;
import gi.C7681r;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p182ji.AbstractC9618i;
import p448yh.AbstractC14411h;
import pg.AbstractC11664a;
import pg.AbstractC11672g;

/* renamed from: fi.g0 */
/* loaded from: classes8.dex */
public abstract class AbstractC7267g0 implements AbstractC11664a, AbstractC9618i {

    /* renamed from: k */
    private int f15734k;

    private AbstractC7267g0() {
    }

    public /* synthetic */ AbstractC7267g0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: K0 */
    private final int m23060K0() {
        if (C7278i0.m23035a(this)) {
            return super.hashCode();
        }
        return (((mo5172N0().hashCode() * 31) + mo5174L0().hashCode()) * 31) + (mo5171O0() ? 1 : 0);
    }

    /* renamed from: L0 */
    public abstract List<AbstractC7290k1> mo5174L0();

    /* renamed from: M0 */
    public abstract C7232c1 mo5173M0();

    /* renamed from: N0 */
    public abstract AbstractC7268g1 mo5172N0();

    /* renamed from: O0 */
    public abstract boolean mo5171O0();

    /* renamed from: P0 */
    public abstract AbstractC7267g0 mo5170P0(AbstractC7664g gVar);

    /* renamed from: Q0 */
    public abstract AbstractC7335v1 mo22868Q0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7267g0)) {
            return false;
        }
        AbstractC7267g0 g0Var = (AbstractC7267g0) obj;
        if (mo5171O0() != g0Var.mo5171O0() || !C7681r.f16688a.m21664a(mo22868Q0(), g0Var.mo22868Q0())) {
            return false;
        }
        return true;
    }

    @Override // pg.AbstractC11664a
    public AbstractC11672g getAnnotations() {
        return C7288k.m23011a(mo5173M0());
    }

    public final int hashCode() {
        int i = this.f15734k;
        if (i != 0) {
            return i;
        }
        int K0 = m23060K0();
        this.f15734k = K0;
        return K0;
    }

    /* renamed from: o */
    public abstract AbstractC14411h mo5161o();
}
