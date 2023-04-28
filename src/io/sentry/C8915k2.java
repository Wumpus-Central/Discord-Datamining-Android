package io.sentry;

import io.sentry.cache.C8820d;
import io.sentry.config.C8840h;
import io.sentry.internal.modules.C8902c;
import io.sentry.internal.modules.C8903d;
import io.sentry.protocol.C9001p;
import io.sentry.transport.C9082r;
import io.sentry.util.C9100c;
import java.io.File;

/* renamed from: io.sentry.k2 */
/* loaded from: classes8.dex */
public final class C8915k2 {

    /* renamed from: a */
    private static final ThreadLocal<AbstractC8861f0> f19600a = new ThreadLocal<>();

    /* renamed from: b */
    private static volatile AbstractC8861f0 f19601b = C8877h1.m17835a();

    /* renamed from: c */
    private static volatile boolean f19602c = false;

    /* renamed from: io.sentry.k2$a */
    /* loaded from: classes8.dex */
    public interface AbstractC8916a<T extends C8951o3> {
        /* renamed from: a */
        void mo17168a(T t);
    }

    /* renamed from: b */
    public static void m17712b(C8843d dVar) {
        m17701m().mo17833e(dVar);
    }

    /* renamed from: c */
    public static void m17711c(C8843d dVar, C9116v vVar) {
        m17701m().mo17830h(dVar, vVar);
    }

    /* renamed from: d */
    private static <T extends C8951o3> void m17710d(AbstractC8916a<T> aVar, T t) {
        try {
            aVar.mo17168a(t);
        } catch (Throwable th2) {
            t.getLogger().mo17723b(EnumC8942n3.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
    }

    /* renamed from: e */
    public static C9001p m17709e(C8908j3 j3Var, C9116v vVar) {
        return m17701m().mo17821q(j3Var, vVar);
    }

    /* renamed from: f */
    public static C9001p m17708f(Throwable th2) {
        return m17701m().mo17816v(th2);
    }

    /* renamed from: g */
    public static C9001p m17707g(Throwable th2, C9116v vVar) {
        return m17701m().mo17814x(th2, vVar);
    }

    /* renamed from: h */
    public static C9001p m17706h(String str, EnumC8942n3 n3Var) {
        return m17701m().mo17825m(str, n3Var);
    }

    /* renamed from: i */
    public static synchronized void m17705i() {
        synchronized (C8915k2.class) {
            AbstractC8861f0 m = m17701m();
            f19601b = C8877h1.m17835a();
            f19600a.remove();
            m.close();
        }
    }

    /* renamed from: j */
    public static void m17704j(AbstractC8807b2 b2Var) {
        m17701m().mo17829i(b2Var);
    }

    /* renamed from: k */
    public static void m17703k() {
        m17701m().mo17823o();
    }

    /* renamed from: l */
    public static void m17702l(long j) {
        m17701m().mo17834d(j);
    }

    /* renamed from: m */
    public static AbstractC8861f0 m17701m() {
        if (f19602c) {
            return f19601b;
        }
        ThreadLocal<AbstractC8861f0> threadLocal = f19600a;
        AbstractC8861f0 f0Var = threadLocal.get();
        if (f0Var != null && !(f0Var instanceof C8877h1)) {
            return f0Var;
        }
        AbstractC8861f0 clone = f19601b.clone();
        threadLocal.set(clone);
        return clone;
    }

    /* renamed from: n */
    public static <T extends C8951o3> void m17700n(C9031r1<T> r1Var, AbstractC8916a<T> aVar, boolean z) {
        T b = r1Var.m17191b();
        m17710d(aVar, b);
        m17699o(b, z);
    }

    /* renamed from: o */
    private static synchronized void m17699o(C8951o3 o3Var, boolean z) {
        synchronized (C8915k2.class) {
            if (m17696r()) {
                o3Var.getLogger().mo17722c(EnumC8942n3.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
            }
            if (m17698p(o3Var)) {
                o3Var.getLogger().mo17722c(EnumC8942n3.INFO, "GlobalHubMode: '%s'", String.valueOf(z));
                f19602c = z;
                AbstractC8861f0 m = m17701m();
                f19601b = new C8690a0(o3Var);
                f19600a.set(f19601b);
                m.close();
                for (AbstractC9023q0 q0Var : o3Var.getIntegrations()) {
                    q0Var.mo17181b(C8805b0.m18042a(), o3Var);
                }
            }
        }
    }

    /* renamed from: p */
    private static boolean m17698p(C8951o3 o3Var) {
        if (o3Var.isEnableExternalConfiguration()) {
            o3Var.merge(C9093u.m17061f(C8840h.m17921a(), o3Var.getLogger()));
        }
        String dsn = o3Var.getDsn();
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string to disable SDK.");
        } else if (dsn.isEmpty()) {
            m17705i();
            return false;
        } else {
            new C8923l(dsn);
            AbstractC8869g0 logger = o3Var.getLogger();
            if (o3Var.isDebug() && (logger instanceof C8895i1)) {
                o3Var.setLogger(new C8910j4());
                logger = o3Var.getLogger();
            }
            EnumC8942n3 n3Var = EnumC8942n3.INFO;
            logger.mo17722c(n3Var, "Initializing SDK with DSN: '%s'", o3Var.getDsn());
            String outboxPath = o3Var.getOutboxPath();
            if (outboxPath != null) {
                new File(outboxPath).mkdirs();
            } else {
                logger.mo17722c(n3Var, "No outbox dir path is defined in options.", new Object[0]);
            }
            String cacheDirPath = o3Var.getCacheDirPath();
            if (cacheDirPath != null) {
                new File(cacheDirPath).mkdirs();
                if (o3Var.getEnvelopeDiskCache() instanceof C9082r) {
                    o3Var.setEnvelopeDiskCache(C8820d.m17957z(o3Var));
                }
            }
            String profilingTracesDirPath = o3Var.getProfilingTracesDirPath();
            if (o3Var.isProfilingEnabled() && profilingTracesDirPath != null) {
                File file = new File(profilingTracesDirPath);
                file.mkdirs();
                final File[] listFiles = file.listFiles();
                o3Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8915k2.m17695s(listFiles);
                    }
                });
            }
            if (o3Var.getModulesLoader() instanceof C8902c) {
                o3Var.setModulesLoader(new C8903d(o3Var.getLogger()));
            }
            return true;
        }
    }

    /* renamed from: q */
    public static Boolean m17697q() {
        return m17701m().mo17818t();
    }

    /* renamed from: r */
    public static boolean m17696r() {
        return m17701m().isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m17695s(File[] fileArr) {
        if (fileArr != null) {
            for (File file : fileArr) {
                C9100c.m17020a(file);
            }
        }
    }

    /* renamed from: t */
    public static void m17694t() {
        m17701m().mo17813y();
    }

    /* renamed from: u */
    public static AbstractC8932m0 m17693u(C8944n4 n4Var, C8860f fVar, boolean z) {
        return m17701m().mo17828j(n4Var, fVar, z);
    }

    /* renamed from: v */
    public static AbstractC8932m0 m17692v(C8944n4 n4Var, C8965p4 p4Var) {
        return m17701m().mo17819s(n4Var, p4Var);
    }

    /* renamed from: w */
    public static AbstractC8932m0 m17691w(String str, String str2) {
        return m17701m().mo17820r(str, str2);
    }

    /* renamed from: x */
    public static void m17690x(AbstractC8807b2 b2Var) {
        m17701m().mo17817u(b2Var);
    }
}
