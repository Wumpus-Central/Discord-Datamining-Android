package p074e2;

import android.content.Context;
import p074e2.C6641m;

/* renamed from: e2.h */
/* loaded from: classes.dex */
public class C6624h {

    /* renamed from: A */
    String f37949A;

    /* renamed from: B */
    String f37950B;

    /* renamed from: C */
    String f37951C;

    /* renamed from: D */
    boolean f37952D;

    /* renamed from: E */
    Boolean f37953E;

    /* renamed from: F */
    String f37954F;

    /* renamed from: G */
    String f37955G;

    /* renamed from: a */
    String f13950a;

    /* renamed from: b */
    String f13951b;

    /* renamed from: c */
    String f13952c;

    /* renamed from: d */
    Context f13953d;

    /* renamed from: e */
    String f13954e;

    /* renamed from: f */
    String f13955f;

    /* renamed from: g */
    String f13956g;

    /* renamed from: h */
    String f13957h;

    /* renamed from: i */
    boolean f13958i;

    /* renamed from: j */
    String f13959j;

    /* renamed from: k */
    AbstractC6654m0 f13960k;

    /* renamed from: l */
    Boolean f13961l;

    /* renamed from: m */
    Class f13962m;

    /* renamed from: n */
    AbstractC6662q0 f13963n;

    /* renamed from: o */
    AbstractC6660p0 f13964o;

    /* renamed from: p */
    AbstractC6666s0 f13965p;

    /* renamed from: q */
    AbstractC6664r0 f13966q;

    /* renamed from: r */
    AbstractC6656n0 f13967r;

    /* renamed from: s */
    boolean f13968s;

    /* renamed from: t */
    Double f13969t;

    /* renamed from: u */
    C6641m.C0203m f13970u;

    /* renamed from: v */
    AbstractC6608c0 f13971v;

    /* renamed from: w */
    String f13972w;

    /* renamed from: x */
    String f13973x;

    /* renamed from: y */
    Boolean f13974y;

    /* renamed from: z */
    boolean f13975z;

    public C6624h(Context context, String str, String str2, boolean z) {
        m24987d(context, str, str2, z);
    }

    /* renamed from: a */
    private boolean m24990a(String str) {
        if (str == null) {
            this.f13971v.mo24885b("Missing App Token", new Object[0]);
            return false;
        } else if (str.length() == 12) {
            return true;
        } else {
            this.f13971v.mo24885b("Malformed App Token '%s'", str);
            return false;
        }
    }

    /* renamed from: b */
    private boolean m24989b(Context context) {
        if (context == null) {
            this.f13971v.mo24885b("Missing context", new Object[0]);
            return false;
        } else if (C6629i1.m24923b(context, "android.permission.INTERNET")) {
            return true;
        } else {
            this.f13971v.mo24885b("Missing permission: INTERNET", new Object[0]);
            return false;
        }
    }

    /* renamed from: c */
    private boolean m24988c(String str) {
        if (str == null) {
            this.f13971v.mo24885b("Missing environment", new Object[0]);
            return false;
        } else if (str.equals("sandbox")) {
            this.f13971v.mo24881f("SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new Object[0]);
            return true;
        } else if (str.equals("production")) {
            this.f13971v.mo24881f("PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new Object[0]);
            return true;
        } else {
            this.f13971v.mo24885b("Unknown environment '%s'", str);
            return false;
        }
    }

    /* renamed from: d */
    private void m24987d(Context context, String str, String str2, boolean z) {
        this.f13971v = C6639l.m24863j();
        if (!z || !"production".equals(str2)) {
            m24978m(EnumC6636j0.INFO, str2);
        } else {
            m24978m(EnumC6636j0.SUPRESS, str2);
        }
        if (context != null) {
            context = context.getApplicationContext();
        }
        this.f13953d = context;
        this.f13954e = str;
        this.f13955f = str2;
        this.f13958i = false;
        this.f13968s = false;
        this.f37952D = false;
    }

    /* renamed from: m */
    private void m24978m(EnumC6636j0 j0Var, String str) {
        this.f13971v.mo24882e(j0Var, "production".equals(str));
    }

    /* renamed from: A */
    public void m24991A(String str) {
        this.f13972w = str;
    }

    /* renamed from: e */
    public boolean m24986e() {
        if (m24990a(this.f13954e) && m24988c(this.f13955f) && m24989b(this.f13953d)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m24985f(long j, long j2, long j3, long j4, long j5) {
        this.f37949A = C6629i1.m24906l("%d", Long.valueOf(j));
        this.f37950B = C6629i1.m24906l("%d%d%d%d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5));
    }

    /* renamed from: g */
    public void m24984g(String str) {
        this.f13959j = str;
    }

    /* renamed from: h */
    public void m24983h(double d) {
        this.f13969t = Double.valueOf(d);
    }

    /* renamed from: i */
    public void m24982i(boolean z) {
        this.f13961l = Boolean.valueOf(z);
    }

    /* renamed from: j */
    public void m24981j(Boolean bool) {
        if (bool == null) {
            this.f13958i = false;
        } else {
            this.f13958i = bool.booleanValue();
        }
    }

    /* renamed from: k */
    public void m24980k(String str) {
        this.f37951C = str;
    }

    /* renamed from: l */
    public void m24979l(EnumC6636j0 j0Var) {
        m24978m(j0Var, this.f13955f);
    }

    /* renamed from: n */
    public void m24977n(boolean z) {
        this.f37953E = Boolean.valueOf(z);
    }

    /* renamed from: o */
    public void m24976o(AbstractC6654m0 m0Var) {
        this.f13960k = m0Var;
    }

    /* renamed from: p */
    public void m24975p(AbstractC6656n0 n0Var) {
        this.f13967r = n0Var;
    }

    /* renamed from: q */
    public void m24974q(AbstractC6660p0 p0Var) {
        this.f13964o = p0Var;
    }

    /* renamed from: r */
    public void m24973r(AbstractC6662q0 q0Var) {
        this.f13963n = q0Var;
    }

    /* renamed from: s */
    public void m24972s(AbstractC6664r0 r0Var) {
        this.f13966q = r0Var;
    }

    /* renamed from: t */
    public void m24971t(AbstractC6666s0 s0Var) {
        this.f13965p = s0Var;
    }

    /* renamed from: u */
    public void m24970u(String str) {
        this.f37955G = str;
    }

    /* renamed from: v */
    public void m24969v(boolean z) {
        this.f37952D = z;
    }

    /* renamed from: w */
    public void m24968w(String str) {
        this.f13956g = str;
    }

    /* renamed from: x */
    public void m24967x(String str) {
        this.f13957h = str;
    }

    /* renamed from: y */
    public void m24966y(boolean z) {
        this.f13968s = z;
    }

    /* renamed from: z */
    public void m24965z(String str) {
        if (str == null || str.isEmpty()) {
            this.f13971v.mo24885b("Invalid url strategy", new Object[0]);
            return;
        }
        if (!str.equals("url_strategy_india") && !str.equals("url_strategy_china") && !str.equals("data_residency_eu") && !str.equals("data_residency_tr") && !str.equals("data_residency_us")) {
            this.f13971v.mo24886a("Unrecognised url strategy %s", str);
        }
        this.f37954F = str;
    }
}
