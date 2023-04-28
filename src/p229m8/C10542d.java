package p229m8;

import p119g9.C7557q0;

/* renamed from: m8.d */
/* loaded from: classes7.dex */
public final class C10542d {

    /* renamed from: a */
    public final String f23329a;

    /* renamed from: b */
    public final String f23330b;

    /* renamed from: c */
    public final String f23331c;

    public C10542d(String str, String str2, String str3) {
        this.f23329a = str;
        this.f23330b = str2;
        this.f23331c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10542d.class != obj.getClass()) {
            return false;
        }
        C10542d dVar = (C10542d) obj;
        if (!C7557q0.m22159c(this.f23329a, dVar.f23329a) || !C7557q0.m22159c(this.f23330b, dVar.f23330b) || !C7557q0.m22159c(this.f23331c, dVar.f23331c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f23329a.hashCode() * 31;
        String str = this.f23330b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f23331c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}
