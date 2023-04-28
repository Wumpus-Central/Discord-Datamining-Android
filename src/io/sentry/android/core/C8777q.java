package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.AbstractC8847d2;
import io.sentry.AbstractC8869g0;
import io.sentry.C8878h2;
import io.sentry.C8896i2;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.cache.C8707a;
import io.sentry.android.core.internal.modules.C8741a;
import io.sentry.android.core.internal.util.C8753k;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.transport.C9082r;
import io.sentry.util.C9111k;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.android.core.q */
/* loaded from: classes8.dex */
public final class C8777q {
    /* renamed from: c */
    private static String m18109c(Context context, AbstractC8869g0 g0Var) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                String property = properties.getProperty("io.sentry.ProguardUuids");
                g0Var.mo17722c(EnumC8942n3.DEBUG, "Proguard UUID found: %s", property);
                bufferedInputStream.close();
                return property;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            g0Var.mo17722c(EnumC8942n3.INFO, "sentry-debug-meta.properties file was not found.", new Object[0]);
            return null;
        } catch (IOException e) {
            g0Var.mo17723b(EnumC8942n3.ERROR, "Error getting Proguard UUIDs.", e);
            return null;
        } catch (RuntimeException e2) {
            g0Var.mo17723b(EnumC8942n3.ERROR, "sentry-debug-meta.properties file is malformed.", e2);
            return null;
        }
    }

    /* renamed from: d */
    private static String m18108d(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    /* renamed from: e */
    private static void m18107e(Context context, SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setCacheDirPath(new File(context.getCacheDir(), "sentry").getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m18106f(SentryAndroidOptions sentryAndroidOptions, Context context, C8715f0 f0Var, C8776p0 p0Var, boolean z, boolean z2) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof C9082r)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new C8707a(sentryAndroidOptions));
        }
        C8716g gVar = new C8716g(p0Var, sentryAndroidOptions);
        m18105g(context, sentryAndroidOptions, f0Var, p0Var, gVar, z, z2);
        sentryAndroidOptions.addEventProcessor(new C8761k0(context, f0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C8786u0(sentryAndroidOptions, gVar));
        sentryAndroidOptions.setTransportGate(new C8791w(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setTransactionProfiler(new C8787v(context, sentryAndroidOptions, f0Var, new C8753k(context, sentryAndroidOptions, f0Var)));
        sentryAndroidOptions.setModulesLoader(new C8741a(context, sentryAndroidOptions.getLogger()));
    }

    /* renamed from: g */
    private static void m18105g(Context context, final SentryAndroidOptions sentryAndroidOptions, C8715f0 f0Var, C8776p0 p0Var, C8716g gVar, boolean z, boolean z2) {
        Class<?> cls;
        boolean I = C8707a.m18320I(sentryAndroidOptions);
        sentryAndroidOptions.addIntegration(new C8797y0(new C8878h2(new AbstractC8847d2() { // from class: io.sentry.android.core.o
            @Override // io.sentry.AbstractC8847d2
            /* renamed from: a */
            public final String mo17884a() {
                String cacheDirPath;
                cacheDirPath = SentryAndroidOptions.this.getCacheDirPath();
                return cacheDirPath;
            }
        }), I));
        if (m18104h(f0Var)) {
            cls = p0Var.m18112c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger());
        } else {
            cls = null;
        }
        sentryAndroidOptions.addIntegration(new C8782s0(cls));
        sentryAndroidOptions.addIntegration(AbstractC8767m0.m18120g());
        sentryAndroidOptions.addIntegration(new C8797y0(new C8896i2(new AbstractC8847d2() { // from class: io.sentry.android.core.p
            @Override // io.sentry.AbstractC8847d2
            /* renamed from: a */
            public final String mo17884a() {
                String outboxPath;
                outboxPath = SentryAndroidOptions.this.getOutboxPath();
                return outboxPath;
            }
        }), I));
        sentryAndroidOptions.addIntegration(new C8796y(context));
        sentryAndroidOptions.addIntegration(new C8704c0());
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new C8766m(application, f0Var, gVar));
            sentryAndroidOptions.addIntegration(new C8713e1(application, p0Var));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
            sentryAndroidOptions.addEventProcessor(new C8793w0(application, sentryAndroidOptions, f0Var));
        } else {
            sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new ComponentCallbacks2C8798z(context));
        sentryAndroidOptions.addIntegration(new C8705c1(context));
        sentryAndroidOptions.addIntegration(new C8710d1(context));
        sentryAndroidOptions.addIntegration(new C8789v0(context));
    }

    /* renamed from: h */
    private static boolean m18104h(C8715f0 f0Var) {
        return f0Var.m18303d() >= 16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static void m18101k(SentryAndroidOptions sentryAndroidOptions, Context context, AbstractC8869g0 g0Var, C8715f0 f0Var) {
        C9111k.m16995a(context, "The context is required.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        C9111k.m16995a(sentryAndroidOptions, "The options object is required.");
        C9111k.m16995a(g0Var, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(g0Var);
        C8780r0.m18097a(context, sentryAndroidOptions, f0Var);
        m18107e(context, sentryAndroidOptions);
        m18100l(sentryAndroidOptions, context, f0Var);
    }

    /* renamed from: l */
    private static void m18100l(SentryAndroidOptions sentryAndroidOptions, Context context, C8715f0 f0Var) {
        PackageInfo c = C8721h0.m18277c(context, sentryAndroidOptions.getLogger(), f0Var);
        if (c != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(m18108d(c, C8721h0.m18276d(c, f0Var)));
            }
            String str = c.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(C8774o0.m18117a(context));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().mo17723b(EnumC8942n3.ERROR, "Could not generate distinct Id.", e);
            }
        }
        if (sentryAndroidOptions.getProguardUuid() == null) {
            sentryAndroidOptions.setProguardUuid(m18109c(context, sentryAndroidOptions.getLogger()));
        }
    }
}
