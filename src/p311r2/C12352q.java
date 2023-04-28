package p311r2;

import java.util.ArrayList;
import java.util.Collections;
import p126h2.C7762i;
import p238n2.C10694b;
import p238n2.C10695c;
import p238n2.C10696d;
import p238n2.C10698f;
import p254o2.C11173f;
import p254o2.C11188r;
import p254o2.EnumC11174g;
import p331s2.AbstractC12777c;
import p358u2.C13178a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r2.q */
/* loaded from: classes.dex */
public class C12352q {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27736a = AbstractC12777c.C12778a.m5511a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final AbstractC12777c.C12778a f27737b = AbstractC12777c.C12778a.m5511a("p", "k");

    /* renamed from: c */
    private static final AbstractC12777c.C12778a f27738c = AbstractC12777c.C12778a.m5511a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11173f m7098a(AbstractC12777c cVar, C7762i iVar) {
        String str;
        C10695c cVar2;
        EnumC11174g gVar;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str2 = null;
        EnumC11174g gVar2 = null;
        C10695c cVar3 = null;
        C10698f fVar = null;
        C10698f fVar2 = null;
        C10694b bVar = null;
        C11188r.EnumC11190b bVar2 = null;
        C11188r.EnumC11191c cVar4 = null;
        C10694b bVar3 = null;
        boolean z = false;
        C10696d dVar = null;
        while (cVar.mo5488p()) {
            switch (cVar.mo5496S(f27736a)) {
                case 0:
                    str2 = cVar.mo5509C();
                    continue;
                case 1:
                    str = str2;
                    cVar.mo5492h();
                    int i = -1;
                    while (cVar.mo5488p()) {
                        int S = cVar.mo5496S(f27737b);
                        if (S != 0) {
                            cVar2 = cVar3;
                            if (S != 1) {
                                cVar.mo5495U();
                                cVar.mo5494Y();
                            } else {
                                cVar3 = C12328d.m7134g(cVar, iVar, i);
                            }
                        } else {
                            cVar2 = cVar3;
                            i = cVar.mo5485t();
                        }
                        cVar3 = cVar2;
                    }
                    cVar.mo5489l();
                    break;
                case 2:
                    dVar = C12328d.m7133h(cVar, iVar);
                    continue;
                case 3:
                    str = str2;
                    if (cVar.mo5485t() == 1) {
                        gVar = EnumC11174g.LINEAR;
                    } else {
                        gVar = EnumC11174g.RADIAL;
                    }
                    gVar2 = gVar;
                    break;
                case 4:
                    fVar = C12328d.m7132i(cVar, iVar);
                    continue;
                case 5:
                    fVar2 = C12328d.m7132i(cVar, iVar);
                    continue;
                case 6:
                    bVar = C12328d.m7136e(cVar, iVar);
                    continue;
                case 7:
                    str = str2;
                    bVar2 = C11188r.EnumC11190b.values()[cVar.mo5485t() - 1];
                    break;
                case 8:
                    str = str2;
                    cVar4 = C11188r.EnumC11191c.values()[cVar.mo5485t() - 1];
                    break;
                case 9:
                    str = str2;
                    f = (float) cVar.mo5486s();
                    break;
                case 10:
                    z = cVar.mo5487r();
                    continue;
                case 11:
                    cVar.mo5493g();
                    while (cVar.mo5488p()) {
                        cVar.mo5492h();
                        String str3 = null;
                        C10694b bVar4 = null;
                        while (cVar.mo5488p()) {
                            int S2 = cVar.mo5496S(f27738c);
                            if (S2 != 0) {
                                if (S2 != 1) {
                                    cVar.mo5495U();
                                    cVar.mo5494Y();
                                } else {
                                    bVar4 = C12328d.m7136e(cVar, iVar);
                                }
                                bVar3 = bVar3;
                            } else {
                                str3 = cVar.mo5509C();
                            }
                        }
                        cVar.mo5489l();
                        if (str3.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str3.equals("d") || str3.equals("g")) {
                                iVar.m21383u(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar3;
                        }
                    }
                    cVar.mo5491i();
                    if (arrayList.size() == 1) {
                        arrayList.add((C10694b) arrayList.get(0));
                    }
                    bVar3 = bVar3;
                    continue;
                    break;
                default:
                    cVar.mo5495U();
                    cVar.mo5494Y();
                    continue;
            }
            str2 = str;
        }
        if (dVar == null) {
            dVar = new C10696d(Collections.singletonList(new C13178a(100)));
        }
        return new C11173f(str2, gVar2, cVar3, dVar, fVar, fVar2, bVar, bVar2, cVar4, f, arrayList, bVar3, z);
    }
}
