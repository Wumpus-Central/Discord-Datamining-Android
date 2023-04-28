package net.time4j.calendar;

import p143hj.AbstractC8050e;

/* renamed from: net.time4j.calendar.m */
/* loaded from: classes8.dex */
final class C10858m extends AbstractC8050e<Integer> {

    /* renamed from: k */
    static final C10858m f24062k = new C10858m();
    private static final long serialVersionUID = -1117064522468823402L;

    private C10858m() {
        super("RELATED_GREGORIAN_YEAR");
    }

    /* renamed from: A */
    public Integer mo11059f() {
        return 999999999;
    }

    /* renamed from: D */
    public Integer mo11062T() {
        return -999999999;
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

    @Override // p143hj.AbstractC8050e, p143hj.AbstractC8079p
    /* renamed from: a */
    public char mo11060a() {
        return 'r';
    }

    @Override // p143hj.AbstractC8079p
    public Class<Integer> getType() {
        return Integer.class;
    }

    protected Object readResolve() {
        return f24062k;
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: y */
    protected boolean mo11143y() {
        return true;
    }
}
