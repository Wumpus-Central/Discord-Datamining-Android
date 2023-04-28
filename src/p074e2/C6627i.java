package p074e2;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: e2.i */
/* loaded from: classes.dex */
public class C6627i {

    /* renamed from: h */
    private static AbstractC6608c0 f13980h = C6639l.m24863j();

    /* renamed from: a */
    String f13981a;

    /* renamed from: b */
    Double f13982b;

    /* renamed from: c */
    String f13983c;

    /* renamed from: d */
    Map<String, String> f13984d;

    /* renamed from: e */
    Map<String, String> f13985e;

    /* renamed from: f */
    String f13986f;

    /* renamed from: g */
    String f13987g;

    public C6627i(String str) {
        if (m24958c(str, f13980h)) {
            this.f13981a = str;
        }
    }

    /* renamed from: c */
    private static boolean m24958c(String str, AbstractC6608c0 c0Var) {
        if (str == null) {
            c0Var.mo24885b("Missing Event Token", new Object[0]);
            return false;
        } else if (str.length() > 0) {
            return true;
        } else {
            c0Var.mo24885b("Event Token can't be empty", new Object[0]);
            return false;
        }
    }

    /* renamed from: d */
    private boolean m24957d(Double d, String str) {
        if (d != null) {
            if (d.doubleValue() < 0.0d) {
                f13980h.mo24885b("Invalid amount %.5f", d);
                return false;
            } else if (str == null) {
                f13980h.mo24885b("Currency must be set with revenue", new Object[0]);
                return false;
            } else if (str.equals("")) {
                f13980h.mo24885b("Currency is empty", new Object[0]);
                return false;
            }
        } else if (str != null) {
            f13980h.mo24885b("Revenue must be set with currency", new Object[0]);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m24960a(String str, String str2) {
        if (C6629i1.m24929W(str, "key", "Callback") && C6629i1.m24929W(str2, "value", "Callback")) {
            if (this.f13984d == null) {
                this.f13984d = new LinkedHashMap();
            }
            if (this.f13984d.put(str, str2) != null) {
                f13980h.mo24886a("Key %s was overwritten", str);
            }
        }
    }

    /* renamed from: b */
    public void m24959b(String str, String str2) {
        if (C6629i1.m24929W(str, "key", "Partner") && C6629i1.m24929W(str2, "value", "Partner")) {
            if (this.f13985e == null) {
                this.f13985e = new LinkedHashMap();
            }
            if (this.f13985e.put(str, str2) != null) {
                f13980h.mo24886a("Key %s was overwritten", str);
            }
        }
    }

    /* renamed from: e */
    public boolean m24956e() {
        return this.f13981a != null;
    }

    /* renamed from: f */
    public void m24955f(String str) {
        this.f13987g = str;
    }

    /* renamed from: g */
    public void m24954g(String str) {
        this.f13986f = str;
    }

    /* renamed from: h */
    public void m24953h(double d, String str) {
        if (m24957d(Double.valueOf(d), str)) {
            this.f13982b = Double.valueOf(d);
            this.f13983c = str;
        }
    }
}
