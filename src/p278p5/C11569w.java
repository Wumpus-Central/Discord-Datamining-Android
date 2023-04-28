package p278p5;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p380v5.C13434e;
import p394w3.C13740j;
import p414x3.C13925a;
import p455z3.AbstractC14535g;

/* renamed from: p5.w */
/* loaded from: classes7.dex */
public class C11569w {

    /* renamed from: b */
    private static final Class<?> f25811b = C11569w.class;

    /* renamed from: a */
    private Map<CacheKey, C13434e> f25812a = new HashMap();

    private C11569w() {
    }

    /* renamed from: d */
    public static C11569w m9331d() {
        return new C11569w();
    }

    /* renamed from: e */
    private synchronized void m9330e() {
        C13925a.m2274x(f25811b, "Count = %d", Integer.valueOf(this.f25812a.size()));
    }

    /* renamed from: a */
    public void m9334a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f25812a.values());
            this.f25812a.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C13434e eVar = (C13434e) arrayList.get(i);
            if (eVar != null) {
                eVar.close();
            }
        }
    }

    /* renamed from: b */
    public synchronized boolean m9333b(CacheKey cacheKey) {
        C13740j.m2834g(cacheKey);
        if (!this.f25812a.containsKey(cacheKey)) {
            return false;
        }
        C13434e eVar = this.f25812a.get(cacheKey);
        synchronized (eVar) {
            if (C13434e.m3704j0(eVar)) {
                return true;
            }
            this.f25812a.remove(cacheKey);
            C13925a.m2306F(f25811b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar)), cacheKey.mo256a(), Integer.valueOf(System.identityHashCode(cacheKey)));
            return false;
        }
    }

    /* renamed from: c */
    public synchronized C13434e m9332c(CacheKey cacheKey) {
        C13740j.m2834g(cacheKey);
        C13434e eVar = this.f25812a.get(cacheKey);
        if (eVar != null) {
            synchronized (eVar) {
                if (!C13434e.m3704j0(eVar)) {
                    this.f25812a.remove(cacheKey);
                    C13925a.m2306F(f25811b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar)), cacheKey.mo256a(), Integer.valueOf(System.identityHashCode(cacheKey)));
                    return null;
                }
                eVar = C13434e.m3707g(eVar);
            }
        }
        return eVar;
    }

    /* renamed from: f */
    public synchronized void m9329f(CacheKey cacheKey, C13434e eVar) {
        C13740j.m2834g(cacheKey);
        C13740j.m2839b(Boolean.valueOf(C13434e.m3704j0(eVar)));
        C13434e.m3706h(this.f25812a.put(cacheKey, C13434e.m3707g(eVar)));
        m9330e();
    }

    /* renamed from: g */
    public boolean m9328g(CacheKey cacheKey) {
        C13434e remove;
        C13740j.m2834g(cacheKey);
        synchronized (this) {
            remove = this.f25812a.remove(cacheKey);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.m3708f0();
        } finally {
            remove.close();
        }
    }

    /* renamed from: h */
    public synchronized boolean m9327h(CacheKey cacheKey, C13434e eVar) {
        C13740j.m2834g(cacheKey);
        C13740j.m2834g(eVar);
        C13740j.m2839b(Boolean.valueOf(C13434e.m3704j0(eVar)));
        C13434e eVar2 = this.f25812a.get(cacheKey);
        if (eVar2 == null) {
            return false;
        }
        CloseableReference<AbstractC14535g> l = eVar2.m3703l();
        CloseableReference<AbstractC14535g> l2 = eVar.m3703l();
        if (!(l == null || l2 == null || l.m32039C() != l2.m32039C())) {
            this.f25812a.remove(cacheKey);
            CloseableReference.m32025t(l2);
            CloseableReference.m32025t(l);
            C13434e.m3706h(eVar2);
            m9330e();
            return true;
        }
        CloseableReference.m32025t(l2);
        CloseableReference.m32025t(l);
        C13434e.m3706h(eVar2);
        return false;
    }
}
