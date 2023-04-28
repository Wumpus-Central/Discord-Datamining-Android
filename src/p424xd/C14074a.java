package p424xd;

import com.google.zxing.Result;
import java.util.List;
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
import p137hd.C8002g;
import p445yd.C14358e;
import p445yd.C14362i;
import p464zd.C14619c;

/* renamed from: xd.a */
/* loaded from: classes3.dex */
public class C14074a implements AbstractC6443l {

    /* renamed from: b */
    private static final C6446o[] f31765b = new C6446o[0];

    /* renamed from: a */
    private final C14358e f31766a = new C14358e();

    /* renamed from: b */
    private static C7997b m1766b(C7997b bVar) {
        int[] l = bVar.m20918l();
        int[] f = bVar.m20922f();
        if (l == null || f == null) {
            throw C6441j.m25551a();
        }
        float c = m1765c(l, bVar);
        int i = l[1];
        int i2 = f[1];
        int i3 = l[0];
        int i4 = f[0];
        if (i3 >= i4 || i >= i2) {
            throw C6441j.m25551a();
        }
        int i5 = i2 - i;
        if (i5 == i4 - i3 || (i4 = i3 + i5) < bVar.m20917m()) {
            int round = Math.round(((i4 - i3) + 1) / c);
            int round2 = Math.round((i5 + 1) / c);
            if (round <= 0 || round2 <= 0) {
                throw C6441j.m25551a();
            } else if (round2 == round) {
                int i6 = (int) (c / 2.0f);
                int i7 = i + i6;
                int i8 = i3 + i6;
                int i9 = (((int) ((round - 1) * c)) + i8) - i4;
                if (i9 > 0) {
                    if (i9 <= i6) {
                        i8 -= i9;
                    } else {
                        throw C6441j.m25551a();
                    }
                }
                int i10 = (((int) ((round2 - 1) * c)) + i7) - i2;
                if (i10 > 0) {
                    if (i10 <= i6) {
                        i7 -= i10;
                    } else {
                        throw C6441j.m25551a();
                    }
                }
                C7997b bVar2 = new C7997b(round, round2);
                for (int i11 = 0; i11 < round2; i11++) {
                    int i12 = ((int) (i11 * c)) + i7;
                    for (int i13 = 0; i13 < round; i13++) {
                        if (bVar.m20923e(((int) (i13 * c)) + i8, i12)) {
                            bVar2.m20915o(i13, i11);
                        }
                    }
                }
                return bVar2;
            } else {
                throw C6441j.m25551a();
            }
        } else {
            throw C6441j.m25551a();
        }
    }

    /* renamed from: c */
    private static float m1765c(int[] iArr, C7997b bVar) {
        int j = bVar.m20920j();
        int m = bVar.m20917m();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < m && i2 < j) {
            if (z != bVar.m20923e(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != m && i2 != j) {
            return (i - iArr[0]) / 7.0f;
        }
        throw C6441j.m25551a();
    }

    @Override // p066dd.AbstractC6443l
    /* renamed from: a */
    public final Result mo1767a(C6434c cVar, Map<EnumC6436e, ?> map) {
        C6446o[] oVarArr;
        C8000e eVar;
        if (map == null || !map.containsKey(EnumC6436e.PURE_BARCODE)) {
            C8002g e = new C14619c(cVar.m25568a()).m110e(map);
            C8000e b = this.f31766a.m789b(e.m20893a(), map);
            oVarArr = e.m20892b();
            eVar = b;
        } else {
            eVar = this.f31766a.m789b(m1766b(cVar.m25568a()), map);
            oVarArr = f31765b;
        }
        if (eVar.m20903d() instanceof C14362i) {
            ((C14362i) eVar.m20903d()).m779a(oVarArr);
        }
        Result result = new Result(eVar.m20899h(), eVar.m20902e(), oVarArr, EnumC6432a.QR_CODE);
        List<byte[]> a = eVar.m20906a();
        if (a != null) {
            result.m27001h(EnumC6445n.BYTE_SEGMENTS, a);
        }
        String b2 = eVar.m20905b();
        if (b2 != null) {
            result.m27001h(EnumC6445n.ERROR_CORRECTION_LEVEL, b2);
        }
        if (eVar.m20898i()) {
            result.m27001h(EnumC6445n.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.m20900g()));
            result.m27001h(EnumC6445n.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.m20901f()));
        }
        return result;
    }

    @Override // p066dd.AbstractC6443l
    public void reset() {
    }
}
