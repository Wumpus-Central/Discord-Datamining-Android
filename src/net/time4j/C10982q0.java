package net.time4j;

import p143hj.AbstractC8050e;

/* renamed from: net.time4j.q0 */
/* loaded from: classes8.dex */
final class C10982q0 extends AbstractC8050e<C10906g0> implements AbstractC11033u0 {

    /* renamed from: k */
    static final C10982q0 f24395k = new C10982q0();
    private static final long serialVersionUID = -3712256393866098916L;

    private C10982q0() {
        super("WALL_TIME");
    }

    private Object readResolve() {
        return f24395k;
    }

    /* renamed from: A */
    public C10906g0 mo11059f() {
        return C10906g0.m11771M0(23, 59, 59, 999999999);
    }

    /* renamed from: D */
    public C10906g0 mo11062T() {
        return C10906g0.f24205w;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: M */
    public boolean mo11063M() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: U */
    public boolean mo11061U() {
        return true;
    }

    @Override // p143hj.AbstractC8079p
    public Class<C10906g0> getType() {
        return C10906g0.class;
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: y */
    protected boolean mo11143y() {
        return true;
    }
}
