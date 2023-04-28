package p124h0;

import p124h0.C7723f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h0.c */
/* loaded from: classes.dex */
public final class C7720c extends C7723f.AbstractC7725b {

    /* renamed from: e */
    private final int f16749e;

    /* renamed from: f */
    private final int f16750f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7720c(int i, int i2) {
        this.f16749e = i;
        this.f16750f = i2;
    }

    @Override // p124h0.C7723f.AbstractC7725b
    /* renamed from: a */
    public int mo21568a() {
        return this.f16749e;
    }

    @Override // p124h0.C7723f.AbstractC7725b
    /* renamed from: b */
    public int mo21567b() {
        return this.f16750f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7723f.AbstractC7725b)) {
            return false;
        }
        C7723f.AbstractC7725b bVar = (C7723f.AbstractC7725b) obj;
        if (this.f16749e == bVar.mo21568a() && this.f16750f == bVar.mo21567b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f16749e ^ 1000003) * 1000003) ^ this.f16750f;
    }

    public String toString() {
        return "MultiResolutionImageReaderConfig{imageFormat=" + this.f16749e + ", maxImages=" + this.f16750f + "}";
    }
}
