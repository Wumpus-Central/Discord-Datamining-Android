package p176jb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import p176jb.AbstractC9512d;

/* renamed from: jb.a */
/* loaded from: classes3.dex */
public final class C9509a {

    /* renamed from: jb.a$a */
    /* loaded from: classes3.dex */
    class C0286a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC9512d f21095a;

        C0286a(AbstractC9512d dVar) {
            this.f21095a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f21095a.mo15203b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f21095a.mo15204a();
        }
    }

    /* renamed from: a */
    public static Animator m16112a(AbstractC9512d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, (Property<AbstractC9512d, V>) AbstractC9512d.C9515c.f21099a, (TypeEvaluator) AbstractC9512d.C9514b.f21097b, (Object[]) new AbstractC9512d.C9516e[]{new AbstractC9512d.C9516e(f, f2, f3)});
        AbstractC9512d.C9516e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f21103c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m16111b(AbstractC9512d dVar) {
        return new C0286a(dVar);
    }
}
