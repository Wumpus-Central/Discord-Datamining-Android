package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: androidx.core.app.f */
/* loaded from: classes.dex */
public final class C2228f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f$a */
    /* loaded from: classes.dex */
    public static class C2229a {
        /* renamed from: a */
        static <T> T m38277a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: b */
        static int m38276b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        static int m38275c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        static String m38274d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: androidx.core.app.f$b */
    /* loaded from: classes.dex */
    static class C2230b {
        /* renamed from: a */
        static int m38273a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        static String m38272b(Context context) {
            String opPackageName;
            opPackageName = context.getOpPackageName();
            return opPackageName;
        }

        /* renamed from: c */
        static AppOpsManager m38271c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m38280a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m38279b(context, str, str2);
        }
        AppOpsManager c = C2230b.m38271c(context);
        int a = C2230b.m38273a(c, str, Binder.getCallingUid(), str2);
        if (a != 0) {
            return a;
        }
        return C2230b.m38273a(c, str, i, C2230b.m38272b(context));
    }

    /* renamed from: b */
    public static int m38279b(Context context, String str, String str2) {
        return C2229a.m38275c((AppOpsManager) C2229a.m38277a(context, AppOpsManager.class), str, str2);
    }

    /* renamed from: c */
    public static String m38278c(String str) {
        return C2229a.m38274d(str);
    }
}
