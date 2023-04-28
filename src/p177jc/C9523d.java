package p177jc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jc.d */
/* loaded from: classes3.dex */
public final class C9523d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f21110a;

    /* renamed from: b */
    private final Set<C9548q> f21111b;

    /* renamed from: c */
    private final int f21112c;

    /* renamed from: d */
    private final int f21113d;

    /* renamed from: e */
    private final AbstractC9534h<T> f21114e;

    /* renamed from: f */
    private final Set<Class<?>> f21115f;

    /* renamed from: jc.d$b */
    /* loaded from: classes3.dex */
    public static class C9525b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f21116a;

        /* renamed from: b */
        private final Set<C9548q> f21117b;

        /* renamed from: c */
        private int f21118c;

        /* renamed from: d */
        private int f21119d;

        /* renamed from: e */
        private AbstractC9534h<T> f21120e;

        /* renamed from: f */
        private Set<Class<?>> f21121f;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public C9525b<T> m16073f() {
            this.f21119d = 1;
            return this;
        }

        /* renamed from: g */
        private C9525b<T> m16072g(int i) {
            boolean z;
            if (this.f21118c == 0) {
                z = true;
            } else {
                z = false;
            }
            C9522c0.m16095d(z, "Instantiation type has already been set.");
            this.f21118c = i;
            return this;
        }

        /* renamed from: h */
        private void m16071h(Class<?> cls) {
            C9522c0.m16098a(!this.f21116a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C9525b<T> m16077b(C9548q qVar) {
            C9522c0.m16096c(qVar, "Null dependency");
            m16071h(qVar.m16025b());
            this.f21117b.add(qVar);
            return this;
        }

        /* renamed from: c */
        public C9525b<T> m16076c() {
            return m16072g(1);
        }

        /* renamed from: d */
        public C9523d<T> m16075d() {
            boolean z;
            if (this.f21120e != null) {
                z = true;
            } else {
                z = false;
            }
            C9522c0.m16095d(z, "Missing required property: factory.");
            return new C9523d<>(new HashSet(this.f21116a), new HashSet(this.f21117b), this.f21118c, this.f21119d, this.f21120e, this.f21121f);
        }

        /* renamed from: e */
        public C9525b<T> m16074e(AbstractC9534h<T> hVar) {
            this.f21120e = (AbstractC9534h) C9522c0.m16096c(hVar, "Null factory");
            return this;
        }

        @SafeVarargs
        private C9525b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f21116a = hashSet;
            this.f21117b = new HashSet();
            this.f21118c = 0;
            this.f21119d = 0;
            this.f21121f = new HashSet();
            C9522c0.m16096c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C9522c0.m16096c(cls2, "Null interface");
            }
            Collections.addAll(this.f21116a, clsArr);
        }
    }

    /* renamed from: c */
    public static <T> C9525b<T> m16092c(Class<T> cls) {
        return new C9525b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> C9525b<T> m16091d(Class<T> cls, Class<? super T>... clsArr) {
        return new C9525b<>(cls, clsArr);
    }

    /* renamed from: i */
    public static <T> C9523d<T> m16086i(final T t, Class<T> cls) {
        return m16085j(cls).m16074e(new AbstractC9534h() { // from class: jc.c
            @Override // p177jc.AbstractC9534h
            /* renamed from: a */
            public final Object mo4207a(AbstractC9528e eVar) {
                Object n;
                n = C9523d.m16081n(t, eVar);
                return n;
            }
        }).m16075d();
    }

    /* renamed from: j */
    public static <T> C9525b<T> m16085j(Class<T> cls) {
        return m16092c(cls).m16073f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ Object m16081n(Object obj, AbstractC9528e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Object m16080o(Object obj, AbstractC9528e eVar) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: p */
    public static <T> C9523d<T> m16079p(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return m16091d(cls, clsArr).m16074e(new AbstractC9534h() { // from class: jc.b
            @Override // p177jc.AbstractC9534h
            /* renamed from: a */
            public final Object mo4207a(AbstractC9528e eVar) {
                Object o;
                o = C9523d.m16080o(t, eVar);
                return o;
            }
        }).m16075d();
    }

    /* renamed from: e */
    public Set<C9548q> m16090e() {
        return this.f21111b;
    }

    /* renamed from: f */
    public AbstractC9534h<T> m16089f() {
        return this.f21114e;
    }

    /* renamed from: g */
    public Set<Class<? super T>> m16088g() {
        return this.f21110a;
    }

    /* renamed from: h */
    public Set<Class<?>> m16087h() {
        return this.f21115f;
    }

    /* renamed from: k */
    public boolean m16084k() {
        return this.f21112c == 1;
    }

    /* renamed from: l */
    public boolean m16083l() {
        return this.f21112c == 2;
    }

    /* renamed from: m */
    public boolean m16082m() {
        return this.f21113d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f21110a.toArray()) + ">{" + this.f21112c + ", type=" + this.f21113d + ", deps=" + Arrays.toString(this.f21111b.toArray()) + "}";
    }

    private C9523d(Set<Class<? super T>> set, Set<C9548q> set2, int i, int i2, AbstractC9534h<T> hVar, Set<Class<?>> set3) {
        this.f21110a = Collections.unmodifiableSet(set);
        this.f21111b = Collections.unmodifiableSet(set2);
        this.f21112c = i;
        this.f21113d = i2;
        this.f21114e = hVar;
        this.f21115f = Collections.unmodifiableSet(set3);
    }
}
