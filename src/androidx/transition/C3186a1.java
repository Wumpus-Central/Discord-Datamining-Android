package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: androidx.transition.a1 */
/* loaded from: classes.dex */
class C3186a1 extends C3281y0 {

    /* renamed from: h */
    private static boolean f4982h = true;

    @Override // androidx.transition.C3194c1
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo34953g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo34953g(view, i);
        } else if (f4982h) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f4982h = false;
            }
        }
    }
}
