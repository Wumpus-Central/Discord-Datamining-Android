package p311r2;

import p254o2.C11177i;
import p331s2.AbstractC12777c;

/* renamed from: r2.y */
/* loaded from: classes.dex */
class C12362y {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27755a = AbstractC12777c.C12778a.m5511a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11177i m7069a(AbstractC12777c cVar) {
        String str = null;
        boolean z = false;
        C11177i.EnumC11178a aVar = null;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27755a);
            if (S == 0) {
                str = cVar.mo5509C();
            } else if (S == 1) {
                aVar = C11177i.EnumC11178a.m10582a(cVar.mo5485t());
            } else if (S != 2) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else {
                z = cVar.mo5487r();
            }
        }
        return new C11177i(str, aVar, z);
    }
}
