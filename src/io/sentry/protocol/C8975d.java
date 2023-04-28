package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.protocol.C8995m;
import io.sentry.protocol.DebugImage;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.protocol.d */
/* loaded from: classes8.dex */
public final class C8975d implements AbstractC8806b1 {

    /* renamed from: k */
    private C8995m f19701k;

    /* renamed from: l */
    private List<DebugImage> f19702l;

    /* renamed from: m */
    private Map<String, Object> f19703m;

    /* renamed from: io.sentry.protocol.d$a */
    /* loaded from: classes8.dex */
    public static final class C8976a implements AbstractC9030r0<C8975d> {
        /* renamed from: b */
        public C8975d mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            C8975d dVar = new C8975d();
            x0Var.m16940g();
            HashMap hashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                if (S.equals("images")) {
                    dVar.f19702l = x0Var.m16806U0(g0Var, new DebugImage.C8969a());
                } else if (!S.equals("sdk_info")) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    x0Var.m16799b1(g0Var, hashMap, S);
                } else {
                    dVar.f19701k = (C8995m) x0Var.m16802Y0(g0Var, new C8995m.C8996a());
                }
            }
            x0Var.m16934p();
            dVar.m17486e(hashMap);
            return dVar;
        }
    }

    /* renamed from: c */
    public List<DebugImage> m17488c() {
        return this.f19702l;
    }

    /* renamed from: d */
    public void m17487d(List<DebugImage> list) {
        this.f19702l = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: e */
    public void m17486e(Map<String, Object> map) {
        this.f19703m = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19701k != null) {
            z0Var.m16753z0("sdk_info").m16754F0(g0Var, this.f19701k);
        }
        if (this.f19702l != null) {
            z0Var.m16753z0("images").m16754F0(g0Var, this.f19702l);
        }
        Map<String, Object> map = this.f19703m;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f19703m.get(str));
            }
        }
        z0Var.m16911p();
    }
}
