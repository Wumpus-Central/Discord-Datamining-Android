package p311r2;

import p126h2.C7762i;
import p238n2.C10694b;
import p254o2.C11192s;
import p331s2.AbstractC12777c;

/* renamed from: r2.m0 */
/* loaded from: classes.dex */
class C12347m0 {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27731a = AbstractC12777c.C12778a.m5511a("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11192s m7105a(AbstractC12777c cVar, C7762i iVar) {
        String str = null;
        C11192s.EnumC11193a aVar = null;
        C10694b bVar = null;
        C10694b bVar2 = null;
        C10694b bVar3 = null;
        boolean z = false;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27731a);
            if (S == 0) {
                bVar = C12328d.m7135f(cVar, iVar, false);
            } else if (S == 1) {
                bVar2 = C12328d.m7135f(cVar, iVar, false);
            } else if (S == 2) {
                bVar3 = C12328d.m7135f(cVar, iVar, false);
            } else if (S == 3) {
                str = cVar.mo5509C();
            } else if (S == 4) {
                aVar = C11192s.EnumC11193a.m10521a(cVar.mo5485t());
            } else if (S != 5) {
                cVar.mo5494Y();
            } else {
                z = cVar.mo5487r();
            }
        }
        return new C11192s(str, aVar, bVar, bVar2, bVar3, z);
    }
}
