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

/* renamed from: io.sentry.protocol.l */
/* loaded from: classes8.dex */
public final class C8993l implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19764k;

    /* renamed from: l */
    private Map<String, String> f19765l;

    /* renamed from: m */
    private Integer f19766m;

    /* renamed from: n */
    private Long f19767n;

    /* renamed from: o */
    private Map<String, Object> f19768o;

    /* renamed from: io.sentry.protocol.l$a */
    /* loaded from: classes8.dex */
    public static final class C8994a implements AbstractC9030r0<C8993l> {
        /* renamed from: b */
        public C8993l mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C8993l lVar = new C8993l();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -891699686:
                        if (S.equals("status_code")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 795307910:
                        if (S.equals("headers")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 952189583:
                        if (S.equals("cookies")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1252988030:
                        if (S.equals("body_size")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        lVar.f19766m = x0Var.m16807T0();
                        break;
                    case 1:
                        Map map = (Map) x0Var.m16803X0();
                        if (map == null) {
                            break;
                        } else {
                            lVar.f19765l = C9098a.m17024b(map);
                            break;
                        }
                    case 2:
                        lVar.f19764k = x0Var.m16801Z0();
                        break;
                    case 3:
                        lVar.f19767n = x0Var.m16805V0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            lVar.m17354e(concurrentHashMap);
            x0Var.m16934p();
            return lVar;
        }
    }

    public C8993l() {
    }

    public C8993l(C8993l lVar) {
        this.f19764k = lVar.f19764k;
        this.f19765l = C9098a.m17024b(lVar.f19765l);
        this.f19768o = C9098a.m17024b(lVar.f19768o);
        this.f19766m = lVar.f19766m;
        this.f19767n = lVar.f19767n;
    }

    /* renamed from: e */
    public void m17354e(Map<String, Object> map) {
        this.f19768o = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19764k != null) {
            z0Var.m16753z0("cookies").m16918f0(this.f19764k);
        }
        if (this.f19765l != null) {
            z0Var.m16753z0("headers").m16754F0(g0Var, this.f19765l);
        }
        if (this.f19766m != null) {
            z0Var.m16753z0("status_code").m16754F0(g0Var, this.f19766m);
        }
        if (this.f19767n != null) {
            z0Var.m16753z0("body_size").m16754F0(g0Var, this.f19767n);
        }
        Map<String, Object> map = this.f19768o;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19768o.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }
}
