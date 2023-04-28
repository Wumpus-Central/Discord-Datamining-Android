package p301qd;

/* renamed from: qd.b */
/* loaded from: classes3.dex */
public class C12108b {

    /* renamed from: a */
    private final int f27161a;

    /* renamed from: b */
    private final int f27162b;

    public C12108b(int i, int i2) {
        this.f27161a = i;
        this.f27162b = i2;
    }

    /* renamed from: a */
    public final int m7821a() {
        return this.f27162b;
    }

    /* renamed from: b */
    public final int m7820b() {
        return this.f27161a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12108b)) {
            return false;
        }
        C12108b bVar = (C12108b) obj;
        if (this.f27161a == bVar.f27161a && this.f27162b == bVar.f27162b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27161a ^ this.f27162b;
    }

    public final String toString() {
        return this.f27161a + "(" + this.f27162b + ')';
    }
}
