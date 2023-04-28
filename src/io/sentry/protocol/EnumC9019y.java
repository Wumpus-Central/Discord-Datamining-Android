package io.sentry.protocol;

import java.util.Locale;

/* renamed from: io.sentry.protocol.y */
/* loaded from: classes8.dex */
public enum EnumC9019y {
    CUSTOM,
    URL,
    ROUTE,
    VIEW,
    COMPONENT,
    TASK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
