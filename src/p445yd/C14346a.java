package p445yd;

import p066dd.C6437f;
import p137hd.C7997b;

/* renamed from: yd.a */
/* loaded from: classes3.dex */
final class C14346a {

    /* renamed from: a */
    private final C7997b f32471a;

    /* renamed from: b */
    private C14363j f32472b;

    /* renamed from: c */
    private C14360g f32473c;

    /* renamed from: d */
    private boolean f32474d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14346a(C7997b bVar) {
        int j = bVar.m20920j();
        if (j < 21 || (j & 3) != 1) {
            throw C6437f.m25561a();
        }
        this.f32471a = bVar;
    }

    /* renamed from: a */
    private int m810a(int i, int i2, int i3) {
        return this.f32474d ? this.f32471a.m20923e(i2, i) : this.f32471a.m20923e(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m809b() {
        int i = 0;
        while (i < this.f32471a.m20917m()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f32471a.m20920j(); i3++) {
                if (this.f32471a.m20923e(i, i3) != this.f32471a.m20923e(i3, i)) {
                    this.f32471a.m20924d(i3, i);
                    this.f32471a.m20924d(i, i3);
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m808c() {
        int i;
        C14360g d = m807d();
        C14363j e = m806e();
        EnumC14348c cVar = EnumC14348c.values()[d.m784c()];
        int j = this.f32471a.m20920j();
        cVar.m800b(this.f32471a, j);
        C7997b a = e.m778a();
        byte[] bArr = new byte[e.m771h()];
        int i2 = j - 1;
        boolean z = true;
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 > 0) {
            if (i3 == 6) {
                i3--;
            }
            for (int i7 = 0; i7 < j; i7++) {
                if (z) {
                    i = i2 - i7;
                } else {
                    i = i7;
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i3 - i8;
                    if (!a.m20923e(i9, i)) {
                        i5++;
                        i6 <<= 1;
                        if (this.f32471a.m20923e(i9, i)) {
                            i6 |= 1;
                        }
                        if (i5 == 8) {
                            bArr[i4] = (byte) i6;
                            i4++;
                            i5 = 0;
                            i6 = 0;
                        }
                    }
                }
            }
            z = !z;
            i3 -= 2;
        }
        if (i4 == e.m771h()) {
            return bArr;
        }
        throw C6437f.m25561a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C14360g m807d() {
        C14360g gVar = this.f32473c;
        if (gVar != null) {
            return gVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m810a(i3, 8, i2);
        }
        int a = m810a(8, 7, m810a(8, 8, m810a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = m810a(8, i4, a);
        }
        int j = this.f32471a.m20920j();
        int i5 = j - 7;
        for (int i6 = j - 1; i6 >= i5; i6--) {
            i = m810a(8, i6, i);
        }
        for (int i7 = j - 8; i7 < j; i7++) {
            i = m810a(i7, 8, i);
        }
        C14360g a2 = C14360g.m786a(a, i);
        this.f32473c = a2;
        if (a2 != null) {
            return a2;
        }
        throw C6437f.m25561a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C14363j m806e() {
        C14363j jVar = this.f32472b;
        if (jVar != null) {
            return jVar;
        }
        int j = this.f32471a.m20920j();
        int i = (j - 17) / 4;
        if (i <= 6) {
            return C14363j.m770i(i);
        }
        int i2 = j - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = j - 9; i6 >= i2; i6--) {
                i4 = m810a(i6, i5, i4);
            }
        }
        C14363j c = C14363j.m776c(i4);
        if (c == null || c.m774e() != j) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = j - 9; i8 >= i2; i8--) {
                    i3 = m810a(i7, i8, i3);
                }
            }
            C14363j c2 = C14363j.m776c(i3);
            if (c2 == null || c2.m774e() != j) {
                throw C6437f.m25561a();
            }
            this.f32472b = c2;
            return c2;
        }
        this.f32472b = c;
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m805f() {
        if (this.f32473c != null) {
            EnumC14348c.values()[this.f32473c.m784c()].m800b(this.f32471a, this.f32471a.m20920j());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m804g(boolean z) {
        this.f32472b = null;
        this.f32473c = null;
        this.f32474d = z;
    }
}
