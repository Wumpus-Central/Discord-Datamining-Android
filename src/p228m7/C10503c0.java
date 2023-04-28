package p228m7;

import p119g9.C7510a;

/* renamed from: m7.c0 */
/* loaded from: classes7.dex */
public final class C10503c0 {

    /* renamed from: a */
    private final byte[] f23202a;

    /* renamed from: b */
    private final int f23203b;

    /* renamed from: c */
    private int f23204c;

    /* renamed from: d */
    private int f23205d;

    public C10503c0(byte[] bArr) {
        this.f23202a = bArr;
        this.f23203b = bArr.length;
    }

    /* renamed from: a */
    private void m13003a() {
        int i;
        int i2 = this.f23204c;
        C7510a.m22366f(i2 >= 0 && (i2 < (i = this.f23203b) || (i2 == i && this.f23205d == 0)));
    }

    /* renamed from: b */
    public int m13002b() {
        return (this.f23204c * 8) + this.f23205d;
    }

    /* renamed from: c */
    public boolean m13001c() {
        boolean z;
        if ((((this.f23202a[this.f23204c] & 255) >> this.f23205d) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        m12999e(1);
        return z;
    }

    /* renamed from: d */
    public int m13000d(int i) {
        int i2 = this.f23204c;
        int min = Math.min(i, 8 - this.f23205d);
        int i3 = i2 + 1;
        int i4 = ((this.f23202a[i2] & 255) >> this.f23205d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f23202a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m12999e(i);
        return i5;
    }

    /* renamed from: e */
    public void m12999e(int i) {
        int i2 = i / 8;
        int i3 = this.f23204c + i2;
        this.f23204c = i3;
        int i4 = this.f23205d + (i - (i2 * 8));
        this.f23205d = i4;
        if (i4 > 7) {
            this.f23204c = i3 + 1;
            this.f23205d = i4 - 8;
        }
        m13003a();
    }
}
