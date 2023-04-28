package fi;

import gi.AbstractC7664g;
import kotlin.jvm.internal.C9971q;

/* renamed from: fi.r0 */
/* loaded from: classes8.dex */
public final class C7318r0 extends AbstractC7317r implements AbstractC7326t1 {

    /* renamed from: l */
    private final AbstractC7304o0 f15799l;

    /* renamed from: m */
    private final AbstractC7267g0 f15800m;

    public C7318r0(AbstractC7304o0 delegate, AbstractC7267g0 enhancement) {
        C9971q.m14633g(delegate, "delegate");
        C9971q.m14633g(enhancement, "enhancement");
        this.f15799l = delegate;
        this.f15800m = enhancement;
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: U0 */
    public AbstractC7304o0 mo5169R0(boolean z) {
        AbstractC7335v1 d = C7331u1.m22898d(mo22915G0().mo5166U0(z), mo22914e0().mo22868Q0().mo5169R0(z));
        C9971q.m14635e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC7304o0) d;
    }

    @Override // fi.AbstractC7304o0
    /* renamed from: V0 */
    public AbstractC7304o0 mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        AbstractC7335v1 d = C7331u1.m22898d(mo22915G0().mo5165V0(newAttributes), mo22914e0());
        C9971q.m14635e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC7304o0) d;
    }

    @Override // fi.AbstractC7317r
    /* renamed from: W0 */
    protected AbstractC7304o0 mo22923W0() {
        return this.f15799l;
    }

    /* renamed from: Z0 */
    public AbstractC7304o0 mo22915G0() {
        return mo22923W0();
    }

    /* renamed from: a1 */
    public C7318r0 mo22922X0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7267g0 h = kotlinTypeRefiner.mo21694h(mo22923W0());
        C9971q.m14635e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7318r0((AbstractC7304o0) h, kotlinTypeRefiner.mo21694h(mo22914e0()));
    }

    /* renamed from: b1 */
    public C7318r0 mo22921Y0(AbstractC7304o0 delegate) {
        C9971q.m14633g(delegate, "delegate");
        return new C7318r0(delegate, mo22914e0());
    }

    @Override // fi.AbstractC7326t1
    /* renamed from: e0 */
    public AbstractC7267g0 mo22914e0() {
        return this.f15800m;
    }

    @Override // fi.AbstractC7304o0
    public String toString() {
        return "[@EnhancedForWarnings(" + mo22914e0() + ")] " + mo22915G0();
    }
}
