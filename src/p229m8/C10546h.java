package p229m8;

import android.net.Uri;
import p119g9.C7548n0;

/* renamed from: m8.h */
/* loaded from: classes7.dex */
public final class C10546h {

    /* renamed from: a */
    public final long f23347a;

    /* renamed from: b */
    public final long f23348b;

    /* renamed from: c */
    private final String f23349c;

    /* renamed from: d */
    private int f23350d;

    public C10546h(String str, long j, long j2) {
        this.f23349c = str == null ? "" : str;
        this.f23347a = j;
        this.f23348b = j2;
    }

    /* renamed from: a */
    public C10546h m12848a(C10546h hVar, String str) {
        String c = m12846c(str);
        if (hVar != null && c.equals(hVar.m12846c(str))) {
            long j = this.f23348b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.f23347a;
                if (j3 + j == hVar.f23347a) {
                    long j4 = hVar.f23348b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new C10546h(c, j3, j2);
                }
            }
            long j5 = hVar.f23348b;
            if (j5 != -1) {
                long j6 = hVar.f23347a;
                if (j6 + j5 == this.f23347a) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    return new C10546h(c, j6, j2);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Uri m12847b(String str) {
        return C7548n0.m22233d(str, this.f23349c);
    }

    /* renamed from: c */
    public String m12846c(String str) {
        return C7548n0.m22234c(str, this.f23349c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10546h.class != obj.getClass()) {
            return false;
        }
        C10546h hVar = (C10546h) obj;
        if (this.f23347a == hVar.f23347a && this.f23348b == hVar.f23348b && this.f23349c.equals(hVar.f23349c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f23350d == 0) {
            this.f23350d = ((((527 + ((int) this.f23347a)) * 31) + ((int) this.f23348b)) * 31) + this.f23349c.hashCode();
        }
        return this.f23350d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f23349c + ", start=" + this.f23347a + ", length=" + this.f23348b + ")";
    }
}
