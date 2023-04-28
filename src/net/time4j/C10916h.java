package net.time4j;

import p143hj.AbstractC8050e;

/* renamed from: net.time4j.h */
/* loaded from: classes8.dex */
final class C10916h extends AbstractC8050e<C10892f0> implements AbstractC10880e {

    /* renamed from: k */
    static final C10916h f24224k = new C10916h();
    private static final long serialVersionUID = -6519899440006935829L;

    private C10916h() {
        super("CALENDAR_DATE");
    }

    private Object readResolve() {
        return f24224k;
    }

    /* renamed from: A */
    public C10892f0 mo11059f() {
        return C10892f0.f24163o;
    }

    /* renamed from: D */
    public C10892f0 mo11062T() {
        return C10892f0.f24162n;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: M */
    public boolean mo11063M() {
        return true;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: U */
    public boolean mo11061U() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    public Class<C10892f0> getType() {
        return C10892f0.class;
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: y */
    protected boolean mo11143y() {
        return true;
    }
}
