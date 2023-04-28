package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.protocol.C9009t;
import io.sentry.util.C9098a;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.List;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.u */
/* loaded from: classes8.dex */
public final class C9011u implements AbstractC8806b1 {

    /* renamed from: k */
    private List<C9009t> f19822k;

    /* renamed from: l */
    private Map<String, String> f19823l;

    /* renamed from: m */
    private Boolean f19824m;

    /* renamed from: n */
    private Map<String, Object> f19825n;

    /* renamed from: io.sentry.protocol.u$a */
    /* loaded from: classes8.dex */
    public static final class C9012a implements AbstractC9030r0<C9011u> {
        /* renamed from: b */
        public C9011u mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            C9011u uVar = new C9011u();
            x0Var.m16940g();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1266514778:
                        if (S.equals("frames")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 78226992:
                        if (S.equals("registers")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 284874180:
                        if (S.equals("snapshot")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        uVar.f19822k = x0Var.m16806U0(g0Var, new C9009t.C9010a());
                        break;
                    case 1:
                        uVar.f19823l = C9098a.m17024b((Map) x0Var.m16803X0());
                        break;
                    case 2:
                        uVar.f19824m = x0Var.m16812O0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            uVar.m17269e(concurrentHashMap);
            x0Var.m16934p();
            return uVar;
        }
    }

    public C9011u() {
    }

    public C9011u(List<C9009t> list) {
        this.f19822k = list;
    }

    /* renamed from: d */
    public void m17270d(Boolean bool) {
        this.f19824m = bool;
    }

    /* renamed from: e */
    public void m17269e(Map<String, Object> map) {
        this.f19825n = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19822k != null) {
            z0Var.m16753z0("frames").m16754F0(g0Var, this.f19822k);
        }
        if (this.f19823l != null) {
            z0Var.m16753z0("registers").m16754F0(g0Var, this.f19823l);
        }
        if (this.f19824m != null) {
            z0Var.m16753z0("snapshot").m16921Y(this.f19824m);
        }
        Map<String, Object> map = this.f19825n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19825n.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }
}
