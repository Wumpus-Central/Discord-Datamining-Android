package bi;

import fi.AbstractC7224a1;
import fi.AbstractC7228b1;
import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.C7232c1;
import fi.C7270h0;
import fi.C7278i0;
import fi.C7296m1;
import fi.C7306p;
import fi.C7321s0;
import fi.C7325t0;
import fi.C7329u0;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh.C9870b;
import kh.C9878f;
import ki.C9883a;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9965m;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import p070di.C6464a;
import p070di.C6508m;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p159ih.C8593q;
import p159ih.C8603s;
import p217lg.AbstractC10420h;
import p217lg.C10419g;
import p249nh.C11136b;
import p267of.C11289v;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p268og.C11393x;
import p306qi.C12193m;
import p306qi.C12200o;
import pg.AbstractC11666c;
import pg.AbstractC11672g;

/* renamed from: bi.d0 */
/* loaded from: classes8.dex */
public final class C3566d0 {

    /* renamed from: a */
    private final C3588m f5787a;

    /* renamed from: b */
    private final C3566d0 f5788b;

    /* renamed from: c */
    private final String f5789c;

    /* renamed from: d */
    private final String f5790d;

    /* renamed from: e */
    private final Function1<Integer, AbstractC11326h> f5791e;

    /* renamed from: f */
    private final Function1<Integer, AbstractC11326h> f5792f;

    /* renamed from: g */
    private final Map<Integer, AbstractC11319f1> f5793g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bi.d0$a */
    /* loaded from: classes8.dex */
    public static final class C3567a extends AbstractC9973s implements Function1<Integer, AbstractC11326h> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3567a() {
            super(1);
            C3566d0.this = r1;
        }

        /* renamed from: a */
        public final AbstractC11326h m34077a(int i) {
            return C3566d0.this.m34094d(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AbstractC11326h invoke(Integer num) {
            return m34077a(num.intValue());
        }
    }

    /* renamed from: bi.d0$b */
    /* loaded from: classes8.dex */
    public static final class C3568b extends AbstractC9973s implements Function0<List<? extends AbstractC11666c>> {

        /* renamed from: l */
        final /* synthetic */ C8593q f5796l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3568b(C8593q qVar) {
            super(0);
            C3566d0.this = r1;
            this.f5796l = qVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC11666c> invoke() {
            return C3566d0.this.f5787a.m34019c().m34046d().mo21934b(this.f5796l, C3566d0.this.f5787a.m34015g());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bi.d0$c */
    /* loaded from: classes8.dex */
    public static final class C3569c extends AbstractC9973s implements Function1<Integer, AbstractC11326h> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3569c() {
            super(1);
            C3566d0.this = r1;
        }

        /* renamed from: a */
        public final AbstractC11326h m34076a(int i) {
            return C3566d0.this.m34092f(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AbstractC11326h invoke(Integer num) {
            return m34076a(num.intValue());
        }
    }

    /* renamed from: bi.d0$d */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C3570d extends C9965m implements Function1<C11136b, C11136b> {

        /* renamed from: k */
        public static final C3570d f5798k = new C3570d();

        C3570d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e, kotlin.reflect.KCallable
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final KDeclarationContainer getOwner() {
            return C9951f0.m14684b(C11136b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9947e
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        /* renamed from: i */
        public final C11136b invoke(C11136b p0) {
            C9971q.m14633g(p0, "p0");
            return p0.m10811g();
        }
    }

    /* renamed from: bi.d0$e */
    /* loaded from: classes8.dex */
    public static final class C3571e extends AbstractC9973s implements Function1<C8593q, C8593q> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3571e() {
            super(1);
            C3566d0.this = r1;
        }

        /* renamed from: a */
        public final C8593q invoke(C8593q it) {
            C9971q.m14633g(it, "it");
            return C9878f.m15121j(it, C3566d0.this.f5787a.m34012j());
        }
    }

    /* renamed from: bi.d0$f */
    /* loaded from: classes8.dex */
    public static final class C3572f extends AbstractC9973s implements Function1<C8593q, Integer> {

        /* renamed from: k */
        public static final C3572f f5800k = new C3572f();

        C3572f() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C8593q it) {
            C9971q.m14633g(it, "it");
            return Integer.valueOf(it.m18811V());
        }
    }

    public C3566d0(C3588m c, C3566d0 d0Var, List<C8603s> typeParameterProtos, String debugName, String containerPresentableName) {
        Map<Integer, AbstractC11319f1> map;
        C9971q.m14633g(c, "c");
        C9971q.m14633g(typeParameterProtos, "typeParameterProtos");
        C9971q.m14633g(debugName, "debugName");
        C9971q.m14633g(containerPresentableName, "containerPresentableName");
        this.f5787a = c;
        this.f5788b = d0Var;
        this.f5789c = debugName;
        this.f5790d = containerPresentableName;
        this.f5791e = c.m34014h().mo23894g(new C3567a());
        this.f5792f = c.m34014h().mo23894g(new C3569c());
        if (typeParameterProtos.isEmpty()) {
            map = C11289v.m10251h();
        } else {
            map = new LinkedHashMap<>();
            int i = 0;
            for (C8603s sVar : typeParameterProtos) {
                map.put(Integer.valueOf(sVar.m18655N()), new C6508m(this.f5787a, sVar, i));
                i++;
            }
        }
        this.f5793g = map;
    }

    /* renamed from: d */
    public final AbstractC11326h m34094d(int i) {
        C11136b a = C3613x.m33980a(this.f5787a.m34015g(), i);
        if (a.m10807k()) {
            return this.f5787a.m34019c().m34048b(a);
        }
        return C11393x.m10148b(this.f5787a.m34019c().m34034p(), a);
    }

    /* renamed from: e */
    private final AbstractC7304o0 m34093e(int i) {
        if (C3613x.m33980a(this.f5787a.m34015g(), i).m10807k()) {
            return this.f5787a.m34019c().m34036n().mo34000a();
        }
        return null;
    }

    /* renamed from: f */
    public final AbstractC11326h m34092f(int i) {
        C11136b a = C3613x.m33980a(this.f5787a.m34015g(), i);
        if (a.m10807k()) {
            return null;
        }
        return C11393x.m10146d(this.f5787a.m34019c().m34034p(), a);
    }

    /* renamed from: g */
    private final AbstractC7304o0 m34091g(AbstractC7267g0 g0Var, AbstractC7267g0 g0Var2) {
        List<AbstractC7290k1> P;
        int t;
        AbstractC10420h i = C9883a.m15096i(g0Var);
        AbstractC11672g annotations = g0Var.getAnnotations();
        AbstractC7267g0 j = C10419g.m13442j(g0Var);
        List<AbstractC7267g0> e = C10419g.m13447e(g0Var);
        P = C9914r.m14775P(C10419g.m13440l(g0Var), 1);
        t = C9907k.m14809t(P, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC7290k1 k1Var : P) {
            arrayList.add(k1Var.getType());
        }
        return C10419g.m13450b(i, annotations, j, e, arrayList, null, g0Var2, true).mo5166U0(g0Var.mo5171O0());
    }

    /* renamed from: h */
    private final AbstractC7304o0 m34090h(C7232c1 c1Var, AbstractC7268g1 g1Var, List<? extends AbstractC7290k1> list, boolean z) {
        AbstractC7304o0 o0Var;
        int size;
        int size2 = g1Var.getParameters().size() - list.size();
        if (size2 != 0) {
            o0Var = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                AbstractC7268g1 k = g1Var.mo4567n().m13405X(size).mo6111k();
                C9971q.m14634f(k, "functionTypeConstructor.…on(arity).typeConstructor");
                o0Var = C7270h0.m23050j(c1Var, k, list, z, null, 16, null);
            }
        } else {
            o0Var = m34089i(c1Var, g1Var, list, z);
        }
        if (o0Var == null) {
            return C8039k.f17408a.m20772f(EnumC8038j.INCONSISTENT_SUSPEND_FUNCTION, list, g1Var, new String[0]);
        }
        return o0Var;
    }

    /* renamed from: i */
    private final AbstractC7304o0 m34089i(C7232c1 c1Var, AbstractC7268g1 g1Var, List<? extends AbstractC7290k1> list, boolean z) {
        AbstractC7304o0 j = C7270h0.m23050j(c1Var, g1Var, list, z, null, 16, null);
        if (!C10419g.m13436p(j)) {
            return null;
        }
        return m34082p(j);
    }

    /* renamed from: k */
    private final AbstractC11319f1 m34087k(int i) {
        AbstractC11319f1 f1Var = this.f5793g.get(Integer.valueOf(i));
        if (f1Var != null) {
            return f1Var;
        }
        C3566d0 d0Var = this.f5788b;
        if (d0Var != null) {
            return d0Var.m34087k(i);
        }
        return null;
    }

    /* renamed from: m */
    private static final List<C8593q.C8595b> m34085m(C8593q qVar, C3566d0 d0Var) {
        List<C8593q.C8595b> o0;
        List<C8593q.C8595b> argumentList = qVar.m18810W();
        C9971q.m14634f(argumentList, "argumentList");
        C8593q j = C9878f.m15121j(qVar, d0Var.f5787a.m34012j());
        List<C8593q.C8595b> m = j != null ? m34085m(j, d0Var) : null;
        if (m == null) {
            m = C9906j.m14820i();
        }
        o0 = C9914r.m14750o0(argumentList, m);
        return o0;
    }

    /* renamed from: n */
    public static /* synthetic */ AbstractC7304o0 m34084n(C3566d0 d0Var, C8593q qVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return d0Var.m34086l(qVar, z);
    }

    /* renamed from: o */
    private final C7232c1 m34083o(List<? extends AbstractC7228b1> list, AbstractC11672g gVar, AbstractC7268g1 g1Var, AbstractC11346m mVar) {
        int t;
        List<? extends AbstractC7224a1<?>> v;
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC7228b1 b1Var : list) {
            arrayList.add(b1Var.mo23000a(gVar, g1Var, mVar));
        }
        v = C9907k.m14807v(arrayList);
        return C7232c1.f15671l.m23150g(v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (kotlin.jvm.internal.C9971q.m14638b(r2, r3) == false) goto L_0x007a;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final fi.AbstractC7304o0 m34082p(fi.AbstractC7267g0 r6) {
        /*
            r5 = this;
            java.util.List r0 = p217lg.C10419g.m13440l(r6)
            java.lang.Object r0 = kotlin.collections.C9904h.m14861i0(r0)
            fi.k1 r0 = (fi.AbstractC7290k1) r0
            r1 = 0
            if (r0 == 0) goto L_0x007d
            fi.g0 r0 = r0.getType()
            if (r0 != 0) goto L_0x0014
            goto L_0x007d
        L_0x0014:
            fi.g1 r2 = r0.mo5172N0()
            og.h r2 = r2.mo4565p()
            if (r2 == 0) goto L_0x0023
            nh.c r2 = p388vh.C13508c.m3529l(r2)
            goto L_0x0024
        L_0x0023:
            r2 = r1
        L_0x0024:
            java.util.List r3 = r0.mo5174L0()
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L_0x007a
            nh.c r3 = p217lg.C10434k.f22889p
            boolean r3 = kotlin.jvm.internal.C9971q.m14638b(r2, r3)
            if (r3 != 0) goto L_0x0042
            nh.c r3 = bi.C3575e0.m34065a()
            boolean r2 = kotlin.jvm.internal.C9971q.m14638b(r2, r3)
            if (r2 != 0) goto L_0x0042
            goto L_0x007a
        L_0x0042:
            java.util.List r0 = r0.mo5174L0()
            java.lang.Object r0 = kotlin.collections.C9904h.m14844r0(r0)
            fi.k1 r0 = (fi.AbstractC7290k1) r0
            fi.g0 r0 = r0.getType()
            java.lang.String r2 = "continuationArgumentType.arguments.single().type"
            kotlin.jvm.internal.C9971q.m14634f(r0, r2)
            bi.m r2 = r5.f5787a
            og.m r2 = r2.m34017e()
            boolean r3 = r2 instanceof p268og.AbstractC11297a
            if (r3 != 0) goto L_0x0060
            r2 = r1
        L_0x0060:
            og.a r2 = (p268og.AbstractC11297a) r2
            if (r2 == 0) goto L_0x0068
            nh.c r1 = p388vh.C13508c.m3533h(r2)
        L_0x0068:
            nh.c r2 = bi.C3563c0.f5782a
            boolean r1 = kotlin.jvm.internal.C9971q.m14638b(r1, r2)
            if (r1 == 0) goto L_0x0075
            fi.o0 r6 = r5.m34091g(r6, r0)
            return r6
        L_0x0075:
            fi.o0 r6 = r5.m34091g(r6, r0)
            return r6
        L_0x007a:
            fi.o0 r6 = (fi.AbstractC7304o0) r6
            return r6
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.C3566d0.m34082p(fi.g0):fi.o0");
    }

    /* renamed from: r */
    private final AbstractC7290k1 m34080r(AbstractC11319f1 f1Var, C8593q.C8595b bVar) {
        if (bVar.m18764y() != C8593q.C8595b.EnumC8597c.STAR) {
            C3557a0 a0Var = C3557a0.f5765a;
            C8593q.C8595b.EnumC8597c y = bVar.m18764y();
            C9971q.m14634f(y, "typeArgumentProto.projection");
            EnumC7338w1 c = a0Var.m34103c(y);
            C8593q p = C9878f.m15115p(bVar, this.f5787a.m34012j());
            if (p == null) {
                return new C7296m1(C8039k.m20774d(EnumC8038j.NO_RECORDED_TYPE, bVar.toString()));
            }
            return new C7296m1(c, m34081q(p));
        } else if (f1Var == null) {
            return new C7325t0(this.f5787a.m34019c().m34034p().mo6136n());
        } else {
            return new C7329u0(f1Var);
        }
    }

    /* renamed from: s */
    private final AbstractC7268g1 m34079s(C8593q qVar) {
        AbstractC11326h hVar;
        Object obj;
        if (qVar.m18794m0()) {
            hVar = this.f5791e.invoke(Integer.valueOf(qVar.m18809X()));
            if (hVar == null) {
                hVar = m34078t(this, qVar, qVar.m18809X());
            }
        } else if (qVar.m18785v0()) {
            hVar = m34087k(qVar.m18798i0());
            if (hVar == null) {
                return C8039k.f17408a.m20773e(EnumC8038j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(qVar.m18798i0()), this.f5790d);
            }
        } else if (qVar.m18784w0()) {
            String string = this.f5787a.m34015g().getString(qVar.m18797j0());
            Iterator<T> it = m34088j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C9971q.m14638b(((AbstractC11319f1) obj).getName().m10771b(), string)) {
                    break;
                }
            }
            hVar = (AbstractC11319f1) obj;
            if (hVar == null) {
                return C8039k.f17408a.m20773e(EnumC8038j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f5787a.m34017e().toString());
            }
        } else if (!qVar.m18786u0()) {
            return C8039k.f17408a.m20773e(EnumC8038j.UNKNOWN_TYPE, new String[0]);
        } else {
            hVar = this.f5792f.invoke(Integer.valueOf(qVar.m18799h0()));
            if (hVar == null) {
                hVar = m34078t(this, qVar, qVar.m18799h0());
            }
        }
        AbstractC7268g1 k = hVar.mo6111k();
        C9971q.m14634f(k, "classifier.typeConstructor");
        return k;
    }

    /* renamed from: t */
    private static final AbstractC11313e m34078t(C3566d0 d0Var, C8593q qVar, int i) {
        Sequence h;
        Sequence y;
        List<Integer> F;
        Sequence h2;
        int n;
        C11136b a = C3613x.m33980a(d0Var.f5787a.m34015g(), i);
        h = C12193m.m7445h(qVar, new C3571e());
        y = C12200o.m7420y(h, C3572f.f5800k);
        F = C12200o.m7435F(y);
        h2 = C12193m.m7445h(a, C3570d.f5798k);
        n = C12200o.m7431n(h2);
        while (F.size() < n) {
            F.add(0);
        }
        return d0Var.f5787a.m34019c().m34033q().m10197d(a, F);
    }

    /* renamed from: j */
    public final List<AbstractC11319f1> m34088j() {
        List<AbstractC11319f1> D0;
        D0 = C9914r.m14790D0(this.f5793g.values());
        return D0;
    }

    /* renamed from: l */
    public final AbstractC7304o0 m34086l(C8593q proto, boolean z) {
        AbstractC7304o0 o0Var;
        int t;
        List<? extends AbstractC7290k1> D0;
        AbstractC7304o0 o0Var2;
        AbstractC7304o0 j;
        List<? extends AbstractC11666c> m0;
        Object X;
        C9971q.m14633g(proto, "proto");
        if (proto.m18794m0()) {
            o0Var = m34093e(proto.m18809X());
        } else if (proto.m18786u0()) {
            o0Var = m34093e(proto.m18799h0());
        } else {
            o0Var = null;
        }
        if (o0Var != null) {
            return o0Var;
        }
        AbstractC7268g1 s = m34079s(proto);
        boolean z2 = true;
        if (C8039k.m20765m(s.mo4565p())) {
            return C8039k.f17408a.m20775c(EnumC8038j.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, s, s.toString());
        }
        C6464a aVar = new C6464a(this.f5787a.m34014h(), new C3568b(proto));
        C7232c1 o = m34083o(this.f5787a.m34019c().m34028v(), aVar, s, this.f5787a.m34017e());
        List<C8593q.C8595b> m = m34085m(proto, this);
        t = C9907k.m14809t(m, 10);
        ArrayList arrayList = new ArrayList(t);
        int i = 0;
        for (Object obj : m) {
            int i2 = i + 1;
            if (i < 0) {
                C9906j.m14810s();
            }
            List<AbstractC11319f1> parameters = s.getParameters();
            C9971q.m14634f(parameters, "constructor.parameters");
            X = C9914r.m14767X(parameters, i);
            arrayList.add(m34080r((AbstractC11319f1) X, (C8593q.C8595b) obj));
            i = i2;
        }
        D0 = C9914r.m14790D0(arrayList);
        AbstractC11326h p = s.mo4565p();
        if (!z || !(p instanceof AbstractC11316e1)) {
            Boolean g = C9870b.f22000a.mo15135d(proto.m18806a0());
            C9971q.m14634f(g, "SUSPEND_TYPE.get(proto.flags)");
            if (g.booleanValue()) {
                o0Var2 = m34090h(o, s, D0, proto.m18802e0());
            } else {
                o0Var2 = C7270h0.m23050j(o, s, D0, proto.m18802e0(), null, 16, null);
                Boolean g2 = C9870b.f22001b.mo15135d(proto.m18806a0());
                C9971q.m14634f(g2, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if (g2.booleanValue()) {
                    C7306p b = C7306p.f15782n.m22988b(o0Var2, true);
                    if (b != null) {
                        o0Var2 = b;
                    } else {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + o0Var2 + '\'').toString());
                    }
                }
            }
        } else {
            C7270h0 h0Var = C7270h0.f15735a;
            AbstractC7304o0 b2 = C7270h0.m23058b((AbstractC11316e1) p, D0);
            List<AbstractC7228b1> v = this.f5787a.m34019c().m34028v();
            AbstractC11672g.C11673a aVar2 = AbstractC11672g.f26044g;
            m0 = C9914r.m14752m0(aVar, b2.getAnnotations());
            C7232c1 o2 = m34083o(v, aVar2.m9049a(m0), s, this.f5787a.m34017e());
            if (!C7278i0.m23034b(b2) && !proto.m18802e0()) {
                z2 = false;
            }
            o0Var2 = b2.mo5166U0(z2).mo5165V0(o2);
        }
        C8593q a = C9878f.m15130a(proto, this.f5787a.m34012j());
        if (!(a == null || (j = C7321s0.m22948j(o0Var2, m34086l(a, false))) == null)) {
            o0Var2 = j;
        }
        if (proto.m18794m0()) {
            return this.f5787a.m34019c().m34030t().mo7764a(C3613x.m33980a(this.f5787a.m34015g(), proto.m18809X()), o0Var2);
        }
        return o0Var2;
    }

    /* renamed from: q */
    public final AbstractC7267g0 m34081q(C8593q proto) {
        C9971q.m14633g(proto, "proto");
        if (!proto.m18792o0()) {
            return m34086l(proto, true);
        }
        String string = this.f5787a.m34015g().getString(proto.m18805b0());
        AbstractC7304o0 n = m34084n(this, proto, false, 2, null);
        C8593q f = C9878f.m15125f(proto, this.f5787a.m34012j());
        C9971q.m14636d(f);
        return this.f5787a.m34019c().m34038l().mo21859a(proto, string, n, m34084n(this, f, false, 2, null));
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5789c);
        if (this.f5788b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f5788b.f5789c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
