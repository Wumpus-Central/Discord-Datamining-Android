package com.discord.crash_reporting;

import android.content.Context;
import android.os.Build;
import com.discord.BuildConfig;
import com.discord.client_info.ClientInfo;
import com.discord.logging.Log;
import io.sentry.AbstractC8807b2;
import io.sentry.C8843d;
import io.sentry.C8915k2;
import io.sentry.C8951o3;
import io.sentry.EnumC8942n3;
import io.sentry.Scope;
import io.sentry.android.core.C8702b1;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9905i;
import kotlin.jvm.internal.C9971q;
import nf.C11067f;
import nf.C11088q;
import p267of.C11289v;
import p326ri.C12719v;

@Metadata(m15074d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001#B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006$"}, m15073d2 = {"Lcom/discord/crash_reporting/CrashReporting;", "", "()V", "TAG_APP_VERSION", "", "TAG_BUILD_NUMBER", "<set-?>", "", "isCrashedLastRun", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "addBreadcrumb", "", "breadcrumbMessage", "breadcrumbData", "", "breadcrumbCategory", "captureException", "throwable", "", "captureMessage", "tag", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "errorLevel", "Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;", "getSampleRate", "", "getTracingSampleRate", "init", "context", "Landroid/content/Context;", "isProductionChannel", "ErrorLevel", "crash_reporting_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class CrashReporting {
    public static final CrashReporting INSTANCE = new CrashReporting();
    private static final String TAG_APP_VERSION = "appVersion";
    private static final String TAG_BUILD_NUMBER = "buildNumber";
    private static Boolean isCrashedLastRun;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;", "", "(Ljava/lang/String;I)V", "INFO", "WARNING", "crash_reporting_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public enum ErrorLevel {
        INFO,
        WARNING
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
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
    public static /* synthetic */ void addBreadcrumb$default(CrashReporting crashReporting, String str, Map map, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            map = C11289v.m10251h();
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        crashReporting.addBreadcrumb(str, map, str2);
    }

    public static /* synthetic */ void captureMessage$default(CrashReporting crashReporting, String str, String str2, ErrorLevel errorLevel, int i, Object obj) {
        if ((i & 4) != 0) {
            errorLevel = ErrorLevel.INFO;
        }
        crashReporting.captureMessage(str, str2, errorLevel);
    }

    public static final void captureMessage$lambda$1(String tag, String message, ErrorLevel errorLevel, Scope SentryScope) {
        List<String> d;
        EnumC8942n3 n3Var;
        C9971q.m14633g(tag, "$tag");
        C9971q.m14633g(message, "$message");
        C9971q.m14633g(errorLevel, "$errorLevel");
        C9971q.m14633g(SentryScope, "SentryScope");
        d = C9905i.m14825d(tag);
        SentryScope.m18372v(d);
        int i = WhenMappings.$EnumSwitchMapping$0[errorLevel.ordinal()];
        if (i == 1) {
            n3Var = EnumC8942n3.INFO;
        } else if (i == 2) {
            n3Var = EnumC8942n3.WARNING;
        } else {
            throw new C11088q();
        }
        C8915k2.m17706h(message, n3Var);
    }

    public static final void init$lambda$0(Context context, SentryAndroidOptions options) {
        C9971q.m14633g(context, "$context");
        C9971q.m14633g(options, "options");
        options.setDsn("https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375");
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        options.setEnvironment(clientInfo.getReleaseChannel());
        options.setDist(clientInfo.getVersionCode());
        options.setRelease("discord_android@177.5.0-2+177205");
        File cacheDir = context.getCacheDir();
        options.setCacheDirPath(cacheDir + "/sentry");
        options.setEnableActivityLifecycleTracingAutoFinish(false);
        options.setEnableAutoActivityLifecycleTracing(false);
        CrashReporting crashReporting = INSTANCE;
        options.setTracesSampleRate(Double.valueOf(crashReporting.getTracingSampleRate()));
        options.setSampleRate(Double.valueOf(crashReporting.getSampleRate()));
        options.setProguardUuid("0bd9f430-9d85-48d5-862f-cb6473a3a58a");
        options.setTag(TAG_BUILD_NUMBER, clientInfo.getVersionCode());
        options.setTag(TAG_APP_VERSION, clientInfo.getVersionName());
    }

    public final void addBreadcrumb(String breadcrumbMessage, Map<String, String> breadcrumbData, String str) {
        C9971q.m14633g(breadcrumbMessage, "breadcrumbMessage");
        C9971q.m14633g(breadcrumbData, "breadcrumbData");
        C8843d dVar = new C8843d(breadcrumbMessage);
        for (Map.Entry<String, String> entry : breadcrumbData.entrySet()) {
            dVar.m17908m(entry.getKey(), entry.getValue());
        }
        dVar.m17909l(str);
        Log.i$default(Log.INSTANCE, "SentryBreadcrumb", breadcrumbMessage, (Throwable) null, 4, (Object) null);
        C8915k2.m17712b(dVar);
    }

    public final void captureException(Throwable throwable) {
        String b;
        C9971q.m14633g(throwable, "throwable");
        Log log = Log.INSTANCE;
        b = C11067f.m10980b(throwable);
        Log.e$default(log, "SentryBreadcrumb", b, (Throwable) null, 4, (Object) null);
        C8915k2.m17708f(throwable);
    }

    public final void captureMessage(final String tag, final String message, final ErrorLevel errorLevel) {
        C9971q.m14633g(tag, "tag");
        C9971q.m14633g(message, "message");
        C9971q.m14633g(errorLevel, "errorLevel");
        int i = WhenMappings.$EnumSwitchMapping$0[errorLevel.ordinal()];
        if (i == 1) {
            Log.i$default(Log.INSTANCE, tag, message, (Throwable) null, 4, (Object) null);
        } else if (i == 2) {
            Log.w$default(Log.INSTANCE, tag, message, (Throwable) null, 4, (Object) null);
        }
        C8915k2.m17690x(new AbstractC8807b2() { // from class: com.discord.crash_reporting.b
            @Override // io.sentry.AbstractC8807b2
            /* renamed from: a */
            public final void mo16755a(Scope scope) {
                CrashReporting.captureMessage$lambda$1(tag, message, errorLevel, scope);
            }
        });
    }

    public final double getSampleRate() {
        return isProductionChannel() ? 0.05d : 1.0d;
    }

    public final double getTracingSampleRate() {
        boolean M;
        M = C12719v.m5709M(ClientInfo.INSTANCE.getReleaseChannel(), BuildConfig.FLAVOR, false, 2, null);
        return M ? 0.05d : 0.0d;
    }

    public final void init(final Context context) {
        boolean z;
        boolean M;
        C9971q.m14633g(context, "context");
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        if (clientInfo.isDebugBuild() || clientInfo.isDeveloperBuild()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (isProductionChannel()) {
                String DEVICE = Build.DEVICE;
                C9971q.m14634f(DEVICE, "DEVICE");
                M = C12719v.m5709M(DEVICE, "vivo", false, 2, null);
                if (M) {
                    return;
                }
            }
            C8702b1.m18330f(context, new C8915k2.AbstractC8916a() { // from class: com.discord.crash_reporting.a
                @Override // io.sentry.C8915k2.AbstractC8916a
                /* renamed from: a */
                public final void mo17168a(C8951o3 o3Var) {
                    CrashReporting.init$lambda$0(context, (SentryAndroidOptions) o3Var);
                }
            });
            isCrashedLastRun = C8915k2.m17697q();
        }
    }

    public final Boolean isCrashedLastRun() {
        return isCrashedLastRun;
    }

    public final boolean isProductionChannel() {
        boolean M;
        boolean M2;
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        M = C12719v.m5709M(clientInfo.getReleaseChannel(), "beta", false, 2, null);
        if (M) {
            return false;
        }
        M2 = C12719v.m5709M(clientInfo.getReleaseChannel(), BuildConfig.FLAVOR, false, 2, null);
        return !M2;
    }

    public final void captureMessage(String tag, Exception exception) {
        C9971q.m14633g(tag, "tag");
        C9971q.m14633g(exception, "exception");
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        captureMessage$default(this, tag, message, null, 4, null);
    }
}
