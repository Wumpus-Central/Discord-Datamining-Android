package p311r2;

import p223m2.C10472c;
import p331s2.AbstractC12777c;

/* renamed from: r2.n */
/* loaded from: classes.dex */
class C12348n {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27732a = AbstractC12777c.C12778a.m5511a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10472c m7104a(AbstractC12777c cVar) {
        cVar.mo5492h();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27732a);
            if (S == 0) {
                str = cVar.mo5509C();
            } else if (S == 1) {
                str3 = cVar.mo5509C();
            } else if (S == 2) {
                str2 = cVar.mo5509C();
            } else if (S != 3) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else {
                f = (float) cVar.mo5486s();
            }
        }
        cVar.mo5489l();
        return new C10472c(str, str3, str2, f);
    }
}
