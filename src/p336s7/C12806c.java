package p336s7;

import android.util.Pair;
import p079e7.C6713c;
import p080e8.C6756k;
import p119g9.C7557q0;
import p228m7.AbstractC10534y;
import p228m7.C10537z;

/* renamed from: s7.c */
/* loaded from: classes7.dex */
final class C12806c implements AbstractC12810g {

    /* renamed from: a */
    private final long[] f28741a;

    /* renamed from: b */
    private final long[] f28742b;

    /* renamed from: c */
    private final long f28743c;

    private C12806c(long[] jArr, long[] jArr2, long j) {
        this.f28741a = jArr;
        this.f28742b = jArr2;
        this.f28743c = j == -9223372036854775807L ? C6713c.m24566c(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    public static C12806c m5444a(long j, C6756k kVar, long j2) {
        int length = kVar.f14409o.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += kVar.f14407m + kVar.f14409o[i3];
            j3 += kVar.f14408n + kVar.f14410p[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C12806c(jArr, jArr2, j2);
    }

    /* renamed from: b */
    private static Pair<Long, Long> m5443b(long j, long[] jArr, long[] jArr2) {
        double d;
        int i = C7557q0.m22147i(jArr, j, true, true);
        long j2 = jArr[i];
        long j3 = jArr2[i];
        int i2 = i + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i2];
        long j5 = jArr2[i2];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // p336s7.AbstractC12810g
    /* renamed from: c */
    public long mo5420c(long j) {
        return C6713c.m24566c(((Long) m5443b(j, this.f28741a, this.f28742b).second).longValue());
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: f */
    public AbstractC10534y.C10535a mo2208f(long j) {
        Pair<Long, Long> b = m5443b(C6713c.m24565d(C7557q0.m22127s(j, 0L, this.f28743c)), this.f28742b, this.f28741a);
        return new AbstractC10534y.C10535a(new C10537z(C6713c.m24566c(((Long) b.first).longValue()), ((Long) b.second).longValue()));
    }

    @Override // p336s7.AbstractC12810g
    /* renamed from: g */
    public long mo5419g() {
        return -1L;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: h */
    public boolean mo2207h() {
        return true;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: i */
    public long mo2206i() {
        return this.f28743c;
    }
}
