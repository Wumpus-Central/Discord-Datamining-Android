package com.budiyev.android.codescanner;

/* renamed from: com.budiyev.android.codescanner.i */
/* loaded from: classes.dex */
final class C4184i {

    /* renamed from: a */
    private final int f7096a;

    /* renamed from: b */
    private final int f7097b;

    public C4184i(int i, int i2) {
        this.f7096a = i;
        this.f7097b = i2;
    }

    /* renamed from: a */
    public int m32417a() {
        return this.f7096a;
    }

    /* renamed from: b */
    public int m32416b() {
        return this.f7097b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4184i)) {
            return false;
        }
        C4184i iVar = (C4184i) obj;
        if (this.f7096a == iVar.f7096a && this.f7097b == iVar.f7097b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f7096a;
        int i2 = this.f7097b;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return "(" + this.f7096a + "; " + this.f7097b + ")";
    }
}
