package bh;

import fi.AbstractC7267g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.collections.C9911o;
import kotlin.collections.C9914r;
import kotlin.collections.C9921w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p013ah.C1399g;
import p086eh.AbstractC6895g;
import p086eh.AbstractC6905q;
import p217lg.C10434k;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.AbstractC11388u0;
import p268og.AbstractC11404z0;
import p286pi.C11754a;
import p286pi.C11755b;
import p306qi.C12200o;
import p325rh.C12659d;
import p406wg.AbstractC13878b;
import p406wg.EnumC13881d;
import p447yg.C14378a;
import p448yh.AbstractC14411h;
import p448yh.C14403d;
import p467zg.AbstractC14648c;
import p467zg.C14656h;

/* renamed from: bh.l */
/* loaded from: classes8.dex */
public final class C3548l extends AbstractC3554m {

    /* renamed from: n */
    private final AbstractC6895g f5748n;

    /* renamed from: o */
    private final AbstractC14648c f5749o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bh.l$a */
    /* loaded from: classes8.dex */
    public static final class C3549a extends AbstractC9973s implements Function1<AbstractC6905q, Boolean> {

        /* renamed from: k */
        public static final C3549a f5750k = new C3549a();

        C3549a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(AbstractC6905q it) {
            C9971q.m14633g(it, "it");
            return Boolean.valueOf(it.mo3980f());
        }
    }

    /* renamed from: bh.l$b */
    /* loaded from: classes8.dex */
    static final class C3550b extends AbstractC9973s implements Function1<AbstractC14411h, Collection<? extends AbstractC11388u0>> {

        /* renamed from: k */
        final /* synthetic */ C11142f f5751k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3550b(C11142f fVar) {
            super(1);
            this.f5751k = fVar;
        }

        /* renamed from: a */
        public final Collection<? extends AbstractC11388u0> invoke(AbstractC14411h it) {
            C9971q.m14633g(it, "it");
            return it.mo627a(this.f5751k, EnumC13881d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* renamed from: bh.l$c */
    /* loaded from: classes8.dex */
    static final class C3551c extends AbstractC9973s implements Function1<AbstractC14411h, Collection<? extends C11142f>> {

        /* renamed from: k */
        public static final C3551c f5752k = new C3551c();

        C3551c() {
            super(1);
        }

        /* renamed from: a */
        public final Collection<C11142f> invoke(AbstractC14411h it) {
            C9971q.m14633g(it, "it");
            return it.mo637c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bh.l$d */
    /* loaded from: classes8.dex */
    public static final class C3552d extends AbstractC9973s implements Function1<AbstractC7267g0, AbstractC11313e> {

        /* renamed from: k */
        public static final C3552d f5753k = new C3552d();

        C3552d() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC11313e invoke(AbstractC7267g0 g0Var) {
            AbstractC11326h p = g0Var.mo5172N0().mo4565p();
            if (p instanceof AbstractC11313e) {
                return (AbstractC11313e) p;
            }
            return null;
        }
    }

    /* renamed from: bh.l$e */
    /* loaded from: classes8.dex */
    public static final class C3553e extends C11755b.AbstractC0376b<AbstractC11313e, Unit> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11313e f5754a;

        /* renamed from: b */
        final /* synthetic */ Set<R> f5755b;

        /* renamed from: c */
        final /* synthetic */ Function1<AbstractC14411h, Collection<R>> f5756c;

        /* JADX WARN: Multi-variable type inference failed */
        C3553e(AbstractC11313e eVar, Set<R> set, Function1<? super AbstractC14411h, ? extends Collection<? extends R>> function1) {
            this.f5754a = eVar;
            this.f5755b = set;
            this.f5756c = function1;
        }

        @Override // p286pi.C11755b.AbstractC11758d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo3517a() {
            m34116e();
            return Unit.f22042a;
        }

        /* renamed from: d */
        public boolean mo3515c(AbstractC11313e current) {
            C9971q.m14633g(current, "current");
            if (current == this.f5754a) {
                return true;
            }
            AbstractC14411h i0 = current.mo6113i0();
            C9971q.m14634f(i0, "current.staticScope");
            if (!(i0 instanceof AbstractC3554m)) {
                return true;
            }
            this.f5755b.addAll((Collection) this.f5756c.invoke(i0));
            return false;
        }

        /* renamed from: e */
        public void m34116e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3548l(C1399g c, AbstractC6895g jClass, AbstractC14648c ownerDescriptor) {
        super(c);
        C9971q.m14633g(c, "c");
        C9971q.m14633g(jClass, "jClass");
        C9971q.m14633g(ownerDescriptor, "ownerDescriptor");
        this.f5748n = jClass;
        this.f5749o = ownerDescriptor;
    }

    /* renamed from: O */
    private final <R> Set<R> m34132O(AbstractC11313e eVar, Set<R> set, Function1<? super AbstractC14411h, ? extends Collection<? extends R>> function1) {
        List d;
        d = C9905i.m14825d(eVar);
        C11755b.m8681b(d, C3547k.f5747a, new C3553e(eVar, set, function1));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final Iterable m34131P(AbstractC11313e eVar) {
        Sequence K;
        Sequence z;
        Iterable l;
        Collection<AbstractC7267g0> m = eVar.mo6111k().mo4568m();
        C9971q.m14634f(m, "it.typeConstructor.supertypes");
        K = C9914r.m14782K(m);
        z = C12200o.m7419z(K, C3552d.f5753k);
        l = C12200o.m7433l(z);
        return l;
    }

    /* renamed from: R */
    private final AbstractC11388u0 m34129R(AbstractC11388u0 u0Var) {
        int t;
        List N;
        Object r0;
        if (u0Var.mo6245g().m10224a()) {
            return u0Var;
        }
        Collection<? extends AbstractC11388u0> d = u0Var.mo6249d();
        C9971q.m14634f(d, "this.overriddenDescriptors");
        t = C9907k.m14809t(d, 10);
        ArrayList arrayList = new ArrayList(t);
        for (AbstractC11388u0 it : d) {
            C9971q.m14634f(it, "it");
            arrayList.add(m34129R(it));
        }
        N = C9914r.m14777N(arrayList);
        r0 = C9914r.m14747r0(N);
        return (AbstractC11388u0) r0;
    }

    /* renamed from: S */
    private final Set<AbstractC11404z0> m34128S(C11142f fVar, AbstractC11313e eVar) {
        Set<AbstractC11404z0> H0;
        Set<AbstractC11404z0> d;
        C3548l b = C14656h.m52b(eVar);
        if (b == null) {
            d = C9921w.m14722d();
            return d;
        }
        H0 = C9914r.m14786H0(b.mo626d(fVar, EnumC13881d.WHEN_GET_SUPER_MEMBERS));
        return H0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public C3492a mo34124p() {
        return new C3492a(this.f5748n, C3549a.f5750k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public AbstractC14648c mo34135C() {
        return this.f5749o;
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14416k
    /* renamed from: e */
    public AbstractC11326h mo636e(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        return null;
    }

    @Override // bh.AbstractC3533j
    /* renamed from: l */
    protected Set<C11142f> mo34127l(C14403d kindFilter, Function1<? super C11142f, Boolean> function1) {
        Set<C11142f> d;
        C9971q.m14633g(kindFilter, "kindFilter");
        d = C9921w.m14722d();
        return d;
    }

    @Override // bh.AbstractC3533j
    /* renamed from: n */
    protected Set<C11142f> mo34126n(C14403d kindFilter, Function1<? super C11142f, Boolean> function1) {
        Set<C11142f> G0;
        Set<C11142f> set;
        List l;
        C9971q.m14633g(kindFilter, "kindFilter");
        G0 = C9914r.m14787G0(m34156y().invoke().mo34301a());
        C3548l b = C14656h.m52b(mo34135C());
        if (b != null) {
            set = b.mo638b();
        } else {
            set = null;
        }
        if (set == null) {
            set = C9921w.m14722d();
        }
        G0.addAll(set);
        if (this.f5748n.mo4009v()) {
            l = C9906j.m14817l(C10434k.f22879f, C10434k.f22877d);
            G0.addAll(l);
        }
        G0.addAll(m34158w().m41174a().m41187w().mo2384e(m34158w(), mo34135C()));
        return G0;
    }

    @Override // bh.AbstractC3533j
    /* renamed from: o */
    protected void mo34125o(Collection<AbstractC11404z0> result, C11142f name) {
        C9971q.m14633g(result, "result");
        C9971q.m14633g(name, "name");
        m34158w().m41174a().m41187w().mo2385d(m34158w(), mo34135C(), name, result);
    }

    @Override // bh.AbstractC3533j
    /* renamed from: r */
    protected void mo34123r(Collection<AbstractC11404z0> result, C11142f name) {
        C9971q.m14633g(result, "result");
        C9971q.m14633g(name, "name");
        Collection<? extends AbstractC11404z0> e = C14378a.m729e(name, m34128S(name, mo34135C()), result, mo34135C(), m34158w().m41174a().m41207c(), m34158w().m41174a().m41199k().mo21675a());
        C9971q.m14634f(e, "resolveOverridesForStati…rridingUtil\n            )");
        result.addAll(e);
        if (!this.f5748n.mo4009v()) {
            return;
        }
        if (C9971q.m14638b(name, C10434k.f22879f)) {
            AbstractC11404z0 g = C12659d.m6078g(mo34135C());
            C9971q.m14634f(g, "createEnumValueOfMethod(ownerDescriptor)");
            result.add(g);
        } else if (C9971q.m14638b(name, C10434k.f22877d)) {
            AbstractC11404z0 h = C12659d.m6077h(mo34135C());
            C9971q.m14634f(h, "createEnumValuesMethod(ownerDescriptor)");
            result.add(h);
        }
    }

    @Override // bh.AbstractC3554m, bh.AbstractC3533j
    /* renamed from: s */
    protected void mo34114s(C11142f name, Collection<AbstractC11388u0> result) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(result, "result");
        Set O = m34132O(mo34135C(), new LinkedHashSet(), new C3550b(name));
        if (!result.isEmpty()) {
            Collection<? extends AbstractC11388u0> e = C14378a.m729e(name, O, result, mo34135C(), m34158w().m41174a().m41207c(), m34158w().m41174a().m41199k().mo21675a());
            C9971q.m14634f(e, "resolveOverridesForStati…ingUtil\n                )");
            result.addAll(e);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : O) {
                AbstractC11388u0 R = m34129R((AbstractC11388u0) obj);
                Object obj2 = linkedHashMap.get(R);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(R, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Collection e2 = C14378a.m729e(name, (Collection) entry.getValue(), result, mo34135C(), m34158w().m41174a().m41207c(), m34158w().m41174a().m41199k().mo21675a());
                C9971q.m14634f(e2, "resolveOverridesForStati…ingUtil\n                )");
                C9911o.m14801y(arrayList, e2);
            }
            result.addAll(arrayList);
        }
        if (this.f5748n.mo4009v() && C9971q.m14638b(name, C10434k.f22878e)) {
            C11754a.m8689a(result, C12659d.m6079f(mo34135C()));
        }
    }

    @Override // bh.AbstractC3533j
    /* renamed from: t */
    protected Set<C11142f> mo34122t(C14403d kindFilter, Function1<? super C11142f, Boolean> function1) {
        Set<C11142f> G0;
        C9971q.m14633g(kindFilter, "kindFilter");
        G0 = C9914r.m14787G0(m34156y().invoke().mo34299c());
        m34132O(mo34135C(), G0, C3551c.f5752k);
        if (this.f5748n.mo4009v()) {
            G0.add(C10434k.f22878e);
        }
        return G0;
    }
}
