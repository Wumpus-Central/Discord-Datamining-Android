package io.sentry.android.core.internal.util;

import android.os.Looper;
import io.sentry.protocol.C9013v;

/* renamed from: io.sentry.android.core.internal.util.e */
/* loaded from: classes8.dex */
public final class C8747e {
    /* renamed from: a */
    public static boolean m18216a() {
        return m18213d(Thread.currentThread());
    }

    /* renamed from: b */
    private static boolean m18215b(long j) {
        return Looper.getMainLooper().getThread().getId() == j;
    }

    /* renamed from: c */
    public static boolean m18214c(C9013v vVar) {
        Long i = vVar.m17259i();
        if (i == null || !m18215b(i.longValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m18213d(Thread thread) {
        return m18215b(thread.getId());
    }
}
