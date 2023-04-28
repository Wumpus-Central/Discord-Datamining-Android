package p398w7;

import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7544l0;
import p119g9.C7557q0;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.v */
/* loaded from: classes7.dex */
public final class C13798v implements AbstractC13755b0 {

    /* renamed from: a */
    private C6722k f31051a;

    /* renamed from: b */
    private C7544l0 f31052b;

    /* renamed from: c */
    private AbstractC10500b0 f31053c;

    public C13798v(String str) {
        this.f31051a = new C6722k.C6724b().m24488e0(str).m24519E();
    }

    /* renamed from: c */
    private void m2645c() {
        C7510a.m22364h(this.f31052b);
        C7557q0.m22145j(this.f31053c);
    }

    @Override // p398w7.AbstractC13755b0
    /* renamed from: a */
    public void mo2647a(C7544l0 l0Var, AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        this.f31052b = l0Var;
        dVar.m2731a();
        AbstractC10500b0 e = kVar.mo7937e(dVar.m2729c(), 5);
        this.f31053c = e;
        e.mo12388d(this.f31051a);
    }

    @Override // p398w7.AbstractC13755b0
    /* renamed from: b */
    public void mo2646b(C7570y yVar) {
        m2645c();
        long e = this.f31052b.m22261e();
        if (e != -9223372036854775807L) {
            C6722k kVar = this.f31051a;
            if (e != kVar.f14333z) {
                C6722k E = kVar.m24531a().m24480i0(e).m24519E();
                this.f31051a = E;
                this.f31053c.mo12388d(E);
            }
            int a = yVar.m22015a();
            this.f31053c.mo12386f(yVar, a);
            this.f31053c.mo12382c(this.f31052b.m22262d(), 1, a, 0, null);
        }
    }
}
