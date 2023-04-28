package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.protocol.m */
/* loaded from: classes8.dex */
public final class C8995m implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19769k;

    /* renamed from: l */
    private Integer f19770l;

    /* renamed from: m */
    private Integer f19771m;

    /* renamed from: n */
    private Integer f19772n;

    /* renamed from: o */
    private Map<String, Object> f19773o;

    /* renamed from: io.sentry.protocol.m$a */
    /* loaded from: classes8.dex */
    public static final class C8996a implements AbstractC9030r0<C8995m> {
        /* renamed from: b */
        public C8995m mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            C8995m mVar = new C8995m();
            x0Var.m16940g();
            HashMap hashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case 270207856:
                        if (S.equals("sdk_name")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 696101379:
                        if (S.equals("version_patchlevel")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1111241618:
                        if (S.equals("version_major")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1111483790:
                        if (S.equals("version_minor")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        mVar.f19769k = x0Var.m16801Z0();
                        break;
                    case 1:
                        mVar.f19772n = x0Var.m16807T0();
                        break;
                    case 2:
                        mVar.f19770l = x0Var.m16807T0();
                        break;
                    case 3:
                        mVar.f19771m = x0Var.m16807T0();
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
            mVar.m17348e(hashMap);
            return mVar;
        }
    }

    /* renamed from: e */
    public void m17348e(Map<String, Object> map) {
        this.f19773o = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19769k != null) {
            z0Var.m16753z0("sdk_name").m16918f0(this.f19769k);
        }
        if (this.f19770l != null) {
            z0Var.m16753z0("version_major").m16919b0(this.f19770l);
        }
        if (this.f19771m != null) {
            z0Var.m16753z0("version_minor").m16919b0(this.f19771m);
        }
        if (this.f19772n != null) {
            z0Var.m16753z0("version_patchlevel").m16919b0(this.f19772n);
        }
        Map<String, Object> map = this.f19773o;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f19773o.get(str));
            }
        }
        z0Var.m16911p();
    }
}
