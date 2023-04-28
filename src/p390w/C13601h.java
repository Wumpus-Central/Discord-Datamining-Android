package p390w;

import android.util.Size;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.h */
/* loaded from: classes.dex */
public final class C13601h extends AbstractC13667r2 {

    /* renamed from: a */
    private final Size f30403a;

    /* renamed from: b */
    private final Size f30404b;

    /* renamed from: c */
    private final Size f30405c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13601h(Size size, Size size2, Size size3) {
        if (size != null) {
            this.f30403a = size;
            if (size2 != null) {
                this.f30404b = size2;
                if (size3 != null) {
                    this.f30405c = size3;
                    return;
                }
                throw new NullPointerException("Null recordSize");
            }
            throw new NullPointerException("Null previewSize");
        }
        throw new NullPointerException("Null analysisSize");
    }

    @Override // p390w.AbstractC13667r2
    /* renamed from: b */
    public Size mo3095b() {
        return this.f30403a;
    }

    @Override // p390w.AbstractC13667r2
    /* renamed from: c */
    public Size mo3094c() {
        return this.f30404b;
    }

    @Override // p390w.AbstractC13667r2
    /* renamed from: d */
    public Size mo3093d() {
        return this.f30405c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13667r2)) {
            return false;
        }
        AbstractC13667r2 r2Var = (AbstractC13667r2) obj;
        if (!this.f30403a.equals(r2Var.mo3095b()) || !this.f30404b.equals(r2Var.mo3094c()) || !this.f30405c.equals(r2Var.mo3093d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f30403a.hashCode() ^ 1000003) * 1000003) ^ this.f30404b.hashCode()) * 1000003) ^ this.f30405c.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f30403a + ", previewSize=" + this.f30404b + ", recordSize=" + this.f30405c + "}";
    }
}
