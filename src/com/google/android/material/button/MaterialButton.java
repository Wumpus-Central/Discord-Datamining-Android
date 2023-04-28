package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C1660e;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.C2733w0;
import androidx.core.widget.C2803l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p071e.C6525a;
import p083eb.C6803b;
import p083eb.C6811j;
import p125h1.AbstractC7736a;
import p422xb.AbstractC14061n;
import p422xb.C14042h;
import p422xb.C14045k;

/* loaded from: classes3.dex */
public class MaterialButton extends C1660e implements Checkable, AbstractC14061n {

    /* renamed from: A */
    private static final int[] f37429A = {16842911};

    /* renamed from: B */
    private static final int[] f37430B = {16842912};

    /* renamed from: C */
    private static final int f37431C = C6811j.f14664j;

    /* renamed from: n */
    private final C5551a f10620n;

    /* renamed from: o */
    private final LinkedHashSet<AbstractC5542a> f10621o;

    /* renamed from: p */
    private AbstractC5543b f10622p;

    /* renamed from: q */
    private PorterDuff.Mode f10623q;

    /* renamed from: r */
    private ColorStateList f10624r;

    /* renamed from: s */
    private Drawable f10625s;

    /* renamed from: t */
    private int f10626t;

    /* renamed from: u */
    private int f10627u;

    /* renamed from: v */
    private int f10628v;

    /* renamed from: w */
    private int f10629w;

    /* renamed from: x */
    private boolean f10630x;

    /* renamed from: y */
    private boolean f10631y;

    /* renamed from: z */
    private int f10632z;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    /* loaded from: classes3.dex */
    public interface AbstractC5542a {
        /* renamed from: a */
        void m28553a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    /* loaded from: classes3.dex */
    interface AbstractC5543b {
        /* renamed from: a */
        void mo28522a(MaterialButton materialButton, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.button.MaterialButton$c */
    /* loaded from: classes3.dex */
    public static class C5544c extends AbstractC7736a {
        public static final Parcelable.Creator<C5544c> CREATOR = new C5545a();

        /* renamed from: m */
        boolean f10633m;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        /* loaded from: classes3.dex */
        class C5545a implements Parcelable.ClassLoaderCreator<C5544c> {
            C5545a() {
            }

            /* renamed from: a */
            public C5544c createFromParcel(Parcel parcel) {
                return new C5544c(parcel, null);
            }

            /* renamed from: b */
            public C5544c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5544c(parcel, classLoader);
            }

            /* renamed from: c */
            public C5544c[] newArray(int i) {
                return new C5544c[i];
            }
        }

        public C5544c(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m28552b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f10633m = z;
        }

        @Override // p125h1.AbstractC7736a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10633m ? 1 : 0);
        }

        public C5544c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m28552b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14545s);
    }

    /* renamed from: b */
    private boolean m28561b() {
        int i = this.f10632z;
        return i == 3 || i == 4;
    }

    /* renamed from: c */
    private boolean m28560c() {
        int i = this.f10632z;
        return i == 1 || i == 2;
    }

    /* renamed from: d */
    private boolean m28559d() {
        int i = this.f10632z;
        return i == 16 || i == 32;
    }

    /* renamed from: e */
    private boolean m28558e() {
        return C2733w0.m37063B(this) == 1;
    }

    /* renamed from: f */
    private boolean m28557f() {
        C5551a aVar = this.f10620n;
        return aVar != null && !aVar.m28498o();
    }

    /* renamed from: g */
    private void m28556g() {
        if (m28560c()) {
            C2803l.m36679i(this, this.f10625s, null, null, null);
        } else if (m28561b()) {
            C2803l.m36679i(this, null, null, this.f10625s, null);
        } else if (m28559d()) {
            C2803l.m36679i(this, null, this.f10625s, null, null);
        }
    }

    private String getA11yClassName() {
        return (m28562a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: h */
    private void m28555h(boolean z) {
        Drawable drawable = this.f10625s;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = C2400a.m37825r(drawable).mutate();
            this.f10625s = mutate;
            C2400a.m37828o(mutate, this.f10624r);
            PorterDuff.Mode mode = this.f10623q;
            if (mode != null) {
                C2400a.m37827p(this.f10625s, mode);
            }
            int i = this.f10626t;
            if (i == 0) {
                i = this.f10625s.getIntrinsicWidth();
            }
            int i2 = this.f10626t;
            if (i2 == 0) {
                i2 = this.f10625s.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f10625s;
            int i3 = this.f10627u;
            int i4 = this.f10628v;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f10625s.setVisible(true, z);
        }
        if (z) {
            m28556g();
            return;
        }
        Drawable[] a = C2803l.m36687a(this);
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[1];
        Drawable drawable5 = a[2];
        if ((!m28560c() || drawable3 == this.f10625s) && ((!m28561b() || drawable5 == this.f10625s) && (!m28559d() || drawable4 == this.f10625s))) {
            z2 = false;
        }
        if (z2) {
            m28556g();
        }
    }

    /* renamed from: i */
    private void m28554i(int i, int i2) {
        if (this.f10625s != null && getLayout() != null) {
            if (m28560c() || m28561b()) {
                this.f10628v = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i3 = this.f10632z;
                boolean z = true;
                if (i3 == 1 || i3 == 3 || ((i3 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i3 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f10627u = 0;
                    m28555h(false);
                    return;
                }
                int i4 = this.f10626t;
                if (i4 == 0) {
                    i4 = this.f10625s.getIntrinsicWidth();
                }
                int textWidth = ((((i - getTextWidth()) - C2733w0.m37055F(this)) - i4) - this.f10629w) - C2733w0.m37053G(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textWidth /= 2;
                }
                boolean e = m28558e();
                if (this.f10632z != 4) {
                    z = false;
                }
                if (e != z) {
                    textWidth = -textWidth;
                }
                if (this.f10627u != textWidth) {
                    this.f10627u = textWidth;
                    m28555h(false);
                }
            } else if (m28559d()) {
                this.f10627u = 0;
                if (this.f10632z == 16) {
                    this.f10628v = 0;
                    m28555h(false);
                    return;
                }
                int i5 = this.f10626t;
                if (i5 == 0) {
                    i5 = this.f10625s.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.f10629w) - getPaddingBottom()) / 2;
                if (this.f10628v != textHeight) {
                    this.f10628v = textHeight;
                    m28555h(false);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m28562a() {
        C5551a aVar = this.f10620n;
        return aVar != null && aVar.m28497p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m28557f()) {
            return this.f10620n.m28511b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f10625s;
    }

    public int getIconGravity() {
        return this.f10632z;
    }

    public int getIconPadding() {
        return this.f10629w;
    }

    public int getIconSize() {
        return this.f10626t;
    }

    public ColorStateList getIconTint() {
        return this.f10624r;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10623q;
    }

    public int getInsetBottom() {
        return this.f10620n.m28510c();
    }

    public int getInsetTop() {
        return this.f10620n.m28509d();
    }

    public ColorStateList getRippleColor() {
        if (m28557f()) {
            return this.f10620n.m28505h();
        }
        return null;
    }

    public C14045k getShapeAppearanceModel() {
        if (m28557f()) {
            return this.f10620n.m28504i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m28557f()) {
            return this.f10620n.m28503j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m28557f()) {
            return this.f10620n.m28502k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C1660e
    public ColorStateList getSupportBackgroundTintList() {
        if (m28557f()) {
            return this.f10620n.m28501l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C1660e
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m28557f()) {
            return this.f10620n.m28500m();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10630x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m28557f()) {
            C14042h.m1938f(this, this.f10620n.m28507f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m28562a()) {
            View.mergeDrawableStates(onCreateDrawableState, f37429A);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f37430B);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C1660e, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C1660e, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m28562a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C1660e, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m28554i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5544c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5544c cVar = (C5544c) parcelable;
        super.onRestoreInstanceState(cVar.m21547a());
        setChecked(cVar.f10633m);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        C5544c cVar = new C5544c(super.onSaveInstanceState());
        cVar.f10633m = this.f10630x;
        return cVar;
    }

    @Override // androidx.appcompat.widget.C1660e, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m28554i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f10625s != null) {
            if (this.f10625s.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m28557f()) {
            this.f10620n.m28495r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.C1660e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m28557f()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f10620n.m28494s();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    @Override // androidx.appcompat.widget.C1660e, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C6525a.m25364b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m28557f()) {
            this.f10620n.m28493t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m28562a() && isEnabled() && this.f10630x != z) {
            this.f10630x = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m28536m(this, this.f10630x);
            }
            if (!this.f10631y) {
                this.f10631y = true;
                Iterator<AbstractC5542a> it = this.f10621o.iterator();
                while (it.hasNext()) {
                    it.next().m28553a(this, this.f10630x);
                }
                this.f10631y = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (m28557f()) {
            this.f10620n.m28492u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m28557f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m28557f()) {
            this.f10620n.m28507f().m1982X(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f10625s != drawable) {
            this.f10625s = drawable;
            m28555h(true);
            m28554i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f10632z != i) {
            this.f10632z = i;
            m28554i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f10629w != i) {
            this.f10629w = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C6525a.m25364b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f10626t != i) {
            this.f10626t = i;
            m28555h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f10624r != colorStateList) {
            this.f10624r = colorStateList;
            m28555h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f10623q != mode) {
            this.f10623q = mode;
            m28555h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C6525a.m25365a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f10620n.m28491v(i);
    }

    public void setInsetTop(int i) {
        this.f10620n.m28490w(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(AbstractC5543b bVar) {
        this.f10622p = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        AbstractC5543b bVar = this.f10622p;
        if (bVar != null) {
            bVar.mo28522a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m28557f()) {
            this.f10620n.m28489x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m28557f()) {
            setRippleColor(C6525a.m25365a(getContext(), i));
        }
    }

    @Override // p422xb.AbstractC14061n
    public void setShapeAppearanceModel(C14045k kVar) {
        if (m28557f()) {
            this.f10620n.m28488y(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m28557f()) {
            this.f10620n.m28487z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m28557f()) {
            this.f10620n.m28521A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m28557f()) {
            setStrokeColor(C6525a.m25365a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m28557f()) {
            this.f10620n.m28520B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m28557f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.C1660e
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m28557f()) {
            this.f10620n.m28519C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C1660e
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m28557f()) {
            this.f10620n.m28518D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m28554i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f10630x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f37431C
            android.content.Context r9 = p462zb.C14615a.m126c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f10621o = r9
            r9 = 0
            r8.f10630x = r9
            r8.f10631y = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p083eb.C6812k.f14848v2
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C5662m.m27838h(r0, r1, r2, r3, r4, r5)
            int r1 = p083eb.C6812k.f38098I2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f10629w = r1
            int r1 = p083eb.C6812k.f38122L2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C5665o.m27825f(r1, r2)
            r8.f10623q = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p083eb.C6812k.f38114K2
            android.content.res.ColorStateList r1 = p366ub.C13242c.m4241a(r1, r0, r2)
            r8.f10624r = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p083eb.C6812k.f38082G2
            android.graphics.drawable.Drawable r1 = p366ub.C13242c.m4238d(r1, r0, r2)
            r8.f10625s = r1
            int r1 = p083eb.C6812k.f38090H2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f10632z = r1
            int r1 = p083eb.C6812k.f38106J2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f10626t = r1
            xb.k$b r10 = p422xb.C14045k.m1931e(r7, r10, r11, r6)
            xb.k r10 = r10.m1892m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f10620n = r11
            r11.m28496q(r0)
            r0.recycle()
            int r10 = r8.f10629w
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f10625s
            if (r10 == 0) goto L_0x0084
            r9 = r2
        L_0x0084:
            r8.m28555h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
