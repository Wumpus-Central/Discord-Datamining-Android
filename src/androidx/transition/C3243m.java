package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.m */
/* loaded from: classes.dex */
class C3243m implements AbstractC3239k {

    /* renamed from: l */
    private static Class<?> f5121l;

    /* renamed from: m */
    private static boolean f5122m;

    /* renamed from: n */
    private static Method f5123n;

    /* renamed from: o */
    private static boolean f5124o;

    /* renamed from: p */
    private static Method f5125p;

    /* renamed from: q */
    private static boolean f5126q;

    /* renamed from: k */
    private final View f5127k;

    private C3243m(View view) {
        this.f5127k = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC3239k m34878b(View view, ViewGroup viewGroup, Matrix matrix) {
        m34877c();
        Method method = f5123n;
        if (method != null) {
            try {
                return new C3243m((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    private static void m34877c() {
        if (!f5124o) {
            try {
                m34876d();
                Method declaredMethod = f5121l.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                f5123n = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
            }
            f5124o = true;
        }
    }

    /* renamed from: d */
    private static void m34876d() {
        if (!f5122m) {
            try {
                f5121l = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
            }
            f5122m = true;
        }
    }

    /* renamed from: e */
    private static void m34875e() {
        if (!f5126q) {
            try {
                m34876d();
                Method declaredMethod = f5121l.getDeclaredMethod("removeGhost", View.class);
                f5125p = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
            }
            f5126q = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m34874f(View view) {
        m34875e();
        Method method = f5125p;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // androidx.transition.AbstractC3239k
    /* renamed from: a */
    public void mo34869a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.AbstractC3239k
    public void setVisibility(int i) {
        this.f5127k.setVisibility(i);
    }
}
