package p119g9;

/* renamed from: g9.z */
/* loaded from: classes5.dex */
public final class C7571z {

    /* renamed from: a */
    private byte[] f16422a;

    /* renamed from: b */
    private int f16423b;

    /* renamed from: c */
    private int f16424c;

    /* renamed from: d */
    private int f16425d;

    public C7571z(byte[] bArr, int i, int i2) {
        m21981i(bArr, i, i2);
    }

    /* renamed from: a */
    private void m21989a() {
        int i;
        int i2 = this.f16424c;
        C7510a.m22366f(i2 >= 0 && (i2 < (i = this.f16423b) || (i2 == i && this.f16425d == 0)));
    }

    /* renamed from: f */
    private int m21984f() {
        int i = 0;
        int i2 = 0;
        while (!m21986d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = m21985e(i2);
        }
        return i3 + i;
    }

    /* renamed from: j */
    private boolean m21980j(int i) {
        if (2 <= i && i < this.f16423b) {
            byte[] bArr = this.f16422a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m21988b(int i) {
        int i2 = this.f16424c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f16425d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f16423b) {
                break;
            } else if (m21980j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f16423b;
        if (i4 < i6) {
            return true;
        }
        if (i4 == i6 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m21987c() {
        boolean z;
        int i = this.f16424c;
        int i2 = this.f16425d;
        int i3 = 0;
        while (this.f16424c < this.f16423b && !m21986d()) {
            i3++;
        }
        if (this.f16424c == this.f16423b) {
            z = true;
        } else {
            z = false;
        }
        this.f16424c = i;
        this.f16425d = i2;
        if (z || !m21988b((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean m21986d() {
        boolean z;
        if ((this.f16422a[this.f16424c] & (128 >> this.f16425d)) != 0) {
            z = true;
        } else {
            z = false;
        }
        m21979k();
        return z;
    }

    /* renamed from: e */
    public int m21985e(int i) {
        int i2;
        int i3;
        this.f16425d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f16425d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f16425d = i5;
            byte[] bArr = this.f16422a;
            int i6 = this.f16424c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m21980j(i6 + 1)) {
                i3 = 1;
            }
            this.f16424c = i6 + i3;
        }
        byte[] bArr2 = this.f16422a;
        int i7 = this.f16424c;
        int i8 = ((-1) >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f16425d = 0;
            if (!m21980j(i7 + 1)) {
                i3 = 1;
            }
            this.f16424c = i7 + i3;
        }
        m21989a();
        return i8;
    }

    /* renamed from: g */
    public int m21983g() {
        int i;
        int f = m21984f();
        if (f % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return i * ((f + 1) / 2);
    }

    /* renamed from: h */
    public int m21982h() {
        return m21984f();
    }

    /* renamed from: i */
    public void m21981i(byte[] bArr, int i, int i2) {
        this.f16422a = bArr;
        this.f16424c = i;
        this.f16423b = i2;
        this.f16425d = 0;
        m21989a();
    }

    /* renamed from: k */
    public void m21979k() {
        int i = 1;
        int i2 = this.f16425d + 1;
        this.f16425d = i2;
        if (i2 == 8) {
            this.f16425d = 0;
            int i3 = this.f16424c;
            if (m21980j(i3 + 1)) {
                i = 2;
            }
            this.f16424c = i3 + i;
        }
        m21989a();
    }

    /* renamed from: l */
    public void m21978l(int i) {
        int i2 = this.f16424c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f16424c = i4;
        int i5 = this.f16425d + (i - (i3 * 8));
        this.f16425d = i5;
        if (i5 > 7) {
            this.f16424c = i4 + 1;
            this.f16425d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f16424c) {
                m21989a();
                return;
            } else if (m21980j(i2)) {
                this.f16424c++;
                i2 += 2;
            }
        }
    }
}
