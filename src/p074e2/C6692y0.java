package p074e2;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: e2.y0 */
/* loaded from: classes.dex */
public class C6692y0 {
    /* renamed from: a */
    public static Object m24637a(Class cls) {
        try {
            return cls.newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Object m24636b(String str) {
        Class d = m24634d(str);
        if (d == null) {
            return null;
        }
        return m24637a(d);
    }

    /* renamed from: c */
    public static Object m24635c(String str, Class[] clsArr, Object... objArr) {
        try {
            return Class.forName(str).getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Class m24634d(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Object m24633e(Context context) {
        return m24627k("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Map<String, String> m24632f(Context context, AbstractC6608c0 c0Var) {
        try {
            Object k = m24627k("com.adjust.sdk.imei.Util", "getImeiParameters", new Class[]{Context.class, AbstractC6608c0.class}, context, c0Var);
            if (k == null || !Map.class.isInstance(k)) {
                return null;
            }
            return (Map) k;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Map<String, String> m24631g(Context context, AbstractC6608c0 c0Var) {
        try {
            Object k = m24627k("com.adjust.sdk.oaid.Util", "getOaidParameters", new Class[]{Context.class, AbstractC6608c0.class}, context, c0Var);
            if (k == null || !Map.class.isInstance(k)) {
                return null;
            }
            return (Map) k;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m24630h(Context context, Object obj) {
        try {
            return (String) m24629i(obj, "getId", null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Object m24629i(Object obj, String str, Class[] clsArr, Object... objArr) {
        return m24628j(obj.getClass(), str, obj, clsArr, objArr);
    }

    /* renamed from: j */
    public static Object m24628j(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) {
        Method method = cls.getMethod(str, clsArr);
        if (method == null) {
            return null;
        }
        return method.invoke(obj, objArr);
    }

    /* renamed from: k */
    public static Object m24627k(String str, String str2, Class[] clsArr, Object... objArr) {
        return m24628j(Class.forName(str), str2, null, clsArr, objArr);
    }

    /* renamed from: l */
    public static Boolean m24626l(Context context, Object obj) {
        try {
            boolean z = false;
            Boolean bool = (Boolean) m24629i(obj, "isLimitAdTrackingEnabled", null, new Object[0]);
            if (bool == null) {
                return null;
            }
            if (!bool.booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }
}
