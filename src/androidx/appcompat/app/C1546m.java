package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.app.m */
/* loaded from: classes.dex */
class C1546m {

    /* renamed from: a */
    private static Field f821a;

    /* renamed from: b */
    private static boolean f822b;

    /* renamed from: c */
    private static Class<?> f823c;

    /* renamed from: d */
    private static boolean f824d;

    /* renamed from: e */
    private static Field f825e;

    /* renamed from: f */
    private static boolean f826f;

    /* renamed from: g */
    private static Field f827g;

    /* renamed from: h */
    private static boolean f828h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m40778a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m40776c(resources);
            } else {
                m40777b(resources);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m40777b(android.content.res.Resources r4) {
        /*
            boolean r0 = androidx.appcompat.app.C1546m.f822b
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L_0x001d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: NoSuchFieldException -> 0x0015
            androidx.appcompat.app.C1546m.f821a = r2     // Catch: NoSuchFieldException -> 0x0015
            r2.setAccessible(r0)     // Catch: NoSuchFieldException -> 0x0015
            goto L_0x001b
        L_0x0015:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L_0x001b:
            androidx.appcompat.app.C1546m.f822b = r0
        L_0x001d:
            java.lang.reflect.Field r0 = androidx.appcompat.app.C1546m.f821a
            if (r0 == 0) goto L_0x002c
            java.lang.Object r4 = r0.get(r4)     // Catch: IllegalAccessException -> 0x0026
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
        L_0x002c:
            r4 = 0
        L_0x002d:
            if (r4 != 0) goto L_0x0030
            return
        L_0x0030:
            m40775d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C1546m.m40777b(android.content.res.Resources):void");
    }

    /* renamed from: c */
    private static void m40776c(Resources resources) {
        Object obj;
        if (!f828h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f827g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f828h = true;
        }
        Field field = f827g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f822b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f821a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f822b = true;
                }
                Field field2 = f821a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m40775d(obj2);
                }
            }
        }
    }

    /* renamed from: d */
    private static void m40775d(Object obj) {
        LongSparseArray longSparseArray;
        if (!f824d) {
            try {
                f823c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f824d = true;
        }
        Class<?> cls = f823c;
        if (cls != null) {
            if (!f826f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f825e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f826f = true;
            }
            Field field = f825e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
