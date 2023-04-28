package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.EnumC8942n3;
import io.sentry.protocol.C9003q;
import io.sentry.util.C9111k;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.protocol.n */
/* loaded from: classes8.dex */
public final class C8997n implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19774k;

    /* renamed from: l */
    private String f19775l;

    /* renamed from: m */
    private List<C9003q> f19776m;

    /* renamed from: n */
    private List<String> f19777n;

    /* renamed from: o */
    private Map<String, Object> f19778o;

    /* renamed from: io.sentry.protocol.n$a */
    /* loaded from: classes8.dex */
    public static final class C8998a implements AbstractC9030r0<C8997n> {
        /* renamed from: b */
        public C8997n mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            x0Var.m16940g();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case 3373707:
                        if (S.equals("name")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 351608024:
                        if (S.equals("version")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 750867693:
                        if (S.equals("packages")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1487029535:
                        if (S.equals("integrations")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str = x0Var.m16941f0();
                        break;
                    case 1:
                        str2 = x0Var.m16941f0();
                        break;
                    case 2:
                        List U0 = x0Var.m16806U0(g0Var, new C9003q.C9004a());
                        if (U0 == null) {
                            break;
                        } else {
                            arrayList.addAll(U0);
                            break;
                        }
                    case 3:
                        List list = (List) x0Var.m16803X0();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
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
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                g0Var.mo17723b(EnumC8942n3.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            } else if (str2 != null) {
                C8997n nVar = new C8997n(str, str2);
                nVar.f19776m = arrayList;
                nVar.f19777n = arrayList2;
                nVar.m17337j(hashMap);
                return nVar;
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                g0Var.mo17723b(EnumC8942n3.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
        }
    }

    public C8997n(String str, String str2) {
        this.f19774k = (String) C9111k.m16995a(str, "name is required.");
        this.f19775l = (String) C9111k.m16995a(str2, "version is required.");
    }

    /* renamed from: l */
    public static C8997n m17335l(C8997n nVar, String str, String str2) {
        C9111k.m16995a(str, "name is required.");
        C9111k.m16995a(str2, "version is required.");
        if (nVar == null) {
            return new C8997n(str, str2);
        }
        nVar.m17338i(str);
        nVar.m17336k(str2);
        return nVar;
    }

    /* renamed from: c */
    public void m17344c(String str) {
        C9111k.m16995a(str, "integration is required.");
        if (this.f19777n == null) {
            this.f19777n = new ArrayList();
        }
        this.f19777n.add(str);
    }

    /* renamed from: d */
    public void m17343d(String str, String str2) {
        C9111k.m16995a(str, "name is required.");
        C9111k.m16995a(str2, "version is required.");
        C9003q qVar = new C9003q(str, str2);
        if (this.f19776m == null) {
            this.f19776m = new ArrayList();
        }
        this.f19776m.add(qVar);
    }

    /* renamed from: e */
    public List<String> m17342e() {
        return this.f19777n;
    }

    /* renamed from: f */
    public String m17341f() {
        return this.f19774k;
    }

    /* renamed from: g */
    public List<C9003q> m17340g() {
        return this.f19776m;
    }

    /* renamed from: h */
    public String m17339h() {
        return this.f19775l;
    }

    /* renamed from: i */
    public void m17338i(String str) {
        this.f19774k = (String) C9111k.m16995a(str, "name is required.");
    }

    /* renamed from: j */
    public void m17337j(Map<String, Object> map) {
        this.f19778o = map;
    }

    /* renamed from: k */
    public void m17336k(String str) {
        this.f19775l = (String) C9111k.m16995a(str, "version is required.");
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("name").m16918f0(this.f19774k);
        z0Var.m16753z0("version").m16918f0(this.f19775l);
        List<C9003q> list = this.f19776m;
        if (list != null && !list.isEmpty()) {
            z0Var.m16753z0("packages").m16754F0(g0Var, this.f19776m);
        }
        List<String> list2 = this.f19777n;
        if (list2 != null && !list2.isEmpty()) {
            z0Var.m16753z0("integrations").m16754F0(g0Var, this.f19777n);
        }
        Map<String, Object> map = this.f19778o;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f19778o.get(str));
            }
        }
        z0Var.m16911p();
    }
}
