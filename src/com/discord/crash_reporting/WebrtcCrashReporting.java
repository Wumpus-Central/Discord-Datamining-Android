package com.discord.crash_reporting;

import io.sentry.C8915k2;

/* loaded from: classes4.dex */
class WebrtcCrashReporting {
    WebrtcCrashReporting() {
    }

    static String reportWebrtcException(Throwable th2) {
        C8915k2.m17708f(th2);
        return th2.toString();
    }
}
