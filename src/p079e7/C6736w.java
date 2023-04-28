package p079e7;

import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: e7.w */
/* loaded from: classes7.dex */
public final class C6736w {

    /* renamed from: c */
    public static final C6736w f14367c;

    /* renamed from: d */
    public static final C6736w f14368d = new C6736w(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e */
    public static final C6736w f14369e = new C6736w(Long.MAX_VALUE, 0);

    /* renamed from: f */
    public static final C6736w f14370f = new C6736w(0, Long.MAX_VALUE);

    /* renamed from: g */
    public static final C6736w f14371g;

    /* renamed from: a */
    public final long f14372a;

    /* renamed from: b */
    public final long f14373b;

    static {
        C6736w wVar = new C6736w(0L, 0L);
        f14367c = wVar;
        f14371g = wVar;
    }

    public C6736w(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        C7510a.m22371a(j2 < 0 ? false : z2);
        this.f14372a = j;
        this.f14373b = j2;
    }

    /* renamed from: a */
    public long m24422a(long j, long j2, long j3) {
        boolean z;
        long j4 = this.f14372a;
        if (j4 == 0 && this.f14373b == 0) {
            return j;
        }
        long Q0 = C7557q0.m22182Q0(j, j4, Long.MIN_VALUE);
        long b = C7557q0.m22161b(j, this.f14373b, Long.MAX_VALUE);
        boolean z2 = true;
        if (Q0 > j2 || j2 > b) {
            z = false;
        } else {
            z = true;
        }
        if (Q0 > j3 || j3 > b) {
            z2 = false;
        }
        if (!z || !z2) {
            if (z) {
                return j2;
            }
            if (z2) {
                return j3;
            }
            return Q0;
        } else if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
            return j2;
        } else {
            return j3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6736w.class != obj.getClass()) {
            return false;
        }
        C6736w wVar = (C6736w) obj;
        if (this.f14372a == wVar.f14372a && this.f14373b == wVar.f14373b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f14372a) * 31) + ((int) this.f14373b);
    }
}
