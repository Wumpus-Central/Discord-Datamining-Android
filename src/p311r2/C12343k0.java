package p311r2;

import p126h2.C7762i;
import p238n2.C10700h;
import p254o2.C11187q;
import p331s2.AbstractC12777c;

/* renamed from: r2.k0 */
/* loaded from: classes.dex */
class C12343k0 {

    /* renamed from: a */
    static AbstractC12777c.C12778a f27725a = AbstractC12777c.C12778a.m5511a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11187q m7109a(AbstractC12777c cVar, C7762i iVar) {
        String str = null;
        int i = 0;
        boolean z = false;
        C10700h hVar = null;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27725a);
            if (S == 0) {
                str = cVar.mo5509C();
            } else if (S == 1) {
                i = cVar.mo5485t();
            } else if (S == 2) {
                hVar = C12328d.m7130k(cVar, iVar);
            } else if (S != 3) {
                cVar.mo5494Y();
            } else {
                z = cVar.mo5487r();
            }
        }
        return new C11187q(str, i, hVar, z);
    }
}
