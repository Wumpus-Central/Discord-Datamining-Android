package p066dd;

/* renamed from: dd.k */
/* loaded from: classes3.dex */
public final class C6442k extends AbstractC6439h {

    /* renamed from: c */
    private final byte[] f13512c;

    /* renamed from: d */
    private final int f13513d;

    /* renamed from: e */
    private final int f13514e;

    /* renamed from: f */
    private final int f13515f;

    /* renamed from: g */
    private final int f13516g;

    public C6442k(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f13512c = bArr;
        this.f13513d = i;
        this.f13514e = i2;
        this.f13515f = i3;
        this.f13516g = i4;
        if (z) {
            m25548h(i5, i6);
        }
    }

    /* renamed from: h */
    private void m25548h(int i, int i2) {
        byte[] bArr = this.f13512c;
        int i3 = (this.f13516g * this.f13513d) + this.f13515f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f13513d;
        }
    }

    @Override // p066dd.AbstractC6439h
    /* renamed from: b */
    public byte[] mo25550b() {
        int d = m25558d();
        int a = m25559a();
        int i = this.f13513d;
        if (d == i && a == this.f13514e) {
            return this.f13512c;
        }
        int i2 = d * a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f13516g * i) + this.f13515f;
        if (d == i) {
            System.arraycopy(this.f13512c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < a; i4++) {
            System.arraycopy(this.f13512c, i3, bArr, i4 * d, d);
            i3 += this.f13513d;
        }
        return bArr;
    }

    @Override // p066dd.AbstractC6439h
    /* renamed from: c */
    public byte[] mo25549c(int i, byte[] bArr) {
        if (i < 0 || i >= m25559a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int d = m25558d();
        if (bArr == null || bArr.length < d) {
            bArr = new byte[d];
        }
        System.arraycopy(this.f13512c, ((i + this.f13516g) * this.f13513d) + this.f13515f, bArr, 0, d);
        return bArr;
    }
}
