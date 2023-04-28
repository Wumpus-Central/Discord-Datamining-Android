package sd;

import p066dd.C6437f;

/* renamed from: sd.p */
/* loaded from: classes3.dex */
final class C12878p extends AbstractC12879q {

    /* renamed from: b */
    private final int f28947b;

    /* renamed from: c */
    private final int f28948c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12878p(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw C6437f.m25561a();
        }
        this.f28947b = i2;
        this.f28948c = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m5219b() {
        return this.f28947b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m5218c() {
        return this.f28948c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m5217d() {
        return this.f28947b == 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m5216e() {
        return this.f28948c == 10;
    }
}
