package p145i0;

import p145i0.C8194v;

/* renamed from: i0.i */
/* loaded from: classes.dex */
final class C8141i extends C8194v.AbstractC8196b {

    /* renamed from: j */
    private final int f17606j;

    /* renamed from: k */
    private final String f17607k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8141i(int i, String str) {
        this.f17606j = i;
        if (str != null) {
            this.f17607k = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // p145i0.C8194v.AbstractC8196b
    /* renamed from: c */
    String mo20332c() {
        return this.f17607k;
    }

    @Override // p145i0.C8194v.AbstractC8196b
    /* renamed from: d */
    int mo20331d() {
        return this.f17606j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8194v.AbstractC8196b)) {
            return false;
        }
        C8194v.AbstractC8196b bVar = (C8194v.AbstractC8196b) obj;
        if (this.f17606j != bVar.mo20331d() || !this.f17607k.equals(bVar.mo20332c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f17606j ^ 1000003) * 1000003) ^ this.f17607k.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f17606j + ", name=" + this.f17607k + "}";
    }
}
