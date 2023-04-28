package p390w;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.e */
/* loaded from: classes.dex */
public final class C13588e extends AbstractC13587d2 {

    /* renamed from: a */
    private final Surface f30376a;

    /* renamed from: b */
    private final Size f30377b;

    /* renamed from: c */
    private final int f30378c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13588e(Surface surface, Size size, int i) {
        if (surface != null) {
            this.f30376a = surface;
            if (size != null) {
                this.f30377b = size;
                this.f30378c = i;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surface");
    }

    @Override // p390w.AbstractC13587d2
    /* renamed from: b */
    public int mo3301b() {
        return this.f30378c;
    }

    @Override // p390w.AbstractC13587d2
    /* renamed from: c */
    public Size mo3300c() {
        return this.f30377b;
    }

    @Override // p390w.AbstractC13587d2
    /* renamed from: d */
    public Surface mo3299d() {
        return this.f30376a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13587d2)) {
            return false;
        }
        AbstractC13587d2 d2Var = (AbstractC13587d2) obj;
        if (!this.f30376a.equals(d2Var.mo3299d()) || !this.f30377b.equals(d2Var.mo3300c()) || this.f30378c != d2Var.mo3301b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f30376a.hashCode() ^ 1000003) * 1000003) ^ this.f30377b.hashCode()) * 1000003) ^ this.f30378c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f30376a + ", size=" + this.f30377b + ", imageFormat=" + this.f30378c + "}";
    }
}
