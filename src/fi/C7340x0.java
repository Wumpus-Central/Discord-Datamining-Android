package fi;

import fi.AbstractC7347z0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ki.C9883a;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p268og.AbstractC11316e1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p448yh.AbstractC14411h;
import pg.AbstractC11666c;
import pg.AbstractC11672g;

/* renamed from: fi.x0 */
/* loaded from: classes8.dex */
public final class C7340x0 {

    /* renamed from: c */
    public static final C7341a f15829c = new C7341a(null);

    /* renamed from: d */
    private static final C7340x0 f15830d = new C7340x0(AbstractC7347z0.C7348a.f15841a, false);

    /* renamed from: a */
    private final AbstractC7347z0 f15831a;

    /* renamed from: b */
    private final boolean f15832b;

    /* renamed from: fi.x0$a */
    /* loaded from: classes8.dex */
    public static final class C7341a {
        private C7341a() {
        }

        public /* synthetic */ C7341a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m22869b(int i, AbstractC11316e1 e1Var) {
            if (i > 100) {
                throw new AssertionError("Too deep recursion while expanding type alias " + e1Var.getName());
            }
        }
    }

    public C7340x0(AbstractC7347z0 reportStrategy, boolean z) {
        C9971q.m14633g(reportStrategy, "reportStrategy");
        this.f15831a = reportStrategy;
        this.f15832b = z;
    }

    /* renamed from: a */
    private final void m22883a(AbstractC11672g gVar, AbstractC11672g gVar2) {
        HashSet hashSet = new HashSet();
        Iterator<AbstractC11666c> it = gVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().mo722e());
        }
        for (AbstractC11666c cVar : gVar2) {
            if (hashSet.contains(cVar.mo722e())) {
                this.f15831a.mo22852c(cVar);
            }
        }
    }

    /* renamed from: b */
    private final void m22882b(AbstractC7267g0 g0Var, AbstractC7267g0 g0Var2) {
        C7309p1 f = C7309p1.m22980f(g0Var2);
        C9971q.m14634f(f, "create(substitutedType)");
        int i = 0;
        for (Object obj : g0Var2.mo5174L0()) {
            int i2 = i + 1;
            if (i < 0) {
                C9906j.m14810s();
            }
            AbstractC7290k1 k1Var = (AbstractC7290k1) obj;
            if (!k1Var.mo22907a()) {
                AbstractC7267g0 type = k1Var.getType();
                C9971q.m14634f(type, "substitutedArgument.type");
                if (!C9883a.m15101d(type)) {
                    AbstractC7290k1 k1Var2 = g0Var.mo5174L0().get(i);
                    AbstractC11319f1 typeParameter = g0Var.mo5172N0().getParameters().get(i);
                    if (this.f15832b) {
                        AbstractC7347z0 z0Var = this.f15831a;
                        AbstractC7267g0 type2 = k1Var2.getType();
                        C9971q.m14634f(type2, "unsubstitutedArgument.type");
                        AbstractC7267g0 type3 = k1Var.getType();
                        C9971q.m14634f(type3, "substitutedArgument.type");
                        C9971q.m14634f(typeParameter, "typeParameter");
                        z0Var.mo22853b(f, type2, type3, typeParameter);
                    }
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    private final C7332v m22881c(C7332v vVar, C7232c1 c1Var) {
        return vVar.mo5167T0(m22876h(vVar, c1Var));
    }

    /* renamed from: d */
    private final AbstractC7304o0 m22880d(AbstractC7304o0 o0Var, C7232c1 c1Var) {
        return C7278i0.m23035a(o0Var) ? o0Var : C7305o1.m22994f(o0Var, null, m22876h(o0Var, c1Var), 1, null);
    }

    /* renamed from: e */
    private final AbstractC7304o0 m22879e(AbstractC7304o0 o0Var, AbstractC7267g0 g0Var) {
        AbstractC7304o0 r = C7322s1.m22929r(o0Var, g0Var.mo5171O0());
        C9971q.m14634f(r, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        return r;
    }

    /* renamed from: f */
    private final AbstractC7304o0 m22878f(AbstractC7304o0 o0Var, AbstractC7267g0 g0Var) {
        return m22880d(m22879e(o0Var, g0Var), g0Var.mo5173M0());
    }

    /* renamed from: g */
    private final AbstractC7304o0 m22877g(C7344y0 y0Var, C7232c1 c1Var, boolean z) {
        AbstractC7268g1 k = y0Var.m22860b().mo6111k();
        C9971q.m14634f(k, "descriptor.typeConstructor");
        return C7270h0.m23049k(c1Var, k, y0Var.m22861a(), z, AbstractC14411h.C14413b.f32626b);
    }

    /* renamed from: h */
    private final C7232c1 m22876h(AbstractC7267g0 g0Var, C7232c1 c1Var) {
        if (C7278i0.m23035a(g0Var)) {
            return g0Var.mo5173M0();
        }
        return c1Var.m23156i(g0Var.mo5173M0());
    }

    /* renamed from: j */
    private final AbstractC7290k1 m22874j(AbstractC7290k1 k1Var, C7344y0 y0Var, int i) {
        int t;
        AbstractC7335v1 Q0 = k1Var.getType().mo22868Q0();
        if (C7336w.m22890a(Q0)) {
            return k1Var;
        }
        AbstractC7304o0 a = C7305o1.m22999a(Q0);
        if (C7278i0.m23035a(a) || !C9883a.m15081x(a)) {
            return k1Var;
        }
        AbstractC7268g1 N0 = a.mo5172N0();
        AbstractC11326h p = N0.mo4565p();
        N0.getParameters().size();
        a.mo5174L0().size();
        if (p instanceof AbstractC11319f1) {
            return k1Var;
        }
        if (p instanceof AbstractC11316e1) {
            AbstractC11316e1 e1Var = (AbstractC11316e1) p;
            int i2 = 0;
            if (y0Var.m22858d(e1Var)) {
                this.f15831a.mo22854a(e1Var);
                EnumC7338w1 w1Var = EnumC7338w1.INVARIANT;
                EnumC8038j jVar = EnumC8038j.RECURSIVE_TYPE_ALIAS;
                String fVar = e1Var.getName().toString();
                C9971q.m14634f(fVar, "typeDescriptor.name.toString()");
                return new C7296m1(w1Var, C8039k.m20774d(jVar, fVar));
            }
            List<AbstractC7290k1> L0 = a.mo5174L0();
            t = C9907k.m14809t(L0, 10);
            ArrayList arrayList = new ArrayList(t);
            for (Object obj : L0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C9906j.m14810s();
                }
                arrayList.add(m22872l((AbstractC7290k1) obj, y0Var, N0.getParameters().get(i2), i + 1));
                i2 = i3;
            }
            AbstractC7304o0 k = m22873k(C7344y0.f15836e.m22857a(y0Var, e1Var, arrayList), a.mo5173M0(), a.mo5171O0(), i + 1, false);
            AbstractC7304o0 m = m22871m(a, y0Var, i);
            if (!C7336w.m22890a(k)) {
                k = C7321s0.m22948j(k, m);
            }
            return new C7296m1(k1Var.mo22906b(), k);
        }
        AbstractC7304o0 m2 = m22871m(a, y0Var, i);
        m22882b(a, m2);
        return new C7296m1(k1Var.mo22906b(), m2);
    }

    /* renamed from: k */
    private final AbstractC7304o0 m22873k(C7344y0 y0Var, C7232c1 c1Var, boolean z, int i, boolean z2) {
        AbstractC7290k1 l = m22872l(new C7296m1(EnumC7338w1.INVARIANT, y0Var.m22860b().mo10217q0()), y0Var, null, i);
        AbstractC7267g0 type = l.getType();
        C9971q.m14634f(type, "expandedProjection.type");
        AbstractC7304o0 a = C7305o1.m22999a(type);
        if (C7278i0.m23035a(a)) {
            return a;
        }
        l.mo22906b();
        m22883a(a.getAnnotations(), C7288k.m23011a(c1Var));
        AbstractC7304o0 r = C7322s1.m22929r(m22880d(a, c1Var), z);
        C9971q.m14634f(r, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        if (z2) {
            return C7321s0.m22948j(r, m22877g(y0Var, c1Var, z));
        }
        return r;
    }

    /* renamed from: l */
    private final AbstractC7290k1 m22872l(AbstractC7290k1 k1Var, C7344y0 y0Var, AbstractC11319f1 f1Var, int i) {
        EnumC7338w1 w1Var;
        AbstractC7267g0 g0Var;
        EnumC7338w1 w1Var2;
        EnumC7338w1 w1Var3;
        f15829c.m22869b(i, y0Var.m22860b());
        if (k1Var.mo22907a()) {
            C9971q.m14636d(f1Var);
            AbstractC7290k1 s = C7322s1.m22928s(f1Var);
            C9971q.m14634f(s, "makeStarProjection(typeParameterDescriptor!!)");
            return s;
        }
        AbstractC7267g0 type = k1Var.getType();
        C9971q.m14634f(type, "underlyingProjection.type");
        AbstractC7290k1 c = y0Var.m22859c(type.mo5172N0());
        if (c == null) {
            return m22874j(k1Var, y0Var, i);
        }
        if (c.mo22907a()) {
            C9971q.m14636d(f1Var);
            AbstractC7290k1 s2 = C7322s1.m22928s(f1Var);
            C9971q.m14634f(s2, "makeStarProjection(typeParameterDescriptor!!)");
            return s2;
        }
        AbstractC7335v1 Q0 = c.getType().mo22868Q0();
        EnumC7338w1 b = c.mo22906b();
        C9971q.m14634f(b, "argument.projectionKind");
        EnumC7338w1 b2 = k1Var.mo22906b();
        C9971q.m14634f(b2, "underlyingProjection.projectionKind");
        if (!(b2 == b || b2 == (w1Var3 = EnumC7338w1.INVARIANT))) {
            if (b == w1Var3) {
                b = b2;
            } else {
                this.f15831a.mo22851d(y0Var.m22860b(), f1Var, Q0);
            }
        }
        if (f1Var == null || (w1Var = f1Var.mo6392m()) == null) {
            w1Var = EnumC7338w1.INVARIANT;
        }
        C9971q.m14634f(w1Var, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
        if (!(w1Var == b || w1Var == (w1Var2 = EnumC7338w1.INVARIANT))) {
            if (b == w1Var2) {
                b = w1Var2;
            } else {
                this.f15831a.mo22851d(y0Var.m22860b(), f1Var, Q0);
            }
        }
        m22883a(type.getAnnotations(), Q0.getAnnotations());
        if (Q0 instanceof C7332v) {
            g0Var = m22881c((C7332v) Q0, type.mo5173M0());
        } else {
            g0Var = m22878f(C7305o1.m22999a(Q0), type);
        }
        return new C7296m1(b, g0Var);
    }

    /* renamed from: m */
    private final AbstractC7304o0 m22871m(AbstractC7304o0 o0Var, C7344y0 y0Var, int i) {
        int t;
        AbstractC7268g1 N0 = o0Var.mo5172N0();
        List<AbstractC7290k1> L0 = o0Var.mo5174L0();
        t = C9907k.m14809t(L0, 10);
        ArrayList arrayList = new ArrayList(t);
        int i2 = 0;
        for (Object obj : L0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C9906j.m14810s();
            }
            AbstractC7290k1 k1Var = (AbstractC7290k1) obj;
            AbstractC7290k1 l = m22872l(k1Var, y0Var, N0.getParameters().get(i2), i + 1);
            if (!l.mo22907a()) {
                l = new C7296m1(l.mo22906b(), C7322s1.m22930q(l.getType(), k1Var.getType().mo5171O0()));
            }
            arrayList.add(l);
            i2 = i3;
        }
        return C7305o1.m22994f(o0Var, arrayList, null, 2, null);
    }

    /* renamed from: i */
    public final AbstractC7304o0 m22875i(C7344y0 typeAliasExpansion, C7232c1 attributes) {
        C9971q.m14633g(typeAliasExpansion, "typeAliasExpansion");
        C9971q.m14633g(attributes, "attributes");
        return m22873k(typeAliasExpansion, attributes, false, 0, true);
    }
}
