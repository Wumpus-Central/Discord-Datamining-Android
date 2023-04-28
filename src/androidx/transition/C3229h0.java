package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.Transition;

/* renamed from: androidx.transition.h0 */
/* loaded from: classes.dex */
class C3229h0 {

    /* renamed from: androidx.transition.h0$a */
    /* loaded from: classes.dex */
    private static class C3230a extends AnimatorListenerAdapter implements Transition.AbstractC3182g {

        /* renamed from: a */
        private final View f5094a;

        /* renamed from: b */
        private final View f5095b;

        /* renamed from: c */
        private final int f5096c;

        /* renamed from: d */
        private final int f5097d;

        /* renamed from: e */
        private int[] f5098e;

        /* renamed from: f */
        private float f5099f;

        /* renamed from: g */
        private float f5100g;

        /* renamed from: h */
        private final float f5101h;

        /* renamed from: i */
        private final float f5102i;

        C3230a(View view, View view2, int i, int i2, float f, float f2) {
            this.f5095b = view;
            this.f5094a = view2;
            this.f5096c = i - Math.round(view.getTranslationX());
            this.f5097d = i2 - Math.round(view.getTranslationY());
            this.f5101h = f;
            this.f5102i = f2;
            int i3 = C3261t.f5149f;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f5098e = iArr;
            if (iArr != null) {
                view2.setTag(i3, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f5098e == null) {
                this.f5098e = new int[2];
            }
            this.f5098e[0] = Math.round(this.f5096c + this.f5095b.getTranslationX());
            this.f5098e[1] = Math.round(this.f5097d + this.f5095b.getTranslationY());
            this.f5094a.setTag(C3261t.f5149f, this.f5098e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f5099f = this.f5095b.getTranslationX();
            this.f5100g = this.f5095b.getTranslationY();
            this.f5095b.setTranslationX(this.f5101h);
            this.f5095b.setTranslationY(this.f5102i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f5095b.setTranslationX(this.f5099f);
            this.f5095b.setTranslationY(this.f5100g);
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionEnd(Transition transition) {
            this.f5095b.setTranslationX(this.f5101h);
            this.f5095b.setTranslationY(this.f5102i);
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.AbstractC3182g
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Animator m34909a(View view, C3215f0 f0Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) f0Var.f5053b.getTag(C3261t.f5149f);
        if (iArr != null) {
            f5 = (iArr[0] - i) + translationX;
            f6 = (iArr[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        C3230a aVar = new C3230a(view, f0Var.f5053b, round, round2, translationX, translationY);
        transition.addListener(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        C3183a.m34983a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
