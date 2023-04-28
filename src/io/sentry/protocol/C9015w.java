package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC8926l2;
import io.sentry.AbstractC9030r0;
import io.sentry.C8809b4;
import io.sentry.C8815c4;
import io.sentry.C8875h;
import io.sentry.C8937m4;
import io.sentry.C9141w3;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.protocol.C8983g;
import io.sentry.protocol.C9007s;
import io.sentry.protocol.C9017x;
import io.sentry.util.C9111k;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.w */
/* loaded from: classes8.dex */
public final class C9015w extends AbstractC8926l2 implements AbstractC8806b1 {

    /* renamed from: A */
    private Double f38700A;

    /* renamed from: B */
    private final List<C9007s> f38701B;

    /* renamed from: C */
    private final String f38702C;

    /* renamed from: D */
    private final Map<String, C8983g> f38703D;

    /* renamed from: E */
    private C9017x f38704E;

    /* renamed from: F */
    private Map<String, Object> f38705F;

    /* renamed from: y */
    private String f19835y;

    /* renamed from: z */
    private Double f19836z;

    /* renamed from: io.sentry.protocol.w$a */
    /* loaded from: classes8.dex */
    public static final class C9016a implements AbstractC9030r0<C9015w> {
        /* renamed from: b */
        public C9015w mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C9015w wVar = new C9015w("", Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new C9017x(EnumC9019y.CUSTOM.apiName()));
            AbstractC8926l2.C8927a aVar = new AbstractC8926l2.C8927a();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1526966919:
                        if (S.equals("start_timestamp")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -362243017:
                        if (S.equals("measurements")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3575610:
                        if (S.equals("type")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 55126294:
                        if (S.equals("timestamp")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 109638249:
                        if (S.equals("spans")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 508716399:
                        if (S.equals("transaction_info")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 2141246174:
                        if (S.equals("transaction")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        try {
                            Double Q0 = x0Var.m16810Q0();
                            if (Q0 == null) {
                                break;
                            } else {
                                wVar.f19836z = Q0;
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            Date P0 = x0Var.m16811P0(g0Var);
                            if (P0 == null) {
                                break;
                            } else {
                                wVar.f19836z = Double.valueOf(C8875h.m17847a(P0));
                                break;
                            }
                        }
                    case 1:
                        Map W0 = x0Var.m16804W0(g0Var, new C8983g.C8984a());
                        if (W0 == null) {
                            break;
                        } else {
                            wVar.f38703D.putAll(W0);
                            break;
                        }
                    case 2:
                        x0Var.m16941f0();
                        break;
                    case 3:
                        try {
                            Double Q02 = x0Var.m16810Q0();
                            if (Q02 == null) {
                                break;
                            } else {
                                wVar.f38700A = Q02;
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            Date P02 = x0Var.m16811P0(g0Var);
                            if (P02 == null) {
                                break;
                            } else {
                                wVar.f38700A = Double.valueOf(C8875h.m17847a(P02));
                                break;
                            }
                        }
                    case 4:
                        List U0 = x0Var.m16806U0(g0Var, new C9007s.C9008a());
                        if (U0 == null) {
                            break;
                        } else {
                            wVar.f38701B.addAll(U0);
                            break;
                        }
                    case 5:
                        wVar.f38704E = new C9017x.C9018a().mo16758a(x0Var, g0Var);
                        break;
                    case 6:
                        wVar.f19835y = x0Var.m16801Z0();
                        break;
                    default:
                        if (!aVar.m17615a(wVar, S, x0Var, g0Var)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            x0Var.m16799b1(g0Var, concurrentHashMap, S);
                            break;
                        } else {
                            break;
                        }
                }
            }
            wVar.m17235o0(concurrentHashMap);
            x0Var.m16934p();
            return wVar;
        }
    }

    public C9015w(C9141w3 w3Var) {
        super(w3Var.mo16838f());
        this.f38701B = new ArrayList();
        this.f38702C = "transaction";
        this.f38703D = new HashMap();
        C9111k.m16995a(w3Var, "sentryTracer is required");
        this.f19836z = Double.valueOf(C8875h.m17847a(w3Var.m16855C()));
        this.f38700A = w3Var.m16857A();
        this.f19835y = w3Var.getName();
        for (C8809b4 b4Var : w3Var.m16820x()) {
            if (Boolean.TRUE.equals(b4Var.m18038D())) {
                this.f38701B.add(new C9007s(b4Var));
            }
        }
        C8973c B = m17668B();
        B.putAll(w3Var.m16819y());
        C8815c4 m = w3Var.mo16831m();
        B.m17493n(new C8815c4(m.m17987j(), m.m17990g(), m.m17994c(), m.m17995b(), m.m17996a(), m.m17991f(), m.m17989h()));
        for (Map.Entry<String, String> entry : m.m17988i().entrySet()) {
            m17644Z(entry.getKey(), entry.getValue());
        }
        Map<String, Object> z = w3Var.m16818z();
        if (z != null) {
            for (Map.Entry<String, Object> entry2 : z.entrySet()) {
                m17651S(entry2.getKey(), entry2.getValue());
            }
        }
        this.f38704E = new C9017x(w3Var.mo16836h().apiName());
    }

    /* renamed from: i0 */
    private BigDecimal m17241i0(Double d) {
        return BigDecimal.valueOf(d.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    /* renamed from: j0 */
    public Map<String, C8983g> m17240j0() {
        return this.f38703D;
    }

    /* renamed from: k0 */
    public C8937m4 m17239k0() {
        C8815c4 f = m17668B().m17501f();
        if (f == null) {
            return null;
        }
        return f.m17991f();
    }

    /* renamed from: l0 */
    public List<C9007s> m17238l0() {
        return this.f38701B;
    }

    /* renamed from: m0 */
    public boolean m17237m0() {
        return this.f38700A != null;
    }

    /* renamed from: n0 */
    public boolean m17236n0() {
        C8937m4 k0 = m17239k0();
        if (k0 == null) {
            return false;
        }
        return k0.m17598c().booleanValue();
    }

    /* renamed from: o0 */
    public void m17235o0(Map<String, Object> map) {
        this.f38705F = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19835y != null) {
            z0Var.m16753z0("transaction").m16918f0(this.f19835y);
        }
        z0Var.m16753z0("start_timestamp").m16754F0(g0Var, m17241i0(this.f19836z));
        if (this.f38700A != null) {
            z0Var.m16753z0("timestamp").m16754F0(g0Var, m17241i0(this.f38700A));
        }
        if (!this.f38701B.isEmpty()) {
            z0Var.m16753z0("spans").m16754F0(g0Var, this.f38701B);
        }
        z0Var.m16753z0("type").m16918f0("transaction");
        if (!this.f38703D.isEmpty()) {
            z0Var.m16753z0("measurements").m16754F0(g0Var, this.f38703D);
        }
        z0Var.m16753z0("transaction_info").m16754F0(g0Var, this.f38704E);
        new AbstractC8926l2.C8928b().m17614a(this, z0Var, g0Var);
        Map<String, Object> map = this.f38705F;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f38705F.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    public C9015w(String str, Double d, Double d2, List<C9007s> list, Map<String, C8983g> map, C9017x xVar) {
        ArrayList arrayList = new ArrayList();
        this.f38701B = arrayList;
        this.f38702C = "transaction";
        HashMap hashMap = new HashMap();
        this.f38703D = hashMap;
        this.f19835y = str;
        this.f19836z = d;
        this.f38700A = d2;
        arrayList.addAll(list);
        hashMap.putAll(map);
        this.f38704E = xVar;
    }
}
