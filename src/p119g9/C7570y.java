package p119g9;

import java.nio.charset.Charset;
import java.util.Arrays;
import p030bc.C3452d;

/* renamed from: g9.y */
/* loaded from: classes5.dex */
public final class C7570y {

    /* renamed from: a */
    private byte[] f16419a;

    /* renamed from: b */
    private int f16420b;

    /* renamed from: c */
    private int f16421c;

    public C7570y() {
        this.f16419a = C7557q0.f16373f;
    }

    /* renamed from: A */
    public String m22032A(int i) {
        return m22031B(i, C3452d.f5595c);
    }

    /* renamed from: B */
    public String m22031B(int i, Charset charset) {
        String str = new String(this.f16419a, this.f16420b, i, charset);
        this.f16420b += i;
        return str;
    }

    /* renamed from: C */
    public int m22030C() {
        return (m22029D() << 21) | (m22029D() << 14) | (m22029D() << 7) | m22029D();
    }

    /* renamed from: D */
    public int m22029D() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        this.f16420b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: E */
    public int m22028E() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        int i3 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f16420b = i2 + 1 + 2;
        return i3;
    }

    /* renamed from: F */
    public long m22027F() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f16420b = i4 + 1;
        return ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8) | (bArr[i4] & 255);
    }

    /* renamed from: G */
    public int m22026G() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f16420b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: H */
    public int m22025H() {
        int n = m22002n();
        if (n >= 0) {
            return n;
        }
        throw new IllegalStateException("Top bit not zero: " + n);
    }

    /* renamed from: I */
    public long m22024I() {
        long w = m21993w();
        if (w >= 0) {
            return w;
        }
        throw new IllegalStateException("Top bit not zero: " + w);
    }

    /* renamed from: J */
    public int m22023J() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        this.f16420b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: K */
    public long m22022K() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.f16419a[this.f16420b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.f16419a[this.f16420b + i] & 192) == 128) {
                    j = (j << 6) | (b & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f16420b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: L */
    public void m22021L(int i) {
        m22019N(m22014b() < i ? new byte[i] : this.f16419a, i);
    }

    /* renamed from: M */
    public void m22020M(byte[] bArr) {
        m22019N(bArr, bArr.length);
    }

    /* renamed from: N */
    public void m22019N(byte[] bArr, int i) {
        this.f16419a = bArr;
        this.f16421c = i;
        this.f16420b = 0;
    }

    /* renamed from: O */
    public void m22018O(int i) {
        boolean z;
        if (i < 0 || i > this.f16419a.length) {
            z = false;
        } else {
            z = true;
        }
        C7510a.m22371a(z);
        this.f16421c = i;
    }

    /* renamed from: P */
    public void m22017P(int i) {
        boolean z;
        if (i < 0 || i > this.f16421c) {
            z = false;
        } else {
            z = true;
        }
        C7510a.m22371a(z);
        this.f16420b = i;
    }

    /* renamed from: Q */
    public void m22016Q(int i) {
        m22017P(this.f16420b + i);
    }

    /* renamed from: a */
    public int m22015a() {
        return this.f16421c - this.f16420b;
    }

    /* renamed from: b */
    public int m22014b() {
        return this.f16419a.length;
    }

    /* renamed from: c */
    public void m22013c(int i) {
        if (i > m22014b()) {
            this.f16419a = Arrays.copyOf(this.f16419a, i);
        }
    }

    /* renamed from: d */
    public byte[] m22012d() {
        return this.f16419a;
    }

    /* renamed from: e */
    public int m22011e() {
        return this.f16420b;
    }

    /* renamed from: f */
    public int m22010f() {
        return this.f16421c;
    }

    /* renamed from: g */
    public char m22009g() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: h */
    public int m22008h() {
        return this.f16419a[this.f16420b] & 255;
    }

    /* renamed from: i */
    public void m22007i(C7569x xVar, int i) {
        m22006j(xVar.f16415a, 0, i);
        xVar.m22036p(0);
    }

    /* renamed from: j */
    public void m22006j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f16419a, this.f16420b, bArr, i, i2);
        this.f16420b += i2;
    }

    /* renamed from: k */
    public String m22005k(char c) {
        if (m22015a() == 0) {
            return null;
        }
        int i = this.f16420b;
        while (i < this.f16421c && this.f16419a[i] != c) {
            i++;
        }
        byte[] bArr = this.f16419a;
        int i2 = this.f16420b;
        String F = C7557q0.m22205F(bArr, i2, i - i2);
        this.f16420b = i;
        if (i < this.f16421c) {
            this.f16420b = i + 1;
        }
        return F;
    }

    /* renamed from: l */
    public double m22004l() {
        return Double.longBitsToDouble(m21993w());
    }

    /* renamed from: m */
    public float m22003m() {
        return Float.intBitsToFloat(m22002n());
    }

    /* renamed from: n */
    public int m22002n() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f16420b = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    /* renamed from: o */
    public int m22001o() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.f16420b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: p */
    public String m22000p() {
        if (m22015a() == 0) {
            return null;
        }
        int i = this.f16420b;
        while (i < this.f16421c && !C7557q0.m22130q0(this.f16419a[i])) {
            i++;
        }
        int i2 = this.f16420b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f16419a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f16420b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f16419a;
        int i3 = this.f16420b;
        String F = C7557q0.m22205F(bArr2, i3, i - i3);
        this.f16420b = i;
        int i4 = this.f16421c;
        if (i == i4) {
            return F;
        }
        byte[] bArr3 = this.f16419a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f16420b = i5;
            if (i5 == i4) {
                return F;
            }
        }
        int i6 = this.f16420b;
        if (bArr3[i6] == 10) {
            this.f16420b = i6 + 1;
        }
        return F;
    }

    /* renamed from: q */
    public int m21999q() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        this.f16420b = i5 + 1;
        return ((bArr[i5] & 255) << 24) | i6;
    }

    /* renamed from: r */
    public long m21998r() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.f16420b = i8 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48) | ((bArr[i8] & 255) << 56);
    }

    /* renamed from: s */
    public short m21997s() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        this.f16420b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: t */
    public long m21996t() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f16420b = i4 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    /* renamed from: u */
    public int m21995u() {
        int q = m21999q();
        if (q >= 0) {
            return q;
        }
        throw new IllegalStateException("Top bit not zero: " + q);
    }

    /* renamed from: v */
    public int m21994v() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        this.f16420b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: w */
    public long m21993w() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.f16420b = i8 + 1;
        return ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
    }

    /* renamed from: x */
    public String m21992x() {
        return m22005k((char) 0);
    }

    /* renamed from: y */
    public String m21991y(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.f16420b;
        int i4 = (i3 + i) - 1;
        if (i4 >= this.f16421c || this.f16419a[i4] != 0) {
            i2 = i;
        } else {
            i2 = i - 1;
        }
        String F = C7557q0.m22205F(this.f16419a, i3, i2);
        this.f16420b += i;
        return F;
    }

    /* renamed from: z */
    public short m21990z() {
        byte[] bArr = this.f16419a;
        int i = this.f16420b;
        int i2 = i + 1;
        this.f16420b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public C7570y(int i) {
        this.f16419a = new byte[i];
        this.f16421c = i;
    }

    public C7570y(byte[] bArr) {
        this.f16419a = bArr;
        this.f16421c = bArr.length;
    }

    public C7570y(byte[] bArr, int i) {
        this.f16419a = bArr;
        this.f16421c = i;
    }
}
