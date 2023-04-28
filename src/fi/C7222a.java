package fi;

import gi.AbstractC7664g;
import kotlin.jvm.internal.C9971q;

/* renamed from: fi.a */
/* loaded from: classes8.dex */
public final class C7222a extends AbstractC7317r {

    /* renamed from: l */
    private final AbstractC7304o0 f15661l;

    /* renamed from: m */
    private final AbstractC7304o0 f15662m;

    public C7222a(AbstractC7304o0 delegate, AbstractC7304o0 abbreviation) {
        C9971q.m14633g(delegate, "delegate");
        C9971q.m14633g(abbreviation, "abbreviation");
        this.f15661l = delegate;
        this.f15662m = abbreviation;
    }

    /* renamed from: E */
    public final AbstractC7304o0 m23175E() {
        return mo22923W0();
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: V0 */
    public AbstractC7304o0 mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        return new C7222a(mo22923W0().mo5165V0(newAttributes), this.f15662m);
    }

    @Override // fi.AbstractC7317r
    /* renamed from: W0 */
    protected AbstractC7304o0 mo22923W0() {
        return this.f15661l;
    }

    /* renamed from: Z0 */
    public final AbstractC7304o0 m23174Z0() {
        return this.f15662m;
    }

    /* renamed from: a1 */
    public C7222a mo5166U0(boolean z) {
        return new C7222a(mo22923W0().mo5166U0(z), this.f15662m.mo5166U0(z));
    }

    /* renamed from: b1 */
    public C7222a mo22922X0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7267g0 h = kotlinTypeRefiner.mo21694h(mo22923W0());
        C9971q.m14635e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC7267g0 h2 = kotlinTypeRefiner.mo21694h(this.f15662m);
        C9971q.m14635e(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7222a((AbstractC7304o0) h, (AbstractC7304o0) h2);
    }

    /* renamed from: c1 */
    public C7222a mo22921Y0(AbstractC7304o0 delegate) {
        C9971q.m14633g(delegate, "delegate");
        return new C7222a(delegate, this.f15662m);
    }
}
