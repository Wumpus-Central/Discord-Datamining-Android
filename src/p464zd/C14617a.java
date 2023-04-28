package p464zd;

import p066dd.C6446o;

/* renamed from: zd.a */
/* loaded from: classes3.dex */
public final class C14617a extends C6446o {

    /* renamed from: c */
    private final float f33086c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14617a(float f, float f2, float f3) {
        super(f, f2);
        this.f33086c = f3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m121f(float f, float f2, float f3) {
        if (Math.abs(f2 - m25544d()) > f || Math.abs(f3 - m25545c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f33086c);
        if (abs <= 1.0f || abs <= this.f33086c) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C14617a m120g(float f, float f2, float f3) {
        return new C14617a((m25545c() + f2) / 2.0f, (m25544d() + f) / 2.0f, (this.f33086c + f3) / 2.0f);
    }
}
