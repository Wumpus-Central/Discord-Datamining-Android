package p229m8;

import p119g9.C7557q0;

/* renamed from: m8.g */
/* loaded from: classes7.dex */
public class C10545g {

    /* renamed from: a */
    public final String f23342a;

    /* renamed from: b */
    public final String f23343b;

    /* renamed from: c */
    public final String f23344c;

    /* renamed from: d */
    public final String f23345d;

    /* renamed from: e */
    public final String f23346e;

    public C10545g(String str, String str2, String str3, String str4, String str5) {
        this.f23342a = str;
        this.f23343b = str2;
        this.f23344c = str3;
        this.f23345d = str4;
        this.f23346e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10545g gVar = (C10545g) obj;
        if (!C7557q0.m22159c(this.f23342a, gVar.f23342a) || !C7557q0.m22159c(this.f23343b, gVar.f23343b) || !C7557q0.m22159c(this.f23344c, gVar.f23344c) || !C7557q0.m22159c(this.f23345d, gVar.f23345d) || !C7557q0.m22159c(this.f23346e, gVar.f23346e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f23342a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (527 + i) * 31;
        String str2 = this.f23343b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.f23344c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.f23345d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.f23346e;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }
}
