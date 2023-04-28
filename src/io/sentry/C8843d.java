package io.sentry;

import io.sentry.util.C9098a;
import java.util.Date;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.d */
/* loaded from: classes8.dex */
public final class C8843d implements AbstractC8806b1 {

    /* renamed from: k */
    private final Date f19521k;

    /* renamed from: l */
    private String f19522l;

    /* renamed from: m */
    private String f19523m;

    /* renamed from: n */
    private Map<String, Object> f19524n;

    /* renamed from: o */
    private String f19525o;

    /* renamed from: p */
    private EnumC8942n3 f19526p;

    /* renamed from: q */
    private Map<String, Object> f19527q;

    /* renamed from: io.sentry.d$a */
    /* loaded from: classes8.dex */
    public static final class C8844a implements AbstractC9030r0<C8843d> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
        /* JADX WARN: Unknown variable types count: 1 */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.sentry.C8843d mo16758a(io.sentry.C9146x0 r12, io.sentry.AbstractC8869g0 r13) {
            /*
                r11 = this;
                r12.m16940g()
                java.util.Date r0 = io.sentry.C8875h.m17846b()
                j$.util.concurrent.ConcurrentHashMap r1 = new j$.util.concurrent.ConcurrentHashMap
                r1.<init>()
                r2 = 0
                r3 = r2
                r4 = r3
                r5 = r4
                r6 = r5
            L_0x0011:
                io.sentry.vendor.gson.stream.b r7 = r12.m16930w0()
                io.sentry.vendor.gson.stream.b r8 = io.sentry.vendor.gson.stream.EnumC9125b.NAME
                if (r7 != r8) goto L_0x00b8
                java.lang.String r7 = r12.m16946S()
                r7.hashCode()
                int r8 = r7.hashCode()
                r9 = 0
                r10 = -1
                switch(r8) {
                    case 3076010: goto L_0x0061;
                    case 3575610: goto L_0x0056;
                    case 50511102: goto L_0x004b;
                    case 55126294: goto L_0x0040;
                    case 102865796: goto L_0x0035;
                    case 954925063: goto L_0x002a;
                    default: goto L_0x0029;
                }
            L_0x0029:
                goto L_0x006b
            L_0x002a:
                java.lang.String r8 = "message"
                boolean r8 = r7.equals(r8)
                if (r8 != 0) goto L_0x0033
                goto L_0x006b
            L_0x0033:
                r10 = 5
                goto L_0x006b
            L_0x0035:
                java.lang.String r8 = "level"
                boolean r8 = r7.equals(r8)
                if (r8 != 0) goto L_0x003e
                goto L_0x006b
            L_0x003e:
                r10 = 4
                goto L_0x006b
            L_0x0040:
                java.lang.String r8 = "timestamp"
                boolean r8 = r7.equals(r8)
                if (r8 != 0) goto L_0x0049
                goto L_0x006b
            L_0x0049:
                r10 = 3
                goto L_0x006b
            L_0x004b:
                java.lang.String r8 = "category"
                boolean r8 = r7.equals(r8)
                if (r8 != 0) goto L_0x0054
                goto L_0x006b
            L_0x0054:
                r10 = 2
                goto L_0x006b
            L_0x0056:
                java.lang.String r8 = "type"
                boolean r8 = r7.equals(r8)
                if (r8 != 0) goto L_0x005f
                goto L_0x006b
            L_0x005f:
                r10 = 1
                goto L_0x006b
            L_0x0061:
                java.lang.String r8 = "data"
                boolean r8 = r7.equals(r8)
                if (r8 != 0) goto L_0x006a
                goto L_0x006b
            L_0x006a:
                r10 = r9
            L_0x006b:
                switch(r10) {
                    case 0: goto L_0x00a9;
                    case 1: goto L_0x00a3;
                    case 2: goto L_0x009d;
                    case 3: goto L_0x0094;
                    case 4: goto L_0x007e;
                    case 5: goto L_0x0079;
                    default: goto L_0x006e;
                }
            L_0x006e:
                if (r6 != 0) goto L_0x0075
                j$.util.concurrent.ConcurrentHashMap r6 = new j$.util.concurrent.ConcurrentHashMap
                r6.<init>()
            L_0x0075:
                r12.m16799b1(r13, r6, r7)
                goto L_0x0011
            L_0x0079:
                java.lang.String r2 = r12.m16801Z0()
                goto L_0x0011
            L_0x007e:
                io.sentry.n3$a r7 = new io.sentry.n3$a     // Catch: Exception -> 0x0088
                r7.<init>()     // Catch: Exception -> 0x0088
                io.sentry.n3 r5 = r7.mo16758a(r12, r13)     // Catch: Exception -> 0x0088
                goto L_0x0011
            L_0x0088:
                r7 = move-exception
                io.sentry.n3 r8 = io.sentry.EnumC8942n3.ERROR
                java.lang.String r10 = "Error when deserializing SentryLevel"
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r13.mo17724a(r8, r7, r10, r9)
                goto L_0x0011
            L_0x0094:
                java.util.Date r7 = r12.m16811P0(r13)
                if (r7 == 0) goto L_0x0011
                r0 = r7
                goto L_0x0011
            L_0x009d:
                java.lang.String r4 = r12.m16801Z0()
                goto L_0x0011
            L_0x00a3:
                java.lang.String r3 = r12.m16801Z0()
                goto L_0x0011
            L_0x00a9:
                java.lang.Object r7 = r12.m16803X0()
                java.util.Map r7 = (java.util.Map) r7
                java.util.Map r7 = io.sentry.util.C9098a.m17024b(r7)
                if (r7 == 0) goto L_0x0011
                r1 = r7
                goto L_0x0011
            L_0x00b8:
                io.sentry.d r13 = new io.sentry.d
                r13.<init>(r0)
                io.sentry.C8843d.m17920a(r13, r2)
                io.sentry.C8843d.m17919b(r13, r3)
                io.sentry.C8843d.m17918c(r13, r1)
                io.sentry.C8843d.m17917d(r13, r4)
                io.sentry.C8843d.m17916e(r13, r5)
                r13.m17904q(r6)
                r12.m16934p()
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.C8843d.C8844a.mo16758a(io.sentry.x0, io.sentry.g0):io.sentry.d");
        }
    }

    public C8843d(Date date) {
        this.f19524n = new ConcurrentHashMap();
        this.f19521k = date;
    }

    /* renamed from: r */
    public static C8843d m17903r(String str, String str2, String str3, Map<String, Object> map) {
        C8843d dVar = new C8843d();
        dVar.m17905p("user");
        dVar.m17909l("ui." + str);
        if (str2 != null) {
            dVar.m17908m("view.id", str2);
        }
        if (str3 != null) {
            dVar.m17908m("view.class", str3);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            dVar.m17914g().put(entry.getKey(), entry.getValue());
        }
        dVar.m17907n(EnumC8942n3.INFO);
        return dVar;
    }

    /* renamed from: f */
    public String m17915f() {
        return this.f19525o;
    }

    /* renamed from: g */
    public Map<String, Object> m17914g() {
        return this.f19524n;
    }

    /* renamed from: h */
    public EnumC8942n3 m17913h() {
        return this.f19526p;
    }

    /* renamed from: i */
    public String m17912i() {
        return this.f19522l;
    }

    /* renamed from: j */
    public Date m17911j() {
        return (Date) this.f19521k.clone();
    }

    /* renamed from: k */
    public String m17910k() {
        return this.f19523m;
    }

    /* renamed from: l */
    public void m17909l(String str) {
        this.f19525o = str;
    }

    /* renamed from: m */
    public void m17908m(String str, Object obj) {
        this.f19524n.put(str, obj);
    }

    /* renamed from: n */
    public void m17907n(EnumC8942n3 n3Var) {
        this.f19526p = n3Var;
    }

    /* renamed from: o */
    public void m17906o(String str) {
        this.f19522l = str;
    }

    /* renamed from: p */
    public void m17905p(String str) {
        this.f19523m = str;
    }

    /* renamed from: q */
    public void m17904q(Map<String, Object> map) {
        this.f19527q = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("timestamp").m16754F0(g0Var, this.f19521k);
        if (this.f19522l != null) {
            z0Var.m16753z0("message").m16918f0(this.f19522l);
        }
        if (this.f19523m != null) {
            z0Var.m16753z0("type").m16918f0(this.f19523m);
        }
        z0Var.m16753z0("data").m16754F0(g0Var, this.f19524n);
        if (this.f19525o != null) {
            z0Var.m16753z0("category").m16918f0(this.f19525o);
        }
        if (this.f19526p != null) {
            z0Var.m16753z0("level").m16754F0(g0Var, this.f19526p);
        }
        Map<String, Object> map = this.f19527q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19527q.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8843d(C8843d dVar) {
        this.f19524n = new ConcurrentHashMap();
        this.f19521k = dVar.f19521k;
        this.f19522l = dVar.f19522l;
        this.f19523m = dVar.f19523m;
        this.f19525o = dVar.f19525o;
        Map<String, Object> b = C9098a.m17024b(dVar.f19524n);
        if (b != null) {
            this.f19524n = b;
        }
        this.f19527q = C9098a.m17024b(dVar.f19527q);
        this.f19526p = dVar.f19526p;
    }

    public C8843d() {
        this(C8875h.m17846b());
    }

    public C8843d(String str) {
        this();
        this.f19522l = str;
    }
}
