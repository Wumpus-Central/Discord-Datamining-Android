package p183jj;

import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.EnumC10996f;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;

/* renamed from: jj.b0 */
/* loaded from: classes8.dex */
enum EnumC9636b0 implements AbstractC8079p<AbstractC11001k> {
    TIMEZONE_ID,
    TIMEZONE_OFFSET;

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
        return oVar.mo11372q().mo11196a().compareTo(oVar2.mo11372q().mo11196a());
    }

    /* renamed from: c */
    public AbstractC11001k mo11059f() {
        return C11028p.m11183n(EnumC10996f.AHEAD_OF_UTC, 14);
    }

    /* renamed from: d */
    public AbstractC11001k mo11062T() {
        return C11028p.m11183n(EnumC10996f.BEHIND_UTC, 14);
    }

    @Override // p143hj.AbstractC8079p
    public Class<AbstractC11001k> getType() {
        return AbstractC11001k.class;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: i */
    public boolean mo11088i() {
        return false;
    }
}
