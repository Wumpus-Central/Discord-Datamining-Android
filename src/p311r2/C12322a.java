package p311r2;

import android.graphics.PointF;
import java.util.ArrayList;
import p126h2.C7762i;
import p238n2.AbstractC10705m;
import p238n2.C10694b;
import p238n2.C10697e;
import p238n2.C10701i;
import p331s2.AbstractC12777c;
import p343t2.C12949j;
import p358u2.C13178a;

/* renamed from: r2.a */
/* loaded from: classes.dex */
public class C12322a {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27690a = AbstractC12777c.C12778a.m5511a("k", "x", "y");

    /* renamed from: a */
    public static C10697e m7154a(AbstractC12777c cVar, C7762i iVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.BEGIN_ARRAY) {
            cVar.mo5493g();
            while (cVar.mo5488p()) {
                arrayList.add(C12363z.m7068a(cVar, iVar));
            }
            cVar.mo5491i();
            C12357u.m7079b(arrayList);
        } else {
            arrayList.add(new C13178a(C12354s.m7091e(cVar, C12949j.m4967e())));
        }
        return new C10697e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC10705m<PointF, PointF> m7153b(AbstractC12777c cVar, C7762i iVar) {
        cVar.mo5492h();
        C10697e eVar = null;
        C10694b bVar = null;
        boolean z = false;
        C10694b bVar2 = null;
        while (cVar.mo5497Q() != AbstractC12777c.EnumC12779b.END_OBJECT) {
            int S = cVar.mo5496S(f27690a);
            if (S == 0) {
                eVar = m7154a(cVar, iVar);
            } else if (S != 1) {
                if (S != 2) {
                    cVar.mo5495U();
                    cVar.mo5494Y();
                } else if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.STRING) {
                    cVar.mo5494Y();
                    z = true;
                } else {
                    bVar = C12328d.m7136e(cVar, iVar);
                }
            } else if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.STRING) {
                cVar.mo5494Y();
                z = true;
            } else {
                bVar2 = C12328d.m7136e(cVar, iVar);
            }
        }
        cVar.mo5489l();
        if (z) {
            iVar.m21403a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new C10701i(bVar2, bVar);
    }
}
