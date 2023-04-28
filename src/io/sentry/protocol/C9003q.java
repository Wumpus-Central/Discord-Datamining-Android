package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.EnumC8942n3;
import io.sentry.util.C9111k;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.protocol.q */
/* loaded from: classes8.dex */
public final class C9003q implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19788k;

    /* renamed from: l */
    private String f19789l;

    /* renamed from: m */
    private Map<String, Object> f19790m;

    /* renamed from: io.sentry.protocol.q$a */
    /* loaded from: classes8.dex */
    public static final class C9004a implements AbstractC9030r0<C9003q> {
        /* renamed from: b */
        public C9003q mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                if (S.equals("name")) {
                    str = x0Var.m16941f0();
                } else if (!S.equals("version")) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    x0Var.m16799b1(g0Var, hashMap, S);
                } else {
                    str2 = x0Var.m16941f0();
                }
            }
            x0Var.m16934p();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                g0Var.mo17723b(EnumC8942n3.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            } else if (str2 != null) {
                C9003q qVar = new C9003q(str, str2);
                qVar.m17312c(hashMap);
                return qVar;
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                g0Var.mo17723b(EnumC8942n3.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
        }
    }

    public C9003q(String str, String str2) {
        this.f19788k = (String) C9111k.m16995a(str, "name is required.");
        this.f19789l = (String) C9111k.m16995a(str2, "version is required.");
    }

    /* renamed from: a */
    public String m17314a() {
        return this.f19788k;
    }

    /* renamed from: b */
    public String m17313b() {
        return this.f19789l;
    }

    /* renamed from: c */
    public void m17312c(Map<String, Object> map) {
        this.f19790m = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("name").m16918f0(this.f19788k);
        z0Var.m16753z0("version").m16918f0(this.f19789l);
        Map<String, Object> map = this.f19790m;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f19790m.get(str));
            }
        }
        z0Var.m16911p();
    }
}
