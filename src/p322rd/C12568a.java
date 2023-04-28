package p322rd;

import java.util.List;
import p137hd.C7996a;

/* renamed from: rd.a */
/* loaded from: classes3.dex */
final class C12568a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7996a m6532a(List<C12569b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).m6528d() == null) {
            size--;
        }
        C7996a aVar = new C7996a(size * 12);
        int i = 0;
        int b = list.get(0).m6528d().m7820b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.m20928n(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C12569b bVar = list.get(i3);
            int b2 = bVar.m6529c().m7820b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & b2) != 0) {
                    aVar.m20928n(i);
                }
                i++;
            }
            if (bVar.m6528d() != null) {
                int b3 = bVar.m6528d().m7820b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & b3) != 0) {
                        aVar.m20928n(i);
                    }
                    i++;
                }
            }
        }
        return aVar;
    }
}
