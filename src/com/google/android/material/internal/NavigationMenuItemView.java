package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.AbstractC1586k;
import androidx.appcompat.view.menu.C1579g;
import androidx.appcompat.widget.C1715r1;
import androidx.appcompat.widget.C1733v0;
import androidx.core.content.res.C2367h;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.C2549a;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.C2803l;
import androidx.recyclerview.widget.RecyclerView;
import p052d.C6379a;
import p083eb.C6805d;
import p083eb.C6806e;
import p083eb.C6807f;
import p083eb.C6809h;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends C5649f implements AbstractC1586k.AbstractC1587a {

    /* renamed from: P */
    private static final int[] f37515P = {16842912};

    /* renamed from: F */
    private int f37516F;

    /* renamed from: G */
    private boolean f37517G;

    /* renamed from: H */
    boolean f37518H;

    /* renamed from: I */
    private final CheckedTextView f37519I;

    /* renamed from: J */
    private FrameLayout f37520J;

    /* renamed from: K */
    private C1579g f37521K;

    /* renamed from: L */
    private ColorStateList f37522L;

    /* renamed from: M */
    private boolean f37523M;

    /* renamed from: N */
    private Drawable f37524N;

    /* renamed from: O */
    private final C2549a f37525O;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes3.dex */
    class C5641a extends C2549a {
        C5641a() {
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m37392Y(NavigationMenuItemView.this.f37518H);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    private StateListDrawable m27968A() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C6379a.f13117w, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f37515P, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: B */
    private boolean m27967B() {
        if (this.f37521K.getTitle() == null && this.f37521K.getIcon() == null && this.f37521K.getActionView() != null) {
            return true;
        }
        return false;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f37520J == null) {
                this.f37520J = (FrameLayout) ((ViewStub) findViewById(C6807f.f14595d)).inflate();
            }
            this.f37520J.removeAllViews();
            this.f37520J.addView(view);
        }
    }

    /* renamed from: z */
    private void m27964z() {
        if (m27967B()) {
            this.f37519I.setVisibility(8);
            FrameLayout frameLayout = this.f37520J;
            if (frameLayout != null) {
                C1733v0.C1734a aVar = (C1733v0.C1734a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f37520J.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f37519I.setVisibility(0);
        FrameLayout frameLayout2 = this.f37520J;
        if (frameLayout2 != null) {
            C1733v0.C1734a aVar2 = (C1733v0.C1734a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f37520J.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1586k.AbstractC1587a
    /* renamed from: c */
    public void mo27966c(C1579g gVar, int i) {
        int i2;
        this.f37521K = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        if (gVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            C2733w0.m36982u0(this, m27968A());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        C1715r1.m40049a(this, gVar.getTooltipText());
        m27964z();
    }

    @Override // androidx.appcompat.view.menu.AbstractC1586k.AbstractC1587a
    /* renamed from: d */
    public boolean mo27965d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1586k.AbstractC1587a
    public C1579g getItemData() {
        return this.f37521K;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1579g gVar = this.f37521K;
        if (gVar != null && gVar.isCheckable() && this.f37521K.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f37515P);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f37518H != z) {
            this.f37518H = z;
            this.f37525O.sendAccessibilityEvent(this.f37519I, RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f37519I.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f37523M) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C2400a.m37825r(drawable).mutate();
                C2400a.m37828o(drawable, this.f37522L);
            }
            int i = this.f37516F;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f37517G) {
            if (this.f37524N == null) {
                Drawable f = C2367h.m37984f(getResources(), C6806e.f14591g, getContext().getTheme());
                this.f37524N = f;
                if (f != null) {
                    int i2 = this.f37516F;
                    f.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f37524N;
        }
        C2803l.m36679i(this.f37519I, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f37519I.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f37516F = i;
    }

    void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f37522L = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.f37523M = z;
        C1579g gVar = this.f37521K;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f37519I.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f37517G = z;
    }

    public void setTextAppearance(int i) {
        C2803l.m36674n(this.f37519I, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f37519I.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f37519I.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C5641a aVar = new C5641a();
        this.f37525O = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C6809h.f14621a, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C6805d.f14563e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C6807f.f14596e);
        this.f37519I = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C2733w0.m36990q0(checkedTextView, aVar);
    }
}
