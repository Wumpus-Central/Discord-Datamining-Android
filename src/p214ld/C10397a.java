package p214ld;

import p066dd.C6437f;
import p137hd.C7997b;

/* renamed from: ld.a */
/* loaded from: classes3.dex */
final class C10397a {

    /* renamed from: a */
    private final C7997b f22779a;

    /* renamed from: b */
    private final C7997b f22780b;

    /* renamed from: c */
    private final C10403e f22781c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10397a(C7997b bVar) {
        int j = bVar.m20920j();
        if (j < 8 || j > 144 || (j & 1) != 0) {
            throw C6437f.m25561a();
        }
        this.f22781c = m13502j(bVar);
        C7997b a = m13511a(bVar);
        this.f22779a = a;
        this.f22780b = new C7997b(a.m20917m(), a.m20920j());
    }

    /* renamed from: a */
    private C7997b m13511a(C7997b bVar) {
        int f = this.f22781c.m13482f();
        int e = this.f22781c.m13483e();
        if (bVar.m20920j() == f) {
            int c = this.f22781c.m13485c();
            int b = this.f22781c.m13486b();
            int i = f / c;
            int i2 = e / b;
            C7997b bVar2 = new C7997b(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b; i10++) {
                            if (bVar.m20923e(((b + 2) * i5) + 1 + i10, i8)) {
                                bVar2.m20915o(i6 + i10, i9);
                            }
                        }
                    }
                }
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    /* renamed from: d */
    private int m13508d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m13504h(i3, 0, i, i2) ? 1 : 0) << 1;
        if (m13504h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m13504h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m13504h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m13504h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m13504h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m13504h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m13504h(3, i8, i, i2)) {
            return i11 | 1;
        }
        return i11;
    }

    /* renamed from: e */
    private int m13507e(int i, int i2) {
        int i3 = (m13504h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m13504h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m13504h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m13504h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m13504h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m13504h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m13504h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m13504h(1, i9, i, i2)) {
            return i10 | 1;
        }
        return i10;
    }

    /* renamed from: f */
    private int m13506f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m13504h(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (m13504h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m13504h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m13504h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m13504h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m13504h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m13504h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m13504h(1, i5, i, i2)) {
            return i13 | 1;
        }
        return i13;
    }

    /* renamed from: g */
    private int m13505g(int i, int i2) {
        int i3 = (m13504h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m13504h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m13504h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m13504h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m13504h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m13504h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m13504h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m13504h(3, i7, i, i2)) {
            return i10 | 1;
        }
        return i10;
    }

    /* renamed from: h */
    private boolean m13504h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f22780b.m20915o(i2, i);
        return this.f22779a.m20923e(i2, i);
    }

    /* renamed from: i */
    private int m13503i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m13504h(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (m13504h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m13504h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m13504h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m13504h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m13504h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m13504h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (m13504h(i, i2, i3, i4)) {
            return i15 | 1;
        }
        return i15;
    }

    /* renamed from: j */
    private static C10403e m13502j(C7997b bVar) {
        return C10403e.m13480h(bVar.m20920j(), bVar.m20917m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C10403e m13510b() {
        return this.f22781c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m13509c() {
        byte[] bArr = new byte[this.f22781c.m13481g()];
        int j = this.f22779a.m20920j();
        int m = this.f22779a.m20917m();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == j && i == 0 && !z) {
                bArr[i2] = (byte) m13508d(j, m);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = j - 2;
                if (i3 == i4 && i == 0 && (m & 3) != 0 && !z2) {
                    bArr[i2] = (byte) m13507e(j, m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == j + 4 && i == 2 && (m & 7) == 0 && !z3) {
                    bArr[i2] = (byte) m13506f(j, m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (m & 7) == 4 && !z4) {
                    bArr[i2] = (byte) m13505g(j, m);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < j && i >= 0 && !this.f22780b.m20923e(i, i3)) {
                            bArr[i2] = (byte) m13503i(i3, i, j, m);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < m);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < m && !this.f22780b.m20923e(i6, i5)) {
                            bArr[i2] = (byte) m13503i(i5, i6, j, m);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= j) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= j && i >= m) {
                break;
            }
        }
        if (i2 == this.f22781c.m13481g()) {
            return bArr;
        }
        throw C6437f.m25561a();
    }
}
