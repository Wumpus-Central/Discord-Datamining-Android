package p009a8;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import p030bc.C3452d;
import p119g9.C7569x;
import p459z7.AbstractC14585h;
import p459z7.C14576a;
import p459z7.C14582e;

/* renamed from: a8.b */
/* loaded from: classes7.dex */
public final class C1333b extends AbstractC14585h {
    /* renamed from: c */
    private static C14576a m41346c(C7569x xVar) {
        xVar.m22034r(12);
        int d = (xVar.m22048d() + xVar.m22044h(12)) - 4;
        xVar.m22034r(44);
        xVar.m22033s(xVar.m22044h(12));
        xVar.m22034r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (xVar.m22048d() >= d) {
                break;
            }
            xVar.m22034r(48);
            int h = xVar.m22044h(8);
            xVar.m22034r(4);
            int d2 = xVar.m22048d() + xVar.m22044h(12);
            String str2 = null;
            while (xVar.m22048d() < d2) {
                int h2 = xVar.m22044h(8);
                int h3 = xVar.m22044h(8);
                int d3 = xVar.m22048d() + h3;
                if (h2 == 2) {
                    int h4 = xVar.m22044h(16);
                    xVar.m22034r(8);
                    if (h4 != 3) {
                    }
                    while (xVar.m22048d() < d3) {
                        str = xVar.m22040l(xVar.m22044h(8), C3452d.f5593a);
                        int h5 = xVar.m22044h(8);
                        for (int i = 0; i < h5; i++) {
                            xVar.m22033s(xVar.m22044h(8));
                        }
                    }
                } else if (h2 == 21) {
                    str2 = xVar.m22040l(h3, C3452d.f5593a);
                }
                xVar.m22036p(d3 * 8);
            }
            xVar.m22036p(d2 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new C1332a(h, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C14576a(arrayList);
    }

    @Override // p459z7.AbstractC14585h
    /* renamed from: b */
    protected C14576a mo161b(C14582e eVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m41346c(new C7569x(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
