package p285pd;

import com.google.zxing.Result;
import java.util.Arrays;
import java.util.Map;
import p066dd.AbstractC6443l;
import p066dd.C6434c;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6436e;
import p066dd.EnumC6445n;
import p137hd.C7996a;

/* renamed from: pd.k */
/* loaded from: classes3.dex */
public abstract class AbstractC11631k implements AbstractC6443l {
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c A[Catch: m -> 0x00cc, TRY_LEAVE, TryCatch #0 {m -> 0x00cc, blocks: (B:38:0x0076, B:40:0x007c), top: B:64:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cb A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.zxing.Result m9202c(p066dd.C6434c r22, java.util.Map<p066dd.EnumC6436e, ?> r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285pd.AbstractC11631k.m9202c(dd.c, java.util.Map):com.google.zxing.Result");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static float m9201d(int[] iArr, int[] iArr2, float f) {
        float f2;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = i;
        float f4 = f3 / i2;
        float f5 = f * f4;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f7 = iArr2[i4] * f4;
            float f8 = iArr[i4];
            if (f8 > f7) {
                f2 = f8 - f7;
            } else {
                f2 = f7 - f8;
            }
            if (f2 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f2;
        }
        return f6 / f3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static void m9200e(C7996a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int j = aVar.m20932j();
        if (i < j) {
            boolean z = !aVar.m20936d(i);
            while (i < j) {
                if (aVar.m20936d(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != j) {
                throw C6441j.m25551a();
            }
            return;
        }
        throw C6441j.m25551a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static void m9199f(C7996a aVar, int i, int[] iArr) {
        int length = iArr.length;
        boolean d = aVar.m20936d(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.m20936d(i) != d) {
                length--;
                d = !d;
            }
        }
        if (length < 0) {
            m9200e(aVar, i + 1, iArr);
            return;
        }
        throw C6441j.m25551a();
    }

    @Override // p066dd.AbstractC6443l
    /* renamed from: a */
    public Result mo1767a(C6434c cVar, Map<EnumC6436e, ?> map) {
        boolean z;
        try {
            return m9202c(cVar, map);
        } catch (C6441j e) {
            if (map == null || !map.containsKey(EnumC6436e.TRY_HARDER)) {
                z = false;
            } else {
                z = true;
            }
            if (!z || !cVar.m25564e()) {
                throw e;
            }
            C6434c f = cVar.m25563f();
            Result c = m9202c(f, map);
            Map<EnumC6445n, Object> d = c.m27005d();
            int i = 270;
            if (d != null) {
                EnumC6445n nVar = EnumC6445n.ORIENTATION;
                if (d.containsKey(nVar)) {
                    i = (((Integer) d.get(nVar)).intValue() + 270) % 360;
                }
            }
            c.m27001h(EnumC6445n.ORIENTATION, Integer.valueOf(i));
            C6446o[] e2 = c.m27004e();
            if (e2 != null) {
                int c2 = f.m25566c();
                for (int i2 = 0; i2 < e2.length; i2++) {
                    e2[i2] = new C6446o((c2 - e2[i2].m25544d()) - 1.0f, e2[i2].m25545c());
                }
            }
            return c;
        }
    }

    /* renamed from: b */
    public abstract Result mo6515b(int i, C7996a aVar, Map<EnumC6436e, ?> map);

    @Override // p066dd.AbstractC6443l
    public void reset() {
    }
}
