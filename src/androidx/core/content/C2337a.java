package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import androidx.core.content.res.C2367h;
import androidx.core.p018os.C2442g;
import androidx.core.util.C2513d;
import java.io.File;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.content.a */
/* loaded from: classes.dex */
public class C2337a {

    /* renamed from: a */
    private static final Object f3232a = new Object();

    /* renamed from: b */
    private static final Object f3233b = new Object();

    /* renamed from: androidx.core.content.a$a */
    /* loaded from: classes.dex */
    static class C0035a {
        /* renamed from: a */
        static void m38125a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m38124b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    /* loaded from: classes.dex */
    static class C2338b {
        /* renamed from: a */
        static File[] m38123a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m38122b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m38121c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: androidx.core.content.a$c */
    /* loaded from: classes.dex */
    static class C2339c {
        /* renamed from: a */
        static File m38120a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m38119b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m38118c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$d */
    /* loaded from: classes.dex */
    static class C2340d {
        /* renamed from: a */
        static int m38117a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static <T> T m38116b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: c */
        static String m38115c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.a$e */
    /* loaded from: classes.dex */
    static class C2341e {
        /* renamed from: a */
        static Context m38114a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext;
        }

        /* renamed from: b */
        static File m38113b(Context context) {
            File dataDir;
            dataDir = context.getDataDir();
            return dataDir;
        }

        /* renamed from: c */
        static boolean m38112c(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    /* renamed from: androidx.core.content.a$f */
    /* loaded from: classes.dex */
    static class C2342f {
        /* renamed from: a */
        static Executor m38111a(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    /* renamed from: a */
    public static int m38137a(Context context, String str) {
        C2513d.m37598d(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    /* renamed from: b */
    public static Context m38136b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2341e.m38114a(context);
        }
        return null;
    }

    /* renamed from: c */
    public static int m38135c(Context context, int i) {
        return C2340d.m38117a(context, i);
    }

    /* renamed from: d */
    public static ColorStateList m38134d(Context context, int i) {
        return C2367h.m37985e(context.getResources(), i, context.getTheme());
    }

    /* renamed from: e */
    public static Drawable m38133e(Context context, int i) {
        return C2339c.m38119b(context, i);
    }

    /* renamed from: f */
    public static File[] m38132f(Context context) {
        return C2338b.m38123a(context);
    }

    /* renamed from: g */
    public static File[] m38131g(Context context, String str) {
        return C2338b.m38122b(context, str);
    }

    /* renamed from: h */
    public static Executor m38130h(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2342f.m38111a(context);
        }
        return C2442g.m37737a(new Handler(context.getMainLooper()));
    }

    /* renamed from: i */
    public static File m38129i(Context context) {
        return C2339c.m38118c(context);
    }

    /* renamed from: j */
    public static <T> T m38128j(Context context, Class<T> cls) {
        return (T) C2340d.m38116b(context, cls);
    }

    /* renamed from: k */
    public static boolean m38127k(Context context, Intent[] intentArr, Bundle bundle) {
        C0035a.m38125a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: l */
    public static void m38126l(Context context, Intent intent, Bundle bundle) {
        C0035a.m38124b(context, intent, bundle);
    }
}
