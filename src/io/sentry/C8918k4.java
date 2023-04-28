package io.sentry;

import io.sentry.protocol.C9001p;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.k4 */
/* loaded from: classes8.dex */
public final class C8918k4 implements AbstractC8806b1 {

    /* renamed from: k */
    private final C9001p f19604k;

    /* renamed from: l */
    private final String f19605l;

    /* renamed from: m */
    private final String f19606m;

    /* renamed from: n */
    private final String f19607n;

    /* renamed from: o */
    private final String f19608o;

    /* renamed from: p */
    private final String f19609p;

    /* renamed from: q */
    private final String f19610q;

    /* renamed from: r */
    private final String f19611r;

    /* renamed from: s */
    private Map<String, Object> f19612s;

    /* renamed from: io.sentry.k4$b */
    /* loaded from: classes8.dex */
    public static final class C8920b implements AbstractC9030r0<C8918k4> {
        /* renamed from: c */
        private Exception m17682c(String str, AbstractC8869g0 g0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            g0Var.mo17723b(EnumC8942n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* renamed from: b */
        public C8918k4 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            String str;
            String str2;
            x0Var.m16940g();
            C8921c cVar = null;
            String str3 = null;
            C9001p pVar = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -795593025:
                        if (S.equals("user_segment")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -147132913:
                        if (S.equals("user_id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -85904877:
                        if (S.equals("environment")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3599307:
                        if (S.equals("user")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 153193045:
                        if (S.equals("sample_rate")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1090594823:
                        if (S.equals("release")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (S.equals("trace_id")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1904812937:
                        if (S.equals("public_key")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 2141246174:
                        if (S.equals("transaction")) {
                            c = '\b';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str4 = x0Var.m16801Z0();
                        break;
                    case 1:
                        str3 = x0Var.m16801Z0();
                        break;
                    case 2:
                        str7 = x0Var.m16801Z0();
                        break;
                    case 3:
                        cVar = (C8921c) x0Var.m16802Y0(g0Var, new C8921c.C8922a());
                        break;
                    case 4:
                        str9 = x0Var.m16801Z0();
                        break;
                    case 5:
                        str6 = x0Var.m16801Z0();
                        break;
                    case 6:
                        pVar = new C9001p.C9002a().mo16758a(x0Var, g0Var);
                        break;
                    case 7:
                        str5 = x0Var.m16941f0();
                        break;
                    case '\b':
                        str8 = x0Var.m16801Z0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            if (pVar == null) {
                throw m17682c("trace_id", g0Var);
            } else if (str5 != null) {
                if (cVar != null) {
                    if (str3 == null) {
                        str3 = cVar.m17681a();
                    }
                    if (str4 == null) {
                        str = cVar.m17680b();
                        str2 = str3;
                        C8918k4 k4Var = new C8918k4(pVar, str5, str6, str7, str2, str, str8, str9);
                        k4Var.m17684b(concurrentHashMap);
                        x0Var.m16934p();
                        return k4Var;
                    }
                }
                str2 = str3;
                str = str4;
                C8918k4 k4Var2 = new C8918k4(pVar, str5, str6, str7, str2, str, str8, str9);
                k4Var2.m17684b(concurrentHashMap);
                x0Var.m16934p();
                return k4Var2;
            } else {
                throw m17682c("public_key", g0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* renamed from: io.sentry.k4$c */
    /* loaded from: classes8.dex */
    public static final class C8921c {

        /* renamed from: a */
        private String f19613a;

        /* renamed from: b */
        private String f19614b;

        /* renamed from: c */
        private Map<String, Object> f19615c;

        /* renamed from: io.sentry.k4$c$a */
        /* loaded from: classes8.dex */
        public static final class C8922a implements AbstractC9030r0<C8921c> {
            /* renamed from: b */
            public C8921c mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
                x0Var.m16940g();
                String str = null;
                String str2 = null;
                ConcurrentHashMap concurrentHashMap = null;
                while (x0Var.m16930w0() == EnumC9125b.NAME) {
                    String S = x0Var.m16946S();
                    S.hashCode();
                    if (S.equals("id")) {
                        str = x0Var.m16801Z0();
                    } else if (!S.equals("segment")) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                    } else {
                        str2 = x0Var.m16801Z0();
                    }
                }
                C8921c cVar = new C8921c(str, str2);
                cVar.m17679c(concurrentHashMap);
                x0Var.m16934p();
                return cVar;
            }
        }

        /* renamed from: a */
        public String m17681a() {
            return this.f19613a;
        }

        /* renamed from: b */
        public String m17680b() {
            return this.f19614b;
        }

        /* renamed from: c */
        public void m17679c(Map<String, Object> map) {
            this.f19615c = map;
        }

        private C8921c(String str, String str2) {
            this.f19613a = str;
            this.f19614b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8918k4(C9001p pVar, String str) {
        this(pVar, str, null, null, null, null, null, null);
    }

    /* renamed from: a */
    public String m17685a() {
        return this.f19611r;
    }

    /* renamed from: b */
    public void m17684b(Map<String, Object> map) {
        this.f19612s = map;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        z0Var.m16753z0("trace_id").m16754F0(g0Var, this.f19604k);
        z0Var.m16753z0("public_key").m16918f0(this.f19605l);
        if (this.f19606m != null) {
            z0Var.m16753z0("release").m16918f0(this.f19606m);
        }
        if (this.f19607n != null) {
            z0Var.m16753z0("environment").m16918f0(this.f19607n);
        }
        if (this.f19608o != null) {
            z0Var.m16753z0("user_id").m16918f0(this.f19608o);
        }
        if (this.f19609p != null) {
            z0Var.m16753z0("user_segment").m16918f0(this.f19609p);
        }
        if (this.f19610q != null) {
            z0Var.m16753z0("transaction").m16918f0(this.f19610q);
        }
        if (this.f19611r != null) {
            z0Var.m16753z0("sample_rate").m16918f0(this.f19611r);
        }
        Map<String, Object> map = this.f19612s;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19612s.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8918k4(C9001p pVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f19604k = pVar;
        this.f19605l = str;
        this.f19606m = str2;
        this.f19607n = str3;
        this.f19608o = str4;
        this.f19609p = str5;
        this.f19610q = str6;
        this.f19611r = str7;
    }
}
