package io.sentry;

import io.sentry.AbstractC8926l2;
import io.sentry.EnumC8942n3;
import io.sentry.protocol.C8975d;
import io.sentry.protocol.C8987i;
import io.sentry.protocol.C8999o;
import io.sentry.protocol.C9001p;
import io.sentry.protocol.C9013v;
import io.sentry.util.C9098a;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.j3 */
/* loaded from: classes8.dex */
public final class C8908j3 extends AbstractC8926l2 implements AbstractC8806b1 {

    /* renamed from: A */
    private String f38675A;

    /* renamed from: B */
    private C9150x3<C9013v> f38676B;

    /* renamed from: C */
    private C9150x3<C8999o> f38677C;

    /* renamed from: D */
    private EnumC8942n3 f38678D;

    /* renamed from: E */
    private String f38679E;

    /* renamed from: F */
    private List<String> f38680F;

    /* renamed from: G */
    private Map<String, Object> f38681G;

    /* renamed from: H */
    private Map<String, String> f38682H;

    /* renamed from: I */
    private C8975d f38683I;

    /* renamed from: y */
    private Date f19591y;

    /* renamed from: z */
    private C8987i f19592z;

    /* renamed from: io.sentry.j3$a */
    /* loaded from: classes8.dex */
    public static final class C8909a implements AbstractC9030r0<C8908j3> {
        /* renamed from: b */
        public C8908j3 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C8908j3 j3Var = new C8908j3();
            AbstractC8926l2.C8927a aVar = new AbstractC8926l2.C8927a();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1840434063:
                        if (S.equals("debug_meta")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1375934236:
                        if (S.equals("fingerprint")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1337936983:
                        if (S.equals("threads")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1097337456:
                        if (S.equals("logger")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 55126294:
                        if (S.equals("timestamp")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 102865796:
                        if (S.equals("level")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 954925063:
                        if (S.equals("message")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1227433863:
                        if (S.equals("modules")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1481625679:
                        if (S.equals("exception")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 2141246174:
                        if (S.equals("transaction")) {
                            c = '\t';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        j3Var.f38683I = (C8975d) x0Var.m16802Y0(g0Var, new C8975d.C8976a());
                        break;
                    case 1:
                        List list = (List) x0Var.m16803X0();
                        if (list == null) {
                            break;
                        } else {
                            j3Var.f38680F = list;
                            break;
                        }
                    case 2:
                        x0Var.m16940g();
                        x0Var.m16946S();
                        j3Var.f38676B = new C9150x3(x0Var.m16806U0(g0Var, new C9013v.C9014a()));
                        x0Var.m16934p();
                        break;
                    case 3:
                        j3Var.f38675A = x0Var.m16801Z0();
                        break;
                    case 4:
                        Date P0 = x0Var.m16811P0(g0Var);
                        if (P0 == null) {
                            break;
                        } else {
                            j3Var.f19591y = P0;
                            break;
                        }
                    case 5:
                        j3Var.f38678D = (EnumC8942n3) x0Var.m16802Y0(g0Var, new EnumC8942n3.C8943a());
                        break;
                    case 6:
                        j3Var.f19592z = (C8987i) x0Var.m16802Y0(g0Var, new C8987i.C8988a());
                        break;
                    case 7:
                        j3Var.f38682H = C9098a.m17024b((Map) x0Var.m16803X0());
                        break;
                    case '\b':
                        x0Var.m16940g();
                        x0Var.m16946S();
                        j3Var.f38677C = new C9150x3(x0Var.m16806U0(g0Var, new C8999o.C9000a()));
                        x0Var.m16934p();
                        break;
                    case '\t':
                        j3Var.f38679E = x0Var.m16801Z0();
                        break;
                    default:
                        if (!aVar.m17615a(j3Var, S, x0Var, g0Var)) {
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
            j3Var.m17750C0(concurrentHashMap);
            x0Var.m16934p();
            return j3Var;
        }
    }

    C8908j3(C9001p pVar, Date date) {
        super(pVar);
        this.f19591y = date;
    }

    /* renamed from: A0 */
    public void m17752A0(List<C9013v> list) {
        this.f38676B = new C9150x3<>(list);
    }

    /* renamed from: B0 */
    public void m17751B0(String str) {
        this.f38679E = str;
    }

    /* renamed from: C0 */
    public void m17750C0(Map<String, Object> map) {
        this.f38681G = map;
    }

    /* renamed from: m0 */
    public C8975d m17739m0() {
        return this.f38683I;
    }

    /* renamed from: n0 */
    public List<C8999o> m17738n0() {
        C9150x3<C8999o> x3Var = this.f38677C;
        if (x3Var == null) {
            return null;
        }
        return x3Var.m16788a();
    }

    /* renamed from: o0 */
    public List<String> m17737o0() {
        return this.f38680F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public Map<String, String> m17736p0() {
        return this.f38682H;
    }

    /* renamed from: q0 */
    public List<C9013v> m17735q0() {
        C9150x3<C9013v> x3Var = this.f38676B;
        if (x3Var != null) {
            return x3Var.m16788a();
        }
        return null;
    }

    /* renamed from: r0 */
    public String m17734r0() {
        return this.f38679E;
    }

    /* renamed from: s0 */
    public boolean m17733s0() {
        C9150x3<C8999o> x3Var = this.f38677C;
        if (x3Var == null) {
            return false;
        }
        for (C8999o oVar : x3Var.m16788a()) {
            if (!(oVar.m17327g() == null || oVar.m17327g().m17396h() == null || oVar.m17327g().m17396h().booleanValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("timestamp").m16754F0(g0Var, this.f19591y);
        if (this.f19592z != null) {
            z0Var.m16753z0("message").m16754F0(g0Var, this.f19592z);
        }
        if (this.f38675A != null) {
            z0Var.m16753z0("logger").m16918f0(this.f38675A);
        }
        C9150x3<C9013v> x3Var = this.f38676B;
        if (x3Var != null && !x3Var.m16788a().isEmpty()) {
            z0Var.m16753z0("threads");
            z0Var.m16915i();
            z0Var.m16753z0("values").m16754F0(g0Var, this.f38676B.m16788a());
            z0Var.m16911p();
        }
        C9150x3<C8999o> x3Var2 = this.f38677C;
        if (x3Var2 != null && !x3Var2.m16788a().isEmpty()) {
            z0Var.m16753z0("exception");
            z0Var.m16915i();
            z0Var.m16753z0("values").m16754F0(g0Var, this.f38677C.m16788a());
            z0Var.m16911p();
        }
        if (this.f38678D != null) {
            z0Var.m16753z0("level").m16754F0(g0Var, this.f38678D);
        }
        if (this.f38679E != null) {
            z0Var.m16753z0("transaction").m16918f0(this.f38679E);
        }
        if (this.f38680F != null) {
            z0Var.m16753z0("fingerprint").m16754F0(g0Var, this.f38680F);
        }
        if (this.f38682H != null) {
            z0Var.m16753z0("modules").m16754F0(g0Var, this.f38682H);
        }
        if (this.f38683I != null) {
            z0Var.m16753z0("debug_meta").m16754F0(g0Var, this.f38683I);
        }
        new AbstractC8926l2.C8928b().m17614a(this, z0Var, g0Var);
        Map<String, Object> map = this.f38681G;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f38681G.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    /* renamed from: t0 */
    public boolean m17732t0() {
        C9150x3<C8999o> x3Var = this.f38677C;
        return x3Var != null && !x3Var.m16788a().isEmpty();
    }

    /* renamed from: u0 */
    public void m17731u0(C8975d dVar) {
        this.f38683I = dVar;
    }

    /* renamed from: v0 */
    public void m17730v0(List<C8999o> list) {
        this.f38677C = new C9150x3<>(list);
    }

    /* renamed from: w0 */
    public void m17729w0(List<String> list) {
        this.f38680F = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: x0 */
    public void m17728x0(EnumC8942n3 n3Var) {
        this.f38678D = n3Var;
    }

    /* renamed from: y0 */
    public void m17727y0(C8987i iVar) {
        this.f19592z = iVar;
    }

    /* renamed from: z0 */
    public void m17726z0(Map<String, String> map) {
        this.f38682H = C9098a.m17023c(map);
    }

    public C8908j3(Throwable th2) {
        this();
        this.f19631t = th2;
    }

    public C8908j3() {
        this(new C9001p(), C8875h.m17846b());
    }
}
