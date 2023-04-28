package p288q;

import androidx.camera.core.AbstractC1801d3;

/* renamed from: q.l3 */
/* loaded from: classes.dex */
class C11870l3 implements AbstractC1801d3 {

    /* renamed from: a */
    private float f26504a;

    /* renamed from: b */
    private final float f26505b;

    /* renamed from: c */
    private final float f26506c;

    /* renamed from: d */
    private float f26507d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11870l3(float f, float f2) {
        this.f26505b = f;
        this.f26506c = f2;
    }

    /* renamed from: e */
    private float m8422e(float f) {
        float f2 = this.f26505b;
        float f3 = this.f26506c;
        if (f2 == f3) {
            return 0.0f;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return 0.0f;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    @Override // androidx.camera.core.AbstractC1801d3
    /* renamed from: a */
    public float mo309a() {
        return this.f26505b;
    }

    @Override // androidx.camera.core.AbstractC1801d3
    /* renamed from: b */
    public float mo308b() {
        return this.f26507d;
    }

    @Override // androidx.camera.core.AbstractC1801d3
    /* renamed from: c */
    public float mo307c() {
        return this.f26506c;
    }

    @Override // androidx.camera.core.AbstractC1801d3
    /* renamed from: d */
    public float mo306d() {
        return this.f26504a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m8421f(float f) {
        if (f > this.f26505b || f < this.f26506c) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.f26506c + " , " + this.f26505b + "]");
        }
        this.f26504a = f;
        this.f26507d = m8422e(f);
    }
}
