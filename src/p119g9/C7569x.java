package p119g9;

import java.nio.charset.Charset;

/* renamed from: g9.x */
/* loaded from: classes5.dex */
public final class C7569x {

    /* renamed from: a */
    public byte[] f16415a;

    /* renamed from: b */
    private int f16416b;

    /* renamed from: c */
    private int f16417c;

    /* renamed from: d */
    private int f16418d;

    public C7569x() {
        this.f16415a = C7557q0.f16373f;
    }

    /* renamed from: a */
    private void m22051a() {
        int i;
        int i2 = this.f16416b;
        C7510a.m22366f(i2 >= 0 && (i2 < (i = this.f16418d) || (i2 == i && this.f16417c == 0)));
    }

    /* renamed from: b */
    public int m22050b() {
        return ((this.f16418d - this.f16416b) * 8) - this.f16417c;
    }

    /* renamed from: c */
    public void m22049c() {
        if (this.f16417c != 0) {
            this.f16417c = 0;
            this.f16416b++;
            m22051a();
        }
    }

    /* renamed from: d */
    public int m22048d() {
        boolean z;
        if (this.f16417c == 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        return this.f16416b;
    }

    /* renamed from: e */
    public int m22047e() {
        return (this.f16416b * 8) + this.f16417c;
    }

    /* renamed from: f */
    public void m22046f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f16417c, i2);
        int i3 = this.f16417c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f16415a;
        int i5 = this.f16416b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = i2 - min;
        bArr[i5] = (byte) (b | ((i >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f16415a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f16415a;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | b2);
        m22034r(i2);
        m22051a();
    }

    /* renamed from: g */
    public boolean m22045g() {
        boolean z;
        if ((this.f16415a[this.f16416b] & (128 >> this.f16417c)) != 0) {
            z = true;
        } else {
            z = false;
        }
        m22035q();
        return z;
    }

    /* renamed from: h */
    public int m22044h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f16417c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f16417c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f16417c = i4;
            byte[] bArr = this.f16415a;
            int i5 = this.f16416b;
            this.f16416b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f16415a;
        int i6 = this.f16416b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f16417c = 0;
            this.f16416b = i6 + 1;
        }
        m22051a();
        return i7;
    }

    /* renamed from: i */
    public void m22043i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f16415a;
            int i4 = this.f16416b;
            int i5 = i4 + 1;
            this.f16416b = i5;
            byte b = bArr2[i4];
            int i6 = this.f16417c;
            byte b2 = (byte) (b << i6);
            bArr[i] = b2;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i3] & (255 >> i7));
            bArr[i3] = b3;
            int i8 = this.f16417c;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.f16415a;
                int i9 = this.f16416b;
                this.f16416b = i9 + 1;
                bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                this.f16417c = i8 - 8;
            }
            int i10 = this.f16417c + i7;
            this.f16417c = i10;
            byte[] bArr4 = this.f16415a;
            int i11 = this.f16416b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.f16417c = 0;
                this.f16416b = i11 + 1;
            }
            m22051a();
        }
    }

    /* renamed from: j */
    public long m22042j(int i) {
        if (i <= 32) {
            return C7557q0.m22172V0(m22044h(i));
        }
        return C7557q0.m22176T0(m22044h(i - 32), m22044h(32));
    }

    /* renamed from: k */
    public void m22041k(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.f16417c == 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        System.arraycopy(this.f16415a, this.f16416b, bArr, i, i2);
        this.f16416b += i2;
        m22051a();
    }

    /* renamed from: l */
    public String m22040l(int i, Charset charset) {
        byte[] bArr = new byte[i];
        m22041k(bArr, 0, i);
        return new String(bArr, charset);
    }

    /* renamed from: m */
    public void m22039m(C7570y yVar) {
        m22037o(yVar.m22012d(), yVar.m22010f());
        m22036p(yVar.m22011e() * 8);
    }

    /* renamed from: n */
    public void m22038n(byte[] bArr) {
        m22037o(bArr, bArr.length);
    }

    /* renamed from: o */
    public void m22037o(byte[] bArr, int i) {
        this.f16415a = bArr;
        this.f16416b = 0;
        this.f16417c = 0;
        this.f16418d = i;
    }

    /* renamed from: p */
    public void m22036p(int i) {
        int i2 = i / 8;
        this.f16416b = i2;
        this.f16417c = i - (i2 * 8);
        m22051a();
    }

    /* renamed from: q */
    public void m22035q() {
        int i = this.f16417c + 1;
        this.f16417c = i;
        if (i == 8) {
            this.f16417c = 0;
            this.f16416b++;
        }
        m22051a();
    }

    /* renamed from: r */
    public void m22034r(int i) {
        int i2 = i / 8;
        int i3 = this.f16416b + i2;
        this.f16416b = i3;
        int i4 = this.f16417c + (i - (i2 * 8));
        this.f16417c = i4;
        if (i4 > 7) {
            this.f16416b = i3 + 1;
            this.f16417c = i4 - 8;
        }
        m22051a();
    }

    /* renamed from: s */
    public void m22033s(int i) {
        boolean z;
        if (this.f16417c == 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        this.f16416b += i;
        m22051a();
    }

    public C7569x(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C7569x(byte[] bArr, int i) {
        this.f16415a = bArr;
        this.f16418d = i;
    }
}
