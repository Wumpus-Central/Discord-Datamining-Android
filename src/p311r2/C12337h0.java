package p311r2;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p223m2.C10469a;
import p254o2.C11184n;
import p331s2.AbstractC12777c;
import p343t2.C12948i;

/* renamed from: r2.h0 */
/* loaded from: classes.dex */
public class C12337h0 implements AbstractC12349n0<C11184n> {

    /* renamed from: a */
    public static final C12337h0 f27707a = new C12337h0();

    /* renamed from: b */
    private static final AbstractC12777c.C12778a f27708b = AbstractC12777c.C12778a.m5511a("c", "v", "i", "o");

    private C12337h0() {
    }

    /* renamed from: b */
    public C11184n mo7097a(AbstractC12777c cVar, float f) {
        if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.BEGIN_ARRAY) {
            cVar.mo5493g();
        }
        cVar.mo5492h();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (cVar.mo5488p()) {
            int S = cVar.mo5496S(f27708b);
            if (S == 0) {
                z = cVar.mo5487r();
            } else if (S == 1) {
                list = C12354s.m7090f(cVar, f);
            } else if (S == 2) {
                list2 = C12354s.m7090f(cVar, f);
            } else if (S != 3) {
                cVar.mo5495U();
                cVar.mo5494Y();
            } else {
                list3 = C12354s.m7090f(cVar, f);
            }
        }
        cVar.mo5489l();
        if (cVar.mo5497Q() == AbstractC12777c.EnumC12779b.END_ARRAY) {
            cVar.mo5491i();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C11184n(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C10469a(C12948i.m4982a(list.get(i2), list3.get(i2)), C12948i.m4982a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C10469a(C12948i.m4982a(list.get(i3), list3.get(i3)), C12948i.m4982a(pointF3, list2.get(0)), pointF3));
            }
            return new C11184n(pointF, z, arrayList);
        }
    }
}
