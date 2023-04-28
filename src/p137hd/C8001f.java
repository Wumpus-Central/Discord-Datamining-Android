package p137hd;

import p066dd.C6441j;

/* renamed from: hd.f */
/* loaded from: classes3.dex */
public final class C8001f extends AbstractC8004i {
    @Override // p137hd.AbstractC8004i
    /* renamed from: c */
    public C7997b mo20886c(C7997b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return mo20885d(bVar, i, i2, C8006k.m20877b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // p137hd.AbstractC8004i
    /* renamed from: d */
    public C7997b mo20885d(C7997b bVar, int i, int i2, C8006k kVar) {
        if (i <= 0 || i2 <= 0) {
            throw C6441j.m25551a();
        }
        C7997b bVar2 = new C7997b(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = i4 + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = (i5 / 2) + 0.5f;
                fArr[i5 + 1] = f;
            }
            kVar.m20873f(fArr);
            AbstractC8004i.m20888a(bVar, fArr);
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    if (bVar.m20923e((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bVar2.m20915o(i6 / 2, i4);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C6441j.m25551a();
                }
            }
        }
        return bVar2;
    }
}
