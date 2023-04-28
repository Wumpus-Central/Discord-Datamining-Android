package p311r2;

import java.util.ArrayList;
import p126h2.C7762i;
import p223m2.C10473d;
import p254o2.C11186p;
import p331s2.AbstractC12777c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r2.m */
/* loaded from: classes.dex */
public class C12346m {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27729a = AbstractC12777c.C12778a.m5511a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b */
    private static final AbstractC12777c.C12778a f27730b = AbstractC12777c.C12778a.m5511a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10473d m7106a(AbstractC12777c cVar, C7762i iVar) {
        ArrayList arrayList = new ArrayList();
        cVar.mo5492h();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        char c = 0;
        double d2 = 0.0d;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27729a);
            if (S == 0) {
                c = cVar.mo5509C().charAt(0);
            } else if (S == 1) {
                d2 = cVar.mo5486s();
            } else if (S == 2) {
                d = cVar.mo5486s();
            } else if (S == 3) {
                str = cVar.mo5509C();
            } else if (S == 4) {
                str2 = cVar.mo5509C();
            } else if (S != 5) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else {
                cVar.mo5492h();
                while (cVar.mo5488p()) {
                    if (cVar.mo5496S(f27730b) != 0) {
                        cVar.mo5495U();
                        cVar.mo5494Y();
                    } else {
                        cVar.mo5493g();
                        while (cVar.mo5488p()) {
                            arrayList.add((C11186p) C12336h.m7121a(cVar, iVar));
                        }
                        cVar.mo5491i();
                    }
                }
                cVar.mo5489l();
            }
        }
        cVar.mo5489l();
        return new C10473d(arrayList, c, d2, d, str, str2);
    }
}
