package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.util.C2513d;
import androidx.core.view.AbstractC2679o0;
import androidx.core.view.AbstractC2694r0;
import androidx.core.view.C2549a;
import androidx.core.view.C2733w0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import java.lang.ref.WeakReference;
import java.util.List;
import p054d1.C6391a;
import p071e.C6525a;
import p083eb.C6803b;
import p083eb.C6805d;
import p083eb.C6808g;
import p083eb.C6811j;
import p083eb.C6812k;
import p102fb.C7101a;
import p125h1.AbstractC7736a;
import p422xb.C14038g;
import p422xb.C14042h;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AbstractC2151b {

    /* renamed from: D */
    private static final int f37399D = C6811j.f14658d;

    /* renamed from: A */
    private int[] f37400A;

    /* renamed from: B */
    private Drawable f37401B;

    /* renamed from: C */
    private Behavior f37402C;

    /* renamed from: k */
    private int f10422k;

    /* renamed from: l */
    private int f10423l;

    /* renamed from: m */
    private int f10424m;

    /* renamed from: n */
    private int f10425n;

    /* renamed from: o */
    private boolean f10426o;

    /* renamed from: p */
    private int f10427p;

    /* renamed from: q */
    private WindowInsetsCompat f10428q;

    /* renamed from: r */
    private List<AbstractC5505c> f10429r;

    /* renamed from: s */
    private boolean f10430s;

    /* renamed from: t */
    private boolean f10431t;

    /* renamed from: u */
    private boolean f10432u;

    /* renamed from: v */
    private boolean f10433v;

    /* renamed from: w */
    private int f10434w;

    /* renamed from: x */
    private WeakReference<View> f10435x;

    /* renamed from: y */
    private ValueAnimator f10436y;

    /* renamed from: z */
    private final List<AbstractC5509g> f10437z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC5510a<T> {

        /* renamed from: k */
        private int f10438k;

        /* renamed from: l */
        private int f10439l;

        /* renamed from: m */
        private ValueAnimator f10440m;

        /* renamed from: n */
        private C5501e f10441n;

        /* renamed from: o */
        private WeakReference<View> f10442o;

        /* renamed from: p */
        private boolean f10443p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes3.dex */
        public class C5497a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f10444a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f10445b;

            C5497a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f10444a = coordinatorLayout;
                this.f10445b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m28754P(this.f10444a, this.f10445b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes3.dex */
        public class C5498b extends C2549a {
            C5498b() {
            }

            @Override // androidx.core.view.C2549a
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.m37343x0(BaseBehavior.this.f10443p);
                accessibilityNodeInfoCompat.m37389a0(ScrollView.class.getName());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: classes3.dex */
        public class C5499c implements AccessibilityViewCommand {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f10448a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f10449b;

            /* renamed from: c */
            final /* synthetic */ View f10450c;

            /* renamed from: d */
            final /* synthetic */ int f10451d;

            C5499c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f10448a = coordinatorLayout;
                this.f10449b = appBarLayout;
                this.f10450c = view;
                this.f10451d = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            /* renamed from: a */
            public boolean mo28572a(View view, AccessibilityViewCommand.AbstractC2563a aVar) {
                BaseBehavior.this.mo28594q(this.f10448a, this.f10449b, this.f10450c, 0, this.f10451d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        /* loaded from: classes3.dex */
        public class C5500d implements AccessibilityViewCommand {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f10453a;

            /* renamed from: b */
            final /* synthetic */ boolean f10454b;

            C5500d(AppBarLayout appBarLayout, boolean z) {
                this.f10453a = appBarLayout;
                this.f10454b = z;
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            /* renamed from: a */
            public boolean mo28572a(View view, AccessibilityViewCommand.AbstractC2563a aVar) {
                this.f10453a.setExpanded(this.f10454b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: T */
        private boolean m28820T(CoordinatorLayout coordinatorLayout, T t, View view) {
            boolean z = false;
            if (mo28757M() != (-t.getTotalScrollRange())) {
                m28819U(coordinatorLayout, t, AccessibilityNodeInfoCompat.C2556a.f3569q, false);
                z = true;
            }
            if (mo28757M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        C2733w0.m36998m0(coordinatorLayout, AccessibilityNodeInfoCompat.C2556a.f3570r, null, new C5499c(coordinatorLayout, t, view, i));
                        return true;
                    }
                } else {
                    m28819U(coordinatorLayout, t, AccessibilityNodeInfoCompat.C2556a.f3570r, true);
                    return true;
                }
            }
            return z;
        }

        /* renamed from: U */
        private void m28819U(CoordinatorLayout coordinatorLayout, T t, AccessibilityNodeInfoCompat.C2556a aVar, boolean z) {
            C2733w0.m36998m0(coordinatorLayout, aVar, null, new C5500d(t, z));
        }

        /* renamed from: V */
        private void m28818V(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo28757M() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            m28817W(coordinatorLayout, t, i, i2);
        }

        /* renamed from: W */
        private void m28817W(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int M = mo28757M();
            if (M == i) {
                ValueAnimator valueAnimator = this.f10440m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f10440m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f10440m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f10440m = valueAnimator3;
                valueAnimator3.setInterpolator(C7101a.f15490e);
                this.f10440m.addUpdateListener(new C5497a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f10440m.setDuration(Math.min(i2, 600));
            this.f10440m.setIntValues(M, i);
            this.f10440m.start();
        }

        /* renamed from: X */
        private int m28816X(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        /* renamed from: Z */
        private boolean m28814Z(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (!t.m28838j() || coordinatorLayout.getHeight() - view.getHeight() > t.getHeight()) {
                return false;
            }
            return true;
        }

        /* renamed from: a0 */
        private static boolean m28813a0(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: b0 */
        private boolean m28812b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((C5508f) appBarLayout.getChildAt(i).getLayoutParams()).f10466a != 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c0 */
        private View m28811c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof AbstractC2679o0) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: d0 */
        private static View m28810d0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: e0 */
        private int m28809e0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C5508f fVar = (C5508f) childAt.getLayoutParams();
                if (m28813a0(fVar.m28774c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) fVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) fVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: f0 */
        private View m28808f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.C2155f) childAt.getLayoutParams()).m38683f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: i0 */
        private int m28805i0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C5508f fVar = (C5508f) childAt.getLayoutParams();
                Interpolator d = fVar.m28773d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (d != null) {
                    int c = fVar.m28774c();
                    if ((c & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                        if ((c & 2) != 0) {
                            i2 -= C2733w0.m37061C(childAt);
                        }
                    }
                    if (C2733w0.m36975y(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * d.getInterpolation((abs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: v0 */
        private boolean m28800v0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> m = coordinatorLayout.m38714m(t);
            int size = m.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC2152c f = ((CoordinatorLayout.C2155f) m.get(i).getLayoutParams()).m38683f();
                if (f instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) f).m28749K() != 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }

        /* renamed from: w0 */
        private void m28799w0(CoordinatorLayout coordinatorLayout, T t) {
            int topInset = t.getTopInset() + t.getPaddingTop();
            int M = mo28757M() - topInset;
            int e0 = m28809e0(t, M);
            if (e0 >= 0) {
                View childAt = t.getChildAt(e0);
                C5508f fVar = (C5508f) childAt.getLayoutParams();
                int c = fVar.m28774c();
                if ((c & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (e0 == 0 && C2733w0.m36975y(t) && C2733w0.m36975y(childAt)) {
                        i -= t.getTopInset();
                    }
                    if (m28813a0(c, 2)) {
                        i2 += C2733w0.m37061C(childAt);
                    } else if (m28813a0(c, 5)) {
                        int C = C2733w0.m37061C(childAt) + i2;
                        if (M < C) {
                            i = C;
                        } else {
                            i2 = C;
                        }
                    }
                    if (m28813a0(c, 32)) {
                        i += ((LinearLayout.LayoutParams) fVar).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) fVar).bottomMargin;
                    }
                    m28818V(coordinatorLayout, t, C6391a.m25632b(m28816X(M, i2, i) + topInset, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: x0 */
        private void m28798x0(CoordinatorLayout coordinatorLayout, T t) {
            View f0;
            C2733w0.m37002k0(coordinatorLayout, AccessibilityNodeInfoCompat.C2556a.f3569q.m37337b());
            C2733w0.m37002k0(coordinatorLayout, AccessibilityNodeInfoCompat.C2556a.f3570r.m37337b());
            if (t.getTotalScrollRange() != 0 && (f0 = m28808f0(coordinatorLayout)) != null && m28812b0(t)) {
                if (!C2733w0.m37037O(coordinatorLayout)) {
                    C2733w0.m36990q0(coordinatorLayout, new C5498b());
                }
                this.f10443p = m28820T(coordinatorLayout, t, f0);
            }
        }

        /* renamed from: y0 */
        private void m28797y0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View d0 = m28810d0(t, i);
            boolean z2 = false;
            if (d0 != null) {
                int c = ((C5508f) d0.getLayoutParams()).m28774c();
                if ((c & 1) != 0) {
                    int C = C2733w0.m37061C(d0);
                    if (i2 <= 0 || (c & 12) == 0 ? !((c & 2) == 0 || (-i) < (d0.getBottom() - C) - t.getTopInset()) : (-i) >= (d0.getBottom() - C) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.m28836l()) {
                z2 = t.m28826v(m28811c0(coordinatorLayout));
            }
            boolean s = t.m28829s(z2);
            if (z || (s && m28800v0(coordinatorLayout, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.AbstractC5510a
        /* renamed from: M */
        int mo28757M() {
            return mo28743E() + this.f10438k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Y */
        public boolean mo28762H(T t) {
            WeakReference<View> weakReference = this.f10442o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g0 */
        public int mo28759K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h0 */
        public int mo28758L(T t) {
            return t.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j0 */
        public void mo28756N(CoordinatorLayout coordinatorLayout, T t) {
            m28799w0(coordinatorLayout, t);
            if (t.m28836l()) {
                t.m28829s(t.m28826v(m28811c0(coordinatorLayout)));
            }
        }

        /* renamed from: k0 */
        public boolean mo27375l(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean z;
            int i2;
            boolean l = super.mo27375l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            C5501e eVar = this.f10441n;
            if (eVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    if ((pendingAction & 4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((pendingAction & 2) != 0) {
                        int i3 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            m28818V(coordinatorLayout, t, i3, 0.0f);
                        } else {
                            m28754P(coordinatorLayout, t, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            m28818V(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            m28754P(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (eVar.f10456m) {
                m28754P(coordinatorLayout, t, -t.getTotalScrollRange());
            } else if (eVar.f10457n) {
                m28754P(coordinatorLayout, t, 0);
            } else {
                View childAt = t.getChildAt(eVar.f10458o);
                int i4 = -childAt.getBottom();
                if (this.f10441n.f10460q) {
                    i2 = C2733w0.m37061C(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(childAt.getHeight() * this.f10441n.f10459p);
                }
                m28754P(coordinatorLayout, t, i4 + i2);
            }
            t.m28833o();
            this.f10441n = null;
            mo28741G(C6391a.m25632b(mo28743E(), -t.getTotalScrollRange(), 0));
            m28797y0(coordinatorLayout, t, mo28743E(), 0, true);
            t.m28835m(mo28743E());
            m28798x0(coordinatorLayout, t);
            return l;
        }

        /* renamed from: l0 */
        public boolean mo28600m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C2155f) t.getLayoutParams())).height != -2) {
                return super.mo28600m(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.m38741D(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: m0 */
        public void mo28594q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i5 = -t.getTotalScrollRange();
                    i4 = t.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = m28755O(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.m28836l()) {
                t.m28829s(t.m28826v(view));
            }
        }

        /* renamed from: n0 */
        public void mo28590t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = m28755O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m28798x0(coordinatorLayout, t);
            }
        }

        /* renamed from: o0 */
        public void mo28585x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C5501e) {
                m28803s0((C5501e) parcelable, true);
                super.mo28585x(coordinatorLayout, t, this.f10441n.m21547a());
                return;
            }
            super.mo28585x(coordinatorLayout, t, parcelable);
            this.f10441n = null;
        }

        /* renamed from: p0 */
        public Parcelable mo28583y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.mo28583y(coordinatorLayout, t);
            C5501e t0 = m28802t0(y, t);
            if (t0 == null) {
                return y;
            }
            return t0;
        }

        /* renamed from: q0 */
        public boolean mo28651A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            if ((i & 2) == 0 || (!t.m28836l() && !m28814Z(coordinatorLayout, t, view))) {
                z = false;
            } else {
                z = true;
            }
            if (z && (valueAnimator = this.f10440m) != null) {
                valueAnimator.cancel();
            }
            this.f10442o = null;
            this.f10439l = i2;
            return z;
        }

        /* renamed from: r0 */
        public void mo28648C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f10439l == 0 || i == 1) {
                m28799w0(coordinatorLayout, t);
                if (t.m28836l()) {
                    t.m28829s(t.m28826v(view));
                }
            }
            this.f10442o = new WeakReference<>(view);
        }

        /* renamed from: s0 */
        void m28803s0(C5501e eVar, boolean z) {
            if (this.f10441n == null || z) {
                this.f10441n = eVar;
            }
        }

        /* renamed from: t0 */
        C5501e m28802t0(Parcelable parcelable, T t) {
            boolean z;
            boolean z2;
            int E = mo28743E();
            int childCount = t.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC7736a.f16773l;
                    }
                    C5501e eVar = new C5501e(parcelable);
                    if (E == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    eVar.f10457n = z;
                    if (z || (-E) < t.getTotalScrollRange()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    eVar.f10456m = z2;
                    eVar.f10458o = i;
                    if (bottom == C2733w0.m37061C(childAt) + t.getTopInset()) {
                        z3 = true;
                    }
                    eVar.f10460q = z3;
                    eVar.f10459p = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u0 */
        public int mo28753Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int i4;
            int M = mo28757M();
            int i5 = 0;
            if (i2 == 0 || M < i2 || M > i3) {
                this.f10438k = 0;
            } else {
                int b = C6391a.m25632b(i, i2, i3);
                if (M != b) {
                    if (t.m28840h()) {
                        i4 = m28805i0(t, b);
                    } else {
                        i4 = b;
                    }
                    boolean G = mo28741G(i4);
                    int i6 = M - b;
                    this.f10438k = b - i4;
                    int i7 = 1;
                    if (G) {
                        while (i5 < t.getChildCount()) {
                            C5508f fVar = (C5508f) t.getChildAt(i5).getLayoutParams();
                            AbstractC5506d b2 = fVar.m28775b();
                            if (!(b2 == null || (fVar.m28774c() & 1) == 0)) {
                                b2.mo28778a(t, t.getChildAt(i5), mo28743E());
                            }
                            i5++;
                        }
                    }
                    if (!G && t.m28840h()) {
                        coordinatorLayout.m38721f(t);
                    }
                    t.m28835m(mo28743E());
                    if (b < M) {
                        i7 = -1;
                    }
                    m28797y0(coordinatorLayout, t, b, i7, false);
                    i5 = i6;
                }
            }
            m28798x0(coordinatorLayout, t);
            return i5;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e */
        /* loaded from: classes3.dex */
        public static class C5501e extends AbstractC7736a {
            public static final Parcelable.Creator<C5501e> CREATOR = new C5502a();

            /* renamed from: m */
            boolean f10456m;

            /* renamed from: n */
            boolean f10457n;

            /* renamed from: o */
            int f10458o;

            /* renamed from: p */
            float f10459p;

            /* renamed from: q */
            boolean f10460q;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e$a */
            /* loaded from: classes3.dex */
            class C5502a implements Parcelable.ClassLoaderCreator<C5501e> {
                C5502a() {
                }

                /* renamed from: a */
                public C5501e createFromParcel(Parcel parcel) {
                    return new C5501e(parcel, null);
                }

                /* renamed from: b */
                public C5501e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C5501e(parcel, classLoader);
                }

                /* renamed from: c */
                public C5501e[] newArray(int i) {
                    return new C5501e[i];
                }
            }

            public C5501e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z = true;
                this.f10456m = parcel.readByte() != 0;
                this.f10457n = parcel.readByte() != 0;
                this.f10458o = parcel.readInt();
                this.f10459p = parcel.readFloat();
                this.f10460q = parcel.readByte() == 0 ? false : z;
            }

            @Override // p125h1.AbstractC7736a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f10456m ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f10457n ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f10458o);
                parcel.writeFloat(this.f10459p);
                parcel.writeByte(this.f10460q ? (byte) 1 : (byte) 0);
            }

            public C5501e(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AbstractC5510a, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: D */
        public /* bridge */ /* synthetic */ boolean mo27351D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo27351D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.C5512c
        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo28743E() {
            return super.mo28743E();
        }

        @Override // com.google.android.material.appbar.C5512c
        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo28741G(int i) {
            return super.mo28741G(i);
        }

        @Override // com.google.android.material.appbar.AbstractC5510a, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: k */
        public /* bridge */ /* synthetic */ boolean mo27689k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo27689k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean mo28793k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo27375l(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean mo28792l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo28600m(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ void mo28791m0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo28594q(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void mo28790n0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo28590t(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ void mo28789o0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo28585x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable mo28788p0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo28583y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean mo28787q0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo28651A(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void mo28786r0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo28648C(coordinatorLayout, appBarLayout, view, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public static class ScrollingViewBehavior extends AbstractC5511b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m28784R(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC2152c f = ((CoordinatorLayout.C2155f) appBarLayout.getLayoutParams()).m38683f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo28757M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m28783S(View view, View view2) {
            CoordinatorLayout.AbstractC2152c f = ((CoordinatorLayout.C2155f) view2.getLayoutParams()).m38683f();
            if (f instanceof BaseBehavior) {
                C2733w0.m37020b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f10438k) + m28747M()) - m28751I(view2));
            }
        }

        /* renamed from: T */
        private void m28782T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m28836l()) {
                    appBarLayout.m28829s(appBarLayout.m28826v(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC5511b
        /* renamed from: J */
        float mo28750J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = m28784R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (R / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.AbstractC5511b
        /* renamed from: L */
        int mo28748L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo28748L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout mo28752H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: e */
        public boolean mo27348e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: h */
        public boolean mo27376h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m28783S(view, view2);
            m28782T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: i */
        public void mo28781i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C2733w0.m37002k0(coordinatorLayout, AccessibilityNodeInfoCompat.C2556a.f3569q.m37337b());
                C2733w0.m37002k0(coordinatorLayout, AccessibilityNodeInfoCompat.C2556a.f3570r.m37337b());
                C2733w0.m36990q0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.C5512c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo27375l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo27375l(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.AbstractC5511b, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo28600m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo28600m(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: w */
        public boolean mo28780w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = mo28752H(coordinatorLayout.m38715l(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f10486d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.m28832p(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6812k.f14858w4);
            m28745O(obtainStyledAttributes.getDimensionPixelSize(C6812k.f14866x4, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes3.dex */
    class C5503a implements AbstractC2694r0 {
        C5503a() {
        }

        @Override // androidx.core.view.AbstractC2694r0
        /* renamed from: a */
        public WindowInsetsCompat mo13081a(View view, WindowInsetsCompat windowInsetsCompat) {
            return AppBarLayout.this.m28834n(windowInsetsCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes3.dex */
    public class C5504b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C14038g f10462a;

        C5504b(C14038g gVar) {
            this.f10462a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f10462a.m1982X(floatValue);
            if (AppBarLayout.this.f37401B instanceof C14038g) {
                ((C14038g) AppBarLayout.this.f37401B).m1982X(floatValue);
            }
            for (AbstractC5509g gVar : AppBarLayout.this.f10437z) {
                gVar.m28769a(floatValue, this.f10462a.m2005A());
            }
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    /* loaded from: classes3.dex */
    public interface AbstractC5505c<T extends AppBarLayout> {
        /* renamed from: a */
        void m28779a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC5506d {
        /* renamed from: a */
        public abstract void mo28778a(AppBarLayout appBarLayout, View view, float f);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    /* loaded from: classes3.dex */
    public static class C5507e extends AbstractC5506d {

        /* renamed from: a */
        private final Rect f10464a = new Rect();

        /* renamed from: b */
        private final Rect f10465b = new Rect();

        /* renamed from: b */
        private static void m28777b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC5506d
        /* renamed from: a */
        public void mo28778a(AppBarLayout appBarLayout, View view, float f) {
            m28777b(this.f10464a, appBarLayout, view);
            float abs = this.f10464a.top - Math.abs(f);
            if (abs <= 0.0f) {
                float a = 1.0f - C6391a.m25633a(Math.abs(abs / this.f10464a.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.f10464a.height() * 0.3f) * (1.0f - (a * a)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f10465b);
                this.f10465b.offset(0, (int) (-height));
                C2733w0.m36976x0(view, this.f10465b);
                return;
            }
            C2733w0.m36976x0(view, null);
            view.setTranslationY(0.0f);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$g */
    /* loaded from: classes3.dex */
    public interface AbstractC5509g {
        /* renamed from: a */
        void m28769a(float f, int i);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m28845c() {
        WeakReference<View> weakReference = this.f10435x;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f10435x = null;
    }

    /* renamed from: d */
    private View m28844d(View view) {
        int i;
        View view2;
        if (this.f10435x == null && (i = this.f10434w) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f10434w);
            }
            if (view2 != null) {
                this.f10435x = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f10435x;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: i */
    private boolean m28839i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C5508f) getChildAt(i).getLayoutParams()).m28772e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m28837k() {
        BaseBehavior.C5501e eVar;
        Behavior behavior = this.f37402C;
        if (behavior == null || this.f10423l == -1 || this.f10427p != 0) {
            eVar = null;
        } else {
            eVar = behavior.m28802t0(AbstractC7736a.f16773l, this);
        }
        this.f10423l = -1;
        this.f10424m = -1;
        this.f10425n = -1;
        if (eVar != null) {
            this.f37402C.m28803s0(eVar, false);
        }
    }

    /* renamed from: q */
    private void m28831q(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f10427p = i4 | i3;
        requestLayout();
    }

    /* renamed from: r */
    private boolean m28830r(boolean z) {
        if (this.f10431t == z) {
            return false;
        }
        this.f10431t = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: u */
    private boolean m28827u() {
        return this.f37401B != null && getTopInset() > 0;
    }

    /* renamed from: w */
    private boolean m28825w() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C2733w0.m36975y(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    private void m28824x(C14038g gVar, boolean z) {
        float f;
        float dimension = getResources().getDimension(C6805d.f14559a);
        if (z) {
            f = 0.0f;
        } else {
            f = dimension;
        }
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f10436y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.f10436y = ofFloat;
        ofFloat.setDuration(getResources().getInteger(C6808g.f14618a));
        this.f10436y.setInterpolator(C7101a.f15486a);
        this.f10436y.addUpdateListener(new C5504b(gVar));
        this.f10436y.start();
    }

    /* renamed from: y */
    private void m28823y() {
        setWillNotDraw(!m28827u());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5508f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m28827u()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f10422k);
            this.f37401B.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f37401B;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public C5508f generateDefaultLayoutParams() {
        return new C5508f(-1, -2);
    }

    /* renamed from: f */
    public C5508f generateLayoutParams(AttributeSet attributeSet) {
        return new C5508f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public C5508f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C5508f((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C5508f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C5508f(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2151b
    public CoordinatorLayout.AbstractC2152c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f37402C = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i;
        int C;
        int i2 = this.f10424m;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C5508f fVar = (C5508f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = fVar.f10466a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                if ((i4 & 8) != 0) {
                    C = C2733w0.m37061C(childAt);
                } else if ((i4 & 2) != 0) {
                    C = measuredHeight - C2733w0.m37061C(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C2733w0.m36975y(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + C;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f10424m = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.f10425n;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C5508f fVar = (C5508f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
            int i4 = fVar.f10466a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C2733w0.m37061C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f10425n = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f10434w;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int C = C2733w0.m37061C(this);
        if (C == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                C = C2733w0.m37061C(getChildAt(childCount - 1));
            } else {
                C = 0;
            }
            if (C == 0) {
                return getHeight() / 3;
            }
        }
        return (C * 2) + topInset;
    }

    int getPendingAction() {
        return this.f10427p;
    }

    public Drawable getStatusBarForeground() {
        return this.f37401B;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f10428q;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.m37512o();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f10423l;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C5508f fVar = (C5508f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = fVar.f10466a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
            if (i2 == 0 && C2733w0.m36975y(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C2733w0.m37061C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f10423l = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    boolean m28840h() {
        return this.f10426o;
    }

    /* renamed from: j */
    boolean m28838j() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: l */
    public boolean m28836l() {
        return this.f10433v;
    }

    /* renamed from: m */
    void m28835m(int i) {
        this.f10422k = i;
        if (!willNotDraw()) {
            C2733w0.m37008h0(this);
        }
        List<AbstractC5505c> list = this.f10429r;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC5505c cVar = this.f10429r.get(i2);
                if (cVar != null) {
                    cVar.m28779a(this, i);
                }
            }
        }
    }

    /* renamed from: n */
    WindowInsetsCompat m28834n(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (C2733w0.m36975y(this)) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!C2513d.m37601a(this.f10428q, windowInsetsCompat2)) {
            this.f10428q = windowInsetsCompat2;
            m28823y();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    /* renamed from: o */
    void m28833o() {
        this.f10427p = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14042h.m1939e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.f37400A == null) {
            this.f37400A = new int[4];
        }
        int[] iArr = this.f37400A;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f10431t;
        int i4 = C6803b.f37987G;
        if (!z) {
            i4 = -i4;
        }
        iArr[0] = i4;
        if (!z || !this.f10432u) {
            i2 = -C6803b.f37988H;
        } else {
            i2 = C6803b.f37988H;
        }
        iArr[1] = i2;
        int i5 = C6803b.f37985E;
        if (!z) {
            i5 = -i5;
        }
        iArr[2] = i5;
        if (!z || !this.f10432u) {
            i3 = -C6803b.f37984D;
        } else {
            i3 = C6803b.f37984D;
        }
        iArr[3] = i3;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m28845c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C2733w0.m36975y(this) && m28825w()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C2733w0.m37020b0(getChildAt(childCount), topInset);
            }
        }
        m28837k();
        this.f10426o = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C5508f) getChildAt(i5).getLayoutParams()).m28773d() != null) {
                this.f10426o = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f37401B;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f10430s) {
            if (!this.f10433v && !m28839i()) {
                z2 = false;
            }
            m28830r(z2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C2733w0.m36975y(this) && m28825w()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C6391a.m25632b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m28837k();
    }

    /* renamed from: p */
    public void m28832p(boolean z, boolean z2) {
        m28831q(z, z2, true);
    }

    /* renamed from: s */
    boolean m28829s(boolean z) {
        return m28828t(z, !this.f10430s);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C14042h.m1940d(this, f);
    }

    public void setExpanded(boolean z) {
        m28832p(z, C2733w0.m37029U(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f10433v = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f10434w = i;
        m28845c();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f10430s = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f37401B;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f37401B = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f37401B.setState(getDrawableState());
                }
                C2400a.m37830m(this.f37401B, C2733w0.m37063B(this));
                Drawable drawable4 = this.f37401B;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f37401B.setCallback(this);
            }
            m28823y();
            C2733w0.m37008h0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C6525a.m25364b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C5514e.m28734b(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f37401B;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: t */
    boolean m28828t(boolean z, boolean z2) {
        if (!z2 || this.f10432u == z) {
            return false;
        }
        this.f10432u = z;
        refreshDrawableState();
        if (!this.f10433v || !(getBackground() instanceof C14038g)) {
            return true;
        }
        m28824x((C14038g) getBackground(), z);
        return true;
    }

    /* renamed from: v */
    boolean m28826v(View view) {
        View d = m28844d(view);
        if (d != null) {
            view = d;
        }
        if (view == null || (!view.canScrollVertically(-1) && view.getScrollY() <= 0)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f37401B;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14527a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.f37399D
            android.content.Context r10 = p462zb.C14615a.m126c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f10423l = r10
            r9.f10424m = r10
            r9.f10425n = r10
            r6 = 0
            r9.f10427p = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f10437z = r0
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x002f
            com.google.android.material.appbar.C5514e.m28735a(r9)
        L_0x002f:
            com.google.android.material.appbar.C5514e.m28733c(r9, r11, r12, r4)
            int[] r2 = p083eb.C6812k.f14757k
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.C5662m.m27838h(r0, r1, r2, r3, r4, r5)
            int r12 = p083eb.C6812k.f14765l
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.C2733w0.m36982u0(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x006a
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            xb.g r0 = new xb.g
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.m1981Y(r12)
            r0.m1991O(r7)
            androidx.core.view.C2733w0.m36982u0(r9, r0)
        L_0x006a:
            int r12 = p083eb.C6812k.f14797p
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0079
            boolean r12 = r11.getBoolean(r12, r6)
            r9.m28831q(r12, r6, r6)
        L_0x0079:
            int r12 = p083eb.C6812k.f14789o
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0089
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.C5514e.m28734b(r9, r12)
        L_0x0089:
            r12 = 26
            if (r8 < r12) goto L_0x00ab
            int r12 = p083eb.C6812k.f14781n
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x009c
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        L_0x009c:
            int r12 = p083eb.C6812k.f14773m
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00ab
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        L_0x00ab:
            int r12 = p083eb.C6812k.f14805q
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f10433v = r12
            int r12 = p083eb.C6812k.f14813r
            int r10 = r11.getResourceId(r12, r10)
            r9.f10434w = r10
            int r10 = p083eb.C6812k.f14821s
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            androidx.core.view.C2733w0.m37058D0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$f */
    /* loaded from: classes3.dex */
    public static class C5508f extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f10466a;

        /* renamed from: b */
        private AbstractC5506d f10467b;

        /* renamed from: c */
        Interpolator f10468c;

        public C5508f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10466a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6812k.f14837u);
            this.f10466a = obtainStyledAttributes.getInt(C6812k.f14853w, 0);
            m28771f(m28776a(obtainStyledAttributes.getInt(C6812k.f14845v, 0)));
            int i = C6812k.f14861x;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f10468c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private AbstractC5506d m28776a(int i) {
            if (i != 1) {
                return null;
            }
            return new C5507e();
        }

        /* renamed from: b */
        public AbstractC5506d m28775b() {
            return this.f10467b;
        }

        /* renamed from: c */
        public int m28774c() {
            return this.f10466a;
        }

        /* renamed from: d */
        public Interpolator m28773d() {
            return this.f10468c;
        }

        /* renamed from: e */
        boolean m28772e() {
            int i = this.f10466a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* renamed from: f */
        public void m28771f(AbstractC5506d dVar) {
            this.f10467b = dVar;
        }

        /* renamed from: g */
        public void m28770g(int i) {
            this.f10466a = i;
        }

        public C5508f(int i, int i2) {
            super(i, i2);
            this.f10466a = 1;
        }

        public C5508f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10466a = 1;
        }

        public C5508f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10466a = 1;
        }

        public C5508f(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10466a = 1;
        }
    }
}
