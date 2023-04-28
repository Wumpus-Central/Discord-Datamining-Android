package p183jj;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Locale;
import java.util.Set;
import net.time4j.C10779a0;
import net.time4j.C10892f0;
import net.time4j.C10906g0;
import net.time4j.C10917h0;
import net.time4j.p248tz.AbstractC11001k;
import net.time4j.p248tz.AbstractC11002l;
import net.time4j.p248tz.AbstractC11027o;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8090y;
import p143hj.C8087x;
import p161ij.AbstractC8638h;
import p161ij.C8627a;
import p161ij.C8629b;
import p161ij.EnumC8635e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.z */
/* loaded from: classes8.dex */
public final class C9686z<T> implements AbstractC9657h<T> {

    /* renamed from: k */
    private final C9637c<T> f21541k;

    /* renamed from: l */
    private final AbstractC8090y f21542l;

    /* renamed from: m */
    private final AbstractC8090y f21543m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9686z(AbstractC8090y yVar, AbstractC8090y yVar2) {
        this(null, yVar, yVar2);
    }

    /* renamed from: a */
    private static <T> C9637c<T> m15600a(C8087x<?> xVar, AbstractC8090y yVar, AbstractC8090y yVar2, Locale locale, boolean z, AbstractC11002l lVar) {
        String str;
        if (xVar.equals(C10892f0.m11835v0())) {
            str = C8629b.m18454r((EnumC8635e) yVar, locale);
        } else if (xVar.equals(C10906g0.m11743l0())) {
            str = C8629b.m18452t((EnumC8635e) yVar2, locale);
        } else if (xVar.equals(C10917h0.m11660V())) {
            str = C8629b.m18451u((EnumC8635e) yVar, (EnumC8635e) yVar2, locale);
        } else if (xVar.equals(C10779a0.m12326W())) {
            str = C8629b.m18453s((EnumC8635e) yVar, (EnumC8635e) yVar2, locale);
        } else if (AbstractC8638h.class.isAssignableFrom(xVar.m20648q())) {
            str = xVar.mo11616g(yVar, locale);
        } else {
            throw new UnsupportedOperationException("Localized format patterns not available: " + xVar);
        }
        if (z && str.contains("yy") && !str.contains("yyy")) {
            str = str.replace("yy", "yyyy");
        }
        C9637c<T> C = C9637c.m15894C(str, EnumC9682w.CLDR, locale, xVar);
        if (lVar != null) {
            return C.m15876U(lVar);
        }
        return C;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<T> mo15599b() {
        return null;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        boolean z2;
        C9637c<T> cVar = this.f21541k;
        if (set != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Set<C9653g> J = cVar.m15887J(oVar, appendable, dVar, z2);
        if (set == null) {
            return ViewDefaults.NUMBER_OF_LINES;
        }
        set.addAll(J);
        return ViewDefaults.NUMBER_OF_LINES;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<T> mo15597d(AbstractC8079p<T> pVar) {
        return this;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    public void mo15596e(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, AbstractC9676t<?> tVar, boolean z) {
        C9637c<T> cVar;
        if (z) {
            cVar = this.f21541k;
        } else {
            AbstractC8048d o = this.f21541k.m15862o();
            AbstractC8046c<AbstractC11027o> cVar2 = C8627a.f19056e;
            AbstractC11027o oVar = (AbstractC11027o) dVar.mo15674c(cVar2, o.mo15674c(cVar2, AbstractC11002l.f24453n));
            AbstractC8046c<AbstractC11001k> cVar3 = C8627a.f19055d;
            AbstractC11002l lVar = null;
            AbstractC11001k kVar = (AbstractC11001k) dVar.mo15674c(cVar3, o.mo15674c(cVar3, null));
            if (kVar != null) {
                lVar = AbstractC11002l.m11310N(kVar).mo11307Q(oVar);
            }
            cVar = m15600a(this.f21541k.m15860q(), this.f21542l, this.f21543m, (Locale) dVar.mo15674c(C8627a.f19054c, this.f21541k.m15856u()), ((Boolean) dVar.mo15674c(C8627a.f19073v, Boolean.FALSE)).booleanValue(), lVar);
        }
        T a = cVar.mo15704a(charSequence, sVar, dVar);
        if (!sVar.m15661i() && a != null) {
            tVar.mo15647J(a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9686z) {
            C9686z zVar = (C9686z) obj;
            if (this.f21542l.equals(zVar.f21542l) && this.f21543m.equals(zVar.f21543m)) {
                C9637c<T> cVar = this.f21541k;
                if (cVar != null) {
                    return cVar.equals(zVar.f21541k);
                }
                if (zVar.f21541k == null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: f */
    public boolean mo15595f() {
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: g */
    public AbstractC9657h<T> mo15594g(C9637c<?> cVar, AbstractC8048d dVar, int i) {
        AbstractC11027o oVar = (AbstractC11027o) dVar.mo15674c(C8627a.f19056e, AbstractC11002l.f24453n);
        AbstractC11002l lVar = null;
        AbstractC11001k kVar = (AbstractC11001k) dVar.mo15674c(C8627a.f19055d, null);
        Locale locale = (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT);
        C8087x<?> q = cVar.m15860q();
        AbstractC8090y yVar = this.f21542l;
        AbstractC8090y yVar2 = this.f21543m;
        boolean booleanValue = ((Boolean) dVar.mo15674c(C8627a.f19073v, Boolean.FALSE)).booleanValue();
        if (kVar != null) {
            lVar = AbstractC11002l.m11310N(kVar).mo11307Q(oVar);
        }
        return new C9686z(m15600a(q, yVar, yVar2, locale, booleanValue, lVar), this.f21542l, this.f21543m);
    }

    public int hashCode() {
        C9637c<T> cVar = this.f21541k;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9686z.class.getName());
        sb2.append("[date-style=");
        sb2.append(this.f21542l);
        sb2.append(",time-style=");
        sb2.append(this.f21543m);
        sb2.append(",delegate=");
        sb2.append(this.f21541k);
        sb2.append(']');
        return sb2.toString();
    }

    private C9686z(C9637c<T> cVar, AbstractC8090y yVar, AbstractC8090y yVar2) {
        if (yVar == null || yVar2 == null) {
            throw new NullPointerException("Missing display style.");
        }
        this.f21542l = yVar;
        this.f21543m = yVar2;
        this.f21541k = cVar;
    }
}
