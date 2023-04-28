package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.v */
/* loaded from: classes8.dex */
public final class C9116v {

    /* renamed from: d */
    private static final Map<String, Class<?>> f19982d;

    /* renamed from: a */
    private final Map<String, Object> f19983a = new HashMap();

    /* renamed from: b */
    private final List<C8804b> f19984b = new ArrayList();

    /* renamed from: c */
    private C8804b f19985c = null;

    static {
        HashMap hashMap = new HashMap();
        f19982d = hashMap;
        hashMap.put("boolean", Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put("long", Long.class);
        hashMap.put("float", Float.class);
        hashMap.put("double", Double.class);
    }

    /* renamed from: g */
    private boolean m16974g(Object obj, Class<?> cls) {
        Class<?> cls2 = f19982d.get(cls.getCanonicalName());
        if (obj == null || !cls.isPrimitive() || cls2 == null || !cls2.isInstance(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m16980a(List<C8804b> list) {
        if (list != null) {
            this.f19984b.addAll(list);
        }
    }

    /* renamed from: b */
    public synchronized void m16979b() {
        Iterator<Map.Entry<String, Object>> it = this.f19983a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            if (next.getKey() == null || !next.getKey().startsWith("sentry:")) {
                it.remove();
            }
        }
    }

    /* renamed from: c */
    public synchronized Object m16978c(String str) {
        return this.f19983a.get(str);
    }

    /* renamed from: d */
    public synchronized <T> T m16977d(String str, Class<T> cls) {
        T t = (T) this.f19983a.get(str);
        if (cls.isInstance(t)) {
            return t;
        }
        if (m16974g(t, cls)) {
            return t;
        }
        return null;
    }

    /* renamed from: e */
    public List<C8804b> m16976e() {
        return new ArrayList(this.f19984b);
    }

    /* renamed from: f */
    public C8804b m16975f() {
        return this.f19985c;
    }

    /* renamed from: h */
    public synchronized void m16973h(String str, Object obj) {
        this.f19983a.put(str, obj);
    }

    /* renamed from: i */
    public void m16972i(C8804b bVar) {
        this.f19985c = bVar;
    }
}
