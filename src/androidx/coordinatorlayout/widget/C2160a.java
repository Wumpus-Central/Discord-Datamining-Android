package androidx.coordinatorlayout.widget;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.AbstractC2516f;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: classes.dex */
public final class C2160a<T> {

    /* renamed from: a */
    private final AbstractC2516f<ArrayList<T>> f3016a = new Pools$SimplePool(10);

    /* renamed from: b */
    private final SimpleArrayMap<T, ArrayList<T>> f3017b = new SimpleArrayMap<>();

    /* renamed from: c */
    private final ArrayList<T> f3018c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f3019d = new HashSet<>();

    /* renamed from: e */
    private void m38660e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> arrayList2 = this.f3017b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m38660e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    private ArrayList<T> m38659f() {
        ArrayList<T> acquire = this.f3016a.acquire();
        if (acquire == null) {
            return new ArrayList<>();
        }
        return acquire;
    }

    /* renamed from: k */
    private void m38654k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3016a.release(arrayList);
    }

    /* renamed from: a */
    public void m38664a(T t, T t2) {
        if (!this.f3017b.containsKey(t) || !this.f3017b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f3017b.get(t);
        if (arrayList == null) {
            arrayList = m38659f();
            this.f3017b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void m38663b(T t) {
        if (!this.f3017b.containsKey(t)) {
            this.f3017b.put(t, null);
        }
    }

    /* renamed from: c */
    public void m38662c() {
        int size = this.f3017b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> n = this.f3017b.m39048n(i);
            if (n != null) {
                m38654k(n);
            }
        }
        this.f3017b.clear();
    }

    /* renamed from: d */
    public boolean m38661d(T t) {
        return this.f3017b.containsKey(t);
    }

    /* renamed from: g */
    public List m38658g(T t) {
        return this.f3017b.get(t);
    }

    /* renamed from: h */
    public List<T> m38657h(T t) {
        int size = this.f3017b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> n = this.f3017b.m39048n(i);
            if (n != null && n.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3017b.m39052j(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> m38656i() {
        this.f3018c.clear();
        this.f3019d.clear();
        int size = this.f3017b.size();
        for (int i = 0; i < size; i++) {
            m38660e(this.f3017b.m39052j(i), this.f3018c, this.f3019d);
        }
        return this.f3018c;
    }

    /* renamed from: j */
    public boolean m38655j(T t) {
        int size = this.f3017b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> n = this.f3017b.m39048n(i);
            if (n != null && n.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
