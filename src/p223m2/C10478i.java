package p223m2;

import androidx.core.util.C2515e;

/* renamed from: m2.i */
/* loaded from: classes.dex */
public class C10478i<T> {

    /* renamed from: a */
    T f23140a;

    /* renamed from: b */
    T f23141b;

    /* renamed from: a */
    private static boolean m13083a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void m13082b(T t, T t2) {
        this.f23140a = t;
        this.f23141b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2515e)) {
            return false;
        }
        C2515e eVar = (C2515e) obj;
        if (!m13083a(eVar.f3485a, this.f23140a) || !m13083a(eVar.f3486b, this.f23141b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.f23140a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f23141b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f23140a + " " + this.f23141b + "}";
    }
}
