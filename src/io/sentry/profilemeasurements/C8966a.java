package io.sentry.profilemeasurements;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.profilemeasurements.C8967b;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.profilemeasurements.a */
/* loaded from: classes8.dex */
public final class C8966a implements AbstractC8806b1 {

    /* renamed from: k */
    private Map<String, Object> f19683k;

    /* renamed from: l */
    private String f19684l;

    /* renamed from: m */
    private Collection<C8967b> f19685m;

    /* renamed from: io.sentry.profilemeasurements.a$a */
    /* loaded from: classes8.dex */
    public static final class C0277a implements AbstractC9030r0<C8966a> {
        /* renamed from: b */
        public C8966a mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C8966a aVar = new C8966a();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                if (S.equals("values")) {
                    List U0 = x0Var.m16806U0(g0Var, new C8967b.C8968a());
                    if (U0 != null) {
                        aVar.f19685m = U0;
                    }
                } else if (!S.equals("unit")) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    x0Var.m16799b1(g0Var, concurrentHashMap, S);
                } else {
                    String Z0 = x0Var.m16801Z0();
                    if (Z0 != null) {
                        aVar.f19684l = Z0;
                    }
                }
            }
            aVar.m17532c(concurrentHashMap);
            x0Var.m16934p();
            return aVar;
        }
    }

    public C8966a() {
        this("unknown", new ArrayList());
    }

    /* renamed from: c */
    public void m17532c(Map<String, Object> map) {
        this.f19683k = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8966a.class != obj.getClass()) {
            return false;
        }
        C8966a aVar = (C8966a) obj;
        if (!Objects.equals(this.f19683k, aVar.f19683k) || !this.f19684l.equals(aVar.f19684l) || !new ArrayList(this.f19685m).equals(new ArrayList(aVar.f19685m))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.f19683k, this.f19684l, this.f19685m);
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("unit").m16754F0(g0Var, this.f19684l);
        z0Var.m16753z0("values").m16754F0(g0Var, this.f19685m);
        Map<String, Object> map = this.f19683k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19683k.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    public C8966a(String str, Collection<C8967b> collection) {
        this.f19684l = str;
        this.f19685m = collection;
    }
}
