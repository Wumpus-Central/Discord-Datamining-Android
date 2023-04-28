package p177jc;

import android.util.Log;
import androidx.camera.view.C2062h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import lc.AbstractC10396a;
import p177jc.C9540n;
import p300qc.AbstractC12105c;
import p300qc.AbstractC12106d;
import tc.AbstractC13053b;

/* renamed from: jc.n */
/* loaded from: classes3.dex */
public class C9540n extends AbstractC9517a implements AbstractC10396a {

    /* renamed from: g */
    private static final AbstractC13053b<Set<Object>> f21141g = new AbstractC13053b() { // from class: jc.k
        @Override // tc.AbstractC13053b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    private final Map<C9523d<?>, AbstractC13053b<?>> f21142a;

    /* renamed from: b */
    private final Map<Class<?>, AbstractC13053b<?>> f21143b;

    /* renamed from: c */
    private final Map<Class<?>, C9555x<?>> f21144c;

    /* renamed from: d */
    private final List<AbstractC13053b<AbstractC9535i>> f21145d;

    /* renamed from: e */
    private final C9552u f21146e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f21147f;

    /* renamed from: jc.n$b */
    /* loaded from: classes3.dex */
    public static final class C9542b {

        /* renamed from: a */
        private final Executor f21148a;

        /* renamed from: b */
        private final List<AbstractC13053b<AbstractC9535i>> f21149b = new ArrayList();

        /* renamed from: c */
        private final List<C9523d<?>> f21150c = new ArrayList();

        C9542b(Executor executor) {
            this.f21148a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ AbstractC9535i m16038f(AbstractC9535i iVar) {
            return iVar;
        }

        /* renamed from: b */
        public C9542b m16042b(C9523d<?> dVar) {
            this.f21150c.add(dVar);
            return this;
        }

        /* renamed from: c */
        public C9542b m16041c(final AbstractC9535i iVar) {
            this.f21149b.add(new AbstractC13053b() { // from class: jc.o
                @Override // tc.AbstractC13053b
                public final Object get() {
                    AbstractC9535i f;
                    f = C9540n.C9542b.m16038f(AbstractC9535i.this);
                    return f;
                }
            });
            return this;
        }

        /* renamed from: d */
        public C9542b m16040d(Collection<AbstractC13053b<AbstractC9535i>> collection) {
            this.f21149b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C9540n m16039e() {
            return new C9540n(this.f21148a, this.f21149b, this.f21150c);
        }
    }

    /* renamed from: h */
    public static C9542b m16055h(Executor executor) {
        return new C9542b(executor);
    }

    /* renamed from: i */
    private void m16054i(List<C9523d<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<AbstractC13053b<AbstractC9535i>> it = this.f21145d.iterator();
            while (it.hasNext()) {
                try {
                    AbstractC9535i iVar = it.next().get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it.remove();
                    }
                } catch (C9553v e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f21142a.isEmpty()) {
                C9544p.m16037a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f21142a.keySet());
                arrayList2.addAll(list);
                C9544p.m16037a(arrayList2);
            }
            for (final C9523d<?> dVar : list) {
                this.f21142a.put(dVar, new C9554w(new AbstractC13053b() { // from class: jc.j
                    @Override // tc.AbstractC13053b
                    public final Object get() {
                        Object m;
                        m = C9540n.this.m16050m(dVar);
                        return m;
                    }
                }));
            }
            arrayList.addAll(m16045r(list));
            arrayList.addAll(m16044s());
            m16046q();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        m16047p();
    }

    /* renamed from: j */
    private void m16053j(Map<C9523d<?>, AbstractC13053b<?>> map, boolean z) {
        for (Map.Entry<C9523d<?>, AbstractC13053b<?>> entry : map.entrySet()) {
            C9523d<?> key = entry.getKey();
            AbstractC13053b<?> value = entry.getValue();
            if (key.m16084k() || (key.m16083l() && z)) {
                value.get();
            }
        }
        this.f21146e.m16014c();
    }

    /* renamed from: l */
    private static <T> List<T> m16051l(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object m16050m(C9523d dVar) {
        return dVar.m16089f().mo4207a(new C9526d0(dVar, this));
    }

    /* renamed from: p */
    private void m16047p() {
        Boolean bool = this.f21147f.get();
        if (bool != null) {
            m16053j(this.f21142a, bool.booleanValue());
        }
    }

    /* renamed from: q */
    private void m16046q() {
        for (C9523d<?> dVar : this.f21142a.keySet()) {
            for (C9548q qVar : dVar.m16090e()) {
                if (qVar.m16021f() && !this.f21144c.containsKey(qVar.m16025b())) {
                    this.f21144c.put(qVar.m16025b(), C9555x.m16008b(Collections.emptySet()));
                } else if (this.f21143b.containsKey(qVar.m16025b())) {
                    continue;
                } else if (qVar.m16022e()) {
                    throw new C9556y(String.format("Unsatisfied dependency for component %s: %s", dVar, qVar.m16025b()));
                } else if (!qVar.m16021f()) {
                    this.f21143b.put(qVar.m16025b(), C9520b0.m16102c());
                }
            }
        }
    }

    /* renamed from: r */
    private List<Runnable> m16045r(List<C9523d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C9523d<?> dVar : list) {
            if (dVar.m16082m()) {
                final AbstractC13053b<?> bVar = this.f21142a.get(dVar);
                for (Class<? super Object> cls : dVar.m16088g()) {
                    if (!this.f21143b.containsKey(cls)) {
                        this.f21143b.put(cls, bVar);
                    } else {
                        final C9520b0 b0Var = (C9520b0) this.f21143b.get(cls);
                        arrayList.add(new Runnable() { // from class: jc.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                C9520b0.this.m16099f(bVar);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    private List<Runnable> m16044s() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C9523d<?>, AbstractC13053b<?>> entry : this.f21142a.entrySet()) {
            C9523d<?> key = entry.getKey();
            if (!key.m16082m()) {
                AbstractC13053b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.m16088g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f21144c.containsKey(entry2.getKey())) {
                this.f21144c.put((Class) entry2.getKey(), C9555x.m16008b((Collection) entry2.getValue()));
            } else {
                final C9555x<?> xVar = this.f21144c.get(entry2.getKey());
                for (final AbstractC13053b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: jc.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9555x.this.m16009a(bVar);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // p177jc.AbstractC9517a, p177jc.AbstractC9528e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo16062a(Class cls) {
        return super.mo16062a(cls);
    }

    @Override // p177jc.AbstractC9528e
    /* renamed from: b */
    public synchronized <T> AbstractC13053b<Set<T>> mo16061b(Class<T> cls) {
        C9555x<?> xVar = this.f21144c.get(cls);
        if (xVar != null) {
            return xVar;
        }
        return (AbstractC13053b<Set<T>>) f21141g;
    }

    @Override // p177jc.AbstractC9517a, p177jc.AbstractC9528e
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Set mo16060c(Class cls) {
        return super.mo16060c(cls);
    }

    @Override // p177jc.AbstractC9528e
    /* renamed from: d */
    public synchronized <T> AbstractC13053b<T> mo16059d(Class<T> cls) {
        C9522c0.m16096c(cls, "Null interface requested.");
        return (AbstractC13053b<T>) this.f21143b.get(cls);
    }

    /* renamed from: k */
    public void m16052k(boolean z) {
        HashMap hashMap;
        if (C2062h.m39137a(this.f21147f, null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f21142a);
            }
            m16053j(hashMap, z);
        }
    }

    private C9540n(Executor executor, Iterable<AbstractC13053b<AbstractC9535i>> iterable, Collection<C9523d<?>> collection) {
        this.f21142a = new HashMap();
        this.f21143b = new HashMap();
        this.f21144c = new HashMap();
        this.f21147f = new AtomicReference<>();
        C9552u uVar = new C9552u(executor);
        this.f21146e = uVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C9523d.m16079p(uVar, C9552u.class, AbstractC12106d.class, AbstractC12105c.class));
        arrayList.add(C9523d.m16079p(this, AbstractC10396a.class, new Class[0]));
        for (C9523d<?> dVar : collection) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        this.f21145d = m16051l(iterable);
        m16054i(arrayList);
    }
}
