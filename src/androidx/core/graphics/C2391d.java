package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: androidx.core.graphics.d */
/* loaded from: classes.dex */
public class C2391d {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.graphics.d$a */
    /* loaded from: classes.dex */
    public static class C2392a {

        /* renamed from: a */
        int f3334a;

        /* renamed from: b */
        boolean f3335b;

        C2392a() {
        }
    }

    /* renamed from: a */
    private static void m37906a(ArrayList<C2393b> arrayList, char c, float[] fArr) {
        arrayList.add(new C2393b(c, fArr));
    }

    /* renamed from: b */
    public static boolean m37905b(C2393b[] bVarArr, C2393b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            C2393b bVar = bVarArr[i];
            char c = bVar.f3336a;
            C2393b bVar2 = bVarArr2[i];
            if (!(c == bVar2.f3336a && bVar.f3337b.length == bVar2.f3337b.length)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    static float[] m37904c(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static C2393b[] m37903d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = m37898i(str, i);
            String trim = str.substring(i2, i3).trim();
            if (trim.length() > 0) {
                m37906a(arrayList, trim.charAt(0), m37899h(trim));
            }
            i2 = i3;
            i = i3 + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m37906a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C2393b[]) arrayList.toArray(new C2393b[arrayList.size()]);
    }

    /* renamed from: e */
    public static Path m37902e(String str) {
        Path path = new Path();
        C2393b[] d = m37903d(str);
        if (d == null) {
            return null;
        }
        try {
            C2393b.m37892e(d, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    /* renamed from: f */
    public static C2393b[] m37901f(C2393b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        C2393b[] bVarArr2 = new C2393b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new C2393b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[LOOP:0: B:3:0x0007->B:22:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m37900g(java.lang.String r8, int r9, androidx.core.graphics.C2391d.C2392a r10) {
        /*
            r0 = 0
            r10.f3335b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L_0x0007:
            int r5 = r8.length()
            if (r1 >= r5) goto L_0x003d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L_0x0035
            r6 = 69
            if (r5 == r6) goto L_0x0033
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0033
            switch(r5) {
                case 44: goto L_0x0035;
                case 45: goto L_0x002a;
                case 46: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0031
        L_0x0022:
            if (r3 != 0) goto L_0x0027
            r2 = r0
            r3 = r7
            goto L_0x0037
        L_0x0027:
            r10.f3335b = r7
            goto L_0x0035
        L_0x002a:
            if (r1 == r9) goto L_0x0031
            if (r2 != 0) goto L_0x0031
            r10.f3335b = r7
            goto L_0x0035
        L_0x0031:
            r2 = r0
            goto L_0x0037
        L_0x0033:
            r2 = r7
            goto L_0x0037
        L_0x0035:
            r2 = r0
            r4 = r7
        L_0x0037:
            if (r4 == 0) goto L_0x003a
            goto L_0x003d
        L_0x003a:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003d:
            r10.f3334a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C2391d.m37900g(java.lang.String, int, androidx.core.graphics.d$a):void");
    }

    /* renamed from: h */
    private static float[] m37899h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C2392a aVar = new C2392a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                m37900g(str, i, aVar);
                int i3 = aVar.f3334a;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                if (aVar.f3335b) {
                    i = i3;
                } else {
                    i = i3 + 1;
                }
            }
            return m37904c(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    /* renamed from: i */
    private static int m37898i(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: j */
    public static void m37897j(C2393b[] bVarArr, C2393b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].f3336a = bVarArr2[i].f3336a;
            int i2 = 0;
            while (true) {
                float[] fArr = bVarArr2[i].f3337b;
                if (i2 < fArr.length) {
                    bVarArr[i].f3337b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    /* renamed from: androidx.core.graphics.d$b */
    /* loaded from: classes.dex */
    public static class C2393b {

        /* renamed from: a */
        public char f3336a;

        /* renamed from: b */
        public float[] f3337b;

        C2393b(char c, float[] fArr) {
            this.f3336a = c;
            this.f3337b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        private static void m37896a(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            int i3;
            char c3 = c2;
            char c4 = 0;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i3 = 7;
                    i = i3;
                    break;
                case 'C':
                case 'c':
                    i3 = 6;
                    i = i3;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i4 = 0;
            char c5 = c;
            while (i4 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i2 = i4;
                        int i5 = i2 + 2;
                        int i6 = i2 + 3;
                        int i7 = i2 + 4;
                        int i8 = i2 + 5;
                        path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8]);
                        f15 = fArr2[i7];
                        float f19 = fArr2[i8];
                        float f20 = fArr2[i5];
                        float f21 = fArr2[i6];
                        f16 = f19;
                        f12 = f21;
                        f11 = f20;
                    } else if (c3 == 'H') {
                        i2 = i4;
                        int i9 = i2 + 0;
                        path.lineTo(fArr2[i9], f16);
                        f15 = fArr2[i9];
                    } else if (c3 == 'Q') {
                        i2 = i4;
                        int i10 = i2 + 0;
                        int i11 = i2 + 1;
                        int i12 = i2 + 2;
                        int i13 = i2 + 3;
                        path.quadTo(fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                        float f22 = fArr2[i10];
                        float f23 = fArr2[i11];
                        f15 = fArr2[i12];
                        f16 = fArr2[i13];
                        f11 = f22;
                        f12 = f23;
                    } else if (c3 == 'V') {
                        i2 = i4;
                        int i14 = i2 + 0;
                        path.lineTo(f15, fArr2[i14]);
                        f16 = fArr2[i14];
                    } else if (c3 != 'a') {
                        if (c3 != 'c') {
                            if (c3 == 'h') {
                                int i15 = i4 + 0;
                                path.rLineTo(fArr2[i15], 0.0f);
                                f15 += fArr2[i15];
                            } else if (c3 != 'q') {
                                if (c3 == 'v') {
                                    int i16 = i4 + 0;
                                    path.rLineTo(0.0f, fArr2[i16]);
                                    f4 = fArr2[i16];
                                } else if (c3 == 'L') {
                                    int i17 = i4 + 0;
                                    int i18 = i4 + 1;
                                    path.lineTo(fArr2[i17], fArr2[i18]);
                                    f15 = fArr2[i17];
                                    f16 = fArr2[i18];
                                } else if (c3 == 'M') {
                                    f15 = fArr2[i4 + 0];
                                    f16 = fArr2[i4 + 1];
                                    if (i4 > 0) {
                                        path.lineTo(f15, f16);
                                    } else {
                                        path.moveTo(f15, f16);
                                        i2 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 'S') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    int i19 = i4 + 0;
                                    int i20 = i4 + 1;
                                    int i21 = i4 + 2;
                                    int i22 = i4 + 3;
                                    path.cubicTo(f15, f16, fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                                    f2 = fArr2[i19];
                                    f = fArr2[i20];
                                    f15 = fArr2[i21];
                                    f16 = fArr2[i22];
                                    f11 = f2;
                                    f12 = f;
                                } else if (c3 == 'T') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    int i23 = i4 + 0;
                                    int i24 = i4 + 1;
                                    path.quadTo(f15, f16, fArr2[i23], fArr2[i24]);
                                    float f24 = fArr2[i23];
                                    float f25 = fArr2[i24];
                                    i2 = i4;
                                    f12 = f16;
                                    f11 = f15;
                                    f15 = f24;
                                    f16 = f25;
                                } else if (c3 == 'l') {
                                    int i25 = i4 + 0;
                                    int i26 = i4 + 1;
                                    path.rLineTo(fArr2[i25], fArr2[i26]);
                                    f15 += fArr2[i25];
                                    f4 = fArr2[i26];
                                } else if (c3 == 'm') {
                                    float f26 = fArr2[i4 + 0];
                                    f15 += f26;
                                    float f27 = fArr2[i4 + 1];
                                    f16 += f27;
                                    if (i4 > 0) {
                                        path.rLineTo(f26, f27);
                                    } else {
                                        path.rMoveTo(f26, f27);
                                        i2 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 's') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        float f28 = f15 - f11;
                                        f5 = f16 - f12;
                                        f6 = f28;
                                    } else {
                                        f6 = 0.0f;
                                        f5 = 0.0f;
                                    }
                                    int i27 = i4 + 0;
                                    int i28 = i4 + 1;
                                    int i29 = i4 + 2;
                                    int i30 = i4 + 3;
                                    path.rCubicTo(f6, f5, fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                                    f2 = fArr2[i27] + f15;
                                    f = fArr2[i28] + f16;
                                    f15 += fArr2[i29];
                                    f3 = fArr2[i30];
                                } else if (c3 == 't') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f7 = f15 - f11;
                                        f8 = f16 - f12;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i31 = i4 + 0;
                                    int i32 = i4 + 1;
                                    path.rQuadTo(f7, f8, fArr2[i31], fArr2[i32]);
                                    float f29 = f7 + f15;
                                    float f30 = f8 + f16;
                                    f15 += fArr2[i31];
                                    f16 += fArr2[i32];
                                    f12 = f30;
                                    f11 = f29;
                                }
                                f16 += f4;
                            } else {
                                int i33 = i4 + 0;
                                int i34 = i4 + 1;
                                int i35 = i4 + 2;
                                int i36 = i4 + 3;
                                path.rQuadTo(fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                f2 = fArr2[i33] + f15;
                                f = fArr2[i34] + f16;
                                f15 += fArr2[i35];
                                f3 = fArr2[i36];
                            }
                            i2 = i4;
                        } else {
                            int i37 = i4 + 2;
                            int i38 = i4 + 3;
                            int i39 = i4 + 4;
                            int i40 = i4 + 5;
                            path.rCubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                            f2 = fArr2[i37] + f15;
                            f = fArr2[i38] + f16;
                            f15 += fArr2[i39];
                            f3 = fArr2[i40];
                        }
                        f16 += f3;
                        f11 = f2;
                        f12 = f;
                        i2 = i4;
                    } else {
                        int i41 = i4 + 5;
                        float f31 = fArr2[i41] + f15;
                        int i42 = i4 + 6;
                        float f32 = fArr2[i42] + f16;
                        float f33 = fArr2[i4 + 0];
                        float f34 = fArr2[i4 + 1];
                        float f35 = fArr2[i4 + 2];
                        if (fArr2[i4 + 3] != 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (fArr2[i4 + 4] != 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        i2 = i4;
                        m37894c(path, f15, f16, f31, f32, f33, f34, f35, z3, z4);
                        f15 += fArr2[i41];
                        f16 += fArr2[i42];
                    }
                    i4 = i2 + i;
                    c5 = c2;
                    c3 = c5;
                    c4 = 0;
                } else {
                    i2 = i4;
                    int i43 = i2 + 5;
                    float f36 = fArr2[i43];
                    int i44 = i2 + 6;
                    float f37 = fArr2[i44];
                    float f38 = fArr2[i2 + 0];
                    float f39 = fArr2[i2 + 1];
                    float f40 = fArr2[i2 + 2];
                    if (fArr2[i2 + 3] != 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fArr2[i2 + 4] != 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m37894c(path, f15, f16, f36, f37, f38, f39, f40, z, z2);
                    f15 = fArr2[i43];
                    f16 = fArr2[i44];
                }
                f12 = f16;
                f11 = f15;
                i4 = i2 + i;
                c5 = c2;
                c3 = c5;
                c4 = 0;
            }
            fArr[c4] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        /* renamed from: b */
        private static void m37895b(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = d9 / ceil;
            double d19 = d17;
            double d20 = d14;
            int i = 0;
            double d21 = d5;
            double d22 = d6;
            double d23 = d8;
            while (i < ceil) {
                double d24 = d23 + d18;
                double sin3 = Math.sin(d24);
                double cos3 = Math.cos(d24);
                double d25 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d26 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d27 = (d12 * sin3) - (d13 * cos3);
                double d28 = (sin3 * d15) + (cos3 * d16);
                double d29 = d24 - d23;
                double tan = Math.tan(d29 / 2.0d);
                double sin4 = (Math.sin(d29) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d21 + (d20 * sin4)), (float) (d22 + (d19 * sin4)), (float) (d25 - (sin4 * d27)), (float) (d26 - (sin4 * d28)), (float) d25, (float) d26);
                i++;
                d18 = d18;
                sin = sin;
                d21 = d25;
                d15 = d15;
                cos = cos;
                d23 = d24;
                d19 = d28;
                d20 = d27;
                ceil = ceil;
                d22 = d26;
                d10 = d3;
            }
        }

        /* renamed from: c */
        private static void m37894c(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            boolean z3;
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = f;
            double d4 = d3 * cos;
            double d5 = f2;
            double d6 = f5;
            double d7 = (d4 + (d5 * sin)) / d6;
            double d8 = f6;
            double d9 = (((-f) * sin) + (d5 * cos)) / d8;
            double d10 = f4;
            double d11 = ((f3 * cos) + (d10 * sin)) / d6;
            double d12 = (((-f3) * sin) + (d10 * cos)) / d8;
            double d13 = d7 - d11;
            double d14 = d9 - d12;
            double d15 = (d7 + d11) / 2.0d;
            double d16 = (d9 + d12) / 2.0d;
            double d17 = (d13 * d13) + (d14 * d14);
            if (d17 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d18 = (1.0d / d17) - 0.25d;
            if (d18 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d17);
                float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
                m37894c(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d18);
            double d19 = d13 * sqrt2;
            double d20 = sqrt2 * d14;
            if (z == z2) {
                d2 = d15 - d20;
                d = d16 + d19;
            } else {
                d2 = d15 + d20;
                d = d16 - d19;
            }
            double atan2 = Math.atan2(d9 - d, d7 - d2);
            double atan22 = Math.atan2(d12 - d, d11 - d2) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 != z3) {
                if (i > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d21 = d2 * d6;
            double d22 = d * d8;
            m37895b(path, (d21 * cos) - (d22 * sin), (d21 * sin) + (d22 * cos), d6, d8, d3, d5, radians, atan2, atan22);
        }

        /* renamed from: e */
        public static void m37892e(C2393b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                C2393b bVar = bVarArr[i];
                m37896a(path, fArr, c, bVar.f3336a, bVar.f3337b);
                c = bVarArr[i].f3336a;
            }
        }

        /* renamed from: d */
        public void m37893d(C2393b bVar, C2393b bVar2, float f) {
            this.f3336a = bVar.f3336a;
            int i = 0;
            while (true) {
                float[] fArr = bVar.f3337b;
                if (i < fArr.length) {
                    this.f3337b[i] = (fArr[i] * (1.0f - f)) + (bVar2.f3337b[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }

        C2393b(C2393b bVar) {
            this.f3336a = bVar.f3336a;
            float[] fArr = bVar.f3337b;
            this.f3337b = C2391d.m37904c(fArr, 0, fArr.length);
        }
    }
}
