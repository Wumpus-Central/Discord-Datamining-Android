package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C8809b4;
import io.sentry.C8856e4;
import io.sentry.C8875h;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.EnumC8866f4;
import io.sentry.EnumC8942n3;
import io.sentry.protocol.C9001p;
import io.sentry.util.C9098a;
import io.sentry.util.C9111k;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.s */
/* loaded from: classes8.dex */
public final class C9007s implements AbstractC8806b1 {

    /* renamed from: k */
    private final Double f19795k;

    /* renamed from: l */
    private final Double f19796l;

    /* renamed from: m */
    private final C9001p f19797m;

    /* renamed from: n */
    private final C8856e4 f19798n;

    /* renamed from: o */
    private final C8856e4 f19799o;

    /* renamed from: p */
    private final String f19800p;

    /* renamed from: q */
    private final String f19801q;

    /* renamed from: r */
    private final EnumC8866f4 f19802r;

    /* renamed from: s */
    private final Map<String, String> f19803s;

    /* renamed from: t */
    private final Map<String, Object> f19804t;

    /* renamed from: u */
    private Map<String, Object> f19805u;

    /* renamed from: io.sentry.protocol.s$a */
    /* loaded from: classes8.dex */
    public static final class C9008a implements AbstractC9030r0<C9007s> {
        /* renamed from: c */
        private Exception m17297c(String str, AbstractC8869g0 g0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            g0Var.mo17723b(EnumC8942n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* renamed from: b */
        public C9007s mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            HashMap hashMap;
            x0Var.m16940g();
            Map map = null;
            Double d = null;
            Double d2 = null;
            C9001p pVar = null;
            C8856e4 e4Var = null;
            C8856e4 e4Var2 = null;
            String str = null;
            String str2 = null;
            EnumC8866f4 f4Var = null;
            Map map2 = null;
            ConcurrentHashMap concurrentHashMap = null;
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
                    case -1526966919:
                        if (S.equals("start_timestamp")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -892481550:
                        if (S.equals("status")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3553:
                        if (S.equals("op")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3076010:
                        if (S.equals("data")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3552281:
                        if (S.equals("tags")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 55126294:
                        if (S.equals("timestamp")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1270300245:
                        if (S.equals("trace_id")) {
                            c = '\t';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        e4Var = new C8856e4.C8857a().mo16758a(x0Var, g0Var);
                        map2 = map2;
                        f4Var = f4Var;
                        break;
                    case 1:
                        e4Var2 = (C8856e4) x0Var.m16802Y0(g0Var, new C8856e4.C8857a());
                        map2 = map2;
                        f4Var = f4Var;
                        break;
                    case 2:
                        str2 = x0Var.m16801Z0();
                        map2 = map2;
                        f4Var = f4Var;
                        continue;
                    case 3:
                        try {
                            d = x0Var.m16810Q0();
                        } catch (NumberFormatException unused) {
                            Date P0 = x0Var.m16811P0(g0Var);
                            if (P0 != null) {
                                d = Double.valueOf(C8875h.m17847a(P0));
                            } else {
                                d = null;
                            }
                        }
                        map2 = map2;
                        f4Var = f4Var;
                        break;
                    case 4:
                        f4Var = (EnumC8866f4) x0Var.m16802Y0(g0Var, new EnumC8866f4.C8867a());
                        map2 = map2;
                        break;
                    case 5:
                        str = x0Var.m16801Z0();
                        map2 = map2;
                        f4Var = f4Var;
                        break;
                    case 6:
                        map2 = (Map) x0Var.m16803X0();
                        f4Var = f4Var;
                        break;
                    case 7:
                        map = (Map) x0Var.m16803X0();
                        map2 = map2;
                        f4Var = f4Var;
                        break;
                    case '\b':
                        try {
                            d2 = x0Var.m16810Q0();
                        } catch (NumberFormatException unused2) {
                            Date P02 = x0Var.m16811P0(g0Var);
                            if (P02 != null) {
                                d2 = Double.valueOf(C8875h.m17847a(P02));
                            } else {
                                d2 = null;
                            }
                        }
                        map2 = map2;
                        f4Var = f4Var;
                        break;
                    case '\t':
                        pVar = new C9001p.C9002a().mo16758a(x0Var, g0Var);
                        map2 = map2;
                        f4Var = f4Var;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        map2 = map2;
                        f4Var = f4Var;
                        break;
                }
                str2 = str2;
            }
            if (d == null) {
                throw m17297c("start_timestamp", g0Var);
            } else if (pVar == null) {
                throw m17297c("trace_id", g0Var);
            } else if (e4Var == null) {
                throw m17297c("span_id", g0Var);
            } else if (str != null) {
                if (map == null) {
                    hashMap = new HashMap();
                } else {
                    hashMap = map;
                }
                C9007s sVar = new C9007s(d, d2, pVar, e4Var, e4Var2, str, str2, f4Var, hashMap, map2);
                sVar.m17299c(concurrentHashMap);
                x0Var.m16934p();
                return sVar;
            } else {
                throw m17297c("op", g0Var);
            }
        }
    }

    public C9007s(C8809b4 b4Var) {
        this(b4Var, b4Var.m18034o());
    }

    /* renamed from: a */
    private BigDecimal m17301a(Double d) {
        return BigDecimal.valueOf(d.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    /* renamed from: b */
    public String m17300b() {
        return this.f19800p;
    }

    /* renamed from: c */
    public void m17299c(Map<String, Object> map) {
        this.f19805u = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("start_timestamp").m16754F0(g0Var, m17301a(this.f19795k));
        if (this.f19796l != null) {
            z0Var.m16753z0("timestamp").m16754F0(g0Var, m17301a(this.f19796l));
        }
        z0Var.m16753z0("trace_id").m16754F0(g0Var, this.f19797m);
        z0Var.m16753z0("span_id").m16754F0(g0Var, this.f19798n);
        if (this.f19799o != null) {
            z0Var.m16753z0("parent_span_id").m16754F0(g0Var, this.f19799o);
        }
        z0Var.m16753z0("op").m16918f0(this.f19800p);
        if (this.f19801q != null) {
            z0Var.m16753z0("description").m16918f0(this.f19801q);
        }
        if (this.f19802r != null) {
            z0Var.m16753z0("status").m16754F0(g0Var, this.f19802r);
        }
        if (!this.f19803s.isEmpty()) {
            z0Var.m16753z0("tags").m16754F0(g0Var, this.f19803s);
        }
        if (this.f19804t != null) {
            z0Var.m16753z0("data").m16754F0(g0Var, this.f19804t);
        }
        Map<String, Object> map = this.f19805u;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19805u.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    public C9007s(C8809b4 b4Var, Map<String, Object> map) {
        C9111k.m16995a(b4Var, "span is required");
        this.f19801q = b4Var.m18033p();
        this.f19800p = b4Var.m18028u();
        this.f19798n = b4Var.m18025x();
        this.f19799o = b4Var.m18027v();
        this.f19797m = b4Var.m18040B();
        this.f19802r = b4Var.mo16842b();
        Map<String, String> b = C9098a.m17024b(b4Var.m18023z());
        this.f19803s = b == null ? new ConcurrentHashMap<>() : b;
        this.f19796l = b4Var.m18030s();
        this.f19795k = Double.valueOf(C8875h.m17847a(b4Var.m18024y()));
        this.f19804t = map;
    }

    public C9007s(Double d, Double d2, C9001p pVar, C8856e4 e4Var, C8856e4 e4Var2, String str, String str2, EnumC8866f4 f4Var, Map<String, String> map, Map<String, Object> map2) {
        this.f19795k = d;
        this.f19796l = d2;
        this.f19797m = pVar;
        this.f19798n = e4Var;
        this.f19799o = e4Var2;
        this.f19800p = str;
        this.f19801q = str2;
        this.f19802r = f4Var;
        this.f19803s = map;
        this.f19804t = map2;
    }
}
