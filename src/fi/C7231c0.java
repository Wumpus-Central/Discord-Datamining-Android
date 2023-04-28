package fi;

import gi.AbstractC7664g;
import kotlin.jvm.internal.C9971q;
import p305qh.AbstractC12137c;
import p305qh.AbstractC12161f;

/* renamed from: fi.c0 */
/* loaded from: classes8.dex */
public final class C7231c0 extends AbstractC7223a0 implements AbstractC7326t1 {

    /* renamed from: n */
    private final AbstractC7223a0 f15669n;

    /* renamed from: o */
    private final AbstractC7267g0 f15670o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7231c0(AbstractC7223a0 origin, AbstractC7267g0 enhancement) {
        super(origin.m23170V0(), origin.m23169W0());
        C9971q.m14633g(origin, "origin");
        C9971q.m14633g(enhancement, "enhancement");
        this.f15669n = origin;
        this.f15670o = enhancement;
    }

    @Override // fi.AbstractC7335v1
    /* renamed from: R0 */
    public AbstractC7335v1 mo5169R0(boolean z) {
        return C7331u1.m22898d(mo22915G0().mo5169R0(z), mo22914e0().mo22868Q0().mo5169R0(z));
    }

    @Override // fi.AbstractC7335v1
    /* renamed from: T0 */
    public AbstractC7335v1 mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        return C7331u1.m22898d(mo22915G0().mo5167T0(newAttributes), mo22914e0());
    }

    @Override // fi.AbstractC7223a0
    /* renamed from: U0 */
    public AbstractC7304o0 mo22897U0() {
        return mo22915G0().mo22897U0();
    }

    @Override // fi.AbstractC7223a0
    /* renamed from: X0 */
    public String mo22896X0(AbstractC12137c renderer, AbstractC12161f options) {
        C9971q.m14633g(renderer, "renderer");
        C9971q.m14633g(options, "options");
        if (options.mo7545d()) {
            return renderer.mo7613w(mo22914e0());
        }
        return mo22915G0().mo22896X0(renderer, options);
    }

    /* renamed from: Y0 */
    public AbstractC7223a0 mo22915G0() {
        return this.f15669n;
    }

    /* renamed from: Z0 */
    public C7231c0 mo5168S0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7267g0 h = kotlinTypeRefiner.mo21694h(mo22915G0());
        C9971q.m14635e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C7231c0((AbstractC7223a0) h, kotlinTypeRefiner.mo21694h(mo22914e0()));
    }

    @Override // fi.AbstractC7326t1
    /* renamed from: e0 */
    public AbstractC7267g0 mo22914e0() {
        return this.f15670o;
    }

    @Override // fi.AbstractC7223a0
    public String toString() {
        return "[@EnhancedForWarnings(" + mo22914e0() + ")] " + mo22915G0();
    }
}
