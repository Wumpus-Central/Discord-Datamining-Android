package p228m7;

import p119g9.C7557q0;
import p228m7.AbstractC10534y;

/* renamed from: m7.e */
/* loaded from: classes7.dex */
public class C10510e implements AbstractC10534y {

    /* renamed from: a */
    private final long f23234a;

    /* renamed from: b */
    private final long f23235b;

    /* renamed from: c */
    private final int f23236c;

    /* renamed from: d */
    private final long f23237d;

    /* renamed from: e */
    private final int f23238e;

    /* renamed from: f */
    private final long f23239f;

    public C10510e(long j, long j2, int i, int i2) {
        this.f23234a = j;
        this.f23235b = j2;
        this.f23236c = i2 == -1 ? 1 : i2;
        this.f23238e = i;
        if (j == -1) {
            this.f23237d = -1L;
            this.f23239f = -9223372036854775807L;
            return;
        }
        this.f23237d = j - j2;
        this.f23239f = m12983d(j, j2, i);
    }

    /* renamed from: a */
    private long m12985a(long j) {
        int i = this.f23236c;
        return this.f23235b + C7557q0.m22127s((((j * this.f23238e) / 8000000) / i) * i, 0L, this.f23237d - i);
    }

    /* renamed from: d */
    private static long m12983d(long j, long j2, int i) {
        return ((Math.max(0L, j - j2) * 8) * 1000000) / i;
    }

    /* renamed from: b */
    public long m12984b(long j) {
        return m12983d(j, this.f23235b, this.f23238e);
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: f */
    public AbstractC10534y.C10535a mo2208f(long j) {
        if (this.f23237d == -1) {
            return new AbstractC10534y.C10535a(new C10537z(0L, this.f23235b));
        }
        long a = m12985a(j);
        long b = m12984b(a);
        C10537z zVar = new C10537z(b, a);
        if (b < j) {
            int i = this.f23236c;
            if (i + a < this.f23234a) {
                long j2 = a + i;
                return new AbstractC10534y.C10535a(zVar, new C10537z(m12984b(j2), j2));
            }
        }
        return new AbstractC10534y.C10535a(zVar);
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: h */
    public boolean mo2207h() {
        return this.f23237d != -1;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: i */
    public long mo2206i() {
        return this.f23239f;
    }
}
