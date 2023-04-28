package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Map;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.t */
/* loaded from: classes8.dex */
public final class C9009t implements AbstractC8806b1 {

    /* renamed from: k */
    private String f19806k;

    /* renamed from: l */
    private String f19807l;

    /* renamed from: m */
    private String f19808m;

    /* renamed from: n */
    private Integer f19809n;

    /* renamed from: o */
    private Integer f19810o;

    /* renamed from: p */
    private String f19811p;

    /* renamed from: q */
    private String f19812q;

    /* renamed from: r */
    private Boolean f19813r;

    /* renamed from: s */
    private String f19814s;

    /* renamed from: t */
    private Boolean f19815t;

    /* renamed from: u */
    private String f19816u;

    /* renamed from: v */
    private String f19817v;

    /* renamed from: w */
    private String f19818w;

    /* renamed from: x */
    private String f19819x;

    /* renamed from: y */
    private Map<String, Object> f19820y;

    /* renamed from: z */
    private String f19821z;

    /* renamed from: io.sentry.protocol.t$a */
    /* loaded from: classes8.dex */
    public static final class C9010a implements AbstractC9030r0<C9009t> {
        /* renamed from: b */
        public C9009t mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            C9009t tVar = new C9009t();
            x0Var.m16940g();
            ConcurrentHashMap concurrentHashMap = null;
            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                String S = x0Var.m16946S();
                S.hashCode();
                char c = 65535;
                switch (S.hashCode()) {
                    case -1443345323:
                        if (S.equals("image_addr")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1184392185:
                        if (S.equals("in_app")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1113875953:
                        if (S.equals("raw_function")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1102671691:
                        if (S.equals("lineno")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1068784020:
                        if (S.equals("module")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (S.equals("native")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -807062458:
                        if (S.equals("package")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -734768633:
                        if (S.equals("filename")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -330260936:
                        if (S.equals("symbol_addr")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 94842689:
                        if (S.equals("colno")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 410194178:
                        if (S.equals("instruction_addr")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 1116694660:
                        if (S.equals("context_line")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 1380938712:
                        if (S.equals("function")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1713445842:
                        if (S.equals("abs_path")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case 1874684019:
                        if (S.equals("platform")) {
                            c = 14;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        tVar.f19817v = x0Var.m16801Z0();
                        break;
                    case 1:
                        tVar.f19813r = x0Var.m16812O0();
                        break;
                    case 2:
                        tVar.f19821z = x0Var.m16801Z0();
                        break;
                    case 3:
                        tVar.f19809n = x0Var.m16807T0();
                        break;
                    case 4:
                        tVar.f19808m = x0Var.m16801Z0();
                        break;
                    case 5:
                        tVar.f19815t = x0Var.m16812O0();
                        break;
                    case 6:
                        tVar.f19814s = x0Var.m16801Z0();
                        break;
                    case 7:
                        tVar.f19806k = x0Var.m16801Z0();
                        break;
                    case '\b':
                        tVar.f19818w = x0Var.m16801Z0();
                        break;
                    case '\t':
                        tVar.f19810o = x0Var.m16807T0();
                        break;
                    case '\n':
                        tVar.f19819x = x0Var.m16801Z0();
                        break;
                    case 11:
                        tVar.f19812q = x0Var.m16801Z0();
                        break;
                    case '\f':
                        tVar.f19807l = x0Var.m16801Z0();
                        break;
                    case '\r':
                        tVar.f19811p = x0Var.m16801Z0();
                        break;
                    case 14:
                        tVar.f19816u = x0Var.m16801Z0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x0Var.m16799b1(g0Var, concurrentHashMap, S);
                        break;
                }
            }
            tVar.m17275v(concurrentHashMap);
            x0Var.m16934p();
            return tVar;
        }
    }

    /* renamed from: p */
    public void m17281p(String str) {
        this.f19806k = str;
    }

    /* renamed from: q */
    public void m17280q(String str) {
        this.f19807l = str;
    }

    /* renamed from: r */
    public void m17279r(Boolean bool) {
        this.f19813r = bool;
    }

    /* renamed from: s */
    public void m17278s(Integer num) {
        this.f19809n = num;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f19806k != null) {
            z0Var.m16753z0("filename").m16918f0(this.f19806k);
        }
        if (this.f19807l != null) {
            z0Var.m16753z0("function").m16918f0(this.f19807l);
        }
        if (this.f19808m != null) {
            z0Var.m16753z0("module").m16918f0(this.f19808m);
        }
        if (this.f19809n != null) {
            z0Var.m16753z0("lineno").m16919b0(this.f19809n);
        }
        if (this.f19810o != null) {
            z0Var.m16753z0("colno").m16919b0(this.f19810o);
        }
        if (this.f19811p != null) {
            z0Var.m16753z0("abs_path").m16918f0(this.f19811p);
        }
        if (this.f19812q != null) {
            z0Var.m16753z0("context_line").m16918f0(this.f19812q);
        }
        if (this.f19813r != null) {
            z0Var.m16753z0("in_app").m16921Y(this.f19813r);
        }
        if (this.f19814s != null) {
            z0Var.m16753z0("package").m16918f0(this.f19814s);
        }
        if (this.f19815t != null) {
            z0Var.m16753z0("native").m16921Y(this.f19815t);
        }
        if (this.f19816u != null) {
            z0Var.m16753z0("platform").m16918f0(this.f19816u);
        }
        if (this.f19817v != null) {
            z0Var.m16753z0("image_addr").m16918f0(this.f19817v);
        }
        if (this.f19818w != null) {
            z0Var.m16753z0("symbol_addr").m16918f0(this.f19818w);
        }
        if (this.f19819x != null) {
            z0Var.m16753z0("instruction_addr").m16918f0(this.f19819x);
        }
        if (this.f19821z != null) {
            z0Var.m16753z0("raw_function").m16918f0(this.f19821z);
        }
        Map<String, Object> map = this.f19820y;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19820y.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    /* renamed from: t */
    public void m17277t(String str) {
        this.f19808m = str;
    }

    /* renamed from: u */
    public void m17276u(Boolean bool) {
        this.f19815t = bool;
    }

    /* renamed from: v */
    public void m17275v(Map<String, Object> map) {
        this.f19820y = map;
    }
}
