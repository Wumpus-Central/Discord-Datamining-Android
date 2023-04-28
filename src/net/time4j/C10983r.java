package net.time4j;

import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11002l;
import p143hj.AbstractC8053f0;
import p143hj.AbstractC8070l;
import p143hj.AbstractC8073m;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8078o0;
import p143hj.AbstractC8079p;
import p143hj.C8058h;
import p143hj.C8081r;

/* renamed from: net.time4j.r */
/* loaded from: classes8.dex */
public final class C10983r<C> implements AbstractC8077o, AbstractC8078o0 {

    /* renamed from: k */
    private final AbstractC8070l<?> f24396k;

    /* renamed from: l */
    private final AbstractC8073m<?, ?> f24397l;

    /* renamed from: m */
    private final C10906g0 f24398m;

    private C10983r(AbstractC8070l<?> lVar, AbstractC8073m<?, ?> mVar, C10906g0 g0Var) {
        if (g0Var.mo11640p() == 24) {
            if (lVar == null) {
                this.f24396k = null;
                this.f24397l = mVar.m20668U(C8058h.m20716c(1L));
            } else {
                this.f24396k = lVar.m20678J(C8058h.m20716c(1L));
                this.f24397l = null;
            }
            this.f24398m = C10906g0.m11776I0();
            return;
        }
        this.f24396k = lVar;
        this.f24397l = mVar;
        this.f24398m = g0Var;
    }

    /* JADX WARN: Incorrect types in method signature: <C:Lhj/l<TC;>;>(TC;Lnet/time4j/g0;)Lnet/time4j/r<TC;>; */
    /* renamed from: c */
    public static C10983r m11379c(AbstractC8070l lVar, C10906g0 g0Var) {
        if (lVar != null) {
            return new C10983r(lVar, null, g0Var);
        }
        throw new NullPointerException("Missing date component.");
    }

    /* JADX WARN: Incorrect types in method signature: <C:Lhj/m<*TC;>;>(TC;Lnet/time4j/g0;)Lnet/time4j/r<TC;>; */
    /* renamed from: d */
    public static C10983r m11378d(AbstractC8073m mVar, C10906g0 g0Var) {
        if (mVar != null) {
            return new C10983r(null, mVar, g0Var);
        }
        throw new NullPointerException("Missing date component.");
    }

    /* renamed from: h */
    private AbstractC8077o m11374h() {
        AbstractC8070l<?> lVar = this.f24396k;
        return lVar == null ? this.f24397l : lVar;
    }

    /* renamed from: a */
    public C10779a0 m11381a(AbstractC11002l lVar, AbstractC8053f0 f0Var) {
        C10917h0 h0Var;
        AbstractC8070l<?> lVar2 = this.f24396k;
        if (lVar2 == null) {
            h0Var = ((C10892f0) this.f24397l.m20666W(C10892f0.class)).m11838s0(this.f24398m);
        } else {
            h0Var = ((C10892f0) lVar2.m20677K(C10892f0.class)).m11838s0(this.f24398m);
        }
        int intValue = ((Integer) this.f24398m.mo11371r(C10906g0.f38917J)).intValue() - f0Var.mo20737b(h0Var.m11657Y(), lVar.mo11286z());
        if (intValue >= 86400) {
            h0Var = h0Var.m20684J(1L, EnumC10882f.f24155r);
        } else if (intValue < 0) {
            h0Var = h0Var.m20683K(1L, EnumC10882f.f24155r);
        }
        return h0Var.m11653b0(lVar);
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: b */
    public <V> V mo11380b(AbstractC8079p<V> pVar) {
        return pVar.mo11063M() ? (V) m11374h().mo11380b(pVar) : (V) this.f24398m.mo11380b(pVar);
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: e */
    public boolean mo11377e(AbstractC8079p<?> pVar) {
        return pVar.mo11063M() ? m11374h().mo11377e(pVar) : this.f24398m.mo11377e(pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10983r)) {
            return false;
        }
        C10983r rVar = (C10983r) C10983r.class.cast(obj);
        if (!this.f24398m.equals(rVar.f24398m)) {
            return false;
        }
        AbstractC8070l<?> lVar = this.f24396k;
        if (lVar == null) {
            if (rVar.f24396k != null || !this.f24397l.equals(rVar.f24397l)) {
                return false;
            }
            return true;
        } else if (rVar.f24397l != null || !lVar.equals(rVar.f24396k)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: f */
    public boolean mo11376f() {
        return false;
    }

    /* renamed from: g */
    public C m11375g() {
        C c = (C) this.f24396k;
        return c == null ? (C) this.f24397l : c;
    }

    public int hashCode() {
        int i;
        AbstractC8070l<?> lVar = this.f24396k;
        if (lVar == null) {
            i = this.f24397l.hashCode();
        } else {
            i = lVar.hashCode();
        }
        return i + this.f24398m.hashCode();
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: k */
    public <V> V mo11373k(AbstractC8079p<V> pVar) {
        return pVar.mo11063M() ? (V) m11374h().mo11373k(pVar) : (V) this.f24398m.mo11373k(pVar);
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: q */
    public AbstractC11001k mo11372q() {
        throw new C8081r("Timezone not available: " + this);
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: r */
    public <V> V mo11371r(AbstractC8079p<V> pVar) {
        return pVar.mo11063M() ? (V) m11374h().mo11371r(pVar) : (V) this.f24398m.mo11371r(pVar);
    }

    @Override // p143hj.AbstractC8077o
    /* renamed from: s */
    public int mo11370s(AbstractC8079p<Integer> pVar) {
        return pVar.mo11063M() ? m11374h().mo11370s(pVar) : this.f24398m.mo11370s(pVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        AbstractC8070l<?> lVar = this.f24396k;
        if (lVar == null) {
            sb2.append(this.f24397l);
        } else {
            sb2.append(lVar);
        }
        sb2.append(this.f24398m);
        return sb2.toString();
    }
}
