package p163j$.time.temporal;

import java.io.Serializable;
import p163j$.time.C9167b;

/* renamed from: j$.time.temporal.q */
/* loaded from: classes2.dex */
public final class C9229q implements Serializable {

    /* renamed from: a */
    private final long f20244a;

    /* renamed from: b */
    private final long f20245b;

    /* renamed from: c */
    private final long f20246c;

    /* renamed from: d */
    private final long f20247d;

    private C9229q(long j, long j2, long j3, long j4) {
        this.f20244a = j;
        this.f20245b = j2;
        this.f20246c = j3;
        this.f20247d = j4;
    }

    /* renamed from: c */
    private String m16621c(long j, AbstractC9224l lVar) {
        if (lVar != null) {
            return "Invalid value for " + lVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    /* renamed from: i */
    public static C9229q m16615i(long j, long j2) {
        if (j <= j2) {
            return new C9229q(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: j */
    public static C9229q m16614j(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (1 <= j2) {
            return new C9229q(1L, 1L, j, j2);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    /* renamed from: a */
    public final int m16623a(long j, AbstractC9224l lVar) {
        if (m16617g() && m16616h(j)) {
            return (int) j;
        }
        throw new C9167b(m16621c(j, lVar));
    }

    /* renamed from: b */
    public final void m16622b(long j, AbstractC9224l lVar) {
        if (!m16616h(j)) {
            throw new C9167b(m16621c(j, lVar));
        }
    }

    /* renamed from: d */
    public final long m16620d() {
        return this.f20247d;
    }

    /* renamed from: e */
    public final long m16619e() {
        return this.f20244a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9229q)) {
            return false;
        }
        C9229q qVar = (C9229q) obj;
        return this.f20244a == qVar.f20244a && this.f20245b == qVar.f20245b && this.f20246c == qVar.f20246c && this.f20247d == qVar.f20247d;
    }

    /* renamed from: f */
    public final boolean m16618f() {
        return this.f20244a == this.f20245b && this.f20246c == this.f20247d;
    }

    /* renamed from: g */
    public final boolean m16617g() {
        return this.f20244a >= -2147483648L && this.f20247d <= 2147483647L;
    }

    /* renamed from: h */
    public final boolean m16616h(long j) {
        return j >= this.f20244a && j <= this.f20247d;
    }

    public final int hashCode() {
        long j = this.f20245b;
        long j2 = this.f20244a + (j << 16) + (j >> 48);
        long j3 = this.f20246c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.f20247d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) ((j6 >>> 32) ^ j6);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        long j = this.f20244a;
        sb2.append(j);
        long j2 = this.f20245b;
        if (j != j2) {
            sb2.append('/');
            sb2.append(j2);
        }
        sb2.append(" - ");
        long j3 = this.f20246c;
        sb2.append(j3);
        long j4 = this.f20247d;
        if (j3 != j4) {
            sb2.append('/');
            sb2.append(j4);
        }
        return sb2.toString();
    }
}
