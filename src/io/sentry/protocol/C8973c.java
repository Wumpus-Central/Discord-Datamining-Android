package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C8815c4;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.protocol.C8970a;
import io.sentry.protocol.C8971b;
import io.sentry.protocol.C8977e;
import io.sentry.protocol.C8981f;
import io.sentry.protocol.C8989j;
import io.sentry.protocol.C8993l;
import io.sentry.protocol.C9005r;
import io.sentry.util.C9111k;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.c */
/* loaded from: classes8.dex */
public final class C8973c extends ConcurrentHashMap<String, Object> implements AbstractC8806b1 {

    /* renamed from: io.sentry.protocol.c$a */
    /* loaded from: classes8.dex */
    public static final class C8974a implements AbstractC9030r0<C8973c> {
        /* renamed from: b */
        public C8973c mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            C8973c cVar = new C8973c();
            x0Var.m16940g();
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1335157162:
                        if (S.equals("device")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -340323263:
                        if (S.equals("response")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3556:
                        if (S.equals("os")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 96801:
                        if (S.equals("app")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 102572:
                        if (S.equals("gpu")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 110620997:
                        if (S.equals("trace")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 150940456:
                        if (S.equals("browser")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1550962648:
                        if (S.equals("runtime")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        cVar.m17498i(new C8977e.C8978a().mo16758a(x0Var, g0Var));
                        break;
                    case 1:
                        cVar.m17495l(new C8993l.C8994a().mo16758a(x0Var, g0Var));
                        break;
                    case 2:
                        cVar.m17496k(new C8989j.C8990a().mo16758a(x0Var, g0Var));
                        break;
                    case 3:
                        cVar.m17500g(new C8970a.C0278a().mo16758a(x0Var, g0Var));
                        break;
                    case 4:
                        cVar.m17497j(new C8981f.C8982a().mo16758a(x0Var, g0Var));
                        break;
                    case 5:
                        cVar.m17493n(new C8815c4.C8816a().mo16758a(x0Var, g0Var));
                        break;
                    case 6:
                        cVar.m17499h(new C8971b.C8972a().mo16758a(x0Var, g0Var));
                        break;
                    case 7:
                        cVar.m17494m(new C9005r.C9006a().mo16758a(x0Var, g0Var));
                        break;
                    default:
                        Object X0 = x0Var.m16803X0();
                        if (X0 == null) {
                            break;
                        } else {
                            cVar.put(S, X0);
                            break;
                        }
                }
            }
            x0Var.m16934p();
            return cVar;
        }
    }

    public C8973c() {
    }

    /* renamed from: o */
    private <T> T m17492o(String str, Class<T> cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    /* renamed from: a */
    public C8970a m17505a() {
        return (C8970a) m17492o("app", C8970a.class);
    }

    /* renamed from: b */
    public C8977e m17504b() {
        return (C8977e) m17492o("device", C8977e.class);
    }

    /* renamed from: c */
    public C8989j m17503c() {
        return (C8989j) m17492o("os", C8989j.class);
    }

    /* renamed from: d */
    public C9005r m17502d() {
        return (C9005r) m17492o("runtime", C9005r.class);
    }

    /* renamed from: f */
    public C8815c4 m17501f() {
        return (C8815c4) m17492o("trace", C8815c4.class);
    }

    /* renamed from: g */
    public void m17500g(C8970a aVar) {
        put("app", aVar);
    }

    /* renamed from: h */
    public void m17499h(C8971b bVar) {
        put("browser", bVar);
    }

    /* renamed from: i */
    public void m17498i(C8977e eVar) {
        put("device", eVar);
    }

    /* renamed from: j */
    public void m17497j(C8981f fVar) {
        put("gpu", fVar);
    }

    /* renamed from: k */
    public void m17496k(C8989j jVar) {
        put("os", jVar);
    }

    /* renamed from: l */
    public void m17495l(C8993l lVar) {
        put("response", lVar);
    }

    /* renamed from: m */
    public void m17494m(C9005r rVar) {
        put("runtime", rVar);
    }

    /* renamed from: n */
    public void m17493n(C8815c4 c4Var) {
        C9111k.m16995a(c4Var, "traceContext is required");
        put("trace", c4Var);
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                z0Var.m16753z0(str).m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    public C8973c(C8973c cVar) {
        for (Map.Entry<String, Object> entry : cVar.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C8970a)) {
                    m17500g(new C8970a((C8970a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof C8971b)) {
                    m17499h(new C8971b((C8971b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof C8977e)) {
                    m17498i(new C8977e((C8977e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof C8989j)) {
                    m17496k(new C8989j((C8989j) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof C9005r)) {
                    m17494m(new C9005r((C9005r) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C8981f)) {
                    m17497j(new C8981f((C8981f) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof C8815c4)) {
                    m17493n(new C8815c4((C8815c4) value));
                } else if (!"response".equals(entry.getKey()) || !(value instanceof C8993l)) {
                    put(entry.getKey(), value);
                } else {
                    m17495l(new C8993l((C8993l) value));
                }
            }
        }
    }
}
