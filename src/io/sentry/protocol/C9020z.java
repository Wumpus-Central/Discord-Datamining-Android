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

/* renamed from: io.sentry.protocol.z */
/* loaded from: classes8.dex */
public final class C9020z implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19839k;

    /* renamed from: l */
    private String f19840l;

    /* renamed from: m */
    private String f19841m;

    /* renamed from: n */
    private String f19842n;

    /* renamed from: o */
    private String f19843o;

    /* renamed from: p */
    private Map<String, String> f19844p;

    /* renamed from: q */
    private Map<String, Object> f19845q;

    /* renamed from: io.sentry.protocol.z$a */
    /* loaded from: classes8.dex */
    public static final class C9021a implements AbstractC9030r0<C9020z> {
        /* renamed from: b */
        public C9020z mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C9020z zVar = new C9020z();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -265713450:
                        if (S.equals("username")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3355:
                        if (S.equals("id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3076010:
                        if (S.equals("data")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 96619420:
                        if (S.equals("email")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 106069776:
                        if (S.equals("other")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1480014044:
                        if (S.equals("ip_address")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1973722931:
                        if (S.equals("segment")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        zVar.f19841m = x0Var.m16801Z0();
                        break;
                    case 1:
                        zVar.f19840l = x0Var.m16801Z0();
                        break;
                    case 2:
                        zVar.f19844p = C9098a.m17024b((Map) x0Var.m16803X0());
                        break;
                    case 3:
                        zVar.f19839k = x0Var.m16801Z0();
                        break;
                    case 4:
                        if (zVar.f19844p != null && !zVar.f19844p.isEmpty()) {
                            break;
                        } else {
                            zVar.f19844p = C9098a.m17024b((Map) x0Var.m16803X0());
                            break;
                        }
                        break;
                    case 5:
                        zVar.f19843o = x0Var.m16801Z0();
                        break;
                    case 6:
                        zVar.f19842n = x0Var.m16801Z0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            zVar.m17213s(concurrentHashMap);
            x0Var.m16934p();
            return zVar;
        }
    }

    public C9020z() {
    }

    public C9020z(C9020z zVar) {
        this.f19839k = zVar.f19839k;
        this.f19841m = zVar.f19841m;
        this.f19840l = zVar.f19840l;
        this.f19843o = zVar.f19843o;
        this.f19842n = zVar.f19842n;
        this.f19844p = C9098a.m17024b(zVar.f19844p);
        this.f19845q = C9098a.m17024b(zVar.f19845q);
    }

    /* renamed from: h */
    public Map<String, String> m17224h() {
        return this.f19844p;
    }

    /* renamed from: i */
    public String m17223i() {
        return this.f19839k;
    }

    /* renamed from: j */
    public String m17222j() {
        return this.f19840l;
    }

    /* renamed from: k */
    public String m17221k() {
        return this.f19843o;
    }

    /* renamed from: l */
    public String m17220l() {
        return this.f19842n;
    }

    /* renamed from: m */
    public String m17219m() {
        return this.f19841m;
    }

    /* renamed from: n */
    public void m17218n(Map<String, String> map) {
        this.f19844p = C9098a.m17024b(map);
    }

    /* renamed from: o */
    public void m17217o(String str) {
        this.f19839k = str;
    }

    /* renamed from: p */
    public void m17216p(String str) {
        this.f19840l = str;
    }

    /* renamed from: q */
    public void m17215q(String str) {
        this.f19843o = str;
    }

    /* renamed from: r */
    public void m17214r(String str) {
        this.f19842n = str;
    }

    /* renamed from: s */
    public void m17213s(Map<String, Object> map) {
        this.f19845q = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19839k != null) {
            z0Var.m16753z0("email").m16918f0(this.f19839k);
        }
        if (this.f19840l != null) {
            z0Var.m16753z0("id").m16918f0(this.f19840l);
        }
        if (this.f19841m != null) {
            z0Var.m16753z0("username").m16918f0(this.f19841m);
        }
        if (this.f19842n != null) {
            z0Var.m16753z0("segment").m16918f0(this.f19842n);
        }
        if (this.f19843o != null) {
            z0Var.m16753z0("ip_address").m16918f0(this.f19843o);
        }
        if (this.f19844p != null) {
            z0Var.m16753z0("data").m16754F0(g0Var, this.f19844p);
        }
        Map<String, Object> map = this.f19845q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19845q.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    /* renamed from: t */
    public void m17212t(String str) {
        this.f19841m = str;
    }
}
