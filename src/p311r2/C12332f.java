package p311r2;

import android.graphics.PointF;
import p126h2.C7762i;
import p238n2.AbstractC10705m;
import p238n2.C10698f;
import p254o2.C11169b;
import p331s2.AbstractC12777c;

/* renamed from: r2.f */
/* loaded from: classes.dex */
class C12332f {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27702a = AbstractC12777c.C12778a.m5511a("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11169b m7125a(AbstractC12777c cVar, C7762i iVar, int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean z3 = false;
        String str = null;
        AbstractC10705m<PointF, PointF> mVar = null;
        C10698f fVar = null;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27702a);
            if (S == 0) {
                str = cVar.mo5509C();
            } else if (S == 1) {
                mVar = C12322a.m7153b(cVar, iVar);
            } else if (S == 2) {
                fVar = C12328d.m7132i(cVar, iVar);
            } else if (S == 3) {
                z3 = cVar.mo5487r();
            } else if (S != 4) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else if (cVar.mo5485t() == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return new C11169b(str, mVar, fVar, z2, z3);
    }
}
