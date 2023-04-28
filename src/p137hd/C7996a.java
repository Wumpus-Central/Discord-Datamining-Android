package p137hd;

import java.util.Arrays;

/* renamed from: hd.a */
/* loaded from: classes3.dex */
public final class C7996a implements Cloneable {

    /* renamed from: k */
    private int[] f17226k;

    /* renamed from: l */
    private int f17227l;

    public C7996a() {
        this.f17227l = 0;
        this.f17226k = new int[1];
    }

    /* renamed from: l */
    private static int[] m20930l(int i) {
        return new int[(i + 31) / 32];
    }

    /* renamed from: a */
    public void m20938a() {
        int length = this.f17226k.length;
        for (int i = 0; i < length; i++) {
            this.f17226k[i] = 0;
        }
    }

    /* renamed from: c */
    public C7996a clone() {
        return new C7996a((int[]) this.f17226k.clone(), this.f17227l);
    }

    /* renamed from: d */
    public boolean m20936d(int i) {
        return ((1 << (i & 31)) & this.f17226k[i / 32]) != 0;
    }

    /* renamed from: e */
    public int[] m20935e() {
        return this.f17226k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7996a)) {
            return false;
        }
        C7996a aVar = (C7996a) obj;
        if (this.f17227l != aVar.f17227l || !Arrays.equals(this.f17226k, aVar.f17226k)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int m20934f(int i) {
        int i2 = this.f17227l;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f17226k[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f17226k;
            if (i3 == iArr.length) {
                return this.f17227l;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f17227l;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    /* renamed from: h */
    public int m20933h(int i) {
        int i2 = this.f17227l;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f17226k[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f17226k;
            if (i3 == iArr.length) {
                return this.f17227l;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f17227l;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    public int hashCode() {
        return (this.f17227l * 31) + Arrays.hashCode(this.f17226k);
    }

    /* renamed from: j */
    public int m20932j() {
        return this.f17227l;
    }

    /* renamed from: k */
    public boolean m20931k(int i, int i2, boolean z) {
        int i3;
        if (i2 < i || i < 0 || i2 > this.f17227l) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            for (int i7 = i5; i7 <= i6; i7++) {
                int i8 = 31;
                if (i7 > i5) {
                    i3 = 0;
                } else {
                    i3 = i & 31;
                }
                if (i7 >= i6) {
                    i8 = 31 & i4;
                }
                int i9 = (2 << i8) - (1 << i3);
                int i10 = this.f17226k[i7] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: m */
    public void m20929m() {
        int[] iArr = new int[this.f17226k.length];
        int i = (this.f17227l - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f17226k[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f17227l;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f17226k = iArr;
    }

    /* renamed from: n */
    public void m20928n(int i) {
        int[] iArr = this.f17226k;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: o */
    public void m20927o(int i, int i2) {
        this.f17226k[i / 32] = i2;
    }

    public String toString() {
        char c;
        int i = this.f17227l;
        StringBuilder sb2 = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f17227l; i2++) {
            if ((i2 & 7) == 0) {
                sb2.append(' ');
            }
            if (m20936d(i2)) {
                c = 'X';
            } else {
                c = '.';
            }
            sb2.append(c);
        }
        return sb2.toString();
    }

    public C7996a(int i) {
        this.f17227l = i;
        this.f17226k = m20930l(i);
    }

    C7996a(int[] iArr, int i) {
        this.f17226k = iArr;
        this.f17227l = i;
    }
}
