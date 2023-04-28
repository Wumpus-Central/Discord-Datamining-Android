package p390w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p390w.AbstractC13662r0;

/* renamed from: w.n0 */
/* loaded from: classes.dex */
public final class C13639n0 {

    /* renamed from: g */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f30458g = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: h */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f30459h = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: a */
    final List<AbstractC13689w0> f30460a;

    /* renamed from: b */
    final AbstractC13662r0 f30461b;

    /* renamed from: c */
    final int f30462c;

    /* renamed from: d */
    final List<AbstractC13615k> f30463d;

    /* renamed from: e */
    private final boolean f30464e;

    /* renamed from: f */
    private final C13671s2 f30465f;

    /* renamed from: w.n0$b */
    /* loaded from: classes.dex */
    public interface AbstractC13641b {
        /* renamed from: a */
        void mo3128a(AbstractC13697x2<?> x2Var, C13640a aVar);
    }

    C13639n0(List<AbstractC13689w0> list, AbstractC13662r0 r0Var, int i, List<AbstractC13615k> list2, boolean z, C13671s2 s2Var) {
        this.f30460a = list;
        this.f30461b = r0Var;
        this.f30462c = i;
        this.f30463d = Collections.unmodifiableList(list2);
        this.f30464e = z;
        this.f30465f = s2Var;
    }

    /* renamed from: a */
    public static C13639n0 m3151a() {
        return new C13640a().m3137h();
    }

    /* renamed from: b */
    public List<AbstractC13615k> m3150b() {
        return this.f30463d;
    }

    /* renamed from: c */
    public AbstractC13662r0 m3149c() {
        return this.f30461b;
    }

    /* renamed from: d */
    public List<AbstractC13689w0> m3148d() {
        return Collections.unmodifiableList(this.f30460a);
    }

    /* renamed from: e */
    public C13671s2 m3147e() {
        return this.f30465f;
    }

    /* renamed from: f */
    public int m3146f() {
        return this.f30462c;
    }

    /* renamed from: g */
    public boolean m3145g() {
        return this.f30464e;
    }

    /* renamed from: w.n0$a */
    /* loaded from: classes.dex */
    public static final class C13640a {

        /* renamed from: a */
        private final Set<AbstractC13689w0> f30466a;

        /* renamed from: b */
        private AbstractC13692w1 f30467b;

        /* renamed from: c */
        private int f30468c;

        /* renamed from: d */
        private List<AbstractC13615k> f30469d;

        /* renamed from: e */
        private boolean f30470e;

        /* renamed from: f */
        private C13708z1 f30471f;

        public C13640a() {
            this.f30466a = new HashSet();
            this.f30467b = C13696x1.m3002J();
            this.f30468c = -1;
            this.f30469d = new ArrayList();
            this.f30470e = false;
            this.f30471f = C13708z1.m2990f();
        }

        /* renamed from: j */
        public static C13640a m3135j(AbstractC13697x2<?> x2Var) {
            AbstractC13641b p = x2Var.mo2965p(null);
            if (p != null) {
                C13640a aVar = new C13640a();
                p.mo3128a(x2Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + x2Var.mo303m(x2Var.toString()));
        }

        /* renamed from: k */
        public static C13640a m3134k(C13639n0 n0Var) {
            return new C13640a(n0Var);
        }

        /* renamed from: a */
        public void m3144a(Collection<AbstractC13615k> collection) {
            for (AbstractC13615k kVar : collection) {
                m3142c(kVar);
            }
        }

        /* renamed from: b */
        public void m3143b(C13671s2 s2Var) {
            this.f30471f.m2991e(s2Var);
        }

        /* renamed from: c */
        public void m3142c(AbstractC13615k kVar) {
            if (!this.f30469d.contains(kVar)) {
                this.f30469d.add(kVar);
            }
        }

        /* renamed from: d */
        public <T> void m3141d(AbstractC13662r0.AbstractC13663a<T> aVar, T t) {
            this.f30467b.mo2999u(aVar, t);
        }

        /* renamed from: e */
        public void m3140e(AbstractC13662r0 r0Var) {
            for (AbstractC13662r0.AbstractC13663a<?> aVar : r0Var.mo2975c()) {
                Object a = this.f30467b.mo2977a(aVar, null);
                Object b = r0Var.mo2976b(aVar);
                if (a instanceof AbstractC13684v1) {
                    ((AbstractC13684v1) a).m3055a(((AbstractC13684v1) b).m3053c());
                } else {
                    if (b instanceof AbstractC13684v1) {
                        b = ((AbstractC13684v1) b).clone();
                    }
                    this.f30467b.mo3003E(aVar, r0Var.mo2974d(aVar), b);
                }
            }
        }

        /* renamed from: f */
        public void m3139f(AbstractC13689w0 w0Var) {
            this.f30466a.add(w0Var);
        }

        /* renamed from: g */
        public void m3138g(String str, Object obj) {
            this.f30471f.m2988h(str, obj);
        }

        /* renamed from: h */
        public C13639n0 m3137h() {
            return new C13639n0(new ArrayList(this.f30466a), C13582c2.m3310H(this.f30467b), this.f30468c, this.f30469d, this.f30470e, C13671s2.m3090b(this.f30471f));
        }

        /* renamed from: i */
        public void m3136i() {
            this.f30466a.clear();
        }

        /* renamed from: l */
        public Set<AbstractC13689w0> m3133l() {
            return this.f30466a;
        }

        /* renamed from: m */
        public int m3132m() {
            return this.f30468c;
        }

        /* renamed from: n */
        public void m3131n(AbstractC13662r0 r0Var) {
            this.f30467b = C13696x1.m3001K(r0Var);
        }

        /* renamed from: o */
        public void m3130o(int i) {
            this.f30468c = i;
        }

        /* renamed from: p */
        public void m3129p(boolean z) {
            this.f30470e = z;
        }

        private C13640a(C13639n0 n0Var) {
            HashSet hashSet = new HashSet();
            this.f30466a = hashSet;
            this.f30467b = C13696x1.m3002J();
            this.f30468c = -1;
            this.f30469d = new ArrayList();
            this.f30470e = false;
            this.f30471f = C13708z1.m2990f();
            hashSet.addAll(n0Var.f30460a);
            this.f30467b = C13696x1.m3001K(n0Var.f30461b);
            this.f30468c = n0Var.f30462c;
            this.f30469d.addAll(n0Var.m3150b());
            this.f30470e = n0Var.m3145g();
            this.f30471f = C13708z1.m2989g(n0Var.m3147e());
        }
    }
}
