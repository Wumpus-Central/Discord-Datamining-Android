package net.time4j;

import java.lang.Comparable;
import java.util.concurrent.TimeUnit;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;

/* renamed from: net.time4j.i0 */
/* loaded from: classes8.dex */
class C10958i0<U extends Comparable<U>> implements AbstractC8079p<U> {

    /* renamed from: n */
    static final AbstractC8079p<EnumC10899g> f24317n = new C10958i0(EnumC10899g.class, EnumC10899g.f24189k, EnumC10899g.f24194p);

    /* renamed from: o */
    static final AbstractC8079p<TimeUnit> f24318o = new C10958i0(TimeUnit.class, TimeUnit.DAYS, TimeUnit.NANOSECONDS);

    /* renamed from: k */
    private final Class<U> f24319k;

    /* renamed from: l */
    private final transient U f24320l;

    /* renamed from: m */
    private final transient U f24321m;

    private C10958i0(Class<U> cls, U u, U u2) {
        this.f24319k = cls;
        this.f24320l = u;
        this.f24321m = u2;
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
    /* renamed from: a */
    public char mo11060a() {
        return (char) 0;
    }

    /* renamed from: b */
    public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
        Comparable comparable = (Comparable) oVar.mo11371r(this);
        Comparable comparable2 = (Comparable) oVar2.mo11371r(this);
        if (this.f24319k == EnumC10899g.class) {
            return comparable.compareTo(comparable2);
        }
        return comparable2.compareTo(comparable);
    }

    /* renamed from: c */
    public U mo11059f() {
        return this.f24321m;
    }

    /* renamed from: d */
    public U mo11062T() {
        return this.f24320l;
    }

    @Override // p143hj.AbstractC8079p
    public Class<U> getType() {
        return this.f24319k;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: i */
    public boolean mo11088i() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    public String name() {
        return "PRECISION";
    }
}
