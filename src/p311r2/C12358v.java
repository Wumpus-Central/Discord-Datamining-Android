package p311r2;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import p126h2.C7762i;
import p238n2.C10694b;
import p238n2.C10702j;
import p238n2.C10703k;
import p238n2.C10704l;
import p254o2.AbstractC11170c;
import p254o2.C11168a;
import p275p2.C11516e;
import p331s2.AbstractC12777c;
import p343t2.C12949j;
import p358u2.C13178a;

/* renamed from: r2.v */
/* loaded from: classes.dex */
public class C12358v {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27747a = AbstractC12777c.C12778a.m5511a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    private static final AbstractC12777c.C12778a f27748b = AbstractC12777c.C12778a.m5511a("d", "a");

    /* renamed from: c */
    private static final AbstractC12777c.C12778a f27749c = AbstractC12777c.C12778a.m5511a("ty", "nm");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r2.v$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C12359a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27750a;

        static {
            int[] iArr = new int[C11516e.EnumC11518b.values().length];
            f27750a = iArr;
            try {
                iArr[C11516e.EnumC11518b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27750a[C11516e.EnumC11518b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public static C11516e m7078a(C7762i iVar) {
        Rect b = iVar.m21402b();
        return new C11516e(Collections.emptyList(), iVar, "__container", -1L, C11516e.EnumC11517a.PRE_COMP, -1L, null, Collections.emptyList(), new C10704l(), 0, 0, 0, 0.0f, 0.0f, b.width(), b.height(), null, null, Collections.emptyList(), C11516e.EnumC11518b.NONE, null, false, null, null);
    }

    /* renamed from: b */
    public static C11516e m7077b(AbstractC12777c cVar, C7762i iVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f;
        C11516e.EnumC11518b bVar = C11516e.EnumC11518b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        cVar.mo5492h();
        String str = "UNSET";
        C11516e.EnumC11517a aVar = null;
        long j = 0;
        long j2 = -1;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        C11516e.EnumC11518b bVar2 = bVar;
        String str2 = null;
        C10704l lVar = null;
        C10702j jVar = null;
        C10703k kVar = null;
        C10694b bVar3 = null;
        C11168a aVar2 = null;
        C12340j jVar2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        String str3 = null;
        while (cVar.mo5488p()) {
            switch (cVar.mo5496S(f27747a)) {
                case 0:
                    str = cVar.mo5509C();
                    break;
                case 1:
                    j = cVar.mo5485t();
                    break;
                case 2:
                    str2 = cVar.mo5509C();
                    break;
                case 3:
                    int t = cVar.mo5485t();
                    aVar = C11516e.EnumC11517a.UNKNOWN;
                    if (t >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = C11516e.EnumC11517a.values()[t];
                        break;
                    }
                case 4:
                    j2 = cVar.mo5485t();
                    break;
                case 5:
                    i = (int) (cVar.mo5485t() * C12949j.m4967e());
                    break;
                case 6:
                    i2 = (int) (cVar.mo5485t() * C12949j.m4967e());
                    break;
                case 7:
                    i3 = Color.parseColor(cVar.mo5509C());
                    break;
                case 8:
                    lVar = C12326c.m7142g(cVar, iVar);
                    break;
                case 9:
                    int t2 = cVar.mo5485t();
                    if (t2 < C11516e.EnumC11518b.values().length) {
                        bVar2 = C11516e.EnumC11518b.values()[t2];
                        int i6 = C12359a.f27750a[bVar2.ordinal()];
                        if (i6 == 1) {
                            iVar.m21403a("Unsupported matte type: Luma");
                        } else if (i6 == 2) {
                            iVar.m21403a("Unsupported matte type: Luma Inverted");
                        }
                        iVar.m21386r(1);
                        break;
                    } else {
                        iVar.m21403a("Unsupported matte type: " + t2);
                        break;
                    }
                case 10:
                    cVar.mo5493g();
                    while (cVar.mo5488p()) {
                        arrayList3.add(C12361x.m7070a(cVar, iVar));
                    }
                    iVar.m21386r(arrayList3.size());
                    cVar.mo5491i();
                    break;
                case 11:
                    cVar.mo5493g();
                    while (cVar.mo5488p()) {
                        AbstractC11170c a = C12336h.m7121a(cVar, iVar);
                        if (a != null) {
                            arrayList4.add(a);
                        }
                    }
                    cVar.mo5491i();
                    break;
                case 12:
                    cVar.mo5492h();
                    while (cVar.mo5488p()) {
                        int S = cVar.mo5496S(f27748b);
                        if (S == 0) {
                            jVar = C12328d.m7137d(cVar, iVar);
                        } else if (S != 1) {
                            cVar.mo5495U();
                            cVar.mo5494Y();
                        } else {
                            cVar.mo5493g();
                            if (cVar.mo5488p()) {
                                kVar = C12324b.m7151a(cVar, iVar);
                            }
                            while (cVar.mo5488p()) {
                                cVar.mo5494Y();
                            }
                            cVar.mo5491i();
                        }
                    }
                    cVar.mo5489l();
                    break;
                case 13:
                    cVar.mo5493g();
                    ArrayList arrayList5 = new ArrayList();
                    while (cVar.mo5488p()) {
                        cVar.mo5492h();
                        while (cVar.mo5488p()) {
                            int S2 = cVar.mo5496S(f27749c);
                            if (S2 == 0) {
                                int t3 = cVar.mo5485t();
                                if (t3 == 29) {
                                    aVar2 = C12330e.m7127b(cVar, iVar);
                                } else if (t3 == 25) {
                                    jVar2 = new C12342k().m7110b(cVar, iVar);
                                }
                            } else if (S2 != 1) {
                                cVar.mo5495U();
                                cVar.mo5494Y();
                            } else {
                                arrayList5.add(cVar.mo5509C());
                            }
                        }
                        cVar.mo5489l();
                    }
                    cVar.mo5491i();
                    iVar.m21403a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f2 = (float) cVar.mo5486s();
                    break;
                case 15:
                    f4 = (float) cVar.mo5486s();
                    break;
                case 16:
                    i4 = (int) (cVar.mo5485t() * C12949j.m4967e());
                    break;
                case 17:
                    i5 = (int) (cVar.mo5485t() * C12949j.m4967e());
                    break;
                case 18:
                    f3 = (float) cVar.mo5486s();
                    break;
                case 19:
                    f5 = (float) cVar.mo5486s();
                    break;
                case 20:
                    bVar3 = C12328d.m7135f(cVar, iVar, false);
                    break;
                case 21:
                    str3 = cVar.mo5509C();
                    break;
                case 22:
                    z = cVar.mo5487r();
                    break;
                default:
                    cVar.mo5495U();
                    cVar.mo5494Y();
                    break;
            }
        }
        cVar.mo5489l();
        ArrayList arrayList6 = new ArrayList();
        if (f3 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new C13178a(iVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f3)));
            f = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f = 0.0f;
        }
        if (f5 <= f) {
            f5 = iVar.m21398f();
        }
        arrayList2.add(new C13178a(iVar, valueOf, valueOf, null, f3, Float.valueOf(f5)));
        arrayList2.add(new C13178a(iVar, valueOf2, valueOf2, null, f5, Float.valueOf(Float.MAX_VALUE)));
        if (str.endsWith(".ai") || "ai".equals(str3)) {
            iVar.m21403a("Convert your Illustrator layers to shape layers.");
        }
        return new C11516e(arrayList4, iVar, str, j, aVar, j2, str2, arrayList, lVar, i, i2, i3, f2, f4, i4, i5, jVar, kVar, arrayList2, bVar2, bVar3, z, aVar2, jVar2);
    }
}
