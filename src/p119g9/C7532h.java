package p119g9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: g9.h */
/* loaded from: classes5.dex */
public final class C7532h<E> implements Iterable<E> {

    /* renamed from: k */
    private final Object f16321k = new Object();

    /* renamed from: l */
    private final Map<E, Integer> f16322l = new HashMap();

    /* renamed from: m */
    private Set<E> f16323m = Collections.emptySet();

    /* renamed from: n */
    private List<E> f16324n = Collections.emptyList();

    /* renamed from: a */
    public void m22308a(E e) {
        synchronized (this.f16321k) {
            ArrayList arrayList = new ArrayList(this.f16324n);
            arrayList.add(e);
            this.f16324n = Collections.unmodifiableList(arrayList);
            Integer num = this.f16322l.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f16323m);
                hashSet.add(e);
                this.f16323m = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f16322l;
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            map.put(e, Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public void m22307b(E e) {
        synchronized (this.f16321k) {
            Integer num = this.f16322l.get(e);
            if (num != null) {
                ArrayList arrayList = new ArrayList(this.f16324n);
                arrayList.remove(e);
                this.f16324n = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f16322l.remove(e);
                    HashSet hashSet = new HashSet(this.f16323m);
                    hashSet.remove(e);
                    this.f16323m = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f16322l.put(e, Integer.valueOf(num.intValue() - 1));
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f16321k) {
            it = this.f16324n.iterator();
        }
        return it;
    }

    /* renamed from: n */
    public Set<E> m22306n() {
        Set<E> set;
        synchronized (this.f16321k) {
            set = this.f16323m;
        }
        return set;
    }
}
