package p152i7;

import p079e7.C6722k;
import p119g9.C7510a;

/* renamed from: i7.i */
/* loaded from: classes7.dex */
public final class C8225i {

    /* renamed from: a */
    public final String f17806a;

    /* renamed from: b */
    public final C6722k f17807b;

    /* renamed from: c */
    public final C6722k f17808c;

    /* renamed from: d */
    public final int f17809d;

    /* renamed from: e */
    public final int f17810e;

    public C8225i(String str, C6722k kVar, C6722k kVar2, int i, int i2) {
        boolean z;
        if (i == 0 || i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        this.f17806a = C7510a.m22368d(str);
        this.f17807b = (C6722k) C7510a.m22367e(kVar);
        this.f17808c = (C6722k) C7510a.m22367e(kVar2);
        this.f17809d = i;
        this.f17810e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8225i.class != obj.getClass()) {
            return false;
        }
        C8225i iVar = (C8225i) obj;
        if (this.f17809d != iVar.f17809d || this.f17810e != iVar.f17810e || !this.f17806a.equals(iVar.f17806a) || !this.f17807b.equals(iVar.f17807b) || !this.f17808c.equals(iVar.f17808c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((527 + this.f17809d) * 31) + this.f17810e) * 31) + this.f17806a.hashCode()) * 31) + this.f17807b.hashCode()) * 31) + this.f17808c.hashCode();
    }
}
