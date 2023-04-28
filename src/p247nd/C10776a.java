package p247nd;

import com.google.zxing.Result;
import java.util.Map;
import p066dd.AbstractC6443l;
import p066dd.C6434c;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;
import p066dd.EnumC6445n;
import p137hd.C7997b;
import p137hd.C8000e;
import p265od.C11257c;

/* renamed from: nd.a */
/* loaded from: classes3.dex */
public final class C10776a implements AbstractC6443l {

    /* renamed from: b */
    private static final C6446o[] f23925b = new C6446o[0];

    /* renamed from: a */
    private final C11257c f23926a = new C11257c();

    /* renamed from: b */
    private static C7997b m12353b(C7997b bVar) {
        int[] h = bVar.m20921h();
        if (h != null) {
            int i = h[0];
            int i2 = h[1];
            int i3 = h[2];
            int i4 = h[3];
            C7997b bVar2 = new C7997b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (bVar.m20923e(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        bVar2.m20915o(i7, i5);
                    }
                }
            }
            return bVar2;
        }
        throw C6441j.m25551a();
    }

    @Override // p066dd.AbstractC6443l
    /* renamed from: a */
    public Result mo1767a(C6434c cVar, Map<EnumC6436e, ?> map) {
        if (map == null || !map.containsKey(EnumC6436e.PURE_BARCODE)) {
            throw C6441j.m25551a();
        }
        C8000e b = this.f23926a.m10318b(m12353b(cVar.m25568a()), map);
        Result result = new Result(b.m20899h(), b.m20902e(), f23925b, EnumC6432a.MAXICODE);
        String b2 = b.m20905b();
        if (b2 != null) {
            result.m27001h(EnumC6445n.ERROR_CORRECTION_LEVEL, b2);
        }
        return result;
    }

    @Override // p066dd.AbstractC6443l
    public void reset() {
    }
}
