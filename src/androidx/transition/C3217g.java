package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2733w0;

/* renamed from: androidx.transition.g */
/* loaded from: classes.dex */
public class C3217g extends Transition {

    /* renamed from: n */
    private static final String[] f5056n = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: o */
    private static final Property<C3222e, float[]> f5057o = new C3218a(float[].class, "nonTranslations");

    /* renamed from: p */
    private static final Property<C3222e, PointF> f5058p = new C3219b(PointF.class, "translations");

    /* renamed from: q */
    private static final boolean f5059q = true;

    /* renamed from: k */
    boolean f5060k = true;

    /* renamed from: l */
    private boolean f5061l = true;

    /* renamed from: m */
    private Matrix f5062m = new Matrix();

    /* renamed from: androidx.transition.g$a */
    /* loaded from: classes.dex */
    static class C3218a extends Property<C3222e, float[]> {
        C3218a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(C3222e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C3222e eVar, float[] fArr) {
            eVar.m34913d(fArr);
        }
    }

    /* renamed from: androidx.transition.g$b */
    /* loaded from: classes.dex */
    static class C3219b extends Property<C3222e, PointF> {
        C3219b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C3222e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C3222e eVar, PointF pointF) {
            eVar.m34914c(pointF);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.g$c */
    /* loaded from: classes.dex */
    public class C3220c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f5063a;

        /* renamed from: b */
        private Matrix f5064b = new Matrix();

        /* renamed from: c */
        final /* synthetic */ boolean f5065c;

        /* renamed from: d */
        final /* synthetic */ Matrix f5066d;

        /* renamed from: e */
        final /* synthetic */ View f5067e;

        /* renamed from: f */
        final /* synthetic */ C3223f f5068f;

        /* renamed from: g */
        final /* synthetic */ C3222e f5069g;

        C3220c(boolean z, Matrix matrix, View view, C3223f fVar, C3222e eVar) {
            this.f5065c = z;
            this.f5066d = matrix;
            this.f5067e = view;
            this.f5068f = fVar;
            this.f5069g = eVar;
        }

        /* renamed from: a */
        private void m34917a(Matrix matrix) {
            this.f5064b.set(matrix);
            this.f5067e.setTag(C3261t.f5150g, this.f5064b);
            this.f5068f.m34912a(this.f5067e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5063a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f5063a) {
                if (!this.f5065c || !C3217g.this.f5060k) {
                    this.f5067e.setTag(C3261t.f5150g, null);
                    this.f5067e.setTag(C3261t.f5146c, null);
                } else {
                    m34917a(this.f5066d);
                }
            }
            C3252p0.m34851f(this.f5067e, null);
            this.f5068f.m34912a(this.f5067e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m34917a(this.f5069g.m34916a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            C3217g.m34925e(this.f5067e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.g$d */
    /* loaded from: classes.dex */
    public static class C3221d extends C3282z {

        /* renamed from: a */
        private View f5071a;

        /* renamed from: b */
        private AbstractC3239k f5072b;

        C3221d(View view, AbstractC3239k kVar) {
            this.f5071a = view;
            this.f5072b = kVar;
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            C3248o.m34860b(this.f5071a);
            this.f5071a.setTag(C3261t.f5150g, null);
            this.f5071a.setTag(C3261t.f5146c, null);
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionPause(Transition transition) {
            this.f5072b.setVisibility(4);
        }

        @Override // androidx.transition.C3282z, androidx.transition.Transition.AbstractC3182g
        public void onTransitionResume(Transition transition) {
            this.f5072b.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.g$e */
    /* loaded from: classes.dex */
    public static class C3222e {

        /* renamed from: a */
        private final Matrix f5073a = new Matrix();

        /* renamed from: b */
        private final View f5074b;

        /* renamed from: c */
        private final float[] f5075c;

        /* renamed from: d */
        private float f5076d;

        /* renamed from: e */
        private float f5077e;

        C3222e(View view, float[] fArr) {
            this.f5074b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f5075c = fArr2;
            this.f5076d = fArr2[2];
            this.f5077e = fArr2[5];
            m34915b();
        }

        /* renamed from: b */
        private void m34915b() {
            float[] fArr = this.f5075c;
            fArr[2] = this.f5076d;
            fArr[5] = this.f5077e;
            this.f5073a.setValues(fArr);
            C3252p0.m34851f(this.f5074b, this.f5073a);
        }

        /* renamed from: a */
        Matrix m34916a() {
            return this.f5073a;
        }

        /* renamed from: c */
        void m34914c(PointF pointF) {
            this.f5076d = pointF.x;
            this.f5077e = pointF.y;
            m34915b();
        }

        /* renamed from: d */
        void m34913d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f5075c, 0, fArr.length);
            m34915b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.g$f */
    /* loaded from: classes.dex */
    public static class C3223f {

        /* renamed from: a */
        final float f5078a;

        /* renamed from: b */
        final float f5079b;

        /* renamed from: c */
        final float f5080c;

        /* renamed from: d */
        final float f5081d;

        /* renamed from: e */
        final float f5082e;

        /* renamed from: f */
        final float f5083f;

        /* renamed from: g */
        final float f5084g;

        /* renamed from: h */
        final float f5085h;

        C3223f(View view) {
            this.f5078a = view.getTranslationX();
            this.f5079b = view.getTranslationY();
            this.f5080c = C2733w0.m37043L(view);
            this.f5081d = view.getScaleX();
            this.f5082e = view.getScaleY();
            this.f5083f = view.getRotationX();
            this.f5084g = view.getRotationY();
            this.f5085h = view.getRotation();
        }

        /* renamed from: a */
        public void m34912a(View view) {
            C3217g.m34922j(view, this.f5078a, this.f5079b, this.f5080c, this.f5081d, this.f5082e, this.f5083f, this.f5084g, this.f5085h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3223f)) {
                return false;
            }
            C3223f fVar = (C3223f) obj;
            if (fVar.f5078a == this.f5078a && fVar.f5079b == this.f5079b && fVar.f5080c == this.f5080c && fVar.f5081d == this.f5081d && fVar.f5082e == this.f5082e && fVar.f5083f == this.f5083f && fVar.f5084g == this.f5084g && fVar.f5085h == this.f5085h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            float f = this.f5078a;
            int i8 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i9 = i * 31;
            float f2 = this.f5079b;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 31;
            float f3 = this.f5080c;
            if (f3 != 0.0f) {
                i3 = Float.floatToIntBits(f3);
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 31;
            float f4 = this.f5081d;
            if (f4 != 0.0f) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 31;
            float f5 = this.f5082e;
            if (f5 != 0.0f) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            float f6 = this.f5083f;
            if (f6 != 0.0f) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            float f7 = this.f5084g;
            if (f7 != 0.0f) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            float f8 = this.f5085h;
            if (f8 != 0.0f) {
                i8 = Float.floatToIntBits(f8);
            }
            return i15 + i8;
        }
    }

    /* renamed from: a */
    private void m34928a(ViewGroup viewGroup, C3215f0 f0Var, C3215f0 f0Var2) {
        View view = f0Var2.f5053b;
        Matrix matrix = new Matrix((Matrix) f0Var2.f5052a.get("android:changeTransform:parentMatrix"));
        C3252p0.m34846k(viewGroup, matrix);
        AbstractC3239k a = C3248o.m34861a(view, viewGroup, matrix);
        if (a != null) {
            a.mo34869a((ViewGroup) f0Var.f5052a.get("android:changeTransform:parent"), f0Var.f5053b);
            Transition transition = this;
            while (true) {
                Transition transition2 = transition.mParent;
                if (transition2 == null) {
                    break;
                }
                transition = transition2;
            }
            transition.addListener(new C3221d(view, a));
            if (f5059q) {
                View view2 = f0Var.f5053b;
                if (view2 != f0Var2.f5053b) {
                    C3252p0.m34849h(view2, 0.0f);
                }
                C3252p0.m34849h(view, 1.0f);
            }
        }
    }

    /* renamed from: c */
    private ObjectAnimator m34927c(C3215f0 f0Var, C3215f0 f0Var2, boolean z) {
        Matrix matrix = (Matrix) f0Var.f5052a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) f0Var2.f5052a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = C3250p.f5139a;
        }
        if (matrix2 == null) {
            matrix2 = C3250p.f5139a;
        }
        if (matrix.equals(matrix2)) {
            return null;
        }
        C3223f fVar = (C3223f) f0Var2.f5052a.get("android:changeTransform:transforms");
        View view = f0Var2.f5053b;
        m34925e(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        C3222e eVar = new C3222e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(f5057o, new C3231i(new float[9]), fArr, fArr2), C3259s.m34837a(f5058p, getPathMotion().mo34839a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        C3220c cVar = new C3220c(z, matrix2, view, fVar, eVar);
        ofPropertyValuesHolder.addListener(cVar);
        C3183a.m34983a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    private void captureValues(C3215f0 f0Var) {
        Matrix matrix;
        View view = f0Var.f5053b;
        if (view.getVisibility() != 8) {
            f0Var.f5052a.put("android:changeTransform:parent", view.getParent());
            f0Var.f5052a.put("android:changeTransform:transforms", new C3223f(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 == null || matrix2.isIdentity()) {
                matrix = null;
            } else {
                matrix = new Matrix(matrix2);
            }
            f0Var.f5052a.put("android:changeTransform:matrix", matrix);
            if (this.f5061l) {
                Matrix matrix3 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                C3252p0.m34847j(viewGroup, matrix3);
                matrix3.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
                f0Var.f5052a.put("android:changeTransform:parentMatrix", matrix3);
                f0Var.f5052a.put("android:changeTransform:intermediateMatrix", view.getTag(C3261t.f5150g));
                f0Var.f5052a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C3261t.f5146c));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r5 == r4.f5053b) goto L_0x001e;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m34926d(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.isValidTarget(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.isValidTarget(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            androidx.transition.f0 r4 = r3.getMatchedTransitionValues(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f5053b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C3217g.m34926d(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    /* renamed from: e */
    static void m34925e(View view) {
        m34922j(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: f */
    private void m34924f(C3215f0 f0Var, C3215f0 f0Var2) {
        Matrix matrix = (Matrix) f0Var2.f5052a.get("android:changeTransform:parentMatrix");
        f0Var2.f5053b.setTag(C3261t.f5146c, matrix);
        Matrix matrix2 = this.f5062m;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) f0Var.f5052a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            f0Var.f5052a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) f0Var.f5052a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: j */
    static void m34922j(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C2733w0.m37044K0(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(C3215f0 f0Var) {
        captureValues(f0Var);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(C3215f0 f0Var) {
        captureValues(f0Var);
        if (!f5059q) {
            ((ViewGroup) f0Var.f5053b.getParent()).startViewTransition(f0Var.f5053b);
        }
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C3215f0 f0Var, C3215f0 f0Var2) {
        boolean z;
        if (f0Var == null || f0Var2 == null || !f0Var.f5052a.containsKey("android:changeTransform:parent") || !f0Var2.f5052a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) f0Var.f5052a.get("android:changeTransform:parent");
        ViewGroup viewGroup3 = (ViewGroup) f0Var2.f5052a.get("android:changeTransform:parent");
        if (!this.f5061l || m34926d(viewGroup2, viewGroup3)) {
            z = false;
        } else {
            z = true;
        }
        Matrix matrix = (Matrix) f0Var.f5052a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            f0Var.f5052a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) f0Var.f5052a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            f0Var.f5052a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            m34924f(f0Var, f0Var2);
        }
        ObjectAnimator c = m34927c(f0Var, f0Var2, z);
        if (z && c != null && this.f5060k) {
            m34928a(viewGroup, f0Var, f0Var2);
        } else if (!f5059q) {
            viewGroup2.endViewTransition(f0Var.f5053b);
        }
        return c;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return f5056n;
    }

    /* renamed from: h */
    public void m34923h(boolean z) {
        this.f5061l = z;
    }
}
