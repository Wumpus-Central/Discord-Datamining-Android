package com.discord.crash_reporting;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/discord/crash_reporting/CrashReportingCache;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cache", "Landroid/content/SharedPreferences;", "getCache", "()Landroid/content/SharedPreferences;", "isStaff", "", "setStaff", "", "Companion", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class CrashReportingCache {
    public static final Companion Companion = new Companion(null);
    private static CrashReportingCache instance;
    private final SharedPreferences cache;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/discord/crash_reporting/CrashReportingCache$Companion;", "", "()V", "instance", "Lcom/discord/crash_reporting/CrashReportingCache;", "getInstance", "context", "Landroid/content/Context;", "crash_reporting_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CrashReportingCache getInstance(Context context) {
            q.h(context, "context");
            if (CrashReportingCache.instance == null) {
                CrashReportingCache.instance = new CrashReportingCache(context);
            }
            CrashReportingCache crashReportingCache = CrashReportingCache.instance;
            q.e(crashReportingCache);
            return crashReportingCache;
        }
    }

    public CrashReportingCache(Context context) {
        q.h(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("crash_reporting", 0);
        q.g(sharedPreferences, "context.getSharedPrefere…g\", Context.MODE_PRIVATE)");
        this.cache = sharedPreferences;
    }

    public final SharedPreferences getCache() {
        return this.cache;
    }

    public final boolean isStaff() {
        return this.cache.getBoolean("staff", false);
    }

    public final void setStaff(boolean z10) {
        SharedPreferences.Editor editor = this.cache.edit();
        q.g(editor, "editor");
        editor.putBoolean("staff", z10);
        editor.apply();
    }
}
