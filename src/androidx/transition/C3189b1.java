package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: androidx.transition.b1 */
/* loaded from: classes.dex */
class C3189b1 extends C3186a1 {
    @Override // androidx.transition.C3260s0, androidx.transition.C3194c1
    /* renamed from: b */
    public float mo34835b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // androidx.transition.C3268w0, androidx.transition.C3194c1
    /* renamed from: d */
    public void mo34825d(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.C3281y0, androidx.transition.C3194c1
    /* renamed from: e */
    public void mo34818e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.transition.C3260s0, androidx.transition.C3194c1
    /* renamed from: f */
    public void mo34833f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.C3186a1, androidx.transition.C3194c1
    /* renamed from: g */
    public void mo34953g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.C3268w0, androidx.transition.C3194c1
    /* renamed from: h */
    public void mo34824h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.C3268w0, androidx.transition.C3194c1
    /* renamed from: i */
    public void mo34823i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
