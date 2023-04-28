package ch;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.C7232c1;
import fi.C7236d1;
import fi.C7270h0;
import fi.C7281j0;
import fi.C7283j1;
import fi.C7296m1;
import fi.C7322s1;
import fi.EnumC7319r1;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.List;
import ki.C9883a;
import kotlin.collections.C9905i;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import ng.C11107d;
import p013ah.AbstractC1404k;
import p013ah.C1394d;
import p013ah.C1399g;
import p086eh.AbstractC6890c0;
import p086eh.AbstractC6894f;
import p086eh.AbstractC6895g;
import p086eh.AbstractC6897i;
import p086eh.AbstractC6898j;
import p086eh.AbstractC6910v;
import p086eh.AbstractC6912x;
import p086eh.AbstractC6913y;
import p086eh.C6886a0;
import p142hi.C8036h;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p217lg.EnumC10426i;
import p249nh.C11136b;
import p249nh.C11137c;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.C11337k0;
import p427xg.C14138j0;
import pg.AbstractC11666c;
import pg.AbstractC11672g;

/* renamed from: ch.d */
/* loaded from: classes8.dex */
public final class C4008d {

    /* renamed from: a */
    private final C1399g f6588a;

    /* renamed from: b */
    private final AbstractC1404k f6589b;

    /* renamed from: c */
    private final C4011f f6590c;

    /* renamed from: d */
    private final C7283j1 f6591d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.d$a */
    /* loaded from: classes8.dex */
    public static final class C4009a extends AbstractC9973s implements Function0<AbstractC7267g0> {

        /* renamed from: l */
        final /* synthetic */ AbstractC11319f1 f6593l;

        /* renamed from: m */
        final /* synthetic */ C4005a f6594m;

        /* renamed from: n */
        final /* synthetic */ AbstractC7268g1 f6595n;

        /* renamed from: o */
        final /* synthetic */ AbstractC6898j f6596o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4009a(AbstractC11319f1 f1Var, C4005a aVar, AbstractC7268g1 g1Var, AbstractC6898j jVar) {
            super(0);
            this.f6593l = f1Var;
            this.f6594m = aVar;
            this.f6595n = g1Var;
            this.f6596o = jVar;
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke() {
            AbstractC7304o0 o0Var;
            C7283j1 j1Var = C4008d.this.f6591d;
            AbstractC11319f1 f1Var = this.f6593l;
            C4005a aVar = this.f6594m;
            AbstractC11326h p = this.f6595n.mo4565p();
            if (p != null) {
                o0Var = p.mo6166p();
            } else {
                o0Var = null;
            }
            return j1Var.m23020c(f1Var, aVar.m33113k(o0Var).m33114j(this.f6596o.mo3994h()));
        }
    }

    public C4008d(C1399g c, AbstractC1404k typeParameterResolver) {
        C9971q.m14633g(c, "c");
        C9971q.m14633g(typeParameterResolver, "typeParameterResolver");
        this.f6588a = c;
        this.f6589b = typeParameterResolver;
        C4011f fVar = new C4011f();
        this.f6590c = fVar;
        this.f6591d = new C7283j1(fVar, null, 2, null);
    }

    /* renamed from: b */
    private final boolean m33106b(AbstractC6898j jVar, AbstractC11313e eVar) {
        Object i0;
        Object i02;
        EnumC7338w1 m;
        i0 = C9914r.m14756i0(jVar.mo3993z());
        if (!C6886a0.m23946a((AbstractC6912x) i0)) {
            return false;
        }
        List<AbstractC11319f1> parameters = C11107d.f24646a.m10888b(eVar).mo6111k().getParameters();
        C9971q.m14634f(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
        i02 = C9914r.m14756i0(parameters);
        AbstractC11319f1 f1Var = (AbstractC11319f1) i02;
        if (f1Var == null || (m = f1Var.mo6392m()) == null || m == EnumC7338w1.OUT_VARIANCE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x0025;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<fi.AbstractC7290k1> m33105c(p086eh.AbstractC6898j r12, ch.C4005a r13, fi.AbstractC7268g1 r14) {
        /*
            r11 = this;
            boolean r0 = r12.mo3994h()
            r1 = 0
            java.lang.String r2 = "constructor.parameters"
            r3 = 1
            if (r0 != 0) goto L_0x0025
            java.util.List r0 = r12.mo3993z()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0023
            java.util.List r0 = r14.getParameters()
            kotlin.jvm.internal.C9971q.m14634f(r0, r2)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = r1
            goto L_0x0026
        L_0x0025:
            r0 = r3
        L_0x0026:
            java.util.List r4 = r14.getParameters()
            kotlin.jvm.internal.C9971q.m14634f(r4, r2)
            if (r0 == 0) goto L_0x0034
            java.util.List r12 = r11.m33104d(r12, r4, r14, r13)
            return r12
        L_0x0034:
            int r13 = r4.size()
            java.util.List r14 = r12.mo3993z()
            int r14 = r14.size()
            r0 = 10
            if (r13 == r14) goto L_0x0082
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = kotlin.collections.C9904h.m14841t(r4, r0)
            r12.<init>(r13)
            java.util.Iterator r13 = r4.iterator()
        L_0x0051:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x007d
            java.lang.Object r14 = r13.next()
            og.f1 r14 = (p268og.AbstractC11319f1) r14
            fi.m1 r0 = new fi.m1
            hi.j r2 = p142hi.EnumC8038j.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            java.lang.String[] r4 = new java.lang.String[r3]
            nh.f r14 = r14.getName()
            java.lang.String r14 = r14.m10771b()
            java.lang.String r5 = "p.name.asString()"
            kotlin.jvm.internal.C9971q.m14634f(r14, r5)
            r4[r1] = r14
            hi.h r14 = p142hi.C8039k.m20774d(r2, r4)
            r0.<init>(r14)
            r12.add(r0)
            goto L_0x0051
        L_0x007d:
            java.util.List r12 = kotlin.collections.C9904h.m14898D0(r12)
            return r12
        L_0x0082:
            java.util.List r12 = r12.mo3993z()
            java.lang.Iterable r12 = kotlin.collections.C9904h.m14890J0(r12)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = kotlin.collections.C9904h.m14841t(r12, r0)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L_0x0097:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00ce
            java.lang.Object r14 = r12.next()
            of.m r14 = (p267of.C11280m) r14
            int r0 = r14.m10279a()
            java.lang.Object r14 = r14.m10278b()
            eh.x r14 = (p086eh.AbstractC6912x) r14
            r4.size()
            java.lang.Object r0 = r4.get(r0)
            og.f1 r0 = (p268og.AbstractC11319f1) r0
            fi.r1 r5 = fi.EnumC7319r1.COMMON
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 7
            r10 = 0
            ch.a r1 = ch.C4006b.m33109b(r5, r6, r7, r8, r9, r10)
            java.lang.String r2 = "parameter"
            kotlin.jvm.internal.C9971q.m14634f(r0, r2)
            fi.k1 r14 = r11.m33092p(r14, r1, r0)
            r13.add(r14)
            goto L_0x0097
        L_0x00ce:
            java.util.List r12 = kotlin.collections.C9904h.m14898D0(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.C4008d.m33105c(eh.j, ch.a, fi.g1):java.util.List");
    }

    /* renamed from: d */
    private final List<AbstractC7290k1> m33104d(AbstractC6898j jVar, List<? extends AbstractC11319f1> list, AbstractC7268g1 g1Var, C4005a aVar) {
        int t;
        AbstractC7290k1 k1Var;
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC11319f1 f1Var : list) {
            if (C9883a.m15093l(f1Var, null, aVar.mo22863c())) {
                k1Var = C7322s1.m22927t(f1Var, aVar);
            } else {
                k1Var = this.f6590c.mo22885a(f1Var, aVar.m33114j(jVar.mo3994h()), this.f6591d, new C7281j0(this.f6588a.m41170e(), new C4009a(f1Var, aVar, g1Var, jVar)));
            }
            arrayList.add(k1Var);
        }
        return arrayList;
    }

    /* renamed from: e */
    private final AbstractC7304o0 m33103e(AbstractC6898j jVar, C4005a aVar, AbstractC7304o0 o0Var) {
        C7232c1 c1Var;
        if (o0Var == null || (c1Var = o0Var.mo5173M0()) == null) {
            c1Var = C7236d1.m23140b(new C1394d(this.f6588a, jVar, false, 4, null));
        }
        AbstractC7268g1 f = m33102f(jVar, aVar);
        AbstractC7268g1 g1Var = null;
        if (f == null) {
            return null;
        }
        boolean i = m33099i(aVar);
        if (o0Var != null) {
            g1Var = o0Var.mo5172N0();
        }
        if (!C9971q.m14638b(g1Var, f) || jVar.mo3994h() || !i) {
            return C7270h0.m23050j(c1Var, f, m33105c(jVar, aVar, f), i, null, 16, null);
        }
        return o0Var.mo5166U0(true);
    }

    /* renamed from: f */
    private final AbstractC7268g1 m33102f(AbstractC6898j jVar, C4005a aVar) {
        AbstractC7268g1 k;
        AbstractC6897i d = jVar.mo3995d();
        if (d == null) {
            return m33101g(jVar);
        }
        if (d instanceof AbstractC6895g) {
            AbstractC6895g gVar = (AbstractC6895g) d;
            C11137c e = gVar.mo4017e();
            if (e != null) {
                AbstractC11313e j = m33098j(jVar, aVar, e);
                if (j == null) {
                    j = this.f6588a.m41174a().m41196n().mo41162a(gVar);
                }
                if (j == null || (k = j.mo6111k()) == null) {
                    return m33101g(jVar);
                }
                return k;
            }
            throw new AssertionError("Class type should have a FQ name: " + d);
        } else if (d instanceof AbstractC6913y) {
            AbstractC11319f1 a = this.f6589b.mo41159a((AbstractC6913y) d);
            if (a != null) {
                return a.mo6111k();
            }
            return null;
        } else {
            throw new IllegalStateException("Unknown classifier kind: " + d);
        }
    }

    /* renamed from: g */
    private final AbstractC7268g1 m33101g(AbstractC6898j jVar) {
        List<Integer> d;
        C11136b m = C11136b.m10805m(new C11137c(jVar.mo3996H()));
        C9971q.m14634f(m, "topLevel(FqName(javaType.classifierQualifiedName))");
        C11337k0 q = this.f6588a.m41174a().m41208b().m21872d().m34033q();
        d = C9905i.m14825d(0);
        AbstractC7268g1 k = q.m10197d(m, d).mo6111k();
        C9971q.m14634f(k, "c.components.deserialize…istOf(0)).typeConstructor");
        return k;
    }

    /* renamed from: h */
    private final boolean m33100h(EnumC7338w1 w1Var, AbstractC11319f1 f1Var) {
        if (f1Var.mo6392m() == EnumC7338w1.INVARIANT || w1Var == f1Var.mo6392m()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private final boolean m33099i(C4005a aVar) {
        if (aVar.m33117g() == EnumC4007c.FLEXIBLE_LOWER_BOUND || aVar.m33116h() || aVar.mo22864b() == EnumC7319r1.SUPERTYPE) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private final AbstractC11313e m33098j(AbstractC6898j jVar, C4005a aVar, C11137c cVar) {
        C11137c cVar2;
        if (aVar.m33116h()) {
            cVar2 = C4010e.f6597a;
            if (C9971q.m14638b(cVar, cVar2)) {
                return this.f6588a.m41174a().m41194p().m13338c();
            }
        }
        C11107d dVar = C11107d.f24646a;
        AbstractC11313e f = C11107d.m10884f(dVar, cVar, this.f6588a.m41171d().mo6136n(), null, 4, null);
        if (f == null) {
            return null;
        }
        if (!dVar.m10886d(f) || (aVar.m33117g() != EnumC4007c.FLEXIBLE_LOWER_BOUND && aVar.mo22864b() != EnumC7319r1.SUPERTYPE && !m33106b(jVar, f))) {
            return f;
        }
        return dVar.m10888b(f);
    }

    /* renamed from: l */
    public static /* synthetic */ AbstractC7267g0 m33096l(C4008d dVar, AbstractC6894f fVar, C4005a aVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return dVar.m33097k(fVar, aVar, z);
    }

    /* renamed from: m */
    private final AbstractC7267g0 m33095m(AbstractC6898j jVar, C4005a aVar) {
        boolean z;
        if (aVar.m33116h() || aVar.mo22864b() == EnumC7319r1.SUPERTYPE) {
            z = false;
        } else {
            z = true;
        }
        boolean h = jVar.mo3994h();
        if (h || z) {
            AbstractC7304o0 e = m33103e(jVar, aVar.m33112l(EnumC4007c.FLEXIBLE_LOWER_BOUND), null);
            if (e == null) {
                return m33094n(jVar);
            }
            AbstractC7304o0 e2 = m33103e(jVar, aVar.m33112l(EnumC4007c.FLEXIBLE_UPPER_BOUND), e);
            if (e2 == null) {
                return m33094n(jVar);
            }
            if (h) {
                return new C4016h(e, e2);
            }
            return C7270h0.m23056d(e, e2);
        }
        AbstractC7304o0 e3 = m33103e(jVar, aVar, null);
        if (e3 != null) {
            return e3;
        }
        return m33094n(jVar);
    }

    /* renamed from: n */
    private static final C8036h m33094n(AbstractC6898j jVar) {
        return C8039k.m20774d(EnumC8038j.UNRESOLVED_JAVA_CLASS, jVar.mo3997E());
    }

    /* renamed from: p */
    private final AbstractC7290k1 m33092p(AbstractC6912x xVar, C4005a aVar, AbstractC11319f1 f1Var) {
        EnumC7338w1 w1Var;
        AbstractC7290k1 k1Var;
        List<? extends AbstractC11666c> n0;
        if (!(xVar instanceof AbstractC6890c0)) {
            return new C7296m1(EnumC7338w1.INVARIANT, m33093o(xVar, aVar));
        }
        AbstractC6890c0 c0Var = (AbstractC6890c0) xVar;
        AbstractC6912x w = c0Var.mo4054w();
        if (c0Var.mo4057L()) {
            w1Var = EnumC7338w1.OUT_VARIANCE;
        } else {
            w1Var = EnumC7338w1.IN_VARIANCE;
        }
        if (w == null || m33100h(w1Var, f1Var)) {
            k1Var = C7322s1.m22927t(f1Var, aVar);
        } else {
            AbstractC11666c a = C14138j0.m1539a(this.f6588a, c0Var);
            AbstractC7267g0 o = m33093o(w, C4006b.m33109b(EnumC7319r1.COMMON, false, false, null, 7, null));
            if (a != null) {
                AbstractC11672g.C11673a aVar2 = AbstractC11672g.f26044g;
                n0 = C9914r.m14751n0(o.getAnnotations(), a);
                o = C9883a.m15083v(o, aVar2.m9049a(n0));
            }
            k1Var = C9883a.m15099f(o, w1Var, f1Var);
        }
        C9971q.m14634f(k1Var, "{\n                val bo…          }\n            }");
        return k1Var;
    }

    /* renamed from: k */
    public final AbstractC7267g0 m33097k(AbstractC6894f arrayType, C4005a attr, boolean z) {
        AbstractC6910v vVar;
        EnumC7338w1 w1Var;
        List<? extends AbstractC11666c> m0;
        C9971q.m14633g(arrayType, "arrayType");
        C9971q.m14633g(attr, "attr");
        AbstractC6912x componentType = arrayType.getComponentType();
        EnumC10426i iVar = null;
        if (componentType instanceof AbstractC6910v) {
            vVar = (AbstractC6910v) componentType;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            iVar = vVar.getType();
        }
        C1394d dVar = new C1394d(this.f6588a, arrayType, true);
        if (iVar != null) {
            AbstractC7304o0 O = this.f6588a.m41171d().mo6136n().m13414O(iVar);
            C9971q.m14634f(O, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            AbstractC11672g.C11673a aVar = AbstractC11672g.f26044g;
            m0 = C9914r.m14752m0(dVar, O.getAnnotations());
            C9883a.m15083v(O, aVar.m9049a(m0));
            if (attr.m33116h()) {
                return O;
            }
            return C7270h0.m23056d(O, O.mo5166U0(true));
        }
        AbstractC7267g0 o = m33093o(componentType, C4006b.m33109b(EnumC7319r1.COMMON, attr.m33116h(), false, null, 6, null));
        if (attr.m33116h()) {
            if (z) {
                w1Var = EnumC7338w1.OUT_VARIANCE;
            } else {
                w1Var = EnumC7338w1.INVARIANT;
            }
            AbstractC7304o0 m = this.f6588a.m41171d().mo6136n().m13379m(w1Var, o, dVar);
            C9971q.m14634f(m, "c.module.builtIns.getArr…mponentType, annotations)");
            return m;
        }
        AbstractC7304o0 m2 = this.f6588a.m41171d().mo6136n().m13379m(EnumC7338w1.INVARIANT, o, dVar);
        C9971q.m14634f(m2, "c.module.builtIns.getArr…mponentType, annotations)");
        return C7270h0.m23056d(m2, this.f6588a.m41171d().mo6136n().m13379m(EnumC7338w1.OUT_VARIANCE, o, dVar).mo5166U0(true));
    }

    /* renamed from: o */
    public final AbstractC7267g0 m33093o(AbstractC6912x xVar, C4005a attr) {
        AbstractC7267g0 o;
        AbstractC7304o0 o0Var;
        C9971q.m14633g(attr, "attr");
        if (xVar instanceof AbstractC6910v) {
            EnumC10426i type = ((AbstractC6910v) xVar).getType();
            if (type != null) {
                o0Var = this.f6588a.m41171d().mo6136n().m13411R(type);
            } else {
                o0Var = this.f6588a.m41171d().mo6136n().m13403Z();
            }
            C9971q.m14634f(o0Var, "{\n                val pr…ns.unitType\n            }");
            return o0Var;
        } else if (xVar instanceof AbstractC6898j) {
            return m33095m((AbstractC6898j) xVar, attr);
        } else {
            if (xVar instanceof AbstractC6894f) {
                return m33096l(this, (AbstractC6894f) xVar, attr, false, 4, null);
            }
            if (xVar instanceof AbstractC6890c0) {
                AbstractC6912x w = ((AbstractC6890c0) xVar).mo4054w();
                if (w != null && (o = m33093o(w, attr)) != null) {
                    return o;
                }
                AbstractC7304o0 y = this.f6588a.m41171d().mo6136n().m13356y();
                C9971q.m14634f(y, "c.module.builtIns.defaultBound");
                return y;
            } else if (xVar == null) {
                AbstractC7304o0 y2 = this.f6588a.m41171d().mo6136n().m13356y();
                C9971q.m14634f(y2, "c.module.builtIns.defaultBound");
                return y2;
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + xVar);
            }
        }
    }
}
