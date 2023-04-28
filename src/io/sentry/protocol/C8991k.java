package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.util.C9098a;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.k */
/* loaded from: classes8.dex */
public final class C8991k implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19753k;

    /* renamed from: l */
    private String f19754l;

    /* renamed from: m */
    private String f19755m;

    /* renamed from: n */
    private Object f19756n;

    /* renamed from: o */
    private String f19757o;

    /* renamed from: p */
    private Map<String, String> f19758p;

    /* renamed from: q */
    private Map<String, String> f19759q;

    /* renamed from: r */
    private Long f19760r;

    /* renamed from: s */
    private Map<String, String> f19761s;

    /* renamed from: t */
    private String f19762t;

    /* renamed from: u */
    private Map<String, Object> f19763u;

    /* renamed from: io.sentry.protocol.k$a */
    /* loaded from: classes8.dex */
    public static final class C8992a implements AbstractC9030r0<C8991k> {
        /* renamed from: b */
        public C8991k mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C8991k kVar = new C8991k();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1650269616:
                        if (S.equals("fragment")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1077554975:
                        if (S.equals("method")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 100589:
                        if (S.equals("env")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 116079:
                        if (S.equals("url")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3076010:
                        if (S.equals("data")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 106069776:
                        if (S.equals("other")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 795307910:
                        if (S.equals("headers")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 952189583:
                        if (S.equals("cookies")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1252988030:
                        if (S.equals("body_size")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1595298664:
                        if (S.equals("query_string")) {
                            c = '\t';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        kVar.f19762t = x0Var.m16801Z0();
                        break;
                    case 1:
                        kVar.f19754l = x0Var.m16801Z0();
                        break;
                    case 2:
                        Map map = (Map) x0Var.m16803X0();
                        if (map == null) {
                            break;
                        } else {
                            kVar.f19759q = C9098a.m17024b(map);
                            break;
                        }
                    case 3:
                        kVar.f19753k = x0Var.m16801Z0();
                        break;
                    case 4:
                        kVar.f19756n = x0Var.m16803X0();
                        break;
                    case 5:
                        Map map2 = (Map) x0Var.m16803X0();
                        if (map2 == null) {
                            break;
                        } else {
                            kVar.f19761s = C9098a.m17024b(map2);
                            break;
                        }
                    case 6:
                        Map map3 = (Map) x0Var.m16803X0();
                        if (map3 == null) {
                            break;
                        } else {
                            kVar.f19758p = C9098a.m17024b(map3);
                            break;
                        }
                    case 7:
                        kVar.f19757o = x0Var.m16801Z0();
                        break;
                    case '\b':
                        kVar.f19760r = x0Var.m16805V0();
                        break;
                    case '\t':
                        kVar.f19755m = x0Var.m16801Z0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            kVar.m17360l(concurrentHashMap);
            x0Var.m16934p();
            return kVar;
        }
    }

    public C8991k() {
    }

    public C8991k(C8991k kVar) {
        this.f19753k = kVar.f19753k;
        this.f19757o = kVar.f19757o;
        this.f19754l = kVar.f19754l;
        this.f19755m = kVar.f19755m;
        this.f19758p = C9098a.m17024b(kVar.f19758p);
        this.f19759q = C9098a.m17024b(kVar.f19759q);
        this.f19761s = C9098a.m17024b(kVar.f19761s);
        this.f19763u = C9098a.m17024b(kVar.f19763u);
        this.f19756n = kVar.f19756n;
        this.f19762t = kVar.f19762t;
        this.f19760r = kVar.f19760r;
    }

    /* renamed from: k */
    public Map<String, String> m17361k() {
        return this.f19758p;
    }

    /* renamed from: l */
    public void m17360l(Map<String, Object> map) {
        this.f19763u = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19753k != null) {
            z0Var.m16753z0("url").m16918f0(this.f19753k);
        }
        if (this.f19754l != null) {
            z0Var.m16753z0("method").m16918f0(this.f19754l);
        }
        if (this.f19755m != null) {
            z0Var.m16753z0("query_string").m16918f0(this.f19755m);
        }
        if (this.f19756n != null) {
            z0Var.m16753z0("data").m16754F0(g0Var, this.f19756n);
        }
        if (this.f19757o != null) {
            z0Var.m16753z0("cookies").m16918f0(this.f19757o);
        }
        if (this.f19758p != null) {
            z0Var.m16753z0("headers").m16754F0(g0Var, this.f19758p);
        }
        if (this.f19759q != null) {
            z0Var.m16753z0("env").m16754F0(g0Var, this.f19759q);
        }
        if (this.f19761s != null) {
            z0Var.m16753z0("other").m16754F0(g0Var, this.f19761s);
        }
        if (this.f19762t != null) {
            z0Var.m16753z0("fragment").m16754F0(g0Var, this.f19762t);
        }
        if (this.f19760r != null) {
            z0Var.m16753z0("body_size").m16754F0(g0Var, this.f19760r);
        }
        Map<String, Object> map = this.f19763u;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19763u.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }
}
