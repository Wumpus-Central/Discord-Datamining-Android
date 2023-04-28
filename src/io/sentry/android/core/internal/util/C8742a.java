package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import io.sentry.transport.AbstractC9079o;

/* renamed from: io.sentry.android.core.internal.util.a */
/* loaded from: classes8.dex */
public final class C8742a implements AbstractC9079o {

    /* renamed from: a */
    private static final AbstractC9079o f19326a = new C8742a();

    private C8742a() {
    }

    /* renamed from: b */
    public static AbstractC9079o m18225b() {
        return f19326a;
    }

    @Override // io.sentry.transport.AbstractC9079o
    /* renamed from: a */
    public long mo17116a() {
        return SystemClock.uptimeMillis();
    }
}
