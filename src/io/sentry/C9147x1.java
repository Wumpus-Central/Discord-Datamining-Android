package io.sentry;

import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Map;
import java.util.Objects;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.x1 */
/* loaded from: classes8.dex */
public final class C9147x1 implements AbstractC8806b1 {

    /* renamed from: k */
    private String f20078k;

    /* renamed from: l */
    private String f20079l;

    /* renamed from: m */
    private String f20080m;

    /* renamed from: n */
    private Long f20081n;

    /* renamed from: o */
    private Long f20082o;

    /* renamed from: p */
    private Long f20083p;

    /* renamed from: q */
    private Long f20084q;

    /* renamed from: r */
    private Map<String, Object> f20085r;

    /* renamed from: io.sentry.x1$a */
    /* loaded from: classes8.dex */
    public static final class C9148a implements AbstractC9030r0<C9147x1> {
        /* renamed from: b */
        public C9147x1 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C9147x1 x1Var = new C9147x1();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -112372011:
                        if (S.equals("relative_start_ns")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -84607876:
                        if (S.equals("relative_end_ns")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3355:
                        if (S.equals("id")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3373707:
                        if (S.equals("name")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (S.equals("trace_id")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1566648660:
                        if (S.equals("relative_cpu_end_ms")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1902256621:
                        if (S.equals("relative_cpu_start_ms")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        Long V0 = x0Var.m16805V0();
                        if (V0 == null) {
                            break;
                        } else {
                            x1Var.f20081n = V0;
                            break;
                        }
                    case 1:
                        Long V02 = x0Var.m16805V0();
                        if (V02 == null) {
                            break;
                        } else {
                            x1Var.f20082o = V02;
                            break;
                        }
                    case 2:
                        String Z0 = x0Var.m16801Z0();
                        if (Z0 == null) {
                            break;
                        } else {
                            x1Var.f20078k = Z0;
                            break;
                        }
                    case 3:
                        String Z02 = x0Var.m16801Z0();
                        if (Z02 == null) {
                            break;
                        } else {
                            x1Var.f20080m = Z02;
                            break;
                        }
                    case 4:
                        String Z03 = x0Var.m16801Z0();
                        if (Z03 == null) {
                            break;
                        } else {
                            x1Var.f20079l = Z03;
                            break;
                        }
                    case 5:
                        Long V03 = x0Var.m16805V0();
                        if (V03 == null) {
                            break;
                        } else {
                            x1Var.f20084q = V03;
                            break;
                        }
                    case 6:
                        Long V04 = x0Var.m16805V0();
                        if (V04 == null) {
                            break;
                        } else {
                            x1Var.f20083p = V04;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            x1Var.m16790i(concurrentHashMap);
            x0Var.m16934p();
            return x1Var;
        }
    }

    public C9147x1() {
        this(C8947o1.m17586n(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9147x1.class != obj.getClass()) {
            return false;
        }
        C9147x1 x1Var = (C9147x1) obj;
        if (!this.f20078k.equals(x1Var.f20078k) || !this.f20079l.equals(x1Var.f20079l) || !this.f20080m.equals(x1Var.f20080m) || !this.f20081n.equals(x1Var.f20081n) || !this.f20083p.equals(x1Var.f20083p) || !Objects.equals(this.f20084q, x1Var.f20084q) || !Objects.equals(this.f20082o, x1Var.f20082o) || !Objects.equals(this.f20085r, x1Var.f20085r)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void m16791h(Long l, Long l2, Long l3, Long l4) {
        if (this.f20082o == null) {
            this.f20082o = Long.valueOf(l.longValue() - l2.longValue());
            this.f20081n = Long.valueOf(this.f20081n.longValue() - l2.longValue());
            this.f20084q = Long.valueOf(l3.longValue() - l4.longValue());
            this.f20083p = Long.valueOf(this.f20083p.longValue() - l4.longValue());
        }
    }

    public int hashCode() {
        return Objects.hash(this.f20078k, this.f20079l, this.f20080m, this.f20081n, this.f20082o, this.f20083p, this.f20084q, this.f20085r);
    }

    /* renamed from: i */
    public void m16790i(Map<String, Object> map) {
        this.f20085r = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("id").m16754F0(g0Var, this.f20078k);
        z0Var.m16753z0("trace_id").m16754F0(g0Var, this.f20079l);
        z0Var.m16753z0("name").m16754F0(g0Var, this.f20080m);
        z0Var.m16753z0("relative_start_ns").m16754F0(g0Var, this.f20081n);
        z0Var.m16753z0("relative_end_ns").m16754F0(g0Var, this.f20082o);
        z0Var.m16753z0("relative_cpu_start_ms").m16754F0(g0Var, this.f20083p);
        z0Var.m16753z0("relative_cpu_end_ms").m16754F0(g0Var, this.f20084q);
        Map<String, Object> map = this.f20085r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f20085r.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    public C9147x1(AbstractC8932m0 m0Var, Long l, Long l2) {
        this.f20078k = m0Var.mo16838f().toString();
        this.f20079l = m0Var.mo16831m().m17987j().toString();
        this.f20080m = m0Var.getName();
        this.f20081n = l;
        this.f20083p = l2;
    }
}
