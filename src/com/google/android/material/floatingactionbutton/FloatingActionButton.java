package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.appcompat.widget.C1683j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.util.C2517g;
import androidx.core.view.C2733w0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C5623a;
import com.google.android.material.internal.C5646c;
import com.google.android.material.internal.C5671p;
import java.util.List;
import p083eb.C6805d;
import p083eb.C6811j;
import p083eb.C6812k;
import p102fb.AbstractC7111k;
import p102fb.C7108h;
import p283pb.AbstractC11608a;
import p402wb.AbstractC13858b;
import p422xb.AbstractC14061n;
import p422xb.C14045k;
import p443yb.C14343a;

/* loaded from: classes3.dex */
public class FloatingActionButton extends C5671p implements AbstractC11608a, AbstractC14061n, CoordinatorLayout.AbstractC2151b {

    /* renamed from: z */
    private static final int f10890z = C6811j.f14660f;

    /* renamed from: l */
    private ColorStateList f10891l;

    /* renamed from: m */
    private PorterDuff.Mode f10892m;

    /* renamed from: n */
    private ColorStateList f10893n;

    /* renamed from: o */
    private PorterDuff.Mode f10894o;

    /* renamed from: p */
    private ColorStateList f10895p;

    /* renamed from: q */
    private int f10896q;

    /* renamed from: r */
    private int f10897r;

    /* renamed from: s */
    private int f10898s;

    /* renamed from: t */
    private int f10899t;

    /* renamed from: u */
    boolean f10900u;

    /* renamed from: v */
    final Rect f10901v;

    /* renamed from: w */
    private final Rect f10902w;

    /* renamed from: x */
    private final AppCompatImageHelper f10903x;

    /* renamed from: y */
    private C5623a f10904y;

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo28047E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo28048b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo28046H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo27376h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo28045I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo27375l(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo27352g(CoordinatorLayout.C2155f fVar) {
            super.mo27352g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes3.dex */
    public class C5619a implements C5623a.AbstractC5633k {

        /* renamed from: a */
        final /* synthetic */ AbstractC5620b f10908a;

        C5619a(AbstractC5620b bVar) {
            this.f10908a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.C5623a.AbstractC5633k
        /* renamed from: a */
        public void mo27992a() {
            this.f10908a.mo28043b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C5623a.AbstractC5633k
        /* renamed from: b */
        public void mo27991b() {
            this.f10908a.mo28044a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC5620b {
        /* renamed from: a */
        public void mo28044a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo28043b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes3.dex */
    public class C5621c implements AbstractC13858b {
        C5621c() {
        }

        @Override // p402wb.AbstractC13858b
        /* renamed from: a */
        public void mo2528a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f10901v.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f10898s, i2 + FloatingActionButton.this.f10898s, i3 + FloatingActionButton.this.f10898s, i4 + FloatingActionButton.this.f10898s);
        }

        @Override // p402wb.AbstractC13858b
        /* renamed from: b */
        public void mo2527b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // p402wb.AbstractC13858b
        /* renamed from: c */
        public boolean mo2526c() {
            return FloatingActionButton.this.f10900u;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    /* loaded from: classes3.dex */
    class C5622d<T extends FloatingActionButton> implements C5623a.AbstractC5632j {
        C5622d(AbstractC7111k<T> kVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.C5623a.AbstractC5632j
        /* renamed from: a */
        public void mo27994a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.C5623a.AbstractC5632j
        /* renamed from: b */
        public void mo27993b() {
            throw null;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5622d)) {
                return false;
            }
            ((C5622d) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }
    }

    private C5623a getImpl() {
        if (this.f10904y == null) {
            this.f10904y = m28067h();
        }
        return this.f10904y;
    }

    /* renamed from: h */
    private C5623a m28067h() {
        return new C5636b(this, new C5621c());
    }

    /* renamed from: k */
    private int m28064k(int i) {
        int i2 = this.f10897r;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C6805d.f14562d);
            }
            return resources.getDimensionPixelSize(C6805d.f14561c);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m28064k(1);
        } else {
            return m28064k(0);
        }
    }

    /* renamed from: p */
    private void m28059p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f10901v;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m28058q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f10893n;
            if (colorStateList == null) {
                C2400a.m37840c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f10894o;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C1683j.m40159e(colorForState, mode));
        }
    }

    /* renamed from: r */
    private static int m28057r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    private C5623a.AbstractC5633k m28054u(AbstractC5620b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C5619a(bVar);
    }

    @Override // p283pb.AbstractC11608a
    /* renamed from: a */
    public boolean mo9271a() {
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo27988C(getDrawableState());
    }

    /* renamed from: e */
    public void m28070e(Animator.AnimatorListener animatorListener) {
        getImpl().m28015e(animatorListener);
    }

    /* renamed from: f */
    public void m28069f(Animator.AnimatorListener animatorListener) {
        getImpl().m28013f(animatorListener);
    }

    /* renamed from: g */
    public void m28068g(AbstractC7111k<? extends FloatingActionButton> kVar) {
        getImpl().m28012g(new C5622d(kVar));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f10891l;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f10892m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2151b
    public CoordinatorLayout.AbstractC2152c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo27981m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m28004p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m28002s();
    }

    public Drawable getContentBackground() {
        return getImpl().m28007l();
    }

    public int getCustomSize() {
        return this.f10897r;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C7108h getHideMotionSpec() {
        return getImpl().m28005o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f10895p;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f10895p;
    }

    public C14045k getShapeAppearanceModel() {
        return (C14045k) C2517g.m37588g(getImpl().m28001t());
    }

    public C7108h getShowMotionSpec() {
        return getImpl().m28000u();
    }

    public int getSize() {
        return this.f10896q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m28064k(this.f10896q);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f10893n;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f10894o;
    }

    public boolean getUseCompatPadding() {
        return this.f10900u;
    }

    @Deprecated
    /* renamed from: i */
    public boolean m28066i(Rect rect) {
        if (!C2733w0.m37029U(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m28059p(rect);
        return true;
    }

    /* renamed from: j */
    public void m28065j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m28059p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo27979y();
    }

    /* renamed from: l */
    public void m28063l(AbstractC5620b bVar) {
        m28062m(bVar, true);
    }

    /* renamed from: m */
    void m28062m(AbstractC5620b bVar, boolean z) {
        getImpl().m27999v(m28054u(bVar), z);
    }

    /* renamed from: n */
    public boolean m28061n() {
        return getImpl().m27998w();
    }

    /* renamed from: o */
    public boolean m28060o() {
        return getImpl().m27997x();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m27996z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m28042B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f10898s = (sizeDimension - this.f10899t) / 2;
        getImpl().m28018c0();
        int min = Math.min(m28057r(sizeDimension, i), m28057r(sizeDimension, i2));
        Rect rect = this.f10901v;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C14343a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C14343a aVar = (C14343a) parcelable;
        super.onRestoreInstanceState(aVar.m21547a());
        Bundle bundle = (Bundle) C2517g.m37588g(aVar.f32469m.get("expandableWidgetHelper"));
        throw null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new C14343a(onSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !m28066i(this.f10902w) || this.f10902w.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: s */
    public void m28056s(AbstractC5620b bVar) {
        m28055t(bVar, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f10891l != colorStateList) {
            this.f10891l = colorStateList;
            getImpl().m28037J(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f10892m != mode) {
            this.f10892m = mode;
            getImpl().m28036K(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m28035L(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().m28032O(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().m28029R(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f10897r) {
            this.f10897r = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().m28016d0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().m28006n()) {
            getImpl().m28034M(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C7108h hVar) {
        getImpl().m28033N(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C7108h.m23384c(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m28020b0();
            if (this.f10893n != null) {
                m28058q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f10903x.m40479i(i);
        m28058q();
    }

    public void setMaxImageSize(int i) {
        this.f10899t = i;
        getImpl().m28030Q(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m28039G();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m28039G();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().m28028T(z);
    }

    @Override // p422xb.AbstractC14061n
    public void setShapeAppearanceModel(C14045k kVar) {
        getImpl().m28027U(kVar);
    }

    public void setShowMotionSpec(C7108h hVar) {
        getImpl().m28026V(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C7108h.m23384c(getContext(), i));
    }

    public void setSize(int i) {
        this.f10897r = 0;
        if (i != this.f10896q) {
            this.f10896q = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f10893n != colorStateList) {
            this.f10893n = colorStateList;
            m28058q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f10894o != mode) {
            this.f10894o = mode;
            m28058q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m28038H();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m28038H();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m28038H();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f10900u != z) {
            this.f10900u = z;
            getImpl().mo27989A();
        }
    }

    @Override // com.google.android.material.internal.C5671p, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    void m28055t(AbstractC5620b bVar, boolean z) {
        getImpl().m28023Z(m28054u(bVar), z);
    }

    /* loaded from: classes3.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC2152c<T> {

        /* renamed from: a */
        private Rect f10905a;

        /* renamed from: b */
        private AbstractC5620b f10906b;

        /* renamed from: c */
        private boolean f10907c;

        public BaseBehavior() {
            this.f10907c = true;
        }

        /* renamed from: F */
        private static boolean m28053F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C2155f) {
                return ((CoordinatorLayout.C2155f) layoutParams).m38683f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m28052G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f10901v;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C2155f fVar = (CoordinatorLayout.C2155f) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                    i = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin) {
                    i = -rect.left;
                } else {
                    i = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C2733w0.m37020b0(floatingActionButton, i2);
                }
                if (i != 0) {
                    C2733w0.m37022a0(floatingActionButton, i);
                }
            }
        }

        /* renamed from: J */
        private boolean m28051J(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C2155f fVar = (CoordinatorLayout.C2155f) floatingActionButton.getLayoutParams();
            if (this.f10907c && fVar.m38684e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: K */
        private boolean m28050K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m28051J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f10905a == null) {
                this.f10905a = new Rect();
            }
            Rect rect = this.f10905a;
            C5646c.m27879a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m28062m(this.f10906b, false);
                return true;
            }
            floatingActionButton.m28055t(this.f10906b, false);
            return true;
        }

        /* renamed from: L */
        private boolean m28049L(View view, FloatingActionButton floatingActionButton) {
            if (!m28051J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C2155f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m28062m(this.f10906b, false);
                return true;
            }
            floatingActionButton.m28055t(this.f10906b, false);
            return true;
        }

        /* renamed from: E */
        public boolean mo28048b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f10901v;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean mo27376h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m28050K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m28053F(view)) {
                return false;
            } else {
                m28049L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo27375l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> l = coordinatorLayout.m38715l(floatingActionButton);
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = l.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m28053F(view) && m28049L(view, floatingActionButton)) {
                        break;
                    }
                } else if (m28050K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m38742C(floatingActionButton, i);
            m28052G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
        /* renamed from: g */
        public void mo27352g(CoordinatorLayout.C2155f fVar) {
            if (fVar.f3003h == 0) {
                fVar.f3003h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6812k.f38145O1);
            this.f10907c = obtainStyledAttributes.getBoolean(C6812k.f38153P1, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f10895p != colorStateList) {
            this.f10895p = colorStateList;
            getImpl().mo27985S(this.f10895p);
        }
    }
}
