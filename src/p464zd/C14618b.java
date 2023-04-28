package p464zd;

import java.util.ArrayList;
import java.util.List;
import p066dd.AbstractC6447p;
import p066dd.C6441j;
import p137hd.C7997b;

/* renamed from: zd.b */
/* loaded from: classes3.dex */
final class C14618b {

    /* renamed from: a */
    private final C7997b f33087a;

    /* renamed from: c */
    private final int f33089c;

    /* renamed from: d */
    private final int f33090d;

    /* renamed from: e */
    private final int f33091e;

    /* renamed from: f */
    private final int f33092f;

    /* renamed from: g */
    private final float f33093g;

    /* renamed from: i */
    private final AbstractC6447p f33095i;

    /* renamed from: b */
    private final List<C14617a> f33088b = new ArrayList(5);

    /* renamed from: h */
    private final int[] f33094h = new int[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14618b(C7997b bVar, int i, int i2, int i3, int i4, float f, AbstractC6447p pVar) {
        this.f33087a = bVar;
        this.f33089c = i;
        this.f33090d = i2;
        this.f33091e = i3;
        this.f33092f = i4;
        this.f33093g = f;
        this.f33095i = pVar;
    }

    /* renamed from: a */
    private static float m119a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* renamed from: b */
    private float m118b(int i, int i2, int i3, int i4) {
        C7997b bVar = this.f33087a;
        int j = bVar.m20920j();
        int[] iArr = this.f33094h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bVar.m20923e(i2, i5)) {
            int i6 = iArr[1];
            if (i6 > i3) {
                break;
            }
            iArr[1] = i6 + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !bVar.m20923e(i2, i5)) {
                int i7 = iArr[0];
                if (i7 > i3) {
                    break;
                }
                iArr[0] = i7 + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i8 = i + 1;
            while (i8 < j && bVar.m20923e(i2, i8)) {
                int i9 = iArr[1];
                if (i9 > i3) {
                    break;
                }
                iArr[1] = i9 + 1;
                i8++;
            }
            if (i8 != j && iArr[1] <= i3) {
                while (i8 < j && !bVar.m20923e(i2, i8)) {
                    int i10 = iArr[2];
                    if (i10 > i3) {
                        break;
                    }
                    iArr[2] = i10 + 1;
                    i8++;
                }
                int i11 = iArr[2];
                if (i11 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i11) - i4) * 5 < i4 * 2 && m116d(iArr)) {
                    return m119a(iArr, i8);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private boolean m116d(int[] iArr) {
        float f = this.f33093g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private C14617a m115e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m119a(iArr, i2);
        float b = m118b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C14617a aVar : this.f33088b) {
            if (aVar.m121f(f, b, a)) {
                return aVar.m120g(b, a, f);
            }
        }
        C14617a aVar2 = new C14617a(a, b, f);
        this.f33088b.add(aVar2);
        AbstractC6447p pVar = this.f33095i;
        if (pVar == null) {
            return null;
        }
        pVar.m25542a(aVar2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C14617a m117c() {
        int i;
        C14617a e;
        C14617a e2;
        int i2 = this.f33089c;
        int i3 = this.f33092f;
        int i4 = this.f33091e + i2;
        int i5 = this.f33090d + (i3 / 2);
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i3; i6++) {
            if ((i6 & 1) == 0) {
                i = (i6 + 1) / 2;
            } else {
                i = -((i6 + 1) / 2);
            }
            int i7 = i + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i2;
            while (i8 < i4 && !this.f33087a.m20923e(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i4) {
                if (!this.f33087a.m20923e(i8, i7)) {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                } else if (i9 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i9 != 2) {
                    i9++;
                    iArr[i9] = iArr[i9] + 1;
                } else if (m116d(iArr) && (e2 = m115e(iArr, i7, i8)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i9 = 1;
                }
                i8++;
            }
            if (m116d(iArr) && (e = m115e(iArr, i7, i4)) != null) {
                return e;
            }
        }
        if (!this.f33088b.isEmpty()) {
            return this.f33088b.get(0);
        }
        throw C6441j.m25551a();
    }
}
