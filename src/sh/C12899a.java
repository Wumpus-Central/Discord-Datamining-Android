package sh;

import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.C7232c1;
import gi.AbstractC7664g;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.C8039k;
import p142hi.EnumC8035g;
import p182ji.AbstractC9613d;
import p448yh.AbstractC14411h;

/* renamed from: sh.a */
/* loaded from: classes8.dex */
public final class C12899a extends AbstractC7304o0 implements AbstractC9613d {

    /* renamed from: l */
    private final AbstractC7290k1 f28973l;

    /* renamed from: m */
    private final AbstractC12900b f28974m;

    /* renamed from: n */
    private final boolean f28975n;

    /* renamed from: o */
    private final C7232c1 f28976o;

    public /* synthetic */ C12899a(AbstractC7290k1 k1Var, AbstractC12900b bVar, boolean z, C7232c1 c1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(k1Var, (i & 2) != 0 ? new C12901c(k1Var) : bVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C7232c1.f15671l.m23149h() : c1Var);
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: L0 */
    public List<AbstractC7290k1> mo5174L0() {
        List<AbstractC7290k1> i;
        i = C9906j.m14820i();
        return i;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: M0 */
    public C7232c1 mo5173M0() {
        return this.f28976o;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: O0 */
    public boolean mo5171O0() {
        return this.f28975n;
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: V0 */
    public AbstractC7304o0 mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        return new C12899a(this.f28973l, mo5172N0(), mo5171O0(), newAttributes);
    }

    /* renamed from: W0 */
    public AbstractC12900b mo5172N0() {
        return this.f28974m;
    }

    /* renamed from: X0 */
    public C12899a mo5166U0(boolean z) {
        if (z == mo5171O0()) {
            return this;
        }
        return new C12899a(this.f28973l, mo5172N0(), z, mo5173M0());
    }

    /* renamed from: Y0 */
    public C12899a mo5168S0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7290k1 o = this.f28973l.mo22903o(kotlinTypeRefiner);
        C9971q.m14634f(o, "typeProjection.refine(kotlinTypeRefiner)");
        return new C12899a(o, mo5172N0(), mo5171O0(), mo5173M0());
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: o */
    public AbstractC14411h mo5161o() {
        return C8039k.m20777a(EnumC8035g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // fi.AbstractC7304o0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f28973l);
        sb2.append(')');
        sb2.append(mo5171O0() ? "?" : "");
        return sb2.toString();
    }

    public C12899a(AbstractC7290k1 typeProjection, AbstractC12900b constructor, boolean z, C7232c1 attributes) {
        C9971q.m14633g(typeProjection, "typeProjection");
        C9971q.m14633g(constructor, "constructor");
        C9971q.m14633g(attributes, "attributes");
        this.f28973l = typeProjection;
        this.f28974m = constructor;
        this.f28975n = z;
        this.f28976o = attributes;
    }
}
