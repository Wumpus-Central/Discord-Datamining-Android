package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.util.C9098a;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Date;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.a */
/* loaded from: classes8.dex */
public final class C8970a implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19689k;

    /* renamed from: l */
    private Date f19690l;

    /* renamed from: m */
    private String f19691m;

    /* renamed from: n */
    private String f19692n;

    /* renamed from: o */
    private String f19693o;

    /* renamed from: p */
    private String f19694p;

    /* renamed from: q */
    private String f19695q;

    /* renamed from: r */
    private Map<String, String> f19696r;

    /* renamed from: s */
    private Map<String, Object> f19697s;

    /* renamed from: io.sentry.protocol.a$a */
    /* loaded from: classes8.dex */
    public static final class C0278a implements AbstractC9030r0<C8970a> {
        /* renamed from: b */
        public C8970a mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C8970a aVar = new C8970a();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1898053579:
                        if (S.equals("device_app_hash")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -901870406:
                        if (S.equals("app_version")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -470395285:
                        if (S.equals("build_type")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 746297735:
                        if (S.equals("app_identifier")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 791585128:
                        if (S.equals("app_start_time")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1133704324:
                        if (S.equals("permissions")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1167648233:
                        if (S.equals("app_name")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1826866896:
                        if (S.equals("app_build")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        aVar.f19691m = x0Var.m16801Z0();
                        break;
                    case 1:
                        aVar.f19694p = x0Var.m16801Z0();
                        break;
                    case 2:
                        aVar.f19692n = x0Var.m16801Z0();
                        break;
                    case 3:
                        aVar.f19689k = x0Var.m16801Z0();
                        break;
                    case 4:
                        aVar.f19690l = x0Var.m16811P0(g0Var);
                        break;
                    case 5:
                        aVar.f19696r = C9098a.m17024b((Map) x0Var.m16803X0());
                        break;
                    case 6:
                        aVar.f19693o = x0Var.m16801Z0();
                        break;
                    case 7:
                        aVar.f19695q = x0Var.m16801Z0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            aVar.m17511o(concurrentHashMap);
            x0Var.m16934p();
            return aVar;
        }
    }

    public C8970a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8970a(C8970a aVar) {
        this.f19695q = aVar.f19695q;
        this.f19689k = aVar.f19689k;
        this.f19693o = aVar.f19693o;
        this.f19690l = aVar.f19690l;
        this.f19694p = aVar.f19694p;
        this.f19692n = aVar.f19692n;
        this.f19691m = aVar.f19691m;
        this.f19696r = C9098a.m17024b(aVar.f19696r);
        this.f19697s = C9098a.m17024b(aVar.f19697s);
    }

    /* renamed from: i */
    public void m17517i(String str) {
        this.f19695q = str;
    }

    /* renamed from: j */
    public void m17516j(String str) {
        this.f19689k = str;
    }

    /* renamed from: k */
    public void m17515k(String str) {
        this.f19693o = str;
    }

    /* renamed from: l */
    public void m17514l(Date date) {
        this.f19690l = date;
    }

    /* renamed from: m */
    public void m17513m(String str) {
        this.f19694p = str;
    }

    /* renamed from: n */
    public void m17512n(Map<String, String> map) {
        this.f19696r = map;
    }

    /* renamed from: o */
    public void m17511o(Map<String, Object> map) {
        this.f19697s = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19689k != null) {
            z0Var.m16753z0("app_identifier").m16918f0(this.f19689k);
        }
        if (this.f19690l != null) {
            z0Var.m16753z0("app_start_time").m16754F0(g0Var, this.f19690l);
        }
        if (this.f19691m != null) {
            z0Var.m16753z0("device_app_hash").m16918f0(this.f19691m);
        }
        if (this.f19692n != null) {
            z0Var.m16753z0("build_type").m16918f0(this.f19692n);
        }
        if (this.f19693o != null) {
            z0Var.m16753z0("app_name").m16918f0(this.f19693o);
        }
        if (this.f19694p != null) {
            z0Var.m16753z0("app_version").m16918f0(this.f19694p);
        }
        if (this.f19695q != null) {
            z0Var.m16753z0("app_build").m16918f0(this.f19695q);
        }
        Map<String, String> map = this.f19696r;
        if (map != null && !map.isEmpty()) {
            z0Var.m16753z0("permissions").m16754F0(g0Var, this.f19696r);
        }
        Map<String, Object> map2 = this.f19697s;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f19697s.get(str));
            }
        }
        z0Var.m16911p();
    }
}
