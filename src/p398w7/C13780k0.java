package p398w7;

import java.util.List;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p228m7.C10502c;
import p398w7.AbstractC13772i0;

/* renamed from: w7.k0 */
/* loaded from: classes7.dex */
final class C13780k0 {

    /* renamed from: a */
    private final List<C6722k> f30875a;

    /* renamed from: b */
    private final AbstractC10500b0[] f30876b;

    public C13780k0(List<C6722k> list) {
        this.f30875a = list;
        this.f30876b = new AbstractC10500b0[list.size()];
    }

    /* renamed from: a */
    public void m2715a(long j, C7570y yVar) {
        if (yVar.m22015a() >= 9) {
            int n = yVar.m22002n();
            int n2 = yVar.m22002n();
            int D = yVar.m22029D();
            if (n == 434 && n2 == 1195456820 && D == 3) {
                C10502c.m13005b(j, yVar, this.f30876b);
            }
        }
    }

    /* renamed from: b */
    public void m2714b(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        boolean z;
        for (int i = 0; i < this.f30876b.length; i++) {
            dVar.m2731a();
            AbstractC10500b0 e = kVar.mo7937e(dVar.m2729c(), 3);
            C6722k kVar2 = this.f30875a.get(i);
            String str = kVar2.f14329v;
            if ("application/cea-608".equals(str) || "application/cea-708".equals(str)) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22370b(z, "Invalid closed caption mime type provided: " + str);
            e.mo12388d(new C6722k.C6724b().m24505S(dVar.m2730b()).m24488e0(str).m24484g0(kVar2.f14321n).m24502V(kVar2.f14320m).m24518F(kVar2.f37974N).m24504T(kVar2.f14331x).m24519E());
            this.f30876b[i] = e;
        }
    }
}
