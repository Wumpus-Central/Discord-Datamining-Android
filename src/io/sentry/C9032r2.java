package io.sentry;

import io.sentry.C8918k4;
import io.sentry.protocol.C8997n;
import io.sentry.protocol.C9001p;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.r2 */
/* loaded from: classes8.dex */
public final class C9032r2 implements AbstractC8806b1 {

    /* renamed from: k */
    private final C9001p f19859k;

    /* renamed from: l */
    private final C8997n f19860l;

    /* renamed from: m */
    private final C8918k4 f19861m;

    /* renamed from: n */
    private Map<String, Object> f19862n;

    /* renamed from: io.sentry.r2$a */
    /* loaded from: classes8.dex */
    public static final class C9033a implements AbstractC9030r0<C9032r2> {
        /* renamed from: b */
        public C9032r2 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C9001p pVar = null;
            C8997n nVar = null;
            C8918k4 k4Var = null;
            HashMap hashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case 113722:
                        if (S.equals("sdk")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 110620997:
                        if (S.equals("trace")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 278118624:
                        if (S.equals("event_id")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        nVar = (C8997n) x0Var.m16802Y0(g0Var, new C8997n.C8998a());
                        break;
                    case 1:
                        k4Var = (C8918k4) x0Var.m16802Y0(g0Var, new C8918k4.C8920b());
                        break;
                    case 2:
                        pVar = (C9001p) x0Var.m16802Y0(g0Var, new C9001p.C9002a());
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        x0Var.m16799b1(g0Var, hashMap, S);
                        break;
                }
            }
            C9032r2 r2Var = new C9032r2(pVar, nVar, k4Var);
            r2Var.m17187d(hashMap);
            x0Var.m16934p();
            return r2Var;
        }
    }

    public C9032r2(C9001p pVar, C8997n nVar) {
        this(pVar, nVar, null);
    }

    /* renamed from: a */
    public C9001p m17190a() {
        return this.f19859k;
    }

    /* renamed from: b */
    public C8997n m17189b() {
        return this.f19860l;
    }

    /* renamed from: c */
    public C8918k4 m17188c() {
        return this.f19861m;
    }

    /* renamed from: d */
    public void m17187d(Map<String, Object> map) {
        this.f19862n = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19859k != null) {
            z0Var.m16753z0("event_id").m16754F0(g0Var, this.f19859k);
        }
        if (this.f19860l != null) {
            z0Var.m16753z0("sdk").m16754F0(g0Var, this.f19860l);
        }
        if (this.f19861m != null) {
            z0Var.m16753z0("trace").m16754F0(g0Var, this.f19861m);
        }
        Map<String, Object> map = this.f19862n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19862n.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    public C9032r2(C9001p pVar, C8997n nVar, C8918k4 k4Var) {
        this.f19859k = pVar;
        this.f19860l = nVar;
        this.f19861m = k4Var;
    }

    public C9032r2(C9001p pVar) {
        this(pVar, null);
    }

    public C9032r2() {
        this(new C9001p());
    }
}
