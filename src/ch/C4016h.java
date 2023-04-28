package ch;

import fi.AbstractC7223a0;
import fi.AbstractC7267g0;
import fi.AbstractC7290k1;
import fi.AbstractC7298n0;
import fi.AbstractC7304o0;
import fi.C7232c1;
import gi.AbstractC7659e;
import gi.AbstractC7664g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ki.C9883a;
import kotlin.Pair;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p305qh.AbstractC12137c;
import p305qh.AbstractC12161f;
import p326ri.C12719v;
import p448yh.AbstractC14411h;

/* renamed from: ch.h */
/* loaded from: classes8.dex */
public final class C4016h extends AbstractC7223a0 implements AbstractC7298n0 {

    /* renamed from: ch.h$a */
    /* loaded from: classes8.dex */
    static final class C4017a extends AbstractC9973s implements Function1<String, CharSequence> {

        /* renamed from: k */
        public static final C4017a f6608k = new C4017a();

        C4017a() {
            super(1);
        }

        public final CharSequence invoke(String it) {
            C9971q.m14633g(it, "it");
            return "(raw) " + it;
        }
    }

    private C4016h(AbstractC7304o0 o0Var, AbstractC7304o0 o0Var2, boolean z) {
        super(o0Var, o0Var2);
        if (!z) {
            AbstractC7659e.f16659a.mo21674b(o0Var, o0Var2);
        }
    }

    /* renamed from: a1 */
    private static final boolean m33081a1(String str, String str2) {
        String p0;
        p0 = C12719v.m5670p0(str2, "out ");
        if (C9971q.m14638b(str, p0) || C9971q.m14638b(str2, "*")) {
            return true;
        }
        return false;
    }

    /* renamed from: b1 */
    private static final List<String> m33080b1(AbstractC12137c cVar, AbstractC7267g0 g0Var) {
        int t;
        List<AbstractC7290k1> L0 = g0Var.mo5174L0();
        t = C9907k.m14809t(L0, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC7290k1 k1Var : L0) {
            arrayList.add(cVar.mo7610x(k1Var));
        }
        return arrayList;
    }

    /* renamed from: c1 */
    private static final String m33079c1(String str, String str2) {
        boolean L;
        String P0;
        String M0;
        L = C12719v.m5711L(str, '<', false, 2, null);
        if (!L) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        P0 = C12719v.m5702P0(str, '<', null, 2, null);
        sb2.append(P0);
        sb2.append('<');
        sb2.append(str2);
        sb2.append('>');
        M0 = C12719v.m5708M0(str, '>', null, 2, null);
        sb2.append(M0);
        return sb2.toString();
    }

    @Override // fi.AbstractC7223a0
    /* renamed from: U0 */
    public AbstractC7304o0 mo22897U0() {
        return m23170V0();
    }

    @Override // fi.AbstractC7223a0
    /* renamed from: X0 */
    public String mo22896X0(AbstractC12137c renderer, AbstractC12161f options) {
        String e0;
        List K0;
        C9971q.m14633g(renderer, "renderer");
        C9971q.m14633g(options, "options");
        String w = renderer.mo7613w(m23170V0());
        String w2 = renderer.mo7613w(m23169W0());
        if (options.mo7537h()) {
            return "raw (" + w + ".." + w2 + ')';
        } else if (m23169W0().mo5174L0().isEmpty()) {
            return renderer.mo7622t(w, w2, C9883a.m15096i(this));
        } else {
            List<String> b1 = m33080b1(renderer, m23170V0());
            List<String> b12 = m33080b1(renderer, m23169W0());
            e0 = C9914r.m14760e0(b1, ", ", null, null, 0, null, C4017a.f6608k, 30, null);
            K0 = C9914r.m14781K0(b1, b12);
            boolean z = true;
            if (!(K0 instanceof Collection) || !K0.isEmpty()) {
                Iterator it = K0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) it.next();
                    if (!m33081a1((String) pair.m15065c(), (String) pair.m15064d())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                w2 = m33079c1(w2, e0);
            }
            String c1 = m33079c1(w, e0);
            if (C9971q.m14638b(c1, w2)) {
                return c1;
            }
            return renderer.mo7622t(c1, w2, C9883a.m15096i(this));
        }
    }

    /* renamed from: Y0 */
    public C4016h mo5169R0(boolean z) {
        return new C4016h(m23170V0().mo5166U0(z), m23169W0().mo5166U0(z));
    }

    /* renamed from: Z0 */
    public AbstractC7223a0 mo5168S0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7267g0 h = kotlinTypeRefiner.mo21694h(m23170V0());
        C9971q.m14635e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC7267g0 h2 = kotlinTypeRefiner.mo21694h(m23169W0());
        C9971q.m14635e(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C4016h((AbstractC7304o0) h, (AbstractC7304o0) h2, true);
    }

    /* renamed from: d1 */
    public C4016h mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        return new C4016h(m23170V0().mo5165V0(newAttributes), m23169W0().mo5165V0(newAttributes));
    }

    @Override // fi.AbstractC7223a0, fi.AbstractC7267g0
    /* renamed from: o */
    public AbstractC14411h mo5161o() {
        AbstractC11313e eVar;
        AbstractC11326h p = mo5172N0().mo4565p();
        if (p instanceof AbstractC11313e) {
            eVar = (AbstractC11313e) p;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            AbstractC14411h G = eVar.mo6176G(new C4013g(null, 1, null));
            C9971q.m14634f(G, "classDescriptor.getMemberScope(RawSubstitution())");
            return G;
        }
        throw new IllegalStateException(("Incorrect classifier: " + mo5172N0().mo4565p()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4016h(AbstractC7304o0 lowerBound, AbstractC7304o0 upperBound) {
        this(lowerBound, upperBound, false);
        C9971q.m14633g(lowerBound, "lowerBound");
        C9971q.m14633g(upperBound, "upperBound");
    }
}
