package p285pd;

import com.facebook.react.uimanager.ViewDefaults;
import com.google.zxing.Result;
import java.util.Arrays;
import java.util.Map;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;
import p137hd.C7996a;

/* renamed from: pd.a */
/* loaded from: classes3.dex */
public final class C11621a extends AbstractC11631k {

    /* renamed from: d */
    static final char[] f25905d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    static final int[] f25906e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    private static final char[] f25907f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f25908a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f25909b = new int[80];

    /* renamed from: c */
    private int f25910c = 0;

    /* renamed from: g */
    static boolean m9231g(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m9230h(int i) {
        int[] iArr = this.f25909b;
        int i2 = this.f25910c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f25910c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[i3 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f25909b = iArr2;
        }
    }

    /* renamed from: i */
    private int m9229i() {
        for (int i = 1; i < this.f25910c; i += 2) {
            int k = m9227k(i);
            if (k != -1 && m9231g(f25907f, f25905d[k])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f25909b[i3];
                }
                if (i == 1 || this.f25909b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw C6441j.m25551a();
    }

    /* renamed from: j */
    private void m9228j(C7996a aVar) {
        int i = 0;
        this.f25910c = 0;
        int h = aVar.m20933h(0);
        int j = aVar.m20932j();
        if (h < j) {
            boolean z = true;
            while (h < j) {
                if (aVar.m20936d(h) != z) {
                    i++;
                } else {
                    m9230h(i);
                    z = !z;
                    i = 1;
                }
                h++;
            }
            m9230h(i);
            return;
        }
        throw C6441j.m25551a();
    }

    /* renamed from: k */
    private int m9227k(int i) {
        int i2;
        int i3 = i + 7;
        if (i3 >= this.f25910c) {
            return -1;
        }
        int[] iArr = this.f25909b;
        int i4 = ViewDefaults.NUMBER_OF_LINES;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        for (int i8 = i; i8 < i3; i8 += 2) {
            int i9 = iArr[i8];
            if (i9 < i6) {
                i6 = i9;
            }
            if (i9 > i7) {
                i7 = i9;
            }
        }
        int i10 = (i6 + i7) / 2;
        int i11 = 0;
        for (int i12 = i + 1; i12 < i3; i12 += 2) {
            int i13 = iArr[i12];
            if (i13 < i4) {
                i4 = i13;
            }
            if (i13 > i11) {
                i11 = i13;
            }
        }
        int i14 = (i4 + i11) / 2;
        int i15 = 128;
        int i16 = 0;
        for (int i17 = 0; i17 < 7; i17++) {
            if ((i17 & 1) == 0) {
                i2 = i10;
            } else {
                i2 = i14;
            }
            i15 >>= 1;
            if (iArr[i + i17] > i2) {
                i16 |= i15;
            }
        }
        while (true) {
            int[] iArr2 = f25906e;
            if (i5 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i5] == i16) {
                return i5;
            }
            i5++;
        }
    }

    /* renamed from: l */
    private void m9226l(int i) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f25908a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f25906e[this.f25908a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f25909b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            int i10 = iArr[i9];
            int i11 = iArr2[i9];
            float f = ((iArr[i8] / iArr2[i8]) + (i10 / i11)) / 2.0f;
            fArr2[i9] = f;
            fArr[i8] = f;
            fArr[i9] = ((i10 * 2.0f) + 1.5f) / i11;
        }
        loop3: while (true) {
            int i12 = f25906e[this.f25908a.charAt(i2)];
            for (int i13 = 6; i13 >= 0; i13--) {
                int i14 = (i13 & 1) + ((i12 & 1) << 1);
                float f2 = this.f25909b[i + i13];
                if (f2 < fArr2[i14] || f2 > fArr[i14]) {
                    break loop3;
                }
                i12 >>= 1;
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw C6441j.m25551a();
    }

    @Override // p285pd.AbstractC11631k
    /* renamed from: b */
    public Result mo6515b(int i, C7996a aVar, Map<EnumC6436e, ?> map) {
        Arrays.fill(this.f25909b, 0);
        m9228j(aVar);
        int i2 = m9229i();
        this.f25908a.setLength(0);
        int i3 = i2;
        do {
            int k = m9227k(i3);
            if (k != -1) {
                this.f25908a.append((char) k);
                i3 += 8;
                if (this.f25908a.length() > 1 && m9231g(f25907f, f25905d[k])) {
                    break;
                }
            } else {
                throw C6441j.m25551a();
            }
        } while (i3 < this.f25910c);
        int i4 = i3 - 1;
        int i5 = this.f25909b[i4];
        int i6 = 0;
        for (int i7 = -8; i7 < -1; i7++) {
            i6 += this.f25909b[i3 + i7];
        }
        if (i3 >= this.f25910c || i5 >= i6 / 2) {
            m9226l(i2);
            for (int i8 = 0; i8 < this.f25908a.length(); i8++) {
                StringBuilder sb2 = this.f25908a;
                sb2.setCharAt(i8, f25905d[sb2.charAt(i8)]);
            }
            char charAt = this.f25908a.charAt(0);
            char[] cArr = f25907f;
            if (m9231g(cArr, charAt)) {
                StringBuilder sb3 = this.f25908a;
                if (!m9231g(cArr, sb3.charAt(sb3.length() - 1))) {
                    throw C6441j.m25551a();
                } else if (this.f25908a.length() > 3) {
                    if (map == null || !map.containsKey(EnumC6436e.RETURN_CODABAR_START_END)) {
                        StringBuilder sb4 = this.f25908a;
                        sb4.deleteCharAt(sb4.length() - 1);
                        this.f25908a.deleteCharAt(0);
                    }
                    int i9 = 0;
                    for (int i10 = 0; i10 < i2; i10++) {
                        i9 += this.f25909b[i10];
                    }
                    float f = i9;
                    while (i2 < i4) {
                        i9 += this.f25909b[i2];
                        i2++;
                    }
                    float f2 = i;
                    return new Result(this.f25908a.toString(), null, new C6446o[]{new C6446o(f, f2), new C6446o(i9, f2)}, EnumC6432a.CODABAR);
                } else {
                    throw C6441j.m25551a();
                }
            } else {
                throw C6441j.m25551a();
            }
        } else {
            throw C6441j.m25551a();
        }
    }
}
