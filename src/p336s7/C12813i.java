package p336s7;

import p117g7.C7466l0;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7570y;
import p228m7.AbstractC10534y;
import p228m7.C10537z;

/* renamed from: s7.i */
/* loaded from: classes7.dex */
final class C12813i implements AbstractC12810g {

    /* renamed from: a */
    private final long f28770a;

    /* renamed from: b */
    private final int f28771b;

    /* renamed from: c */
    private final long f28772c;

    /* renamed from: d */
    private final long f28773d;

    /* renamed from: e */
    private final long f28774e;

    /* renamed from: f */
    private final long[] f28775f;

    private C12813i(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    /* renamed from: a */
    public static C12813i m5422a(long j, long j2, C7466l0.C7467a aVar, C7570y yVar) {
        int H;
        int i = aVar.f16120g;
        int i2 = aVar.f16117d;
        int n = yVar.m22002n();
        if ((n & 1) != 1 || (H = yVar.m22025H()) == 0) {
            return null;
        }
        long I0 = C7557q0.m22198I0(H, i * 1000000, i2);
        if ((n & 6) != 6) {
            return new C12813i(j2, aVar.f16116c, I0);
        }
        long F = yVar.m22027F();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = yVar.m22029D();
        }
        if (j != -1) {
            long j3 = j2 + F;
            if (j != j3) {
                C7558r.m22104h("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new C12813i(j2, aVar.f16116c, I0, F, jArr);
    }

    /* renamed from: b */
    private long m5421b(int i) {
        return (this.f28772c * i) / 100;
    }

    @Override // p336s7.AbstractC12810g
    /* renamed from: c */
    public long mo5420c(long j) {
        long j2;
        double d;
        long j3 = j - this.f28770a;
        if (!mo2207h() || j3 <= this.f28771b) {
            return 0L;
        }
        long[] jArr = (long[]) C7510a.m22364h(this.f28775f);
        double d2 = (j3 * 256.0d) / this.f28773d;
        int i = C7557q0.m22147i(jArr, (long) d2, true, true);
        long b = m5421b(i);
        long j4 = jArr[i];
        int i2 = i + 1;
        long b2 = m5421b(i2);
        if (i == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i2];
        }
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (d2 - j4) / (j2 - j4);
        }
        return b + Math.round(d * (b2 - b));
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: f */
    public AbstractC10534y.C10535a mo2208f(long j) {
        double d;
        if (!mo2207h()) {
            return new AbstractC10534y.C10535a(new C10537z(0L, this.f28770a + this.f28771b));
        }
        long s = C7557q0.m22127s(j, 0L, this.f28772c);
        double d2 = (s * 100.0d) / this.f28772c;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = (long[]) C7510a.m22364h(this.f28775f);
                double d4 = jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = jArr[i + 1];
                }
                d3 = d4 + ((d2 - i) * (d - d4));
            }
        }
        return new AbstractC10534y.C10535a(new C10537z(s, this.f28770a + C7557q0.m22127s(Math.round((d3 / 256.0d) * this.f28773d), this.f28771b, this.f28773d - 1)));
    }

    @Override // p336s7.AbstractC12810g
    /* renamed from: g */
    public long mo5419g() {
        return this.f28774e;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: h */
    public boolean mo2207h() {
        return this.f28775f != null;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: i */
    public long mo2206i() {
        return this.f28772c;
    }

    private C12813i(long j, int i, long j2, long j3, long[] jArr) {
        this.f28770a = j;
        this.f28771b = i;
        this.f28772c = j2;
        this.f28775f = jArr;
        this.f28773d = j3;
        this.f28774e = j3 != -1 ? j + j3 : -1L;
    }
}
