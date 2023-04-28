package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.util.C9098a;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.protocol.h */
/* loaded from: classes8.dex */
public final class C8985h implements AbstractC8806b1 {

    /* renamed from: k */
    private final transient Thread f19733k;

    /* renamed from: l */
    private String f19734l;

    /* renamed from: m */
    private String f19735m;

    /* renamed from: n */
    private String f19736n;

    /* renamed from: o */
    private Boolean f19737o;

    /* renamed from: p */
    private Map<String, Object> f19738p;

    /* renamed from: q */
    private Map<String, Object> f19739q;

    /* renamed from: r */
    private Boolean f19740r;

    /* renamed from: s */
    private Map<String, Object> f19741s;

    /* renamed from: io.sentry.protocol.h$a */
    /* loaded from: classes8.dex */
    public static final class C8986a implements AbstractC9030r0<C8985h> {
        /* renamed from: b */
        public C8985h mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            C8985h hVar = new C8985h();
            x0Var.m16940g();
            HashMap hashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1724546052:
                        if (S.equals("description")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3076010:
                        if (S.equals("data")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3347973:
                        if (S.equals("meta")) {
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
                    case 692803388:
                        if (S.equals("handled")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 989128517:
                        if (S.equals("synthetic")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1297152568:
                        if (S.equals("help_link")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        hVar.f19735m = x0Var.m16801Z0();
                        break;
                    case 1:
                        hVar.f19739q = C9098a.m17024b((Map) x0Var.m16803X0());
                        break;
                    case 2:
                        hVar.f19738p = C9098a.m17024b((Map) x0Var.m16803X0());
                        break;
                    case 3:
                        hVar.f19734l = x0Var.m16801Z0();
                        break;
                    case 4:
                        hVar.f19737o = x0Var.m16812O0();
                        break;
                    case 5:
                        hVar.f19740r = x0Var.m16812O0();
                        break;
                    case 6:
                        hVar.f19736n = x0Var.m16801Z0();
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
            hVar.m17393k(hashMap);
            return hVar;
        }
    }

    public C8985h() {
        this(null);
    }

    /* renamed from: h */
    public Boolean m17396h() {
        return this.f19737o;
    }

    /* renamed from: i */
    public void m17395i(Boolean bool) {
        this.f19737o = bool;
    }

    /* renamed from: j */
    public void m17394j(String str) {
        this.f19734l = str;
    }

    /* renamed from: k */
    public void m17393k(Map<String, Object> map) {
        this.f19741s = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19734l != null) {
            z0Var.m16753z0("type").m16918f0(this.f19734l);
        }
        if (this.f19735m != null) {
            z0Var.m16753z0("description").m16918f0(this.f19735m);
        }
        if (this.f19736n != null) {
            z0Var.m16753z0("help_link").m16918f0(this.f19736n);
        }
        if (this.f19737o != null) {
            z0Var.m16753z0("handled").m16921Y(this.f19737o);
        }
        if (this.f19738p != null) {
            z0Var.m16753z0("meta").m16754F0(g0Var, this.f19738p);
        }
        if (this.f19739q != null) {
            z0Var.m16753z0("data").m16754F0(g0Var, this.f19739q);
        }
        if (this.f19740r != null) {
            z0Var.m16753z0("synthetic").m16921Y(this.f19740r);
        }
        Map<String, Object> map = this.f19741s;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f19741s.get(str));
            }
        }
        z0Var.m16911p();
    }

    public C8985h(Thread thread) {
        this.f19733k = thread;
    }
}
