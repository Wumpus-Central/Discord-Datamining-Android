package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.EnumC8942n3;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.g */
/* loaded from: classes8.dex */
public final class C8983g implements AbstractC8806b1 {

    /* renamed from: k */
    private final Number f19730k;

    /* renamed from: l */
    private final String f19731l;

    /* renamed from: m */
    private Map<String, Object> f19732m;

    /* renamed from: io.sentry.protocol.g$a */
    /* loaded from: classes8.dex */
    public static final class C8984a implements AbstractC9030r0<C8983g> {
        /* renamed from: b */
        public C8983g mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            Number number = null;
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                if (S.equals("unit")) {
                    str = x0Var.m16801Z0();
                } else if (!S.equals("value")) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    x0Var.m16799b1(g0Var, concurrentHashMap, S);
                } else {
                    number = (Number) x0Var.m16803X0();
                }
            }
            x0Var.m16934p();
            if (number != null) {
                C8983g gVar = new C8983g(number, str);
                gVar.m17405a(concurrentHashMap);
                return gVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            g0Var.mo17723b(EnumC8942n3.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C8983g(Number number, String str) {
        this.f19730k = number;
        this.f19731l = str;
    }

    /* renamed from: a */
    public void m17405a(Map<String, Object> map) {
        this.f19732m = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("value").m16919b0(this.f19730k);
        if (this.f19731l != null) {
            z0Var.m16753z0("unit").m16918f0(this.f19731l);
        }
        Map<String, Object> map = this.f19732m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19732m.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }
}
