package androidx.camera.core;

import android.graphics.Matrix;
import p390w.C13671s2;

/* renamed from: androidx.camera.core.h */
/* loaded from: classes.dex */
final class C1828h extends AbstractC1904p1 {

    /* renamed from: a */
    private final C13671s2 f1770a;

    /* renamed from: b */
    private final long f1771b;

    /* renamed from: c */
    private final int f1772c;

    /* renamed from: d */
    private final Matrix f1773d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1828h(C13671s2 s2Var, long j, int i, Matrix matrix) {
        if (s2Var != null) {
            this.f1770a = s2Var;
            this.f1771b = j;
            this.f1772c = i;
            if (matrix != null) {
                this.f1773d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    @Override // androidx.camera.core.AbstractC1904p1, androidx.camera.core.AbstractC1876k1
    /* renamed from: a */
    public long mo345a() {
        return this.f1771b;
    }

    @Override // androidx.camera.core.AbstractC1904p1, androidx.camera.core.AbstractC1876k1
    /* renamed from: c */
    public C13671s2 mo343c() {
        return this.f1770a;
    }

    @Override // androidx.camera.core.AbstractC1904p1
    /* renamed from: e */
    public int mo39539e() {
        return this.f1772c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1904p1)) {
            return false;
        }
        AbstractC1904p1 p1Var = (AbstractC1904p1) obj;
        if (!this.f1770a.equals(p1Var.mo343c()) || this.f1771b != p1Var.mo345a() || this.f1772c != p1Var.mo39539e() || !this.f1773d.equals(p1Var.mo39538f())) {
            return false;
        }
        return true;
    }

    @Override // androidx.camera.core.AbstractC1904p1
    /* renamed from: f */
    public Matrix mo39538f() {
        return this.f1773d;
    }

    public int hashCode() {
        long j = this.f1771b;
        return ((((((this.f1770a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f1772c) * 1000003) ^ this.f1773d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f1770a + ", timestamp=" + this.f1771b + ", rotationDegrees=" + this.f1772c + ", sensorToBufferTransformMatrix=" + this.f1773d + "}";
    }
}
