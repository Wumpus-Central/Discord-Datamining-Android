package p311r2;

import android.graphics.Path;
import java.util.Collections;
import p126h2.C7762i;
import p238n2.C10693a;
import p238n2.C10696d;
import p254o2.C11185o;
import p331s2.AbstractC12777c;
import p358u2.C13178a;

/* renamed from: r2.i0 */
/* loaded from: classes.dex */
class C12339i0 {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27711a = AbstractC12777c.C12778a.m5511a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11185o m7118a(AbstractC12777c cVar, C7762i iVar) {
        Path.FillType fillType;
        C10696d dVar = null;
        String str = null;
        C10693a aVar = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27711a);
            if (S == 0) {
                str = cVar.mo5509C();
            } else if (S == 1) {
                aVar = C12328d.m7138c(cVar, iVar);
            } else if (S == 2) {
                dVar = C12328d.m7133h(cVar, iVar);
            } else if (S == 3) {
                z = cVar.mo5487r();
            } else if (S == 4) {
                i = cVar.mo5485t();
            } else if (S != 5) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else {
                z2 = cVar.mo5487r();
            }
        }
        if (dVar == null) {
            dVar = new C10696d(Collections.singletonList(new C13178a(100)));
        }
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new C11185o(str, z, fillType, aVar, dVar, z2);
    }
}
