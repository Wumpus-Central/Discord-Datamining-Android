package p418x7;

import p119g9.C7557q0;
import p228m7.AbstractC10534y;
import p228m7.C10537z;

/* renamed from: x7.e */
/* loaded from: classes7.dex */
final class C13948e implements AbstractC10534y {

    /* renamed from: a */
    private final C13945c f31442a;

    /* renamed from: b */
    private final int f31443b;

    /* renamed from: c */
    private final long f31444c;

    /* renamed from: d */
    private final long f31445d;

    /* renamed from: e */
    private final long f31446e;

    public C13948e(C13945c cVar, int i, long j, long j2) {
        this.f31442a = cVar;
        this.f31443b = i;
        this.f31444c = j;
        long j3 = (j2 - j) / cVar.f31437e;
        this.f31445d = j3;
        this.f31446e = m2209a(j3);
    }

    /* renamed from: a */
    private long m2209a(long j) {
        return C7557q0.m22198I0(j * this.f31443b, 1000000L, this.f31442a.f31435c);
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: f */
    public AbstractC10534y.C10535a mo2208f(long j) {
        long s = C7557q0.m22127s((this.f31442a.f31435c * j) / (this.f31443b * 1000000), 0L, this.f31445d - 1);
        long j2 = this.f31444c + (this.f31442a.f31437e * s);
        long a = m2209a(s);
        C10537z zVar = new C10537z(a, j2);
        if (a >= j || s == this.f31445d - 1) {
            return new AbstractC10534y.C10535a(zVar);
        }
        long j3 = s + 1;
        return new AbstractC10534y.C10535a(zVar, new C10537z(m2209a(j3), this.f31444c + (this.f31442a.f31437e * j3)));
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: h */
    public boolean mo2207h() {
        return true;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: i */
    public long mo2206i() {
        return this.f31446e;
    }
}
