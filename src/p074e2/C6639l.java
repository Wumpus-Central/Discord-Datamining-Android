package p074e2;

import android.content.Context;
import p093f2.AbstractC7003b;
import p093f2.C7006d;

/* renamed from: e2.l */
/* loaded from: classes.dex */
public class C6639l {

    /* renamed from: a */
    private static AbstractC6611d0 f14023a = null;

    /* renamed from: b */
    private static AbstractC6605b0 f14024b = null;

    /* renamed from: c */
    private static AbstractC6596a0 f14025c = null;

    /* renamed from: d */
    private static AbstractC6608c0 f14026d = null;

    /* renamed from: e */
    private static AbstractC6617f0 f14027e = null;

    /* renamed from: f */
    private static long f14028f = -1;

    /* renamed from: g */
    private static long f14029g = -1;

    /* renamed from: h */
    private static long f14030h = -1;

    /* renamed from: i */
    private static long f14031i = -1;

    /* renamed from: j */
    private static EnumC6687w f14032j = null;

    /* renamed from: k */
    private static EnumC6687w f14033k = null;

    /* renamed from: l */
    private static EnumC6687w f14034l = null;

    /* renamed from: m */
    private static long f14035m = -1;

    /* renamed from: n */
    private static String f14036n = null;

    /* renamed from: o */
    private static String f14037o = null;

    /* renamed from: p */
    private static String f14038p = null;

    /* renamed from: q */
    private static C7006d.AbstractC7009c f14039q = null;

    /* renamed from: r */
    private static C7006d.AbstractC0215d f14040r = null;

    /* renamed from: s */
    private static boolean f14041s = true;

    /* renamed from: A */
    public static void m24878A(String str) {
        f14038p = str;
    }

    /* renamed from: B */
    public static void m24877B(long j) {
        f14031i = j;
    }

    /* renamed from: C */
    public static void m24876C(long j) {
        f14028f = j;
    }

    /* renamed from: D */
    public static void m24875D(long j) {
        f14029g = j;
    }

    /* renamed from: E */
    public static void m24874E(boolean z) {
        f14041s = z;
    }

    /* renamed from: F */
    public static void m24873F(Context context) {
        if (context != null) {
            C6551a.m25295M0(context);
            C6679v0.m24692r(context);
        }
        f14023a = null;
        f14024b = null;
        f14025c = null;
        f14026d = null;
        f14027e = null;
        f14028f = -1L;
        f14029g = -1L;
        f14030h = -1L;
        f14031i = -1L;
        f14032j = null;
        f14033k = null;
        f14035m = -1L;
        f14036n = "https://app.adjust.com";
        f14037o = "https://gdpr.adjust.com";
        f14038p = "https://subscription.adjust.com";
        f14039q = null;
        f14040r = null;
        f14041s = true;
    }

    /* renamed from: a */
    public static void m24872a() {
        C6661q.m24788a(m24863j());
    }

    /* renamed from: b */
    public static void m24871b() {
        C6661q.m24787b(m24863j());
    }

    /* renamed from: c */
    public static AbstractC6596a0 m24870c(C6624h hVar) {
        AbstractC6596a0 a0Var = f14025c;
        if (a0Var == null) {
            return C6551a.m25277S0(hVar);
        }
        a0Var.mo25170J(hVar);
        return f14025c;
    }

    /* renamed from: d */
    public static AbstractC6605b0 m24869d(AbstractC6596a0 a0Var, boolean z, AbstractC7003b bVar) {
        AbstractC6605b0 b0Var = f14024b;
        if (b0Var == null) {
            return new C6670u(a0Var, z, bVar);
        }
        b0Var.mo24737d(a0Var, z, bVar);
        return f14024b;
    }

    /* renamed from: e */
    public static String m24868e() {
        return f14036n;
    }

    /* renamed from: f */
    public static C7006d.AbstractC7009c m24867f() {
        C7006d.AbstractC7009c cVar = f14039q;
        if (cVar == null) {
            return C7006d.m23666b();
        }
        return cVar;
    }

    /* renamed from: g */
    public static String m24866g() {
        return f14037o;
    }

    /* renamed from: h */
    public static C7006d.AbstractC0215d m24865h() {
        C7006d.AbstractC0215d dVar = f14040r;
        if (dVar == null) {
            return C7006d.m23665c();
        }
        return dVar;
    }

    /* renamed from: i */
    public static EnumC6687w m24864i() {
        EnumC6687w wVar = f14034l;
        if (wVar == null) {
            return EnumC6687w.SHORT_WAIT;
        }
        return wVar;
    }

    /* renamed from: j */
    public static AbstractC6608c0 m24863j() {
        if (f14026d == null) {
            f14026d = new C6638k0();
        }
        return f14026d;
    }

    /* renamed from: k */
    public static long m24862k() {
        long j = f14035m;
        if (j == -1) {
            return 10000L;
        }
        return j;
    }

    /* renamed from: l */
    public static AbstractC6611d0 m24861l(AbstractC6596a0 a0Var, Context context, boolean z, AbstractC7003b bVar) {
        AbstractC6611d0 d0Var = f14023a;
        if (d0Var == null) {
            return new C6679v0(a0Var, context, z, bVar);
        }
        d0Var.mo24705d(a0Var, context, z, bVar);
        return f14023a;
    }

    /* renamed from: m */
    public static EnumC6687w m24860m() {
        EnumC6687w wVar = f14033k;
        if (wVar == null) {
            return EnumC6687w.LONG_WAIT;
        }
        return wVar;
    }

    /* renamed from: n */
    public static EnumC6687w m24859n() {
        EnumC6687w wVar = f14032j;
        if (wVar == null) {
            return EnumC6687w.SHORT_WAIT;
        }
        return wVar;
    }

    /* renamed from: o */
    public static AbstractC6617f0 m24858o(AbstractC6596a0 a0Var, boolean z, AbstractC7003b bVar) {
        AbstractC6617f0 f0Var = f14027e;
        if (f0Var == null) {
            return new C6597a1(a0Var, z, bVar);
        }
        f0Var.mo25017d(a0Var, z, bVar);
        return f14027e;
    }

    /* renamed from: p */
    public static long m24857p() {
        long j = f14030h;
        if (j == -1) {
            return 1800000L;
        }
        return j;
    }

    /* renamed from: q */
    public static String m24856q() {
        return f14038p;
    }

    /* renamed from: r */
    public static long m24855r() {
        long j = f14031i;
        if (j == -1) {
            return 1000L;
        }
        return j;
    }

    /* renamed from: s */
    public static long m24854s() {
        long j = f14028f;
        if (j == -1) {
            return 60000L;
        }
        return j;
    }

    /* renamed from: t */
    public static long m24853t() {
        long j = f14029g;
        if (j == -1) {
            return 60000L;
        }
        return j;
    }

    /* renamed from: u */
    public static boolean m24852u() {
        return f14041s;
    }

    /* renamed from: v */
    public static void m24851v(String str) {
        f14036n = str;
    }

    /* renamed from: w */
    public static void m24850w(String str) {
        f14037o = str;
    }

    /* renamed from: x */
    public static void m24849x(EnumC6687w wVar) {
        f14033k = wVar;
    }

    /* renamed from: y */
    public static void m24848y(EnumC6687w wVar) {
        f14032j = wVar;
    }

    /* renamed from: z */
    public static void m24847z(long j) {
        f14030h = j;
    }
}
