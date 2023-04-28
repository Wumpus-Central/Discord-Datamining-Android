package p154i9;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p119g9.C7557q0;
import p119g9.C7569x;
import p119g9.C7570y;
import p154i9.C8313d;

/* renamed from: i9.e */
/* loaded from: classes5.dex */
public final class C8316e {
    /* renamed from: a */
    public static C8313d m19971a(byte[] bArr, int i) {
        ArrayList<C8313d.C8314a> arrayList;
        C7570y yVar = new C7570y(bArr);
        try {
            if (m19969c(yVar)) {
                arrayList = m19966f(yVar);
            } else {
                arrayList = m19967e(yVar);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new C8313d(arrayList.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new C8313d(arrayList.get(0), arrayList.get(1), i);
    }

    /* renamed from: b */
    private static int m19970b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* renamed from: c */
    private static boolean m19969c(C7570y yVar) {
        yVar.m22016Q(4);
        int n = yVar.m22002n();
        yVar.m22017P(0);
        if (n == 1886547818) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static C8313d.C8314a m19968d(C7570y yVar) {
        int n = yVar.m22002n();
        if (n > 10000) {
            return null;
        }
        float[] fArr = new float[n];
        for (int i = 0; i < n; i++) {
            fArr[i] = yVar.m22003m();
        }
        int n2 = yVar.m22002n();
        if (n2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(n * 2.0d) / log);
        C7569x xVar = new C7569x(yVar.m22012d());
        int i2 = 8;
        xVar.m22036p(yVar.m22011e() * 8);
        float[] fArr2 = new float[n2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < n2) {
            int i6 = 0;
            while (i6 < i3) {
                int b = iArr[i6] + m19970b(xVar.m22044h(ceil));
                if (b >= n || b < 0) {
                    return null;
                }
                fArr2[i5] = fArr[b];
                iArr[i6] = b;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        xVar.m22036p((xVar.m22047e() + 7) & (-8));
        int i7 = 32;
        int h = xVar.m22044h(32);
        C8313d.C8315b[] bVarArr = new C8313d.C8315b[h];
        int i8 = 0;
        while (i8 < h) {
            int h2 = xVar.m22044h(i2);
            int h3 = xVar.m22044h(i2);
            int h4 = xVar.m22044h(i7);
            if (h4 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(n2 * d) / log);
            float[] fArr3 = new float[h4 * 3];
            float[] fArr4 = new float[h4 * 2];
            int i9 = 0;
            for (int i10 = 0; i10 < h4; i10++) {
                i9 += m19970b(xVar.m22044h(ceil2));
                if (i9 < 0 || i9 >= n2) {
                    return null;
                }
                int i11 = i10 * 3;
                int i12 = i9 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i10 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
            }
            bVarArr[i8] = new C8313d.C8315b(h2, fArr3, fArr4, h3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new C8313d.C8314a(bVarArr);
    }

    /* renamed from: e */
    private static ArrayList<C8313d.C8314a> m19967e(C7570y yVar) {
        if (yVar.m22029D() != 0) {
            return null;
        }
        yVar.m22016Q(7);
        int n = yVar.m22002n();
        if (n == 1684433976) {
            C7570y yVar2 = new C7570y();
            Inflater inflater = new Inflater(true);
            try {
                if (!C7557q0.m22136n0(yVar, yVar2, inflater)) {
                    return null;
                }
                inflater.end();
                yVar = yVar2;
            } finally {
                inflater.end();
            }
        } else if (n != 1918990112) {
            return null;
        }
        return m19965g(yVar);
    }

    /* renamed from: f */
    private static ArrayList<C8313d.C8314a> m19966f(C7570y yVar) {
        int n;
        yVar.m22016Q(8);
        int e = yVar.m22011e();
        int f = yVar.m22010f();
        while (e < f && (n = yVar.m22002n() + e) > e && n <= f) {
            int n2 = yVar.m22002n();
            if (n2 == 2037673328 || n2 == 1836279920) {
                yVar.m22018O(n);
                return m19967e(yVar);
            }
            yVar.m22017P(n);
            e = n;
        }
        return null;
    }

    /* renamed from: g */
    private static ArrayList<C8313d.C8314a> m19965g(C7570y yVar) {
        ArrayList<C8313d.C8314a> arrayList = new ArrayList<>();
        int e = yVar.m22011e();
        int f = yVar.m22010f();
        while (e < f) {
            int n = yVar.m22002n() + e;
            if (n <= e || n > f) {
                return null;
            }
            if (yVar.m22002n() == 1835365224) {
                C8313d.C8314a d = m19968d(yVar);
                if (d == null) {
                    return null;
                }
                arrayList.add(d);
            }
            yVar.m22017P(n);
            e = n;
        }
        return arrayList;
    }
}
