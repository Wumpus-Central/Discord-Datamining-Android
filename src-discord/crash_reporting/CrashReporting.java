package com.discord.crash_reporting;

import android.content.Context;
import android.os.Build;
import com.discord.BuildConfig;
import com.discord.client_info.ClientInfo;
import com.discord.logging.Log;
import io.sentry.Scope;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.b1;
import io.sentry.b2;
import io.sentry.d;
import io.sentry.k2;
import io.sentry.n3;
import io.sentry.o3;
import java.io.File;
import java.util.List;
import java.util.Map;
import kg.f;
import kotlin.Metadata;
import kotlin.collections.i;
import kotlin.jvm.internal.q;
import lg.v;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001#B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006$"}, d2 = {"Lcom/discord/crash_reporting/CrashReporting;", "", "()V", "TAG_APP_VERSION", "", "TAG_BUILD_NUMBER", "<set-?>", "", "isCrashedLastRun", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "addBreadcrumb", "", "breadcrumbMessage", "breadcrumbData", "", "breadcrumbCategory", "captureException", "throwable", "", "captureMessage", "tag", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "errorLevel", "Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;", "getSampleRate", "", "getTracingSampleRate", "init", "context", "Landroid/content/Context;", "isProductionChannel", "ErrorLevel", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CrashReporting {
    public static final CrashReporting INSTANCE = new CrashReporting();
    private static final String TAG_APP_VERSION = "appVersion";
    private static final String TAG_BUILD_NUMBER = "buildNumber";
    private static Boolean isCrashedLastRun;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;", "", "(Ljava/lang/String;I)V", "INFO", "WARNING", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum ErrorLevel {
        INFO,
        WARNING
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorLevel.values().length];
            try {
                iArr[ErrorLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CrashReporting() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addBreadcrumb$default(CrashReporting crashReporting, String str, Map map, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = v.h();
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        crashReporting.addBreadcrumb(str, map, str2);
    }

    public static /* synthetic */ void captureMessage$default(CrashReporting crashReporting, String str, String str2, ErrorLevel errorLevel, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            errorLevel = ErrorLevel.INFO;
        }
        crashReporting.captureMessage(str, str2, errorLevel);
    }

    public static final void captureMessage$lambda$1(String tag, String message, ErrorLevel errorLevel, Scope SentryScope) {
        List<String> d10;
        n3 n3Var;
        q.g(tag, "$tag");
        q.g(message, "$message");
        q.g(errorLevel, "$errorLevel");
        q.g(SentryScope, "SentryScope");
        d10 = i.d(tag);
        SentryScope.v(d10);
        int i10 = WhenMappings.$EnumSwitchMapping$0[errorLevel.ordinal()];
        if (i10 == 1) {
            n3Var = n3.INFO;
        } else if (i10 == 2) {
            n3Var = n3.WARNING;
        } else {
            throw new kg.q();
        }
        k2.h(message, n3Var);
    }

    public static final void init$lambda$0(Context context, SentryAndroidOptions options) {
        q.g(context, "$context");
        q.g(options, "options");
        options.setDsn("https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375");
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        options.setEnvironment(clientInfo.getReleaseChannel());
        options.setDist(clientInfo.getVersionCode());
        options.setRelease("discord_android@184.12.0-2+184212");
        File cacheDir = context.getCacheDir();
        options.setCacheDirPath(cacheDir + "/sentry");
        options.setEnableActivityLifecycleTracingAutoFinish(false);
        options.setEnableAutoActivityLifecycleTracing(false);
        CrashReporting crashReporting = INSTANCE;
        options.setTracesSampleRate(Double.valueOf(crashReporting.getTracingSampleRate()));
        options.setSampleRate(Double.valueOf(crashReporting.getSampleRate()));
        options.setProguardUuid("327a52e0-5251-4237-a800-c49b39079b77");
        options.setTag(TAG_BUILD_NUMBER, clientInfo.getVersionCode());
        options.setTag(TAG_APP_VERSION, clientInfo.getVersionName());
    }

    public final void addBreadcrumb(String breadcrumbMessage, Map<String, String> breadcrumbData, String str) {
        q.g(breadcrumbMessage, "breadcrumbMessage");
        q.g(breadcrumbData, "breadcrumbData");
        d dVar = new d(breadcrumbMessage);
        for (Map.Entry<String, String> entry : breadcrumbData.entrySet()) {
            dVar.m(entry.getKey(), entry.getValue());
        }
        dVar.l(str);
        Log.i$default(Log.INSTANCE, "SentryBreadcrumb", breadcrumbMessage, (Throwable) null, 4, (Object) null);
        k2.b(dVar);
    }

    public final void captureException(Throwable throwable) {
        String b10;
        q.g(throwable, "throwable");
        Log log = Log.INSTANCE;
        b10 = f.b(throwable);
        Log.e$default(log, "SentryBreadcrumb", b10, (Throwable) null, 4, (Object) null);
        k2.f(throwable);
    }

    public final void captureMessage(final String tag, final String message, final ErrorLevel errorLevel) {
        q.g(tag, "tag");
        q.g(message, "message");
        q.g(errorLevel, "errorLevel");
        int i10 = WhenMappings.$EnumSwitchMapping$0[errorLevel.ordinal()];
        if (i10 == 1) {
            Log.i$default(Log.INSTANCE, tag, message, (Throwable) null, 4, (Object) null);
        } else if (i10 == 2) {
            Log.w$default(Log.INSTANCE, tag, message, (Throwable) null, 4, (Object) null);
        }
        k2.x(new b2() { // from class: com.discord.crash_reporting.b
            @Override // io.sentry.b2
            public final void a(Scope scope) {
                CrashReporting.captureMessage$lambda$1(tag, message, errorLevel, scope);
            }
        });
    }

    public final double getSampleRate() {
        return isProductionChannel() ? 0.05d : 1.0d;
    }

    public final double getTracingSampleRate() {
        boolean M;
        M = oj.v.M(ClientInfo.INSTANCE.getReleaseChannel(), BuildConfig.FLAVOR, false, 2, null);
        return M ? 0.05d : 0.0d;
    }

    public final void init(final Context context) {
        boolean z10;
        boolean M;
        q.g(context, "context");
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        if (clientInfo.isDebugBuild() || clientInfo.isDeveloperBuild()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (isProductionChannel()) {
                String DEVICE = Build.DEVICE;
                q.f(DEVICE, "DEVICE");
                M = oj.v.M(DEVICE, "vivo", false, 2, null);
                if (M) {
                    return;
                }
            }
            b1.f(context, new k2.a() { // from class: com.discord.crash_reporting.a
                @Override // io.sentry.k2.a
                public final void a(o3 o3Var) {
                    CrashReporting.init$lambda$0(context, (SentryAndroidOptions) o3Var);
                }
            });
            isCrashedLastRun = k2.q();
        }
    }

    public final Boolean isCrashedLastRun() {
        return isCrashedLastRun;
    }

    public final boolean isProductionChannel() {
        boolean M;
        boolean M2;
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        M = oj.v.M(clientInfo.getReleaseChannel(), "beta", false, 2, null);
        if (M) {
            return false;
        }
        M2 = oj.v.M(clientInfo.getReleaseChannel(), BuildConfig.FLAVOR, false, 2, null);
        return !M2;
    }

    public final void captureMessage(String tag, Exception exception) {
        q.g(tag, "tag");
        q.g(exception, "exception");
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        captureMessage$default(this, tag, message, null, 4, null);
    }
}
