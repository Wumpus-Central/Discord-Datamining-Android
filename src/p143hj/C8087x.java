package p143hj;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: hj.x */
/* loaded from: classes8.dex */
public class C8087x<T> implements AbstractC8084u<T> {

    /* renamed from: p */
    private static final List<C8089b> f17466p = new CopyOnWriteArrayList();

    /* renamed from: q */
    private static final ReferenceQueue<C8087x<?>> f17467q = new ReferenceQueue<>();

    /* renamed from: k */
    private final Class<T> f17468k;

    /* renamed from: l */
    private final AbstractC8084u<T> f17469l;

    /* renamed from: m */
    private final Map<AbstractC8079p<?>, AbstractC8091z<T, ?>> f17470m;

    /* renamed from: n */
    private final List<AbstractC8082s> f17471n;

    /* renamed from: o */
    private final Map<AbstractC8079p<?>, AbstractC8047c0<T>> f17472o;

    /* renamed from: hj.x$a */
    /* loaded from: classes8.dex */
    public static class C8088a<T extends AbstractC8080q<T>> {

        /* renamed from: a */
        final Class<T> f17473a;

        /* renamed from: b */
        final boolean f17474b;

        /* renamed from: c */
        final AbstractC8084u<T> f17475c;

        /* renamed from: d */
        final Map<AbstractC8079p<?>, AbstractC8091z<T, ?>> f17476d;

        /* renamed from: e */
        final List<AbstractC8082s> f17477e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C8088a(Class<T> cls, AbstractC8084u<T> uVar) {
            if (uVar != null) {
                this.f17473a = cls;
                this.f17474b = cls.getName().startsWith("net.time4j.");
                this.f17475c = uVar;
                this.f17476d = new HashMap();
                this.f17477e = new ArrayList();
                return;
            }
            throw new NullPointerException("Missing chronological merger.");
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m20640c(p143hj.AbstractC8079p<?> r5) {
            /*
                r4 = this;
                boolean r0 = r4.f17474b
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                if (r5 == 0) goto L_0x004a
                java.lang.String r0 = r5.name()
                java.util.Map<hj.p<?>, hj.z<T extends hj.q<T>, ?>> r1 = r4.f17476d
                java.util.Set r1 = r1.keySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x0015:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0049
                java.lang.Object r2 = r1.next()
                hj.p r2 = (p143hj.AbstractC8079p) r2
                boolean r3 = r2.equals(r5)
                if (r3 != 0) goto L_0x0032
                java.lang.String r2 = r2.name()
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0032
                goto L_0x0015
            L_0x0032:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Element duplicate found: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r5.<init>(r0)
                throw r5
            L_0x0049:
                return
            L_0x004a:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r0 = "Static initialization problem: Check if given element statically refer to any chronology causing premature class loading."
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p143hj.C8087x.C8088a.m20640c(hj.p):void");
        }

        /* renamed from: a */
        public <V> C8088a<T> m20642a(AbstractC8079p<V> pVar, AbstractC8091z<T, V> zVar) {
            m20640c(pVar);
            this.f17476d.put(pVar, zVar);
            return this;
        }

        /* renamed from: b */
        public C8088a<T> m20641b(AbstractC8082s sVar) {
            if (sVar != null) {
                if (!this.f17477e.contains(sVar)) {
                    this.f17477e.add(sVar);
                }
                return this;
            }
            throw new NullPointerException("Missing chronological extension.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hj.x$b */
    /* loaded from: classes8.dex */
    public static class C8089b extends WeakReference<C8087x<?>> {

        /* renamed from: a */
        private final String f17478a;

        C8089b(C8087x<?> xVar, ReferenceQueue<C8087x<?>> referenceQueue) {
            super(xVar, referenceQueue);
            this.f17478a = ((C8087x) xVar).f17468k.getName();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8087x(Class<T> cls, AbstractC8084u<T> uVar, Map<AbstractC8079p<?>, AbstractC8091z<T, ?>> map, List<AbstractC8082s> list) {
        if (cls == null) {
            throw new NullPointerException("Missing chronological type.");
        } else if (uVar != null) {
            this.f17468k = cls;
            this.f17469l = uVar;
            Map<AbstractC8079p<?>, AbstractC8091z<T, ?>> unmodifiableMap = Collections.unmodifiableMap(map);
            this.f17470m = unmodifiableMap;
            this.f17471n = Collections.unmodifiableList(list);
            HashMap hashMap = new HashMap();
            for (AbstractC8079p<?> pVar : unmodifiableMap.keySet()) {
                if (pVar.getType() == Integer.class) {
                    AbstractC8091z<T, ?> zVar = this.f17470m.get(pVar);
                    if (zVar instanceof AbstractC8047c0) {
                        hashMap.put(pVar, (AbstractC8047c0) zVar);
                    }
                }
            }
            this.f17472o = Collections.unmodifiableMap(hashMap);
        } else {
            throw new NullPointerException("Missing chronological merger.");
        }
    }

    /* renamed from: E */
    public static <T> C8087x<T> m20655E(Class<T> cls) {
        C8087x<?> xVar;
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            Iterator<C8089b> it = f17466p.iterator();
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    xVar = null;
                    break;
                }
                xVar = it.next().get();
                if (xVar == null) {
                    z = true;
                } else if (xVar.m20648q() == cls) {
                    break;
                }
            }
            if (z) {
                m20654F();
            }
            return (C8087x) m20651m(xVar);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: F */
    private static void m20654F() {
        while (true) {
            C8089b bVar = (C8089b) f17467q.poll();
            if (bVar != null) {
                Iterator<C8089b> it = f17466p.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C8089b next = it.next();
                        if (next.f17478a.equals(bVar.f17478a)) {
                            f17466p.remove(next);
                            break;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static void m20653G(C8087x<?> xVar) {
        f17466p.add(new C8089b(xVar, f17467q));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    private static <T> T m20651m(Object obj) {
        return obj;
    }

    /* renamed from: s */
    private AbstractC8091z<T, ?> m20647s(AbstractC8079p<?> pVar, boolean z) {
        String str = null;
        if (!(pVar instanceof AbstractC8050e) || !AbstractC8080q.class.isAssignableFrom(m20648q())) {
            return null;
        }
        AbstractC8050e eVar = (AbstractC8050e) AbstractC8050e.class.cast(pVar);
        if (z) {
            str = eVar.mo20686w(this);
        }
        if (str == null) {
            return (AbstractC8091z) m20651m(eVar.mo11057q((C8087x) m20651m(this)));
        }
        throw new C8051e0(str);
    }

    /* renamed from: A */
    public boolean m20657A(AbstractC8079p<?> pVar) {
        return pVar != null && this.f17470m.containsKey(pVar);
    }

    /* renamed from: D */
    public boolean mo20656D(AbstractC8079p<?> pVar) {
        if (pVar == null) {
            return false;
        }
        if (m20657A(pVar) || m20647s(pVar, false) != null) {
            return true;
        }
        return false;
    }

    @Override // p143hj.AbstractC8084u
    /* renamed from: b */
    public AbstractC8053f0 mo11620b() {
        return this.f17469l.mo11620b();
    }

    @Override // p143hj.AbstractC8084u
    /* renamed from: c */
    public C8087x<?> mo11619c() {
        return this.f17469l.mo11619c();
    }

    @Override // p143hj.AbstractC8084u
    /* renamed from: d */
    public int mo11618d() {
        return this.f17469l.mo11618d();
    }

    @Override // p143hj.AbstractC8084u
    /* renamed from: g */
    public String mo11616g(AbstractC8090y yVar, Locale locale) {
        return this.f17469l.mo11616g(yVar, locale);
    }

    @Override // p143hj.AbstractC8084u
    /* renamed from: h */
    public AbstractC8077o mo11615h(T t, AbstractC8048d dVar) {
        return this.f17469l.mo11615h(t, dVar);
    }

    @Override // p143hj.AbstractC8084u
    /* renamed from: k */
    public T mo11614k(AbstractC8080q<?> qVar, AbstractC8048d dVar, boolean z, boolean z2) {
        return this.f17469l.mo11614k(qVar, dVar, z, z2);
    }

    /* renamed from: n */
    public AbstractC8068k<T> mo20650n() {
        throw new C8081r("Calendar system is not available.");
    }

    /* renamed from: o */
    public AbstractC8068k<T> mo20649o(String str) {
        throw new C8081r("Calendar variant is not available: " + str);
    }

    /* renamed from: q */
    public Class<T> m20648q() {
        return this.f17468k;
    }

    /* renamed from: v */
    public List<AbstractC8082s> m20646v() {
        return this.f17471n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public AbstractC8047c0<T> m20645w(AbstractC8079p<Integer> pVar) {
        return this.f17472o.get(pVar);
    }

    /* renamed from: x */
    public Set<AbstractC8079p<?>> m20644x() {
        return this.f17470m.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public <V> AbstractC8091z<T, V> m20643y(AbstractC8079p<V> pVar) {
        if (pVar != null) {
            AbstractC8091z<T, ?> zVar = this.f17470m.get(pVar);
            if (zVar != null || (zVar = m20647s(pVar, true)) != null) {
                return (AbstractC8091z) m20651m(zVar);
            }
            throw new C8051e0((C8087x<?>) this, (AbstractC8079p<?>) pVar);
        }
        throw new NullPointerException("Missing chronological element.");
    }
}
