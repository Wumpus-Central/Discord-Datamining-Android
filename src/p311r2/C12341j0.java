package p311r2;

import java.util.ArrayList;
import p126h2.C7762i;
import p254o2.AbstractC11170c;
import p254o2.C11186p;
import p331s2.AbstractC12777c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r2.j0 */
/* loaded from: classes.dex */
public class C12341j0 {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27717a = AbstractC12777c.C12778a.m5511a("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11186p m7112a(AbstractC12777c cVar, C7762i iVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27717a);
            if (S == 0) {
                str = cVar.mo5509C();
            } else if (S == 1) {
                z = cVar.mo5487r();
            } else if (S != 2) {
                cVar.mo5494Y();
            } else {
                cVar.mo5493g();
                while (cVar.mo5488p()) {
                    AbstractC11170c a = C12336h.m7121a(cVar, iVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                cVar.mo5491i();
            }
        }
        return new C11186p(str, arrayList, z);
    }
}
