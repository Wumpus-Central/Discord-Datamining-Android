package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p102fb.C7101a;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC2152c<V> {

    /* renamed from: a */
    private int f10501a = 0;

    /* renamed from: b */
    private int f10502b = 2;

    /* renamed from: c */
    private int f10503c = 0;

    /* renamed from: d */
    private ViewPropertyAnimator f10504d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes3.dex */
    public class C5515a extends AnimatorListenerAdapter {
        C5515a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f10504d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: F */
    private void m28731F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f10504d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C5515a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: A */
    public boolean mo28651A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: G */
    public boolean m28730G() {
        return this.f10502b == 1;
    }

    /* renamed from: H */
    public boolean m28729H() {
        return this.f10502b == 2;
    }

    /* renamed from: I */
    public void m28728I(V v, int i) {
        this.f10503c = i;
        if (this.f10502b == 1) {
            v.setTranslationY(this.f10501a + i);
        }
    }

    /* renamed from: J */
    public void m28727J(V v) {
        m28726K(v, true);
    }

    /* renamed from: K */
    public void m28726K(V v, boolean z) {
        if (!m28730G()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f10504d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f10502b = 1;
            int i = this.f10501a + this.f10503c;
            if (z) {
                m28731F(v, i, 175L, C7101a.f15488c);
            } else {
                v.setTranslationY(i);
            }
        }
    }

    /* renamed from: L */
    public void m28725L(V v) {
        m28724M(v, true);
    }

    /* renamed from: M */
    public void m28724M(V v, boolean z) {
        if (!m28729H()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f10504d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f10502b = 2;
            if (z) {
                m28731F(v, 0, 225L, C7101a.f15489d);
            } else {
                v.setTranslationY(0);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: l */
    public boolean mo27375l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f10501a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo27375l(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: t */
    public void mo28590t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            m28727J(v);
        } else if (i2 < 0) {
            m28725L(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
