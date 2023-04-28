package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.protocol.C8985h;
import io.sentry.protocol.C9011u;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.protocol.o */
/* loaded from: classes8.dex */
public final class C8999o implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19779k;

    /* renamed from: l */
    private String f19780l;

    /* renamed from: m */
    private String f19781m;

    /* renamed from: n */
    private Long f19782n;

    /* renamed from: o */
    private C9011u f19783o;

    /* renamed from: p */
    private C8985h f19784p;

    /* renamed from: q */
    private Map<String, Object> f19785q;

    /* renamed from: io.sentry.protocol.o$a */
    /* loaded from: classes8.dex */
    public static final class C9000a implements AbstractC9030r0<C8999o> {
        /* renamed from: b */
        public C8999o mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            C8999o oVar = new C8999o();
            x0Var.m16940g();
            HashMap hashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1562235024:
                        if (S.equals("thread_id")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1068784020:
                        if (S.equals("module")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3575610:
                        if (S.equals("type")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 111972721:
                        if (S.equals("value")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1225089881:
                        if (S.equals("mechanism")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 2055832509:
                        if (S.equals("stacktrace")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        oVar.f19782n = x0Var.m16805V0();
                        break;
                    case 1:
                        oVar.f19781m = x0Var.m16801Z0();
                        break;
                    case 2:
                        oVar.f19779k = x0Var.m16801Z0();
                        break;
                    case 3:
                        oVar.f19780l = x0Var.m16801Z0();
                        break;
                    case 4:
                        oVar.f19784p = (C8985h) x0Var.m16802Y0(g0Var, new C8985h.C8986a());
                        break;
                    case 5:
                        oVar.f19783o = (C9011u) x0Var.m16802Y0(g0Var, new C9011u.C9012a());
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        x0Var.m16799b1(g0Var, hashMap, S);
                        break;
                }
            }
            x0Var.m16934p();
            oVar.m17319o(hashMap);
            return oVar;
        }
    }

    /* renamed from: g */
    public C8985h m17327g() {
        return this.f19784p;
    }

    /* renamed from: h */
    public Long m17326h() {
        return this.f19782n;
    }

    /* renamed from: i */
    public String m17325i() {
        return this.f19779k;
    }

    /* renamed from: j */
    public void m17324j(C8985h hVar) {
        this.f19784p = hVar;
    }

    /* renamed from: k */
    public void m17323k(String str) {
        this.f19781m = str;
    }

    /* renamed from: l */
    public void m17322l(C9011u uVar) {
        this.f19783o = uVar;
    }

    /* renamed from: m */
    public void m17321m(Long l) {
        this.f19782n = l;
    }

    /* renamed from: n */
    public void m17320n(String str) {
        this.f19779k = str;
    }

    /* renamed from: o */
    public void m17319o(Map<String, Object> map) {
        this.f19785q = map;
    }

    /* renamed from: p */
    public void m17318p(String str) {
        this.f19780l = str;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19779k != null) {
            z0Var.m16753z0("type").m16918f0(this.f19779k);
        }
        if (this.f19780l != null) {
            z0Var.m16753z0("value").m16918f0(this.f19780l);
        }
        if (this.f19781m != null) {
            z0Var.m16753z0("module").m16918f0(this.f19781m);
        }
        if (this.f19782n != null) {
            z0Var.m16753z0("thread_id").m16919b0(this.f19782n);
        }
        if (this.f19783o != null) {
            z0Var.m16753z0("stacktrace").m16754F0(g0Var, this.f19783o);
        }
        if (this.f19784p != null) {
            z0Var.m16753z0("mechanism").m16754F0(g0Var, this.f19784p);
        }
        Map<String, Object> map = this.f19785q;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f19785q.get(str));
            }
        }
        z0Var.m16911p();
    }
}
