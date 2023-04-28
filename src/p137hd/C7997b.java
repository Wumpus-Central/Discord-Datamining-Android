package p137hd;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Arrays;

/* renamed from: hd.b */
/* loaded from: classes3.dex */
public final class C7997b implements Cloneable {

    /* renamed from: k */
    private final int f17228k;

    /* renamed from: l */
    private final int f17229l;

    /* renamed from: m */
    private final int f17230m;

    /* renamed from: n */
    private final int[] f17231n;

    public C7997b(int i) {
        this(i, i);
    }

    /* renamed from: a */
    private String m20926a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb2 = new StringBuilder(this.f17229l * (this.f17228k + 1));
        for (int i = 0; i < this.f17229l; i++) {
            for (int i2 = 0; i2 < this.f17228k; i2++) {
                if (m20923e(i2, i)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb2.append(str4);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public C7997b clone() {
        return new C7997b(this.f17228k, this.f17229l, this.f17230m, (int[]) this.f17231n.clone());
    }

    /* renamed from: d */
    public void m20924d(int i, int i2) {
        int i3 = (i2 * this.f17230m) + (i / 32);
        int[] iArr = this.f17231n;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: e */
    public boolean m20923e(int i, int i2) {
        if (((this.f17231n[(i2 * this.f17230m) + (i / 32)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7997b)) {
            return false;
        }
        C7997b bVar = (C7997b) obj;
        if (this.f17228k == bVar.f17228k && this.f17229l == bVar.f17229l && this.f17230m == bVar.f17230m && Arrays.equals(this.f17231n, bVar.f17231n)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int[] m20922f() {
        int length = this.f17231n.length - 1;
        while (length >= 0 && this.f17231n[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f17230m;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f17231n[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    /* renamed from: h */
    public int[] m20921h() {
        int i = this.f17228k;
        int i2 = this.f17229l;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f17229l; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f17230m;
                if (i6 < i7) {
                    int i8 = this.f17231n[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 << 5;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public int hashCode() {
        int i = this.f17228k;
        return (((((((i * 31) + i) * 31) + this.f17229l) * 31) + this.f17230m) * 31) + Arrays.hashCode(this.f17231n);
    }

    /* renamed from: j */
    public int m20920j() {
        return this.f17229l;
    }

    /* renamed from: k */
    public C7996a m20919k(int i, C7996a aVar) {
        if (aVar == null || aVar.m20932j() < this.f17228k) {
            aVar = new C7996a(this.f17228k);
        } else {
            aVar.m20938a();
        }
        int i2 = i * this.f17230m;
        for (int i3 = 0; i3 < this.f17230m; i3++) {
            aVar.m20927o(i3 << 5, this.f17231n[i2 + i3]);
        }
        return aVar;
    }

    /* renamed from: l */
    public int[] m20918l() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f17231n;
            if (i >= iArr.length || iArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f17230m;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: m */
    public int m20917m() {
        return this.f17228k;
    }

    /* renamed from: n */
    public void m20916n() {
        int m = m20917m();
        int j = m20920j();
        C7996a aVar = new C7996a(m);
        C7996a aVar2 = new C7996a(m);
        for (int i = 0; i < (j + 1) / 2; i++) {
            aVar = m20919k(i, aVar);
            int i2 = (j - 1) - i;
            aVar2 = m20919k(i2, aVar2);
            aVar.m20929m();
            aVar2.m20929m();
            m20913r(i, aVar2);
            m20913r(i2, aVar);
        }
    }

    /* renamed from: o */
    public void m20915o(int i, int i2) {
        int i3 = (i2 * this.f17230m) + (i / 32);
        int[] iArr = this.f17231n;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: q */
    public void m20914q(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f17229l || i5 > this.f17228k) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f17230m * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f17231n;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: r */
    public void m20913r(int i, C7996a aVar) {
        int[] e = aVar.m20935e();
        int[] iArr = this.f17231n;
        int i2 = this.f17230m;
        System.arraycopy(e, 0, iArr, i * i2, i2);
    }

    /* renamed from: s */
    public String m20912s(String str, String str2) {
        return m20926a(str, str2, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }

    public String toString() {
        return m20912s("X ", "  ");
    }

    public C7997b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f17228k = i;
        this.f17229l = i2;
        int i3 = (i + 31) / 32;
        this.f17230m = i3;
        this.f17231n = new int[i3 * i2];
    }

    private C7997b(int i, int i2, int i3, int[] iArr) {
        this.f17228k = i;
        this.f17229l = i2;
        this.f17230m = i3;
        this.f17231n = iArr;
    }
}
