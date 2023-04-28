package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.util.C9098a;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.e */
/* loaded from: classes8.dex */
public final class C8977e implements AbstractC8806b1 {

    /* renamed from: A */
    private Long f38684A;

    /* renamed from: B */
    private Long f38685B;

    /* renamed from: C */
    private Long f38686C;

    /* renamed from: D */
    private Long f38687D;

    /* renamed from: E */
    private Integer f38688E;

    /* renamed from: F */
    private Integer f38689F;

    /* renamed from: G */
    private Float f38690G;

    /* renamed from: H */
    private Integer f38691H;

    /* renamed from: I */
    private Date f38692I;

    /* renamed from: J */
    private TimeZone f38693J;

    /* renamed from: K */
    private String f38694K;
    @Deprecated

    /* renamed from: L */
    private String f38695L;

    /* renamed from: M */
    private String f38696M;

    /* renamed from: N */
    private String f38697N;

    /* renamed from: O */
    private Float f38698O;

    /* renamed from: P */
    private Map<String, Object> f38699P;

    /* renamed from: k */
    private String f19704k;

    /* renamed from: l */
    private String f19705l;

    /* renamed from: m */
    private String f19706m;

    /* renamed from: n */
    private String f19707n;

    /* renamed from: o */
    private String f19708o;

    /* renamed from: p */
    private String f19709p;

    /* renamed from: q */
    private String[] f19710q;

    /* renamed from: r */
    private Float f19711r;

    /* renamed from: s */
    private Boolean f19712s;

    /* renamed from: t */
    private Boolean f19713t;

    /* renamed from: u */
    private EnumC8979b f19714u;

    /* renamed from: v */
    private Boolean f19715v;

    /* renamed from: w */
    private Long f19716w;

    /* renamed from: x */
    private Long f19717x;

    /* renamed from: y */
    private Long f19718y;

    /* renamed from: z */
    private Boolean f19719z;

    /* renamed from: io.sentry.protocol.e$a */
    /* loaded from: classes8.dex */
    public static final class C8978a implements AbstractC9030r0<C8977e> {
        /* renamed from: b */
        public C8977e mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            C8977e eVar = new C8977e();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -2076227591:
                        if (S.equals("timezone")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -2012489734:
                        if (S.equals("boot_time")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1981332476:
                        if (S.equals("simulator")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1969347631:
                        if (S.equals("manufacturer")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1613589672:
                        if (S.equals("language")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1439500848:
                        if (S.equals("orientation")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1410521534:
                        if (S.equals("battery_temperature")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -1281860764:
                        if (S.equals("family")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -1097462182:
                        if (S.equals("locale")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -1012222381:
                        if (S.equals("online")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -877252910:
                        if (S.equals("battery_level")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case -619038223:
                        if (S.equals("model_id")) {
                            c = 11;
                            break;
                        }
                        break;
                    case -568274923:
                        if (S.equals("screen_density")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case -417046774:
                        if (S.equals("screen_dpi")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case -136523212:
                        if (S.equals("free_memory")) {
                            c = 14;
                            break;
                        }
                        break;
                    case 3355:
                        if (S.equals("id")) {
                            c = 15;
                            break;
                        }
                        break;
                    case 3373707:
                        if (S.equals("name")) {
                            c = 16;
                            break;
                        }
                        break;
                    case 59142220:
                        if (S.equals("low_memory")) {
                            c = 17;
                            break;
                        }
                        break;
                    case 93076189:
                        if (S.equals("archs")) {
                            c = 18;
                            break;
                        }
                        break;
                    case 93997959:
                        if (S.equals("brand")) {
                            c = 19;
                            break;
                        }
                        break;
                    case 104069929:
                        if (S.equals("model")) {
                            c = 20;
                            break;
                        }
                        break;
                    case 731866107:
                        if (S.equals("connection_type")) {
                            c = 21;
                            break;
                        }
                        break;
                    case 817830969:
                        if (S.equals("screen_width_pixels")) {
                            c = 22;
                            break;
                        }
                        break;
                    case 823882553:
                        if (S.equals("external_storage_size")) {
                            c = 23;
                            break;
                        }
                        break;
                    case 897428293:
                        if (S.equals("storage_size")) {
                            c = 24;
                            break;
                        }
                        break;
                    case 1331465768:
                        if (S.equals("usable_memory")) {
                            c = 25;
                            break;
                        }
                        break;
                    case 1418777727:
                        if (S.equals("memory_size")) {
                            c = 26;
                            break;
                        }
                        break;
                    case 1436115569:
                        if (S.equals("charging")) {
                            c = 27;
                            break;
                        }
                        break;
                    case 1450613660:
                        if (S.equals("external_free_storage")) {
                            c = 28;
                            break;
                        }
                        break;
                    case 1524159400:
                        if (S.equals("free_storage")) {
                            c = 29;
                            break;
                        }
                        break;
                    case 1556284978:
                        if (S.equals("screen_height_pixels")) {
                            c = 30;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        eVar.f38693J = x0Var.m16800a1(g0Var);
                        break;
                    case 1:
                        if (x0Var.m16930w0() != EnumC9125b.STRING) {
                            break;
                        } else {
                            eVar.f38692I = x0Var.m16811P0(g0Var);
                            break;
                        }
                    case 2:
                        eVar.f19715v = x0Var.m16812O0();
                        break;
                    case 3:
                        eVar.f19705l = x0Var.m16801Z0();
                        break;
                    case 4:
                        eVar.f38695L = x0Var.m16801Z0();
                        break;
                    case 5:
                        eVar.f19714u = (EnumC8979b) x0Var.m16802Y0(g0Var, new EnumC8979b.C8980a());
                        break;
                    case 6:
                        eVar.f38698O = x0Var.m16808S0();
                        break;
                    case 7:
                        eVar.f19707n = x0Var.m16801Z0();
                        break;
                    case '\b':
                        eVar.f38696M = x0Var.m16801Z0();
                        break;
                    case '\t':
                        eVar.f19713t = x0Var.m16812O0();
                        break;
                    case '\n':
                        eVar.f19711r = x0Var.m16808S0();
                        break;
                    case 11:
                        eVar.f19709p = x0Var.m16801Z0();
                        break;
                    case '\f':
                        eVar.f38690G = x0Var.m16808S0();
                        break;
                    case '\r':
                        eVar.f38691H = x0Var.m16807T0();
                        break;
                    case 14:
                        eVar.f19717x = x0Var.m16805V0();
                        break;
                    case 15:
                        eVar.f38694K = x0Var.m16801Z0();
                        break;
                    case 16:
                        eVar.f19704k = x0Var.m16801Z0();
                        break;
                    case 17:
                        eVar.f19719z = x0Var.m16812O0();
                        break;
                    case 18:
                        List list = (List) x0Var.m16803X0();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            eVar.f19710q = strArr;
                            break;
                        }
                    case 19:
                        eVar.f19706m = x0Var.m16801Z0();
                        break;
                    case 20:
                        eVar.f19708o = x0Var.m16801Z0();
                        break;
                    case 21:
                        eVar.f38697N = x0Var.m16801Z0();
                        break;
                    case 22:
                        eVar.f38688E = x0Var.m16807T0();
                        break;
                    case 23:
                        eVar.f38686C = x0Var.m16805V0();
                        break;
                    case 24:
                        eVar.f38684A = x0Var.m16805V0();
                        break;
                    case 25:
                        eVar.f19718y = x0Var.m16805V0();
                        break;
                    case 26:
                        eVar.f19716w = x0Var.m16805V0();
                        break;
                    case 27:
                        eVar.f19712s = x0Var.m16812O0();
                        break;
                    case 28:
                        eVar.f38687D = x0Var.m16805V0();
                        break;
                    case 29:
                        eVar.f38685B = x0Var.m16805V0();
                        break;
                    case 30:
                        eVar.f38689F = x0Var.m16807T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            eVar.m17431n0(concurrentHashMap);
            x0Var.m16934p();
            return eVar;
        }
    }

    /* renamed from: io.sentry.protocol.e$b */
    /* loaded from: classes8.dex */
    public enum EnumC8979b implements AbstractC8806b1 {
        PORTRAIT,
        LANDSCAPE;

        /* renamed from: io.sentry.protocol.e$b$a */
        /* loaded from: classes8.dex */
        public static final class C8980a implements AbstractC9030r0<EnumC8979b> {
            /* renamed from: b */
            public EnumC8979b mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
                return EnumC8979b.valueOf(x0Var.m16941f0().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.AbstractC8806b1
        public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
            z0Var.m16918f0(toString().toLowerCase(Locale.ROOT));
        }
    }

    public C8977e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8977e(C8977e eVar) {
        String[] strArr;
        this.f19704k = eVar.f19704k;
        this.f19705l = eVar.f19705l;
        this.f19706m = eVar.f19706m;
        this.f19707n = eVar.f19707n;
        this.f19708o = eVar.f19708o;
        this.f19709p = eVar.f19709p;
        this.f19712s = eVar.f19712s;
        this.f19713t = eVar.f19713t;
        this.f19714u = eVar.f19714u;
        this.f19715v = eVar.f19715v;
        this.f19716w = eVar.f19716w;
        this.f19717x = eVar.f19717x;
        this.f19718y = eVar.f19718y;
        this.f19719z = eVar.f19719z;
        this.f38684A = eVar.f38684A;
        this.f38685B = eVar.f38685B;
        this.f38686C = eVar.f38686C;
        this.f38687D = eVar.f38687D;
        this.f38688E = eVar.f38688E;
        this.f38689F = eVar.f38689F;
        this.f38690G = eVar.f38690G;
        this.f38691H = eVar.f38691H;
        this.f38692I = eVar.f38692I;
        this.f38694K = eVar.f38694K;
        this.f38695L = eVar.f38695L;
        this.f38697N = eVar.f38697N;
        this.f38698O = eVar.f38698O;
        this.f19711r = eVar.f19711r;
        String[] strArr2 = eVar.f19710q;
        TimeZone timeZone = null;
        if (strArr2 != null) {
            strArr = (String[]) strArr2.clone();
        } else {
            strArr = null;
        }
        this.f19710q = strArr;
        this.f38696M = eVar.f38696M;
        TimeZone timeZone2 = eVar.f38693J;
        this.f38693J = timeZone2 != null ? (TimeZone) timeZone2.clone() : timeZone;
        this.f38699P = C9098a.m17024b(eVar.f38699P);
    }

    /* renamed from: F */
    public String m17479F() {
        return this.f38697N;
    }

    /* renamed from: G */
    public String m17478G() {
        return this.f38694K;
    }

    /* renamed from: H */
    public String m17477H() {
        return this.f38695L;
    }

    /* renamed from: I */
    public String m17476I() {
        return this.f38696M;
    }

    /* renamed from: J */
    public void m17475J(String[] strArr) {
        this.f19710q = strArr;
    }

    /* renamed from: K */
    public void m17474K(Float f) {
        this.f19711r = f;
    }

    /* renamed from: L */
    public void m17473L(Float f) {
        this.f38698O = f;
    }

    /* renamed from: M */
    public void m17472M(Date date) {
        this.f38692I = date;
    }

    /* renamed from: N */
    public void m17471N(String str) {
        this.f19706m = str;
    }

    /* renamed from: O */
    public void m17470O(Boolean bool) {
        this.f19712s = bool;
    }

    /* renamed from: P */
    public void m17469P(String str) {
        this.f38697N = str;
    }

    /* renamed from: Q */
    public void m17468Q(Long l) {
        this.f38687D = l;
    }

    /* renamed from: R */
    public void m17467R(Long l) {
        this.f38686C = l;
    }

    /* renamed from: S */
    public void m17466S(String str) {
        this.f19707n = str;
    }

    /* renamed from: T */
    public void m17465T(Long l) {
        this.f19717x = l;
    }

    /* renamed from: U */
    public void m17464U(Long l) {
        this.f38685B = l;
    }

    /* renamed from: V */
    public void m17463V(String str) {
        this.f38694K = str;
    }

    /* renamed from: W */
    public void m17462W(String str) {
        this.f38695L = str;
    }

    /* renamed from: X */
    public void m17461X(String str) {
        this.f38696M = str;
    }

    /* renamed from: Y */
    public void m17460Y(Boolean bool) {
        this.f19719z = bool;
    }

    /* renamed from: Z */
    public void m17459Z(String str) {
        this.f19705l = str;
    }

    /* renamed from: a0 */
    public void m17457a0(Long l) {
        this.f19716w = l;
    }

    /* renamed from: b0 */
    public void m17455b0(String str) {
        this.f19708o = str;
    }

    /* renamed from: c0 */
    public void m17453c0(String str) {
        this.f19709p = str;
    }

    /* renamed from: d0 */
    public void m17451d0(String str) {
        this.f19704k = str;
    }

    /* renamed from: e0 */
    public void m17449e0(Boolean bool) {
        this.f19713t = bool;
    }

    /* renamed from: f0 */
    public void m17447f0(EnumC8979b bVar) {
        this.f19714u = bVar;
    }

    /* renamed from: g0 */
    public void m17445g0(Float f) {
        this.f38690G = f;
    }

    /* renamed from: h0 */
    public void m17443h0(Integer num) {
        this.f38691H = num;
    }

    /* renamed from: i0 */
    public void m17441i0(Integer num) {
        this.f38689F = num;
    }

    /* renamed from: j0 */
    public void m17439j0(Integer num) {
        this.f38688E = num;
    }

    /* renamed from: k0 */
    public void m17437k0(Boolean bool) {
        this.f19715v = bool;
    }

    /* renamed from: l0 */
    public void m17435l0(Long l) {
        this.f38684A = l;
    }

    /* renamed from: m0 */
    public void m17433m0(TimeZone timeZone) {
        this.f38693J = timeZone;
    }

    /* renamed from: n0 */
    public void m17431n0(Map<String, Object> map) {
        this.f38699P = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19704k != null) {
            z0Var.m16753z0("name").m16918f0(this.f19704k);
        }
        if (this.f19705l != null) {
            z0Var.m16753z0("manufacturer").m16918f0(this.f19705l);
        }
        if (this.f19706m != null) {
            z0Var.m16753z0("brand").m16918f0(this.f19706m);
        }
        if (this.f19707n != null) {
            z0Var.m16753z0("family").m16918f0(this.f19707n);
        }
        if (this.f19708o != null) {
            z0Var.m16753z0("model").m16918f0(this.f19708o);
        }
        if (this.f19709p != null) {
            z0Var.m16753z0("model_id").m16918f0(this.f19709p);
        }
        if (this.f19710q != null) {
            z0Var.m16753z0("archs").m16754F0(g0Var, this.f19710q);
        }
        if (this.f19711r != null) {
            z0Var.m16753z0("battery_level").m16919b0(this.f19711r);
        }
        if (this.f19712s != null) {
            z0Var.m16753z0("charging").m16921Y(this.f19712s);
        }
        if (this.f19713t != null) {
            z0Var.m16753z0("online").m16921Y(this.f19713t);
        }
        if (this.f19714u != null) {
            z0Var.m16753z0("orientation").m16754F0(g0Var, this.f19714u);
        }
        if (this.f19715v != null) {
            z0Var.m16753z0("simulator").m16921Y(this.f19715v);
        }
        if (this.f19716w != null) {
            z0Var.m16753z0("memory_size").m16919b0(this.f19716w);
        }
        if (this.f19717x != null) {
            z0Var.m16753z0("free_memory").m16919b0(this.f19717x);
        }
        if (this.f19718y != null) {
            z0Var.m16753z0("usable_memory").m16919b0(this.f19718y);
        }
        if (this.f19719z != null) {
            z0Var.m16753z0("low_memory").m16921Y(this.f19719z);
        }
        if (this.f38684A != null) {
            z0Var.m16753z0("storage_size").m16919b0(this.f38684A);
        }
        if (this.f38685B != null) {
            z0Var.m16753z0("free_storage").m16919b0(this.f38685B);
        }
        if (this.f38686C != null) {
            z0Var.m16753z0("external_storage_size").m16919b0(this.f38686C);
        }
        if (this.f38687D != null) {
            z0Var.m16753z0("external_free_storage").m16919b0(this.f38687D);
        }
        if (this.f38688E != null) {
            z0Var.m16753z0("screen_width_pixels").m16919b0(this.f38688E);
        }
        if (this.f38689F != null) {
            z0Var.m16753z0("screen_height_pixels").m16919b0(this.f38689F);
        }
        if (this.f38690G != null) {
            z0Var.m16753z0("screen_density").m16919b0(this.f38690G);
        }
        if (this.f38691H != null) {
            z0Var.m16753z0("screen_dpi").m16919b0(this.f38691H);
        }
        if (this.f38692I != null) {
            z0Var.m16753z0("boot_time").m16754F0(g0Var, this.f38692I);
        }
        if (this.f38693J != null) {
            z0Var.m16753z0("timezone").m16754F0(g0Var, this.f38693J);
        }
        if (this.f38694K != null) {
            z0Var.m16753z0("id").m16918f0(this.f38694K);
        }
        if (this.f38695L != null) {
            z0Var.m16753z0("language").m16918f0(this.f38695L);
        }
        if (this.f38697N != null) {
            z0Var.m16753z0("connection_type").m16918f0(this.f38697N);
        }
        if (this.f38698O != null) {
            z0Var.m16753z0("battery_temperature").m16919b0(this.f38698O);
        }
        if (this.f38696M != null) {
            z0Var.m16753z0("locale").m16918f0(this.f38696M);
        }
        Map<String, Object> map = this.f38699P;
        if (map != null) {
            for (String str : map.keySet()) {
                z0Var.m16753z0(str).m16754F0(g0Var, this.f38699P.get(str));
            }
        }
        z0Var.m16911p();
    }
}
