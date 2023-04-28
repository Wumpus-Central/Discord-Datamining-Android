package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.horcrux.svg.y */
/* loaded from: classes6.dex */
class C5994y {

    /* renamed from: d */
    private static ArrayList<C5994y> f12081d;

    /* renamed from: e */
    private static int f12082e;

    /* renamed from: f */
    private static C5991w f12083f;

    /* renamed from: g */
    private static C5991w f12084g;

    /* renamed from: h */
    private static C5991w f12085h;

    /* renamed from: i */
    private static C5991w f12086i;

    /* renamed from: j */
    private static boolean f12087j;

    /* renamed from: a */
    EnumC5996z f12088a;

    /* renamed from: b */
    C5991w f12089b;

    /* renamed from: c */
    double f12090c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.y$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C5995a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12091a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12092b;

        static {
            int[] iArr = new int[EnumC5955f.values().length];
            f12092b = iArr;
            try {
                iArr[EnumC5955f.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12092b[EnumC5955f.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12092b[EnumC5955f.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12092b[EnumC5955f.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12092b[EnumC5955f.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC5996z.values().length];
            f12091a = iArr2;
            try {
                iArr2[EnumC5996z.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12091a[EnumC5996z.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12091a[EnumC5996z.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private C5994y(EnumC5996z zVar, C5991w wVar, double d) {
        this.f12088a = zVar;
        this.f12089b = wVar;
        this.f12090c = d;
    }

    /* renamed from: a */
    private static double m26553a(double d, double d2) {
        if (Math.abs(d - d2) > 180.0d) {
            d += 360.0d;
        }
        return (d + d2) / 2.0d;
    }

    /* renamed from: b */
    private static void m26552b(C5950c0 c0Var, C5991w wVar, C5991w wVar2, C5991w wVar3) {
        c0Var.f11841a = m26543k(wVar2, wVar);
        c0Var.f11842b = m26543k(wVar3, wVar2);
        if (m26545i(c0Var.f11841a)) {
            c0Var.f11841a = c0Var.f11842b;
        } else if (m26545i(c0Var.f11842b)) {
            c0Var.f11842b = c0Var.f11841a;
        }
    }

    /* renamed from: c */
    private static double m26551c(EnumC5996z zVar) {
        double j = m26544j(m26548f(f12085h));
        double j2 = m26544j(m26548f(f12086i));
        int i = C5995a.f12091a[zVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return m26553a(j, j2);
            }
            if (i != 3) {
                return 0.0d;
            }
            return j;
        } else if (f12087j) {
            return j2 + 180.0d;
        } else {
            return j2;
        }
    }

    /* renamed from: d */
    private static C5950c0 m26550d(C5983s sVar) {
        C5950c0 c0Var = new C5950c0();
        C5991w[] wVarArr = sVar.f12030b;
        int i = C5995a.f12092b[sVar.f12029a.ordinal()];
        if (i == 1) {
            c0Var.f11843c = wVarArr[2];
            c0Var.f11841a = m26543k(wVarArr[0], f12083f);
            c0Var.f11842b = m26543k(wVarArr[2], wVarArr[1]);
            if (m26545i(c0Var.f11841a)) {
                m26552b(c0Var, wVarArr[0], wVarArr[1], wVarArr[2]);
            } else if (m26545i(c0Var.f11842b)) {
                m26552b(c0Var, f12083f, wVarArr[0], wVarArr[1]);
            }
        } else if (i == 2) {
            C5991w wVar = wVarArr[1];
            c0Var.f11843c = wVar;
            m26552b(c0Var, f12083f, wVarArr[0], wVar);
        } else if (i == 3 || i == 4) {
            C5991w wVar2 = wVarArr[0];
            c0Var.f11843c = wVar2;
            c0Var.f11841a = m26543k(wVar2, f12083f);
            c0Var.f11842b = m26543k(c0Var.f11843c, f12083f);
        } else if (i == 5) {
            C5991w wVar3 = f12084g;
            c0Var.f11843c = wVar3;
            c0Var.f11841a = m26543k(wVar3, f12083f);
            c0Var.f11842b = m26543k(c0Var.f11843c, f12083f);
        }
        return c0Var;
    }

    /* renamed from: e */
    private static void m26549e() {
        EnumC5996z zVar = EnumC5996z.kEndMarker;
        f12081d.add(new C5994y(zVar, f12083f, m26551c(zVar)));
    }

    /* renamed from: f */
    private static double m26548f(C5991w wVar) {
        return Math.atan2(wVar.f12079b, wVar.f12078a);
    }

    /* renamed from: g */
    private static void m26547g(C5983s sVar) {
        EnumC5996z zVar;
        C5950c0 d = m26550d(sVar);
        f12086i = d.f11841a;
        int i = f12082e;
        if (i > 0) {
            if (i == 1) {
                zVar = EnumC5996z.kStartMarker;
            } else {
                zVar = EnumC5996z.kMidMarker;
            }
            f12081d.add(new C5994y(zVar, f12083f, m26551c(zVar)));
        }
        f12085h = d.f11842b;
        f12083f = d.f11843c;
        EnumC5955f fVar = sVar.f12029a;
        if (fVar == EnumC5955f.kCGPathElementMoveToPoint) {
            f12084g = sVar.f12030b[0];
        } else if (fVar == EnumC5955f.kCGPathElementCloseSubpath) {
            f12084g = new C5991w(0.0d, 0.0d);
        }
        f12082e++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static ArrayList<C5994y> m26546h(ArrayList<C5983s> arrayList) {
        f12081d = new ArrayList<>();
        f12082e = 0;
        f12083f = new C5991w(0.0d, 0.0d);
        f12084g = new C5991w(0.0d, 0.0d);
        Iterator<C5983s> it = arrayList.iterator();
        while (it.hasNext()) {
            m26547g(it.next());
        }
        m26549e();
        return f12081d;
    }

    /* renamed from: i */
    private static boolean m26545i(C5991w wVar) {
        return wVar.f12078a == 0.0d && wVar.f12079b == 0.0d;
    }

    /* renamed from: j */
    private static double m26544j(double d) {
        return d * 57.29577951308232d;
    }

    /* renamed from: k */
    private static C5991w m26543k(C5991w wVar, C5991w wVar2) {
        return new C5991w(wVar2.f12078a - wVar.f12078a, wVar2.f12079b - wVar.f12079b);
    }
}
