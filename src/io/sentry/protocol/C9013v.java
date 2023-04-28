package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.protocol.C9011u;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.v */
/* loaded from: classes8.dex */
public final class C9013v implements AbstractC8806b1 {

    /* renamed from: k */
    private Long f19826k;

    /* renamed from: l */
    private Integer f19827l;

    /* renamed from: m */
    private String f19828m;

    /* renamed from: n */
    private String f19829n;

    /* renamed from: o */
    private Boolean f19830o;

    /* renamed from: p */
    private Boolean f19831p;

    /* renamed from: q */
    private Boolean f19832q;

    /* renamed from: r */
    private C9011u f19833r;

    /* renamed from: s */
    private Map<String, Object> f19834s;

    /* renamed from: io.sentry.protocol.v$a */
    /* loaded from: classes8.dex */
    public static final class C9014a implements AbstractC9030r0<C9013v> {
        /* renamed from: b */
        public C9013v mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            C9013v vVar = new C9013v();
            x0Var.m16940g();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1339353468:
                        if (S.equals("daemon")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1165461084:
                        if (S.equals("priority")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3355:
                        if (S.equals("id")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3373707:
                        if (S.equals("name")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 109757585:
                        if (S.equals("state")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1025385094:
                        if (S.equals("crashed")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1126940025:
                        if (S.equals("current")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 2055832509:
                        if (S.equals("stacktrace")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        vVar.f19832q = x0Var.m16812O0();
                        break;
                    case 1:
                        vVar.f19827l = x0Var.m16807T0();
                        break;
                    case 2:
                        vVar.f19826k = x0Var.m16805V0();
                        break;
                    case 3:
                        vVar.f19828m = x0Var.m16801Z0();
                        break;
                    case 4:
                        vVar.f19829n = x0Var.m16801Z0();
                        break;
                    case 5:
                        vVar.f19830o = x0Var.m16812O0();
                        break;
                    case 6:
                        vVar.f19831p = x0Var.m16812O0();
                        break;
                    case 7:
                        vVar.f19833r = (C9011u) x0Var.m16802Y0(g0Var, new C9011u.C9012a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            vVar.m17249s(concurrentHashMap);
            x0Var.m16934p();
            return vVar;
        }
    }

    /* renamed from: i */
    public Long m17259i() {
        return this.f19826k;
    }

    /* renamed from: j */
    public Boolean m17258j() {
        return this.f19831p;
    }

    /* renamed from: k */
    public void m17257k(Boolean bool) {
        this.f19830o = bool;
    }

    /* renamed from: l */
    public void m17256l(Boolean bool) {
        this.f19831p = bool;
    }

    /* renamed from: m */
    public void m17255m(Boolean bool) {
        this.f19832q = bool;
    }

    /* renamed from: n */
    public void m17254n(Long l) {
        this.f19826k = l;
    }

    /* renamed from: o */
    public void m17253o(String str) {
        this.f19828m = str;
    }

    /* renamed from: p */
    public void m17252p(Integer num) {
        this.f19827l = num;
    }

    /* renamed from: q */
    public void m17251q(C9011u uVar) {
        this.f19833r = uVar;
    }

    /* renamed from: r */
    public void m17250r(String str) {
        this.f19829n = str;
    }

    /* renamed from: s */
    public void m17249s(Map<String, Object> map) {
        this.f19834s = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19826k != null) {
            z0Var.m16753z0("id").m16919b0(this.f19826k);
        }
        if (this.f19827l != null) {
            z0Var.m16753z0("priority").m16919b0(this.f19827l);
        }
        if (this.f19828m != null) {
            z0Var.m16753z0("name").m16918f0(this.f19828m);
        }
        if (this.f19829n != null) {
            z0Var.m16753z0("state").m16918f0(this.f19829n);
        }
        if (this.f19830o != null) {
            z0Var.m16753z0("crashed").m16921Y(this.f19830o);
        }
        if (this.f19831p != null) {
            z0Var.m16753z0("current").m16921Y(this.f19831p);
        }
        if (this.f19832q != null) {
            z0Var.m16753z0("daemon").m16921Y(this.f19832q);
        }
        if (this.f19833r != null) {
            z0Var.m16753z0("stacktrace").m16754F0(g0Var, this.f19833r);
        }
        Map<String, Object> map = this.f19834s;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19834s.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }
}
