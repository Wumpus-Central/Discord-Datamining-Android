package p311r2;

import p126h2.C7762i;
import p238n2.C10694b;
import p254o2.C11183m;
import p331s2.AbstractC12777c;

/* renamed from: r2.f0 */
/* loaded from: classes.dex */
public class C12333f0 {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27703a = AbstractC12777c.C12778a.m5511a("nm", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11183m m7124a(AbstractC12777c cVar, C7762i iVar) {
        boolean z = false;
        String str = null;
        C10694b bVar = null;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27703a);
            if (S == 0) {
                str = cVar.mo5509C();
            } else if (S == 1) {
                bVar = C12328d.m7135f(cVar, iVar, true);
            } else if (S != 2) {
                cVar.mo5494Y();
            } else {
                z = cVar.mo5487r();
            }
        }
        if (z) {
            return null;
        }
        return new C11183m(str, bVar);
    }
}
