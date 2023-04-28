package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2733w0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C5646c;
import java.util.List;
import p083eb.C6811j;
import p083eb.C6812k;
import p102fb.C7108h;

/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AbstractC2151b {

    /* renamed from: M */
    private static final int f37492M = C6811j.f14671q;

    /* renamed from: N */
    static final Property<View, Float> f37493N = new C5614b(Float.class, "width");

    /* renamed from: O */
    static final Property<View, Float> f37494O = new C5615c(Float.class, "height");

    /* renamed from: P */
    static final Property<View, Float> f37495P = new C5616d(Float.class, ViewProps.PADDING_START);

    /* renamed from: Q */
    static final Property<View, Float> f37496Q = new C5617e(Float.class, ViewProps.PADDING_END);

    /* renamed from: D */
    private int f37497D;

    /* renamed from: E */
    private final int f37498E;

    /* renamed from: F */
    private int f37499F;

    /* renamed from: G */
    private int f37500G;

    /* renamed from: H */
    private final CoordinatorLayout.AbstractC2152c<ExtendedFloatingActionButton> f37501H;

    /* renamed from: I */
    private boolean f37502I;

    /* renamed from: J */
    private boolean f37503J;

    /* renamed from: K */
    private boolean f37504K;

    /* renamed from: L */
    protected ColorStateList f37505L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: classes3.dex */
    public class C5613a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f10888a;

        C5613a(AbstractC5637c cVar, AbstractC5618f fVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10888a = true;
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: classes3.dex */
    class C5614b extends Property<View, Float> {
        C5614b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    /* loaded from: classes3.dex */
    class C5615c extends Property<View, Float> {
        C5615c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    /* loaded from: classes3.dex */
    class C5616d extends Property<View, Float> {
        C5616d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C2733w0.m37053G(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C2733w0.m37054F0(view, f.intValue(), view.getPaddingTop(), C2733w0.m37055F(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    /* loaded from: classes3.dex */
    class C5617e extends Property<View, Float> {
        C5617e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C2733w0.m37055F(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C2733w0.m37054F0(view, C2733w0.m37053G(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC5618f {
    }

    /* renamed from: o */
    private boolean m28093o() {
        if (getVisibility() != 0) {
            if (this.f37497D == 2) {
                return true;
            }
            return false;
        } else if (this.f37497D != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m28092p(AbstractC5637c cVar, AbstractC5618f fVar) {
        if (!cVar.m27977b()) {
            if (!m28090r()) {
                cVar.m27978a();
                cVar.m27974e(fVar);
                return;
            }
            measure(0, 0);
            AnimatorSet c = cVar.m27976c();
            c.addListener(new C5613a(cVar, fVar));
            for (Animator.AnimatorListener animatorListener : cVar.m27975d()) {
                c.addListener(animatorListener);
            }
            c.start();
        }
    }

    /* renamed from: q */
    private void m28091q() {
        this.f37505L = getTextColors();
    }

    /* renamed from: r */
    private boolean m28090r() {
        if ((C2733w0.m37029U(this) || (!m28093o() && this.f37504K)) && !isInEditMode()) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2151b
    public CoordinatorLayout.AbstractC2152c<ExtendedFloatingActionButton> getBehavior() {
        return this.f37501H;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i = this.f37498E;
        if (i < 0) {
            return (Math.min(C2733w0.m37053G(this), C2733w0.m37055F(this)) * 2) + getIconSize();
        }
        return i;
    }

    public C7108h getExtendMotionSpec() {
        throw null;
    }

    public C7108h getHideMotionSpec() {
        throw null;
    }

    public C7108h getShowMotionSpec() {
        throw null;
    }

    public C7108h getShrinkMotionSpec() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37502I && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f37502I = false;
            throw null;
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f37504K = z;
    }

    public void setExtendMotionSpec(C7108h hVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C7108h.m23384c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f37502I != z) {
            throw null;
        }
    }

    public void setHideMotionSpec(C7108h hVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C7108h.m23384c(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f37502I && !this.f37503J) {
            this.f37499F = C2733w0.m37053G(this);
            this.f37500G = C2733w0.m37055F(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f37502I && !this.f37503J) {
            this.f37499F = i;
            this.f37500G = i3;
        }
    }

    public void setShowMotionSpec(C7108h hVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C7108h.m23384c(getContext(), i));
    }

    public void setShrinkMotionSpec(C7108h hVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C7108h.m23384c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        m28091q();
    }

    /* loaded from: classes3.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC2152c<T> {

        /* renamed from: a */
        private Rect f10885a;

        /* renamed from: b */
        private boolean f10886b;

        /* renamed from: c */
        private boolean f10887c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f10886b = false;
            this.f10887c = true;
        }

        /* renamed from: G */
        private static boolean m28087G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C2155f) {
                return ((CoordinatorLayout.C2155f) layoutParams).m38683f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m28084J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C2155f fVar = (CoordinatorLayout.C2155f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f10886b || this.f10887c) && fVar.m38684e() == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: L */
        private boolean m28082L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m28084J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f10885a == null) {
                this.f10885a = new Rect();
            }
            Rect rect = this.f10885a;
            C5646c.m27879a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                m28083K(extendedFloatingActionButton);
                return true;
            }
            m28089E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: M */
        private boolean m28081M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m28084J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C2155f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                m28083K(extendedFloatingActionButton);
                return true;
            }
            m28089E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: E */
        protected void m28089E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f10887c) {
                extendedFloatingActionButton.getClass();
            } else {
                extendedFloatingActionButton.getClass();
            }
            extendedFloatingActionButton.m28092p(null, null);
        }

        /* renamed from: F */
        public boolean mo28048b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo28048b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: H */
        public boolean mo27376h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m28082L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m28087G(view)) {
                return false;
            } else {
                m28081M(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo27375l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> l = coordinatorLayout.m38715l(extendedFloatingActionButton);
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = l.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m28087G(view) && m28081M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m28082L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m38742C(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: K */
        protected void m28083K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f10887c) {
                extendedFloatingActionButton.getClass();
            } else {
                extendedFloatingActionButton.getClass();
            }
            extendedFloatingActionButton.m28092p(null, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: g */
        public void mo27352g(CoordinatorLayout.C2155f fVar) {
            if (fVar.f3003h == 0) {
                fVar.f3003h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6812k.f38113K1);
            this.f10886b = obtainStyledAttributes.getBoolean(C6812k.f38121L1, false);
            this.f10887c = obtainStyledAttributes.getBoolean(C6812k.f38129M1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m28091q();
    }
}
