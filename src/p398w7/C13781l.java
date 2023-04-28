package p398w7;

import java.util.Collections;
import java.util.List;
import p079e7.C6722k;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.l */
/* loaded from: classes7.dex */
public final class C13781l implements AbstractC13782m {

    /* renamed from: a */
    private final List<AbstractC13772i0.C13773a> f30877a;

    /* renamed from: b */
    private final AbstractC10500b0[] f30878b;

    /* renamed from: c */
    private boolean f30879c;

    /* renamed from: d */
    private int f30880d;

    /* renamed from: e */
    private int f30881e;

    /* renamed from: f */
    private long f30882f;

    public C13781l(List<AbstractC13772i0.C13773a> list) {
        this.f30877a = list;
        this.f30878b = new AbstractC10500b0[list.size()];
    }

    /* renamed from: a */
    private boolean m2713a(C7570y yVar, int i) {
        if (yVar.m22015a() == 0) {
            return false;
        }
        if (yVar.m22029D() != i) {
            this.f30879c = false;
        }
        this.f30880d--;
        return this.f30879c;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        AbstractC10500b0[] b0VarArr;
        if (!this.f30879c) {
            return;
        }
        if (this.f30880d != 2 || m2713a(yVar, 32)) {
            if (this.f30880d != 1 || m2713a(yVar, 0)) {
                int e = yVar.m22011e();
                int a = yVar.m22015a();
                for (AbstractC10500b0 b0Var : this.f30878b) {
                    yVar.m22017P(e);
                    b0Var.mo12386f(yVar, a);
                }
                this.f30881e += a;
            }
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        this.f30879c = false;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        for (int i = 0; i < this.f30878b.length; i++) {
            AbstractC13772i0.C13773a aVar = this.f30877a.get(i);
            dVar.m2731a();
            AbstractC10500b0 e = kVar.mo7937e(dVar.m2729c(), 3);
            e.mo12388d(new C6722k.C6724b().m24505S(dVar.m2730b()).m24488e0("application/dvbsubs").m24504T(Collections.singletonList(aVar.f30852c)).m24502V(aVar.f30850a).m24519E());
            this.f30878b[i] = e;
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: e */
    public void mo2656e() {
        if (this.f30879c) {
            for (AbstractC10500b0 b0Var : this.f30878b) {
                b0Var.mo12382c(this.f30882f, 1, this.f30881e, 0, null);
            }
            this.f30879c = false;
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: f */
    public void mo2655f(long j, int i) {
        if ((i & 4) != 0) {
            this.f30879c = true;
            this.f30882f = j;
            this.f30881e = 0;
            this.f30880d = 2;
        }
    }
}
