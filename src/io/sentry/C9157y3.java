package io.sentry;

import io.sentry.protocol.C9020z;
import io.sentry.util.C9115o;
import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p163j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.y3 */
/* loaded from: classes8.dex */
public final class C9157y3 implements AbstractC8806b1 {

    /* renamed from: k */
    private final Date f20102k;

    /* renamed from: l */
    private Date f20103l;

    /* renamed from: m */
    private final AtomicInteger f20104m;

    /* renamed from: n */
    private final String f20105n;

    /* renamed from: o */
    private final UUID f20106o;

    /* renamed from: p */
    private Boolean f20107p;

    /* renamed from: q */
    private EnumC9159b f20108q;

    /* renamed from: r */
    private Long f20109r;

    /* renamed from: s */
    private Double f20110s;

    /* renamed from: t */
    private final String f20111t;

    /* renamed from: u */
    private String f20112u;

    /* renamed from: v */
    private final String f20113v;

    /* renamed from: w */
    private final String f20114w;

    /* renamed from: x */
    private final Object f20115x;

    /* renamed from: y */
    private Map<String, Object> f20116y;

    /* renamed from: io.sentry.y3$a */
    /* loaded from: classes8.dex */
    public static final class C9158a implements AbstractC9030r0<C9157y3> {
        /* renamed from: c */
        private Exception m16756c(String str, AbstractC8869g0 g0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            g0Var.mo17723b(EnumC8942n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: b */
        public C9157y3 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            char c;
            String str;
            boolean z;
            x0Var.m16940g();
            Integer num = null;
            EnumC9159b bVar = null;
            Date date = null;
            Date date2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String str2 = null;
            UUID uuid = null;
            Boolean bool = null;
            Long l = null;
            Double d = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                String str7 = str5;
                if (x0Var.m16930w0() == EnumC9125b.NAME) {
                    String S = x0Var.m16946S();
                    S.hashCode();
                    switch (S.hashCode()) {
                        case -1992012396:
                            if (S.equals("duration")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1897185151:
                            if (S.equals("started")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1294635157:
                            if (S.equals("errors")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -892481550:
                            if (S.equals("status")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 99455:
                            if (S.equals("did")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 113759:
                            if (S.equals("seq")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 113870:
                            if (S.equals("sid")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3237136:
                            if (S.equals("init")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 55126294:
                            if (S.equals("timestamp")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 93152418:
                            if (S.equals("attrs")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            d = x0Var.m16810Q0();
                            str5 = str7;
                            str4 = str4;
                            str3 = str3;
                            break;
                        case 1:
                            date = x0Var.m16811P0(g0Var);
                            str5 = str7;
                            str4 = str4;
                            str3 = str3;
                            d = d;
                            break;
                        case 2:
                            num = x0Var.m16807T0();
                            str5 = str7;
                            str4 = str4;
                            str3 = str3;
                            d = d;
                            break;
                        case 3:
                            String b = C9115o.m16984b(x0Var.m16801Z0());
                            if (b != null) {
                                bVar = EnumC9159b.valueOf(b);
                            }
                            str5 = str7;
                            str4 = str4;
                            str3 = str3;
                            d = d;
                            break;
                        case 4:
                            str2 = x0Var.m16801Z0();
                            str5 = str7;
                            str4 = str4;
                            str3 = str3;
                            d = d;
                            break;
                        case 5:
                            l = x0Var.m16805V0();
                            str5 = str7;
                            str4 = str4;
                            str3 = str3;
                            d = d;
                            continue;
                        case 6:
                            try {
                                str = x0Var.m16801Z0();
                            } catch (IllegalArgumentException unused) {
                                str = null;
                            }
                            try {
                                uuid = UUID.fromString(str);
                            } catch (IllegalArgumentException unused2) {
                                g0Var.mo17722c(EnumC8942n3.ERROR, "%s sid is not valid.", str);
                                str5 = str7;
                                str4 = str4;
                                str3 = str3;
                                d = d;
                                l = l;
                            }
                            str5 = str7;
                            str4 = str4;
                            str3 = str3;
                            d = d;
                        case 7:
                            bool = x0Var.m16812O0();
                            str5 = str7;
                            str4 = str4;
                            str3 = str3;
                            d = d;
                            break;
                        case '\b':
                            date2 = x0Var.m16811P0(g0Var);
                            str5 = str7;
                            str4 = str4;
                            str3 = str3;
                            d = d;
                            break;
                        case '\t':
                            x0Var.m16940g();
                            str4 = str4;
                            str3 = str3;
                            while (x0Var.m16930w0() == EnumC9125b.NAME) {
                                String S2 = x0Var.m16946S();
                                S2.hashCode();
                                switch (S2.hashCode()) {
                                    case -85904877:
                                        if (S2.equals("environment")) {
                                            z = false;
                                            break;
                                        }
                                        z = true;
                                        break;
                                    case 1090594823:
                                        if (S2.equals("release")) {
                                            z = true;
                                            break;
                                        }
                                        z = true;
                                        break;
                                    case 1480014044:
                                        if (S2.equals("ip_address")) {
                                            z = true;
                                            break;
                                        }
                                        z = true;
                                        break;
                                    case 1917799825:
                                        if (S2.equals("user_agent")) {
                                            z = true;
                                            break;
                                        }
                                        z = true;
                                        break;
                                    default:
                                        z = true;
                                        break;
                                }
                                switch (z) {
                                    case false:
                                        str7 = x0Var.m16801Z0();
                                        break;
                                    case true:
                                        str6 = x0Var.m16801Z0();
                                        break;
                                    case true:
                                        str3 = x0Var.m16801Z0();
                                        break;
                                    case true:
                                        str4 = x0Var.m16801Z0();
                                        break;
                                    default:
                                        x0Var.m16950M0();
                                        break;
                                }
                            }
                            x0Var.m16934p();
                            str5 = str7;
                            d = d;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            x0Var.m16799b1(g0Var, concurrentHashMap, S);
                            str5 = str7;
                            str4 = str4;
                            str3 = str3;
                            d = d;
                            break;
                    }
                    l = l;
                } else if (bVar == null) {
                    throw m16756c("status", g0Var);
                } else if (date == null) {
                    throw m16756c("started", g0Var);
                } else if (num == null) {
                    throw m16756c("errors", g0Var);
                } else if (str6 != null) {
                    C9157y3 y3Var = new C9157y3(bVar, date, date2, num.intValue(), str2, uuid, bool, l, d, str3, str4, str7, str6);
                    y3Var.m16760l(concurrentHashMap);
                    x0Var.m16934p();
                    return y3Var;
                } else {
                    throw m16756c("release", g0Var);
                }
            }
        }
    }

    /* renamed from: io.sentry.y3$b */
    /* loaded from: classes8.dex */
    public enum EnumC9159b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public C9157y3(EnumC9159b bVar, Date date, Date date2, int i, String str, UUID uuid, Boolean bool, Long l, Double d, String str2, String str3, String str4, String str5) {
        this.f20115x = new Object();
        this.f20108q = bVar;
        this.f20102k = date;
        this.f20103l = date2;
        this.f20104m = new AtomicInteger(i);
        this.f20105n = str;
        this.f20106o = uuid;
        this.f20107p = bool;
        this.f20109r = l;
        this.f20110s = d;
        this.f20111t = str2;
        this.f20112u = str3;
        this.f20113v = str4;
        this.f20114w = str5;
    }

    /* renamed from: a */
    private double m16771a(Date date) {
        return Math.abs(date.getTime() - this.f20102k.getTime()) / 1000.0d;
    }

    /* renamed from: h */
    private long m16764h(Date date) {
        long time = date.getTime();
        if (time < 0) {
            return Math.abs(time);
        }
        return time;
    }

    /* renamed from: b */
    public C9157y3 clone() {
        return new C9157y3(this.f20108q, this.f20102k, this.f20103l, this.f20104m.get(), this.f20105n, this.f20106o, this.f20107p, this.f20109r, this.f20110s, this.f20111t, this.f20112u, this.f20113v, this.f20114w);
    }

    /* renamed from: c */
    public void m16769c() {
        m16768d(C8875h.m17846b());
    }

    /* renamed from: d */
    public void m16768d(Date date) {
        synchronized (this.f20115x) {
            this.f20107p = null;
            if (this.f20108q == EnumC9159b.Ok) {
                this.f20108q = EnumC9159b.Exited;
            }
            if (date != null) {
                this.f20103l = date;
            } else {
                this.f20103l = C8875h.m17846b();
            }
            Date date2 = this.f20103l;
            if (date2 != null) {
                this.f20110s = Double.valueOf(m16771a(date2));
                this.f20109r = Long.valueOf(m16764h(this.f20103l));
            }
        }
    }

    /* renamed from: e */
    public int m16767e() {
        return this.f20104m.get();
    }

    /* renamed from: f */
    public Boolean m16766f() {
        return this.f20107p;
    }

    /* renamed from: g */
    public String m16765g() {
        return this.f20114w;
    }

    /* renamed from: i */
    public UUID m16763i() {
        return this.f20106o;
    }

    /* renamed from: j */
    public EnumC9159b m16762j() {
        return this.f20108q;
    }

    /* renamed from: k */
    public void m16761k() {
        this.f20107p = Boolean.TRUE;
    }

    /* renamed from: l */
    public void m16760l(Map<String, Object> map) {
        this.f20116y = map;
    }

    /* renamed from: m */
    public boolean m16759m(EnumC9159b bVar, String str, boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.f20115x) {
            z2 = true;
            if (bVar != null) {
                try {
                    this.f20108q = bVar;
                    z3 = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                z3 = false;
            }
            if (str != null) {
                this.f20112u = str;
                z3 = true;
            }
            if (z) {
                this.f20104m.addAndGet(1);
            } else {
                z2 = z3;
            }
            if (z2) {
                this.f20107p = null;
                Date b = C8875h.m17846b();
                this.f20103l = b;
                if (b != null) {
                    this.f20109r = Long.valueOf(m16764h(b));
                }
            }
        }
        return z2;
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16915i();
        if (this.f20106o != null) {
            z0Var.m16753z0("sid").m16918f0(this.f20106o.toString());
        }
        if (this.f20105n != null) {
            z0Var.m16753z0("did").m16918f0(this.f20105n);
        }
        if (this.f20107p != null) {
            z0Var.m16753z0("init").m16921Y(this.f20107p);
        }
        z0Var.m16753z0("started").m16754F0(g0Var, this.f20102k);
        z0Var.m16753z0("status").m16754F0(g0Var, this.f20108q.name().toLowerCase(Locale.ROOT));
        if (this.f20109r != null) {
            z0Var.m16753z0("seq").m16919b0(this.f20109r);
        }
        z0Var.m16753z0("errors").m16922U(this.f20104m.intValue());
        if (this.f20110s != null) {
            z0Var.m16753z0("duration").m16919b0(this.f20110s);
        }
        if (this.f20103l != null) {
            z0Var.m16753z0("timestamp").m16754F0(g0Var, this.f20103l);
        }
        z0Var.m16753z0("attrs");
        z0Var.m16915i();
        z0Var.m16753z0("release").m16754F0(g0Var, this.f20114w);
        if (this.f20113v != null) {
            z0Var.m16753z0("environment").m16754F0(g0Var, this.f20113v);
        }
        if (this.f20111t != null) {
            z0Var.m16753z0("ip_address").m16754F0(g0Var, this.f20111t);
        }
        if (this.f20112u != null) {
            z0Var.m16753z0("user_agent").m16754F0(g0Var, this.f20112u);
        }
        z0Var.m16911p();
        Map<String, Object> map = this.f20116y;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f20116y.get(str);
                z0Var.m16753z0(str);
                z0Var.m16754F0(g0Var, obj);
            }
        }
        z0Var.m16911p();
    }

    public C9157y3(String str, C9020z zVar, String str2, String str3) {
        this(EnumC9159b.Ok, C8875h.m17846b(), C8875h.m17846b(), 0, str, UUID.randomUUID(), Boolean.TRUE, null, null, zVar != null ? zVar.m17221k() : null, null, str2, str3);
    }
}
