package io.sentry.android.core;

import android.content.Context;
import android.os.Bundle;
import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import io.sentry.protocol.C8997n;
import io.sentry.util.C9111k;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.android.core.r0 */
/* loaded from: classes8.dex */
public final class C8780r0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18097a(Context context, SentryAndroidOptions sentryAndroidOptions, C8715f0 f0Var) {
        C9111k.m16995a(context, "The application context is required.");
        C9111k.m16995a(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle b = m18096b(context, sentryAndroidOptions.getLogger(), f0Var);
            AbstractC8869g0 logger = sentryAndroidOptions.getLogger();
            if (b != null) {
                sentryAndroidOptions.setDebug(m18094d(b, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String name = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String h = m18090h(b, logger, "io.sentry.debug.level", name.toLowerCase(locale));
                    if (h != null) {
                        sentryAndroidOptions.setDiagnosticLevel(EnumC8942n3.valueOf(h.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(m18094d(b, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(m18094d(b, logger, "io.sentry.auto-session-tracking.enable", m18094d(b, logger, "io.sentry.session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking())));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    Double e = m18093e(b, logger, "io.sentry.sample-rate");
                    if (e.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setSampleRate(e);
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(m18094d(b, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(m18091g(b, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                String h2 = m18090h(b, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                if (h2 == null) {
                    sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                } else if (h2.isEmpty()) {
                    sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.DEBUG, "DSN is empty, disabling sentry-android", new Object[0]);
                }
                sentryAndroidOptions.setDsn(h2);
                sentryAndroidOptions.setEnableNdk(m18094d(b, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(m18094d(b, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(m18090h(b, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(m18090h(b, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(m18091g(b, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(m18094d(b, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(m18094d(b, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(m18094d(b, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(m18094d(b, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(m18094d(b, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(m18094d(b, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(m18094d(b, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(m18094d(b, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setSendClientReports(m18094d(b, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                sentryAndroidOptions.setCollectAdditionalContext(m18094d(b, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    Double e2 = m18093e(b, logger, "io.sentry.traces.sample-rate");
                    if (e2.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(e2);
                    }
                }
                sentryAndroidOptions.setTraceSampling(m18094d(b, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(m18094d(b, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(m18094d(b, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                sentryAndroidOptions.setProfilingEnabled(m18094d(b, logger, "io.sentry.traces.profiling.enable", sentryAndroidOptions.isProfilingEnabled()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    Double e3 = m18093e(b, logger, "io.sentry.traces.profiling.sample-rate");
                    if (e3.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(e3);
                    }
                }
                sentryAndroidOptions.setEnableUserInteractionTracing(m18094d(b, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                long g = m18091g(b, logger, "io.sentry.traces.idle-timeout", -1L);
                if (g != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(g));
                }
                List<String> f = m18092f(b, logger, "io.sentry.traces.trace-propagation-targets");
                if (!b.containsKey("io.sentry.traces.trace-propagation-targets") && (f == null || f.isEmpty())) {
                    f = m18092f(b, logger, "io.sentry.traces.tracing-origins");
                }
                if ((b.containsKey("io.sentry.traces.trace-propagation-targets") || b.containsKey("io.sentry.traces.tracing-origins")) && f == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.emptyList());
                } else if (f != null) {
                    sentryAndroidOptions.setTracePropagationTargets(f);
                }
                sentryAndroidOptions.setEnableFramesTracking(m18094d(b, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(m18090h(b, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                C8997n sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new C8997n("", "");
                }
                sdkVersion.m17338i(m18089i(b, logger, "io.sentry.sdk.name", sdkVersion.m17341f()));
                sdkVersion.m17336k(m18089i(b, logger, "io.sentry.sdk.version", sdkVersion.m17339h()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(m18094d(b, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
            }
            sentryAndroidOptions.getLogger().mo17722c(EnumC8942n3.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo17723b(EnumC8942n3.ERROR, "Failed to read configuration from android manifest metadata.", th2);
        }
    }

    /* renamed from: b */
    private static Bundle m18096b(Context context, AbstractC8869g0 g0Var, C8715f0 f0Var) {
        if (f0Var == null) {
            f0Var = new C8715f0(g0Var);
        }
        return C8721h0.m18279a(context, 128L, f0Var).metaData;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m18095c(Context context, AbstractC8869g0 g0Var) {
        C9111k.m16995a(context, "The application context is required.");
        boolean z = true;
        try {
            Bundle b = m18096b(context, g0Var, null);
            if (b != null) {
                z = m18094d(b, g0Var, "io.sentry.auto-init", true);
            }
            g0Var.mo17722c(EnumC8942n3.INFO, "Retrieving auto-init from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th2) {
            g0Var.mo17723b(EnumC8942n3.ERROR, "Failed to read auto-init from android manifest metadata.", th2);
        }
        return z;
    }

    /* renamed from: d */
    private static boolean m18094d(Bundle bundle, AbstractC8869g0 g0Var, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        g0Var.mo17722c(EnumC8942n3.DEBUG, "%s read: %s", str, Boolean.valueOf(z2));
        return z2;
    }

    /* renamed from: e */
    private static Double m18093e(Bundle bundle, AbstractC8869g0 g0Var, String str) {
        Double valueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        g0Var.mo17722c(EnumC8942n3.DEBUG, "%s read: %s", str, valueOf);
        return valueOf;
    }

    /* renamed from: f */
    private static List<String> m18092f(Bundle bundle, AbstractC8869g0 g0Var, String str) {
        String string = bundle.getString(str);
        g0Var.mo17722c(EnumC8942n3.DEBUG, "%s read: %s", str, string);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    /* renamed from: g */
    private static long m18091g(Bundle bundle, AbstractC8869g0 g0Var, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        g0Var.mo17722c(EnumC8942n3.DEBUG, "%s read: %s", str, Long.valueOf(j2));
        return j2;
    }

    /* renamed from: h */
    private static String m18090h(Bundle bundle, AbstractC8869g0 g0Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        g0Var.mo17722c(EnumC8942n3.DEBUG, "%s read: %s", str, string);
        return string;
    }

    /* renamed from: i */
    private static String m18089i(Bundle bundle, AbstractC8869g0 g0Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        g0Var.mo17722c(EnumC8942n3.DEBUG, "%s read: %s", str, string);
        return string;
    }
}
