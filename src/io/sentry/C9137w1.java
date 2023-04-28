package io.sentry;

import io.sentry.C9147x1;
import io.sentry.profilemeasurements.C8966a;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.w1 */
/* loaded from: classes8.dex */
public final class C9137w1 implements AbstractC8806b1 {

    /* renamed from: A */
    private String f38706A;

    /* renamed from: B */
    private String f38707B;

    /* renamed from: C */
    private String f38708C;

    /* renamed from: D */
    private String f38709D;

    /* renamed from: E */
    private String f38710E;

    /* renamed from: F */
    private String f38711F;

    /* renamed from: G */
    private String f38712G;

    /* renamed from: H */
    private String f38713H;

    /* renamed from: I */
    private String f38714I;

    /* renamed from: J */
    private final Map<String, C8966a> f38715J;

    /* renamed from: K */
    private String f38716K;

    /* renamed from: L */
    private Map<String, Object> f38717L;

    /* renamed from: k */
    private final File f20036k;

    /* renamed from: l */
    private final Callable<List<Integer>> f20037l;

    /* renamed from: m */
    private int f20038m;

    /* renamed from: n */
    private String f20039n;

    /* renamed from: o */
    private String f20040o;

    /* renamed from: p */
    private String f20041p;

    /* renamed from: q */
    private String f20042q;

    /* renamed from: r */
    private String f20043r;

    /* renamed from: s */
    private String f20044s;

    /* renamed from: t */
    private boolean f20045t;

    /* renamed from: u */
    private String f20046u;

    /* renamed from: v */
    private List<Integer> f20047v;

    /* renamed from: w */
    private String f20048w;

    /* renamed from: x */
    private String f20049x;

    /* renamed from: y */
    private String f20050y;

    /* renamed from: z */
    private List<C9147x1> f20051z;

    /* renamed from: io.sentry.w1$b */
    /* loaded from: classes8.dex */
    public static final class C9139b implements AbstractC9030r0<C9137w1> {
        /* renamed from: b */
        public C9137w1 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            x0Var.m16940g();
            ConcurrentHashMap concurrentHashMap = null;
            C9137w1 w1Var = new C9137w1();
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -2133529830:
                        if (S.equals("device_manufacturer")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1981468849:
                        if (S.equals("android_api_level")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1430655860:
                        if (S.equals("build_id")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1172160413:
                        if (S.equals("device_locale")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1102636175:
                        if (S.equals("profile_id")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -716656436:
                        if (S.equals("device_os_build_number")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -591076352:
                        if (S.equals("device_model")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -512511455:
                        if (S.equals("device_is_emulator")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -478065584:
                        if (S.equals("duration_ns")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -362243017:
                        if (S.equals("measurements")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -332426004:
                        if (S.equals("device_physical_memory_bytes")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case -212264198:
                        if (S.equals("device_cpu_frequencies")) {
                            c = 11;
                            break;
                        }
                        break;
                    case -102985484:
                        if (S.equals("version_code")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case -102670958:
                        if (S.equals("version_name")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case -85904877:
                        if (S.equals("environment")) {
                            c = 14;
                            break;
                        }
                        break;
                    case 508853068:
                        if (S.equals("transaction_name")) {
                            c = 15;
                            break;
                        }
                        break;
                    case 796476189:
                        if (S.equals("device_os_name")) {
                            c = 16;
                            break;
                        }
                        break;
                    case 839674195:
                        if (S.equals("architecture")) {
                            c = 17;
                            break;
                        }
                        break;
                    case 1010584092:
                        if (S.equals("transaction_id")) {
                            c = 18;
                            break;
                        }
                        break;
                    case 1052553990:
                        if (S.equals("device_os_version")) {
                            c = 19;
                            break;
                        }
                        break;
                    case 1163928186:
                        if (S.equals("truncation_reason")) {
                            c = 20;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (S.equals("trace_id")) {
                            c = 21;
                            break;
                        }
                        break;
                    case 1874684019:
                        if (S.equals("platform")) {
                            c = 22;
                            break;
                        }
                        break;
                    case 1953158756:
                        if (S.equals("sampled_profile")) {
                            c = 23;
                            break;
                        }
                        break;
                    case 1954122069:
                        if (S.equals("transactions")) {
                            c = 24;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        String Z0 = x0Var.m16801Z0();
                        if (Z0 == null) {
                            break;
                        } else {
                            w1Var.f20040o = Z0;
                            break;
                        }
                    case 1:
                        Integer T0 = x0Var.m16807T0();
                        if (T0 == null) {
                            break;
                        } else {
                            w1Var.f20038m = T0.intValue();
                            break;
                        }
                    case 2:
                        String Z02 = x0Var.m16801Z0();
                        if (Z02 == null) {
                            break;
                        } else {
                            w1Var.f20050y = Z02;
                            break;
                        }
                    case 3:
                        String Z03 = x0Var.m16801Z0();
                        if (Z03 == null) {
                            break;
                        } else {
                            w1Var.f20039n = Z03;
                            break;
                        }
                    case 4:
                        String Z04 = x0Var.m16801Z0();
                        if (Z04 == null) {
                            break;
                        } else {
                            w1Var.f38712G = Z04;
                            break;
                        }
                    case 5:
                        String Z05 = x0Var.m16801Z0();
                        if (Z05 == null) {
                            break;
                        } else {
                            w1Var.f20042q = Z05;
                            break;
                        }
                    case 6:
                        String Z06 = x0Var.m16801Z0();
                        if (Z06 == null) {
                            break;
                        } else {
                            w1Var.f20041p = Z06;
                            break;
                        }
                    case 7:
                        Boolean O0 = x0Var.m16812O0();
                        if (O0 == null) {
                            break;
                        } else {
                            w1Var.f20045t = O0.booleanValue();
                            break;
                        }
                    case '\b':
                        String Z07 = x0Var.m16801Z0();
                        if (Z07 == null) {
                            break;
                        } else {
                            w1Var.f38707B = Z07;
                            break;
                        }
                    case '\t':
                        Map W0 = x0Var.m16804W0(g0Var, new C8966a.C0277a());
                        if (W0 == null) {
                            break;
                        } else {
                            w1Var.f38715J.putAll(W0);
                            break;
                        }
                    case '\n':
                        String Z08 = x0Var.m16801Z0();
                        if (Z08 == null) {
                            break;
                        } else {
                            w1Var.f20048w = Z08;
                            break;
                        }
                    case 11:
                        List list = (List) x0Var.m16803X0();
                        if (list == null) {
                            break;
                        } else {
                            w1Var.f20047v = list;
                            break;
                        }
                    case '\f':
                        String Z09 = x0Var.m16801Z0();
                        if (Z09 == null) {
                            break;
                        } else {
                            w1Var.f38708C = Z09;
                            break;
                        }
                    case '\r':
                        String Z010 = x0Var.m16801Z0();
                        if (Z010 == null) {
                            break;
                        } else {
                            w1Var.f38709D = Z010;
                            break;
                        }
                    case 14:
                        String Z011 = x0Var.m16801Z0();
                        if (Z011 == null) {
                            break;
                        } else {
                            w1Var.f38713H = Z011;
                            break;
                        }
                    case 15:
                        String Z012 = x0Var.m16801Z0();
                        if (Z012 == null) {
                            break;
                        } else {
                            w1Var.f38706A = Z012;
                            break;
                        }
                    case 16:
                        String Z013 = x0Var.m16801Z0();
                        if (Z013 == null) {
                            break;
                        } else {
                            w1Var.f20043r = Z013;
                            break;
                        }
                    case 17:
                        String Z014 = x0Var.m16801Z0();
                        if (Z014 == null) {
                            break;
                        } else {
                            w1Var.f20046u = Z014;
                            break;
                        }
                    case 18:
                        String Z015 = x0Var.m16801Z0();
                        if (Z015 == null) {
                            break;
                        } else {
                            w1Var.f38710E = Z015;
                            break;
                        }
                    case 19:
                        String Z016 = x0Var.m16801Z0();
                        if (Z016 == null) {
                            break;
                        } else {
                            w1Var.f20044s = Z016;
                            break;
                        }
                    case 20:
                        String Z017 = x0Var.m16801Z0();
                        if (Z017 == null) {
                            break;
                        } else {
                            w1Var.f38714I = Z017;
                            break;
                        }
                    case 21:
                        String Z018 = x0Var.m16801Z0();
                        if (Z018 == null) {
                            break;
                        } else {
                            w1Var.f38711F = Z018;
                            break;
                        }
                    case 22:
                        String Z019 = x0Var.m16801Z0();
                        if (Z019 == null) {
                            break;
                        } else {
                            w1Var.f20049x = Z019;
                            break;
                        }
                    case 23:
                        String Z020 = x0Var.m16801Z0();
                        if (Z020 == null) {
                            break;
                        } else {
                            w1Var.f38716K = Z020;
                            break;
                        }
                    case 24:
                        List U0 = x0Var.m16806U0(g0Var, new C9147x1.C9148a());
                        if (U0 == null) {
                            break;
                        } else {
                            w1Var.f20051z.addAll(U0);
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            w1Var.m16885G(concurrentHashMap);
            x0Var.m16934p();
            return w1Var;
        }
    }

    /* renamed from: C */
    private boolean m16889C() {
        if (this.f38714I.equals("normal") || this.f38714I.equals("timeout") || this.f38714I.equals("backgrounded")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static /* synthetic */ List m16888D() {
        return new ArrayList();
    }

    /* renamed from: A */
    public String m16891A() {
        return this.f38712G;
    }

    /* renamed from: B */
    public File m16890B() {
        return this.f20036k;
    }

    /* renamed from: E */
    public void m16887E() {
        try {
            this.f20047v = this.f20037l.call();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: F */
    public void m16886F(String str) {
        this.f38716K = str;
    }

    /* renamed from: G */
    public void m16885G(Map<String, Object> map) {
        this.f38717L = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("android_api_level").m16754F0(g0Var, Integer.valueOf(this.f20038m));
        z0Var.m16753z0("device_locale").m16754F0(g0Var, this.f20039n);
        z0Var.m16753z0("device_manufacturer").m16918f0(this.f20040o);
        z0Var.m16753z0("device_model").m16918f0(this.f20041p);
        z0Var.m16753z0("device_os_build_number").m16918f0(this.f20042q);
        z0Var.m16753z0("device_os_name").m16918f0(this.f20043r);
        z0Var.m16753z0("device_os_version").m16918f0(this.f20044s);
        z0Var.m16753z0("device_is_emulator").m16914j0(this.f20045t);
        z0Var.m16753z0("architecture").m16754F0(g0Var, this.f20046u);
        z0Var.m16753z0("device_cpu_frequencies").m16754F0(g0Var, this.f20047v);
        z0Var.m16753z0("device_physical_memory_bytes").m16918f0(this.f20048w);
        z0Var.m16753z0("platform").m16918f0(this.f20049x);
        z0Var.m16753z0("build_id").m16918f0(this.f20050y);
        z0Var.m16753z0("transaction_name").m16918f0(this.f38706A);
        z0Var.m16753z0("duration_ns").m16918f0(this.f38707B);
        z0Var.m16753z0("version_name").m16918f0(this.f38709D);
        z0Var.m16753z0("version_code").m16918f0(this.f38708C);
        if (!this.f20051z.isEmpty()) {
            z0Var.m16753z0("transactions").m16754F0(g0Var, this.f20051z);
        }
        z0Var.m16753z0("transaction_id").m16918f0(this.f38710E);
        z0Var.m16753z0("trace_id").m16918f0(this.f38711F);
        z0Var.m16753z0("profile_id").m16918f0(this.f38712G);
        z0Var.m16753z0("environment").m16918f0(this.f38713H);
        z0Var.m16753z0("truncation_reason").m16918f0(this.f38714I);
        if (this.f38716K != null) {
            z0Var.m16753z0("sampled_profile").m16918f0(this.f38716K);
        }
        z0Var.m16753z0("measurements").m16754F0(g0Var, this.f38715J);
        Map<String, Object> map = this.f38717L;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f38717L.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    private C9137w1() {
        this(new File("dummy"), C8947o1.m17586n());
    }

    public C9137w1(File file, AbstractC8932m0 m0Var) {
        this(file, new ArrayList(), m0Var, "0", 0, "", new Callable() { // from class: io.sentry.v1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List D;
                D = C9137w1.m16888D();
                return D;
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public C9137w1(File file, List<C9147x1> list, AbstractC8932m0 m0Var, String str, int i, String str2, Callable<List<Integer>> callable, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, Map<String, C8966a> map) {
        this.f20047v = new ArrayList();
        this.f38716K = null;
        this.f20036k = file;
        this.f20046u = str2;
        this.f20037l = callable;
        this.f20038m = i;
        this.f20039n = Locale.getDefault().toString();
        String str11 = "";
        this.f20040o = str3 != null ? str3 : str11;
        this.f20041p = str4 != null ? str4 : str11;
        this.f20044s = str5 != null ? str5 : str11;
        this.f20045t = bool != null ? bool.booleanValue() : false;
        this.f20048w = str6 != null ? str6 : "0";
        this.f20042q = str11;
        this.f20043r = "android";
        this.f20049x = "android";
        this.f20050y = str7 != null ? str7 : str11;
        this.f20051z = list;
        this.f38706A = m0Var.getName();
        this.f38707B = str;
        this.f38708C = str11;
        this.f38709D = str8 != null ? str8 : str11;
        this.f38710E = m0Var.mo16838f().toString();
        this.f38711F = m0Var.mo16831m().m17987j().toString();
        this.f38712G = UUID.randomUUID().toString();
        this.f38713H = str9 != null ? str9 : "production";
        this.f38714I = str10;
        if (!m16889C()) {
            this.f38714I = "normal";
        }
        this.f38715J = map;
    }
}
