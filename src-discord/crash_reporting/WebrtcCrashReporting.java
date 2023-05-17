package com.discord.crash_reporting;

import io.sentry.j2;

/* loaded from: classes5.dex */
class WebrtcCrashReporting {
    WebrtcCrashReporting() {
    }

    static String reportWebrtcException(Throwable th2) {
        j2.f(th2);
        return th2.toString();
    }
}
