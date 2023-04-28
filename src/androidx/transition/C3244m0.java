package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.m0 */
/* loaded from: classes.dex */
class C3244m0 {

    /* renamed from: a */
    private static boolean f5128a = true;

    /* renamed from: b */
    private static Method f5129b;

    /* renamed from: c */
    private static boolean f5130c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m34873a(ViewGroup viewGroup, int i) {
        int childDrawingOrder;
        if (Build.VERSION.SDK_INT >= 29) {
            childDrawingOrder = viewGroup.getChildDrawingOrder(i);
            return childDrawingOrder;
        }
        if (!f5130c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f5129b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f5130c = true;
        }
        Method method = f5129b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC3238j0 m34872b(ViewGroup viewGroup) {
        return new C3232i0(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private static void m34871c(ViewGroup viewGroup, boolean z) {
        if (f5128a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f5128a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m34870d(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m34871c(viewGroup, z);
        }
    }
}
