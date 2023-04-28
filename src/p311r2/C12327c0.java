package p311r2;

import android.graphics.PointF;
import p126h2.C7762i;
import p238n2.AbstractC10705m;
import p238n2.C10694b;
import p254o2.C11179j;
import p331s2.AbstractC12777c;

/* renamed from: r2.c0 */
/* loaded from: classes.dex */
class C12327c0 {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27697a = AbstractC12777c.C12778a.m5511a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11179j m7141a(AbstractC12777c cVar, C7762i iVar, int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = z;
        String str = null;
        C11179j.EnumC11180a aVar = null;
        C10694b bVar = null;
        AbstractC10705m<PointF, PointF> mVar = null;
        C10694b bVar2 = null;
        C10694b bVar3 = null;
        C10694b bVar4 = null;
        C10694b bVar5 = null;
        C10694b bVar6 = null;
        while (cVar.mo5488p()) {
            switch (cVar.mo5496S(f27697a)) {
                case 0:
                    str = cVar.mo5509C();
                    break;
                case 1:
                    aVar = C11179j.EnumC11180a.m10570a(cVar.mo5485t());
                    break;
                case 2:
                    bVar = C12328d.m7135f(cVar, iVar, false);
                    break;
                case 3:
                    mVar = C12322a.m7153b(cVar, iVar);
                    break;
                case 4:
                    bVar2 = C12328d.m7135f(cVar, iVar, false);
                    break;
                case 5:
                    bVar4 = C12328d.m7136e(cVar, iVar);
                    break;
                case 6:
                    bVar6 = C12328d.m7135f(cVar, iVar, false);
                    break;
                case 7:
                    bVar3 = C12328d.m7136e(cVar, iVar);
                    break;
                case 8:
                    bVar5 = C12328d.m7135f(cVar, iVar, false);
                    break;
                case 9:
                    z2 = cVar.mo5487r();
                    break;
                case 10:
                    if (cVar.mo5485t() != 3) {
                        z3 = false;
                        break;
                    } else {
                        z3 = true;
                        break;
                    }
                default:
                    cVar.mo5495U();
                    cVar.mo5494Y();
                    break;
            }
        }
        return new C11179j(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z2, z3);
    }
}
