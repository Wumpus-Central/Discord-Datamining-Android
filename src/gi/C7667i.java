package gi;

import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.AbstractC7335v1;
import fi.C7232c1;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.C8039k;
import p142hi.EnumC8035g;
import p182ji.AbstractC9613d;
import p182ji.EnumC9611b;
import p268og.AbstractC11319f1;
import p448yh.AbstractC14411h;

/* renamed from: gi.i */
/* loaded from: classes8.dex */
public final class C7667i extends AbstractC7304o0 implements AbstractC9613d {

    /* renamed from: l */
    private final EnumC9611b f16663l;

    /* renamed from: m */
    private final C7668j f16664m;

    /* renamed from: n */
    private final AbstractC7335v1 f16665n;

    /* renamed from: o */
    private final C7232c1 f16666o;

    /* renamed from: p */
    private final boolean f16667p;

    /* renamed from: q */
    private final boolean f16668q;

    public /* synthetic */ C7667i(EnumC9611b bVar, C7668j jVar, AbstractC7335v1 v1Var, C7232c1 c1Var, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jVar, v1Var, (i & 8) != 0 ? C7232c1.f15671l.m23149h() : c1Var, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
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
        return this.f16666o;
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: O0 */
    public boolean mo5171O0() {
        return this.f16667p;
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: V0 */
    public AbstractC7304o0 mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        return new C7667i(this.f16663l, mo5172N0(), this.f16665n, newAttributes, mo5171O0(), this.f16668q);
    }

    /* renamed from: W0 */
    public final EnumC9611b m21690W0() {
        return this.f16663l;
    }

    /* renamed from: X0 */
    public C7668j mo5172N0() {
        return this.f16664m;
    }

    /* renamed from: Y0 */
    public final AbstractC7335v1 m21688Y0() {
        return this.f16665n;
    }

    /* renamed from: Z0 */
    public final boolean m21687Z0() {
        return this.f16668q;
    }

    /* renamed from: a1 */
    public C7667i mo5166U0(boolean z) {
        return new C7667i(this.f16663l, mo5172N0(), this.f16665n, mo5173M0(), z, false, 32, null);
    }

    /* renamed from: b1 */
    public C7667i mo5168S0(AbstractC7664g kotlinTypeRefiner) {
        AbstractC7335v1 v1Var;
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        EnumC9611b bVar = this.f16663l;
        C7668j g = mo5172N0().mo4566o(kotlinTypeRefiner);
        AbstractC7335v1 v1Var2 = this.f16665n;
        if (v1Var2 != null) {
            v1Var = kotlinTypeRefiner.mo21694h(v1Var2).mo22868Q0();
        } else {
            v1Var = null;
        }
        return new C7667i(bVar, g, v1Var, mo5173M0(), mo5171O0(), false, 32, null);
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: o */
    public AbstractC14411h mo5161o() {
        return C8039k.m20777a(EnumC8035g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public C7667i(EnumC9611b captureStatus, C7668j constructor, AbstractC7335v1 v1Var, C7232c1 attributes, boolean z, boolean z2) {
        C9971q.m14633g(captureStatus, "captureStatus");
        C9971q.m14633g(constructor, "constructor");
        C9971q.m14633g(attributes, "attributes");
        this.f16663l = captureStatus;
        this.f16664m = constructor;
        this.f16665n = v1Var;
        this.f16666o = attributes;
        this.f16667p = z;
        this.f16668q = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7667i(EnumC9611b captureStatus, AbstractC7335v1 v1Var, AbstractC7290k1 projection, AbstractC11319f1 typeParameter) {
        this(captureStatus, new C7668j(projection, null, null, typeParameter, 6, null), v1Var, null, false, false, 56, null);
        C9971q.m14633g(captureStatus, "captureStatus");
        C9971q.m14633g(projection, "projection");
        C9971q.m14633g(typeParameter, "typeParameter");
    }
}
