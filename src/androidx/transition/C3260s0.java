package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: androidx.transition.s0 */
/* loaded from: classes.dex */
class C3260s0 extends C3194c1 {

    /* renamed from: c */
    private static boolean f5143c = true;

    @Override // androidx.transition.C3194c1
    /* renamed from: a */
    public void mo34836a(View view) {
    }

    @Override // androidx.transition.C3194c1
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo34835b(View view) {
        float transitionAlpha;
        if (f5143c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f5143c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.C3194c1
    /* renamed from: c */
    public void mo34834c(View view) {
    }

    @Override // androidx.transition.C3194c1
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo34833f(View view, float f) {
        if (f5143c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f5143c = false;
            }
        }
        view.setAlpha(f);
    }
}
