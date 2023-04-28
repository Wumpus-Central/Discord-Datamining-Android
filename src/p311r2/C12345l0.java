package p311r2;

import java.util.ArrayList;
import java.util.Collections;
import p126h2.C7762i;
import p238n2.C10693a;
import p238n2.C10694b;
import p238n2.C10696d;
import p254o2.C11188r;
import p331s2.AbstractC12777c;
import p358u2.C13178a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r2.l0 */
/* loaded from: classes.dex */
public class C12345l0 {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27727a = AbstractC12777c.C12778a.m5511a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final AbstractC12777c.C12778a f27728b = AbstractC12777c.C12778a.m5511a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11188r m7107a(AbstractC12777c cVar, C7762i iVar) {
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        boolean z = false;
        String str = null;
        C10694b bVar = null;
        C10693a aVar = null;
        C10694b bVar2 = null;
        C11188r.EnumC11190b bVar3 = null;
        C11188r.EnumC11191c cVar2 = null;
        C10696d dVar = null;
        while (cVar.mo5488p()) {
            switch (cVar.mo5496S(f27727a)) {
                case 0:
                    str = cVar.mo5509C();
                    break;
                case 1:
                    aVar = C12328d.m7138c(cVar, iVar);
                    break;
                case 2:
                    bVar2 = C12328d.m7136e(cVar, iVar);
                    break;
                case 3:
                    dVar = C12328d.m7133h(cVar, iVar);
                    break;
                case 4:
                    bVar3 = C11188r.EnumC11190b.values()[cVar.mo5485t() - 1];
                    break;
                case 5:
                    cVar2 = C11188r.EnumC11191c.values()[cVar.mo5485t() - 1];
                    break;
                case 6:
                    f = (float) cVar.mo5486s();
                    break;
                case 7:
                    z = cVar.mo5487r();
                    break;
                case 8:
                    cVar.mo5493g();
                    while (cVar.mo5488p()) {
                        cVar.mo5492h();
                        String str2 = null;
                        C10694b bVar4 = null;
                        while (cVar.mo5488p()) {
                            int S = cVar.mo5496S(f27728b);
                            if (S == 0) {
                                str2 = cVar.mo5509C();
                            } else if (S != 1) {
                                cVar.mo5495U();
                                cVar.mo5494Y();
                            } else {
                                bVar4 = C12328d.m7136e(cVar, iVar);
                            }
                        }
                        cVar.mo5489l();
                        str2.hashCode();
                        char c = 65535;
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                iVar.m21383u(true);
                                arrayList.add(bVar4);
                                break;
                            case 2:
                                bVar = bVar4;
                                break;
                        }
                    }
                    cVar.mo5491i();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((C10694b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    cVar.mo5494Y();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new C10696d(Collections.singletonList(new C13178a(100)));
        }
        return new C11188r(str, bVar, arrayList, aVar, dVar, bVar2, bVar3, cVar2, f, z);
    }
}
