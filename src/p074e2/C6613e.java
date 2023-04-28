package p074e2;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;

/* renamed from: e2.e */
/* loaded from: classes.dex */
public class C6613e {

    /* renamed from: a */
    private static C6641m f13908a;

    /* renamed from: A */
    public static void m25095A(C6616f fVar) {
        m25080j().m24835H(fVar);
    }

    /* renamed from: B */
    public static void m25094B(String str, JSONObject jSONObject) {
        m25080j().m24834I(str, jSONObject);
    }

    /* renamed from: C */
    public static void m25093C(C6627i iVar) {
        m25080j().m24833J(iVar);
    }

    /* renamed from: D */
    public static void m25092D(boolean z) {
        m25080j().m24832K(z);
    }

    /* renamed from: E */
    public static void m25091E(C6655n nVar) {
        m25080j().m24831L(nVar);
    }

    /* renamed from: F */
    public static void m25090F(C6665s sVar) {
        m25080j().m24830M(sVar);
    }

    /* renamed from: a */
    public static void m25089a(String str, String str2) {
        m25080j().m24829a(str, str2);
    }

    /* renamed from: b */
    public static void m25088b(String str, String str2) {
        m25080j().m24828b(str, str2);
    }

    /* renamed from: c */
    public static void m25087c(Uri uri, Context context) {
        m25080j().m24827c(uri, m25085e(context));
    }

    /* renamed from: d */
    public static void m25086d(Context context) {
        m25080j().m24823g(m25085e(context));
    }

    /* renamed from: e */
    private static Context m25085e(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    /* renamed from: f */
    public static void m25084f(Context context) {
        m25080j().m24822h(m25085e(context));
    }

    /* renamed from: g */
    public static String m25083g() {
        return m25080j().m24821i();
    }

    /* renamed from: h */
    public static String m25082h(Context context) {
        Context e = m25085e(context);
        if (e != null) {
            return C6629i1.m24901q(e.getContentResolver());
        }
        return null;
    }

    /* renamed from: i */
    public static C6619g m25081i() {
        return m25080j().m24820j();
    }

    /* renamed from: j */
    public static synchronized C6641m m25080j() {
        C6641m mVar;
        synchronized (C6613e.class) {
            if (f13908a == null) {
                f13908a = new C6641m();
            }
            mVar = f13908a;
        }
        return mVar;
    }

    /* renamed from: k */
    public static void m25079k(Context context, AbstractC6658o0 o0Var) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        C6629i1.m24898t(context2, o0Var);
    }

    /* renamed from: l */
    public static String m25078l() {
        return m25080j().m24819k();
    }

    /* renamed from: m */
    public static boolean m25077m() {
        return m25080j().m24818l();
    }

    /* renamed from: n */
    public static void m25076n(C6624h hVar) {
        m25080j().m24816n(hVar);
    }

    /* renamed from: o */
    public static void m25075o() {
        m25080j().m24815o();
    }

    /* renamed from: p */
    public static void m25074p() {
        m25080j().m24814p();
    }

    /* renamed from: q */
    public static void m25073q(String str) {
        m25080j().m24813q(str);
    }

    /* renamed from: r */
    public static void m25072r(String str) {
        m25080j().m24812r(str);
    }

    /* renamed from: s */
    public static void m25071s() {
        m25080j().m24811s();
    }

    /* renamed from: t */
    public static void m25070t() {
        m25080j().m24810t();
    }

    /* renamed from: u */
    public static void m25069u() {
        m25080j().m24804z();
    }

    /* renamed from: v */
    public static void m25068v(boolean z) {
        m25080j().m24841B(z);
    }

    /* renamed from: w */
    public static void m25067w(boolean z) {
        m25080j().m24840C(z);
    }

    /* renamed from: x */
    public static void m25066x(String str, Context context) {
        m25080j().m24839D(str, m25085e(context));
    }

    /* renamed from: y */
    public static void m25065y(String str, Context context) {
        m25080j().m24842A(str, m25085e(context));
    }

    /* renamed from: z */
    public static void m25064z(C6663r rVar) {
        Boolean bool = rVar.f14114l;
        if (bool != null && bool.booleanValue()) {
            C6641m mVar = f13908a;
            if (mVar != null) {
                mVar.m24836G();
            }
            f13908a = null;
            C6639l.m24873F(rVar.f14103a);
        }
        m25080j().m24837F(rVar);
    }
}
