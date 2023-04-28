package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;
import io.sentry.util.C9111k;

/* renamed from: io.sentry.android.core.internal.util.f */
/* loaded from: classes8.dex */
public final class C8748f {
    /* renamed from: a */
    public static boolean m18212a(Context context, String str) {
        C9111k.m16995a(context, "The application context is required.");
        if (context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        return false;
    }
}
