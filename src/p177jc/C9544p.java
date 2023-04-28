package p177jc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: jc.p */
/* loaded from: classes3.dex */
class C9544p {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jc.p$b */
    /* loaded from: classes3.dex */
    public static class C9546b {

        /* renamed from: a */
        private final C9523d<?> f21152a;

        /* renamed from: b */
        private final Set<C9546b> f21153b = new HashSet();

        /* renamed from: c */
        private final Set<C9546b> f21154c = new HashSet();

        C9546b(C9523d<?> dVar) {
            this.f21152a = dVar;
        }

        /* renamed from: a */
        void m16034a(C9546b bVar) {
            this.f21153b.add(bVar);
        }

        /* renamed from: b */
        void m16033b(C9546b bVar) {
            this.f21154c.add(bVar);
        }

        /* renamed from: c */
        C9523d<?> m16032c() {
            return this.f21152a;
        }

        /* renamed from: d */
        Set<C9546b> m16031d() {
            return this.f21153b;
        }

        /* renamed from: e */
        boolean m16030e() {
            return this.f21153b.isEmpty();
        }

        /* renamed from: f */
        boolean m16029f() {
            return this.f21154c.isEmpty();
        }

        /* renamed from: g */
        void m16028g(C9546b bVar) {
            this.f21154c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jc.p$c */
    /* loaded from: classes3.dex */
    public static class C9547c {

        /* renamed from: a */
        private final Class<?> f21155a;

        /* renamed from: b */
        private final boolean f21156b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C9547c)) {
                return false;
            }
            C9547c cVar = (C9547c) obj;
            if (!cVar.f21155a.equals(this.f21155a) || cVar.f21156b != this.f21156b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f21155a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f21156b).hashCode();
        }

        private C9547c(Class<?> cls, boolean z) {
            this.f21155a = cls;
            this.f21156b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m16037a(List<C9523d<?>> list) {
        Set<C9546b> c = m16035c(list);
        Set<C9546b> b = m16036b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C9546b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C9546b bVar : next.m16031d()) {
                bVar.m16028g(next);
                if (bVar.m16029f()) {
                    b.add(bVar);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C9546b bVar2 : c) {
                if (!bVar2.m16029f() && !bVar2.m16030e()) {
                    arrayList.add(bVar2.m16032c());
                }
            }
            throw new C9549r(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C9546b> m16036b(Set<C9546b> set) {
        HashSet hashSet = new HashSet();
        for (C9546b bVar : set) {
            if (bVar.m16029f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C9546b> m16035c(List<C9523d<?>> list) {
        Set<C9546b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C9523d<?> dVar : list) {
            C9546b bVar = new C9546b(dVar);
            for (Class<? super Object> cls : dVar.m16088g()) {
                C9547c cVar = new C9547c(cls, !dVar.m16082m());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (set2.isEmpty() || cVar.f21156b) {
                    set2.add(bVar);
                } else {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
            }
        }
        for (Set<C9546b> set3 : hashMap.values()) {
            for (C9546b bVar2 : set3) {
                for (C9548q qVar : bVar2.m16032c().m16090e()) {
                    if (qVar.m16023d() && (set = (Set) hashMap.get(new C9547c(qVar.m16025b(), qVar.m16021f()))) != null) {
                        for (C9546b bVar3 : set) {
                            bVar2.m16034a(bVar3);
                            bVar3.m16033b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
