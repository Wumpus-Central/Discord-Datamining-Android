package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

/* renamed from: androidx.camera.core.impl.utils.j */
/* loaded from: classes.dex */
public final class C1849j {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.impl.utils.j$a */
    /* loaded from: classes.dex */
    public static class C1850a {
        /* renamed from: a */
        static Context m39675a(Context context, String str) {
            Context createAttributionContext;
            createAttributionContext = context.createAttributionContext(str);
            return createAttributionContext;
        }

        /* renamed from: b */
        static String m39674b(Context context) {
            String attributionTag;
            attributionTag = context.getAttributionTag();
            return attributionTag;
        }
    }

    /* renamed from: a */
    public static Context m39678a(Context context) {
        String b;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT < 30 || (b = C1850a.m39674b(context)) == null) {
            return applicationContext;
        }
        return C1850a.m39675a(applicationContext, b);
    }

    /* renamed from: b */
    public static Application m39677b(Context context) {
        for (Context a = m39678a(context); a instanceof ContextWrapper; a = m39676c((ContextWrapper) a)) {
            if (a instanceof Application) {
                return (Application) a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Context m39676c(ContextWrapper contextWrapper) {
        String b;
        Context baseContext = contextWrapper.getBaseContext();
        if (Build.VERSION.SDK_INT < 30 || (b = C1850a.m39674b(contextWrapper)) == null) {
            return baseContext;
        }
        return C1850a.m39675a(baseContext, b);
    }
}
