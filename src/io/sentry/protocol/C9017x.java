package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.x */
/* loaded from: classes8.dex */
public final class C9017x implements AbstractC8806b1 {

    /* renamed from: k */
    private final String f19837k;

    /* renamed from: l */
    private Map<String, Object> f19838l;

    /* renamed from: io.sentry.protocol.x$a */
    /* loaded from: classes8.dex */
    public static final class C9018a implements AbstractC9030r0<C9017x> {
        /* renamed from: b */
        public C9017x mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                if (!S.equals("source")) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    x0Var.m16799b1(g0Var, concurrentHashMap, S);
                } else {
                    str = x0Var.m16801Z0();
                }
            }
            C9017x xVar = new C9017x(str);
            xVar.m17233a(concurrentHashMap);
            x0Var.m16934p();
            return xVar;
        }
    }

    public C9017x(String str) {
        this.f19837k = str;
    }

    /* renamed from: a */
    public void m17233a(Map<String, Object> map) {
        this.f19838l = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19837k != null) {
            z0Var.m16753z0("source").m16754F0(g0Var, this.f19837k);
        }
        Map<String, Object> map = this.f19838l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19838l.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }
}
