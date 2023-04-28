package net.time4j;

/* renamed from: net.time4j.y0 */
/* loaded from: classes8.dex */
final class C11043y0 extends AbstractC10778a<Integer> implements AbstractC10879d0 {

    /* renamed from: n */
    static final C11043y0 f24542n = new C11043y0();
    private static final long serialVersionUID = -2378018589067147278L;

    private C11043y0() {
        super("WEEKDAY_IN_MONTH");
    }

    private Object readResolve() {
        return f24542n;
    }

    /* renamed from: D */
    public Integer mo11059f() {
        return 5;
    }

    /* renamed from: E */
    public Integer mo11062T() {
        return 1;
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
        return 'F';
    }

    @Override // p143hj.AbstractC8079p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // p143hj.AbstractC8050e
    /* renamed from: y */
    protected boolean mo11143y() {
        return true;
    }
}
