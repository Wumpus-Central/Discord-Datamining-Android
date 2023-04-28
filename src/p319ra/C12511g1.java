package p319ra;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: ra.g1 */
/* loaded from: classes3.dex */
public final class C12511g1 {

    /* renamed from: a */
    private final Map f28164a = new WeakHashMap();

    /* renamed from: a */
    public final Object m6602a(Object obj) {
        WeakReference weakReference = (WeakReference) this.f28164a.get(obj);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: b */
    public final void m6601b() {
        this.f28164a.clear();
    }

    /* renamed from: c */
    public final void m6600c(Object obj, Object obj2) {
        this.f28164a.put(obj, new WeakReference(obj2));
    }

    /* renamed from: d */
    public final void m6599d(Object obj) {
        this.f28164a.remove(obj);
    }

    /* renamed from: e */
    public final boolean m6598e(Object obj) {
        return m6602a(obj) != null;
    }
}
