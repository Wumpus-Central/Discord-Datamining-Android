package p311r2;

import android.graphics.Path;
import java.util.Collections;
import p126h2.C7762i;
import p238n2.C10695c;
import p238n2.C10696d;
import p238n2.C10698f;
import p254o2.C11172e;
import p254o2.EnumC11174g;
import p331s2.AbstractC12777c;
import p358u2.C13178a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r2.p */
/* loaded from: classes.dex */
public class C12351p {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27734a = AbstractC12777c.C12778a.m5511a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final AbstractC12777c.C12778a f27735b = AbstractC12777c.C12778a.m5511a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11172e m7099a(AbstractC12777c cVar, C7762i iVar) {
        C10696d dVar;
        EnumC11174g gVar;
        Path.FillType fillType;
        C10696d dVar2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        EnumC11174g gVar2 = null;
        C10695c cVar2 = null;
        C10698f fVar = null;
        C10698f fVar2 = null;
        boolean z = false;
        while (cVar.mo5488p()) {
            switch (cVar.mo5496S(f27734a)) {
                case 0:
                    str = cVar.mo5509C();
                    break;
                case 1:
                    cVar.mo5492h();
                    int i = -1;
                    while (cVar.mo5488p()) {
                        int S = cVar.mo5496S(f27735b);
                        if (S == 0) {
                            i = cVar.mo5485t();
                        } else if (S != 1) {
                            cVar.mo5495U();
                            cVar.mo5494Y();
                        } else {
                            cVar2 = C12328d.m7134g(cVar, iVar, i);
                        }
                    }
                    cVar.mo5489l();
                    break;
                case 2:
                    dVar2 = C12328d.m7133h(cVar, iVar);
                    break;
                case 3:
                    if (cVar.mo5485t() == 1) {
                        gVar = EnumC11174g.LINEAR;
                    } else {
                        gVar = EnumC11174g.RADIAL;
                    }
                    gVar2 = gVar;
                    break;
                case 4:
                    fVar = C12328d.m7132i(cVar, iVar);
                    break;
                case 5:
                    fVar2 = C12328d.m7132i(cVar, iVar);
                    break;
                case 6:
                    if (cVar.mo5485t() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z = cVar.mo5487r();
                    break;
                default:
                    cVar.mo5495U();
                    cVar.mo5494Y();
                    break;
            }
        }
        if (dVar2 == null) {
            dVar = new C10696d(Collections.singletonList(new C13178a(100)));
        } else {
            dVar = dVar2;
        }
        return new C11172e(str, gVar2, fillType2, cVar2, dVar, fVar, fVar2, null, null, z);
    }
}
