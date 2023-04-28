package bh;

import ch.C4005a;
import ch.C4006b;
import fi.AbstractC7267g0;
import fi.C7322s1;
import fi.EnumC7319r1;
import gh.C7648w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import nf.C11098x;
import p013ah.C1389a;
import p013ah.C1396e;
import p013ah.C1399g;
import p069dh.AbstractC6462a;
import p086eh.AbstractC6888b0;
import p086eh.AbstractC6894f;
import p086eh.AbstractC6902n;
import p086eh.AbstractC6906r;
import p086eh.AbstractC6912x;
import p086eh.AbstractC6913y;
import p087ei.AbstractC6936g;
import p087ei.AbstractC6937h;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6939j;
import p087ei.AbstractC6944n;
import p087ei.C6943m;
import p217lg.AbstractC10420h;
import p249nh.C11142f;
import p267of.C11280m;
import p267of.C11288u;
import p267of.C11289v;
import p268og.AbstractC11297a;
import p268og.AbstractC11319f1;
import p268og.AbstractC11335j1;
import p268og.AbstractC11346m;
import p268og.AbstractC11387u;
import p268og.AbstractC11388u0;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p268og.AbstractC11404z0;
import p268og.EnumC11314e0;
import p286pi.C11754a;
import p324rg.C12591c0;
import p324rg.C12619l0;
import p325rh.C12659d;
import p325rh.C12661e;
import p325rh.C12682m;
import p406wg.AbstractC13878b;
import p406wg.EnumC13881d;
import p427xg.C14138j0;
import p448yh.AbstractC14400c;
import p448yh.AbstractC14411h;
import p448yh.AbstractC14414i;
import p448yh.C14403d;
import p467zg.C14650e;
import p467zg.C14654f;
import pg.AbstractC11672g;
import th.AbstractC13104g;

/* renamed from: bh.j */
/* loaded from: classes8.dex */
public abstract class AbstractC3533j extends AbstractC14414i {

    /* renamed from: m */
    static final /* synthetic */ KProperty<Object>[] f5711m = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(AbstractC3533j.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(AbstractC3533j.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), C9951f0.m14679g(new C9944c0(C9951f0.m14684b(AbstractC3533j.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b */
    private final C1399g f5712b;

    /* renamed from: c */
    private final AbstractC3533j f5713c;

    /* renamed from: d */
    private final AbstractC6938i<Collection<AbstractC11346m>> f5714d;

    /* renamed from: e */
    private final AbstractC6938i<AbstractC3493b> f5715e;

    /* renamed from: f */
    private final AbstractC6936g<C11142f, Collection<AbstractC11404z0>> f5716f;

    /* renamed from: g */
    private final AbstractC6937h<C11142f, AbstractC11388u0> f5717g;

    /* renamed from: h */
    private final AbstractC6936g<C11142f, Collection<AbstractC11404z0>> f5718h;

    /* renamed from: i */
    private final AbstractC6938i f5719i;

    /* renamed from: j */
    private final AbstractC6938i f5720j;

    /* renamed from: k */
    private final AbstractC6938i f5721k;

    /* renamed from: l */
    private final AbstractC6936g<C11142f, List<AbstractC11388u0>> f5722l;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bh.j$a */
    /* loaded from: classes8.dex */
    public static final class C3534a {

        /* renamed from: a */
        private final AbstractC7267g0 f5723a;

        /* renamed from: b */
        private final AbstractC7267g0 f5724b;

        /* renamed from: c */
        private final List<AbstractC11335j1> f5725c;

        /* renamed from: d */
        private final List<AbstractC11319f1> f5726d;

        /* renamed from: e */
        private final boolean f5727e;

        /* renamed from: f */
        private final List<String> f5728f;

        /* JADX WARN: Multi-variable type inference failed */
        public C3534a(AbstractC7267g0 returnType, AbstractC7267g0 g0Var, List<? extends AbstractC11335j1> valueParameters, List<? extends AbstractC11319f1> typeParameters, boolean z, List<String> errors) {
            C9971q.m14633g(returnType, "returnType");
            C9971q.m14633g(valueParameters, "valueParameters");
            C9971q.m14633g(typeParameters, "typeParameters");
            C9971q.m14633g(errors, "errors");
            this.f5723a = returnType;
            this.f5724b = g0Var;
            this.f5725c = valueParameters;
            this.f5726d = typeParameters;
            this.f5727e = z;
            this.f5728f = errors;
        }

        /* renamed from: a */
        public final List<String> m34155a() {
            return this.f5728f;
        }

        /* renamed from: b */
        public final boolean m34154b() {
            return this.f5727e;
        }

        /* renamed from: c */
        public final AbstractC7267g0 m34153c() {
            return this.f5724b;
        }

        /* renamed from: d */
        public final AbstractC7267g0 m34152d() {
            return this.f5723a;
        }

        /* renamed from: e */
        public final List<AbstractC11319f1> m34151e() {
            return this.f5726d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3534a)) {
                return false;
            }
            C3534a aVar = (C3534a) obj;
            return C9971q.m14638b(this.f5723a, aVar.f5723a) && C9971q.m14638b(this.f5724b, aVar.f5724b) && C9971q.m14638b(this.f5725c, aVar.f5725c) && C9971q.m14638b(this.f5726d, aVar.f5726d) && this.f5727e == aVar.f5727e && C9971q.m14638b(this.f5728f, aVar.f5728f);
        }

        /* renamed from: f */
        public final List<AbstractC11335j1> m34150f() {
            return this.f5725c;
        }

        public int hashCode() {
            int hashCode = this.f5723a.hashCode() * 31;
            AbstractC7267g0 g0Var = this.f5724b;
            int hashCode2 = (((((hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31) + this.f5725c.hashCode()) * 31) + this.f5726d.hashCode()) * 31;
            boolean z = this.f5727e;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return ((hashCode2 + i) * 31) + this.f5728f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f5723a + ", receiverType=" + this.f5724b + ", valueParameters=" + this.f5725c + ", typeParameters=" + this.f5726d + ", hasStableParameterNames=" + this.f5727e + ", errors=" + this.f5728f + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bh.j$b */
    /* loaded from: classes8.dex */
    public static final class C3535b {

        /* renamed from: a */
        private final List<AbstractC11335j1> f5729a;

        /* renamed from: b */
        private final boolean f5730b;

        /* JADX WARN: Multi-variable type inference failed */
        public C3535b(List<? extends AbstractC11335j1> descriptors, boolean z) {
            C9971q.m14633g(descriptors, "descriptors");
            this.f5729a = descriptors;
            this.f5730b = z;
        }

        /* renamed from: a */
        public final List<AbstractC11335j1> m34149a() {
            return this.f5729a;
        }

        /* renamed from: b */
        public final boolean m34148b() {
            return this.f5730b;
        }
    }

    /* renamed from: bh.j$c */
    /* loaded from: classes8.dex */
    static final class C3536c extends AbstractC9973s implements Function0<Collection<? extends AbstractC11346m>> {
        C3536c() {
            super(0);
        }

        /* renamed from: a */
        public final Collection<AbstractC11346m> invoke() {
            return AbstractC3533j.this.m34162m(C14403d.f32597o, AbstractC14411h.f32622a.m648a());
        }
    }

    /* renamed from: bh.j$d */
    /* loaded from: classes8.dex */
    static final class C3537d extends AbstractC9973s implements Function0<Set<? extends C11142f>> {
        C3537d() {
            super(0);
        }

        /* renamed from: a */
        public final Set<C11142f> invoke() {
            return AbstractC3533j.this.mo34127l(C14403d.f32602t, null);
        }
    }

    /* renamed from: bh.j$e */
    /* loaded from: classes8.dex */
    static final class C3538e extends AbstractC9973s implements Function1<C11142f, AbstractC11388u0> {
        C3538e() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11388u0 invoke(C11142f name) {
            C9971q.m14633g(name, "name");
            if (AbstractC3533j.this.m34175B() != null) {
                return (AbstractC11388u0) AbstractC3533j.this.m34175B().f5717g.invoke(name);
            }
            AbstractC6902n f = AbstractC3533j.this.m34156y().invoke().mo34296f(name);
            if (f == null || f.mo3988I()) {
                return null;
            }
            return AbstractC3533j.this.m34169J(f);
        }
    }

    /* renamed from: bh.j$f */
    /* loaded from: classes8.dex */
    static final class C3539f extends AbstractC9973s implements Function1<C11142f, Collection<? extends AbstractC11404z0>> {
        C3539f() {
            super(1);
        }

        /* renamed from: a */
        public final Collection<AbstractC11404z0> invoke(C11142f name) {
            C9971q.m14633g(name, "name");
            if (AbstractC3533j.this.m34175B() != null) {
                return (Collection) AbstractC3533j.this.m34175B().f5716f.invoke(name);
            }
            ArrayList arrayList = new ArrayList();
            for (AbstractC6906r rVar : AbstractC3533j.this.m34156y().invoke().mo34297e(name)) {
                C14650e I = AbstractC3533j.this.m34170I(rVar);
                if (AbstractC3533j.this.mo34171G(I)) {
                    AbstractC3533j.this.m34158w().m41174a().m41202h().mo707a(rVar, I);
                    arrayList.add(I);
                }
            }
            AbstractC3533j.this.mo34125o(arrayList, name);
            return arrayList;
        }
    }

    /* renamed from: bh.j$g */
    /* loaded from: classes8.dex */
    static final class C3540g extends AbstractC9973s implements Function0<AbstractC3493b> {
        C3540g() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC3493b invoke() {
            return AbstractC3533j.this.mo34124p();
        }
    }

    /* renamed from: bh.j$h */
    /* loaded from: classes8.dex */
    static final class C3541h extends AbstractC9973s implements Function0<Set<? extends C11142f>> {
        C3541h() {
            super(0);
        }

        /* renamed from: a */
        public final Set<C11142f> invoke() {
            return AbstractC3533j.this.mo34126n(C14403d.f32604v, null);
        }
    }

    /* renamed from: bh.j$i */
    /* loaded from: classes8.dex */
    static final class C3542i extends AbstractC9973s implements Function1<C11142f, Collection<? extends AbstractC11404z0>> {
        C3542i() {
            super(1);
        }

        /* renamed from: a */
        public final Collection<AbstractC11404z0> invoke(C11142f name) {
            List D0;
            C9971q.m14633g(name, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) AbstractC3533j.this.f5716f.invoke(name));
            AbstractC3533j.this.m34167L(linkedHashSet);
            AbstractC3533j.this.mo34123r(linkedHashSet, name);
            D0 = C9914r.m14790D0(AbstractC3533j.this.m34158w().m41174a().m41192r().m23231g(AbstractC3533j.this.m34158w(), linkedHashSet));
            return D0;
        }
    }

    /* renamed from: bh.j$j */
    /* loaded from: classes8.dex */
    static final class C0090j extends AbstractC9973s implements Function1<C11142f, List<? extends AbstractC11388u0>> {
        C0090j() {
            super(1);
        }

        /* renamed from: a */
        public final List<AbstractC11388u0> invoke(C11142f name) {
            List<AbstractC11388u0> D0;
            List<AbstractC11388u0> D02;
            C9971q.m14633g(name, "name");
            ArrayList arrayList = new ArrayList();
            C11754a.m8689a(arrayList, AbstractC3533j.this.f5717g.invoke(name));
            AbstractC3533j.this.mo34114s(name, arrayList);
            if (C12661e.m6034t(AbstractC3533j.this.mo34135C())) {
                D02 = C9914r.m14790D0(arrayList);
                return D02;
            }
            D0 = C9914r.m14790D0(AbstractC3533j.this.m34158w().m41174a().m41192r().m23231g(AbstractC3533j.this.m34158w(), arrayList));
            return D0;
        }
    }

    /* renamed from: bh.j$k */
    /* loaded from: classes8.dex */
    static final class C3543k extends AbstractC9973s implements Function0<Set<? extends C11142f>> {
        C3543k() {
            super(0);
        }

        /* renamed from: a */
        public final Set<C11142f> invoke() {
            return AbstractC3533j.this.mo34122t(C14403d.f32605w, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bh.j$l */
    /* loaded from: classes8.dex */
    public static final class C3544l extends AbstractC9973s implements Function0<AbstractC6939j<? extends AbstractC13104g<?>>> {

        /* renamed from: l */
        final /* synthetic */ AbstractC6902n f5741l;

        /* renamed from: m */
        final /* synthetic */ C12591c0 f5742m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bh.j$l$a */
        /* loaded from: classes8.dex */
        public static final class C3545a extends AbstractC9973s implements Function0<AbstractC13104g<?>> {

            /* renamed from: k */
            final /* synthetic */ AbstractC3533j f5743k;

            /* renamed from: l */
            final /* synthetic */ AbstractC6902n f5744l;

            /* renamed from: m */
            final /* synthetic */ C12591c0 f5745m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C3545a(AbstractC3533j jVar, AbstractC6902n nVar, C12591c0 c0Var) {
                super(0);
                this.f5743k = jVar;
                this.f5744l = nVar;
                this.f5745m = c0Var;
            }

            /* renamed from: a */
            public final AbstractC13104g<?> invoke() {
                return this.f5743k.m34158w().m41174a().m41203g().mo708a(this.f5744l, this.f5745m);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3544l(AbstractC6902n nVar, C12591c0 c0Var) {
            super(0);
            this.f5741l = nVar;
            this.f5742m = c0Var;
        }

        /* renamed from: a */
        public final AbstractC6939j<AbstractC13104g<?>> invoke() {
            return AbstractC3533j.this.m34158w().m41170e().mo23896e(new C3545a(AbstractC3533j.this, this.f5741l, this.f5742m));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bh.j$m */
    /* loaded from: classes8.dex */
    public static final class C3546m extends AbstractC9973s implements Function1<AbstractC11404z0, AbstractC11297a> {

        /* renamed from: k */
        public static final C3546m f5746k = new C3546m();

        C3546m() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11297a invoke(AbstractC11404z0 selectMostSpecificInEachOverridableGroup) {
            C9971q.m14633g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    public /* synthetic */ AbstractC3533j(C1399g gVar, AbstractC3533j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i & 2) != 0 ? null : jVar);
    }

    /* renamed from: A */
    private final Set<C11142f> m34176A() {
        return (Set) C6943m.m23902a(this.f5719i, this, f5711m[0]);
    }

    /* renamed from: D */
    private final Set<C11142f> m34174D() {
        return (Set) C6943m.m23902a(this.f5720j, this, f5711m[1]);
    }

    /* renamed from: E */
    private final AbstractC7267g0 m34173E(AbstractC6902n nVar) {
        boolean z;
        AbstractC7267g0 o = this.f5712b.m41168g().m33093o(nVar.getType(), C4006b.m33109b(EnumC7319r1.COMMON, false, false, null, 7, null));
        if ((AbstractC10420h.m13368r0(o) || AbstractC10420h.m13362u0(o)) && m34172F(nVar) && nVar.mo3987N()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return o;
        }
        AbstractC7267g0 n = C7322s1.m22933n(o);
        C9971q.m14634f(n, "makeNotNullable(propertyType)");
        return n;
    }

    /* renamed from: F */
    private final boolean m34172F(AbstractC6902n nVar) {
        return nVar.isFinal() && nVar.mo3980f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final AbstractC11388u0 m34169J(AbstractC6902n nVar) {
        List<? extends AbstractC11319f1> i;
        List<AbstractC11396x0> i2;
        C12591c0 u = m34160u(nVar);
        u.m6446V0(null, null, null, null);
        AbstractC7267g0 E = m34173E(nVar);
        i = C9906j.m14820i();
        AbstractC11396x0 z = mo34113z();
        i2 = C9906j.m14820i();
        u.m6441b1(E, i, z, null, i2);
        if (C12661e.m6056K(u, u.getType())) {
            u.m6276L0(new C3544l(nVar, u));
        }
        this.f5712b.m41174a().m41202h().mo703e(nVar, u);
        return u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m34167L(Set<AbstractC11404z0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String c = C7648w.m21803c((AbstractC11404z0) obj, false, false, 2, null);
            Object obj2 = linkedHashMap.get(c);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection<? extends AbstractC11404z0> a = C12682m.m5878a(list, C3546m.f5746k);
                set.removeAll(list);
                set.addAll(a);
            }
        }
    }

    /* renamed from: u */
    private final C12591c0 m34160u(AbstractC6902n nVar) {
        C14654f f1 = C14654f.m56f1(mo34135C(), C1396e.m41179a(this.f5712b, nVar), EnumC11314e0.FINAL, C14138j0.m1536d(nVar.getVisibility()), !nVar.isFinal(), nVar.getName(), this.f5712b.m41174a().m41190t().mo4613a(nVar), m34172F(nVar));
        C9971q.m14634f(f1, "create(\n            owne…d.isFinalStatic\n        )");
        return f1;
    }

    /* renamed from: x */
    private final Set<C11142f> m34157x() {
        return (Set) C6943m.m23902a(this.f5721k, this, f5711m[2]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final AbstractC3533j m34175B() {
        return this.f5713c;
    }

    /* renamed from: C */
    protected abstract AbstractC11346m mo34135C();

    /* renamed from: G */
    protected boolean mo34171G(C14650e eVar) {
        C9971q.m14633g(eVar, "<this>");
        return true;
    }

    /* renamed from: H */
    protected abstract C3534a mo34115H(AbstractC6906r rVar, List<? extends AbstractC11319f1> list, AbstractC7267g0 g0Var, List<? extends AbstractC11335j1> list2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final C14650e m34170I(AbstractC6906r method) {
        boolean z;
        int t;
        AbstractC11396x0 x0Var;
        List<AbstractC11396x0> i;
        Map<? extends AbstractC11297a.AbstractC0362a<?>, ?> map;
        Object U;
        C9971q.m14633g(method, "method");
        AbstractC11672g a = C1396e.m41179a(this.f5712b, method);
        AbstractC11346m C = mo34135C();
        C11142f name = method.getName();
        AbstractC6462a a2 = this.f5712b.m41174a().m41190t().mo4613a(method);
        if (this.f5715e.invoke().mo34298d(method.getName()) == null || !method.mo3975i().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        C14650e p1 = C14650e.m68p1(C, a, name, a2, z);
        C9971q.m14634f(p1, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        C1399g f = C1389a.m41215f(this.f5712b, p1, method, 0, 4, null);
        List<AbstractC6913y> typeParameters = method.getTypeParameters();
        t = C9907k.m14809t(typeParameters, 10);
        List<? extends AbstractC11319f1> arrayList = new ArrayList<>(t);
        for (AbstractC6913y yVar : typeParameters) {
            AbstractC11319f1 a3 = f.m41169f().mo41159a(yVar);
            C9971q.m14636d(a3);
            arrayList.add(a3);
        }
        C3535b K = m34168K(f, p1, method.mo3975i());
        C3534a H = mo34115H(method, arrayList, m34161q(method, f), K.m34149a());
        AbstractC7267g0 c = H.m34153c();
        if (c != null) {
            x0Var = C12659d.m6076i(p1, c, AbstractC11672g.f26044g.m9048b());
        } else {
            x0Var = null;
        }
        AbstractC11396x0 z2 = mo34113z();
        i = C9906j.m14820i();
        List<AbstractC11319f1> e = H.m34151e();
        List<AbstractC11335j1> f2 = H.m34150f();
        AbstractC7267g0 d = H.m34152d();
        EnumC11314e0 a4 = EnumC11314e0.f25242k.m10219a(false, method.isAbstract(), !method.isFinal());
        AbstractC11387u d2 = C14138j0.m1536d(method.getVisibility());
        if (H.m34153c() != null) {
            AbstractC11297a.AbstractC0362a<AbstractC11335j1> aVar = C14650e.f39524Q;
            U = C9914r.m14770U(K.m34149a());
            map = C11288u.m10254e(C11098x.m10921a(aVar, U));
        } else {
            map = C11289v.m10251h();
        }
        p1.mo69o1(x0Var, z2, i, e, f2, d, a4, d2, map);
        p1.m65s1(H.m34154b(), K.m34148b());
        if (!H.m34155a().isEmpty()) {
            f.m41174a().m41191s().mo698a(p1, H.m34155a());
        }
        return p1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public final C3535b m34168K(C1399g gVar, AbstractC11397y function, List<? extends AbstractC6888b0> jValueParameters) {
        Iterable<C11280m> J0;
        int t;
        List D0;
        Pair pair;
        C11142f fVar;
        C1399g c = gVar;
        C9971q.m14633g(c, "c");
        C9971q.m14633g(function, "function");
        C9971q.m14633g(jValueParameters, "jValueParameters");
        J0 = C9914r.m14783J0(jValueParameters);
        t = C9907k.m14809t(J0, 10);
        ArrayList arrayList = new ArrayList(t);
        boolean z = false;
        for (C11280m mVar : J0) {
            int a = mVar.m10279a();
            AbstractC6888b0 b0Var = (AbstractC6888b0) mVar.m10278b();
            AbstractC11672g a2 = C1396e.m41179a(c, b0Var);
            C4005a b = C4006b.m33109b(EnumC7319r1.COMMON, false, false, null, 7, null);
            AbstractC6894f fVar2 = null;
            if (b0Var.mo4062a()) {
                AbstractC6912x type = b0Var.getType();
                if (type instanceof AbstractC6894f) {
                    fVar2 = (AbstractC6894f) type;
                }
                if (fVar2 != null) {
                    AbstractC7267g0 k = gVar.m41168g().m33097k(fVar2, b, true);
                    pair = C11098x.m10921a(k, gVar.m41171d().mo6136n().m13383k(k));
                } else {
                    throw new AssertionError("Vararg parameter should be an array: " + b0Var);
                }
            } else {
                pair = C11098x.m10921a(gVar.m41168g().m33093o(b0Var.getType(), b), null);
            }
            AbstractC7267g0 g0Var = (AbstractC7267g0) pair.m15067a();
            AbstractC7267g0 g0Var2 = (AbstractC7267g0) pair.m15066b();
            if (!C9971q.m14638b(function.getName().m10771b(), "equals") || jValueParameters.size() != 1 || !C9971q.m14638b(gVar.m41171d().mo6136n().m13419I(), g0Var)) {
                fVar = b0Var.getName();
                if (fVar == null) {
                    z = true;
                }
                if (fVar == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(a);
                    fVar = C11142f.m10767f(sb2.toString());
                    C9971q.m14634f(fVar, "identifier(\"p$index\")");
                }
            } else {
                fVar = C11142f.m10767f("other");
            }
            C9971q.m14634f(fVar, "if (function.name.asStri…(\"p$index\")\n            }");
            arrayList.add(new C12619l0(function, null, a, a2, fVar, g0Var, false, false, false, g0Var2, gVar.m41174a().m41190t().mo4613a(b0Var)));
            arrayList = arrayList;
            z = z;
            c = gVar;
        }
        D0 = C9914r.m14790D0(arrayList);
        return new C3535b(D0, z);
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        List i;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        if (mo637c().contains(name)) {
            return this.f5722l.invoke(name);
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: b */
    public Set<C11142f> mo638b() {
        return m34176A();
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: c */
    public Set<C11142f> mo637c() {
        return m34174D();
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: d */
    public Collection<AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        List i;
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        if (mo638b().contains(name)) {
            return this.f5718h.invoke(name);
        }
        i = C9906j.m14820i();
        return i;
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14416k
    /* renamed from: f */
    public Collection<AbstractC11346m> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        return this.f5714d.invoke();
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: g */
    public Set<C11142f> mo635g() {
        return m34157x();
    }

    /* renamed from: l */
    protected abstract Set<C11142f> mo34127l(C14403d dVar, Function1<? super C11142f, Boolean> function1);

    /* renamed from: m */
    protected final List<AbstractC11346m> m34162m(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        List<AbstractC11346m> D0;
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        EnumC13881d dVar = EnumC13881d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.m683a(C14403d.f32585c.m667c())) {
            for (C11142f fVar : mo34127l(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar).booleanValue()) {
                    C11754a.m8689a(linkedHashSet, mo636e(fVar, dVar));
                }
            }
        }
        if (kindFilter.m683a(C14403d.f32585c.m666d()) && !kindFilter.m672l().contains(AbstractC14400c.C14401a.f32582a)) {
            for (C11142f fVar2 : mo34126n(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar2).booleanValue()) {
                    linkedHashSet.addAll(mo626d(fVar2, dVar));
                }
            }
        }
        if (kindFilter.m683a(C14403d.f32585c.m661i()) && !kindFilter.m672l().contains(AbstractC14400c.C14401a.f32582a)) {
            for (C11142f fVar3 : mo34122t(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar3).booleanValue()) {
                    linkedHashSet.addAll(mo627a(fVar3, dVar));
                }
            }
        }
        D0 = C9914r.m14790D0(linkedHashSet);
        return D0;
    }

    /* renamed from: n */
    protected abstract Set<C11142f> mo34126n(C14403d dVar, Function1<? super C11142f, Boolean> function1);

    /* renamed from: o */
    protected void mo34125o(Collection<AbstractC11404z0> result, C11142f name) {
        C9971q.m14633g(result, "result");
        C9971q.m14633g(name, "name");
    }

    /* renamed from: p */
    protected abstract AbstractC3493b mo34124p();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final AbstractC7267g0 m34161q(AbstractC6906r method, C1399g c) {
        C9971q.m14633g(method, "method");
        C9971q.m14633g(c, "c");
        return c.m41168g().m33093o(method.getReturnType(), C4006b.m33109b(EnumC7319r1.COMMON, method.mo3984O().mo4012q(), false, null, 6, null));
    }

    /* renamed from: r */
    protected abstract void mo34123r(Collection<AbstractC11404z0> collection, C11142f fVar);

    /* renamed from: s */
    protected abstract void mo34114s(C11142f fVar, Collection<AbstractC11388u0> collection);

    /* renamed from: t */
    protected abstract Set<C11142f> mo34122t(C14403d dVar, Function1<? super C11142f, Boolean> function1);

    public String toString() {
        return "Lazy scope for " + mo34135C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final AbstractC6938i<Collection<AbstractC11346m>> m34159v() {
        return this.f5714d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final C1399g m34158w() {
        return this.f5712b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final AbstractC6938i<AbstractC3493b> m34156y() {
        return this.f5715e;
    }

    /* renamed from: z */
    protected abstract AbstractC11396x0 mo34113z();

    public AbstractC3533j(C1399g c, AbstractC3533j jVar) {
        List i;
        C9971q.m14633g(c, "c");
        this.f5712b = c;
        this.f5713c = jVar;
        AbstractC6944n e = c.m41170e();
        C3536c cVar = new C3536c();
        i = C9906j.m14820i();
        this.f5714d = e.mo23899b(cVar, i);
        this.f5715e = c.m41170e().mo23898c(new C3540g());
        this.f5716f = c.m41170e().mo23892i(new C3539f());
        this.f5717g = c.m41170e().mo23894g(new C3538e());
        this.f5718h = c.m41170e().mo23892i(new C3542i());
        this.f5719i = c.m41170e().mo23898c(new C3541h());
        this.f5720j = c.m41170e().mo23898c(new C3543k());
        this.f5721k = c.m41170e().mo23898c(new C3537d());
        this.f5722l = c.m41170e().mo23892i(new C0090j());
    }
}
