package com.discord.crash_reporting;

import android.content.Context;
import android.os.Build;
import com.discord.BuildConfig;
import com.discord.client_info.ClientInfo;
import com.discord.logging.Log;
import io.sentry.Scope;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.m1;
import io.sentry.d3;
import io.sentry.e;
import io.sentry.m4;
import io.sentry.r4;
import io.sentry.t2;
import java.io.File;
import java.util.List;
import java.util.Map;
import kf.f;
import kotlin.Metadata;
import kotlin.collections.i;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.q;
import kotlin.text.p;
import lf.v;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006#"}, d2 = {"Lcom/discord/crash_reporting/CrashReporting;", "", "()V", "TAG_APP_VERSION", "", "TAG_BUILD_NUMBER", "<set-?>", "", "isCrashedLastRun", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "addBreadcrumb", "", "breadcrumbMessage", "breadcrumbData", "", "breadcrumbCategory", "captureException", "throwable", "", "captureMessage", "tag", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "errorLevel", "Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;", "getSampleRate", "", "context", "Landroid/content/Context;", "getTracingSampleRate", "init", "ErrorLevel", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class CrashReporting {
    public static final CrashReporting INSTANCE = new CrashReporting();
    private static final String TAG_APP_VERSION = "appVersion";
    private static final String TAG_BUILD_NUMBER = "buildNumber";
    private static Boolean isCrashedLastRun;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;", "", "(Ljava/lang/String;I)V", "INFO", "WARNING", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public enum ErrorLevel {
        INFO,
        WARNING
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public  class WhenMappings {
        public static final  int[] $EnumSwitchMapping$0;

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

    
    public static  void addBreadcrumb$default(CrashReporting crashReporting, String str, Map map, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = v.h();
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        crashReporting.addBreadcrumb(str, map, str2);
    }

    public static  void captureMessage$default(CrashReporting crashReporting, String str, String str2, ErrorLevel errorLevel, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            errorLevel = ErrorLevel.INFO;
        }
        crashReporting.captureMessage(str, str2, errorLevel);
    }

    public static final void captureMessage$lambda$1(String tag, String message, ErrorLevel errorLevel, Scope SentryScope) {
        List<String> d10;
        m4 m4Var;
        q.h(tag, "$tag");
        q.h(message, "$message");
        q.h(errorLevel, "$errorLevel");
        q.h(SentryScope, "SentryScope");
        d10 = i.d(tag);
        SentryScope.z(d10);
        int i10 = WhenMappings.$EnumSwitchMapping$0[errorLevel.ordinal()];
        if (i10 == 1) {
            m4Var = m4.INFO;
        } else if (i10 == 2) {
            m4Var = m4.WARNING;
        } else {
            throw new kf.q();
        }
        d3.i(message, m4Var);
    }

    public static final void init$lambda$0(Ref$ObjectRef dsn, Context context, double d10, SentryAndroidOptions options) {
        q.h(dsn, "$dsn");
        q.h(context, "$context");
        q.h(options, "options");
        options.setDsn((String) dsn.f21463j);
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        options.setEnvironment(clientInfo.getReleaseChannel());
        options.setDist(clientInfo.getVersionCode());
        options.setRelease("discord_android@196.1.0-2+196201");
        File cacheDir = context.getCacheDir();
        options.setCacheDirPath(cacheDir + "/sentry");
        options.setEnableActivityLifecycleTracingAutoFinish(false);
        options.setEnableAutoActivityLifecycleTracing(false);
        options.setTracesSampleRate(Double.valueOf(INSTANCE.getTracingSampleRate()));
        options.setSampleRate(Double.valueOf(d10));
        options.setProguardUuid("6002b5b8-ba28-4a44-8ae5-0c5af8f5d599");
        options.setTag(TAG_BUILD_NUMBER, clientInfo.getVersionCode());
        options.setTag(TAG_APP_VERSION, clientInfo.getVersionName());
    }

    public final void addBreadcrumb(String breadcrumbMessage, Map<String, String> breadcrumbData, String str) {
        q.h(breadcrumbMessage, "breadcrumbMessage");
        q.h(breadcrumbData, "breadcrumbData");
        e eVar = new e(breadcrumbMessage);
        for (Map.Entry<String, String> entry : breadcrumbData.entrySet()) {
            eVar.m(entry.getKey(), entry.getValue());
        }
        eVar.l(str);
        Log.i$default(Log.INSTANCE, "SentryBreadcrumb", breadcrumbMessage, (Throwable) null, 4, (Object) null);
        d3.c(eVar);
    }

    public final void captureException(Throwable throwable) {
        String b10;
        q.h(throwable, "throwable");
        Log log = Log.INSTANCE;
        b10 = f.b(throwable);
        Log.e$default(log, "SentryBreadcrumb", b10, (Throwable) null, 4, (Object) null);
        d3.g(throwable);
    }

    public final void captureMessage(final String tag, final String message, final ErrorLevel errorLevel) {
        q.h(tag, "tag");
        q.h(message, "message");
        q.h(errorLevel, "errorLevel");
        int i10 = WhenMappings.$EnumSwitchMapping$0[errorLevel.ordinal()];
        if (i10 == 1) {
            Log.i$default(Log.INSTANCE, tag, message, (Throwable) null, 4, (Object) null);
        } else if (i10 == 2) {
            Log.w$default(Log.INSTANCE, tag, message, (Throwable) null, 4, (Object) null);
        }
        d3.B(new t2() { 
            @Override 
            public final void a(Scope scope) {
                CrashReporting.captureMessage$lambda$1(tag, message, errorLevel, scope);
            }
        });
    }

    public final double getSampleRate(Context context) {
        q.h(context, "context");
        if (ClientInfo.INSTANCE.isProdBuild() || CrashReportingCache.Companion.getInstance(context).isStaff()) {
            return 0.05d;
        }
        return 1.0d;
    }

    public final double getTracingSampleRate() {
        boolean M;
        M = p.M(ClientInfo.INSTANCE.getReleaseChannel(), BuildConfig.FLAVOR, false, 2, null);
        return M ? 0.05d : 0.0d;
    }

    
    public final void init(final Context context) {
        boolean z10;
        T t10;
        boolean M;
        q.h(context, "context");
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        if (clientInfo.isDebugBuild() || clientInfo.isDeveloperBuild()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (clientInfo.isProdBuild()) {
                String DEVICE = Build.DEVICE;
                q.g(DEVICE, "DEVICE");
                M = p.M(DEVICE, "vivo", false, 2, null);
                if (M) {
                    return;
                }
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (CrashReportingCache.Companion.getInstance(context).isStaff()) {
                t10 = "https:
            } else {
                t10 = "https:
            }
            ref$ObjectRef.f21463j = t10;
            final double sampleRate = getSampleRate(context);
            m1.f(context, new d3.a() { 
                @Override 
                public final void a(r4 r4Var) {
                    CrashReporting.init$lambda$0(Ref$ObjectRef.this, context, sampleRate, (SentryAndroidOptions) r4Var);
                }
            });
            isCrashedLastRun = d3.s();
        }
    }

    public final Boolean isCrashedLastRun() {
        return isCrashedLastRun;
    }

    public final void captureMessage(String tag, Exception exception) {
        q.h(tag, "tag");
        q.h(exception, "exception");
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        captureMessage$default(this, tag, message, null, 4, null);
    }
}
