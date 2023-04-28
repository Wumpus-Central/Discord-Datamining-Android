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

/* renamed from: io.sentry.protocol.r */
/* loaded from: classes8.dex */
public final class C9005r implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19791k;

    /* renamed from: l */
    private String f19792l;

    /* renamed from: m */
    private String f19793m;

    /* renamed from: n */
    private Map<String, Object> f19794n;

    /* renamed from: io.sentry.protocol.r$a */
    /* loaded from: classes8.dex */
    public static final class C9006a implements AbstractC9030r0<C9005r> {
        /* renamed from: b */
        public C9005r mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C9005r rVar = new C9005r();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -339173787:
                        if (S.equals("raw_description")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3373707:
                        if (S.equals("name")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 351608024:
                        if (S.equals("version")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        rVar.f19793m = x0Var.m16801Z0();
                        break;
                    case 1:
                        rVar.f19791k = x0Var.m16801Z0();
                        break;
                    case 2:
                        rVar.f19792l = x0Var.m16801Z0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            rVar.m17304g(concurrentHashMap);
            x0Var.m16934p();
            return rVar;
        }
    }

    public C9005r() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9005r(C9005r rVar) {
        this.f19791k = rVar.f19791k;
        this.f19792l = rVar.f19792l;
        this.f19793m = rVar.f19793m;
        this.f19794n = C9098a.m17024b(rVar.f19794n);
    }

    /* renamed from: d */
    public String m17307d() {
        return this.f19791k;
    }

    /* renamed from: e */
    public String m17306e() {
        return this.f19792l;
    }

    /* renamed from: f */
    public void m17305f(String str) {
        this.f19791k = str;
    }

    /* renamed from: g */
    public void m17304g(Map<String, Object> map) {
        this.f19794n = map;
    }

    /* renamed from: h */
    public void m17303h(String str) {
        this.f19792l = str;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19791k != null) {
            z0Var.m16753z0("name").m16918f0(this.f19791k);
        }
        if (this.f19792l != null) {
            z0Var.m16753z0("version").m16918f0(this.f19792l);
        }
        if (this.f19793m != null) {
            z0Var.m16753z0("raw_description").m16918f0(this.f19793m);
        }
        Map<String, Object> map = this.f19794n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19794n.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }
}
