package com.swmansion.reanimated.transitions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import androidx.transition.AbstractC3188b0;
import androidx.transition.C3204f;
import androidx.transition.C3215f0;
import androidx.transition.C3217g;
import androidx.transition.Transition;

/* loaded from: classes8.dex */
final class ChangeTransition extends Transition {
    private final C3217g mChangeTransform = new C3217g();
    private final C3204f mChangeBounds = new C3204f();

    @Override // androidx.transition.Transition
    public void captureEndValues(C3215f0 f0Var) {
        this.mChangeTransform.captureEndValues(f0Var);
        this.mChangeBounds.captureEndValues(f0Var);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(C3215f0 f0Var) {
        this.mChangeTransform.captureStartValues(f0Var);
        this.mChangeBounds.captureStartValues(f0Var);
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C3215f0 f0Var, C3215f0 f0Var2) {
        this.mChangeTransform.m34923h(false);
        Animator createAnimator = this.mChangeTransform.createAnimator(viewGroup, f0Var, f0Var2);
        Animator createAnimator2 = this.mChangeBounds.createAnimator(viewGroup, f0Var, f0Var2);
        if (createAnimator == null) {
            return createAnimator2;
        }
        if (createAnimator2 == null) {
            return createAnimator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(createAnimator, createAnimator2);
        return animatorSet;
    }

    @Override // androidx.transition.Transition
    public Transition setDuration(long j) {
        this.mChangeTransform.setDuration(j);
        this.mChangeBounds.setDuration(j);
        return super.setDuration(j);
    }

    @Override // androidx.transition.Transition
    public Transition setInterpolator(TimeInterpolator timeInterpolator) {
        this.mChangeTransform.setInterpolator(timeInterpolator);
        this.mChangeBounds.setInterpolator(timeInterpolator);
        return super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.Transition
    public void setPropagation(AbstractC3188b0 b0Var) {
        this.mChangeTransform.setPropagation(b0Var);
        this.mChangeBounds.setPropagation(b0Var);
        super.setPropagation(b0Var);
    }

    @Override // androidx.transition.Transition
    public Transition setStartDelay(long j) {
        this.mChangeTransform.setStartDelay(j);
        this.mChangeBounds.setStartDelay(j);
        return super.setStartDelay(j);
    }
}
