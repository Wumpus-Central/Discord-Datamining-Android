package io.sentry;

import io.sentry.EnumC8935m3;
import io.sentry.util.C9111k;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: io.sentry.i3 */
/* loaded from: classes8.dex */
public final class C8897i3 implements AbstractC8806b1 {

    /* renamed from: k */
    private final String f19578k;

    /* renamed from: l */
    private final String f19579l;

    /* renamed from: m */
    private final EnumC8935m3 f19580m;

    /* renamed from: n */
    private final int f19581n;

    /* renamed from: o */
    private final Callable<Integer> f19582o;

    /* renamed from: p */
    private final String f19583p;

    /* renamed from: q */
    private Map<String, Object> f19584q;

    /* renamed from: io.sentry.i3$a */
    /* loaded from: classes8.dex */
    public static final class C8898a implements AbstractC9030r0<C8897i3> {
        /* renamed from: c */
        private Exception m17760c(String str, AbstractC8869g0 g0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            g0Var.mo17723b(EnumC8942n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* renamed from: b */
        public C8897i3 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            HashMap hashMap = null;
            EnumC8935m3 m3Var = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1106363674:
                        if (S.equals("length")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -734768633:
                        if (S.equals("filename")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -672977706:
                        if (S.equals("attachment_type")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3575610:
                        if (S.equals("type")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 831846208:
                        if (S.equals("content_type")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        i = x0Var.m16948Q();
                        break;
                    case 1:
                        str2 = x0Var.m16801Z0();
                        break;
                    case 2:
                        str3 = x0Var.m16801Z0();
                        break;
                    case 3:
                        m3Var = (EnumC8935m3) x0Var.m16802Y0(g0Var, new EnumC8935m3.C8936a());
                        break;
                    case 4:
                        str = x0Var.m16801Z0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        x0Var.m16799b1(g0Var, hashMap, S);
                        break;
                }
            }
            if (m3Var != null) {
                C8897i3 i3Var = new C8897i3(m3Var, i, str, str2, str3);
                i3Var.m17762c(hashMap);
                x0Var.m16934p();
                return i3Var;
            }
            throw m17760c("type", g0Var);
        }
    }

    public C8897i3(EnumC8935m3 m3Var, int i, String str, String str2, String str3) {
        this.f19580m = (EnumC8935m3) C9111k.m16995a(m3Var, "type is required");
        this.f19578k = str;
        this.f19581n = i;
        this.f19579l = str2;
        this.f19582o = null;
        this.f19583p = str3;
    }

    /* renamed from: a */
    public int m17764a() {
        Callable<Integer> callable = this.f19582o;
        if (callable == null) {
            return this.f19581n;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public EnumC8935m3 m17763b() {
        return this.f19580m;
    }

    /* renamed from: c */
    public void m17762c(Map<String, Object> map) {
        this.f19584q = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19578k != null) {
            z0Var.m16753z0("content_type").m16918f0(this.f19578k);
        }
        if (this.f19579l != null) {
            z0Var.m16753z0("filename").m16918f0(this.f19579l);
        }
        z0Var.m16753z0("type").m16754F0(g0Var, this.f19580m);
        if (this.f19583p != null) {
            z0Var.m16753z0("attachment_type").m16918f0(this.f19583p);
        }
        z0Var.m16753z0("length").m16922U(m17764a());
        Map<String, Object> map = this.f19584q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19584q.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8897i3(EnumC8935m3 m3Var, Callable<Integer> callable, String str, String str2, String str3) {
        this.f19580m = (EnumC8935m3) C9111k.m16995a(m3Var, "type is required");
        this.f19578k = str;
        this.f19581n = -1;
        this.f19579l = str2;
        this.f19582o = callable;
        this.f19583p = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8897i3(EnumC8935m3 m3Var, Callable<Integer> callable, String str, String str2) {
        this(m3Var, callable, str, str2, (String) null);
    }
}
