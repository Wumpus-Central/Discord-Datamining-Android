package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: androidx.transition.y0 */
/* loaded from: classes.dex */
class C3281y0 extends C3268w0 {

    /* renamed from: g */
    private static boolean f5178g = true;

    @Override // androidx.transition.C3194c1
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo34818e(View view, int i, int i2, int i3, int i4) {
        if (f5178g) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f5178g = false;
            }
        }
    }
}
