package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.C1936v2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.i */
/* loaded from: classes.dex */
public final class C1832i extends C1936v2.AbstractC1942f {

    /* renamed from: a */
    private final int f1780a;

    /* renamed from: b */
    private final Surface f1781b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1832i(int i, Surface surface) {
        this.f1780a = i;
        if (surface != null) {
            this.f1781b = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    @Override // androidx.camera.core.C1936v2.AbstractC1942f
    /* renamed from: a */
    public int mo39453a() {
        return this.f1780a;
    }

    @Override // androidx.camera.core.C1936v2.AbstractC1942f
    /* renamed from: b */
    public Surface mo39452b() {
        return this.f1781b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1936v2.AbstractC1942f)) {
            return false;
        }
        C1936v2.AbstractC1942f fVar = (C1936v2.AbstractC1942f) obj;
        if (this.f1780a != fVar.mo39453a() || !this.f1781b.equals(fVar.mo39452b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f1780a ^ 1000003) * 1000003) ^ this.f1781b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f1780a + ", surface=" + this.f1781b + "}";
    }
}
