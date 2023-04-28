package net.time4j;

import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11002l;
import net.time4j.p248tz.C11028p;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p271oj.AbstractC11414g;
import p271oj.EnumC11413f;

/* renamed from: net.time4j.b1 */
/* loaded from: classes8.dex */
public final class C10810b1 implements AbstractC8077o, AbstractC11414g {

    /* renamed from: k */
    private final C10779a0 f23996k;

    /* renamed from: l */
    private final AbstractC11002l f23997l;

    /* renamed from: m */
    private final transient C10917h0 f23998m;

    private C10810b1(C10779a0 a0Var, AbstractC11002l lVar) {
        this.f23997l = lVar;
        C11028p B = lVar.mo11322B(a0Var);
        if (!a0Var.m12310m0() || (B.m11188i() == 0 && B.m11189h() % 60 == 0)) {
            this.f23996k = a0Var;
            this.f23998m = C10917h0.m11658X(a0Var, B);
            return;
        }
        throw new IllegalArgumentException("Leap second can only be represented  with timezone-offset in full minutes: " + B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C10810b1 m12216j(C10779a0 a0Var, AbstractC11002l lVar) {
        return new C10810b1(a0Var, lVar);
    }

    @Override // net.time4j.base.AbstractC10817f
    /* renamed from: a */
    public int mo11327a() {
        return this.f23996k.mo11327a();
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: b */
    public <V> V mo11380b(AbstractC8079p<V> pVar) {
        V v;
        if (this.f23998m.mo11377e(pVar)) {
            v = (V) this.f23998m.mo11380b(pVar);
        } else {
            v = (V) this.f23996k.mo11380b(pVar);
        }
        if (pVar == C10906g0.f38916I && this.f23998m.mo11643m() >= 1972) {
            C10917h0 h0Var = (C10917h0) this.f23998m.mo15654D(pVar, v);
            if (!this.f23997l.mo11313K(h0Var, h0Var) && h0Var.m11653b0(this.f23997l).m12306q0(1L, EnumC10974n0.SECONDS).m12310m0()) {
                return pVar.getType().cast(60);
            }
        }
        return v;
    }

    /* renamed from: c */
    public C11028p m12218c() {
        return this.f23997l.mo11322B(this.f23996k);
    }

    @Override // p271oj.AbstractC11414g
    /* renamed from: d */
    public int mo10106d(EnumC11413f fVar) {
        return this.f23996k.mo10106d(fVar);
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: e */
    public boolean mo11377e(AbstractC8079p<?> pVar) {
        if (this.f23998m.mo11377e(pVar) || this.f23996k.mo11377e(pVar)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10810b1)) {
            return false;
        }
        C10810b1 b1Var = (C10810b1) obj;
        if (!this.f23996k.equals(b1Var.f23996k) || !this.f23997l.equals(b1Var.f23997l)) {
            return false;
        }
        return true;
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: f */
    public boolean mo11376f() {
        return true;
    }

    /* renamed from: g */
    public boolean m12217g() {
        return this.f23996k.m12310m0();
    }

    @Override // net.time4j.base.AbstractC10817f
    /* renamed from: h */
    public long mo11325h() {
        return this.f23996k.mo11325h();
    }

    public int hashCode() {
        return this.f23996k.hashCode() ^ this.f23997l.hashCode();
    }

    @Override // p271oj.AbstractC11414g
    /* renamed from: i */
    public long mo10105i(EnumC11413f fVar) {
        return this.f23996k.mo10105i(fVar);
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: k */
    public <V> V mo11373k(AbstractC8079p<V> pVar) {
        if (this.f23998m.mo11377e(pVar)) {
            return (V) this.f23998m.mo11373k(pVar);
        }
        return (V) this.f23996k.mo11373k(pVar);
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: q */
    public AbstractC11001k mo11372q() {
        return this.f23997l.mo11286z();
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: r */
    public <V> V mo11371r(AbstractC8079p<V> pVar) {
        if (this.f23996k.m12310m0() && pVar == C10906g0.f38916I) {
            return pVar.getType().cast(60);
        }
        if (this.f23998m.mo11377e(pVar)) {
            return (V) this.f23998m.mo11371r(pVar);
        }
        return (V) this.f23996k.mo11371r(pVar);
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: s */
    public int mo11370s(AbstractC8079p<Integer> pVar) {
        if (this.f23996k.m12310m0() && pVar == C10906g0.f38916I) {
            return 60;
        }
        int s = this.f23998m.mo11370s(pVar);
        if (s == Integer.MIN_VALUE) {
            return this.f23996k.mo11370s(pVar);
        }
        return s;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(this.f23998m.m11657Y());
        sb2.append('T');
        int p = this.f23998m.mo11640p();
        if (p < 10) {
            sb2.append('0');
        }
        sb2.append(p);
        sb2.append(':');
        int j = this.f23998m.mo11644j();
        if (j < 10) {
            sb2.append('0');
        }
        sb2.append(j);
        sb2.append(':');
        if (m12217g()) {
            sb2.append("60");
        } else {
            int g = this.f23998m.mo11648g();
            if (g < 10) {
                sb2.append('0');
            }
            sb2.append(g);
        }
        int a = this.f23998m.mo11655a();
        if (a != 0) {
            C10906g0.m11767P0(sb2, a);
        }
        sb2.append(m12218c());
        AbstractC11001k q = mo11372q();
        if (!(q instanceof C11028p)) {
            sb2.append('[');
            sb2.append(q.mo11196a());
            sb2.append(']');
        }
        return sb2.toString();
    }
}
