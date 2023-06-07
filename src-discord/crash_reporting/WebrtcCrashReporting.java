package com.discord.crash_reporting;

import io.sentry.k2;

/* loaded from: classes7.dex */
class WebrtcCrashReporting {
    WebrtcCrashReporting() {
    }

    static String reportWebrtcException(Throwable th2) {
        k2.f(th2);
        return th2.toString();
    }
}
