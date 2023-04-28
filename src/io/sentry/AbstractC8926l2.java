package io.sentry;

import io.sentry.C8843d;
import io.sentry.exception.C8858a;
import io.sentry.protocol.C8973c;
import io.sentry.protocol.C8991k;
import io.sentry.protocol.C8997n;
import io.sentry.protocol.C9001p;
import io.sentry.protocol.C9020z;
import io.sentry.util.C9098a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.l2 */
/* loaded from: classes8.dex */
public abstract class AbstractC8926l2 {

    /* renamed from: k */
    private C9001p f19622k;

    /* renamed from: l */
    private final C8973c f19623l;

    /* renamed from: m */
    private C8997n f19624m;

    /* renamed from: n */
    private C8991k f19625n;

    /* renamed from: o */
    private Map<String, String> f19626o;

    /* renamed from: p */
    private String f19627p;

    /* renamed from: q */
    private String f19628q;

    /* renamed from: r */
    private String f19629r;

    /* renamed from: s */
    private C9020z f19630s;

    /* renamed from: t */
    protected transient Throwable f19631t;

    /* renamed from: u */
    private String f19632u;

    /* renamed from: v */
    private String f19633v;

    /* renamed from: w */
    private List<C8843d> f19634w;

    /* renamed from: x */
    private Map<String, Object> f19635x;

    /* renamed from: io.sentry.l2$a */
    /* loaded from: classes8.dex */
    public static final class C8927a {
        /* renamed from: a */
        public boolean m17615a(AbstractC8926l2 l2Var, String str, C9146x0 x0Var, AbstractC8869g0 g0Var) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -758770169:
                    if (str.equals("server_name")) {
                        c = 0;
                        break;
                    }
                    break;
                case -567312220:
                    if (str.equals("contexts")) {
                        c = 1;
                        break;
                    }
                    break;
                case -85904877:
                    if (str.equals("environment")) {
                        c = 2;
                        break;
                    }
                    break;
                case -51457840:
                    if (str.equals("breadcrumbs")) {
                        c = 3;
                        break;
                    }
                    break;
                case 113722:
                    if (str.equals("sdk")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3083686:
                    if (str.equals("dist")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        c = 7;
                        break;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 278118624:
                    if (str.equals("event_id")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1095692943:
                    if (str.equals("request")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1874684019:
                    if (str.equals("platform")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    l2Var.f19632u = x0Var.m16801Z0();
                    return true;
                case 1:
                    l2Var.f19623l.putAll(new C8973c.C8974a().mo16758a(x0Var, g0Var));
                    return true;
                case 2:
                    l2Var.f19628q = x0Var.m16801Z0();
                    return true;
                case 3:
                    l2Var.f19634w = x0Var.m16806U0(g0Var, new C8843d.C8844a());
                    return true;
                case 4:
                    l2Var.f19624m = (C8997n) x0Var.m16802Y0(g0Var, new C8997n.C8998a());
                    return true;
                case 5:
                    l2Var.f19633v = x0Var.m16801Z0();
                    return true;
                case 6:
                    l2Var.f19626o = C9098a.m17024b((Map) x0Var.m16803X0());
                    return true;
                case 7:
                    l2Var.f19630s = (C9020z) x0Var.m16802Y0(g0Var, new C9020z.C9021a());
                    return true;
                case '\b':
                    l2Var.f19635x = C9098a.m17024b((Map) x0Var.m16803X0());
                    return true;
                case '\t':
                    l2Var.f19622k = (C9001p) x0Var.m16802Y0(g0Var, new C9001p.C9002a());
                    return true;
                case '\n':
                    l2Var.f19627p = x0Var.m16801Z0();
                    return true;
                case 11:
                    l2Var.f19625n = (C8991k) x0Var.m16802Y0(g0Var, new C8991k.C8992a());
                    return true;
                case '\f':
                    l2Var.f19629r = x0Var.m16801Z0();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* renamed from: io.sentry.l2$b */
    /* loaded from: classes8.dex */
    public static final class C8928b {
        /* renamed from: a */
        public void m17614a(AbstractC8926l2 l2Var, C9161z0 z0Var, AbstractC8869g0 g0Var) {
            if (l2Var.f19622k != null) {
                z0Var.m16753z0("event_id").m16754F0(g0Var, l2Var.f19622k);
            }
            z0Var.m16753z0("contexts").m16754F0(g0Var, l2Var.f19623l);
            if (l2Var.f19624m != null) {
                z0Var.m16753z0("sdk").m16754F0(g0Var, l2Var.f19624m);
            }
            if (l2Var.f19625n != null) {
                z0Var.m16753z0("request").m16754F0(g0Var, l2Var.f19625n);
            }
            if (l2Var.f19626o != null && !l2Var.f19626o.isEmpty()) {
                z0Var.m16753z0("tags").m16754F0(g0Var, l2Var.f19626o);
            }
            if (l2Var.f19627p != null) {
                z0Var.m16753z0("release").m16918f0(l2Var.f19627p);
            }
            if (l2Var.f19628q != null) {
                z0Var.m16753z0("environment").m16918f0(l2Var.f19628q);
            }
            if (l2Var.f19629r != null) {
                z0Var.m16753z0("platform").m16918f0(l2Var.f19629r);
            }
            if (l2Var.f19630s != null) {
                z0Var.m16753z0("user").m16754F0(g0Var, l2Var.f19630s);
            }
            if (l2Var.f19632u != null) {
                z0Var.m16753z0("server_name").m16918f0(l2Var.f19632u);
            }
            if (l2Var.f19633v != null) {
                z0Var.m16753z0("dist").m16918f0(l2Var.f19633v);
            }
            if (l2Var.f19634w != null && !l2Var.f19634w.isEmpty()) {
                z0Var.m16753z0("breadcrumbs").m16754F0(g0Var, l2Var.f19634w);
            }
            if (l2Var.f19635x != null && !l2Var.f19635x.isEmpty()) {
                z0Var.m16753z0("extra").m16754F0(g0Var, l2Var.f19635x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8926l2(C9001p pVar) {
        this.f19623l = new C8973c();
        this.f19622k = pVar;
    }

    /* renamed from: A */
    public List<C8843d> m17669A() {
        return this.f19634w;
    }

    /* renamed from: B */
    public C8973c m17668B() {
        return this.f19623l;
    }

    /* renamed from: C */
    public String m17667C() {
        return this.f19633v;
    }

    /* renamed from: D */
    public String m17666D() {
        return this.f19628q;
    }

    /* renamed from: E */
    public C9001p m17665E() {
        return this.f19622k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public Map<String, Object> m17664F() {
        return this.f19635x;
    }

    /* renamed from: G */
    public String m17663G() {
        return this.f19629r;
    }

    /* renamed from: H */
    public String m17662H() {
        return this.f19627p;
    }

    /* renamed from: I */
    public C8991k m17661I() {
        return this.f19625n;
    }

    /* renamed from: J */
    public C8997n m17660J() {
        return this.f19624m;
    }

    /* renamed from: K */
    public String m17659K() {
        return this.f19632u;
    }

    /* renamed from: L */
    public Map<String, String> m17658L() {
        return this.f19626o;
    }

    /* renamed from: M */
    public Throwable m17657M() {
        Throwable th2 = this.f19631t;
        if (th2 instanceof C8858a) {
            return ((C8858a) th2).m17860c();
        }
        return th2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public Throwable m17656N() {
        return this.f19631t;
    }

    /* renamed from: O */
    public C9020z m17655O() {
        return this.f19630s;
    }

    /* renamed from: P */
    public void m17654P(List<C8843d> list) {
        this.f19634w = C9098a.m17025a(list);
    }

    /* renamed from: Q */
    public void m17653Q(String str) {
        this.f19633v = str;
    }

    /* renamed from: R */
    public void m17652R(String str) {
        this.f19628q = str;
    }

    /* renamed from: S */
    public void m17651S(String str, Object obj) {
        if (this.f19635x == null) {
            this.f19635x = new HashMap();
        }
        this.f19635x.put(str, obj);
    }

    /* renamed from: T */
    public void m17650T(Map<String, Object> map) {
        this.f19635x = C9098a.m17023c(map);
    }

    /* renamed from: U */
    public void m17649U(String str) {
        this.f19629r = str;
    }

    /* renamed from: V */
    public void m17648V(String str) {
        this.f19627p = str;
    }

    /* renamed from: W */
    public void m17647W(C8991k kVar) {
        this.f19625n = kVar;
    }

    /* renamed from: X */
    public void m17646X(C8997n nVar) {
        this.f19624m = nVar;
    }

    /* renamed from: Y */
    public void m17645Y(String str) {
        this.f19632u = str;
    }

    /* renamed from: Z */
    public void m17644Z(String str, String str2) {
        if (this.f19626o == null) {
            this.f19626o = new HashMap();
        }
        this.f19626o.put(str, str2);
    }

    /* renamed from: a0 */
    public void m17642a0(Map<String, String> map) {
        this.f19626o = C9098a.m17023c(map);
    }

    /* renamed from: b0 */
    public void m17640b0(C9020z zVar) {
        this.f19630s = zVar;
    }

    /* renamed from: z */
    public void m17616z(C8843d dVar) {
        if (this.f19634w == null) {
            this.f19634w = new ArrayList();
        }
        this.f19634w.add(dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8926l2() {
        this(new C9001p());
    }
}
