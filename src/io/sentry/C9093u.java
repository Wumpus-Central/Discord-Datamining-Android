package io.sentry;

import com.swmansion.reanimated.BuildConfig;
import io.sentry.C8951o3;
import io.sentry.config.AbstractC8839g;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.u */
/* loaded from: classes8.dex */
public final class C9093u {

    /* renamed from: a */
    private String f19946a;

    /* renamed from: b */
    private String f19947b;

    /* renamed from: c */
    private String f19948c;

    /* renamed from: d */
    private String f19949d;

    /* renamed from: e */
    private String f19950e;

    /* renamed from: f */
    private Boolean f19951f;

    /* renamed from: g */
    private Boolean f19952g;

    /* renamed from: h */
    private Boolean f19953h;

    /* renamed from: i */
    private Double f19954i;

    /* renamed from: j */
    private Double f19955j;

    /* renamed from: k */
    private C8951o3.EnumC8957f f19956k;

    /* renamed from: m */
    private C8951o3.C8956e f19958m;

    /* renamed from: r */
    private String f19963r;

    /* renamed from: s */
    private Long f19964s;

    /* renamed from: u */
    private Boolean f19966u;

    /* renamed from: v */
    private Boolean f19967v;

    /* renamed from: l */
    private final Map<String, String> f19957l = new ConcurrentHashMap();

    /* renamed from: n */
    private final List<String> f19959n = new CopyOnWriteArrayList();

    /* renamed from: o */
    private final List<String> f19960o = new CopyOnWriteArrayList();

    /* renamed from: p */
    private List<String> f19961p = null;

    /* renamed from: q */
    private final List<String> f19962q = new CopyOnWriteArrayList();

    /* renamed from: t */
    private final Set<Class<? extends Throwable>> f19965t = new CopyOnWriteArraySet();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static C9093u m17061f(AbstractC8839g gVar, AbstractC8869g0 g0Var) {
        List<String> list;
        C9093u uVar = new C9093u();
        uVar.m17081D(gVar.getProperty("dsn"));
        uVar.m17078G(gVar.getProperty("environment"));
        uVar.m17071N(gVar.getProperty("release"));
        uVar.m17082C(gVar.getProperty("dist"));
        uVar.m17069P(gVar.getProperty("servername"));
        uVar.m17079F(gVar.mo17922e("uncaught.handler.enabled"));
        uVar.m17075J(gVar.mo17922e("uncaught.handler.print-stacktrace"));
        uVar.m17067R(gVar.mo17925b("traces-sample-rate"));
        uVar.m17074K(gVar.mo17925b("profiles-sample-rate"));
        uVar.m17083B(gVar.mo17922e(BuildConfig.BUILD_TYPE));
        uVar.m17080E(gVar.mo17922e("enable-deduplication"));
        uVar.m17070O(gVar.mo17922e("send-client-reports"));
        String property = gVar.getProperty("max-request-body-size");
        if (property != null) {
            uVar.m17076I(C8951o3.EnumC8957f.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry<String, String> entry : gVar.getMap("tags").entrySet()) {
            uVar.m17068Q(entry.getKey(), entry.getValue());
        }
        String property2 = gVar.getProperty("proxy.host");
        String property3 = gVar.getProperty("proxy.user");
        String property4 = gVar.getProperty("proxy.pass");
        String c = gVar.mo17924c("proxy.port", "80");
        if (property2 != null) {
            uVar.m17072M(new C8951o3.C8956e(property2, c, property3, property4));
        }
        for (String str : gVar.mo17923d("in-app-includes")) {
            uVar.m17063d(str);
        }
        for (String str2 : gVar.mo17923d("in-app-excludes")) {
            uVar.m17064c(str2);
        }
        if (gVar.getProperty("trace-propagation-targets") != null) {
            list = gVar.mo17923d("trace-propagation-targets");
        } else {
            list = null;
        }
        if (list == null && gVar.getProperty("tracing-origins") != null) {
            list = gVar.mo17923d("tracing-origins");
        }
        if (list != null) {
            for (String str3 : list) {
                uVar.m17062e(str3);
            }
        }
        for (String str4 : gVar.mo17923d("context-tags")) {
            uVar.m17066a(str4);
        }
        uVar.m17073L(gVar.getProperty("proguard-uuid"));
        uVar.m17077H(gVar.mo17926a("idle-timeout"));
        for (String str5 : gVar.mo17923d("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str5);
                if (Throwable.class.isAssignableFrom(cls)) {
                    uVar.m17065b(cls);
                } else {
                    g0Var.mo17722c(EnumC8942n3.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str5, str5);
                }
            } catch (ClassNotFoundException unused) {
                g0Var.mo17722c(EnumC8942n3.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str5, str5);
            }
        }
        return uVar;
    }

    /* renamed from: A */
    public Double m17084A() {
        return this.f19954i;
    }

    /* renamed from: B */
    public void m17083B(Boolean bool) {
        this.f19952g = bool;
    }

    /* renamed from: C */
    public void m17082C(String str) {
        this.f19949d = str;
    }

    /* renamed from: D */
    public void m17081D(String str) {
        this.f19946a = str;
    }

    /* renamed from: E */
    public void m17080E(Boolean bool) {
        this.f19953h = bool;
    }

    /* renamed from: F */
    public void m17079F(Boolean bool) {
        this.f19951f = bool;
    }

    /* renamed from: G */
    public void m17078G(String str) {
        this.f19947b = str;
    }

    /* renamed from: H */
    public void m17077H(Long l) {
        this.f19964s = l;
    }

    /* renamed from: I */
    public void m17076I(C8951o3.EnumC8957f fVar) {
        this.f19956k = fVar;
    }

    /* renamed from: J */
    public void m17075J(Boolean bool) {
        this.f19966u = bool;
    }

    /* renamed from: K */
    public void m17074K(Double d) {
        this.f19955j = d;
    }

    /* renamed from: L */
    public void m17073L(String str) {
        this.f19963r = str;
    }

    /* renamed from: M */
    public void m17072M(C8951o3.C8956e eVar) {
        this.f19958m = eVar;
    }

    /* renamed from: N */
    public void m17071N(String str) {
        this.f19948c = str;
    }

    /* renamed from: O */
    public void m17070O(Boolean bool) {
        this.f19967v = bool;
    }

    /* renamed from: P */
    public void m17069P(String str) {
        this.f19950e = str;
    }

    /* renamed from: Q */
    public void m17068Q(String str, String str2) {
        this.f19957l.put(str, str2);
    }

    /* renamed from: R */
    public void m17067R(Double d) {
        this.f19954i = d;
    }

    /* renamed from: a */
    public void m17066a(String str) {
        this.f19962q.add(str);
    }

    /* renamed from: b */
    public void m17065b(Class<? extends Throwable> cls) {
        this.f19965t.add(cls);
    }

    /* renamed from: c */
    public void m17064c(String str) {
        this.f19959n.add(str);
    }

    /* renamed from: d */
    public void m17063d(String str) {
        this.f19960o.add(str);
    }

    /* renamed from: e */
    public void m17062e(String str) {
        if (this.f19961p == null) {
            this.f19961p = new CopyOnWriteArrayList();
        }
        if (!str.isEmpty()) {
            this.f19961p.add(str);
        }
    }

    /* renamed from: g */
    public List<String> m17060g() {
        return this.f19962q;
    }

    /* renamed from: h */
    public Boolean m17059h() {
        return this.f19952g;
    }

    /* renamed from: i */
    public String m17058i() {
        return this.f19949d;
    }

    /* renamed from: j */
    public String m17057j() {
        return this.f19946a;
    }

    /* renamed from: k */
    public Boolean m17056k() {
        return this.f19953h;
    }

    /* renamed from: l */
    public Boolean m17055l() {
        return this.f19951f;
    }

    /* renamed from: m */
    public String m17054m() {
        return this.f19947b;
    }

    /* renamed from: n */
    public Long m17053n() {
        return this.f19964s;
    }

    /* renamed from: o */
    public Set<Class<? extends Throwable>> m17052o() {
        return this.f19965t;
    }

    /* renamed from: p */
    public List<String> m17051p() {
        return this.f19959n;
    }

    /* renamed from: q */
    public List<String> m17050q() {
        return this.f19960o;
    }

    /* renamed from: r */
    public Boolean m17049r() {
        return this.f19966u;
    }

    /* renamed from: s */
    public Double m17048s() {
        return this.f19955j;
    }

    /* renamed from: t */
    public String m17047t() {
        return this.f19963r;
    }

    /* renamed from: u */
    public C8951o3.C8956e m17046u() {
        return this.f19958m;
    }

    /* renamed from: v */
    public String m17045v() {
        return this.f19948c;
    }

    /* renamed from: w */
    public Boolean m17044w() {
        return this.f19967v;
    }

    /* renamed from: x */
    public String m17043x() {
        return this.f19950e;
    }

    /* renamed from: y */
    public Map<String, String> m17042y() {
        return this.f19957l;
    }

    /* renamed from: z */
    public List<String> m17041z() {
        return this.f19961p;
    }
}
