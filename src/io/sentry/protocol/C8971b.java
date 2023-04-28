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

/* renamed from: io.sentry.protocol.b */
/* loaded from: classes8.dex */
public final class C8971b implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19698k;

    /* renamed from: l */
    private String f19699l;

    /* renamed from: m */
    private Map<String, Object> f19700m;

    /* renamed from: io.sentry.protocol.b$a */
    /* loaded from: classes8.dex */
    public static final class C8972a implements AbstractC9030r0<C8971b> {
        /* renamed from: b */
        public C8971b mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C8971b bVar = new C8971b();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                if (S.equals("name")) {
                    bVar.f19698k = x0Var.m16801Z0();
                } else if (!S.equals("version")) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    x0Var.m16799b1(g0Var, concurrentHashMap, S);
                } else {
                    bVar.f19699l = x0Var.m16801Z0();
                }
            }
            bVar.m17507c(concurrentHashMap);
            x0Var.m16934p();
            return bVar;
        }
    }

    public C8971b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8971b(C8971b bVar) {
        this.f19698k = bVar.f19698k;
        this.f19699l = bVar.f19699l;
        this.f19700m = C9098a.m17024b(bVar.f19700m);
    }

    /* renamed from: c */
    public void m17507c(Map<String, Object> map) {
        this.f19700m = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19698k != null) {
            z0Var.m16753z0("name").m16918f0(this.f19698k);
        }
        if (this.f19699l != null) {
            z0Var.m16753z0("version").m16918f0(this.f19699l);
        }
        Map<String, Object> map = this.f19700m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19700m.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }
}
