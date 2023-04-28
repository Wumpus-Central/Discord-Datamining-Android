package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.C2131g;

/* renamed from: androidx.constraintlayout.widget.g */
/* loaded from: classes.dex */
public abstract class AbstractC2149g extends AbstractC2143b {

    /* renamed from: s */
    private boolean f2976s;

    /* renamed from: t */
    private boolean f2977t;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC2143b
    /* renamed from: g */
    public void mo38746g(AttributeSet attributeSet) {
        super.mo38746g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2148f.f2813a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2148f.f2827c1) {
                    this.f2976s = true;
                } else if (index == C2148f.f2862h1) {
                    this.f2977t = true;
                }
            }
        }
    }

    /* renamed from: n */
    public void m38745n(C2131g gVar, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC2143b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2976s || this.f2977t) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f2789l; i++) {
                View viewById = constraintLayout.getViewById(this.f2788k[i]);
                if (viewById != null) {
                    if (this.f2976s) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f2977t && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m38760c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m38760c();
    }
}
