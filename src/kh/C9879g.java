package kh;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import p159ih.C8593q;
import p159ih.C8608t;

/* renamed from: kh.g */
/* loaded from: classes8.dex */
public final class C9879g {

    /* renamed from: a */
    private final List<C8593q> f22032a;

    public C9879g(C8608t typeTable) {
        int t;
        C9971q.m14633g(typeTable, "typeTable");
        List<C8593q> B = typeTable.m18620B();
        if (typeTable.m18619C()) {
            int y = typeTable.m18607y();
            List<C8593q> B2 = typeTable.m18620B();
            C9971q.m14634f(B2, "typeTable.typeList");
            t = C9907k.m14809t(B2, 10);
            ArrayList arrayList = new ArrayList(t);
            int i = 0;
            for (Object obj : B2) {
                int i2 = i + 1;
                if (i < 0) {
                    C9906j.m14810s();
                }
                C8593q qVar = (C8593q) obj;
                if (i >= y) {
                    qVar = qVar.mo8782a().m18736M(true).build();
                }
                arrayList.add(qVar);
                i = i2;
            }
            B = arrayList;
        }
        C9971q.m14634f(B, "run {\n        val origin… else originalTypes\n    }");
        this.f22032a = B;
    }

    /* renamed from: a */
    public final C8593q m15110a(int i) {
        return this.f22032a.get(i);
    }
}
