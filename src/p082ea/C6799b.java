package p082ea;

import android.content.Context;
import ca.C3803j;

/* renamed from: ea.b */
/* loaded from: classes5.dex */
public class C6799b {

    /* renamed from: a */
    private static Context f14518a;

    /* renamed from: b */
    private static Boolean f14519b;

    /* renamed from: a */
    public static synchronized boolean m24311a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (C6799b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f14518a;
            if (!(context2 == null || (bool = f14519b) == null || context2 != applicationContext)) {
                return bool.booleanValue();
            }
            f14519b = null;
            if (C3803j.m33559h()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f14519b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f14519b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f14519b = Boolean.FALSE;
                }
            }
            f14518a = applicationContext;
            return f14519b.booleanValue();
        }
    }
}
