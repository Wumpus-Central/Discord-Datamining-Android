package p278p5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p394w3.AbstractC13741k;

/* renamed from: p5.h */
/* loaded from: classes7.dex */
public class C11546h<K, V> {

    /* renamed from: a */
    private final AbstractC11570x<V> f25782a;

    /* renamed from: b */
    private final LinkedHashMap<K, V> f25783b = new LinkedHashMap<>();

    /* renamed from: c */
    private int f25784c = 0;

    public C11546h(AbstractC11570x<V> xVar) {
        this.f25782a = xVar;
    }

    /* renamed from: g */
    private int m9403g(V v) {
        if (v == null) {
            return 0;
        }
        return this.f25782a.mo9326a(v);
    }

    /* renamed from: a */
    public synchronized boolean m9409a(K k) {
        return this.f25783b.containsKey(k);
    }

    /* renamed from: b */
    public synchronized V m9408b(K k) {
        return this.f25783b.get(k);
    }

    /* renamed from: c */
    public synchronized int m9407c() {
        return this.f25783b.size();
    }

    /* renamed from: d */
    public synchronized K m9406d() {
        K k;
        if (this.f25783b.isEmpty()) {
            k = null;
        } else {
            k = this.f25783b.keySet().iterator().next();
        }
        return k;
    }

    /* renamed from: e */
    public synchronized ArrayList<Map.Entry<K, V>> m9405e(AbstractC13741k<K> kVar) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f25783b.entrySet().size());
        for (Map.Entry<K, V> entry : this.f25783b.entrySet()) {
            if (kVar == null || kVar.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public synchronized int m9404f() {
        return this.f25784c;
    }

    /* renamed from: h */
    public synchronized V m9402h(K k, V v) {
        V remove;
        remove = this.f25783b.remove(k);
        this.f25784c -= m9403g(remove);
        this.f25783b.put(k, v);
        this.f25784c += m9403g(v);
        return remove;
    }

    /* renamed from: i */
    public synchronized V m9401i(K k) {
        V remove;
        remove = this.f25783b.remove(k);
        this.f25784c -= m9403g(remove);
        return remove;
    }

    /* renamed from: j */
    public synchronized ArrayList<V> m9400j(AbstractC13741k<K> kVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.f25783b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (kVar == null || kVar.apply(next.getKey())) {
                arrayList.add(next.getValue());
                this.f25784c -= m9403g(next.getValue());
                it.remove();
            }
        }
        return arrayList;
    }
}
