package p117g7;

import com.facebook.react.views.text.TypefaceStyle;
import java.nio.ShortBuffer;
import java.util.Arrays;
import p119g9.C7510a;

/* renamed from: g7.p0 */
/* loaded from: classes7.dex */
final class C7475p0 {

    /* renamed from: a */
    private final int f16143a;

    /* renamed from: b */
    private final int f16144b;

    /* renamed from: c */
    private final float f16145c;

    /* renamed from: d */
    private final float f16146d;

    /* renamed from: e */
    private final float f16147e;

    /* renamed from: f */
    private final int f16148f;

    /* renamed from: g */
    private final int f16149g;

    /* renamed from: h */
    private final int f16150h;

    /* renamed from: i */
    private final short[] f16151i;

    /* renamed from: j */
    private short[] f16152j;

    /* renamed from: k */
    private int f16153k;

    /* renamed from: l */
    private short[] f16154l;

    /* renamed from: m */
    private int f16155m;

    /* renamed from: n */
    private short[] f16156n;

    /* renamed from: o */
    private int f16157o;

    /* renamed from: p */
    private int f16158p;

    /* renamed from: q */
    private int f16159q;

    /* renamed from: r */
    private int f16160r;

    /* renamed from: s */
    private int f16161s;

    /* renamed from: t */
    private int f16162t;

    /* renamed from: u */
    private int f16163u;

    /* renamed from: v */
    private int f16164v;

    public C7475p0(int i, int i2, float f, float f2, int i3) {
        this.f16143a = i;
        this.f16144b = i2;
        this.f16145c = f;
        this.f16146d = f2;
        this.f16147e = i / i3;
        this.f16148f = i / TypefaceStyle.NORMAL;
        int i4 = i / 65;
        this.f16149g = i4;
        int i5 = i4 * 2;
        this.f16150h = i5;
        this.f16151i = new short[i5];
        this.f16152j = new short[i5 * i2];
        this.f16154l = new short[i5 * i2];
        this.f16156n = new short[i5 * i2];
    }

    /* renamed from: a */
    private void m22546a(float f, int i) {
        int i2;
        int i3;
        if (this.f16155m != i) {
            int i4 = this.f16143a;
            int i5 = (int) (i4 / f);
            while (true) {
                if (i5 <= 16384 && i4 <= 16384) {
                    break;
                }
                i5 /= 2;
                i4 /= 2;
            }
            m22532o(i);
            int i6 = 0;
            while (true) {
                int i7 = this.f16157o;
                boolean z = true;
                if (i6 < i7 - 1) {
                    while (true) {
                        i2 = this.f16158p;
                        int i8 = (i2 + 1) * i5;
                        i3 = this.f16159q;
                        if (i8 <= i3 * i4) {
                            break;
                        }
                        this.f16154l = m22541f(this.f16154l, this.f16155m, 1);
                        int i9 = 0;
                        while (true) {
                            int i10 = this.f16144b;
                            if (i9 < i10) {
                                this.f16154l[(this.f16155m * i10) + i9] = m22533n(this.f16156n, (i10 * i6) + i9, i4, i5);
                                i9++;
                            }
                        }
                        this.f16159q++;
                        this.f16155m++;
                    }
                    int i11 = i2 + 1;
                    this.f16158p = i11;
                    if (i11 == i4) {
                        this.f16158p = 0;
                        if (i3 != i5) {
                            z = false;
                        }
                        C7510a.m22366f(z);
                        this.f16159q = 0;
                    }
                    i6++;
                } else {
                    m22526u(i7 - 1);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m22545b(float f) {
        int m;
        int i = this.f16153k;
        if (i >= this.f16150h) {
            int i2 = 0;
            do {
                if (this.f16160r > 0) {
                    m = m22544c(i2);
                } else {
                    int g = m22540g(this.f16152j, i2);
                    if (f > 1.0d) {
                        m = g + m22524w(this.f16152j, i2, f, g);
                    } else {
                        m = m22534m(this.f16152j, i2, f, g);
                    }
                }
                i2 += m;
            } while (this.f16150h + i2 <= i);
            m22525v(i2);
        }
    }

    /* renamed from: c */
    private int m22544c(int i) {
        int min = Math.min(this.f16150h, this.f16160r);
        m22543d(this.f16152j, i, min);
        this.f16160r -= min;
        return min;
    }

    /* renamed from: d */
    private void m22543d(short[] sArr, int i, int i2) {
        short[] f = m22541f(this.f16154l, this.f16155m, i2);
        this.f16154l = f;
        int i3 = this.f16144b;
        System.arraycopy(sArr, i * i3, f, this.f16155m * i3, i3 * i2);
        this.f16155m += i2;
    }

    /* renamed from: e */
    private void m22542e(short[] sArr, int i, int i2) {
        int i3 = this.f16150h / i2;
        int i4 = this.f16144b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f16151i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: f */
    private short[] m22541f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f16144b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: g */
    private int m22540g(short[] sArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = this.f16143a;
        if (i5 > 4000) {
            i2 = i5 / 4000;
        } else {
            i2 = 1;
        }
        if (this.f16144b == 1 && i2 == 1) {
            i3 = m22539h(sArr, i, this.f16148f, this.f16149g);
        } else {
            m22542e(sArr, i, i2);
            int h = m22539h(this.f16151i, 0, this.f16148f / i2, this.f16149g / i2);
            if (i2 != 1) {
                int i6 = h * i2;
                int i7 = i2 * 4;
                int i8 = i6 - i7;
                int i9 = i6 + i7;
                int i10 = this.f16148f;
                if (i8 < i10) {
                    i8 = i10;
                }
                int i11 = this.f16149g;
                if (i9 > i11) {
                    i9 = i11;
                }
                if (this.f16144b == 1) {
                    i3 = m22539h(sArr, i, i8, i9);
                } else {
                    m22542e(sArr, i, 1);
                    i3 = m22539h(this.f16151i, 0, i8, i9);
                }
            } else {
                i3 = h;
            }
        }
        if (m22530q(this.f16163u, this.f16164v)) {
            i4 = this.f16161s;
        } else {
            i4 = i3;
        }
        this.f16162t = this.f16163u;
        this.f16161s = i3;
        return i4;
    }

    /* renamed from: h */
    private int m22539h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f16144b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f16163u = i6 / i7;
        this.f16164v = i8 / i5;
        return i7;
    }

    /* renamed from: m */
    private int m22534m(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f16160r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] f2 = m22541f(this.f16154l, this.f16155m, i4);
        this.f16154l = f2;
        int i5 = this.f16144b;
        System.arraycopy(sArr, i * i5, f2, this.f16155m * i5, i5 * i2);
        m22531p(i3, this.f16144b, this.f16154l, this.f16155m + i2, sArr, i + i2, sArr, i);
        this.f16155m += i4;
        return i3;
    }

    /* renamed from: n */
    private short m22533n(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f16144b];
        int i4 = this.f16159q * i2;
        int i5 = this.f16158p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: o */
    private void m22532o(int i) {
        int i2 = this.f16155m - i;
        short[] f = m22541f(this.f16156n, this.f16157o, i2);
        this.f16156n = f;
        short[] sArr = this.f16154l;
        int i3 = this.f16144b;
        System.arraycopy(sArr, i * i3, f, this.f16157o * i3, i3 * i2);
        this.f16155m = i;
        this.f16157o += i2;
    }

    /* renamed from: p */
    private static void m22531p(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: q */
    private boolean m22530q(int i, int i2) {
        if (i == 0 || this.f16161s == 0 || i2 > i * 3 || i * 2 <= this.f16162t * 3) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private void m22529r() {
        int i = this.f16155m;
        float f = this.f16145c;
        float f2 = this.f16146d;
        float f3 = f / f2;
        float f4 = this.f16147e * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            m22545b(f3);
        } else {
            m22543d(this.f16152j, 0, this.f16153k);
            this.f16153k = 0;
        }
        if (f4 != 1.0f) {
            m22546a(f4, i);
        }
    }

    /* renamed from: u */
    private void m22526u(int i) {
        if (i != 0) {
            short[] sArr = this.f16156n;
            int i2 = this.f16144b;
            System.arraycopy(sArr, i * i2, sArr, 0, (this.f16157o - i) * i2);
            this.f16157o -= i;
        }
    }

    /* renamed from: v */
    private void m22525v(int i) {
        int i2 = this.f16153k - i;
        short[] sArr = this.f16152j;
        int i3 = this.f16144b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f16153k = i2;
    }

    /* renamed from: w */
    private int m22524w(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f16160r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] f2 = m22541f(this.f16154l, this.f16155m, i3);
        this.f16154l = f2;
        m22531p(i3, this.f16144b, f2, this.f16155m, sArr, i, sArr, i + i2);
        this.f16155m += i3;
        return i3;
    }

    /* renamed from: i */
    public void m22538i() {
        this.f16153k = 0;
        this.f16155m = 0;
        this.f16157o = 0;
        this.f16158p = 0;
        this.f16159q = 0;
        this.f16160r = 0;
        this.f16161s = 0;
        this.f16162t = 0;
        this.f16163u = 0;
        this.f16164v = 0;
    }

    /* renamed from: j */
    public void m22537j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f16144b, this.f16155m);
        shortBuffer.put(this.f16154l, 0, this.f16144b * min);
        int i = this.f16155m - min;
        this.f16155m = i;
        short[] sArr = this.f16154l;
        int i2 = this.f16144b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: k */
    public int m22536k() {
        return this.f16155m * this.f16144b * 2;
    }

    /* renamed from: l */
    public int m22535l() {
        return this.f16153k * this.f16144b * 2;
    }

    /* renamed from: s */
    public void m22528s() {
        int i;
        int i2 = this.f16153k;
        float f = this.f16145c;
        float f2 = this.f16146d;
        int i3 = this.f16155m + ((int) ((((i2 / (f / f2)) + this.f16157o) / (this.f16147e * f2)) + 0.5f));
        this.f16152j = m22541f(this.f16152j, i2, (this.f16150h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f16150h;
            int i5 = this.f16144b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f16152j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f16153k += i * 2;
        m22529r();
        if (this.f16155m > i3) {
            this.f16155m = i3;
        }
        this.f16153k = 0;
        this.f16160r = 0;
        this.f16157o = 0;
    }

    /* renamed from: t */
    public void m22527t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f16144b;
        int i2 = remaining / i;
        short[] f = m22541f(this.f16152j, this.f16153k, i2);
        this.f16152j = f;
        shortBuffer.get(f, this.f16153k * this.f16144b, ((i * i2) * 2) / 2);
        this.f16153k += i2;
        m22529r();
    }
}
