package androidx.camera.core;

import android.graphics.Rect;
import androidx.camera.core.C1936v2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.j */
/* loaded from: classes.dex */
public final class C1870j extends C1936v2.AbstractC1943g {

    /* renamed from: a */
    private final Rect f1850a;

    /* renamed from: b */
    private final int f1851b;

    /* renamed from: c */
    private final int f1852c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1870j(Rect rect, int i, int i2) {
        if (rect != null) {
            this.f1850a = rect;
            this.f1851b = i;
            this.f1852c = i2;
            return;
        }
        throw new NullPointerException("Null cropRect");
    }

    @Override // androidx.camera.core.C1936v2.AbstractC1943g
    /* renamed from: a */
    public Rect mo39450a() {
        return this.f1850a;
    }

    @Override // androidx.camera.core.C1936v2.AbstractC1943g
    /* renamed from: b */
    public int mo39449b() {
        return this.f1851b;
    }

    @Override // androidx.camera.core.C1936v2.AbstractC1943g
    /* renamed from: c */
    public int mo39448c() {
        return this.f1852c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1936v2.AbstractC1943g)) {
            return false;
        }
        C1936v2.AbstractC1943g gVar = (C1936v2.AbstractC1943g) obj;
        if (this.f1850a.equals(gVar.mo39450a()) && this.f1851b == gVar.mo39449b() && this.f1852c == gVar.mo39448c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f1850a.hashCode() ^ 1000003) * 1000003) ^ this.f1851b) * 1000003) ^ this.f1852c;
    }

    public String toString() {
        return "TransformationInfo{cropRect=" + this.f1850a + ", rotationDegrees=" + this.f1851b + ", targetRotation=" + this.f1852c + "}";
    }
}
