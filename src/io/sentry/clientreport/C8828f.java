package io.sentry.clientreport;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.EnumC8942n3;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.clientreport.f */
/* loaded from: classes8.dex */
public final class C8828f implements AbstractC8806b1 {

    /* renamed from: k */
    private final String f19509k;

    /* renamed from: l */
    private final String f19510l;

    /* renamed from: m */
    private final Long f19511m;

    /* renamed from: n */
    private Map<String, Object> f19512n;

    /* renamed from: io.sentry.clientreport.f$a */
    /* loaded from: classes8.dex */
    public static final class C8829a implements AbstractC9030r0<C8828f> {
        /* renamed from: c */
        private Exception m17941c(String str, AbstractC8869g0 g0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            g0Var.mo17723b(EnumC8942n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* renamed from: b */
        public C8828f mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            String str = null;
            String str2 = null;
            Long l = null;
            HashMap hashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1285004149:
                        if (S.equals("quantity")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -934964668:
                        if (S.equals("reason")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 50511102:
                        if (S.equals("category")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        l = x0Var.m16805V0();
                        break;
                    case 1:
                        str = x0Var.m16801Z0();
                        break;
                    case 2:
                        str2 = x0Var.m16801Z0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        x0Var.m16799b1(g0Var, hashMap, S);
                        break;
                }
            }
            x0Var.m16934p();
            if (str == null) {
                throw m17941c("reason", g0Var);
            } else if (str2 == null) {
                throw m17941c("category", g0Var);
            } else if (l != null) {
                C8828f fVar = new C8828f(str, str2, l);
                fVar.m17943d(hashMap);
                return fVar;
            } else {
                throw m17941c("quantity", g0Var);
            }
        }
    }

    public C8828f(String str, String str2, Long l) {
        this.f19509k = str;
        this.f19510l = str2;
        this.f19511m = l;
    }

    /* renamed from: a */
    public String m17946a() {
        return this.f19510l;
    }

    /* renamed from: b */
    public Long m17945b() {
        return this.f19511m;
    }

    /* renamed from: c */
    public String m17944c() {
        return this.f19509k;
    }

    /* renamed from: d */
    public void m17943d(Map<String, Object> map) {
        this.f19512n = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("reason").m16918f0(this.f19509k);
        z0Var.m16753z0("category").m16918f0(this.f19510l);
        z0Var.m16753z0("quantity").m16919b0(this.f19511m);
        Map<String, Object> map = this.f19512n;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f19512n.get(str));
            }
        }
        z0Var.m16911p();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f19509k + "', category='" + this.f19510l + "', quantity=" + this.f19511m + '}';
    }
}
