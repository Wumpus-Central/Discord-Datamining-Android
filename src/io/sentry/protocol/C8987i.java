package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.List;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.i */
/* loaded from: classes8.dex */
public final class C8987i implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19742k;

    /* renamed from: l */
    private String f19743l;

    /* renamed from: m */
    private List<String> f19744m;

    /* renamed from: n */
    private Map<String, Object> f19745n;

    /* renamed from: io.sentry.protocol.i$a */
    /* loaded from: classes8.dex */
    public static final class C8988a implements AbstractC9030r0<C8987i> {
        /* renamed from: b */
        public C8987i mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C8987i iVar = new C8987i();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -995427962:
                        if (S.equals("params")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 954925063:
                        if (S.equals("message")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1811591356:
                        if (S.equals("formatted")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        List list = (List) x0Var.m16803X0();
                        if (list == null) {
                            break;
                        } else {
                            iVar.f19744m = list;
                            break;
                        }
                    case 1:
                        iVar.f19743l = x0Var.m16801Z0();
                        break;
                    case 2:
                        iVar.f19742k = x0Var.m16801Z0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            iVar.m17387e(concurrentHashMap);
            x0Var.m16934p();
            return iVar;
        }
    }

    /* renamed from: d */
    public void m17388d(String str) {
        this.f19742k = str;
    }

    /* renamed from: e */
    public void m17387e(Map<String, Object> map) {
        this.f19745n = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19742k != null) {
            z0Var.m16753z0("formatted").m16918f0(this.f19742k);
        }
        if (this.f19743l != null) {
            z0Var.m16753z0("message").m16918f0(this.f19743l);
        }
        List<String> list = this.f19744m;
        if (list != null && !list.isEmpty()) {
            z0Var.m16753z0("params").m16754F0(g0Var, this.f19744m);
        }
        Map<String, Object> map = this.f19745n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19745n.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }
}
