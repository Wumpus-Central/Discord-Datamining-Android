package p005a4;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import java.util.IdentityHashMap;
import java.util.Map;
import p394w3.C13740j;
import p414x3.C13925a;

/* renamed from: a4.d */
/* loaded from: classes7.dex */
public class C1263d<T> {

    /* renamed from: d */
    private static final Map<Object, Integer> f125d = new IdentityHashMap();

    /* renamed from: a */
    private T f126a;

    /* renamed from: b */
    private int f127b = 1;

    /* renamed from: c */
    private final AbstractC1262c<T> f128c;

    /* renamed from: a4.d$a */
    /* loaded from: classes7.dex */
    public static class C1264a extends RuntimeException {
        public C1264a() {
            super("Null shared reference");
        }
    }

    public C1263d(T t, AbstractC1262c<T> cVar) {
        this.f126a = (T) C13740j.m2834g(t);
        this.f128c = (AbstractC1262c) C13740j.m2834g(cVar);
        m41513a(t);
    }

    /* renamed from: a */
    private static void m41513a(Object obj) {
        if (!CloseableReference.m32024w0() || (!(obj instanceof Bitmap) && !(obj instanceof AbstractC1260a))) {
            Map<Object, Integer> map = f125d;
            synchronized (map) {
                Integer num = map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            }
        }
    }

    /* renamed from: c */
    private synchronized int m41511c() {
        boolean z;
        int i;
        m41509e();
        if (this.f127b > 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        i = this.f127b - 1;
        this.f127b = i;
        return i;
    }

    /* renamed from: e */
    private void m41509e() {
        if (!m41506h(this)) {
            throw new C1264a();
        }
    }

    /* renamed from: h */
    public static boolean m41506h(C1263d<?> dVar) {
        return dVar != null && dVar.m41507g();
    }

    /* renamed from: i */
    private static void m41505i(Object obj) {
        Map<Object, Integer> map = f125d;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                C13925a.m2298N("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                map.remove(obj);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* renamed from: b */
    public synchronized void m41512b() {
        m41509e();
        this.f127b++;
    }

    /* renamed from: d */
    public void m41510d() {
        T t;
        if (m41511c() == 0) {
            synchronized (this) {
                t = this.f126a;
                this.f126a = null;
            }
            if (t != null) {
                this.f128c.release(t);
                m41505i(t);
            }
        }
    }

    /* renamed from: f */
    public synchronized T m41508f() {
        return this.f126a;
    }

    /* renamed from: g */
    public synchronized boolean m41507g() {
        boolean z;
        if (this.f127b > 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
