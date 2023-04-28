package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: androidx.transition.w0 */
/* loaded from: classes.dex */
class C3268w0 extends C3260s0 {

    /* renamed from: d */
    private static boolean f5154d = true;

    /* renamed from: e */
    private static boolean f5155e = true;

    /* renamed from: f */
    private static boolean f5156f = true;

    @Override // androidx.transition.C3194c1
    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo34825d(View view, Matrix matrix) {
        if (f5154d) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f5154d = false;
            }
        }
    }

    @Override // androidx.transition.C3194c1
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo34824h(View view, Matrix matrix) {
        if (f5155e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f5155e = false;
            }
        }
    }

    @Override // androidx.transition.C3194c1
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo34823i(View view, Matrix matrix) {
        if (f5156f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f5156f = false;
            }
        }
    }
}
