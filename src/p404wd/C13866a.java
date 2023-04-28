package p404wd;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p066dd.C6434c;
import p066dd.C6446o;
import p066dd.EnumC6436e;
import p137hd.C7997b;

/* renamed from: wd.a */
/* loaded from: classes3.dex */
public final class C13866a {

    /* renamed from: a */
    private static final int[] f31220a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f31221b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f31222c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f31223d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    private static void m2484a(C6446o[] oVarArr, C6446o[] oVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            oVarArr[iArr[i]] = oVarArr2[i];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4 == 0) goto L_0x0077;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r3.hasNext() == false) goto L_0x004b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r4 = (p066dd.C6446o[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7 == null) goto L_0x003d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = (int) java.lang.Math.max(r2, r7.m25544d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        r2 = java.lang.Math.max(r2, (int) r4.m25544d());
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<p066dd.C6446o[]> m2483b(boolean r8, p137hd.C7997b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0008:
            r4 = r3
        L_0x0009:
            int r5 = r9.m20920j()
            if (r2 >= r5) goto L_0x0077
            dd.o[] r3 = m2479f(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L_0x004f
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L_0x004f
            if (r4 == 0) goto L_0x0077
            java.util.Iterator r3 = r0.iterator()
        L_0x0023:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004b
            java.lang.Object r4 = r3.next()
            dd.o[] r4 = (p066dd.C6446o[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L_0x003d
            float r2 = (float) r2
            float r7 = r7.m25544d()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L_0x003d:
            r4 = r4[r5]
            if (r4 == 0) goto L_0x0023
            float r4 = r4.m25544d()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L_0x0023
        L_0x004b:
            int r2 = r2 + 5
            r3 = r1
            goto L_0x0008
        L_0x004f:
            r0.add(r3)
            if (r8 == 0) goto L_0x0077
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0065
            float r4 = r4.m25545c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.m25544d()
            goto L_0x0073
        L_0x0065:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.m25545c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.m25544d()
        L_0x0073:
            int r2 = (int) r2
            r3 = r4
            r4 = r6
            goto L_0x0009
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p404wd.C13866a.m2483b(boolean, hd.b):java.util.List");
    }

    /* renamed from: c */
    public static C13867b m2482c(C6434c cVar, Map<EnumC6436e, ?> map, boolean z) {
        C7997b a = cVar.m25568a();
        List<C6446o[]> b = m2483b(z, a);
        if (b.isEmpty()) {
            a = a.clone();
            a.m20916n();
            b = m2483b(z, a);
        }
        return new C13867b(a, b);
    }

    /* renamed from: d */
    private static int[] m2481d(C7997b bVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bVar.m20923e(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (bVar.m20923e(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else if (m2478g(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m2478g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: e */
    private static C6446o[] m2480e(C7997b bVar, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        C6446o[] oVarArr = new C6446o[4];
        int[] iArr2 = new int[iArr.length];
        int i8 = i3;
        while (true) {
            if (i8 >= i) {
                z = false;
                break;
            }
            int[] d = m2481d(bVar, i4, i8, i2, false, iArr, iArr2);
            if (d != null) {
                int[] iArr3 = d;
                int i9 = i8;
                while (true) {
                    if (i9 <= 0) {
                        i7 = i9;
                        break;
                    }
                    int i10 = i9 - 1;
                    int[] d2 = m2481d(bVar, i4, i10, i2, false, iArr, iArr2);
                    if (d2 == null) {
                        i7 = i10 + 1;
                        break;
                    }
                    iArr3 = d2;
                    i9 = i10;
                }
                float f = i7;
                oVarArr[0] = new C6446o(iArr3[0], f);
                oVarArr[1] = new C6446o(iArr3[1], f);
                z = true;
                i8 = i7;
            } else {
                i8 += 5;
            }
        }
        int i11 = i8 + 1;
        if (z) {
            int[] iArr4 = {(int) oVarArr[0].m25545c(), (int) oVarArr[1].m25545c()};
            int i12 = i11;
            int i13 = 0;
            while (true) {
                if (i12 >= i) {
                    i5 = i13;
                    i6 = i12;
                    break;
                }
                i5 = i13;
                i6 = i12;
                int[] d3 = m2481d(bVar, iArr4[0], i12, i2, false, iArr, iArr2);
                if (d3 == null || Math.abs(iArr4[0] - d3[0]) >= 5 || Math.abs(iArr4[1] - d3[1]) >= 5) {
                    if (i5 > 25) {
                        break;
                    }
                    i13 = i5 + 1;
                } else {
                    iArr4 = d3;
                    i13 = 0;
                }
                i12 = i6 + 1;
            }
            i11 = i6 - (i5 + 1);
            float f2 = i11;
            oVarArr[2] = new C6446o(iArr4[0], f2);
            oVarArr[3] = new C6446o(iArr4[1], f2);
        }
        if (i11 - i8 < 10) {
            Arrays.fill(oVarArr, (Object) null);
        }
        return oVarArr;
    }

    /* renamed from: f */
    private static C6446o[] m2479f(C7997b bVar, int i, int i2) {
        int j = bVar.m20920j();
        int m = bVar.m20917m();
        C6446o[] oVarArr = new C6446o[8];
        m2484a(oVarArr, m2480e(bVar, j, m, i, i2, f31222c), f31220a);
        C6446o oVar = oVarArr[4];
        if (oVar != null) {
            i2 = (int) oVar.m25545c();
            i = (int) oVarArr[4].m25544d();
        }
        m2484a(oVarArr, m2480e(bVar, j, m, i, i2, f31223d), f31221b);
        return oVarArr;
    }

    /* renamed from: g */
    private static float m2478g(int[] iArr, int[] iArr2, float f) {
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
}
