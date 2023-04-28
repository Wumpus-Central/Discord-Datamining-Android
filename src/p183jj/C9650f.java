package p183jj;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import net.time4j.C10779a0;
import net.time4j.C10810b1;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8083t;
import p143hj.C8087x;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.f */
/* loaded from: classes8.dex */
public final class C9650f<V> implements AbstractC9657h<V> {

    /* renamed from: r */
    private static final AbstractC8083t<AbstractC8077o, Void> f21395r = new C9651a();

    /* renamed from: k */
    private final AbstractC8079p<V> f21396k;

    /* renamed from: l */
    private final AbstractC9648e<V> f21397l;

    /* renamed from: m */
    private final AbstractC9645d<V> f21398m;

    /* renamed from: n */
    private final boolean f21399n;

    /* renamed from: o */
    private boolean f21400o;

    /* renamed from: p */
    private boolean f21401p;

    /* renamed from: q */
    private boolean f21402q;

    /* renamed from: jj.f$a */
    /* loaded from: classes8.dex */
    static class C9651a implements AbstractC8083t<AbstractC8077o, Void> {
        C9651a() {
        }

        /* renamed from: a */
        public Void apply(AbstractC8077o oVar) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9650f(AbstractC8079p<V> pVar, AbstractC9648e<V> eVar, AbstractC9645d<V> dVar) {
        this(pVar, eVar, dVar, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static Map<AbstractC8079p<?>, Object> m15778a(Map<AbstractC8079p<?>, Object> map, C9637c<?> cVar) {
        C8087x<?> q = cVar.m15860q();
        HashMap hashMap = new HashMap();
        for (AbstractC8079p<?> pVar : map.keySet()) {
            if (q.mo20656D(pVar)) {
                hashMap.put(pVar, map.get(pVar));
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    private static <T> Set<C9653g> m15776i(C9637c<T> cVar, Object obj, StringBuilder sb2, AbstractC8048d dVar) {
        return cVar.m15886K(cVar.m15860q().m20648q().cast(obj), sb2, dVar);
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<V> mo15599b() {
        return this.f21396k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        if (z && this.f21400o) {
            dVar = ((C9637c) C9637c.class.cast(this.f21397l)).m15862o();
        }
        if (!this.f21399n || !(oVar instanceof C10810b1) || set != null) {
            Object r = oVar.mo11371r(this.f21396k);
            StringBuilder sb2 = new StringBuilder();
            if (!(appendable instanceof CharSequence) || set == null) {
                this.f21397l.mo15705b(r, sb2, dVar, f21395r);
            } else {
                int length = ((CharSequence) appendable).length();
                AbstractC9648e<V> eVar = this.f21397l;
                if (eVar instanceof C9637c) {
                    Set<C9653g> i = m15776i((C9637c) C9637c.class.cast(eVar), r, sb2, dVar);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (C9653g gVar : i) {
                        linkedHashSet.add(new C9653g(gVar.m15772a(), gVar.m15770c() + length, gVar.m15771b() + length));
                    }
                    set.addAll(linkedHashSet);
                } else {
                    eVar.mo15705b(r, sb2, dVar, f21395r);
                }
                set.add(new C9653g(this.f21396k, length, sb2.length() + length));
            }
            appendable.append(sb2);
            return sb2.length();
        }
        ((C9637c) this.f21397l).m15887J(oVar, appendable, dVar, false);
        return ViewDefaults.NUMBER_OF_LINES;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<V> mo15597d(AbstractC8079p<V> pVar) {
        if (this.f21396k == pVar) {
            return this;
        }
        return new C9650f(pVar, this.f21397l, this.f21398m);
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    public void mo15596e(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, AbstractC9676t<?> tVar, boolean z) {
        int f = sVar.m15664f();
        if (z) {
            try {
                if (this.f21401p) {
                    dVar = ((C9637c) C9637c.class.cast(this.f21398m)).m15862o();
                }
            } catch (IndexOutOfBoundsException e) {
                sVar.m15659k(f, e.getMessage());
                return;
            }
        }
        V a = this.f21398m.mo15704a(charSequence, sVar, dVar);
        if (a == null) {
            sVar.m15659k(f, sVar.m15666d());
        } else if (!this.f21402q || !(tVar instanceof C9677u)) {
            AbstractC8080q<?> g = sVar.m15663g();
            for (AbstractC8079p<?> pVar : g.mo15628v()) {
                if (pVar.getType() == Integer.class) {
                    tVar.mo15649G(pVar, g.mo11370s(pVar));
                } else {
                    tVar.mo15648I(pVar, g.mo11371r(pVar));
                }
            }
            tVar.mo15648I(this.f21396k, a);
        } else {
            tVar.mo15647J(a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9650f)) {
            return false;
        }
        C9650f fVar = (C9650f) obj;
        if (!this.f21396k.equals(fVar.f21396k) || !this.f21397l.equals(fVar.f21397l) || !this.f21398m.equals(fVar.f21398m)) {
            return false;
        }
        return true;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: f */
    public boolean mo15595f() {
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: g */
    public AbstractC9657h<V> mo15594g(C9637c<?> cVar, AbstractC8048d dVar, int i) {
        boolean z;
        boolean z2;
        C9637c cVar2;
        boolean z3;
        C9637c cVar3;
        if (!cVar.m15851z() || !this.f21396k.getType().equals(cVar.m15860q().m20648q())) {
            z = false;
        } else {
            z = true;
        }
        if (dVar instanceof C9634b) {
            AbstractC9648e<V> eVar = this.f21397l;
            AbstractC9645d<V> dVar2 = this.f21398m;
            Map<AbstractC8079p<?>, Object> r = cVar.m15859r();
            C9634b bVar = (C9634b) dVar;
            AbstractC9648e<V> eVar2 = this.f21397l;
            if (eVar2 instanceof C9637c) {
                C9637c cVar4 = (C9637c) C9637c.class.cast(eVar2);
                cVar2 = cVar4.m15877T(m15778a(r, cVar4), bVar);
                z2 = true;
            } else {
                cVar2 = eVar;
                z2 = false;
            }
            AbstractC9645d<V> dVar3 = this.f21398m;
            if (dVar3 instanceof C9637c) {
                C9637c cVar5 = (C9637c) C9637c.class.cast(dVar3);
                cVar3 = cVar5.m15877T(m15778a(r, cVar5), bVar);
                z3 = true;
            } else {
                z3 = false;
                cVar3 = dVar2;
            }
            return new C9650f(this.f21396k, cVar2, cVar3, z2, z3, z);
        } else if (this.f21400o || this.f21401p) {
            return new C9650f(this.f21396k, this.f21397l, this.f21398m);
        } else {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m15777h() {
        return this.f21402q;
    }

    public int hashCode() {
        return (this.f21396k.hashCode() * 7) + (this.f21397l.hashCode() * 31) + (this.f21398m.hashCode() * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9650f.class.getName());
        sb2.append("[element=");
        sb2.append(this.f21396k.name());
        sb2.append(", printer=");
        sb2.append(this.f21397l);
        sb2.append(", parser=");
        sb2.append(this.f21398m);
        sb2.append(']');
        return sb2.toString();
    }

    private C9650f(AbstractC8079p<V> pVar, AbstractC9648e<V> eVar, AbstractC9645d<V> dVar, boolean z, boolean z2, boolean z3) {
        if (pVar == null) {
            throw new NullPointerException("Missing element.");
        } else if (eVar == null) {
            throw new NullPointerException("Missing printer.");
        } else if (dVar != null) {
            this.f21396k = pVar;
            this.f21397l = eVar;
            this.f21398m = dVar;
            this.f21399n = (eVar instanceof C9637c) && pVar.getType() == C10779a0.class;
            this.f21400o = z;
            this.f21401p = z2;
            this.f21402q = z3;
        } else {
            throw new NullPointerException("Missing parser.");
        }
    }
}
