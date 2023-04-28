package p163j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.j */
/* loaded from: classes2.dex */
public final class C0514j {

    /* renamed from: c */
    private static final C0514j f20430c = new C0514j();

    /* renamed from: a */
    private final boolean f20431a;

    /* renamed from: b */
    private final double f20432b;

    private C0514j() {
        this.f20431a = false;
        this.f20432b = Double.NaN;
    }

    private C0514j(double d) {
        this.f20431a = true;
        this.f20432b = d;
    }

    /* renamed from: a */
    public static C0514j m16501a() {
        return f20430c;
    }

    /* renamed from: d */
    public static C0514j m16498d(double d) {
        return new C0514j(d);
    }

    /* renamed from: b */
    public final double m16500b() {
        if (this.f20431a) {
            return this.f20432b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m16499c() {
        return this.f20431a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0514j)) {
            return false;
        }
        C0514j jVar = (C0514j) obj;
        boolean z = this.f20431a;
        if (!z || !jVar.f20431a) {
            if (z == jVar.f20431a) {
                return true;
            }
        } else if (Double.compare(this.f20432b, jVar.f20432b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f20431a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f20432b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return this.f20431a ? String.format("OptionalDouble[%s]", Double.valueOf(this.f20432b)) : "OptionalDouble.empty";
    }
}
