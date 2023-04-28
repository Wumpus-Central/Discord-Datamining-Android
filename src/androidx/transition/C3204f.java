package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2733w0;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;

/* renamed from: androidx.transition.f */
/* loaded from: classes.dex */
public class C3204f extends Transition {

    /* renamed from: n */
    private static final String[] f5015n = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: o */
    private static final Property<Drawable, PointF> f5016o = new C3206b(PointF.class, "boundsOrigin");

    /* renamed from: p */
    private static final Property<C3214k, PointF> f5017p = new C3207c(PointF.class, "topLeft");

    /* renamed from: q */
    private static final Property<C3214k, PointF> f5018q = new C3208d(PointF.class, "bottomRight");

    /* renamed from: r */
    private static final Property<View, PointF> f5019r = new C3209e(PointF.class, "bottomRight");

    /* renamed from: s */
    private static final Property<View, PointF> f5020s = new C0067f(PointF.class, "topLeft");

    /* renamed from: t */
    private static final Property<View, PointF> f5021t = new C3210g(PointF.class, ViewProps.POSITION);

    /* renamed from: u */
    private static C3263u f5022u = new C3263u();

    /* renamed from: k */
    private int[] f5023k = new int[2];

    /* renamed from: l */
    private boolean f5024l = false;

    /* renamed from: m */
    private boolean f5025m = false;

    /* renamed from: androidx.transition.f$a */
    /* loaded from: classes.dex */
    class C3205a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5026a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f5027b;

        /* renamed from: c */
        final /* synthetic */ View f5028c;

        /* renamed from: d */
        final /* synthetic */ float f5029d;

        C3205a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f5026a = viewGroup;
            this.f5027b = bitmapDrawable;
            this.f5028c = view;
            this.f5029d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3252p0.m34855b(this.f5026a).mo34858b(this.f5027b);
            C3252p0.m34849h(this.f5028c, this.f5029d);
        }
    }

    /* renamed from: androidx.transition.f$b */
    /* loaded from: classes.dex */
    static class C3206b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f5031a = new Rect();

        C3206b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f5031a);
            Rect rect = this.f5031a;
            return new PointF(rect.left, rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f5031a);
            this.f5031a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f5031a);
        }
    }

    /* renamed from: androidx.transition.f$c */
    /* loaded from: classes.dex */
    static class C3207c extends Property<C3214k, PointF> {
        C3207c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C3214k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C3214k kVar, PointF pointF) {
            kVar.m34929c(pointF);
        }
    }

    /* renamed from: androidx.transition.f$d */
    /* loaded from: classes.dex */
    static class C3208d extends Property<C3214k, PointF> {
        C3208d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C3214k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C3214k kVar, PointF pointF) {
            kVar.m34931a(pointF);
        }
    }

    /* renamed from: androidx.transition.f$e */
    /* loaded from: classes.dex */
    static class C3209e extends Property<View, PointF> {
        C3209e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C3252p0.m34850g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.f$f */
    /* loaded from: classes.dex */
    static class C0067f extends Property<View, PointF> {
        C0067f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C3252p0.m34850g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.f$g */
    /* loaded from: classes.dex */
    static class C3210g extends Property<View, PointF> {
        C3210g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C3252p0.m34850g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.f$h */
    /* loaded from: classes.dex */
    class C3211h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3214k f5032a;
        private C3214k mViewBounds;

        C3211h(C3214k kVar) {
            this.f5032a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: androidx.transition.f$i */
    /* loaded from: classes.dex */
    class C3212i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f5034a;

        /* renamed from: b */
        final /* synthetic */ View f5035b;

        /* renamed from: c */
        final /* synthetic */ Rect f5036c;

        /* renamed from: d */
        final /* synthetic */ int f5037d;

        /* renamed from: e */
        final /* synthetic */ int f5038e;

        /* renamed from: f */
        final /* synthetic */ int f5039f;

        /* renamed from: g */
        final /* synthetic */ int f5040g;

        C3212i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f5035b = view;
            this.f5036c = rect;
            this.f5037d = i;
            this.f5038e = i2;
            this.f5039f = i3;
            this.f5040g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5034a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f5034a) {
                C2733w0.m36976x0(this.f5035b, this.f5036c);
                C3252p0.m34850g(this.f5035b, this.f5037d, this.f5038e, this.f5039f, this.f5040g);
            }
        }
    }

    /* renamed from: androidx.transition.f$j */
    /* loaded from: classes.dex */
    class C3213j extends C3282z {

        /* renamed from: a */
        boolean f5042a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f5043b;

        C3213j(ViewGroup viewGroup) {
            this.f5043b = viewGroup;
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionCancel(Transition transition) {
            C3244m0.m34870d(this.f5043b, false);
            this.f5042a = true;
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionEnd(Transition transition) {
            if (!this.f5042a) {
                C3244m0.m34870d(this.f5043b, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionPause(Transition transition) {
            C3244m0.m34870d(this.f5043b, false);
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionResume(Transition transition) {
            C3244m0.m34870d(this.f5043b, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.f$k */
    /* loaded from: classes.dex */
    public static class C3214k {

        /* renamed from: a */
        private int f5045a;

        /* renamed from: b */
        private int f5046b;

        /* renamed from: c */
        private int f5047c;

        /* renamed from: d */
        private int f5048d;

        /* renamed from: e */
        private View f5049e;

        /* renamed from: f */
        private int f5050f;

        /* renamed from: g */
        private int f5051g;

        C3214k(View view) {
            this.f5049e = view;
        }

        /* renamed from: b */
        private void m34930b() {
            C3252p0.m34850g(this.f5049e, this.f5045a, this.f5046b, this.f5047c, this.f5048d);
            this.f5050f = 0;
            this.f5051g = 0;
        }

        /* renamed from: a */
        void m34931a(PointF pointF) {
            this.f5047c = Math.round(pointF.x);
            this.f5048d = Math.round(pointF.y);
            int i = this.f5051g + 1;
            this.f5051g = i;
            if (this.f5050f == i) {
                m34930b();
            }
        }

        /* renamed from: c */
        void m34929c(PointF pointF) {
            this.f5045a = Math.round(pointF.x);
            this.f5046b = Math.round(pointF.y);
            int i = this.f5050f + 1;
            this.f5050f = i;
            if (i == this.f5051g) {
                m34930b();
            }
        }
    }

    /* renamed from: a */
    private boolean m34944a(View view, View view2) {
        if (!this.f5025m) {
            return true;
        }
        C3215f0 matchedTransitionValues = getMatchedTransitionValues(view, true);
        if (matchedTransitionValues == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == matchedTransitionValues.f5053b) {
            return true;
        }
        return false;
    }

    private void captureValues(C3215f0 f0Var) {
        View view = f0Var.f5053b;
        if (C2733w0.m37029U(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            f0Var.f5052a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            f0Var.f5052a.put("android:changeBounds:parent", f0Var.f5053b.getParent());
            if (this.f5025m) {
                f0Var.f5053b.getLocationInWindow(this.f5023k);
                f0Var.f5052a.put("android:changeBounds:windowX", Integer.valueOf(this.f5023k[0]));
                f0Var.f5052a.put("android:changeBounds:windowY", Integer.valueOf(this.f5023k[1]));
            }
            if (this.f5024l) {
                f0Var.f5052a.put("android:changeBounds:clip", C2733w0.m36983u(view));
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(C3215f0 f0Var) {
        captureValues(f0Var);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(C3215f0 f0Var) {
        captureValues(f0Var);
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C3215f0 f0Var, C3215f0 f0Var2) {
        int i;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator2;
        if (f0Var == null || f0Var2 == null) {
            return null;
        }
        Map<String, Object> map = f0Var.f5052a;
        Map<String, Object> map2 = f0Var2.f5052a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = f0Var2.f5053b;
        if (m34944a(viewGroup2, viewGroup3)) {
            Rect rect3 = (Rect) f0Var.f5052a.get("android:changeBounds:bounds");
            Rect rect4 = (Rect) f0Var2.f5052a.get("android:changeBounds:bounds");
            int i3 = rect3.left;
            int i4 = rect4.left;
            int i5 = rect3.top;
            int i6 = rect4.top;
            int i7 = rect3.right;
            int i8 = rect4.right;
            int i9 = rect3.bottom;
            int i10 = rect4.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            Rect rect5 = (Rect) f0Var.f5052a.get("android:changeBounds:clip");
            Rect rect6 = (Rect) f0Var2.f5052a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                if (i3 == i4 && i5 == i6) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            if (!this.f5024l) {
                view = view2;
                C3252p0.m34850g(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        animator = C3255q.m34841a(view, f5021t, getPathMotion().mo34839a(i3, i5, i4, i6));
                    } else {
                        C3214k kVar = new C3214k(view);
                        ObjectAnimator a = C3255q.m34841a(kVar, f5017p, getPathMotion().mo34839a(i3, i5, i4, i6));
                        ObjectAnimator a2 = C3255q.m34841a(kVar, f5018q, getPathMotion().mo34839a(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a, a2);
                        animatorSet.addListener(new C3211h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    animator = C3255q.m34841a(view, f5019r, getPathMotion().mo34839a(i7, i9, i8, i10));
                } else {
                    animator = C3255q.m34841a(view, f5020s, getPathMotion().mo34839a(i3, i5, i4, i6));
                }
            } else {
                view = view2;
                C3252p0.m34850g(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                if (i3 == i4 && i5 == i6) {
                    objectAnimator = null;
                } else {
                    objectAnimator = C3255q.m34841a(view, f5021t, getPathMotion().mo34839a(i3, i5, i4, i6));
                }
                if (rect5 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect5;
                }
                if (rect6 == null) {
                    rect2 = new Rect(i2, i2, i13, i14);
                } else {
                    rect2 = rect6;
                }
                if (!rect.equals(rect2)) {
                    C2733w0.m36976x0(view, rect);
                    C3263u uVar = f5022u;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect2;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", uVar, objArr);
                    ofObject.addListener(new C3212i(view, rect6, i4, i6, i8, i10));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = C3202e0.m34945c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C3244m0.m34870d(viewGroup4, true);
                addListener(new C3213j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) f0Var.f5052a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) f0Var.f5052a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) f0Var2.f5052a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) f0Var2.f5052a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f5023k);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C3252p0.m34854c(view2);
        C3252p0.m34849h(view2, 0.0f);
        C3252p0.m34855b(viewGroup).mo34859a(bitmapDrawable);
        AbstractC3257r pathMotion = getPathMotion();
        int[] iArr = this.f5023k;
        int i15 = iArr[0];
        int i16 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C3259s.m34837a(f5016o, pathMotion.mo34839a(intValue - i15, intValue2 - i16, intValue3 - i15, intValue4 - i16)));
        ofPropertyValuesHolder.addListener(new C3205a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return f5015n;
    }
}
