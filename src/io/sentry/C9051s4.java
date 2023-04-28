package io.sentry;

import io.sentry.protocol.C9001p;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.s4 */
/* loaded from: classes8.dex */
public final class C9051s4 implements AbstractC8806b1 {

    /* renamed from: k */
    private final C9001p f19892k;

    /* renamed from: l */
    private String f19893l;

    /* renamed from: m */
    private String f19894m;

    /* renamed from: n */
    private String f19895n;

    /* renamed from: o */
    private Map<String, Object> f19896o;

    /* renamed from: io.sentry.s4$a */
    /* loaded from: classes8.dex */
    public static final class C9052a implements AbstractC9030r0<C9051s4> {
        /* renamed from: b */
        public C9051s4 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C9001p pVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            HashMap hashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -602415628:
                        if (S.equals("comments")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3373707:
                        if (S.equals("name")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 96619420:
                        if (S.equals("email")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 278118624:
                        if (S.equals("event_id")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str3 = x0Var.m16801Z0();
                        break;
                    case 1:
                        str = x0Var.m16801Z0();
                        break;
                    case 2:
                        str2 = x0Var.m16801Z0();
                        break;
                    case 3:
                        pVar = new C9001p.C9002a().mo16758a(x0Var, g0Var);
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
            if (pVar != null) {
                C9051s4 s4Var = new C9051s4(pVar, str, str2, str3);
                s4Var.m17166a(hashMap);
                return s4Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            g0Var.mo17723b(EnumC8942n3.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C9051s4(C9001p pVar, String str, String str2, String str3) {
        this.f19892k = pVar;
        this.f19893l = str;
        this.f19894m = str2;
        this.f19895n = str3;
    }

    /* renamed from: a */
    public void m17166a(Map<String, Object> map) {
        this.f19896o = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("event_id");
        this.f19892k.serialize(z0Var, g0Var);
        if (this.f19893l != null) {
            z0Var.m16753z0("name").m16918f0(this.f19893l);
        }
        if (this.f19894m != null) {
            z0Var.m16753z0("email").m16918f0(this.f19894m);
        }
        if (this.f19895n != null) {
            z0Var.m16753z0("comments").m16918f0(this.f19895n);
        }
        Map<String, Object> map = this.f19896o;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f19896o.get(str));
            }
        }
        z0Var.m16911p();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f19892k + ", name='" + this.f19893l + "', email='" + this.f19894m + "', comments='" + this.f19895n + "'}";
    }
}
