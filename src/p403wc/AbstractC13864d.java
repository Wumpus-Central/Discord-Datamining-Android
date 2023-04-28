package p403wc;

import p403wc.C13859a;
import p403wc.C13862c;

/* renamed from: wc.d */
/* loaded from: classes3.dex */
public abstract class AbstractC13864d {

    /* renamed from: a */
    public static AbstractC13864d f31219a = m2512a().mo2492a();

    /* renamed from: wc.d$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC13865a {
        /* renamed from: a */
        public abstract AbstractC13864d mo2492a();

        /* renamed from: b */
        public abstract AbstractC13865a mo2491b(String str);

        /* renamed from: c */
        public abstract AbstractC13865a mo2490c(long j);

        /* renamed from: d */
        public abstract AbstractC13865a mo2489d(String str);

        /* renamed from: e */
        public abstract AbstractC13865a mo2488e(String str);

        /* renamed from: f */
        public abstract AbstractC13865a mo2487f(String str);

        /* renamed from: g */
        public abstract AbstractC13865a mo2486g(C13862c.EnumC13863a aVar);

        /* renamed from: h */
        public abstract AbstractC13865a mo2485h(long j);
    }

    /* renamed from: a */
    public static AbstractC13865a m2512a() {
        return new C13859a.C13860b().mo2485h(0L).mo2486g(C13862c.EnumC13863a.ATTEMPT_MIGRATION).mo2490c(0L);
    }

    /* renamed from: b */
    public abstract String mo2511b();

    /* renamed from: c */
    public abstract long mo2510c();

    /* renamed from: d */
    public abstract String mo2509d();

    /* renamed from: e */
    public abstract String mo2508e();

    /* renamed from: f */
    public abstract String mo2507f();

    /* renamed from: g */
    public abstract C13862c.EnumC13863a mo2506g();

    /* renamed from: h */
    public abstract long mo2505h();

    /* renamed from: i */
    public boolean m2504i() {
        return mo2506g() == C13862c.EnumC13863a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m2503j() {
        if (mo2506g() == C13862c.EnumC13863a.NOT_GENERATED || mo2506g() == C13862c.EnumC13863a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m2502k() {
        return mo2506g() == C13862c.EnumC13863a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m2501l() {
        return mo2506g() == C13862c.EnumC13863a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m2500m() {
        return mo2506g() == C13862c.EnumC13863a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract AbstractC13865a mo2499n();

    /* renamed from: o */
    public AbstractC13864d m2498o(String str, long j, long j2) {
        return mo2499n().mo2491b(str).mo2490c(j).mo2485h(j2).mo2492a();
    }

    /* renamed from: p */
    public AbstractC13864d m2497p() {
        return mo2499n().mo2491b(null).mo2492a();
    }

    /* renamed from: q */
    public AbstractC13864d m2496q(String str) {
        return mo2499n().mo2488e(str).mo2486g(C13862c.EnumC13863a.REGISTER_ERROR).mo2492a();
    }

    /* renamed from: r */
    public AbstractC13864d m2495r() {
        return mo2499n().mo2486g(C13862c.EnumC13863a.NOT_GENERATED).mo2492a();
    }

    /* renamed from: s */
    public AbstractC13864d m2494s(String str, String str2, long j, String str3, long j2) {
        return mo2499n().mo2489d(str).mo2486g(C13862c.EnumC13863a.REGISTERED).mo2491b(str3).mo2487f(str2).mo2490c(j2).mo2485h(j).mo2492a();
    }

    /* renamed from: t */
    public AbstractC13864d m2493t(String str) {
        return mo2499n().mo2489d(str).mo2486g(C13862c.EnumC13863a.UNREGISTERED).mo2492a();
    }
}
