package p074e2;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: e2.n */
/* loaded from: classes.dex */
public class C6655n {

    /* renamed from: k */
    private static AbstractC6608c0 f14082k = C6639l.m24863j();

    /* renamed from: a */
    private long f14083a;

    /* renamed from: b */
    private String f14084b;

    /* renamed from: c */
    private String f14085c;

    /* renamed from: d */
    private String f14086d;

    /* renamed from: e */
    private String f14087e;

    /* renamed from: f */
    private String f14088f;

    /* renamed from: i */
    private Map<String, String> f14091i;

    /* renamed from: j */
    private Map<String, String> f14092j;

    /* renamed from: h */
    private long f14090h = -1;

    /* renamed from: g */
    private String f14089g = "GooglePlay";

    public C6655n(long j, String str, String str2, String str3, String str4, String str5) {
        this.f14083a = j;
        this.f14084b = str;
        this.f14085c = str2;
        this.f14086d = str3;
        this.f14087e = str4;
        this.f14088f = str5;
    }

    /* renamed from: a */
    public void m24802a(String str, String str2) {
        if (C6629i1.m24929W(str, "key", "Callback") && C6629i1.m24929W(str2, "value", "Callback")) {
            if (this.f14091i == null) {
                this.f14091i = new LinkedHashMap();
            }
            if (this.f14091i.put(str, str2) != null) {
                f14082k.mo24886a("Key %s was overwritten", str);
            }
        }
    }

    /* renamed from: b */
    public void m24801b(String str, String str2) {
        if (C6629i1.m24929W(str, "key", "Partner") && C6629i1.m24929W(str2, "value", "Partner")) {
            if (this.f14092j == null) {
                this.f14092j = new LinkedHashMap();
            }
            if (this.f14092j.put(str, str2) != null) {
                f14082k.mo24886a("Key %s was overwritten", str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m24800c() {
        return this.f14089g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, String> m24799d() {
        return this.f14091i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m24798e() {
        return this.f14084b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public String m24797f() {
        return this.f14086d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Map<String, String> m24796g() {
        return this.f14092j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public long m24795h() {
        return this.f14083a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public long m24794i() {
        return this.f14090h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public String m24793j() {
        return this.f14088f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public String m24792k() {
        return this.f14087e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public String m24791l() {
        return this.f14085c;
    }

    /* renamed from: m */
    public void m24790m(long j) {
        this.f14090h = j;
    }
}
