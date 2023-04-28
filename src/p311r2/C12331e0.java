package p311r2;

import p126h2.C7762i;
import p238n2.C10694b;
import p238n2.C10704l;
import p254o2.C11182l;
import p331s2.AbstractC12777c;

/* renamed from: r2.e0 */
/* loaded from: classes.dex */
class C12331e0 {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27701a = AbstractC12777c.C12778a.m5511a("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11182l m7126a(AbstractC12777c cVar, C7762i iVar) {
        String str = null;
        C10694b bVar = null;
        C10694b bVar2 = null;
        C10704l lVar = null;
        boolean z = false;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27701a);
            if (S == 0) {
                str = cVar.mo5509C();
            } else if (S == 1) {
                bVar = C12328d.m7135f(cVar, iVar, false);
            } else if (S == 2) {
                bVar2 = C12328d.m7135f(cVar, iVar, false);
            } else if (S == 3) {
                lVar = C12326c.m7142g(cVar, iVar);
            } else if (S != 4) {
                cVar.mo5494Y();
            } else {
                z = cVar.mo5487r();
            }
        }
        return new C11182l(str, bVar, bVar2, lVar, z);
    }
}
