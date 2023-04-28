package th;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import fi.AbstractC7304o0;
import fi.C7232c1;
import fi.C7270h0;
import fi.C7296m1;
import fi.C7305o1;
import fi.EnumC7338w1;
import gi.AbstractC7664g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11084n;
import nf.C11088q;
import p217lg.AbstractC10420h;
import p268og.AbstractC11319f1;
import p268og.AbstractC11326h;
import p268og.AbstractC11327h0;

/* renamed from: th.n */
/* loaded from: classes8.dex */
public final class C13115n implements AbstractC7268g1 {

    /* renamed from: f */
    public static final C13116a f29417f = new C13116a(null);

    /* renamed from: a */
    private final long f29418a;

    /* renamed from: b */
    private final AbstractC11327h0 f29419b;

    /* renamed from: c */
    private final Set<AbstractC7267g0> f29420c;

    /* renamed from: d */
    private final AbstractC7304o0 f29421d;

    /* renamed from: e */
    private final Lazy f29422e;

    /* renamed from: th.n$a */
    /* loaded from: classes8.dex */
    public static final class C13116a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: th.n$a$a */
        /* loaded from: classes8.dex */
        public enum EnumC0420a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* renamed from: th.n$a$b */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C13117b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f29426a;

            static {
                int[] iArr = new int[EnumC0420a.values().length];
                try {
                    iArr[EnumC0420a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0420a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f29426a = iArr;
            }
        }

        private C13116a() {
        }

        public /* synthetic */ C13116a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final AbstractC7304o0 m4576a(Collection<? extends AbstractC7304o0> collection, EnumC0420a aVar) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    C13116a aVar2 = C13115n.f29417f;
                    next = aVar2.m4574c((AbstractC7304o0) next, (AbstractC7304o0) it.next(), aVar);
                }
                return (AbstractC7304o0) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        /* renamed from: c */
        private final AbstractC7304o0 m4574c(AbstractC7304o0 o0Var, AbstractC7304o0 o0Var2, EnumC0420a aVar) {
            if (o0Var == null || o0Var2 == null) {
                return null;
            }
            AbstractC7268g1 N0 = o0Var.mo5172N0();
            AbstractC7268g1 N02 = o0Var2.mo5172N0();
            boolean z = N0 instanceof C13115n;
            if (z && (N02 instanceof C13115n)) {
                return m4572e((C13115n) N0, (C13115n) N02, aVar);
            }
            if (z) {
                return m4573d((C13115n) N0, o0Var2);
            }
            if (N02 instanceof C13115n) {
                return m4573d((C13115n) N02, o0Var);
            }
            return null;
        }

        /* renamed from: d */
        private final AbstractC7304o0 m4573d(C13115n nVar, AbstractC7304o0 o0Var) {
            if (nVar.m4580g().contains(o0Var)) {
                return o0Var;
            }
            return null;
        }

        /* renamed from: e */
        private final AbstractC7304o0 m4572e(C13115n nVar, C13115n nVar2, EnumC0420a aVar) {
            Set set;
            int i = C13117b.f29426a[aVar.ordinal()];
            if (i == 1) {
                set = C9914r.m14764a0(nVar.m4580g(), nVar2.m4580g());
            } else if (i == 2) {
                set = C9914r.m14785I0(nVar.m4580g(), nVar2.m4580g());
            } else {
                throw new C11088q();
            }
            return C7270h0.m23055e(C7232c1.f15671l.m23149h(), new C13115n(nVar.f29418a, nVar.f29419b, set, null), false);
        }

        /* renamed from: b */
        public final AbstractC7304o0 m4575b(Collection<? extends AbstractC7304o0> types) {
            C9971q.m14633g(types, "types");
            return m4576a(types, EnumC0420a.INTERSECTION_TYPE);
        }
    }

    /* renamed from: th.n$b */
    /* loaded from: classes8.dex */
    static final class C13118b extends AbstractC9973s implements Function0<List<AbstractC7304o0>> {
        C13118b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<AbstractC7304o0> invoke() {
            List d;
            List<AbstractC7304o0> o;
            AbstractC7304o0 p = C13115n.this.mo4567n().m13358x().mo6166p();
            C9971q.m14634f(p, "builtIns.comparable.defaultType");
            d = C9905i.m14825d(new C7296m1(EnumC7338w1.IN_VARIANCE, C13115n.this.f29421d));
            o = C9906j.m14814o(C7305o1.m22994f(p, d, null, 2, null));
            if (!C13115n.this.m4578i()) {
                o.add(C13115n.this.mo4567n().m13416L());
            }
            return o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.n$c */
    /* loaded from: classes8.dex */
    public static final class C13119c extends AbstractC9973s implements Function1<AbstractC7267g0, CharSequence> {

        /* renamed from: k */
        public static final C13119c f29428k = new C13119c();

        C13119c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(AbstractC7267g0 it) {
            C9971q.m14633g(it, "it");
            return it.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C13115n(long j, AbstractC11327h0 h0Var, Set<? extends AbstractC7267g0> set) {
        Lazy a;
        this.f29421d = C7270h0.m23055e(C7232c1.f15671l.m23149h(), this, false);
        a = C11084n.m10945a(new C13118b());
        this.f29422e = a;
        this.f29418a = j;
        this.f29419b = h0Var;
        this.f29420c = set;
    }

    public /* synthetic */ C13115n(long j, AbstractC11327h0 h0Var, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, h0Var, set);
    }

    /* renamed from: h */
    private final List<AbstractC7267g0> m4579h() {
        return (List) this.f29422e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final boolean m4578i() {
        Collection<AbstractC7267g0> a = C13128t.m4555a(this.f29419b);
        if ((a instanceof Collection) && a.isEmpty()) {
            return true;
        }
        for (AbstractC7267g0 g0Var : a) {
            if (!(!this.f29420c.contains(g0Var))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    private final String m4577j() {
        String e0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        e0 = C9914r.m14760e0(this.f29420c, ",", null, null, 0, null, C13119c.f29428k, 30, null);
        sb2.append(e0);
        sb2.append(']');
        return sb2.toString();
    }

    /* renamed from: g */
    public final Set<AbstractC7267g0> m4580g() {
        return this.f29420c;
    }

    @Override // fi.AbstractC7268g1
    public List<AbstractC11319f1> getParameters() {
        List<AbstractC11319f1> i;
        i = C9906j.m14820i();
        return i;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: m */
    public Collection<AbstractC7267g0> mo4568m() {
        return m4579h();
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: n */
    public AbstractC10420h mo4567n() {
        return this.f29419b.mo6136n();
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: o */
    public AbstractC7268g1 mo4566o(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: p */
    public AbstractC11326h mo4565p() {
        return null;
    }

    @Override // fi.AbstractC7268g1
    /* renamed from: q */
    public boolean mo4564q() {
        return false;
    }

    public String toString() {
        return "IntegerLiteralType" + m4577j();
    }
}
