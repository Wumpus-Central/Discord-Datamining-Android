package io.sentry.profilemeasurements;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Map;
import java.util.Objects;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.profilemeasurements.b */
/* loaded from: classes8.dex */
public final class C8967b implements AbstractC8806b1 {

    /* renamed from: k */
    private Map<String, Object> f19686k;

    /* renamed from: l */
    private String f19687l;

    /* renamed from: m */
    private double f19688m;

    /* renamed from: io.sentry.profilemeasurements.b$a */
    /* loaded from: classes8.dex */
    public static final class C8968a implements AbstractC9030r0<C8967b> {
        /* renamed from: b */
        public C8967b mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C8967b bVar = new C8967b();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                if (S.equals("elapsed_since_start_ns")) {
                    String Z0 = x0Var.m16801Z0();
                    if (Z0 != null) {
                        bVar.f19687l = Z0;
                    }
                } else if (!S.equals("value")) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    x0Var.m16799b1(g0Var, concurrentHashMap, S);
                } else {
                    Double Q0 = x0Var.m16810Q0();
                    if (Q0 != null) {
                        bVar.f19688m = Q0.doubleValue();
                    }
                }
            }
            bVar.m17528c(concurrentHashMap);
            x0Var.m16934p();
            return bVar;
        }
    }

    public C8967b() {
        this(0L, 0);
    }

    /* renamed from: c */
    public void m17528c(Map<String, Object> map) {
        this.f19686k = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8967b.class != obj.getClass()) {
            return false;
        }
        C8967b bVar = (C8967b) obj;
        if (!Objects.equals(this.f19686k, bVar.f19686k) || !this.f19687l.equals(bVar.f19687l) || this.f19688m != bVar.f19688m) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.f19686k, this.f19687l, Double.valueOf(this.f19688m));
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("value").m16754F0(g0Var, Double.valueOf(this.f19688m));
        z0Var.m16753z0("elapsed_since_start_ns").m16754F0(g0Var, this.f19687l);
        Map<String, Object> map = this.f19686k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19686k.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    public C8967b(Long l, Number number) {
        this.f19687l = l.toString();
        this.f19688m = number.doubleValue();
    }
}
