package io.sentry;

import io.sentry.C8856e4;
import io.sentry.EnumC8866f4;
import io.sentry.protocol.C9001p;
import io.sentry.util.C9098a;
import io.sentry.util.C9111k;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.c4 */
/* loaded from: classes8.dex */
public class C8815c4 implements AbstractC8806b1 {

    /* renamed from: k */
    private final C9001p f19486k;

    /* renamed from: l */
    private final C8856e4 f19487l;

    /* renamed from: m */
    private final C8856e4 f19488m;

    /* renamed from: n */
    private transient C8937m4 f19489n;

    /* renamed from: o */
    protected String f19490o;

    /* renamed from: p */
    protected String f19491p;

    /* renamed from: q */
    protected EnumC8866f4 f19492q;

    /* renamed from: r */
    protected Map<String, String> f19493r;

    /* renamed from: s */
    private Map<String, Object> f19494s;

    /* renamed from: io.sentry.c4$a */
    /* loaded from: classes8.dex */
    public static final class C8816a implements AbstractC9030r0<C8815c4> {
        /* renamed from: b */
        public C8815c4 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            ConcurrentHashMap concurrentHashMap = null;
            C9001p pVar = null;
            C8856e4 e4Var = null;
            String str = null;
            C8856e4 e4Var2 = null;
            String str2 = null;
            EnumC8866f4 f4Var = null;
            Map<String, String> map = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -2011840976:
                        if (S.equals("span_id")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1757797477:
                        if (S.equals("parent_span_id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1724546052:
                        if (S.equals("description")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -892481550:
                        if (S.equals("status")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3553:
                        if (S.equals("op")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3552281:
                        if (S.equals("tags")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (S.equals("trace_id")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        e4Var = new C8856e4.C8857a().mo16758a(x0Var, g0Var);
                        break;
                    case 1:
                        e4Var2 = (C8856e4) x0Var.m16802Y0(g0Var, new C8856e4.C8857a());
                        break;
                    case 2:
                        str2 = x0Var.m16941f0();
                        break;
                    case 3:
                        f4Var = (EnumC8866f4) x0Var.m16802Y0(g0Var, new EnumC8866f4.C8867a());
                        break;
                    case 4:
                        str = x0Var.m16941f0();
                        break;
                    case 5:
                        map = C9098a.m17024b((Map) x0Var.m16803X0());
                        break;
                    case 6:
                        pVar = new C9001p.C9002a().mo16758a(x0Var, g0Var);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            if (pVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                g0Var.mo17723b(EnumC8942n3.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            } else if (e4Var == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                g0Var.mo17723b(EnumC8942n3.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            } else if (str != null) {
                C8815c4 c4Var = new C8815c4(pVar, e4Var, str, e4Var2, null);
                c4Var.m17986k(str2);
                c4Var.m17984m(f4Var);
                if (map != null) {
                    c4Var.f19493r = map;
                }
                c4Var.m17983n(concurrentHashMap);
                x0Var.m16934p();
                return c4Var;
            } else {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"op\"");
                g0Var.mo17723b(EnumC8942n3.ERROR, "Missing required field \"op\"", illegalStateException3);
                throw illegalStateException3;
            }
        }
    }

    public C8815c4(String str) {
        this(new C9001p(), new C8856e4(), str, null, null);
    }

    /* renamed from: a */
    public String m17996a() {
        return this.f19491p;
    }

    /* renamed from: b */
    public String m17995b() {
        return this.f19490o;
    }

    /* renamed from: c */
    public C8856e4 m17994c() {
        return this.f19488m;
    }

    /* renamed from: d */
    public Boolean m17993d() {
        C8937m4 m4Var = this.f19489n;
        if (m4Var == null) {
            return null;
        }
        return m4Var.m17600a();
    }

    /* renamed from: e */
    public Boolean m17992e() {
        C8937m4 m4Var = this.f19489n;
        if (m4Var == null) {
            return null;
        }
        return m4Var.m17598c();
    }

    /* renamed from: f */
    public C8937m4 m17991f() {
        return this.f19489n;
    }

    /* renamed from: g */
    public C8856e4 m17990g() {
        return this.f19487l;
    }

    /* renamed from: h */
    public EnumC8866f4 m17989h() {
        return this.f19492q;
    }

    /* renamed from: i */
    public Map<String, String> m17988i() {
        return this.f19493r;
    }

    /* renamed from: j */
    public C9001p m17987j() {
        return this.f19486k;
    }

    /* renamed from: k */
    public void m17986k(String str) {
        this.f19491p = str;
    }

    /* renamed from: l */
    public void m17985l(C8937m4 m4Var) {
        this.f19489n = m4Var;
    }

    /* renamed from: m */
    public void m17984m(EnumC8866f4 f4Var) {
        this.f19492q = f4Var;
    }

    /* renamed from: n */
    public void m17983n(Map<String, Object> map) {
        this.f19494s = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("trace_id");
        this.f19486k.serialize(z0Var, g0Var);
        z0Var.m16753z0("span_id");
        this.f19487l.serialize(z0Var, g0Var);
        if (this.f19488m != null) {
            z0Var.m16753z0("parent_span_id");
            this.f19488m.serialize(z0Var, g0Var);
        }
        z0Var.m16753z0("op").m16918f0(this.f19490o);
        if (this.f19491p != null) {
            z0Var.m16753z0("description").m16918f0(this.f19491p);
        }
        if (this.f19492q != null) {
            z0Var.m16753z0("status").m16754F0(g0Var, this.f19492q);
        }
        if (!this.f19493r.isEmpty()) {
            z0Var.m16753z0("tags").m16754F0(g0Var, this.f19493r);
        }
        Map<String, Object> map = this.f19494s;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f19494s.get(str));
            }
        }
        z0Var.m16911p();
    }

    public C8815c4(C9001p pVar, C8856e4 e4Var, String str, C8856e4 e4Var2, C8937m4 m4Var) {
        this(pVar, e4Var, e4Var2, str, null, m4Var, null);
    }

    public C8815c4(C9001p pVar, C8856e4 e4Var, C8856e4 e4Var2, String str, String str2, C8937m4 m4Var, EnumC8866f4 f4Var) {
        this.f19493r = new ConcurrentHashMap();
        this.f19486k = (C9001p) C9111k.m16995a(pVar, "traceId is required");
        this.f19487l = (C8856e4) C9111k.m16995a(e4Var, "spanId is required");
        this.f19490o = (String) C9111k.m16995a(str, "operation is required");
        this.f19488m = e4Var2;
        this.f19489n = m4Var;
        this.f19491p = str2;
        this.f19492q = f4Var;
    }

    public C8815c4(C8815c4 c4Var) {
        this.f19493r = new ConcurrentHashMap();
        this.f19486k = c4Var.f19486k;
        this.f19487l = c4Var.f19487l;
        this.f19488m = c4Var.f19488m;
        this.f19489n = c4Var.f19489n;
        this.f19490o = c4Var.f19490o;
        this.f19491p = c4Var.f19491p;
        this.f19492q = c4Var.f19492q;
        Map<String, String> b = C9098a.m17024b(c4Var.f19493r);
        if (b != null) {
            this.f19493r = b;
        }
    }
}
