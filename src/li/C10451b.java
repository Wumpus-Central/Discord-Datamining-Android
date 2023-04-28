package li;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7275h1;
import fi.AbstractC7290k1;
import fi.AbstractC7304o0;
import fi.AbstractC7335v1;
import fi.C7235d0;
import fi.C7270h0;
import fi.C7296m1;
import fi.C7305o1;
import fi.C7309p1;
import fi.C7322s1;
import fi.C7331u1;
import fi.EnumC7338w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.C9883a;
import kotlin.Pair;
import kotlin.collections.C9907k;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11088q;
import p217lg.AbstractC10420h;
import p268og.AbstractC11319f1;
import p388vh.C13508c;
import sh.AbstractC12900b;
import sh.C12902d;

/* renamed from: li.b */
/* loaded from: classes8.dex */
public final class C10451b {

    /* renamed from: li.b$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C10452a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23068a;

        static {
            int[] iArr = new int[EnumC7338w1.values().length];
            try {
                iArr[EnumC7338w1.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7338w1.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7338w1.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23068a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: li.b$b */
    /* loaded from: classes8.dex */
    public static final class C0336b extends AbstractC9973s implements Function1<AbstractC7335v1, Boolean> {

        /* renamed from: k */
        public static final C0336b f23069k = new C0336b();

        C0336b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC7335v1 it) {
            C9971q.m14634f(it, "it");
            return Boolean.valueOf(C12902d.m5152d(it));
        }
    }

    /* renamed from: li.b$c */
    /* loaded from: classes8.dex */
    public static final class C10453c extends AbstractC7275h1 {
        C10453c() {
        }

        @Override // fi.AbstractC7275h1
        /* renamed from: k */
        public AbstractC7290k1 mo13138k(AbstractC7268g1 key) {
            AbstractC12900b bVar;
            C9971q.m14633g(key, "key");
            if (key instanceof AbstractC12900b) {
                bVar = (AbstractC12900b) key;
            } else {
                bVar = null;
            }
            if (bVar == null) {
                return null;
            }
            if (bVar.mo5160b().mo22907a()) {
                return new C7296m1(EnumC7338w1.OUT_VARIANCE, bVar.mo5160b().getType());
            }
            return bVar.mo5160b();
        }
    }

    /* renamed from: a */
    public static final C10450a<AbstractC7267g0> m13148a(AbstractC7267g0 type) {
        List<Pair> K0;
        Object obj;
        C9971q.m14633g(type, "type");
        if (C7235d0.m23144b(type)) {
            C10450a<AbstractC7267g0> a = m13148a(C7235d0.m23143c(type));
            C10450a<AbstractC7267g0> a2 = m13148a(C7235d0.m23142d(type));
            return new C10450a<>(C7331u1.m22900b(C7270h0.m23056d(C7235d0.m23143c(a.m13150c()), C7235d0.m23142d(a2.m13150c())), type), C7331u1.m22900b(C7270h0.m23056d(C7235d0.m23143c(a.m13149d()), C7235d0.m23142d(a2.m13149d())), type));
        }
        AbstractC7268g1 N0 = type.mo5172N0();
        if (C12902d.m5152d(type)) {
            C9971q.m14635e(N0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            AbstractC7290k1 b = ((AbstractC12900b) N0).mo5160b();
            AbstractC7267g0 type2 = b.getType();
            C9971q.m14634f(type2, "typeProjection.type");
            AbstractC7267g0 b2 = m13147b(type2, type);
            int i = C10452a.f23068a[b.mo22906b().ordinal()];
            if (i == 2) {
                AbstractC7304o0 I = C9883a.m15096i(type).m13419I();
                C9971q.m14634f(I, "type.builtIns.nullableAnyType");
                return new C10450a<>(b2, I);
            } else if (i == 3) {
                AbstractC7304o0 H = C9883a.m15096i(type).m13420H();
                C9971q.m14634f(H, "type.builtIns.nothingType");
                return new C10450a<>(m13147b(H, type), b2);
            } else {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + b);
            }
        } else if (type.mo5174L0().isEmpty() || type.mo5174L0().size() != N0.getParameters().size()) {
            return new C10450a<>(type, type);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<AbstractC7290k1> L0 = type.mo5174L0();
            List<AbstractC11319f1> parameters = N0.getParameters();
            C9971q.m14634f(parameters, "typeConstructor.parameters");
            K0 = C9914r.m14781K0(L0, parameters);
            for (Pair pair : K0) {
                AbstractC7290k1 k1Var = (AbstractC7290k1) pair.m15067a();
                AbstractC11319f1 typeParameter = (AbstractC11319f1) pair.m15066b();
                C9971q.m14634f(typeParameter, "typeParameter");
                C10454c g = m13142g(k1Var, typeParameter);
                if (k1Var.mo22907a()) {
                    arrayList.add(g);
                    arrayList2.add(g);
                } else {
                    C10450a<C10454c> d = m13145d(g);
                    arrayList.add(d.m13152a());
                    arrayList2.add(d.m13151b());
                }
            }
            boolean z = false;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((C10454c) it.next()).m13134d()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                obj = C9883a.m15096i(type).m13420H();
                C9971q.m14634f(obj, "type.builtIns.nothingType");
            } else {
                obj = m13144e(type, arrayList);
            }
            return new C10450a<>(obj, m13144e(type, arrayList2));
        }
    }

    /* renamed from: b */
    private static final AbstractC7267g0 m13147b(AbstractC7267g0 g0Var, AbstractC7267g0 g0Var2) {
        AbstractC7267g0 q = C7322s1.m22930q(g0Var, g0Var2.mo5171O0());
        C9971q.m14634f(q, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return q;
    }

    /* renamed from: c */
    public static final AbstractC7290k1 m13146c(AbstractC7290k1 k1Var, boolean z) {
        if (k1Var == null) {
            return null;
        }
        if (k1Var.mo22907a()) {
            return k1Var;
        }
        AbstractC7267g0 type = k1Var.getType();
        C9971q.m14634f(type, "typeProjection.type");
        if (!C7322s1.m22944c(type, C0336b.f23069k)) {
            return k1Var;
        }
        EnumC7338w1 b = k1Var.mo22906b();
        C9971q.m14634f(b, "typeProjection.projectionKind");
        if (b == EnumC7338w1.OUT_VARIANCE) {
            return new C7296m1(b, m13148a(type).m13149d());
        }
        if (z) {
            return new C7296m1(b, m13148a(type).m13150c());
        }
        return m13143f(k1Var);
    }

    /* renamed from: d */
    private static final C10450a<C10454c> m13145d(C10454c cVar) {
        C10450a<AbstractC7267g0> a = m13148a(cVar.m13137a());
        C10450a<AbstractC7267g0> a2 = m13148a(cVar.m13136b());
        return new C10450a<>(new C10454c(cVar.m13135c(), a.m13151b(), a2.m13152a()), new C10454c(cVar.m13135c(), a.m13152a(), a2.m13151b()));
    }

    /* renamed from: e */
    private static final AbstractC7267g0 m13144e(AbstractC7267g0 g0Var, List<C10454c> list) {
        int t;
        g0Var.mo5174L0().size();
        list.size();
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (C10454c cVar : list) {
            arrayList.add(m13141h(cVar));
        }
        return C7305o1.m22995e(g0Var, arrayList, null, null, 6, null);
    }

    /* renamed from: f */
    private static final AbstractC7290k1 m13143f(AbstractC7290k1 k1Var) {
        C7309p1 g = C7309p1.m22979g(new C10453c());
        C9971q.m14634f(g, "create(object : TypeCons…ojection\n        }\n    })");
        return g.m22966t(k1Var);
    }

    /* renamed from: g */
    private static final C10454c m13142g(AbstractC7290k1 k1Var, AbstractC11319f1 f1Var) {
        int i = C10452a.f23068a[C7309p1.m22983c(f1Var.mo6392m(), k1Var).ordinal()];
        if (i == 1) {
            AbstractC7267g0 type = k1Var.getType();
            C9971q.m14634f(type, "type");
            AbstractC7267g0 type2 = k1Var.getType();
            C9971q.m14634f(type2, "type");
            return new C10454c(f1Var, type, type2);
        } else if (i == 2) {
            AbstractC7267g0 type3 = k1Var.getType();
            C9971q.m14634f(type3, "type");
            AbstractC7304o0 I = C13508c.m3531j(f1Var).m13419I();
            C9971q.m14634f(I, "typeParameter.builtIns.nullableAnyType");
            return new C10454c(f1Var, type3, I);
        } else if (i == 3) {
            AbstractC7304o0 H = C13508c.m3531j(f1Var).m13420H();
            C9971q.m14634f(H, "typeParameter.builtIns.nothingType");
            AbstractC7267g0 type4 = k1Var.getType();
            C9971q.m14634f(type4, "type");
            return new C10454c(f1Var, H, type4);
        } else {
            throw new C11088q();
        }
    }

    /* renamed from: h */
    private static final AbstractC7290k1 m13141h(C10454c cVar) {
        cVar.m13134d();
        if (!C9971q.m14638b(cVar.m13137a(), cVar.m13136b())) {
            EnumC7338w1 m = cVar.m13135c().mo6392m();
            EnumC7338w1 w1Var = EnumC7338w1.IN_VARIANCE;
            if (m != w1Var) {
                if (AbstractC10420h.m13378m0(cVar.m13137a()) && cVar.m13135c().mo6392m() != w1Var) {
                    return new C7296m1(m13140i(cVar, EnumC7338w1.OUT_VARIANCE), cVar.m13136b());
                }
                if (AbstractC10420h.m13374o0(cVar.m13136b())) {
                    return new C7296m1(m13140i(cVar, w1Var), cVar.m13137a());
                }
                return new C7296m1(m13140i(cVar, EnumC7338w1.OUT_VARIANCE), cVar.m13136b());
            }
        }
        return new C7296m1(cVar.m13137a());
    }

    /* renamed from: i */
    private static final EnumC7338w1 m13140i(C10454c cVar, EnumC7338w1 w1Var) {
        return w1Var == cVar.m13135c().mo6392m() ? EnumC7338w1.INVARIANT : w1Var;
    }
}
