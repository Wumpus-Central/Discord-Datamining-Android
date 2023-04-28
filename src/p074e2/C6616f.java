package p074e2;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: e2.f */
/* loaded from: classes.dex */
public class C6616f {

    /* renamed from: j */
    private static final AbstractC6608c0 f13910j = C6639l.m24863j();

    /* renamed from: a */
    String f13911a;

    /* renamed from: b */
    Double f13912b;

    /* renamed from: c */
    String f13913c;

    /* renamed from: d */
    Integer f13914d;

    /* renamed from: e */
    String f13915e;

    /* renamed from: f */
    String f13916f;

    /* renamed from: g */
    String f13917g;

    /* renamed from: h */
    Map<String, String> f13918h;

    /* renamed from: i */
    Map<String, String> f13919i;

    public C6616f(String str) {
        if (m25026d(str)) {
            this.f13911a = str;
        }
    }

    /* renamed from: d */
    private boolean m25026d(String str) {
        if (str == null) {
            f13910j.mo24885b("Missing source", new Object[0]);
            return false;
        } else if (!str.isEmpty()) {
            return true;
        } else {
            f13910j.mo24885b("Source can't be empty", new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public void m25029a(String str, String str2) {
        if (C6629i1.m24929W(str, "key", "Callback") && C6629i1.m24929W(str2, "value", "Callback")) {
            if (this.f13918h == null) {
                this.f13918h = new LinkedHashMap();
            }
            if (this.f13918h.put(str, str2) != null) {
                f13910j.mo24886a("Key %s was overwritten", str);
            }
        }
    }

    /* renamed from: b */
    public void m25028b(String str, String str2) {
        if (C6629i1.m24929W(str, "key", "Partner") && C6629i1.m24929W(str2, "value", "Partner")) {
            if (this.f13919i == null) {
                this.f13919i = new LinkedHashMap();
            }
            if (this.f13919i.put(str, str2) != null) {
                f13910j.mo24886a("Key %s was overwritten", str);
            }
        }
    }

    /* renamed from: c */
    public boolean m25027c() {
        return m25026d(this.f13911a);
    }

    /* renamed from: e */
    public void m25025e(Integer num) {
        this.f13914d = num;
    }

    /* renamed from: f */
    public void m25024f(String str) {
        this.f13915e = str;
    }

    /* renamed from: g */
    public void m25023g(String str) {
        this.f13917g = str;
    }

    /* renamed from: h */
    public void m25022h(String str) {
        this.f13916f = str;
    }

    /* renamed from: i */
    public void m25021i(Double d, String str) {
        this.f13912b = d;
        this.f13913c = str;
    }
}
