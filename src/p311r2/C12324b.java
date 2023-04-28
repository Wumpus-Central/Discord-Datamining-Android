package p311r2;

import p126h2.C7762i;
import p238n2.C10693a;
import p238n2.C10694b;
import p238n2.C10703k;
import p331s2.AbstractC12777c;

/* renamed from: r2.b */
/* loaded from: classes.dex */
public class C12324b {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27692a = AbstractC12777c.C12778a.m5511a("a");

    /* renamed from: b */
    private static final AbstractC12777c.C12778a f27693b = AbstractC12777c.C12778a.m5511a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static C10703k m7151a(AbstractC12777c cVar, C7762i iVar) {
        cVar.mo5492h();
        C10703k kVar = null;
        while (cVar.mo5488p()) {
            if (cVar.mo5496S(f27692a) != 0) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else {
                kVar = m7150b(cVar, iVar);
            }
        }
        cVar.mo5489l();
        if (kVar == null) {
            return new C10703k(null, null, null, null);
        }
        return kVar;
    }

    /* renamed from: b */
    private static C10703k m7150b(AbstractC12777c cVar, C7762i iVar) {
        cVar.mo5492h();
        C10693a aVar = null;
        C10693a aVar2 = null;
        C10694b bVar = null;
        C10694b bVar2 = null;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27693b);
            if (S == 0) {
                aVar = C12328d.m7138c(cVar, iVar);
            } else if (S == 1) {
                aVar2 = C12328d.m7138c(cVar, iVar);
            } else if (S == 2) {
                bVar = C12328d.m7136e(cVar, iVar);
            } else if (S != 3) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else {
                bVar2 = C12328d.m7136e(cVar, iVar);
            }
        }
        cVar.mo5489l();
        return new C10703k(aVar, aVar2, bVar, bVar2);
    }
}
