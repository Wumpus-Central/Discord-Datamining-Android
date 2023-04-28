package p137hd;

/* renamed from: hd.c */
/* loaded from: classes3.dex */
public final class C7998c {

    /* renamed from: a */
    private final byte[] f17232a;

    /* renamed from: b */
    private int f17233b;

    /* renamed from: c */
    private int f17234c;

    public C7998c(byte[] bArr) {
        this.f17232a = bArr;
    }

    /* renamed from: a */
    public int m20911a() {
        return ((this.f17232a.length - this.f17233b) * 8) - this.f17234c;
    }

    /* renamed from: b */
    public int m20910b() {
        return this.f17234c;
    }

    /* renamed from: c */
    public int m20909c() {
        return this.f17233b;
    }

    /* renamed from: d */
    public int m20908d(int i) {
        int i2;
        if (i <= 0 || i > 32 || i > m20911a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i3 = this.f17234c;
        int i4 = 0;
        if (i3 > 0) {
            int i5 = 8 - i3;
            if (i < i5) {
                i2 = i;
            } else {
                i2 = i5;
            }
            int i6 = i5 - i2;
            byte[] bArr = this.f17232a;
            int i7 = this.f17233b;
            int i8 = (((255 >> (8 - i2)) << i6) & bArr[i7]) >> i6;
            i -= i2;
            int i9 = i3 + i2;
            this.f17234c = i9;
            if (i9 == 8) {
                this.f17234c = 0;
                this.f17233b = i7 + 1;
            }
            i4 = i8;
        }
        if (i <= 0) {
            return i4;
        }
        while (i >= 8) {
            int i10 = i4 << 8;
            byte[] bArr2 = this.f17232a;
            int i11 = this.f17233b;
            i4 = (bArr2[i11] & 255) | i10;
            this.f17233b = i11 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return i4;
        }
        int i12 = 8 - i;
        int i13 = (i4 << i) | ((((255 >> i12) << i12) & this.f17232a[this.f17233b]) >> i12);
        this.f17234c += i;
        return i13;
    }
}
