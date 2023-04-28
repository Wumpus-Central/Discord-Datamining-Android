package p311r2;

import android.graphics.Rect;
import androidx.collection.C2098d;
import androidx.collection.SparseArrayCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p126h2.C7753f0;
import p126h2.C7762i;
import p223m2.C10472c;
import p223m2.C10473d;
import p223m2.C10477h;
import p275p2.C11516e;
import p331s2.AbstractC12777c;
import p343t2.C12945f;
import p343t2.C12949j;

/* renamed from: r2.w */
/* loaded from: classes.dex */
public class C12360w {

    /* renamed from: a */
    private static final AbstractC12777c.C12778a f27751a = AbstractC12777c.C12778a.m5511a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    static AbstractC12777c.C12778a f27752b = AbstractC12777c.C12778a.m5511a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    private static final AbstractC12777c.C12778a f27753c = AbstractC12777c.C12778a.m5511a("list");

    /* renamed from: d */
    private static final AbstractC12777c.C12778a f27754d = AbstractC12777c.C12778a.m5511a("cm", "tm", "dr");

    /* renamed from: a */
    public static C7762i m7076a(AbstractC12777c cVar) {
        ArrayList arrayList;
        HashMap hashMap;
        AbstractC12777c cVar2 = cVar;
        float e = C12949j.m4967e();
        C2098d<C11516e> dVar = new C2098d<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<C10473d> sparseArrayCompat = new SparseArrayCompat<>();
        C7762i iVar = new C7762i();
        cVar.mo5492h();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (cVar.mo5488p()) {
            switch (cVar2.mo5496S(f27751a)) {
                case 0:
                    i = cVar.mo5485t();
                    continue;
                    cVar2 = cVar;
                case 1:
                    i2 = cVar.mo5485t();
                    continue;
                    cVar2 = cVar;
                case 2:
                    f = (float) cVar.mo5486s();
                    continue;
                    cVar2 = cVar;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) cVar.mo5486s()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) cVar.mo5486s();
                    break;
                case 5:
                    String[] split = cVar.mo5509C().split("\\.");
                    if (!C12949j.m4962j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        iVar.m21403a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    m7072e(cVar2, iVar, arrayList2, dVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    m7075b(cVar2, iVar, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    m7073d(cVar2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    m7074c(cVar2, iVar, sparseArrayCompat);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    m7071f(cVar2, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.mo5495U();
                    cVar.mo5494Y();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        iVar.m21385s(new Rect(0, 0, (int) (i * e), (int) (i2 * e)), f, f2, f3, arrayList2, dVar, hashMap2, hashMap3, sparseArrayCompat, hashMap4, arrayList3);
        return iVar;
    }

    /* renamed from: b */
    private static void m7075b(AbstractC12777c cVar, C7762i iVar, Map<String, List<C11516e>> map, Map<String, C7753f0> map2) {
        cVar.mo5493g();
        while (cVar.mo5488p()) {
            ArrayList arrayList = new ArrayList();
            C2098d dVar = new C2098d();
            cVar.mo5492h();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (cVar.mo5488p()) {
                int S = cVar.mo5496S(f27752b);
                if (S == 0) {
                    str = cVar.mo5509C();
                } else if (S == 1) {
                    cVar.mo5493g();
                    while (cVar.mo5488p()) {
                        C11516e b = C12358v.m7077b(cVar, iVar);
                        dVar.m39011m(b.m9498d(), b);
                        arrayList.add(b);
                    }
                    cVar.mo5491i();
                } else if (S == 2) {
                    i = cVar.mo5485t();
                } else if (S == 3) {
                    i2 = cVar.mo5485t();
                } else if (S == 4) {
                    str2 = cVar.mo5509C();
                } else if (S != 5) {
                    cVar.mo5495U();
                    cVar.mo5494Y();
                } else {
                    str3 = cVar.mo5509C();
                }
            }
            cVar.mo5489l();
            if (str2 != null) {
                C7753f0 f0Var = new C7753f0(i, i2, str, str2, str3);
                map2.put(f0Var.m21434d(), f0Var);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.mo5491i();
    }

    /* renamed from: c */
    private static void m7074c(AbstractC12777c cVar, C7762i iVar, SparseArrayCompat<C10473d> sparseArrayCompat) {
        cVar.mo5493g();
        while (cVar.mo5488p()) {
            C10473d a = C12346m.m7106a(cVar, iVar);
            sparseArrayCompat.m39039l(a.hashCode(), a);
        }
        cVar.mo5491i();
    }

    /* renamed from: d */
    private static void m7073d(AbstractC12777c cVar, Map<String, C10472c> map) {
        cVar.mo5492h();
        while (cVar.mo5488p()) {
            if (cVar.mo5496S(f27753c) != 0) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else {
                cVar.mo5493g();
                while (cVar.mo5488p()) {
                    C10472c a = C12348n.m7104a(cVar);
                    map.put(a.m13102b(), a);
                }
                cVar.mo5491i();
            }
        }
        cVar.mo5489l();
    }

    /* renamed from: e */
    private static void m7072e(AbstractC12777c cVar, C7762i iVar, List<C11516e> list, C2098d<C11516e> dVar) {
        cVar.mo5493g();
        int i = 0;
        while (cVar.mo5488p()) {
            C11516e b = C12358v.m7077b(cVar, iVar);
            if (b.m9496f() == C11516e.EnumC11517a.IMAGE) {
                i++;
            }
            list.add(b);
            dVar.m39011m(b.m9498d(), b);
            if (i > 4) {
                C12945f.m5009c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.mo5491i();
    }

    /* renamed from: f */
    private static void m7071f(AbstractC12777c cVar, List<C10477h> list) {
        cVar.mo5493g();
        while (cVar.mo5488p()) {
            cVar.mo5492h();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (cVar.mo5488p()) {
                int S = cVar.mo5496S(f27754d);
                if (S == 0) {
                    str = cVar.mo5509C();
                } else if (S == 1) {
                    f = (float) cVar.mo5486s();
                } else if (S != 2) {
                    cVar.mo5495U();
                    cVar.mo5494Y();
                } else {
                    f2 = (float) cVar.mo5486s();
                }
            }
            cVar.mo5489l();
            list.add(new C10477h(str, f, f2));
        }
        cVar.mo5491i();
    }
}
