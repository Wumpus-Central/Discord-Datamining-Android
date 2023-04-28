package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC3038j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements AbstractC3038j {

    /* renamed from: l */
    private static int f606l;

    /* renamed from: m */
    private static Field f607m;

    /* renamed from: n */
    private static Field f608n;

    /* renamed from: o */
    private static Field f609o;

    /* renamed from: k */
    private Activity f610k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f610k = activity;
    }

    /* renamed from: a */
    private static void m41008a() {
        try {
            f606l = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f608n = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f609o = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f607m = declaredField3;
            declaredField3.setAccessible(true);
            f606l = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.AbstractC3038j
    /* renamed from: c */
    public void mo34707c(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
        if (bVar == Lifecycle.EnumC3010b.ON_DESTROY) {
            if (f606l == 0) {
                m41008a();
            }
            if (f606l == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.f610k.getSystemService("input_method");
                try {
                    Object obj = f607m.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                try {
                                    View view = (View) f608n.get(inputMethodManager);
                                    if (view != null) {
                                        if (!view.isAttachedToWindow()) {
                                            try {
                                                f609o.set(inputMethodManager, null);
                                                inputMethodManager.isActive();
                                            } catch (IllegalAccessException unused) {
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            } catch (ClassCastException unused2) {
                            } catch (IllegalAccessException unused3) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused4) {
                }
            }
        }
    }
}
