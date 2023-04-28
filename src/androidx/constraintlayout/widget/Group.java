package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Group extends AbstractC2143b {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC2143b
    /* renamed from: g */
    public void mo38746g(AttributeSet attributeSet) {
        super.mo38746g(attributeSet);
        this.f2792o = false;
    }

    @Override // androidx.constraintlayout.widget.AbstractC2143b
    /* renamed from: i */
    public void mo38755i(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2656n0.m38947B0(0);
        layoutParams.f2656n0.m38915e0(0);
    }

    @Override // androidx.constraintlayout.widget.AbstractC2143b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m38760c();
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
