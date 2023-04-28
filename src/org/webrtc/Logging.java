package org.webrtc;

import android.support.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import p163j$.util.Spliterator;

/* loaded from: classes8.dex */
public class Logging {
    @Nullable
    public static ExternalReporter externalReporter;
    private static final Logger fallbackLogger = createFallbackLogger();
    @Nullable
    private static Loggable loggable;
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.Logging$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$Logging$Severity;

        static {
            int[] iArr = new int[Severity.values().length];
            $SwitchMap$org$webrtc$Logging$Severity = iArr;
            try {
                iArr[Severity.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$Logging$Severity[Severity.LS_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$Logging$Severity[Severity.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public interface ExternalReporter {
        /* renamed from: e */
        void m9636e(String str, String str2, Throwable th2);
    }

    /* loaded from: classes8.dex */
    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    @Deprecated
    /* loaded from: classes8.dex */
    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(Spliterator.NONNULL),
        TRACE_TIMER(512),
        TRACE_STREAM(Spliterator.IMMUTABLE),
        TRACE_DEBUG(RecyclerView.ItemAnimator.FLAG_MOVED),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(8192),
        TRACE_ALL(65535);
        
        public final int level;

        TraceLevel(int i) {
            this.level = i;
        }
    }

    private static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    /* renamed from: d */
    public static void m9642d(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    /* renamed from: e */
    public static void m9641e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
        ExternalReporter externalReporter2 = externalReporter;
        if (externalReporter2 != null) {
            externalReporter2.m9636e(str, str2, null);
        }
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (Logging.class) {
            if (loggable == null) {
                nativeEnableLogToDebugOutput(severity.ordinal());
                loggingEnabled = true;
            } else {
                throw new IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
            }
        }
    }

    @Deprecated
    public static void enableTracing(String str, EnumSet<TraceLevel> enumSet) {
    }

    private static String getStackTraceString(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void injectLoggable(Loggable loggable2, Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
    }

    public static void log(Severity severity, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        } else if (loggable != null) {
            if (severity.ordinal() >= loggableSeverity.ordinal()) {
                loggable.onLogMessage(str2, severity, str);
            }
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
        } else {
            int i = AnonymousClass1.$SwitchMap$org$webrtc$Logging$Severity[severity.ordinal()];
            if (i == 1) {
                level = Level.SEVERE;
            } else if (i == 2) {
                level = Level.WARNING;
            } else if (i != 3) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            Logger logger = fallbackLogger;
            logger.log(level, str + ": " + str2);
        }
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i);

    private static native void nativeLog(int i, String str, String str2);

    /* renamed from: v */
    public static void m9639v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    /* renamed from: w */
    public static void m9638w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }

    /* renamed from: w */
    public static void m9637w(String str, String str2, Throwable th2) {
        Severity severity = Severity.LS_WARNING;
        log(severity, str, str2);
        log(severity, str, th2.toString());
        log(severity, str, getStackTraceString(th2));
    }

    /* renamed from: e */
    public static void m9640e(String str, String str2, Throwable th2) {
        Severity severity = Severity.LS_ERROR;
        log(severity, str, str2);
        log(severity, str, th2.toString());
        log(severity, str, getStackTraceString(th2));
        ExternalReporter externalReporter2 = externalReporter;
        if (externalReporter2 != null) {
            externalReporter2.m9636e(str, str2, th2);
        }
    }
}
