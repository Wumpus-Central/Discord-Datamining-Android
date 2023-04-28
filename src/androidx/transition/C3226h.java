package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2733w0;

/* renamed from: androidx.transition.h */
/* loaded from: classes.dex */
public class C3226h extends AbstractC3197d1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.h$a */
    /* loaded from: classes.dex */
    public class C3227a extends C3282z {

        /* renamed from: a */
        final /* synthetic */ View f5090a;

        C3227a(View view) {
            this.f5090a = view;
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionEnd(Transition transition) {
            C3252p0.m34849h(this.f5090a, 1.0f);
            C3252p0.m34856a(this.f5090a);
            transition.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.h$b */
    /* loaded from: classes.dex */
    public static class C3228b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f5092a;

        /* renamed from: b */
        private boolean f5093b = false;

        C3228b(View view) {
            this.f5092a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3252p0.m34849h(this.f5092a, 1.0f);
            if (this.f5093b) {
                this.f5092a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C2733w0.m37033Q(this.f5092a) && this.f5092a.getLayerType() == 0) {
                this.f5093b = true;
                this.f5092a.setLayerType(2, null);
            }
        }
    }

    public C3226h(int i) {
        setMode(i);
    }

    /* renamed from: a */
    private Animator m34911a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C3252p0.m34849h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C3252p0.f5141b, f2);
        ofFloat.addListener(new C3228b(view));
        addListener(new C3227a(view));
        return ofFloat;
    }

    /* renamed from: c */
    private static float m34910c(C3215f0 f0Var, float f) {
        Float f2;
        if (f0Var == null || (f2 = (Float) f0Var.f5052a.get("android:fade:transitionAlpha")) == null) {
            return f;
        }
        return f2.floatValue();
    }

    @Override // androidx.transition.AbstractC3197d1, androidx.transition.Transition
    public void captureStartValues(C3215f0 f0Var) {
        super.captureStartValues(f0Var);
        f0Var.f5052a.put("android:fade:transitionAlpha", Float.valueOf(C3252p0.m34854c(f0Var.f5053b)));
    }

    @Override // androidx.transition.AbstractC3197d1
    public Animator onAppear(ViewGroup viewGroup, View view, C3215f0 f0Var, C3215f0 f0Var2) {
        float f = 0.0f;
        float c = m34910c(f0Var, 0.0f);
        if (c != 1.0f) {
            f = c;
        }
        return m34911a(view, f, 1.0f);
    }

    @Override // androidx.transition.AbstractC3197d1
    public Animator onDisappear(ViewGroup viewGroup, View view, C3215f0 f0Var, C3215f0 f0Var2) {
        C3252p0.m34852e(view);
        return m34911a(view, m34910c(f0Var, 1.0f), 0.0f);
    }

    public C3226h() {
    }
}
