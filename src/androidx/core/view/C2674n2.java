package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.n2 */
/* loaded from: classes.dex */
public final class C2674n2 {

    /* renamed from: a */
    private final WeakReference<View> f3602a;

    /* renamed from: b */
    Runnable f3603b = null;

    /* renamed from: c */
    Runnable f3604c = null;

    /* renamed from: d */
    int f3605d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.n2$a */
    /* loaded from: classes.dex */
    public class C2675a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC2681o2 f3606a;

        /* renamed from: b */
        final /* synthetic */ View f3607b;

        C2675a(AbstractC2681o2 o2Var, View view) {
            this.f3606a = o2Var;
            this.f3607b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3606a.mo37153a(this.f3607b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3606a.mo20596b(this.f3607b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3606a.mo20595c(this.f3607b);
        }
    }

    /* renamed from: androidx.core.view.n2$b */
    /* loaded from: classes.dex */
    static class C2676b {
        /* renamed from: a */
        static ViewPropertyAnimator m37160a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2674n2(View view) {
        this.f3602a = new WeakReference<>(view);
    }

    /* renamed from: i */
    private void m37165i(View view, AbstractC2681o2 o2Var) {
        if (o2Var != null) {
            view.animate().setListener(new C2675a(o2Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: b */
    public C2674n2 m37172b(float f) {
        View view = this.f3602a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: c */
    public void m37171c() {
        View view = this.f3602a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long m37170d() {
        View view = this.f3602a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: f */
    public C2674n2 m37168f(long j) {
        View view = this.f3602a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public C2674n2 m37167g(Interpolator interpolator) {
        View view = this.f3602a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C2674n2 m37166h(AbstractC2681o2 o2Var) {
        View view = this.f3602a.get();
        if (view != null) {
            m37165i(view, o2Var);
        }
        return this;
    }

    /* renamed from: j */
    public C2674n2 m37164j(long j) {
        View view = this.f3602a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public C2674n2 m37163k(final AbstractC2691q2 q2Var) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        final View view = this.f3602a.get();
        if (view != null) {
            if (q2Var != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.m2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AbstractC2691q2.this.mo37149a(view);
                    }
                };
            } else {
                animatorUpdateListener = null;
            }
            C2676b.m37160a(view.animate(), animatorUpdateListener);
        }
        return this;
    }

    /* renamed from: l */
    public void m37162l() {
        View view = this.f3602a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C2674n2 m37161m(float f) {
        View view = this.f3602a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
