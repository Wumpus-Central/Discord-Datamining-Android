package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.t */
/* loaded from: classes6.dex */
class C5985t {

    /* renamed from: a */
    static float f12034a;

    /* renamed from: b */
    private static int f12035b;

    /* renamed from: c */
    private static int f12036c;

    /* renamed from: d */
    private static String f12037d;

    /* renamed from: e */
    private static Path f12038e;

    /* renamed from: f */
    static ArrayList<C5983s> f12039f;

    /* renamed from: g */
    private static float f12040g;

    /* renamed from: h */
    private static float f12041h;

    /* renamed from: i */
    private static float f12042i;

    /* renamed from: j */
    private static float f12043j;

    /* renamed from: k */
    private static float f12044k;

    /* renamed from: l */
    private static float f12045l;

    /* renamed from: m */
    private static boolean f12046m;

    /* renamed from: A */
    private static void m26645A(float f, float f2, float f3, float f4) {
        f12042i = f;
        f12043j = f2;
        m26638e((f12040g * 2.0f) - f12042i, (f12041h * 2.0f) - f12043j, f, f2, f3, f4);
    }

    /* renamed from: B */
    private static void m26644B(float f, float f2) {
        m26643C(f + f12040g, f2 + f12041h);
    }

    /* renamed from: C */
    private static void m26643C(float f, float f2) {
        m26622u((f12040g * 2.0f) - f12042i, (f12041h * 2.0f) - f12043j, f, f2);
    }

    /* renamed from: a */
    private static void m26642a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        m26641b(f, f2, f3, z, z2, f4 + f12040g, f5 + f12041h);
    }

    /* renamed from: b */
    private static void m26641b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = f12040g;
        float f13 = f12041h;
        float abs = Math.abs(f2 == 0.0f ? f == 0.0f ? f5 - f13 : f : f2);
        float abs2 = Math.abs(f == 0.0f ? f4 - f12 : f);
        if (abs2 == 0.0f || abs == 0.0f || (f4 == f12 && f5 == f13)) {
            m26631l(f4, f5);
            return;
        }
        float radians = (float) Math.toRadians(f3);
        double d = radians;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f14 = f4 - f12;
        float f15 = f5 - f13;
        float f16 = ((cos * f14) / 2.0f) + ((sin * f15) / 2.0f);
        float f17 = -sin;
        float f18 = ((f17 * f14) / 2.0f) + ((cos * f15) / 2.0f);
        float f19 = abs2 * abs2;
        float f20 = abs * abs * f16 * f16;
        if ((((f19 * abs) * abs) - ((f19 * f18) * f18)) - f20 < 0.0f) {
            f9 = f17;
            float sqrt = (float) Math.sqrt(1.0f - (f8 / f6));
            abs2 *= sqrt;
            abs *= sqrt;
            f10 = f14 / 2.0f;
            f11 = f15 / 2.0f;
        } else {
            f9 = f17;
            float sqrt2 = (float) Math.sqrt(f8 / (f7 + f20));
            if (z == z2) {
                sqrt2 = -sqrt2;
            }
            float f21 = (((-sqrt2) * f18) * abs2) / abs;
            float f22 = ((sqrt2 * f16) * abs) / abs2;
            f10 = ((cos * f21) - (sin * f22)) + (f14 / 2.0f);
            f11 = (f15 / 2.0f) + (f21 * sin) + (f22 * cos);
        }
        float f23 = cos / abs2;
        float f24 = sin / abs2;
        float f25 = f9 / abs;
        float f26 = cos / abs;
        float f27 = -f10;
        float f28 = -f11;
        float atan2 = (float) Math.atan2((f25 * f27) + (f26 * f28), (f27 * f23) + (f28 * f24));
        float f29 = f14 - f10;
        float f30 = f15 - f11;
        float atan22 = (float) Math.atan2((f25 * f29) + (f26 * f30), (f23 * f29) + (f24 * f30));
        float f31 = f10 + f12;
        float f32 = f11 + f13;
        float f33 = f14 + f12;
        float f34 = f15 + f13;
        m26620w();
        f12042i = f33;
        f12040g = f33;
        f12043j = f34;
        f12041h = f34;
        if (abs2 == abs && radians == 0.0f) {
            float degrees = (float) Math.toDegrees(atan2);
            float abs3 = Math.abs((degrees - ((float) Math.toDegrees(atan22))) % 360.0f);
            if (!z ? abs3 > 180.0f : abs3 < 180.0f) {
                abs3 = 360.0f - abs3;
            }
            if (!z2) {
                abs3 = -abs3;
            }
            float f35 = f12034a;
            f12038e.arcTo(new RectF((f31 - abs2) * f35, (f32 - abs2) * f35, (f31 + abs2) * f35, (f32 + abs2) * f35), degrees, abs3);
            f12039f.add(new C5983s(EnumC5955f.kCGPathElementAddCurveToPoint, new C5991w[]{new C5991w(f33, f34)}));
            return;
        }
        m26640c(f31, f32, abs2, abs, atan2, atan22, z2, radians);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:12:0x0065->B:13:0x0067, LOOP_END] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m26640c(float r24, float r25, float r26, float r27, float r28, float r29, boolean r30, float r31) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5985t.m26640c(float, float, float, float, float, float, boolean, float):void");
    }

    /* renamed from: d */
    private static void m26639d() {
        if (f12046m) {
            f12040g = f12044k;
            f12041h = f12045l;
            f12046m = false;
            f12038e.close();
            f12039f.add(new C5983s(EnumC5955f.kCGPathElementCloseSubpath, new C5991w[]{new C5991w(f12040g, f12041h)}));
        }
    }

    /* renamed from: e */
    private static void m26638e(float f, float f2, float f3, float f4, float f5, float f6) {
        m26620w();
        f12040g = f5;
        f12041h = f6;
        Path path = f12038e;
        float f7 = f12034a;
        path.cubicTo(f * f7, f2 * f7, f3 * f7, f4 * f7, f5 * f7, f6 * f7);
        f12039f.add(new C5983s(EnumC5955f.kCGPathElementAddCurveToPoint, new C5991w[]{new C5991w(f, f2), new C5991w(f3, f4), new C5991w(f5, f6)}));
    }

    /* renamed from: f */
    private static void m26637f(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f12040g;
        float f8 = f12041h;
        m26636g(f + f7, f2 + f8, f3 + f7, f4 + f8, f5 + f7, f6 + f8);
    }

    /* renamed from: g */
    private static void m26636g(float f, float f2, float f3, float f4, float f5, float f6) {
        f12042i = f3;
        f12043j = f4;
        m26638e(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: h */
    private static boolean m26635h(char c) {
        return Character.isUpperCase(c);
    }

    /* renamed from: i */
    private static boolean m26634i(char c) {
        switch (c) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    /* renamed from: j */
    private static boolean m26633j(char c) {
        return (c >= '0' && c <= '9') || c == '.' || c == '-' || c == '+';
    }

    /* renamed from: k */
    private static void m26632k(float f, float f2) {
        m26631l(f + f12040g, f2 + f12041h);
    }

    /* renamed from: l */
    private static void m26631l(float f, float f2) {
        m26620w();
        f12040g = f;
        f12042i = f;
        f12041h = f2;
        f12043j = f2;
        Path path = f12038e;
        float f3 = f12034a;
        path.lineTo(f * f3, f3 * f2);
        f12039f.add(new C5983s(EnumC5955f.kCGPathElementAddLineToPoint, new C5991w[]{new C5991w(f, f2)}));
    }

    /* renamed from: m */
    private static void m26630m(float f, float f2) {
        m26629n(f + f12040g, f2 + f12041h);
    }

    /* renamed from: n */
    private static void m26629n(float f, float f2) {
        f12040g = f;
        f12042i = f;
        f12044k = f;
        f12041h = f2;
        f12043j = f2;
        f12045l = f2;
        Path path = f12038e;
        float f3 = f12034a;
        path.moveTo(f * f3, f3 * f2);
        f12039f.add(new C5983s(EnumC5955f.kCGPathElementMoveToPoint, new C5991w[]{new C5991w(f, f2)}));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x002e A[SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Path m26628o(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5985t.m26628o(java.lang.String):android.graphics.Path");
    }

    /* renamed from: p */
    private static boolean m26627p() {
        m26618y();
        char charAt = f12037d.charAt(f12035b);
        if (charAt == '0' || charAt == '1') {
            int i = f12035b + 1;
            f12035b = i;
            if (i < f12036c && f12037d.charAt(i) == ',') {
                f12035b++;
            }
            m26618y();
            if (charAt == '1') {
                return true;
            }
            return false;
        }
        throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(f12035b), f12037d));
    }

    /* renamed from: q */
    private static float m26626q() {
        if (f12035b != f12036c) {
            float s = m26624s();
            m26618y();
            m26625r();
            return s;
        }
        throw new Error(String.format("Unexpected end (s=%s)", f12037d));
    }

    /* renamed from: r */
    private static void m26625r() {
        int i = f12035b;
        if (i < f12036c && f12037d.charAt(i) == ',') {
            f12035b++;
        }
    }

    /* renamed from: s */
    private static float m26624s() {
        char charAt;
        m26618y();
        int i = f12035b;
        if (i != f12036c) {
            char charAt2 = f12037d.charAt(i);
            if (charAt2 == '-' || charAt2 == '+') {
                int i2 = f12035b + 1;
                f12035b = i2;
                charAt2 = f12037d.charAt(i2);
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                m26619x();
                int i3 = f12035b;
                if (i3 < f12036c) {
                    charAt2 = f12037d.charAt(i3);
                }
            } else if (charAt2 != '.') {
                throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt2), Integer.valueOf(f12035b), f12037d));
            }
            if (charAt2 == '.') {
                f12035b++;
                m26619x();
                int i4 = f12035b;
                if (i4 < f12036c) {
                    charAt2 = f12037d.charAt(i4);
                }
            }
            if (charAt2 == 'e' || charAt2 == 'E') {
                int i5 = f12035b;
                if (!(i5 + 1 >= f12036c || (charAt = f12037d.charAt(i5 + 1)) == 'm' || charAt == 'x')) {
                    int i6 = f12035b + 1;
                    f12035b = i6;
                    char charAt3 = f12037d.charAt(i6);
                    if (charAt3 == '+' || charAt3 == '-') {
                        f12035b++;
                        m26619x();
                    } else if (charAt3 < '0' || charAt3 > '9') {
                        throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt3), Integer.valueOf(f12035b), f12037d));
                    } else {
                        m26619x();
                    }
                }
            }
            String substring = f12037d.substring(i, f12035b);
            float parseFloat = Float.parseFloat(substring);
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            throw new Error(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", substring, Integer.valueOf(i), Integer.valueOf(f12035b), f12037d));
        }
        throw new Error(String.format("Unexpected end (s=%s)", f12037d));
    }

    /* renamed from: t */
    private static void m26623t(float f, float f2, float f3, float f4) {
        float f5 = f12040g;
        float f6 = f12041h;
        m26622u(f + f5, f2 + f6, f3 + f5, f4 + f6);
    }

    /* renamed from: u */
    private static void m26622u(float f, float f2, float f3, float f4) {
        f12042i = f;
        f12043j = f2;
        float f5 = f * 2.0f;
        float f6 = f2 * 2.0f;
        float f7 = (f12040g + f5) / 3.0f;
        float f8 = (f12041h + f6) / 3.0f;
        m26638e(f7, f8, (f3 + f5) / 3.0f, (f4 + f6) / 3.0f, f3, f4);
    }

    /* renamed from: v */
    private static double m26621v(double d) {
        double pow = Math.pow(10.0d, 4.0d);
        return Math.round(d * pow) / pow;
    }

    /* renamed from: w */
    private static void m26620w() {
        if (!f12046m) {
            f12044k = f12040g;
            f12045l = f12041h;
            f12046m = true;
        }
    }

    /* renamed from: x */
    private static void m26619x() {
        while (true) {
            int i = f12035b;
            if (i < f12036c && Character.isDigit(f12037d.charAt(i))) {
                f12035b++;
            } else {
                return;
            }
        }
    }

    /* renamed from: y */
    private static void m26618y() {
        while (true) {
            int i = f12035b;
            if (i < f12036c && Character.isWhitespace(f12037d.charAt(i))) {
                f12035b++;
            } else {
                return;
            }
        }
    }

    /* renamed from: z */
    private static void m26617z(float f, float f2, float f3, float f4) {
        float f5 = f12040g;
        float f6 = f12041h;
        m26645A(f + f5, f2 + f6, f3 + f5, f4 + f6);
    }
}
