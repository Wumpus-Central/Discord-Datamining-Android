package p212l8;

import p228m7.C10504d;
import p229m8.C10546h;

/* renamed from: l8.g */
/* loaded from: classes7.dex */
public final class C10359g implements AbstractC10357e {

    /* renamed from: a */
    private final C10504d f22737a;

    /* renamed from: b */
    private final long f22738b;

    public C10359g(C10504d dVar, long j) {
        this.f22737a = dVar;
        this.f22738b = j;
    }

    @Override // p212l8.AbstractC10357e
    /* renamed from: c */
    public long mo12826c(long j) {
        return this.f22737a.f23210e[(int) j] - this.f22738b;
    }

    @Override // p212l8.AbstractC10357e
    /* renamed from: d */
    public long mo12825d(long j, long j2) {
        return this.f22737a.f23209d[(int) j];
    }

    @Override // p212l8.AbstractC10357e
    /* renamed from: e */
    public long mo12824e(long j, long j2) {
        return 0L;
    }

    @Override // p212l8.AbstractC10357e
    /* renamed from: f */
    public long mo12823f(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // p212l8.AbstractC10357e
    /* renamed from: g */
    public C10546h mo12822g(long j) {
        C10504d dVar = this.f22737a;
        int i = (int) j;
        return new C10546h(null, dVar.f23208c[i], dVar.f23207b[i]);
    }

    @Override // p212l8.AbstractC10357e
    /* renamed from: h */
    public long mo12821h(long j, long j2) {
        return this.f22737a.m12998a(j + this.f22738b);
    }

    @Override // p212l8.AbstractC10357e
    /* renamed from: i */
    public int mo12820i(long j) {
        return this.f22737a.f23206a;
    }

    @Override // p212l8.AbstractC10357e
    /* renamed from: j */
    public boolean mo12819j() {
        return true;
    }

    @Override // p212l8.AbstractC10357e
    /* renamed from: k */
    public long mo12818k() {
        return 0L;
    }

    @Override // p212l8.AbstractC10357e
    /* renamed from: l */
    public int mo12817l(long j, long j2) {
        return this.f22737a.f23206a;
    }
}
