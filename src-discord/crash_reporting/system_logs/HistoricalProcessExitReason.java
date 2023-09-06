package com.discord.crash_reporting.system_logs;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import java.util.List;
import java.util.Map;
import kf.x;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.q;
import lf.v;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason;", "", "()V", "exitReasonLookup", "", "", "", "lastReason", "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "context", "Landroid/content/Context;", "Reason", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class HistoricalProcessExitReason {
    public static final HistoricalProcessExitReason INSTANCE = new HistoricalProcessExitReason();
    private static final Map<Integer, String> exitReasonLookup;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "", "reason", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Reason {
        private final String description;
        private final String reason;

        public Reason(String reason, String str) {
            q.h(reason, "reason");
            this.reason = reason;
            this.description = str;
        }

        public static  Reason copy$default(Reason reason, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = reason.reason;
            }
            if ((i10 & 2) != 0) {
                str2 = reason.description;
            }
            return reason.copy(str, str2);
        }

        public final String component1() {
            return this.reason;
        }

        public final String component2() {
            return this.description;
        }

        public final Reason copy(String reason, String str) {
            q.h(reason, "reason");
            return new Reason(reason, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reason)) {
                return false;
            }
            Reason reason = (Reason) obj;
            return q.c(this.reason, reason.reason) && q.c(this.description, reason.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.description;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.reason;
            String str2 = this.description;
            return "Reason(reason=" + str + ", description=" + str2 + ")";
        }
    }

    static {
        Map<Integer, String> map;
        if (Build.VERSION.SDK_INT < 30) {
            map = v.h();
        } else {
            map = v.k(x.a(6, "ANR"), x.a(4, "CRASH"), x.a(5, "CRASH_NATIVE"), x.a(12, "DEPENDENCY_DIED"), x.a(9, "EXCESSIVE_RESOURCE_USAGE"), x.a(1, "EXIT_SELF"), x.a(7, "INITIALIZATION_FAILURE"), x.a(3, "LOW_MEMORY"), x.a(13, "OTHER"), x.a(8, "PERMISSION_CHANGE"), x.a(2, "SIGNALED"), x.a(0, "UNKNOWN"), x.a(10, "USER_REQUESTED"), x.a(11, "USER_STOPPED"));
        }
        exitReasonLookup = map;
    }

    private HistoricalProcessExitReason() {
    }

    public final Reason lastReason(Context context) {
        ActivityManager activityManager;
        List historicalProcessExitReasons;
        Object U;
        int reason;
        String description;
        int reason2;
        q.h(context, "context");
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null) {
            return null;
        }
        historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 1);
        q.g(historicalProcessExitReasons, "activityManager.getHisto…ssExitReasons(null, 0, 1)");
        U = r.U(historicalProcessExitReasons);
        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) U;
        if (applicationExitInfo == null) {
            return null;
        }
        Map<Integer, String> map = exitReasonLookup;
        reason = applicationExitInfo.getReason();
        String str = map.get(Integer.valueOf(reason));
        if (str == null) {
            reason2 = applicationExitInfo.getReason();
            str = "Unknown " + reason2;
        }
        description = applicationExitInfo.getDescription();
        return new Reason(str, description);
    }
}
