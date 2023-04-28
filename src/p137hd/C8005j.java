package p137hd;

import java.lang.reflect.Array;
import p066dd.AbstractC6433b;
import p066dd.AbstractC6439h;

/* renamed from: hd.j */
/* loaded from: classes3.dex */
public final class C8005j extends C8003h {

    /* renamed from: e */
    private C7997b f17267e;

    public C8005j(AbstractC6439h hVar) {
        super(hVar);
    }

    /* renamed from: i */
    private static int[][] m20882i(byte[] bArr, int i, int i2, int i3, int i4) {
        char c;
        int i5 = 8;
        int i6 = i4 - 8;
        int i7 = i3 - 8;
        char c2 = 2;
        boolean z = true;
        int i8 = 0;
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i2, i);
        int i9 = 0;
        while (i9 < i2) {
            int i10 = i9 << 3;
            if (i10 > i6) {
                i10 = i6;
            }
            int i11 = i8;
            while (i11 < i) {
                int i12 = i11 << 3;
                if (i12 > i7) {
                    i12 = i7;
                }
                int i13 = (i10 * i3) + i12;
                int i14 = i8;
                int i15 = i14;
                int i16 = i15;
                int i17 = 255;
                while (i14 < i5) {
                    int i18 = i16;
                    int i19 = 0;
                    while (i19 < i5) {
                        int i20 = bArr[i13 + i19] & 255;
                        i15 += i20;
                        if (i20 < i17) {
                            i17 = i20;
                        }
                        if (i20 > i18) {
                            i18 = i20;
                        }
                        i19++;
                        i5 = 8;
                    }
                    if (i18 - i17 <= 24) {
                        i14++;
                        i13 += i3;
                        i16 = i18;
                        z = true;
                        i5 = 8;
                    }
                    while (true) {
                        i14++;
                        i13 += i3;
                        if (i14 < 8) {
                            int i21 = 0;
                            for (int i22 = 8; i21 < i22; i22 = 8) {
                                i15 += bArr[i13 + i21] & 255;
                                i21++;
                            }
                        }
                    }
                    i14++;
                    i13 += i3;
                    i16 = i18;
                    z = true;
                    i5 = 8;
                }
                int i23 = i15 >> 6;
                if (i16 - i17 <= 24) {
                    i23 = i17 / 2;
                    if (i9 > 0 && i11 > 0) {
                        int[] iArr2 = iArr[i9 - 1];
                        int i24 = i11 - 1;
                        c = 2;
                        int i25 = ((iArr2[i11] + (iArr[i9][i24] * 2)) + iArr2[i24]) / 4;
                        if (i17 < i25) {
                            i23 = i25;
                        }
                        iArr[i9][i11] = i23;
                        i11++;
                        z = z;
                        c2 = c;
                        i5 = 8;
                        i8 = 0;
                    }
                }
                c = 2;
                iArr[i9][i11] = i23;
                i11++;
                z = z;
                c2 = c;
                i5 = 8;
                i8 = 0;
            }
            i9++;
            i5 = 8;
            i8 = 0;
        }
        return iArr;
    }

    /* renamed from: j */
    private static void m20881j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C7997b bVar) {
        int i5;
        int i6;
        int i7 = i4 - 8;
        int i8 = i3 - 8;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i9 << 3;
            if (i10 > i7) {
                i5 = i7;
            } else {
                i5 = i10;
            }
            int k = m20880k(i9, 2, i2 - 3);
            for (int i11 = 0; i11 < i; i11++) {
                int i12 = i11 << 3;
                if (i12 > i8) {
                    i6 = i8;
                } else {
                    i6 = i12;
                }
                int k2 = m20880k(i11, 2, i - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[k + i14];
                    i13 += iArr2[k2 - 2] + iArr2[k2 - 1] + iArr2[k2] + iArr2[k2 + 1] + iArr2[k2 + 2];
                }
                m20879l(bArr, i6, i5, i13 / 25, i3, bVar);
            }
        }
    }

    /* renamed from: k */
    private static int m20880k(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: l */
    private static void m20879l(byte[] bArr, int i, int i2, int i3, int i4, C7997b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.m20915o(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    @Override // p066dd.AbstractC6433b
    /* renamed from: a */
    public AbstractC6433b mo20884a(AbstractC6439h hVar) {
        return new C8005j(hVar);
    }

    @Override // p137hd.C8003h, p066dd.AbstractC6433b
    /* renamed from: b */
    public C7997b mo20883b() {
        C7997b bVar = this.f17267e;
        if (bVar != null) {
            return bVar;
        }
        AbstractC6439h e = m25570e();
        int d = e.m25558d();
        int a = e.m25559a();
        if (d < 40 || a < 40) {
            this.f17267e = super.mo20883b();
        } else {
            byte[] b = e.mo25550b();
            int i = d >> 3;
            if ((d & 7) != 0) {
                i++;
            }
            int i2 = a >> 3;
            if ((a & 7) != 0) {
                i2++;
            }
            int[][] i3 = m20882i(b, i, i2, d, a);
            C7997b bVar2 = new C7997b(d, a);
            m20881j(b, i, i2, d, a, i3, bVar2);
            this.f17267e = bVar2;
        }
        return this.f17267e;
    }
}
