package p199kd;

import com.google.zxing.Result;
import java.util.List;
import java.util.Map;
import md.C10589a;
import p066dd.AbstractC6443l;
import p066dd.C6434c;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;
import p066dd.EnumC6445n;
import p137hd.C7997b;
import p137hd.C8000e;
import p137hd.C8002g;
import p214ld.C10402d;

/* renamed from: kd.a */
/* loaded from: classes3.dex */
public final class C9849a implements AbstractC6443l {

    /* renamed from: b */
    private static final C6446o[] f21965b = new C6446o[0];

    /* renamed from: a */
    private final C10402d f21966a = new C10402d();

    /* renamed from: b */
    private static C7997b m15202b(C7997b bVar) {
        int[] l = bVar.m20918l();
        int[] f = bVar.m20922f();
        if (l == null || f == null) {
            throw C6441j.m25551a();
        }
        int c = m15201c(l, bVar);
        int i = l[1];
        int i2 = f[1];
        int i3 = l[0];
        int i4 = ((f[0] - i3) + 1) / c;
        int i5 = ((i2 - i) + 1) / c;
        if (i4 <= 0 || i5 <= 0) {
            throw C6441j.m25551a();
        }
        int i6 = c / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        C7997b bVar2 = new C7997b(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * c) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (bVar.m20923e((i11 * c) + i8, i10)) {
                    bVar2.m20915o(i11, i9);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: c */
    private static int m15201c(int[] iArr, C7997b bVar) {
        int m = bVar.m20917m();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < m && bVar.m20923e(i, i2)) {
            i++;
        }
        if (i != m) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw C6441j.m25551a();
        }
        throw C6441j.m25551a();
    }

    @Override // p066dd.AbstractC6443l
    /* renamed from: a */
    public Result mo1767a(C6434c cVar, Map<EnumC6436e, ?> map) {
        C6446o[] oVarArr;
        C8000e eVar;
        if (map == null || !map.containsKey(EnumC6436e.PURE_BARCODE)) {
            C8002g c = new C10589a(cVar.m25568a()).m12792c();
            C8000e b = this.f21966a.m13488b(c.m20893a());
            oVarArr = c.m20892b();
            eVar = b;
        } else {
            eVar = this.f21966a.m13488b(m15202b(cVar.m25568a()));
            oVarArr = f21965b;
        }
        Result result = new Result(eVar.m20899h(), eVar.m20902e(), oVarArr, EnumC6432a.DATA_MATRIX);
        List<byte[]> a = eVar.m20906a();
        if (a != null) {
            result.m27001h(EnumC6445n.BYTE_SEGMENTS, a);
        }
        String b2 = eVar.m20905b();
        if (b2 != null) {
            result.m27001h(EnumC6445n.ERROR_CORRECTION_LEVEL, b2);
        }
        return result;
    }

    @Override // p066dd.AbstractC6443l
    public void reset() {
    }
}
