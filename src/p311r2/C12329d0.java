package p311r2;

import android.graphics.PointF;
import p126h2.C7762i;
import p238n2.AbstractC10705m;
import p238n2.C10694b;
import p238n2.C10698f;
import p254o2.C11181k;
import p331s2.AbstractC12777c;

/* renamed from: r2.d0 */
/* loaded from: classes.dex */
class C12329d0 {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27698a = AbstractC12777c.C12778a.m5511a("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11181k m7129a(AbstractC12777c cVar, C7762i iVar) {
        String str = null;
        AbstractC10705m<PointF, PointF> mVar = null;
        C10698f fVar = null;
        C10694b bVar = null;
        boolean z = false;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27698a);
            if (S == 0) {
                str = cVar.mo5509C();
            } else if (S == 1) {
                mVar = C12322a.m7153b(cVar, iVar);
            } else if (S == 2) {
                fVar = C12328d.m7132i(cVar, iVar);
            } else if (S == 3) {
                bVar = C12328d.m7136e(cVar, iVar);
            } else if (S != 4) {
                cVar.mo5494Y();
            } else {
                z = cVar.mo5487r();
            }
        }
        return new C11181k(str, mVar, fVar, bVar, z);
    }
}
