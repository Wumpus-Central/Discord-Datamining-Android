package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import p071e.C6525a;
import p083eb.C6803b;
import p083eb.C6811j;
import p422xb.AbstractC14061n;
import p422xb.C14042h;
import p422xb.C14045k;

/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, AbstractC14061n {

    /* renamed from: o */
    private static final int[] f10675o = {16842911};

    /* renamed from: p */
    private static final int[] f10676p = {16842912};

    /* renamed from: q */
    private static final int[] f10677q = {C6803b.f37986F};

    /* renamed from: r */
    private static final int f10678r = C6811j.f14665k;

    /* renamed from: k */
    private final C5553a f10679k;

    /* renamed from: l */
    private boolean f10680l;

    /* renamed from: m */
    private boolean f10681m;

    /* renamed from: n */
    private boolean f10682n;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    /* loaded from: classes3.dex */
    public interface AbstractC5552a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14548v);
    }

    /* renamed from: d */
    private void m28485d() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f10679k.m28439i();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f10679k.m28438j().getBounds());
        return rectF;
    }

    /* renamed from: e */
    public boolean m28484e() {
        C5553a aVar = this.f10679k;
        return aVar != null && aVar.m28478D();
    }

    /* renamed from: f */
    public boolean m28483f() {
        return this.f10682n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m28482g(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f10679k.m28437k();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f10679k.m28436l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f10679k.m28435m();
    }

    public int getCheckedIconGravity() {
        return this.f10679k.m28434n();
    }

    public int getCheckedIconMargin() {
        return this.f10679k.m28433o();
    }

    public int getCheckedIconSize() {
        return this.f10679k.m28432p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f10679k.m28431q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f10679k.m28481A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f10679k.m28481A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f10679k.m28481A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f10679k.m28481A().top;
    }

    public float getProgress() {
        return this.f10679k.m28427u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f10679k.m28429s();
    }

    public ColorStateList getRippleColor() {
        return this.f10679k.m28426v();
    }

    public C14045k getShapeAppearanceModel() {
        return this.f10679k.m28425w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f10679k.m28424x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f10679k.m28423y();
    }

    public int getStrokeWidth() {
        return this.f10679k.m28422z();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10681m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14042h.m1938f(this, this.f10679k.m28438j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (m28484e()) {
            View.mergeDrawableStates(onCreateDrawableState, f10675o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f10676p);
        }
        if (m28483f()) {
            View.mergeDrawableStates(onCreateDrawableState, f10677q);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m28484e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f10679k.m28474H(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f10680l) {
            if (!this.f10679k.m28479C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f10679k.m28473I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f10679k.m28472J(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f10679k.m28448d0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f10679k.m28471K(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f10679k.m28470L(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f10681m != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f10679k.m28468N(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.f10679k.m28434n() != i) {
            this.f10679k.m28467O(i);
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f10679k.m28466P(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f10679k.m28466P(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.f10679k.m28468N(C6525a.m25364b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f10679k.m28465Q(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f10679k.m28465Q(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f10679k.m28464R(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C5553a aVar = this.f10679k;
        if (aVar != null) {
            aVar.m28452b0();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f10679k.m28457Y(i, i2, i3, i4);
    }

    public void setDragged(boolean z) {
        if (this.f10682n != z) {
            this.f10682n = z;
            refreshDrawableState();
            m28485d();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f10679k.m28444f0();
    }

    public void setOnCheckedChangeListener(AbstractC5552a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f10679k.m28444f0();
        this.f10679k.m28450c0();
    }

    public void setProgress(float f) {
        this.f10679k.m28462T(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.f10679k.m28463S(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f10679k.m28461U(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f10679k.m28461U(C6525a.m25365a(getContext(), i));
    }

    @Override // p422xb.AbstractC14061n
    public void setShapeAppearanceModel(C14045k kVar) {
        setClipToOutline(kVar.m1915u(getBoundsAsRectF()));
        this.f10679k.m28460V(kVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.f10679k.m28458X(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f10679k.m28444f0();
        this.f10679k.m28450c0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m28484e() && isEnabled()) {
            this.f10681m = !this.f10681m;
            refreshDrawableState();
            m28485d();
            this.f10679k.m28469M(this.f10681m);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.f10678r
            android.content.Context r8 = p462zb.C14615a.m126c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f10681m = r8
            r7.f10682n = r8
            r0 = 1
            r7.f10680l = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = p083eb.C6812k.f14785n3
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.C5662m.m27838h(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.f10679k = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.m28472J(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.m28457Y(r9, r10, r1, r2)
            r0.m28475G(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f10679k.m28472J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f10679k.m28459W(colorStateList);
        invalidate();
    }
}
