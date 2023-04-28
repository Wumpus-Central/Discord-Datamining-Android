package p464zd;

import p066dd.C6446o;

/* renamed from: zd.d */
/* loaded from: classes3.dex */
public final class C14620d extends C6446o {

    /* renamed from: c */
    private final float f33098c;

    /* renamed from: d */
    private final int f33099d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14620d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m104f(float f, float f2, float f3) {
        if (Math.abs(f2 - m25544d()) > f || Math.abs(f3 - m25545c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f33098c);
        if (abs <= 1.0f || abs <= this.f33098c) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C14620d m103g(float f, float f2, float f3) {
        int i = this.f33099d;
        int i2 = i + 1;
        float c = (i * m25545c()) + f2;
        float f4 = i2;
        return new C14620d(c / f4, ((this.f33099d * m25544d()) + f) / f4, ((this.f33099d * this.f33098c) + f3) / f4, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m102h() {
        return this.f33099d;
    }

    /* renamed from: i */
    public float m101i() {
        return this.f33098c;
    }

    private C14620d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f33098c = f3;
        this.f33099d = i;
    }
}
