package p205l1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C2863d;

/* renamed from: l1.h */
/* loaded from: classes.dex */
class C10331h implements TransformationMethod {

    /* renamed from: k */
    private final TransformationMethod f22649k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10331h(TransformationMethod transformationMethod) {
        this.f22649k = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod m13600a() {
        return this.f22649k;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f22649k;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C2863d.m36464b().m36462d() != 1) {
            return charSequence;
        }
        return C2863d.m36464b().m36451o(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f22649k;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
