package p143hj;

/* renamed from: hj.b0 */
/* loaded from: classes8.dex */
public enum EnumC8045b0 implements AbstractC8079p<Boolean> {
    LEAP_SECOND,
    DAYLIGHT_SAVING;

    @Override // p143hj.AbstractC8079p
    /* renamed from: M */
    public boolean mo11063M() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: U */
    public boolean mo11061U() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: a */
    public char mo11060a() {
        return (char) 0;
    }

    /* renamed from: b */
    public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
        boolean e = oVar.mo11377e(this);
        if (e == oVar2.mo11377e(this)) {
            return 0;
        }
        if (e) {
            return 1;
        }
        return -1;
    }

    /* renamed from: c */
    public Boolean mo11059f() {
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public Boolean mo11062T() {
        return Boolean.FALSE;
    }

    @Override // p143hj.AbstractC8079p
    public Class<Boolean> getType() {
        return Boolean.class;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: i */
    public boolean mo11088i() {
        return false;
    }
}
