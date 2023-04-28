package ki;

import fi.AbstractC7223a0;
import fi.AbstractC7237e;
import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.AbstractC7335v1;
import fi.C7236d1;
import fi.C7270h0;
import fi.C7296m1;
import fi.C7305o1;
import fi.C7306p;
import fi.C7322s1;
import fi.C7329u0;
import fi.C7331u1;
import fi.C7337w0;
import fi.EnumC7338w1;
import gi.AbstractC7659e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;
import p142hi.C8036h;
import p217lg.AbstractC10420h;
import p267of.C11280m;
import p268og.AbstractC11316e1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11330i;
import pg.AbstractC11672g;

/* renamed from: ki.a */
/* loaded from: classes8.dex */
public final class C9883a {

    /* renamed from: ki.a$a */
    /* loaded from: classes8.dex */
    static final class C0302a extends AbstractC9973s implements Function1<AbstractC7335v1, Boolean> {

        /* renamed from: k */
        public static final C0302a f22036k = new C0302a();

        C0302a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC7335v1 it) {
            boolean z;
            C9971q.m14633g(it, "it");
            AbstractC11326h p = it.mo5172N0().mo4565p();
            if (p != null) {
                z = C9883a.m15088q(p);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ki.a$b */
    /* loaded from: classes8.dex */
    static final class C9884b extends AbstractC9973s implements Function1<AbstractC7335v1, Boolean> {

        /* renamed from: k */
        public static final C9884b f22037k = new C9884b();

        C9884b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC7335v1 v1Var) {
            return Boolean.valueOf(C7322s1.m22934m(v1Var));
        }
    }

    /* renamed from: ki.a$c */
    /* loaded from: classes8.dex */
    static final class C9885c extends AbstractC9973s implements Function1<AbstractC7335v1, Boolean> {

        /* renamed from: k */
        public static final C9885c f22038k = new C9885c();

        C9885c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC7335v1 it) {
            C9971q.m14633g(it, "it");
            AbstractC11326h p = it.mo5172N0().mo4565p();
            boolean z = false;
            if (p != null && ((p instanceof AbstractC11316e1) || (p instanceof AbstractC11319f1))) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final AbstractC7290k1 m15104a(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        return new C7296m1(g0Var);
    }

    /* renamed from: b */
    public static final boolean m15103b(AbstractC7267g0 g0Var, Function1<? super AbstractC7335v1, Boolean> predicate) {
        C9971q.m14633g(g0Var, "<this>");
        C9971q.m14633g(predicate, "predicate");
        return C7322s1.m22944c(g0Var, predicate);
    }

    /* renamed from: c */
    private static final boolean m15102c(AbstractC7267g0 g0Var, AbstractC7268g1 g1Var, Set<? extends AbstractC11319f1> set) {
        AbstractC11330i iVar;
        List<AbstractC11319f1> list;
        Iterable<C11280m> J0;
        AbstractC11319f1 f1Var;
        boolean z;
        boolean z2;
        Object X;
        if (C9971q.m14638b(g0Var.mo5172N0(), g1Var)) {
            return true;
        }
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (p instanceof AbstractC11330i) {
            iVar = (AbstractC11330i) p;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            list = iVar.mo6109r();
        } else {
            list = null;
        }
        J0 = C9914r.m14783J0(g0Var.mo5174L0());
        if (!(J0 instanceof Collection) || !((Collection) J0).isEmpty()) {
            for (C11280m mVar : J0) {
                int a = mVar.m10279a();
                AbstractC7290k1 k1Var = (AbstractC7290k1) mVar.m10278b();
                if (list != null) {
                    X = C9914r.m14767X(list, a);
                    f1Var = (AbstractC11319f1) X;
                } else {
                    f1Var = null;
                }
                if (f1Var == null || set == null || !set.contains(f1Var)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || k1Var.mo22907a()) {
                    z2 = false;
                    continue;
                } else {
                    AbstractC7267g0 type = k1Var.getType();
                    C9971q.m14634f(type, "argument.type");
                    z2 = m15102c(type, g1Var, set);
                    continue;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m15101d(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        return m15103b(g0Var, C0302a.f22036k);
    }

    /* renamed from: e */
    public static final boolean m15100e(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        return C7322s1.m22944c(g0Var, C9884b.f22037k);
    }

    /* renamed from: f */
    public static final AbstractC7290k1 m15099f(AbstractC7267g0 type, EnumC7338w1 projectionKind, AbstractC11319f1 f1Var) {
        EnumC7338w1 w1Var;
        C9971q.m14633g(type, "type");
        C9971q.m14633g(projectionKind, "projectionKind");
        if (f1Var != null) {
            w1Var = f1Var.mo6392m();
        } else {
            w1Var = null;
        }
        if (w1Var == projectionKind) {
            projectionKind = EnumC7338w1.INVARIANT;
        }
        return new C7296m1(projectionKind, type);
    }

    /* renamed from: g */
    public static final Set<AbstractC11319f1> m15098g(AbstractC7267g0 g0Var, Set<? extends AbstractC11319f1> set) {
        C9971q.m14633g(g0Var, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m15097h(g0Var, g0Var, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private static final void m15097h(AbstractC7267g0 g0Var, AbstractC7267g0 g0Var2, Set<AbstractC11319f1> set, Set<? extends AbstractC11319f1> set2) {
        AbstractC11330i iVar;
        List<AbstractC11319f1> list;
        AbstractC11319f1 f1Var;
        boolean z;
        boolean M;
        Object X;
        AbstractC11326h p = g0Var.mo5172N0().mo4565p();
        if (!(p instanceof AbstractC11319f1)) {
            AbstractC11326h p2 = g0Var.mo5172N0().mo4565p();
            if (p2 instanceof AbstractC11330i) {
                iVar = (AbstractC11330i) p2;
            } else {
                iVar = null;
            }
            if (iVar != null) {
                list = iVar.mo6109r();
            } else {
                list = null;
            }
            int i = 0;
            for (AbstractC7290k1 k1Var : g0Var.mo5174L0()) {
                int i2 = i + 1;
                if (list != null) {
                    X = C9914r.m14767X(list, i);
                    f1Var = (AbstractC11319f1) X;
                } else {
                    f1Var = null;
                }
                if (f1Var == null || set2 == null || !set2.contains(f1Var)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && !k1Var.mo22907a()) {
                    M = C9914r.m14778M(set, k1Var.getType().mo5172N0().mo4565p());
                    if (!M && !C9971q.m14638b(k1Var.getType().mo5172N0(), g0Var2.mo5172N0())) {
                        AbstractC7267g0 type = k1Var.getType();
                        C9971q.m14634f(type, "argument.type");
                        m15097h(type, g0Var2, set, set2);
                    }
                }
                i = i2;
            }
        } else if (!C9971q.m14638b(g0Var.mo5172N0(), g0Var2.mo5172N0())) {
            set.add(p);
        } else {
            for (AbstractC7267g0 upperBound : ((AbstractC11319f1) p).getUpperBounds()) {
                C9971q.m14634f(upperBound, "upperBound");
                m15097h(upperBound, g0Var2, set, set2);
            }
        }
    }

    /* renamed from: i */
    public static final AbstractC10420h m15096i(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        AbstractC10420h n = g0Var.mo5172N0().mo4567n();
        C9971q.m14634f(n, "constructor.builtIns");
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        r3 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[EDGE_INSN: B:21:0x0051->B:17:0x0051 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final fi.AbstractC7267g0 m15095j(p268og.AbstractC11319f1 r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9971q.m14633g(r7, r0)
            java.util.List r0 = r7.getUpperBounds()
            java.lang.String r1 = "upperBounds"
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            r0.isEmpty()
            java.util.List r0 = r7.getUpperBounds()
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x001c:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r0.next()
            r4 = r2
            fi.g0 r4 = (fi.AbstractC7267g0) r4
            fi.g1 r4 = r4.mo5172N0()
            og.h r4 = r4.mo4565p()
            boolean r5 = r4 instanceof p268og.AbstractC11313e
            if (r5 == 0) goto L_0x0039
            r3 = r4
            og.e r3 = (p268og.AbstractC11313e) r3
        L_0x0039:
            r4 = 0
            if (r3 != 0) goto L_0x003d
            goto L_0x004e
        L_0x003d:
            og.f r5 = r3.mo6116g()
            og.f r6 = p268og.EnumC11317f.INTERFACE
            if (r5 == r6) goto L_0x004e
            og.f r3 = r3.mo6116g()
            og.f r5 = p268og.EnumC11317f.ANNOTATION_CLASS
            if (r3 == r5) goto L_0x004e
            r4 = 1
        L_0x004e:
            if (r4 == 0) goto L_0x001c
            r3 = r2
        L_0x0051:
            fi.g0 r3 = (fi.AbstractC7267g0) r3
            if (r3 != 0) goto L_0x0068
            java.util.List r7 = r7.getUpperBounds()
            kotlin.jvm.internal.C9971q.m14634f(r7, r1)
            java.lang.Object r7 = kotlin.collections.C9904h.m14878U(r7)
            java.lang.String r0 = "upperBounds.first()"
            kotlin.jvm.internal.C9971q.m14634f(r7, r0)
            r3 = r7
            fi.g0 r3 = (fi.AbstractC7267g0) r3
        L_0x0068:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.C9883a.m15095j(og.f1):fi.g0");
    }

    /* renamed from: k */
    public static final boolean m15094k(AbstractC11319f1 typeParameter) {
        C9971q.m14633g(typeParameter, "typeParameter");
        return m15092m(typeParameter, null, null, 6, null);
    }

    /* renamed from: l */
    public static final boolean m15093l(AbstractC11319f1 typeParameter, AbstractC7268g1 g1Var, Set<? extends AbstractC11319f1> set) {
        boolean z;
        C9971q.m14633g(typeParameter, "typeParameter");
        List<AbstractC7267g0> upperBounds = typeParameter.getUpperBounds();
        C9971q.m14634f(upperBounds, "typeParameter.upperBounds");
        if ((upperBounds instanceof Collection) && upperBounds.isEmpty()) {
            return false;
        }
        for (AbstractC7267g0 upperBound : upperBounds) {
            C9971q.m14634f(upperBound, "upperBound");
            if (!m15102c(upperBound, typeParameter.mo6166p().mo5172N0(), set) || (g1Var != null && !C9971q.m14638b(upperBound.mo5172N0(), g1Var))) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static /* synthetic */ boolean m15092m(AbstractC11319f1 f1Var, AbstractC7268g1 g1Var, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            g1Var = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return m15093l(f1Var, g1Var, set);
    }

    /* renamed from: n */
    public static final boolean m15091n(AbstractC7267g0 g0Var) {
        boolean z;
        C9971q.m14633g(g0Var, "<this>");
        if (g0Var instanceof AbstractC7237e) {
            return true;
        }
        if (!(g0Var instanceof C7306p) || !(((C7306p) g0Var).m22991Z0() instanceof AbstractC7237e)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final boolean m15090o(AbstractC7267g0 g0Var) {
        boolean z;
        C9971q.m14633g(g0Var, "<this>");
        if (g0Var instanceof C7337w0) {
            return true;
        }
        if (!(g0Var instanceof C7306p) || !(((C7306p) g0Var).m22991Z0() instanceof C7337w0)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static final boolean m15089p(AbstractC7267g0 g0Var, AbstractC7267g0 superType) {
        C9971q.m14633g(g0Var, "<this>");
        C9971q.m14633g(superType, "superType");
        return AbstractC7659e.f16659a.mo21674b(g0Var, superType);
    }

    /* renamed from: q */
    public static final boolean m15088q(AbstractC11326h hVar) {
        C9971q.m14633g(hVar, "<this>");
        if (!(hVar instanceof AbstractC11319f1) || !(((AbstractC11319f1) hVar).mo6104b() instanceof AbstractC11316e1)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static final boolean m15087r(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        return C7322s1.m22934m(g0Var);
    }

    /* renamed from: s */
    public static final boolean m15086s(AbstractC7267g0 type) {
        C9971q.m14633g(type, "type");
        if (!(type instanceof C8036h) || !((C8036h) type).m20784X0().m20778c()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static final AbstractC7267g0 m15085t(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        AbstractC7267g0 n = C7322s1.m22933n(g0Var);
        C9971q.m14634f(n, "makeNotNullable(this)");
        return n;
    }

    /* renamed from: u */
    public static final AbstractC7267g0 m15084u(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        AbstractC7267g0 o = C7322s1.m22932o(g0Var);
        C9971q.m14634f(o, "makeNullable(this)");
        return o;
    }

    /* renamed from: v */
    public static final AbstractC7267g0 m15083v(AbstractC7267g0 g0Var, AbstractC11672g newAnnotations) {
        C9971q.m14633g(g0Var, "<this>");
        C9971q.m14633g(newAnnotations, "newAnnotations");
        if (!g0Var.getAnnotations().isEmpty() || !newAnnotations.isEmpty()) {
            return g0Var.mo22868Q0().mo5167T0(C7236d1.m23141a(g0Var.mo5173M0(), newAnnotations));
        }
        return g0Var;
    }

    /* renamed from: w */
    public static final AbstractC7267g0 m15082w(AbstractC7267g0 g0Var) {
        AbstractC7304o0 o0Var;
        int t;
        int t2;
        int t3;
        C9971q.m14633g(g0Var, "<this>");
        AbstractC7335v1 Q0 = g0Var.mo22868Q0();
        if (Q0 instanceof AbstractC7223a0) {
            AbstractC7223a0 a0Var = (AbstractC7223a0) Q0;
            AbstractC7304o0 V0 = a0Var.m23170V0();
            if (!V0.mo5172N0().getParameters().isEmpty() && V0.mo5172N0().mo4565p() != null) {
                List<AbstractC11319f1> parameters = V0.mo5172N0().getParameters();
                C9971q.m14634f(parameters, "constructor.parameters");
                t3 = C9907k.m14809t(parameters, 10);
                ArrayList arrayList = new ArrayList(t3);
                for (AbstractC11319f1 f1Var : parameters) {
                    arrayList.add(new C7329u0(f1Var));
                }
                V0 = C7305o1.m22994f(V0, arrayList, null, 2, null);
            }
            AbstractC7304o0 W0 = a0Var.m23169W0();
            if (!W0.mo5172N0().getParameters().isEmpty() && W0.mo5172N0().mo4565p() != null) {
                List<AbstractC11319f1> parameters2 = W0.mo5172N0().getParameters();
                C9971q.m14634f(parameters2, "constructor.parameters");
                t2 = C9907k.m14809t(parameters2, 10);
                ArrayList arrayList2 = new ArrayList(t2);
                for (AbstractC11319f1 f1Var2 : parameters2) {
                    arrayList2.add(new C7329u0(f1Var2));
                }
                W0 = C7305o1.m22994f(W0, arrayList2, null, 2, null);
            }
            o0Var = C7270h0.m23056d(V0, W0);
        } else if (Q0 instanceof AbstractC7304o0) {
            AbstractC7304o0 o0Var2 = (AbstractC7304o0) Q0;
            boolean isEmpty = o0Var2.mo5172N0().getParameters().isEmpty();
            o0Var = o0Var2;
            if (!isEmpty) {
                AbstractC11326h p = o0Var2.mo5172N0().mo4565p();
                o0Var = o0Var2;
                if (p != null) {
                    List<AbstractC11319f1> parameters3 = o0Var2.mo5172N0().getParameters();
                    C9971q.m14634f(parameters3, "constructor.parameters");
                    t = C9907k.m14809t(parameters3, 10);
                    ArrayList arrayList3 = new ArrayList(t);
                    for (AbstractC11319f1 f1Var3 : parameters3) {
                        arrayList3.add(new C7329u0(f1Var3));
                    }
                    o0Var = C7305o1.m22994f(o0Var2, arrayList3, null, 2, null);
                }
            }
        } else {
            throw new C11088q();
        }
        return C7331u1.m22900b(o0Var, Q0);
    }

    /* renamed from: x */
    public static final boolean m15081x(AbstractC7267g0 g0Var) {
        C9971q.m14633g(g0Var, "<this>");
        return m15103b(g0Var, C9885c.f22038k);
    }
}
