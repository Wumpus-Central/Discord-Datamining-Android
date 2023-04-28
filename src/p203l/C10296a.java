package p203l;

import java.util.HashMap;
import java.util.Map;
import p203l.C10297b;

/* renamed from: l.a */
/* loaded from: classes.dex */
public class C10296a<K, V> extends C10297b<K, V> {

    /* renamed from: o */
    private HashMap<K, C10297b.C10299c<K, V>> f22607o = new HashMap<>();

    @Override // p203l.C10297b
    /* renamed from: b */
    protected C10297b.C10299c<K, V> mo13669b(K k) {
        return this.f22607o.get(k);
    }

    public boolean contains(K k) {
        return this.f22607o.containsKey(k);
    }

    @Override // p203l.C10297b
    /* renamed from: i */
    public V mo13665i(K k, V v) {
        C10297b.C10299c<K, V> b = mo13669b(k);
        if (b != null) {
            return b.f22613l;
        }
        this.f22607o.put(k, m13666g(k, v));
        return null;
    }

    @Override // p203l.C10297b
    /* renamed from: j */
    public V mo13664j(K k) {
        V v = (V) super.mo13664j(k);
        this.f22607o.remove(k);
        return v;
    }

    /* renamed from: p */
    public Map.Entry<K, V> m13671p(K k) {
        if (contains(k)) {
            return this.f22607o.get(k).f22615n;
        }
        return null;
    }
}
