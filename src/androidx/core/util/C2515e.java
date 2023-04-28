package androidx.core.util;

/* renamed from: androidx.core.util.e */
/* loaded from: classes.dex */
public class C2515e<F, S> {

    /* renamed from: a */
    public final F f3485a;

    /* renamed from: b */
    public final S f3486b;

    public C2515e(F f, S s) {
        this.f3485a = f;
        this.f3486b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2515e)) {
            return false;
        }
        C2515e eVar = (C2515e) obj;
        if (!C2513d.m37601a(eVar.f3485a, this.f3485a) || !C2513d.m37601a(eVar.f3486b, this.f3486b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.f3485a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f3486b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f3485a + " " + this.f3486b + "}";
    }
}
