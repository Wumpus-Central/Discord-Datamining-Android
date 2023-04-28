package fi;

import eg.C6884j;
import fi.AbstractC7275h1;
import gi.C7658d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import ki.C9883a;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.collections.C9920v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11084n;
import nf.C11098x;
import p087ei.AbstractC6936g;
import p087ei.C6920f;
import p142hi.C8036h;
import p142hi.C8039k;
import p142hi.EnumC8038j;
import p267of.C11288u;
import p268og.AbstractC11313e;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;

/* renamed from: fi.j1 */
/* loaded from: classes8.dex */
public final class C7283j1 {

    /* renamed from: f */
    public static final C7284a f15760f = new C7284a(null);

    /* renamed from: a */
    private final C7339x f15761a;

    /* renamed from: b */
    private final C7279i1 f15762b;

    /* renamed from: c */
    private final C6920f f15763c;

    /* renamed from: d */
    private final Lazy f15764d;

    /* renamed from: e */
    private final AbstractC6936g<C7285b, AbstractC7267g0> f15765e;

    /* renamed from: fi.j1$a */
    /* loaded from: classes8.dex */
    public static final class C7284a {
        private C7284a() {
        }

        public /* synthetic */ C7284a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x00b3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:106:0x014e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01f0 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final fi.AbstractC7267g0 m23016a(fi.AbstractC7267g0 r17, fi.C7309p1 r18, java.util.Set<? extends p268og.AbstractC11319f1> r19, boolean r20) {
            /*
                Method dump skipped, instructions count: 529
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fi.C7283j1.C7284a.m23016a(fi.g0, fi.p1, java.util.Set, boolean):fi.g0");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fi.j1$b */
    /* loaded from: classes8.dex */
    public static final class C7285b {

        /* renamed from: a */
        private final AbstractC11319f1 f15766a;

        /* renamed from: b */
        private final C7343y f15767b;

        public C7285b(AbstractC11319f1 typeParameter, C7343y typeAttr) {
            C9971q.m14633g(typeParameter, "typeParameter");
            C9971q.m14633g(typeAttr, "typeAttr");
            this.f15766a = typeParameter;
            this.f15767b = typeAttr;
        }

        /* renamed from: a */
        public final C7343y m23015a() {
            return this.f15767b;
        }

        /* renamed from: b */
        public final AbstractC11319f1 m23014b() {
            return this.f15766a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7285b)) {
                return false;
            }
            C7285b bVar = (C7285b) obj;
            if (!C9971q.m14638b(bVar.f15766a, this.f15766a) || !C9971q.m14638b(bVar.f15767b, this.f15767b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f15766a.hashCode();
            return hashCode + (hashCode * 31) + this.f15767b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f15766a + ", typeAttr=" + this.f15767b + ')';
        }
    }

    /* renamed from: fi.j1$c */
    /* loaded from: classes8.dex */
    static final class C7286c extends AbstractC9973s implements Function0<C8036h> {
        C7286c() {
            super(0);
        }

        /* renamed from: a */
        public final C8036h invoke() {
            return C8039k.m20774d(EnumC8038j.CANNOT_COMPUTE_ERASED_BOUND, C7283j1.this.toString());
        }
    }

    /* renamed from: fi.j1$d */
    /* loaded from: classes8.dex */
    static final class C7287d extends AbstractC9973s implements Function1<C7285b, AbstractC7267g0> {
        C7287d() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke(C7285b bVar) {
            return C7283j1.this.m23019d(bVar.m23014b(), bVar.m23015a());
        }
    }

    public C7283j1(C7339x projectionComputer, C7279i1 options) {
        Lazy a;
        C9971q.m14633g(projectionComputer, "projectionComputer");
        C9971q.m14633g(options, "options");
        this.f15761a = projectionComputer;
        this.f15762b = options;
        C6920f fVar = new C6920f("Type parameter upper bound erasure results");
        this.f15763c = fVar;
        a = C11084n.m10945a(new C7286c());
        this.f15764d = a;
        AbstractC6936g<C7285b, AbstractC7267g0> i = fVar.mo23892i(new C7287d());
        C9971q.m14634f(i, "storage.createMemoizedFu…ameter, typeAttr) }\n    }");
        this.f15765e = i;
    }

    /* renamed from: b */
    private final AbstractC7267g0 m23021b(C7343y yVar) {
        AbstractC7267g0 w;
        AbstractC7304o0 a = yVar.mo22865a();
        return (a == null || (w = C9883a.m15082w(a)) == null) ? m23018e() : w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final AbstractC7267g0 m23019d(AbstractC11319f1 f1Var, C7343y yVar) {
        int t;
        int d;
        int c;
        List<AbstractC7267g0> D0;
        int t2;
        Object q0;
        AbstractC7290k1 k1Var;
        Set<AbstractC11319f1> c2 = yVar.mo22863c();
        if (c2 != null && c2.contains(f1Var.mo6162a())) {
            return m23021b(yVar);
        }
        AbstractC7304o0 p = f1Var.mo6166p();
        C9971q.m14634f(p, "typeParameter.defaultType");
        Set<AbstractC11319f1> g = C9883a.m15098g(p, c2);
        t = C9907k.m14809t(g, 10);
        d = C11288u.m10255d(t);
        c = C6884j.m23961c(d, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (AbstractC11319f1 f1Var2 : g) {
            if (c2 == null || !c2.contains(f1Var2)) {
                k1Var = this.f15761a.mo22885a(f1Var2, yVar, this, m23020c(f1Var2, yVar.mo22862d(f1Var)));
            } else {
                k1Var = C7322s1.m22927t(f1Var2, yVar);
                C9971q.m14634f(k1Var, "makeStarProjection(it, typeAttr)");
            }
            Pair a = C11098x.m10921a(f1Var2.mo6111k(), k1Var);
            linkedHashMap.put(a.m15065c(), a.m15064d());
        }
        boolean z = false;
        C7309p1 g2 = C7309p1.m22979g(AbstractC7275h1.C7276a.m23036e(AbstractC7275h1.f15749c, linkedHashMap, false, 2, null));
        C9971q.m14634f(g2, "create(TypeConstructorSu…ap(erasedTypeParameters))");
        List<AbstractC7267g0> upperBounds = f1Var.getUpperBounds();
        C9971q.m14634f(upperBounds, "typeParameter.upperBounds");
        Set<AbstractC7267g0> f = m23017f(g2, upperBounds, yVar);
        if (!(!f.isEmpty())) {
            return m23021b(yVar);
        }
        if (!this.f15762b.m23033a()) {
            if (f.size() == 1) {
                z = true;
            }
            if (z) {
                q0 = C9914r.m14748q0(f);
                return (AbstractC7267g0) q0;
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
        }
        D0 = C9914r.m14790D0(f);
        t2 = C9907k.m14809t(D0, 10);
        ArrayList arrayList = new ArrayList(t2);
        for (AbstractC7267g0 g0Var : D0) {
            arrayList.add(g0Var.mo22868Q0());
        }
        return C7658d.m21706a(arrayList);
    }

    /* renamed from: e */
    private final C8036h m23018e() {
        return (C8036h) this.f15764d.getValue();
    }

    /* renamed from: f */
    private final Set<AbstractC7267g0> m23017f(C7309p1 p1Var, List<? extends AbstractC7267g0> list, C7343y yVar) {
        Set b;
        Set<AbstractC7267g0> a;
        b = C9920v.m14724b();
        for (AbstractC7267g0 g0Var : list) {
            AbstractC11326h p = g0Var.mo5172N0().mo4565p();
            if (p instanceof AbstractC11313e) {
                b.add(f15760f.m23016a(g0Var, p1Var, yVar.mo22863c(), this.f15762b.m23032b()));
            } else if (p instanceof AbstractC11319f1) {
                Set<AbstractC11319f1> c = yVar.mo22863c();
                boolean z = false;
                if (c != null && c.contains(p)) {
                    z = true;
                }
                if (z) {
                    b.add(m23021b(yVar));
                } else {
                    List<AbstractC7267g0> upperBounds = ((AbstractC11319f1) p).getUpperBounds();
                    C9971q.m14634f(upperBounds, "declaration.upperBounds");
                    b.addAll(m23017f(p1Var, upperBounds, yVar));
                }
            }
            if (!this.f15762b.m23033a()) {
                break;
            }
        }
        a = C9920v.m14725a(b);
        return a;
    }

    /* renamed from: c */
    public final AbstractC7267g0 m23020c(AbstractC11319f1 typeParameter, C7343y typeAttr) {
        C9971q.m14633g(typeParameter, "typeParameter");
        C9971q.m14633g(typeAttr, "typeAttr");
        AbstractC7267g0 invoke = this.f15765e.invoke(new C7285b(typeParameter, typeAttr));
        C9971q.m14634f(invoke, "getErasedUpperBound(Data…typeParameter, typeAttr))");
        return invoke;
    }

    public /* synthetic */ C7283j1(C7339x xVar, C7279i1 i1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar, (i & 2) != 0 ? new C7279i1(false, false) : i1Var);
    }
}
