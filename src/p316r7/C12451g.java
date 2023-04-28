package p316r7;

import p228m7.AbstractC10515j;

/* renamed from: r7.g */
/* loaded from: classes7.dex */
final class C12451g {

    /* renamed from: d */
    private static final long[] f28067d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f28068a = new byte[8];

    /* renamed from: b */
    private int f28069b;

    /* renamed from: c */
    private int f28070c;

    /* renamed from: a */
    public static long m6704a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f28067d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: c */
    public static int m6702c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f28067d;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & i) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public int m6703b() {
        return this.f28070c;
    }

    /* renamed from: d */
    public long m6701d(AbstractC10515j jVar, boolean z, boolean z2, int i) {
        if (this.f28069b == 0) {
            if (!jVar.mo12935g(this.f28068a, 0, 1, z)) {
                return -1L;
            }
            int c = m6702c(this.f28068a[0] & 255);
            this.f28070c = c;
            if (c != -1) {
                this.f28069b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f28070c;
        if (i2 > i) {
            this.f28069b = 0;
            return -2L;
        }
        if (i2 != 1) {
            jVar.readFully(this.f28068a, 1, i2 - 1);
        }
        this.f28069b = 0;
        return m6704a(this.f28068a, this.f28070c, z2);
    }

    /* renamed from: e */
    public void m6700e() {
        this.f28069b = 0;
        this.f28070c = 0;
    }
}
