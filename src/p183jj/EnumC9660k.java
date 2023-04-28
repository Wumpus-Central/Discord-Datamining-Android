package p183jj;

import java.math.BigDecimal;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;

/* renamed from: jj.k */
/* loaded from: classes8.dex */
enum EnumC9660k implements AbstractC8079p<BigDecimal> {
    FRACTION;

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
        return ((BigDecimal) oVar.mo11371r(this)).compareTo((BigDecimal) oVar2.mo11371r(this));
    }

    /* renamed from: c */
    public BigDecimal mo11059f() {
        return BigDecimal.ONE;
    }

    /* renamed from: d */
    public BigDecimal mo11062T() {
        return BigDecimal.ZERO;
    }

    @Override // p143hj.AbstractC8079p
    public Class<BigDecimal> getType() {
        return BigDecimal.class;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: i */
    public boolean mo11088i() {
        return false;
    }
}
