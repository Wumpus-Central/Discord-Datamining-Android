package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p043cb.C3810a;

/* renamed from: com.google.firebase.messaging.a1 */
/* loaded from: classes3.dex */
final class C5811a1 {

    /* renamed from: a */
    private static final long f11547a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f11548b = new Object();

    /* renamed from: c */
    private static C3810a f11549c;

    /* renamed from: a */
    private static void m27241a(Context context) {
        if (f11549c == null) {
            C3810a aVar = new C3810a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f11549c = aVar;
            aVar.m33543d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m27240b(Intent intent) {
        synchronized (f11548b) {
            if (f11549c != null && m27239c(intent)) {
                m27238d(intent, false);
                f11549c.m33544c();
            }
        }
    }

    /* renamed from: c */
    static boolean m27239c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: d */
    private static void m27238d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static ComponentName m27237e(Context context, Intent intent) {
        synchronized (f11548b) {
            m27241a(context);
            boolean c = m27239c(intent);
            m27238d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!c) {
                f11549c.m33546a(f11547a);
            }
            return startService;
        }
    }
}
