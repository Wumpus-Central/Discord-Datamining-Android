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

/* renamed from: io.sentry.protocol.j */
/* loaded from: classes8.dex */
public final class C8989j implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19746k;

    /* renamed from: l */
    private String f19747l;

    /* renamed from: m */
    private String f19748m;

    /* renamed from: n */
    private String f19749n;

    /* renamed from: o */
    private String f19750o;

    /* renamed from: p */
    private Boolean f19751p;

    /* renamed from: q */
    private Map<String, Object> f19752q;

    /* renamed from: io.sentry.protocol.j$a */
    /* loaded from: classes8.dex */
    public static final class C8990a implements AbstractC9030r0<C8989j> {
        /* renamed from: b */
        public C8989j mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C8989j jVar = new C8989j();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -925311743:
                        if (S.equals("rooted")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -339173787:
                        if (S.equals("raw_description")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3373707:
                        if (S.equals("name")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 94094958:
                        if (S.equals("build")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 351608024:
                        if (S.equals("version")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 2015527638:
                        if (S.equals("kernel_version")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jVar.f19751p = x0Var.m16812O0();
                        break;
                    case 1:
                        jVar.f19748m = x0Var.m16801Z0();
                        break;
                    case 2:
                        jVar.f19746k = x0Var.m16801Z0();
                        break;
                    case 3:
                        jVar.f19749n = x0Var.m16801Z0();
                        break;
                    case 4:
                        jVar.f19747l = x0Var.m16801Z0();
                        break;
                    case 5:
                        jVar.f19750o = x0Var.m16801Z0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            jVar.m17374l(concurrentHashMap);
            x0Var.m16934p();
            return jVar;
        }
    }

    public C8989j() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8989j(C8989j jVar) {
        this.f19746k = jVar.f19746k;
        this.f19747l = jVar.f19747l;
        this.f19748m = jVar.f19748m;
        this.f19749n = jVar.f19749n;
        this.f19750o = jVar.f19750o;
        this.f19751p = jVar.f19751p;
        this.f19752q = C9098a.m17024b(jVar.f19752q);
    }

    /* renamed from: g */
    public String m17379g() {
        return this.f19746k;
    }

    /* renamed from: h */
    public void m17378h(String str) {
        this.f19749n = str;
    }

    /* renamed from: i */
    public void m17377i(String str) {
        this.f19750o = str;
    }

    /* renamed from: j */
    public void m17376j(String str) {
        this.f19746k = str;
    }

    /* renamed from: k */
    public void m17375k(Boolean bool) {
        this.f19751p = bool;
    }

    /* renamed from: l */
    public void m17374l(Map<String, Object> map) {
        this.f19752q = map;
    }

    /* renamed from: m */
    public void m17373m(String str) {
        this.f19747l = str;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19746k != null) {
            z0Var.m16753z0("name").m16918f0(this.f19746k);
        }
        if (this.f19747l != null) {
            z0Var.m16753z0("version").m16918f0(this.f19747l);
        }
        if (this.f19748m != null) {
            z0Var.m16753z0("raw_description").m16918f0(this.f19748m);
        }
        if (this.f19749n != null) {
            z0Var.m16753z0("build").m16918f0(this.f19749n);
        }
        if (this.f19750o != null) {
            z0Var.m16753z0("kernel_version").m16918f0(this.f19750o);
        }
        if (this.f19751p != null) {
            z0Var.m16753z0("rooted").m16921Y(this.f19751p);
        }
        Map<String, Object> map = this.f19752q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19752q.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }
}
