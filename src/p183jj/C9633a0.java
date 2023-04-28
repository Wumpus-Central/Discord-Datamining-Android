package p183jj;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Locale;
import java.util.Set;
import net.time4j.C10892f0;
import net.time4j.EnumC10809b0;
import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;
import p161ij.AbstractC8669t;
import p161ij.C8627a;
import p161ij.EnumC8637g;
import p161ij.EnumC8658m;
import p161ij.EnumC8671v;
import p201kj.AbstractC9886a;
import p201kj.AbstractC9890e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.a0 */
/* loaded from: classes8.dex */
public final class C9633a0<V> implements AbstractC9657h<V> {

    /* renamed from: k */
    private final AbstractC8669t<V> f21307k;

    /* renamed from: l */
    private final boolean f21308l;

    /* renamed from: m */
    private final AbstractC9890e<V> f21309m;

    /* renamed from: n */
    private final Locale f21310n;

    /* renamed from: o */
    private final EnumC8671v f21311o;

    /* renamed from: p */
    private final EnumC8658m f21312p;

    /* renamed from: q */
    private final EnumC8637g f21313q;

    /* renamed from: r */
    private final int f21314r;

    private C9633a0(AbstractC8669t<V> tVar, boolean z, Locale locale, EnumC8671v vVar, EnumC8658m mVar, EnumC8637g gVar, int i) {
        AbstractC9890e<V> eVar;
        if (tVar != null) {
            this.f21307k = tVar;
            this.f21308l = z;
            if (tVar instanceof AbstractC9890e) {
                eVar = (AbstractC9890e) tVar;
            } else {
                eVar = null;
            }
            this.f21309m = eVar;
            this.f21310n = locale;
            this.f21311o = vVar;
            this.f21312p = mVar;
            this.f21313q = gVar;
            this.f21314r = i;
            return;
        }
        throw new NullPointerException("Missing element.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <V> C9633a0<V> m15917a(AbstractC8669t<V> tVar) {
        return new C9633a0<>(tVar, false, Locale.ROOT, EnumC8671v.WIDE, EnumC8658m.FORMAT, EnumC8637g.SMART, 0);
    }

    /* renamed from: h */
    private boolean m15916h(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, boolean z) {
        AbstractC9890e<V> eVar = this.f21309m;
        if (eVar != null && z) {
            eVar.mo11389t(oVar, appendable, this.f21310n, this.f21311o, this.f21312p);
            return true;
        } else if (!oVar.mo11377e(this.f21307k)) {
            return false;
        } else {
            this.f21307k.mo11052z(oVar, appendable, dVar);
            return true;
        }
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<V> mo15599b() {
        return this.f21307k;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        if (appendable instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) appendable;
            int length = charSequence.length();
            if (!m15916h(oVar, appendable, dVar, z)) {
                return -1;
            }
            if (set != null) {
                set.add(new C9653g(this.f21307k, length, charSequence.length()));
            }
            return charSequence.length() - length;
        } else if (m15916h(oVar, appendable, dVar, z)) {
            return ViewDefaults.NUMBER_OF_LINES;
        } else {
            return -1;
        }
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<V> mo15597d(AbstractC8079p<V> pVar) {
        if (this.f21308l || this.f21307k == pVar) {
            return this;
        }
        if (pVar instanceof AbstractC8669t) {
            return m15917a((AbstractC8669t) pVar);
        }
        throw new IllegalArgumentException("Text element required: " + pVar.getClass().getName());
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    public void mo15596e(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, AbstractC9676t<?> tVar, boolean z) {
        int i;
        Object obj;
        AbstractC9890e<V> eVar;
        int f = sVar.m15664f();
        int length = charSequence.length();
        if (z) {
            i = this.f21314r;
        } else {
            i = ((Integer) dVar.mo15674c(C8627a.f19070s, 0)).intValue();
        }
        if (i > 0) {
            length -= i;
        }
        if (f >= length) {
            sVar.m15659k(f, "Missing chars for: " + this.f21307k.name());
            sVar.m15656n();
            return;
        }
        if (!z || (eVar = this.f21309m) == null || this.f21313q == null) {
            AbstractC8669t<V> tVar2 = this.f21307k;
            if (tVar2 instanceof AbstractC9886a) {
                obj = ((AbstractC9886a) tVar2).mo11506p(charSequence, sVar.m15665e(), dVar, tVar);
            } else {
                obj = tVar2.mo11054u(charSequence, sVar.m15665e(), dVar);
            }
        } else {
            obj = eVar.mo11390e(charSequence, sVar.m15665e(), this.f21310n, this.f21311o, this.f21312p, this.f21313q);
        }
        if (sVar.m15661i()) {
            Class<V> type = this.f21307k.getType();
            if (type.isEnum()) {
                int c = sVar.m15667c();
                sVar.m15659k(c, "No suitable enum found: " + type.getName());
                return;
            }
            int c2 = sVar.m15667c();
            sVar.m15659k(c2, "Unparseable element: " + this.f21307k.name());
        } else if (obj == null) {
            sVar.m15659k(f, "No interpretable value.");
        } else {
            AbstractC8669t<V> tVar3 = this.f21307k;
            if (tVar3 == C10892f0.f38898C) {
                tVar.mo15649G(C10892f0.f38899D, ((EnumC10809b0) EnumC10809b0.class.cast(obj)).m12221b());
            } else {
                tVar.mo15648I(tVar3, obj);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9633a0)) {
            return false;
        }
        C9633a0 a0Var = (C9633a0) obj;
        if (!this.f21307k.equals(a0Var.f21307k) || this.f21308l != a0Var.f21308l) {
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
        EnumC8637g gVar;
        AbstractC8046c<EnumC8637g> cVar2 = C8627a.f19057f;
        EnumC8637g gVar2 = EnumC8637g.SMART;
        EnumC8637g gVar3 = (EnumC8637g) dVar.mo15674c(cVar2, gVar2);
        AbstractC8046c<Boolean> cVar3 = C8627a.f19062k;
        Boolean bool = Boolean.TRUE;
        boolean booleanValue = ((Boolean) dVar.mo15674c(cVar3, bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) dVar.mo15674c(C8627a.f19060i, bool)).booleanValue();
        boolean booleanValue3 = ((Boolean) dVar.mo15674c(C8627a.f19061j, Boolean.FALSE)).booleanValue();
        if ((gVar3 != EnumC8637g.STRICT || (!booleanValue && !booleanValue2 && !booleanValue3)) && ((gVar3 != gVar2 || (booleanValue && booleanValue2 && !booleanValue3)) && booleanValue && booleanValue2 && booleanValue3)) {
            gVar = gVar3;
        } else {
            gVar = null;
        }
        return new C9633a0(this.f21307k, this.f21308l, (Locale) dVar.mo15674c(C8627a.f19054c, Locale.ROOT), (EnumC8671v) dVar.mo15674c(C8627a.f19058g, EnumC8671v.WIDE), (EnumC8658m) dVar.mo15674c(C8627a.f19059h, EnumC8658m.FORMAT), gVar, ((Integer) dVar.mo15674c(C8627a.f19070s, 0)).intValue());
    }

    public int hashCode() {
        return this.f21307k.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9633a0.class.getName());
        sb2.append("[element=");
        sb2.append(this.f21307k.name());
        sb2.append(",protected-mode=");
        sb2.append(this.f21308l);
        sb2.append(']');
        return sb2.toString();
    }
}
