package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: androidx.transition.c1 */
/* loaded from: classes.dex */
class C3194c1 {

    /* renamed from: a */
    private static Field f4991a;

    /* renamed from: b */
    private static boolean f4992b;

    /* renamed from: a */
    public void mo34836a(View view) {
        throw null;
    }

    /* renamed from: b */
    public float mo34835b(View view) {
        throw null;
    }

    /* renamed from: c */
    public void mo34834c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo34825d(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: e */
    public void mo34818e(View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    /* renamed from: f */
    public void mo34833f(View view, float f) {
        throw null;
    }

    /* renamed from: g */
    public void mo34953g(View view, int i) {
        if (!f4992b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4991a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f4992b = true;
        }
        Field field = f4991a;
        if (field != null) {
            try {
                f4991a.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo34824h(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: i */
    public void mo34823i(View view, Matrix matrix) {
        throw null;
    }
}
