package p124h0;

import android.view.Surface;
import p124h0.C7723f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h0.d */
/* loaded from: classes.dex */
public final class C7721d extends C7723f.AbstractC7727d {

    /* renamed from: e */
    private final Surface f16751e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7721d(Surface surface) {
        if (surface != null) {
            this.f16751e = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7723f.AbstractC7727d) {
            return this.f16751e.equals(((C7723f.AbstractC7727d) obj).getSurface());
        }
        return false;
    }

    @Override // p124h0.C7723f.AbstractC7727d, p124h0.AbstractC7735m
    public Surface getSurface() {
        return this.f16751e;
    }

    public int hashCode() {
        return this.f16751e.hashCode() ^ 1000003;
    }

    public String toString() {
        return "SurfaceConfig{surface=" + this.f16751e + "}";
    }
}
