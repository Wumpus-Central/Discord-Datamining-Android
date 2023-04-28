package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.transition.o */
/* loaded from: classes.dex */
class C3248o {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC3239k m34861a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return C3243m.m34878b(view, viewGroup, matrix);
        }
        return C3245n.m34868b(view, viewGroup, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m34860b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C3243m.m34874f(view);
        } else {
            C3245n.m34864f(view);
        }
    }
}
