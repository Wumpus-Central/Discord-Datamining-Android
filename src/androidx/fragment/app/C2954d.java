package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.p018os.C2437e;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC2722u0;
import androidx.fragment.app.C2977o;
import p222m1.C10466a;
import p222m1.C10467b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class C2954d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: classes.dex */
    public class C2955a implements C2437e.AbstractC2439b {

        /* renamed from: a */
        final /* synthetic */ Fragment f4188a;

        C2955a(Fragment fragment) {
            this.f4188a = fragment;
        }

        @Override // androidx.core.p018os.C2437e.AbstractC2439b
        public void onCancel() {
            if (this.f4188a.getAnimatingAway() != null) {
                View animatingAway = this.f4188a.getAnimatingAway();
                this.f4188a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f4188a.setAnimator(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$b  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationAnimation$AnimationListenerC2956b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4189a;

        /* renamed from: b */
        final /* synthetic */ Fragment f4190b;

        /* renamed from: c */
        final /* synthetic */ C2977o.AbstractC2984g f4191c;

        /* renamed from: d */
        final /* synthetic */ C2437e f4192d;

        /* renamed from: androidx.fragment.app.d$b$a */
        /* loaded from: classes.dex */
        class RunnableC2957a implements Runnable {
            RunnableC2957a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (animationAnimation$AnimationListenerC2956b.this.f4190b.getAnimatingAway() != null) {
                    animationAnimation$AnimationListenerC2956b.this.f4190b.setAnimatingAway(null);
                    animationAnimation$AnimationListenerC2956b bVar = animationAnimation$AnimationListenerC2956b.this;
                    bVar.f4191c.mo35901a(bVar.f4190b, bVar.f4192d);
                }
            }
        }

        animationAnimation$AnimationListenerC2956b(ViewGroup viewGroup, Fragment fragment, C2977o.AbstractC2984g gVar, C2437e eVar) {
            this.f4189a = viewGroup;
            this.f4190b = fragment;
            this.f4191c = gVar;
            this.f4192d = eVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4189a.post(new RunnableC2957a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$c */
    /* loaded from: classes.dex */
    public class C2958c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4194a;

        /* renamed from: b */
        final /* synthetic */ View f4195b;

        /* renamed from: c */
        final /* synthetic */ Fragment f4196c;

        /* renamed from: d */
        final /* synthetic */ C2977o.AbstractC2984g f4197d;

        /* renamed from: e */
        final /* synthetic */ C2437e f4198e;

        C2958c(ViewGroup viewGroup, View view, Fragment fragment, C2977o.AbstractC2984g gVar, C2437e eVar) {
            this.f4194a = viewGroup;
            this.f4195b = view;
            this.f4196c = fragment;
            this.f4197d = gVar;
            this.f4198e = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4194a.endViewTransition(this.f4195b);
            Animator animator2 = this.f4196c.getAnimator();
            this.f4196c.setAnimator(null);
            if (animator2 != null && this.f4194a.indexOfChild(this.f4195b) < 0) {
                this.f4197d.mo35901a(this.f4196c, this.f4198e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m36014a(Fragment fragment, C0057d dVar, C2977o.AbstractC2984g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        C2437e eVar = new C2437e();
        eVar.m37743c(new C2955a(fragment));
        gVar.mo35900b(fragment, eVar);
        if (dVar.f4199a != null) {
            RunnableC2959e eVar2 = new RunnableC2959e(dVar.f4199a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar2.setAnimationListener(new animationAnimation$AnimationListenerC2956b(viewGroup, fragment, gVar, eVar));
            fragment.mView.startAnimation(eVar2);
            return;
        }
        Animator animator = dVar.f4200b;
        fragment.setAnimator(animator);
        animator.addListener(new C2958c(viewGroup, view, fragment, gVar, eVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* renamed from: b */
    private static int m36013b(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C0057d m36012c(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int b = m36013b(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = C10467b.f23090c;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, b);
        if (onCreateAnimation != null) {
            return new C0057d(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, b);
        if (onCreateAnimator != null) {
            return new C0057d(onCreateAnimator);
        }
        if (b == 0 && nextTransition != 0) {
            b = m36011d(nextTransition, z);
        }
        if (b != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b);
                    if (loadAnimation != null) {
                        return new C0057d(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b);
                    if (loadAnimator != null) {
                        return new C0057d(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b);
                        if (loadAnimation2 != null) {
                            return new C0057d(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m36011d(int i, boolean z) {
        if (i != 4097) {
            if (i != 4099) {
                if (i != 8194) {
                    return -1;
                }
                if (z) {
                    return C10466a.f23082a;
                }
                return C10466a.f23083b;
            } else if (z) {
                return C10466a.f23084c;
            } else {
                return C10466a.f23085d;
            }
        } else if (z) {
            return C10466a.f23086e;
        } else {
            return C10466a.f23087f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$d */
    /* loaded from: classes.dex */
    public static class C0057d {

        /* renamed from: a */
        public final Animation f4199a;

        /* renamed from: b */
        public final Animator f4200b;

        C0057d(Animation animation) {
            this.f4199a = animation;
            this.f4200b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0057d(Animator animator) {
            this.f4199a = null;
            this.f4200b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$e */
    /* loaded from: classes.dex */
    public static class RunnableC2959e extends AnimationSet implements Runnable {

        /* renamed from: k */
        private final ViewGroup f4201k;

        /* renamed from: l */
        private final View f4202l;

        /* renamed from: m */
        private boolean f4203m;

        /* renamed from: n */
        private boolean f4204n;

        /* renamed from: o */
        private boolean f4205o = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RunnableC2959e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4201k = viewGroup;
            this.f4202l = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f4205o = true;
            if (this.f4203m) {
                return !this.f4204n;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f4203m = true;
                ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(this.f4201k, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4203m || !this.f4205o) {
                this.f4201k.endViewTransition(this.f4202l);
                this.f4204n = true;
                return;
            }
            this.f4205o = false;
            this.f4201k.post(this);
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f4205o = true;
            if (this.f4203m) {
                return !this.f4204n;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f4203m = true;
                ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(this.f4201k, this);
            }
            return true;
        }
    }
}
