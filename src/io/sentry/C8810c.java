package io.sentry;

import io.sentry.protocol.C9001p;
import io.sentry.protocol.C9020z;
import io.sentry.protocol.EnumC9019y;
import io.sentry.util.C9114n;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: io.sentry.c */
/* loaded from: classes8.dex */
public final class C8810c {

    /* renamed from: e */
    static final Integer f19476e = 8192;

    /* renamed from: f */
    static final Integer f19477f = 64;

    /* renamed from: a */
    final Map<String, String> f19478a;

    /* renamed from: b */
    final String f19479b;

    /* renamed from: c */
    private boolean f19480c;

    /* renamed from: d */
    final AbstractC8869g0 f19481d;

    public C8810c(AbstractC8869g0 g0Var) {
        this(new HashMap(), null, true, g0Var);
    }

    /* renamed from: g */
    private static String m18016g(C9020z zVar) {
        if (zVar.m17220l() != null) {
            return zVar.m17220l();
        }
        Map<String, String> h = zVar.m17224h();
        if (h != null) {
            return h.get("segment");
        }
        return null;
    }

    /* renamed from: l */
    private static boolean m18011l(EnumC9019y yVar) {
        if (yVar == null || EnumC9019y.URL.equals(yVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private static Double m18009n(C8937m4 m4Var) {
        if (m4Var == null) {
            return null;
        }
        return m4Var.m17599b();
    }

    /* renamed from: o */
    private static String m18008o(Double d) {
        if (!C9114n.m16986f(d, false)) {
            return null;
        }
        return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d);
    }

    /* renamed from: a */
    public void m18022a() {
        this.f19480c = false;
    }

    /* renamed from: b */
    public String m18021b(String str) {
        if (str == null) {
            return null;
        }
        return this.f19478a.get(str);
    }

    /* renamed from: c */
    public String m18020c() {
        return m18021b("sentry-environment");
    }

    /* renamed from: d */
    public String m18019d() {
        return m18021b("sentry-public_key");
    }

    /* renamed from: e */
    public String m18018e() {
        return m18021b("sentry-release");
    }

    /* renamed from: f */
    public String m18017f() {
        return m18021b("sentry-sample_rate");
    }

    /* renamed from: h */
    public String m18015h() {
        return m18021b("sentry-trace_id");
    }

    /* renamed from: i */
    public String m18014i() {
        return m18021b("sentry-transaction");
    }

    /* renamed from: j */
    public String m18013j() {
        return m18021b("sentry-user_id");
    }

    /* renamed from: k */
    public String m18012k() {
        return m18021b("sentry-user_segment");
    }

    /* renamed from: m */
    public boolean m18010m() {
        return this.f19480c;
    }

    /* renamed from: p */
    public void m18007p(String str, String str2) {
        if (this.f19480c) {
            this.f19478a.put(str, str2);
        }
    }

    /* renamed from: q */
    public void m18006q(String str) {
        m18007p("sentry-environment", str);
    }

    /* renamed from: r */
    public void m18005r(String str) {
        m18007p("sentry-public_key", str);
    }

    /* renamed from: s */
    public void m18004s(String str) {
        m18007p("sentry-release", str);
    }

    /* renamed from: t */
    public void m18003t(String str) {
        m18007p("sentry-sample_rate", str);
    }

    /* renamed from: u */
    public void m18002u(String str) {
        m18007p("sentry-trace_id", str);
    }

    /* renamed from: v */
    public void m18001v(String str) {
        m18007p("sentry-transaction", str);
    }

    /* renamed from: w */
    public void m18000w(String str) {
        m18007p("sentry-user_segment", str);
    }

    /* renamed from: x */
    public void m17999x(AbstractC8932m0 m0Var, C9020z zVar, C8951o3 o3Var, C8937m4 m4Var) {
        String str;
        m18002u(m0Var.mo16831m().m17987j().toString());
        m18005r(new C8923l(o3Var.getDsn()).m17677a());
        m18004s(o3Var.getRelease());
        m18006q(o3Var.getEnvironment());
        String str2 = null;
        if (zVar != null) {
            str = m18016g(zVar);
        } else {
            str = null;
        }
        m18000w(str);
        if (m18011l(m0Var.mo16836h())) {
            str2 = m0Var.getName();
        }
        m18001v(str2);
        m18003t(m18008o(m18009n(m4Var)));
    }

    /* renamed from: y */
    public C8918k4 m17998y() {
        String h = m18015h();
        String d = m18019d();
        if (h == null || d == null) {
            return null;
        }
        return new C8918k4(new C9001p(h), d, m18018e(), m18020c(), m18013j(), m18012k(), m18014i(), m18017f());
    }

    public C8810c(Map<String, String> map, String str, boolean z, AbstractC8869g0 g0Var) {
        this.f19478a = map;
        this.f19481d = g0Var;
        this.f19480c = z;
        this.f19479b = str;
    }
}
