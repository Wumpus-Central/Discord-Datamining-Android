package com.discord.crash_reporting;

import io.sentry.d3;


class WebrtcCrashReporting {
    WebrtcCrashReporting() {
    }

    static String reportWebrtcException(Throwable th2) {
        d3.g(th2);
        return th2.toString();
    }
}
