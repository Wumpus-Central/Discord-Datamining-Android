package p336s7;

import p117g7.C7466l0;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7570y;
import p228m7.AbstractC10534y;
import p228m7.C10537z;

/* renamed from: s7.h */
/* loaded from: classes7.dex */
final class C12812h implements AbstractC12810g {

    /* renamed from: a */
    private final long[] f28766a;

    /* renamed from: b */
    private final long[] f28767b;

    /* renamed from: c */
    private final long f28768c;

    /* renamed from: d */
    private final long f28769d;

    private C12812h(long[] jArr, long[] jArr2, long j, long j2) {
        this.f28766a = jArr;
        this.f28767b = jArr2;
        this.f28768c = j;
        this.f28769d = j2;
    }

    /* renamed from: a */
    public static C12812h m5423a(long j, long j2, C7466l0.C7467a aVar, C7570y yVar) {
        int i;
        int i2;
        yVar.m22016Q(10);
        int n = yVar.m22002n();
        if (n <= 0) {
            return null;
        }
        int i3 = aVar.f16117d;
        long j3 = n;
        if (i3 >= 32000) {
            i = 1152;
        } else {
            i = 576;
        }
        long I0 = C7557q0.m22198I0(j3, i * 1000000, i3);
        int J = yVar.m22023J();
        int J2 = yVar.m22023J();
        int J3 = yVar.m22023J();
        yVar.m22016Q(2);
        long j4 = j2 + aVar.f16116c;
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        int i4 = 0;
        long j5 = j2;
        while (i4 < J) {
            jArr[i4] = (i4 * I0) / J;
            jArr2[i4] = Math.max(j5, j4);
            if (J3 == 1) {
                i2 = yVar.m22029D();
            } else if (J3 == 2) {
                i2 = yVar.m22023J();
            } else if (J3 == 3) {
                i2 = yVar.m22026G();
            } else if (J3 != 4) {
                return null;
            } else {
                i2 = yVar.m22025H();
            }
            j5 += i2 * J2;
            i4++;
            j4 = j4;
            J2 = J2;
        }
        if (!(j == -1 || j == j5)) {
            C7558r.m22104h("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j5);
        }
        return new C12812h(jArr, jArr2, I0, j5);
    }

    @Override // p336s7.AbstractC12810g
    /* renamed from: c */
    public long mo5420c(long j) {
        return this.f28766a[C7557q0.m22147i(this.f28767b, j, true, true)];
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: f */
    public AbstractC10534y.C10535a mo2208f(long j) {
        int i = C7557q0.m22147i(this.f28766a, j, true, true);
        C10537z zVar = new C10537z(this.f28766a[i], this.f28767b[i]);
        if (zVar.f23296a >= j || i == this.f28766a.length - 1) {
            return new AbstractC10534y.C10535a(zVar);
        }
        int i2 = i + 1;
        return new AbstractC10534y.C10535a(zVar, new C10537z(this.f28766a[i2], this.f28767b[i2]));
    }

    @Override // p336s7.AbstractC12810g
    /* renamed from: g */
    public long mo5419g() {
        return this.f28769d;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: h */
    public boolean mo2207h() {
        return true;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: i */
    public long mo2206i() {
        return this.f28768c;
    }
}
