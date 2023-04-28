package p311r2;

import android.graphics.PointF;
import p126h2.C7762i;
import p238n2.AbstractC10705m;
import p238n2.C10694b;
import p238n2.C10696d;
import p238n2.C10697e;
import p238n2.C10699g;
import p238n2.C10701i;
import p238n2.C10704l;
import p331s2.AbstractC12777c;
import p358u2.C13178a;
import p358u2.C13181d;

/* renamed from: r2.c */
/* loaded from: classes.dex */
public class C12326c {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27695a = AbstractC12777c.C12778a.m5511a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static final AbstractC12777c.C12778a f27696b = AbstractC12777c.C12778a.m5511a("k");

    /* renamed from: a */
    private static boolean m7148a(C10697e eVar) {
        return eVar == null || (eVar.mo12622f() && eVar.mo12623b().get(0).f29540b.equals(0.0f, 0.0f));
    }

    /* renamed from: b */
    private static boolean m7147b(AbstractC10705m<PointF, PointF> mVar) {
        if (mVar == null || (!(mVar instanceof C10701i) && mVar.mo12622f() && mVar.mo12623b().get(0).f29540b.equals(0.0f, 0.0f))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m7146c(C10694b bVar) {
        return bVar == null || (bVar.mo12622f() && ((Float) ((C13178a) bVar.mo12623b().get(0)).f29540b).floatValue() == 0.0f);
    }

    /* renamed from: d */
    private static boolean m7145d(C10699g gVar) {
        return gVar == null || (gVar.mo12622f() && ((C13181d) ((C13178a) gVar.mo12623b().get(0)).f29540b).m4400a(1.0f, 1.0f));
    }

    /* renamed from: e */
    private static boolean m7144e(C10694b bVar) {
        return bVar == null || (bVar.mo12622f() && ((Float) ((C13178a) bVar.mo12623b().get(0)).f29540b).floatValue() == 0.0f);
    }

    /* renamed from: f */
    private static boolean m7143f(C10694b bVar) {
        return bVar == null || (bVar.mo12622f() && ((Float) ((C13178a) bVar.mo12623b().get(0)).f29540b).floatValue() == 0.0f);
    }

    /* renamed from: g */
    public static C10704l m7142g(AbstractC12777c cVar, C7762i iVar) {
        boolean z;
        C10697e eVar;
        AbstractC10705m<PointF, PointF> mVar;
        C10694b bVar;
        C10694b bVar2;
        C10694b bVar3;
        boolean z2;
        boolean z3 = false;
        if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.mo5492h();
        }
        C10694b bVar4 = null;
        C10697e eVar2 = null;
        AbstractC10705m<PointF, PointF> mVar2 = null;
        C10699g gVar = null;
        C10694b bVar5 = null;
        C10694b bVar6 = null;
        C10696d dVar = null;
        C10694b bVar7 = null;
        C10694b bVar8 = null;
        while (cVar.mo5488p()) {
            switch (cVar.mo5496S(f27695a)) {
                case 0:
                    cVar.mo5492h();
                    while (cVar.mo5488p()) {
                        if (cVar.mo5496S(f27696b) != 0) {
                            cVar.mo5495U();
                            cVar.mo5494Y();
                        } else {
                            eVar2 = C12322a.m7154a(cVar, iVar);
                        }
                    }
                    cVar.mo5489l();
                    z3 = z3;
                    continue;
                case 1:
                    mVar2 = C12322a.m7153b(cVar, iVar);
                    continue;
                case 2:
                    gVar = C12328d.m7131j(cVar, iVar);
                    continue;
                case 3:
                    iVar.m21403a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = C12328d.m7133h(cVar, iVar);
                    continue;
                case 6:
                    bVar7 = C12328d.m7135f(cVar, iVar, z3);
                    continue;
                case 7:
                    bVar8 = C12328d.m7135f(cVar, iVar, z3);
                    continue;
                case 8:
                    bVar5 = C12328d.m7135f(cVar, iVar, z3);
                    continue;
                case 9:
                    bVar6 = C12328d.m7135f(cVar, iVar, z3);
                    continue;
                default:
                    cVar.mo5495U();
                    cVar.mo5494Y();
                    continue;
            }
            C10694b f = C12328d.m7135f(cVar, iVar, z3);
            if (f.mo12623b().isEmpty()) {
                f.mo12623b().add(new C13178a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(iVar.m21398f())));
            } else if (((C13178a) f.mo12623b().get(0)).f29540b == 0) {
                z2 = false;
                f.mo12623b().set(0, new C13178a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(iVar.m21398f())));
                z3 = z2;
                bVar4 = f;
            }
            z2 = false;
            z3 = z2;
            bVar4 = f;
        }
        if (z) {
            cVar.mo5489l();
        }
        if (m7148a(eVar2)) {
            eVar = null;
        } else {
            eVar = eVar2;
        }
        if (m7147b(mVar2)) {
            mVar = null;
        } else {
            mVar = mVar2;
        }
        if (m7146c(bVar4)) {
            bVar = null;
        } else {
            bVar = bVar4;
        }
        if (m7145d(gVar)) {
            gVar = null;
        }
        if (m7143f(bVar5)) {
            bVar2 = null;
        } else {
            bVar2 = bVar5;
        }
        if (m7144e(bVar6)) {
            bVar3 = null;
        } else {
            bVar3 = bVar6;
        }
        return new C10704l(eVar, mVar, gVar, bVar, dVar, bVar7, bVar8, bVar2, bVar3);
    }
}
