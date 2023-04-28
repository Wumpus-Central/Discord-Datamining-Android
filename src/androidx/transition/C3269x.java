package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.C2733w0;

/* renamed from: androidx.transition.x */
/* loaded from: classes.dex */
public class C3269x extends AbstractC3197d1 {

    /* renamed from: m */
    private static final TimeInterpolator f5157m = new DecelerateInterpolator();

    /* renamed from: n */
    private static final TimeInterpolator f5158n = new AccelerateInterpolator();

    /* renamed from: o */
    private static final AbstractC3276g f5159o = new C3270a();

    /* renamed from: p */
    private static final AbstractC3276g f5160p = new C3271b();

    /* renamed from: q */
    private static final AbstractC3276g f5161q = new C3272c();

    /* renamed from: r */
    private static final AbstractC3276g f5162r = new C3273d();

    /* renamed from: s */
    private static final AbstractC3276g f5163s = new C3274e();

    /* renamed from: t */
    private static final AbstractC3276g f5164t = new C3275f();

    /* renamed from: k */
    private AbstractC3276g f5165k = f5164t;

    /* renamed from: l */
    private int f5166l = 80;

    /* renamed from: androidx.transition.x$a */
    /* loaded from: classes.dex */
    static class C3270a extends AbstractC3277h {
        C3270a() {
            super(null);
        }

        @Override // androidx.transition.C3269x.AbstractC3276g
        /* renamed from: b */
        public float mo34820b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.x$b */
    /* loaded from: classes.dex */
    static class C3271b extends AbstractC3277h {
        C3271b() {
            super(null);
        }

        @Override // androidx.transition.C3269x.AbstractC3276g
        /* renamed from: b */
        public float mo34820b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C2733w0.m37063B(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.x$c */
    /* loaded from: classes.dex */
    static class C3272c extends AbstractC3278i {
        C3272c() {
            super(null);
        }

        @Override // androidx.transition.C3269x.AbstractC3276g
        /* renamed from: a */
        public float mo34821a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.x$d */
    /* loaded from: classes.dex */
    static class C3273d extends AbstractC3277h {
        C3273d() {
            super(null);
        }

        @Override // androidx.transition.C3269x.AbstractC3276g
        /* renamed from: b */
        public float mo34820b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.x$e */
    /* loaded from: classes.dex */
    static class C3274e extends AbstractC3277h {
        C3274e() {
            super(null);
        }

        @Override // androidx.transition.C3269x.AbstractC3276g
        /* renamed from: b */
        public float mo34820b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C2733w0.m37063B(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.x$f */
    /* loaded from: classes.dex */
    static class C3275f extends AbstractC3278i {
        C3275f() {
            super(null);
        }

        @Override // androidx.transition.C3269x.AbstractC3276g
        /* renamed from: a */
        public float mo34821a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.x$g */
    /* loaded from: classes.dex */
    public interface AbstractC3276g {
        /* renamed from: a */
        float mo34821a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo34820b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.x$h */
    /* loaded from: classes.dex */
    private static abstract class AbstractC3277h implements AbstractC3276g {
        private AbstractC3277h() {
        }

        /* synthetic */ AbstractC3277h(C3270a aVar) {
            this();
        }

        @Override // androidx.transition.C3269x.AbstractC3276g
        /* renamed from: a */
        public float mo34821a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.transition.x$i */
    /* loaded from: classes.dex */
    private static abstract class AbstractC3278i implements AbstractC3276g {
        private AbstractC3278i() {
        }

        /* synthetic */ AbstractC3278i(C3270a aVar) {
            this();
        }

        @Override // androidx.transition.C3269x.AbstractC3276g
        /* renamed from: b */
        public float mo34820b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public C3269x(int i) {
        m34822a(i);
    }

    private void captureValues(C3215f0 f0Var) {
        int[] iArr = new int[2];
        f0Var.f5053b.getLocationOnScreen(iArr);
        f0Var.f5052a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: a */
    public void m34822a(int i) {
        if (i == 3) {
            this.f5165k = f5159o;
        } else if (i == 5) {
            this.f5165k = f5162r;
        } else if (i == 48) {
            this.f5165k = f5161q;
        } else if (i == 80) {
            this.f5165k = f5164t;
        } else if (i == 8388611) {
            this.f5165k = f5160p;
        } else if (i == 8388613) {
            this.f5165k = f5163s;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f5166l = i;
        C3267w wVar = new C3267w();
        wVar.setSide(i);
        setPropagation(wVar);
    }

    @Override // androidx.transition.AbstractC3197d1, androidx.transition.Transition
    public void captureEndValues(C3215f0 f0Var) {
        super.captureEndValues(f0Var);
        captureValues(f0Var);
    }

    @Override // androidx.transition.AbstractC3197d1, androidx.transition.Transition
    public void captureStartValues(C3215f0 f0Var) {
        super.captureStartValues(f0Var);
        captureValues(f0Var);
    }

    @Override // androidx.transition.AbstractC3197d1
    public Animator onAppear(ViewGroup viewGroup, View view, C3215f0 f0Var, C3215f0 f0Var2) {
        if (f0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) f0Var2.f5052a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C3229h0.m34909a(view, f0Var2, iArr[0], iArr[1], this.f5165k.mo34820b(viewGroup, view), this.f5165k.mo34821a(viewGroup, view), translationX, translationY, f5157m, this);
    }

    @Override // androidx.transition.AbstractC3197d1
    public Animator onDisappear(ViewGroup viewGroup, View view, C3215f0 f0Var, C3215f0 f0Var2) {
        if (f0Var == null) {
            return null;
        }
        int[] iArr = (int[]) f0Var.f5052a.get("android:slide:screenPosition");
        return C3229h0.m34909a(view, f0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f5165k.mo34820b(viewGroup, view), this.f5165k.mo34821a(viewGroup, view), f5158n, this);
    }
}
