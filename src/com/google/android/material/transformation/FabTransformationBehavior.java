package com.google.android.material.transformation;

import ac.C1358a;
import ac.C1359b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2733w0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p083eb.C6807f;
import p102fb.C7101a;
import p102fb.C7102b;
import p102fb.C7103c;
import p102fb.C7104d;
import p102fb.C7105e;
import p102fb.C7108h;
import p102fb.C7109i;
import p102fb.C7110j;
import p176jb.AbstractC9512d;
import p176jb.C9509a;
import p176jb.C9511c;
import p299qb.C12102a;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f11432c;

    /* renamed from: d */
    private final RectF f11433d;

    /* renamed from: e */
    private final RectF f11434e;

    /* renamed from: f */
    private final int[] f11435f;

    /* renamed from: g */
    private float f11436g;

    /* renamed from: h */
    private float f11437h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes3.dex */
    class C5785a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f11438a;

        /* renamed from: b */
        final /* synthetic */ View f11439b;

        /* renamed from: c */
        final /* synthetic */ View f11440c;

        C5785a(boolean z, View view, View view2) {
            this.f11438a = z;
            this.f11439b = view;
            this.f11440c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f11438a) {
                this.f11439b.setVisibility(4);
                this.f11440c.setAlpha(1.0f);
                this.f11440c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f11438a) {
                this.f11439b.setVisibility(0);
                this.f11440c.setAlpha(0.0f);
                this.f11440c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes3.dex */
    public class C5786b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f11442a;

        C5786b(View view) {
            this.f11442a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f11442a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes3.dex */
    public class C5787c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC9512d f11444a;

        /* renamed from: b */
        final /* synthetic */ Drawable f11445b;

        C5787c(AbstractC9512d dVar, Drawable drawable) {
            this.f11444a = dVar;
            this.f11445b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11444a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f11444a.setCircularRevealOverlayDrawable(this.f11445b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes3.dex */
    public class C5788d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC9512d f11447a;

        C5788d(AbstractC9512d dVar) {
            this.f11447a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC9512d.C9516e revealInfo = this.f11447a.getRevealInfo();
            revealInfo.f21103c = Float.MAX_VALUE;
            this.f11447a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: classes3.dex */
    public static class C5789e {

        /* renamed from: a */
        public C7108h f11449a;

        /* renamed from: b */
        public C7110j f11450b;
    }

    public FabTransformationBehavior() {
        this.f11432c = new Rect();
        this.f11433d = new RectF();
        this.f11434e = new RectF();
        this.f11435f = new int[2];
    }

    /* renamed from: K */
    private ViewGroup m27373K(View view) {
        View findViewById = view.findViewById(C6807f.f38015A);
        if (findViewById != null) {
            return m27353f0(findViewById);
        }
        if ((view instanceof C1359b) || (view instanceof C1358a)) {
            return m27353f0(((ViewGroup) view).getChildAt(0));
        }
        return m27353f0(view);
    }

    /* renamed from: L */
    private void m27372L(View view, C5789e eVar, C7109i iVar, C7109i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float S = m27365S(eVar, iVar, f, f3);
        float S2 = m27365S(eVar, iVar2, f2, f4);
        Rect rect = this.f11432c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f11433d;
        rectF2.set(rect);
        RectF rectF3 = this.f11434e;
        m27364T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m27371M(View view, RectF rectF) {
        m27364T(view, rectF);
        rectF.offset(this.f11436g, this.f11437h);
    }

    /* renamed from: N */
    private Pair<C7109i, C7109i> m27370N(float f, float f2, boolean z, C5789e eVar) {
        C7109i iVar;
        C7109i iVar2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            iVar2 = eVar.f11449a.m23382e("translationXLinear");
            iVar = eVar.f11449a.m23382e("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            iVar2 = eVar.f11449a.m23382e("translationXCurveDownwards");
            iVar = eVar.f11449a.m23382e("translationYCurveDownwards");
        } else {
            iVar2 = eVar.f11449a.m23382e("translationXCurveUpwards");
            iVar = eVar.f11449a.m23382e("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    /* renamed from: O */
    private float m27369O(View view, View view2, C7110j jVar) {
        RectF rectF = this.f11433d;
        RectF rectF2 = this.f11434e;
        m27371M(view, rectF);
        m27364T(view2, rectF2);
        rectF2.offset(-m27367Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m27368P(View view, View view2, C7110j jVar) {
        RectF rectF = this.f11433d;
        RectF rectF2 = this.f11434e;
        m27371M(view, rectF);
        m27364T(view2, rectF2);
        rectF2.offset(0.0f, -m27366R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m27367Q(View view, View view2, C7110j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f11433d;
        RectF rectF2 = this.f11434e;
        m27371M(view, rectF);
        m27364T(view2, rectF2);
        int i = jVar.f15506a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f15507b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f15507b;
    }

    /* renamed from: R */
    private float m27366R(View view, View view2, C7110j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f11433d;
        RectF rectF2 = this.f11434e;
        m27371M(view, rectF);
        m27364T(view2, rectF2);
        int i = jVar.f15506a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f15508c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f15508c;
    }

    /* renamed from: S */
    private float m27365S(C5789e eVar, C7109i iVar, float f, float f2) {
        long c = iVar.m23375c();
        long d = iVar.m23374d();
        C7109i e = eVar.f11449a.m23382e("expansion");
        return C7101a.m23399a(f, f2, iVar.m23373e().getInterpolation(((float) (((e.m23375c() + e.m23374d()) + 17) - c)) / ((float) d)));
    }

    /* renamed from: T */
    private void m27364T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f11435f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: U */
    private void m27363U(View view, View view2, boolean z, boolean z2, C5789e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof AbstractC9512d) || C9511c.f21096a != 0) && (K = m27373K(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C7104d.f15492a.set(K, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(K, C7104d.f15492a, 1.0f);
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(K, C7104d.f15492a, 0.0f);
                }
                eVar.f11449a.m23382e("contentFade").m23377a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: V */
    private void m27362V(View view, View view2, boolean z, boolean z2, C5789e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof AbstractC9512d) {
            AbstractC9512d dVar = (AbstractC9512d) view2;
            int d0 = m27354d0(view);
            int i = 16777215 & d0;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(d0);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, AbstractC9512d.C0287d.f21100a, i);
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, AbstractC9512d.C0287d.f21100a, d0);
            }
            objectAnimator.setEvaluator(C7103c.m23394b());
            eVar.f11449a.m23382e(ViewProps.COLOR).m23377a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: W */
    private void m27361W(View view, View view2, boolean z, C5789e eVar, List<Animator> list) {
        float Q = m27367Q(view, view2, eVar.f11450b);
        float R = m27366R(view, view2, eVar.f11450b);
        Pair<C7109i, C7109i> N = m27370N(Q, R, z, eVar);
        C7109i iVar = (C7109i) N.first;
        C7109i iVar2 = (C7109i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.f11436g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.f11437h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.m23377a(ofFloat);
        iVar2.m23377a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m27360X(View view, View view2, boolean z, boolean z2, C5789e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float w = C2733w0.m36979w(view2) - C2733w0.m36979w(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-w);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -w);
        }
        eVar.f11449a.m23382e(ViewProps.ELEVATION).m23377a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: Y */
    private void m27359Y(View view, View view2, boolean z, boolean z2, C5789e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof AbstractC9512d) {
            AbstractC9512d dVar = (AbstractC9512d) view2;
            float O = m27369O(view, view2, eVar.f11450b);
            float P = m27368P(view, view2, eVar.f11450b);
            ((FloatingActionButton) view).m28066i(this.f11432c);
            float width = this.f11432c.width() / 2.0f;
            C7109i e = eVar.f11449a.m23382e("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new AbstractC9512d.C9516e(O, P, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f21103c;
                }
                animator = C9509a.m16112a(dVar, O, P, C12102a.m7837b(O, P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C5788d(dVar));
                m27356b0(view2, e.m23375c(), (int) O, (int) P, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f21103c;
                Animator a = C9509a.m16112a(dVar, O, P, width);
                int i = (int) O;
                int i2 = (int) P;
                m27356b0(view2, e.m23375c(), i, i2, f3, list);
                m27357a0(view2, e.m23375c(), e.m23374d(), eVar.f11449a.m23381f(), i, i2, width, list);
                animator = a;
            }
            e.m23377a(animator);
            list.add(animator);
            list2.add(C9509a.m16111b(dVar));
        }
    }

    /* renamed from: Z */
    private void m27358Z(View view, View view2, boolean z, boolean z2, C5789e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof AbstractC9512d) && (view instanceof ImageView)) {
            AbstractC9512d dVar = (AbstractC9512d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C7105e.f15493b, 0);
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C7105e.f15493b, 255);
                }
                objectAnimator.addUpdateListener(new C5786b(view2));
                eVar.f11449a.m23382e("iconFade").m23377a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new C5787c(dVar, drawable));
            }
        }
    }

    /* renamed from: a0 */
    private void m27357a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: b0 */
    private void m27356b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: c0 */
    private void m27355c0(View view, View view2, boolean z, boolean z2, C5789e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float Q = m27367Q(view, view2, eVar.f11450b);
        float R = m27366R(view, view2, eVar.f11450b);
        Pair<C7109i, C7109i> N = m27370N(Q, R, z, eVar);
        C7109i iVar = (C7109i) N.first;
        C7109i iVar2 = (C7109i) N.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-Q);
                view2.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            m27372L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -Q);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -R);
        }
        iVar.m23377a(objectAnimator2);
        iVar2.m23377a(objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    /* renamed from: d0 */
    private int m27354d0(View view) {
        ColorStateList s = C2733w0.m36987s(view);
        if (s != null) {
            return s.getColorForState(view.getDrawableState(), s.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m27353f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo27350J(View view, View view2, boolean z, boolean z2) {
        C5789e e0 = mo27346e0(view2.getContext(), z);
        if (z) {
            this.f11436g = view.getTranslationX();
            this.f11437h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m27360X(view, view2, z, z2, e0, arrayList, arrayList2);
        RectF rectF = this.f11433d;
        m27355c0(view, view2, z, z2, e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m27361W(view, view2, z, e0, arrayList);
        m27358Z(view, view2, z, z2, e0, arrayList, arrayList2);
        m27359Y(view, view2, z, z2, e0, width, height, arrayList, arrayList2);
        m27362V(view, view2, z, z2, e0, arrayList, arrayList2);
        m27363U(view, view2, z, z2, e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C7102b.m23396a(animatorSet, arrayList);
        animatorSet.addListener(new C5785a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: e */
    public boolean mo27348e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: e0 */
    protected abstract C5789e mo27346e0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: g */
    public void mo27352g(CoordinatorLayout.C2155f fVar) {
        if (fVar.f3003h == 0) {
            fVar.f3003h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11432c = new Rect();
        this.f11433d = new RectF();
        this.f11434e = new RectF();
        this.f11435f = new int[2];
    }
}
