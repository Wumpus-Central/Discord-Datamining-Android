package com.swmansion.reanimated.transitions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC3197d1;
import androidx.transition.C3215f0;
import androidx.transition.C3282z;
import androidx.transition.Transition;

/* loaded from: classes8.dex */
public class Scale extends AbstractC3197d1 {
    static final String PROPNAME_SCALE_X = "scale:scaleX";
    static final String PROPNAME_SCALE_Y = "scale:scaleY";

    private Animator createAnimation(final View view, float f, float f2, C3215f0 f0Var) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        float f3 = scaleX * f;
        float f4 = scaleX * f2;
        float f5 = f * scaleY;
        float f6 = f2 * scaleY;
        if (f0Var != null) {
            Float f7 = (Float) f0Var.f5052a.get(PROPNAME_SCALE_X);
            Float f8 = (Float) f0Var.f5052a.get(PROPNAME_SCALE_Y);
            if (!(f7 == null || f7.floatValue() == scaleX)) {
                f3 = f7.floatValue();
            }
            if (!(f8 == null || f8.floatValue() == scaleY)) {
                f5 = f8.floatValue();
            }
        }
        view.setScaleX(f3);
        view.setScaleY(f5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f3, f4), ObjectAnimator.ofFloat(view, View.SCALE_Y, f5, f6));
        addListener(new C3282z() { // from class: com.swmansion.reanimated.transitions.Scale.1
            @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
            public void onTransitionEnd(Transition transition) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
                transition.removeListener(this);
            }
        });
        return animatorSet;
    }

    @Override // androidx.transition.AbstractC3197d1, androidx.transition.Transition
    public void captureStartValues(C3215f0 f0Var) {
        super.captureStartValues(f0Var);
        f0Var.f5052a.put(PROPNAME_SCALE_X, Float.valueOf(f0Var.f5053b.getScaleX()));
        f0Var.f5052a.put(PROPNAME_SCALE_Y, Float.valueOf(f0Var.f5053b.getScaleY()));
    }

    @Override // androidx.transition.AbstractC3197d1
    public Animator onAppear(ViewGroup viewGroup, View view, C3215f0 f0Var, C3215f0 f0Var2) {
        return createAnimation(view, 0.0f, 1.0f, f0Var);
    }

    @Override // androidx.transition.AbstractC3197d1
    public Animator onDisappear(ViewGroup viewGroup, View view, C3215f0 f0Var, C3215f0 f0Var2) {
        return createAnimation(view, 1.0f, 0.0f, f0Var);
    }

    public Scale setDisappearedScale(float f) {
        if (f >= 0.0f) {
            return this;
        }
        throw new IllegalArgumentException("disappearedScale cannot be negative!");
    }
}
