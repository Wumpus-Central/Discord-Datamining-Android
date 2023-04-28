package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.e */
/* loaded from: classes.dex */
public final class C2219e {

    /* renamed from: a */
    protected static final Class<?> f3195a;

    /* renamed from: d */
    protected static final Method f3198d;

    /* renamed from: e */
    protected static final Method f3199e;

    /* renamed from: f */
    protected static final Method f3200f;

    /* renamed from: g */
    private static final Handler f3201g = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    protected static final Field f3196b = m38292b();

    /* renamed from: c */
    protected static final Field f3197c = m38288f();

    /* renamed from: androidx.core.app.e$a */
    /* loaded from: classes.dex */
    class RunnableC2220a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C2223d f3202k;

        /* renamed from: l */
        final /* synthetic */ Object f3203l;

        RunnableC2220a(C2223d dVar, Object obj) {
            this.f3202k = dVar;
            this.f3203l = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3202k.f3208k = this.f3203l;
        }
    }

    /* renamed from: androidx.core.app.e$b */
    /* loaded from: classes.dex */
    class RunnableC2221b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Application f3204k;

        /* renamed from: l */
        final /* synthetic */ C2223d f3205l;

        RunnableC2221b(Application application, C2223d dVar) {
            this.f3204k = application;
            this.f3205l = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3204k.unregisterActivityLifecycleCallbacks(this.f3205l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.e$c */
    /* loaded from: classes.dex */
    public class RunnableC2222c implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Object f3206k;

        /* renamed from: l */
        final /* synthetic */ Object f3207l;

        RunnableC2222c(Object obj, Object obj2) {
            this.f3206k = obj;
            this.f3207l = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C2219e.f3198d;
                if (method != null) {
                    method.invoke(this.f3206k, this.f3207l, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C2219e.f3199e.invoke(this.f3206k, this.f3207l, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* renamed from: androidx.core.app.e$d */
    /* loaded from: classes.dex */
    private static final class C2223d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: k */
        Object f3208k;

        /* renamed from: l */
        private Activity f3209l;

        /* renamed from: m */
        private final int f3210m;

        /* renamed from: n */
        private boolean f3211n = false;

        /* renamed from: o */
        private boolean f3212o = false;

        /* renamed from: p */
        private boolean f3213p = false;

        C2223d(Activity activity) {
            this.f3209l = activity;
            this.f3210m = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3209l == activity) {
                this.f3209l = null;
                this.f3212o = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.f3212o && !this.f3213p && !this.f3211n && C2219e.m38286h(this.f3208k, this.f3210m, activity)) {
                this.f3213p = true;
                this.f3208k = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3209l == activity) {
                this.f3211n = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m38293a();
        f3195a = a;
        f3198d = m38290d(a);
        f3199e = m38291c(a);
        f3200f = m38289e(a);
    }

    /* renamed from: a */
    private static Class<?> m38293a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m38292b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m38291c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m38290d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m38289e(Class<?> cls) {
        if (m38287g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m38288f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m38287g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m38286h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f3197c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f3201g.postAtFrontOfQueue(new RunnableC2222c(f3196b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m38285i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m38287g() && f3200f == null) {
            return false;
        } else {
            if (f3199e == null && f3198d == null) {
                return false;
            }
            try {
                Object obj2 = f3197c.get(activity);
                if (obj2 == null || (obj = f3196b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C2223d dVar = new C2223d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f3201g;
                handler.post(new RunnableC2220a(dVar, obj2));
                if (m38287g()) {
                    Method method = f3200f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC2221b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
