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

/* renamed from: io.sentry.protocol.f */
/* loaded from: classes8.dex */
public final class C8981f implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19720k;

    /* renamed from: l */
    private Integer f19721l;

    /* renamed from: m */
    private String f19722m;

    /* renamed from: n */
    private String f19723n;

    /* renamed from: o */
    private Integer f19724o;

    /* renamed from: p */
    private String f19725p;

    /* renamed from: q */
    private Boolean f19726q;

    /* renamed from: r */
    private String f19727r;

    /* renamed from: s */
    private String f19728s;

    /* renamed from: t */
    private Map<String, Object> f19729t;

    /* renamed from: io.sentry.protocol.f$a */
    /* loaded from: classes8.dex */
    public static final class C8982a implements AbstractC9030r0<C8981f> {
        /* renamed from: b */
        public C8981f mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C8981f fVar = new C8981f();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1421884745:
                        if (S.equals("npot_support")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1085970574:
                        if (S.equals("vendor_id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1009234244:
                        if (S.equals("multi_threaded_rendering")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3355:
                        if (S.equals("id")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3373707:
                        if (S.equals("name")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 59480866:
                        if (S.equals("vendor_name")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 351608024:
                        if (S.equals("version")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 967446079:
                        if (S.equals("api_type")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1418777727:
                        if (S.equals("memory_size")) {
                            c = '\b';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        fVar.f19728s = x0Var.m16801Z0();
                        break;
                    case 1:
                        fVar.f19722m = x0Var.m16801Z0();
                        break;
                    case 2:
                        fVar.f19726q = x0Var.m16812O0();
                        break;
                    case 3:
                        fVar.f19721l = x0Var.m16807T0();
                        break;
                    case 4:
                        fVar.f19720k = x0Var.m16801Z0();
                        break;
                    case 5:
                        fVar.f19723n = x0Var.m16801Z0();
                        break;
                    case 6:
                        fVar.f19727r = x0Var.m16801Z0();
                        break;
                    case 7:
                        fVar.f19725p = x0Var.m16801Z0();
                        break;
                    case '\b':
                        fVar.f19724o = x0Var.m16807T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            fVar.m17407j(concurrentHashMap);
            x0Var.m16934p();
            return fVar;
        }
    }

    public C8981f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8981f(C8981f fVar) {
        this.f19720k = fVar.f19720k;
        this.f19721l = fVar.f19721l;
        this.f19722m = fVar.f19722m;
        this.f19723n = fVar.f19723n;
        this.f19724o = fVar.f19724o;
        this.f19725p = fVar.f19725p;
        this.f19726q = fVar.f19726q;
        this.f19727r = fVar.f19727r;
        this.f19728s = fVar.f19728s;
        this.f19729t = C9098a.m17024b(fVar.f19729t);
    }

    /* renamed from: j */
    public void m17407j(Map<String, Object> map) {
        this.f19729t = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19720k != null) {
            z0Var.m16753z0("name").m16918f0(this.f19720k);
        }
        if (this.f19721l != null) {
            z0Var.m16753z0("id").m16919b0(this.f19721l);
        }
        if (this.f19722m != null) {
            z0Var.m16753z0("vendor_id").m16918f0(this.f19722m);
        }
        if (this.f19723n != null) {
            z0Var.m16753z0("vendor_name").m16918f0(this.f19723n);
        }
        if (this.f19724o != null) {
            z0Var.m16753z0("memory_size").m16919b0(this.f19724o);
        }
        if (this.f19725p != null) {
            z0Var.m16753z0("api_type").m16918f0(this.f19725p);
        }
        if (this.f19726q != null) {
            z0Var.m16753z0("multi_threaded_rendering").m16921Y(this.f19726q);
        }
        if (this.f19727r != null) {
            z0Var.m16753z0("version").m16918f0(this.f19727r);
        }
        if (this.f19728s != null) {
            z0Var.m16753z0("npot_support").m16918f0(this.f19728s);
        }
        Map<String, Object> map = this.f19729t;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19729t.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }
}
