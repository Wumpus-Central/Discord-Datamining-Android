package p311r2;

import p126h2.C7762i;
import p254o2.C11168a;
import p331s2.AbstractC12777c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r2.e */
/* loaded from: classes.dex */
public class C12330e {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27699a = AbstractC12777c.C12778a.m5511a("ef");

    /* renamed from: b */
    private static final AbstractC12777c.C12778a f27700b = AbstractC12777c.C12778a.m5511a("ty", "v");

    /* renamed from: a */
    private static C11168a m7128a(AbstractC12777c cVar, C7762i iVar) {
        cVar.mo5492h();
        C11168a aVar = null;
        while (true) {
            boolean z = false;
            while (cVar.mo5488p()) {
                int S = cVar.mo5496S(f27700b);
                if (S != 0) {
                    if (S != 1) {
                        cVar.mo5495U();
                        cVar.mo5494Y();
                    } else if (z) {
                        aVar = new C11168a(C12328d.m7136e(cVar, iVar));
                    } else {
                        cVar.mo5494Y();
                    }
                } else if (cVar.mo5485t() == 0) {
                    z = true;
                }
            }
            cVar.mo5489l();
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C11168a m7127b(AbstractC12777c cVar, C7762i iVar) {
        C11168a aVar = null;
        while (cVar.mo5488p()) {
            if (cVar.mo5496S(f27699a) != 0) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else {
                cVar.mo5493g();
                while (cVar.mo5488p()) {
                    C11168a a = m7128a(cVar, iVar);
                    if (a != null) {
                        aVar = a;
                    }
                }
                cVar.mo5491i();
            }
        }
        return aVar;
    }
}
