package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p102fb.C7102b;
import p102fb.C7109i;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C7109i f11451c = new C7109i(75, 150);

    /* renamed from: d */
    private final C7109i f11452d = new C7109i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: classes3.dex */
    class C5790a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f11453a;

        /* renamed from: b */
        final /* synthetic */ View f11454b;

        C5790a(boolean z, View view) {
            this.f11453a = z;
            this.f11454b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f11453a) {
                this.f11454b.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f11453a) {
                this.f11454b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: K */
    private void m27349K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        C7109i iVar;
        ObjectAnimator objectAnimator;
        if (z) {
            iVar = this.f11451c;
        } else {
            iVar = this.f11452d;
        }
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        iVar.m23377a(objectAnimator);
        list.add(objectAnimator);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: D */
    public boolean mo27351D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo27351D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo27350J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m27349K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C7102b.m23396a(animatorSet, arrayList);
        animatorSet.addListener(new C5790a(z, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: e */
    public boolean mo27348e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
