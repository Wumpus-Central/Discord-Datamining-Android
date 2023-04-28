package p137hd;

import p066dd.AbstractC6433b;
import p066dd.AbstractC6439h;
import p066dd.C6441j;

/* renamed from: hd.h */
/* loaded from: classes3.dex */
public class C8003h extends AbstractC6433b {

    /* renamed from: d */
    private static final byte[] f17263d = new byte[0];

    /* renamed from: b */
    private byte[] f17264b = f17263d;

    /* renamed from: c */
    private final int[] f17265c = new int[32];

    public C8003h(AbstractC6439h hVar) {
        super(hVar);
    }

    /* renamed from: g */
    private static int m20890g(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            i3 = i6;
            i6 = i3;
        }
        if (i3 - i6 > length / 16) {
            int i11 = i3 - 1;
            int i12 = -1;
            int i13 = i11;
            while (i11 > i6) {
                int i14 = i11 - i6;
                int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
                if (i15 > i12) {
                    i13 = i11;
                    i12 = i15;
                }
                i11--;
            }
            return i13 << 3;
        }
        throw C6441j.m25551a();
    }

    /* renamed from: h */
    private void m20889h(int i) {
        if (this.f17264b.length < i) {
            this.f17264b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f17265c[i2] = 0;
        }
    }

    @Override // p066dd.AbstractC6433b
    /* renamed from: b */
    public C7997b mo20883b() {
        AbstractC6439h e = m25570e();
        int d = e.m25558d();
        int a = e.m25559a();
        C7997b bVar = new C7997b(d, a);
        m20889h(d);
        int[] iArr = this.f17265c;
        for (int i = 1; i < 5; i++) {
            byte[] c = e.mo25549c((a * i) / 5, this.f17264b);
            int i2 = (d << 2) / 5;
            for (int i3 = d / 5; i3 < i2; i3++) {
                int i4 = (c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int g = m20890g(iArr);
        byte[] b = e.mo25550b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * d;
            for (int i7 = 0; i7 < d; i7++) {
                if ((b[i6 + i7] & 255) < g) {
                    bVar.m20915o(i7, i5);
                }
            }
        }
        return bVar;
    }

    @Override // p066dd.AbstractC6433b
    /* renamed from: c */
    public C7996a mo20891c(int i, C7996a aVar) {
        AbstractC6439h e = m25570e();
        int d = e.m25558d();
        if (aVar == null || aVar.m20932j() < d) {
            aVar = new C7996a(d);
        } else {
            aVar.m20938a();
        }
        m20889h(d);
        byte[] c = e.mo25549c(i, this.f17264b);
        int[] iArr = this.f17265c;
        for (int i2 = 0; i2 < d; i2++) {
            int i3 = (c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int g = m20890g(iArr);
        if (d < 3) {
            for (int i4 = 0; i4 < d; i4++) {
                if ((c[i4] & 255) < g) {
                    aVar.m20928n(i4);
                }
            }
        } else {
            int i5 = c[1] & 255;
            int i6 = 1;
            int i7 = c[0] & 255;
            int i8 = i5;
            while (i6 < d - 1) {
                int i9 = i6 + 1;
                int i10 = c[i9] & 255;
                if ((((i8 << 2) - i7) - i10) / 2 < g) {
                    aVar.m20928n(i6);
                }
                i7 = i8;
                i6 = i9;
                i8 = i10;
            }
        }
        return aVar;
    }
}
