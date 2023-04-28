package p336s7;

import p119g9.C7557q0;
import p119g9.C7560s;
import p228m7.AbstractC10534y;
import p228m7.C10537z;

/* renamed from: s7.b */
/* loaded from: classes7.dex */
final class C12805b implements AbstractC12810g {

    /* renamed from: a */
    private final long f28737a;

    /* renamed from: b */
    private final C7560s f28738b;

    /* renamed from: c */
    private final C7560s f28739c;

    /* renamed from: d */
    private long f28740d;

    public C12805b(long j, long j2, long j3) {
        this.f28740d = j;
        this.f28737a = j3;
        C7560s sVar = new C7560s();
        this.f28738b = sVar;
        C7560s sVar2 = new C7560s();
        this.f28739c = sVar2;
        sVar.m22094a(0L);
        sVar2.m22094a(j2);
    }

    /* renamed from: a */
    public boolean m5447a(long j) {
        C7560s sVar = this.f28738b;
        return j - sVar.m22093b(sVar.m22092c() - 1) < 100000;
    }

    /* renamed from: b */
    public void m5446b(long j, long j2) {
        if (!m5447a(j)) {
            this.f28738b.m22094a(j);
            this.f28739c.m22094a(j2);
        }
    }

    @Override // p336s7.AbstractC12810g
    /* renamed from: c */
    public long mo5420c(long j) {
        return this.f28738b.m22093b(C7557q0.m22153f(this.f28739c, j, true, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m5445d(long j) {
        this.f28740d = j;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: f */
    public AbstractC10534y.C10535a mo2208f(long j) {
        int f = C7557q0.m22153f(this.f28738b, j, true, true);
        C10537z zVar = new C10537z(this.f28738b.m22093b(f), this.f28739c.m22093b(f));
        if (zVar.f23296a == j || f == this.f28738b.m22092c() - 1) {
            return new AbstractC10534y.C10535a(zVar);
        }
        int i = f + 1;
        return new AbstractC10534y.C10535a(zVar, new C10537z(this.f28738b.m22093b(i), this.f28739c.m22093b(i)));
    }

    @Override // p336s7.AbstractC12810g
    /* renamed from: g */
    public long mo5419g() {
        return this.f28737a;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: h */
    public boolean mo2207h() {
        return true;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: i */
    public long mo2206i() {
        return this.f28740d;
    }
}
