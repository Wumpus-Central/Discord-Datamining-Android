package p203l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l.b */
/* loaded from: classes.dex */
public class C10297b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: k */
    C10299c<K, V> f22608k;

    /* renamed from: l */
    private C10299c<K, V> f22609l;

    /* renamed from: m */
    private WeakHashMap<AbstractC10302f<K, V>, Boolean> f22610m = new WeakHashMap<>();

    /* renamed from: n */
    private int f22611n = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l.b$a */
    /* loaded from: classes.dex */
    public static class C10298a<K, V> extends AbstractC10301e<K, V> {
        C10298a(C10299c<K, V> cVar, C10299c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p203l.C10297b.AbstractC10301e
        /* renamed from: c */
        C10299c<K, V> mo13662c(C10299c<K, V> cVar) {
            return cVar.f22615n;
        }

        @Override // p203l.C10297b.AbstractC10301e
        /* renamed from: d */
        C10299c<K, V> mo13661d(C10299c<K, V> cVar) {
            return cVar.f22614m;
        }
    }

    /* renamed from: l.b$b */
    /* loaded from: classes.dex */
    private static class C0320b<K, V> extends AbstractC10301e<K, V> {
        C0320b(C10299c<K, V> cVar, C10299c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p203l.C10297b.AbstractC10301e
        /* renamed from: c */
        C10299c<K, V> mo13662c(C10299c<K, V> cVar) {
            return cVar.f22614m;
        }

        @Override // p203l.C10297b.AbstractC10301e
        /* renamed from: d */
        C10299c<K, V> mo13661d(C10299c<K, V> cVar) {
            return cVar.f22615n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l.b$c */
    /* loaded from: classes.dex */
    public static class C10299c<K, V> implements Map.Entry<K, V> {

        /* renamed from: k */
        final K f22612k;

        /* renamed from: l */
        final V f22613l;

        /* renamed from: m */
        C10299c<K, V> f22614m;

        /* renamed from: n */
        C10299c<K, V> f22615n;

        C10299c(K k, V v) {
            this.f22612k = k;
            this.f22613l = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C10299c)) {
                return false;
            }
            C10299c cVar = (C10299c) obj;
            if (!this.f22612k.equals(cVar.f22612k) || !this.f22613l.equals(cVar.f22613l)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f22612k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f22613l;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f22612k.hashCode() ^ this.f22613l.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f22612k + "=" + this.f22613l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l.b$d */
    /* loaded from: classes.dex */
    public class C10300d implements Iterator<Map.Entry<K, V>>, AbstractC10302f<K, V> {

        /* renamed from: k */
        private C10299c<K, V> f22616k;

        /* renamed from: l */
        private boolean f22617l = true;

        C10300d() {
        }

        @Override // p203l.C10297b.AbstractC10302f
        /* renamed from: b */
        public void mo13658b(C10299c<K, V> cVar) {
            boolean z;
            C10299c<K, V> cVar2 = this.f22616k;
            if (cVar == cVar2) {
                C10299c<K, V> cVar3 = cVar2.f22615n;
                this.f22616k = cVar3;
                if (cVar3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f22617l = z;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            C10299c<K, V> cVar;
            if (this.f22617l) {
                this.f22617l = false;
                this.f22616k = C10297b.this.f22608k;
            } else {
                C10299c<K, V> cVar2 = this.f22616k;
                if (cVar2 != null) {
                    cVar = cVar2.f22614m;
                } else {
                    cVar = null;
                }
                this.f22616k = cVar;
            }
            return this.f22616k;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f22617l) {
                C10299c<K, V> cVar = this.f22616k;
                if (cVar == null || cVar.f22614m == null) {
                    return false;
                }
                return true;
            } else if (C10297b.this.f22608k != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: l.b$e */
    /* loaded from: classes.dex */
    private static abstract class AbstractC10301e<K, V> implements Iterator<Map.Entry<K, V>>, AbstractC10302f<K, V> {

        /* renamed from: k */
        C10299c<K, V> f22619k;

        /* renamed from: l */
        C10299c<K, V> f22620l;

        AbstractC10301e(C10299c<K, V> cVar, C10299c<K, V> cVar2) {
            this.f22619k = cVar2;
            this.f22620l = cVar;
        }

        /* renamed from: f */
        private C10299c<K, V> m13659f() {
            C10299c<K, V> cVar = this.f22620l;
            C10299c<K, V> cVar2 = this.f22619k;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo13661d(cVar);
        }

        @Override // p203l.C10297b.AbstractC10302f
        /* renamed from: b */
        public void mo13658b(C10299c<K, V> cVar) {
            if (this.f22619k == cVar && cVar == this.f22620l) {
                this.f22620l = null;
                this.f22619k = null;
            }
            C10299c<K, V> cVar2 = this.f22619k;
            if (cVar2 == cVar) {
                this.f22619k = mo13662c(cVar2);
            }
            if (this.f22620l == cVar) {
                this.f22620l = m13659f();
            }
        }

        /* renamed from: c */
        abstract C10299c<K, V> mo13662c(C10299c<K, V> cVar);

        /* renamed from: d */
        abstract C10299c<K, V> mo13661d(C10299c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            C10299c<K, V> cVar = this.f22620l;
            this.f22620l = m13659f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22620l != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l.b$f */
    /* loaded from: classes.dex */
    public interface AbstractC10302f<K, V> {
        /* renamed from: b */
        void mo13658b(C10299c<K, V> cVar);
    }

    /* renamed from: a */
    public Map.Entry<K, V> m13670a() {
        return this.f22608k;
    }

    /* renamed from: b */
    protected C10299c<K, V> mo13669b(K k) {
        C10299c<K, V> cVar = this.f22608k;
        while (cVar != null && !cVar.f22612k.equals(k)) {
            cVar = cVar.f22614m;
        }
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0320b bVar = new C0320b(this.f22609l, this.f22608k);
        this.f22610m.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: e */
    public C10297b<K, V>.C10300d m13668e() {
        C10297b<K, V>.C10300d dVar = new C10300d();
        this.f22610m.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10297b)) {
            return false;
        }
        C10297b bVar = (C10297b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Map.Entry<K, V> m13667f() {
        return this.f22609l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public C10299c<K, V> m13666g(K k, V v) {
        C10299c<K, V> cVar = new C10299c<>(k, v);
        this.f22611n++;
        C10299c<K, V> cVar2 = this.f22609l;
        if (cVar2 == null) {
            this.f22608k = cVar;
            this.f22609l = cVar;
            return cVar;
        }
        cVar2.f22614m = cVar;
        cVar.f22615n = cVar2;
        this.f22609l = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public V mo13665i(K k, V v) {
        C10299c<K, V> b = mo13669b(k);
        if (b != null) {
            return b.f22613l;
        }
        m13666g(k, v);
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C10298a aVar = new C10298a(this.f22608k, this.f22609l);
        this.f22610m.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: j */
    public V mo13664j(K k) {
        C10299c<K, V> b = mo13669b(k);
        if (b == null) {
            return null;
        }
        this.f22611n--;
        if (!this.f22610m.isEmpty()) {
            for (AbstractC10302f<K, V> fVar : this.f22610m.keySet()) {
                fVar.mo13658b(b);
            }
        }
        C10299c<K, V> cVar = b.f22615n;
        if (cVar != null) {
            cVar.f22614m = b.f22614m;
        } else {
            this.f22608k = b.f22614m;
        }
        C10299c<K, V> cVar2 = b.f22614m;
        if (cVar2 != null) {
            cVar2.f22615n = cVar;
        } else {
            this.f22609l = cVar;
        }
        b.f22614m = null;
        b.f22615n = null;
        return b.f22613l;
    }

    public int size() {
        return this.f22611n;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
