package p124h0;

import android.util.Size;
import p124h0.C7723f;

/* renamed from: h0.b */
/* loaded from: classes.dex */
final class C7719b extends C7723f.AbstractC7724a {

    /* renamed from: e */
    private final Size f16746e;

    /* renamed from: f */
    private final int f16747f;

    /* renamed from: g */
    private final int f16748g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7719b(Size size, int i, int i2) {
        if (size != null) {
            this.f16746e = size;
            this.f16747f = i;
            this.f16748g = i2;
            return;
        }
        throw new NullPointerException("Null size");
    }

    @Override // p124h0.C7723f.AbstractC7724a, p124h0.AbstractC7731i
    /* renamed from: a */
    public int mo21553a() {
        return this.f16747f;
    }

    @Override // p124h0.C7723f.AbstractC7724a, p124h0.AbstractC7731i
    /* renamed from: b */
    public int mo21552b() {
        return this.f16748g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7723f.AbstractC7724a)) {
            return false;
        }
        C7723f.AbstractC7724a aVar = (C7723f.AbstractC7724a) obj;
        if (this.f16746e.equals(aVar.getSize()) && this.f16747f == aVar.mo21553a() && this.f16748g == aVar.mo21552b()) {
            return true;
        }
        return false;
    }

    @Override // p124h0.C7723f.AbstractC7724a, p124h0.AbstractC7731i
    public Size getSize() {
        return this.f16746e;
    }

    public int hashCode() {
        return ((((this.f16746e.hashCode() ^ 1000003) * 1000003) ^ this.f16747f) * 1000003) ^ this.f16748g;
    }

    public String toString() {
        return "ImageReaderConfig{size=" + this.f16746e + ", imageFormat=" + this.f16747f + ", maxImages=" + this.f16748g + "}";
    }
}
