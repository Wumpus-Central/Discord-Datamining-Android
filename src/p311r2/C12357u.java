package p311r2;

import java.util.ArrayList;
import java.util.List;
import p126h2.C7762i;
import p188k2.C9735i;
import p331s2.AbstractC12777c;
import p358u2.C13178a;

/* renamed from: r2.u */
/* loaded from: classes.dex */
class C12357u {

    /* renamed from: a */
    static AbstractC12777c.C12778a f27746a = AbstractC12777c.C12778a.m5511a("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> List<C13178a<T>> m7080a(AbstractC12777c cVar, C7762i iVar, float f, AbstractC12349n0<T> n0Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.STRING) {
            iVar.m21403a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.mo5492h();
        while (cVar.mo5488p()) {
            if (cVar.mo5496S(f27746a) != 0) {
                cVar.mo5494Y();
            } else if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.BEGIN_ARRAY) {
                cVar.mo5493g();
                if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.NUMBER) {
                    arrayList.add(C12356t.m7086c(cVar, iVar, f, n0Var, false, z));
                } else {
                    while (cVar.mo5488p()) {
                        arrayList.add(C12356t.m7086c(cVar, iVar, f, n0Var, true, z));
                    }
                }
                cVar.mo5491i();
            } else {
                arrayList.add(C12356t.m7086c(cVar, iVar, f, n0Var, false, z));
            }
        }
        cVar.mo5489l();
        m7079b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static <T> void m7079b(List<? extends C13178a<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C13178a aVar = (C13178a) list.get(i2);
            i2++;
            C13178a aVar2 = (C13178a) list.get(i2);
            aVar.f29546h = Float.valueOf(aVar2.f29545g);
            if (aVar.f29541c == null && (t = aVar2.f29540b) != null) {
                aVar.f29541c = t;
                if (aVar instanceof C9735i) {
                    ((C9735i) aVar).m15476i();
                }
            }
        }
        C13178a aVar3 = (C13178a) list.get(i);
        if ((aVar3.f29540b == null || aVar3.f29541c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
