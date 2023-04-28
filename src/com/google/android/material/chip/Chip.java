package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C1663f;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.material.chip.C5564a;
import com.google.android.material.internal.AbstractC5651h;
import com.google.android.material.internal.C5662m;
import com.google.android.material.internal.C5665o;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.List;
import p083eb.C6803b;
import p083eb.C6810i;
import p083eb.C6811j;
import p083eb.C6812k;
import p102fb.C7108h;
import p366ub.AbstractC13247f;
import p366ub.C13243d;
import p385vb.C13488b;
import p422xb.AbstractC14061n;
import p422xb.C14042h;
import p422xb.C14045k;

/* loaded from: classes3.dex */
public class Chip extends C1663f implements C5564a.AbstractC0154a, AbstractC14061n, AbstractC5651h<Chip> {

    /* renamed from: H */
    private static final int f37432H = C6811j.f14667m;

    /* renamed from: I */
    private static final Rect f37433I = new Rect();

    /* renamed from: J */
    private static final int[] f37434J = {16842913};

    /* renamed from: K */
    private static final int[] f37435K = {16842911};

    /* renamed from: A */
    private int f37436A;

    /* renamed from: B */
    private CharSequence f37437B;

    /* renamed from: C */
    private final C5557d f37438C;

    /* renamed from: D */
    private boolean f37439D;

    /* renamed from: E */
    private final Rect f37440E;

    /* renamed from: F */
    private final RectF f37441F;

    /* renamed from: G */
    private final AbstractC13247f f37442G;

    /* renamed from: o */
    private C5564a f10706o;

    /* renamed from: p */
    private InsetDrawable f10707p;

    /* renamed from: q */
    private RippleDrawable f10708q;

    /* renamed from: r */
    private View.OnClickListener f10709r;

    /* renamed from: s */
    private CompoundButton.OnCheckedChangeListener f10710s;

    /* renamed from: t */
    private AbstractC5651h.AbstractC5652a<Chip> f10711t;

    /* renamed from: u */
    private boolean f10712u;

    /* renamed from: v */
    private boolean f10713v;

    /* renamed from: w */
    private boolean f10714w;

    /* renamed from: x */
    private boolean f10715x;

    /* renamed from: y */
    private boolean f10716y;

    /* renamed from: z */
    private int f10717z;

    /* renamed from: com.google.android.material.chip.Chip$a */
    /* loaded from: classes3.dex */
    class C5554a extends AbstractC13247f {
        C5554a() {
        }

        @Override // p366ub.AbstractC13247f
        /* renamed from: a */
        public void mo4214a(int i) {
        }

        @Override // p366ub.AbstractC13247f
        /* renamed from: b */
        public void mo4213b(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            if (chip.f10706o.m28348M2()) {
                charSequence = Chip.this.f10706o.m28299i1();
            } else {
                charSequence = Chip.this.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    /* loaded from: classes3.dex */
    class C5555b implements CompoundButton.OnCheckedChangeListener {
        C5555b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (Chip.this.f10711t != null) {
                Chip.this.f10711t.mo27867a(Chip.this, z);
            }
            if (Chip.this.f10710s != null) {
                Chip.this.f10710s.onCheckedChanged(compoundButton, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.chip.Chip$c */
    /* loaded from: classes3.dex */
    public class C5556c extends ViewOutlineProvider {
        C5556c() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f10706o != null) {
                Chip.this.f10706o.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.Chip$d */
    /* loaded from: classes3.dex */
    public class C5557d extends ExploreByTouchHelper {
        C5557d(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected int getVirtualViewAt(float f, float f2) {
            return (!Chip.this.m28404o() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void getVisibleVirtualViews(List<Integer> list) {
            list.add(0);
            if (Chip.this.m28404o() && Chip.this.m28399t() && Chip.this.f10709r != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.m28398u();
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.m37392Y(Chip.this.m28400s());
            accessibilityNodeInfoCompat.m37387b0(Chip.this.isClickable());
            accessibilityNodeInfoCompat.m37389a0(Chip.this.getAccessibilityClassName());
            accessibilityNodeInfoCompat.m37418D0(Chip.this.getText());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    accessibilityNodeInfoCompat.m37381e0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C6810i.f14646h;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    accessibilityNodeInfoCompat.m37381e0(context.getString(i2, objArr).trim());
                }
                accessibilityNodeInfoCompat.m37394W(Chip.this.getCloseIconTouchBoundsInt());
                accessibilityNodeInfoCompat.m37388b(AccessibilityNodeInfoCompat.C2556a.f3561i);
                accessibilityNodeInfoCompat.m37379f0(Chip.this.isEnabled());
                return;
            }
            accessibilityNodeInfoCompat.m37381e0(charSequence);
            accessibilityNodeInfoCompat.m37394W(Chip.f37433I);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
            if (i == 1) {
                Chip.this.f10715x = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14532f);
    }

    /* renamed from: A */
    private void m28421A() {
        this.f10708q = new RippleDrawable(C13488b.m3601a(this.f10706o.m28303g1()), getBackgroundDrawable(), null);
        this.f10706o.m28351L2(false);
        C2733w0.m36982u0(this, this.f10708q);
        m28420B();
    }

    /* renamed from: B */
    private void m28420B() {
        C5564a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f10706o) != null) {
            int K0 = (int) (aVar.m28356K0() + this.f10706o.m28295k1() + this.f10706o.m28275r0());
            int P0 = (int) (this.f10706o.m28341P0() + this.f10706o.m28292l1() + this.f10706o.m28287n0());
            if (this.f10707p != null) {
                Rect rect = new Rect();
                this.f10707p.getPadding(rect);
                P0 += rect.left;
                K0 += rect.right;
            }
            C2733w0.m37054F0(this, P0, getPaddingTop(), K0, getPaddingBottom());
        }
    }

    /* renamed from: C */
    private void m28419C() {
        TextPaint paint = getPaint();
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C13243d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m4220n(getContext(), paint, this.f37442G);
        }
    }

    /* renamed from: D */
    private void m28418D(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f37441F.setEmpty();
        if (m28404o() && this.f10709r != null) {
            this.f10706o.m28317Z0(this.f37441F);
        }
        return this.f37441F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f37440E.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f37440E;
    }

    private C13243d getTextAppearance() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28297j1();
        }
        return null;
    }

    /* renamed from: k */
    private void m28408k(C5564a aVar) {
        aVar.m28276q2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] m28407l() {
        /*
            r3 = this;
            boolean r0 = r3.isEnabled()
            boolean r1 = r3.f10715x
            if (r1 == 0) goto L_0x000a
            int r0 = r0 + 1
        L_0x000a:
            boolean r1 = r3.f10714w
            if (r1 == 0) goto L_0x0010
            int r0 = r0 + 1
        L_0x0010:
            boolean r1 = r3.f10713v
            if (r1 == 0) goto L_0x0016
            int r0 = r0 + 1
        L_0x0016:
            boolean r1 = r3.isChecked()
            if (r1 == 0) goto L_0x001e
            int r0 = r0 + 1
        L_0x001e:
            int[] r0 = new int[r0]
            boolean r1 = r3.isEnabled()
            r2 = 0
            if (r1 == 0) goto L_0x002d
            r1 = 16842910(0x101009e, float:2.3694E-38)
            r0[r2] = r1
            r2 = 1
        L_0x002d:
            boolean r1 = r3.f10715x
            if (r1 == 0) goto L_0x0038
            r1 = 16842908(0x101009c, float:2.3693995E-38)
            r0[r2] = r1
            int r2 = r2 + 1
        L_0x0038:
            boolean r1 = r3.f10714w
            if (r1 == 0) goto L_0x0043
            r1 = 16843623(0x1010367, float:2.3696E-38)
            r0[r2] = r1
            int r2 = r2 + 1
        L_0x0043:
            boolean r1 = r3.f10713v
            if (r1 == 0) goto L_0x004e
            r1 = 16842919(0x10100a7, float:2.3694026E-38)
            r0[r2] = r1
            int r2 = r2 + 1
        L_0x004e:
            boolean r1 = r3.isChecked()
            if (r1 == 0) goto L_0x0059
            r1 = 16842913(0x10100a1, float:2.369401E-38)
            r0[r2] = r1
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.m28407l():int[]");
    }

    /* renamed from: n */
    private void m28405n() {
        if (getBackgroundDrawable() == this.f10707p && this.f10706o.getCallback() == null) {
            this.f10706o.setCallback(this.f10707p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public boolean m28404o() {
        C5564a aVar = this.f10706o;
        return (aVar == null || aVar.m28332S0() == null) ? false : true;
    }

    /* renamed from: p */
    private void m28403p(Context context, AttributeSet attributeSet, int i) {
        TypedArray h = C5662m.m27838h(context, attributeSet, C6812k.f14790o0, i, f37432H, new int[0]);
        this.f10716y = h.getBoolean(C6812k.f38192U0, false);
        this.f37436A = (int) Math.ceil(h.getDimension(C6812k.f38096I0, (float) Math.ceil(C5665o.m27829b(getContext(), 48))));
        h.recycle();
    }

    /* renamed from: q */
    private void m28402q() {
        setOutlineProvider(new C5556c());
    }

    /* renamed from: r */
    private void m28401r(int i, int i2, int i3, int i4) {
        this.f10707p = new InsetDrawable((Drawable) this.f10706o, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f10714w != z) {
            this.f10714w = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f10713v != z) {
            this.f10713v = z;
            refreshDrawableState();
        }
    }

    /* renamed from: v */
    private void m28397v() {
        if (this.f10707p != null) {
            this.f10707p = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m28393z();
        }
    }

    /* renamed from: x */
    private void m28395x(C5564a aVar) {
        if (aVar != null) {
            aVar.m28276q2(null);
        }
    }

    /* renamed from: y */
    private void m28394y() {
        if (!m28404o() || !m28399t() || this.f10709r == null) {
            C2733w0.m36990q0(this, null);
            this.f37439D = false;
            return;
        }
        C2733w0.m36990q0(this, this.f37438C);
        this.f37439D = true;
    }

    /* renamed from: z */
    private void m28393z() {
        if (C13488b.f30123a) {
            m28421A();
            return;
        }
        this.f10706o.m28351L2(true);
        C2733w0.m36982u0(this, getBackgroundDrawable());
        m28420B();
        m28405n();
    }

    @Override // com.google.android.material.chip.C5564a.AbstractC0154a
    /* renamed from: a */
    public void mo28248a() {
        m28406m(this.f37436A);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f37439D) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (this.f37438C.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f37439D) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f37438C.dispatchKeyEvent(keyEvent) || this.f37438C.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C1663f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        C5564a aVar = this.f10706o;
        if (aVar == null || !aVar.m28277q1()) {
            z = false;
        } else {
            z = this.f10706o.m28288m2(m28407l());
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f37437B)) {
            return this.f37437B;
        }
        if (m28400s()) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup) || !((ChipGroup) parent).m28389h()) {
                return "android.widget.CompoundButton";
            }
            return "android.widget.RadioButton";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f10707p;
        if (insetDrawable == null) {
            return this.f10706o;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28368G0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28365H0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28362I0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return Math.max(0.0f, aVar.m28359J0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f10706o;
    }

    public float getChipEndPadding() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28356K0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28353L0();
        }
        return null;
    }

    public float getChipIconSize() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28350M0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28347N0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28344O0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28341P0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28338Q0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28335R0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28332S0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28329T0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28327U0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28325V0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28323W0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28319Y0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28311c1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (!this.f37439D || !(this.f37438C.getKeyboardFocusedVirtualViewId() == 1 || this.f37438C.getAccessibilityFocusedVirtualViewId() == 1)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public C7108h getHideMotionSpec() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28309d1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28307e1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28305f1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28303g1();
        }
        return null;
    }

    public C14045k getShapeAppearanceModel() {
        return this.f10706o.m2001E();
    }

    public C7108h getShowMotionSpec() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28301h1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28295k1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            return aVar.m28292l1();
        }
        return 0.0f;
    }

    /* renamed from: m */
    public boolean m28406m(int i) {
        int i2;
        this.f37436A = i;
        int i3 = 0;
        if (!m28396w()) {
            if (this.f10707p != null) {
                m28397v();
            } else {
                m28393z();
            }
            return false;
        }
        int max = Math.max(0, i - this.f10706o.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f10706o.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            if (max2 > 0) {
                i2 = max2 / 2;
            } else {
                i2 = 0;
            }
            if (max > 0) {
                i3 = max / 2;
            }
            if (this.f10707p != null) {
                Rect rect = new Rect();
                this.f10707p.getPadding(rect);
                if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                    m28393z();
                    return true;
                }
            }
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
            m28401r(i2, i3, i2, i3);
            m28393z();
            return true;
        }
        if (this.f10707p != null) {
            m28397v();
        } else {
            m28393z();
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14042h.m1938f(this, this.f10706o);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f37434J);
        }
        if (m28400s()) {
            View.mergeDrawableStates(onCreateDrawableState, f37435K);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f37439D) {
            this.f37438C.onFocusChanged(z, i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m28400s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat I0 = AccessibilityNodeInfoCompat.m37408I0(accessibilityNodeInfo);
            if (chipGroup.mo27870c()) {
                i = chipGroup.m28390g(this);
            } else {
                i = -1;
            }
            I0.m37383d0(AccessibilityNodeInfoCompat.C2558c.m37331b(chipGroup.m27871b(this), 1, i, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon systemIcon;
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        systemIcon = PointerIcon.getSystemIcon(getContext(), RNCWebViewManager.COMMAND_CLEAR_HISTORY);
        return systemIcon;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f10717z != i) {
            this.f10717z = i;
            m28420B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f10713v
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r3)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f10713v
            if (r0 == 0) goto L_0x0034
            r5.m28398u()
            r0 = r2
            goto L_0x0035
        L_0x0034:
            r0 = r3
        L_0x0035:
            r5.setCloseIconPressed(r3)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r2)
        L_0x003e:
            r0 = r2
            goto L_0x0041
        L_0x0040:
            r0 = r3
        L_0x0041:
            if (r0 != 0) goto L_0x004b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r2 = r3
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: s */
    public boolean m28400s() {
        C5564a aVar = this.f10706o;
        return aVar != null && aVar.m28280p1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f37437B = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10708q) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C1663f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10708q) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C1663f, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28253y1(z);
        }
    }

    public void setCheckableResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28250z1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C5564a aVar = this.f10706o;
        if (aVar == null) {
            this.f10712u = z;
        } else if (aVar.m28280p1()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28385A1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28382B1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28379C1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28376D1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28373E1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28367G1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28364H1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28361I1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28358J1(i);
        }
    }

    public void setChipDrawable(C5564a aVar) {
        C5564a aVar2 = this.f10706o;
        if (aVar2 != aVar) {
            m28395x(aVar2);
            this.f10706o = aVar;
            aVar.m28381B2(false);
            m28408k(this.f10706o);
            m28406m(this.f37436A);
        }
    }

    public void setChipEndPadding(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28355K1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28352L1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28349M1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28346N1(i);
        }
    }

    public void setChipIconSize(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28343O1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28340P1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28337Q1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28334R1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28331S1(i);
        }
    }

    public void setChipMinHeight(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28326U1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28324V1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28322W1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28320X1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28318Y1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28316Z1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28314a2(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28312b2(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28308d2(drawable);
        }
        m28394y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28306e2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28304f2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28302g2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28300h2(i);
        }
        m28394y();
    }

    public void setCloseIconSize(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28298i2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28296j2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28294k2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28291l2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28285n2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28282o2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m1982X(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f10706o != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C5564a aVar = this.f10706o;
                if (aVar != null) {
                    aVar.m28273r2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f10716y = z;
        m28406m(this.f37436A);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C7108h hVar) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28270s2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28267t2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28264u2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28261v2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28258w2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28255x2(i);
        }
    }

    @Override // com.google.android.material.internal.AbstractC5651h
    public void setInternalOnCheckedChangeListener(AbstractC5651h.AbstractC5652a<Chip> aVar) {
        this.f10711t = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f10706o != null) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28252y2(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10710s = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f10709r = onClickListener;
        m28394y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28249z2(colorStateList);
        }
        if (!this.f10706o.m28286n1()) {
            m28421A();
        }
    }

    public void setRippleColorResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28384A2(i);
            if (!this.f10706o.m28286n1()) {
                m28421A();
            }
        }
    }

    @Override // p422xb.AbstractC14061n
    public void setShapeAppearanceModel(C14045k kVar) {
        this.f10706o.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C7108h hVar) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28378C2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28375D2(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (aVar.m28348M2()) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            C5564a aVar2 = this.f10706o;
            if (aVar2 != null) {
                aVar2.m28372E2(charSequence);
            }
        }
    }

    public void setTextAppearance(C13243d dVar) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28369F2(dVar);
        }
        m28419C();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28363H2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28360I2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28357J2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28354K2(i);
        }
    }

    /* renamed from: t */
    public boolean m28399t() {
        C5564a aVar = this.f10706o;
        return aVar != null && aVar.m28274r1();
    }

    /* renamed from: u */
    public boolean m28398u() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f10709r;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f37439D) {
            this.f37438C.sendEventForVirtualView(1, 1);
        }
        return z;
    }

    /* renamed from: w */
    public boolean m28396w() {
        return this.f10716y;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.chip.Chip.f37432H
            android.content.Context r7 = p462zb.C14615a.m126c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f37440E = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f37441F = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f37442G = r7
            android.content.Context r0 = r6.getContext()
            r6.m28418D(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.C5564a.m28260w0(r0, r8, r9, r4)
            r6.m28403p(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.C2733w0.m36979w(r6)
            r7.m1982X(r1)
            int[] r2 = p083eb.C6812k.f14790o0
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C5662m.m27838h(r0, r1, r2, r3, r4, r5)
            int r9 = p083eb.C6812k.f38229Z0
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$d r8 = new com.google.android.material.chip.Chip$d
            r8.<init>(r6)
            r6.f37438C = r8
            r6.m28394y()
            if (r9 != 0) goto L_0x0059
            r6.m28402q()
        L_0x0059:
            boolean r8 = r6.f10712u
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.m28299i1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.m28311c1()
            r6.setEllipsize(r7)
            r6.m28419C()
            com.google.android.material.chip.a r7 = r6.f10706o
            boolean r7 = r7.m28348M2()
            if (r7 != 0) goto L_0x007e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L_0x007e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.m28420B()
            boolean r7 = r6.m28396w()
            if (r7 == 0) goto L_0x0092
            int r7 = r6.f37436A
            r6.setMinHeight(r7)
        L_0x0092:
            int r7 = androidx.core.view.C2733w0.m37063B(r6)
            r6.f10717z = r7
            com.google.android.material.chip.Chip$b r7 = new com.google.android.material.chip.Chip$b
            r7.<init>()
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28279p2(z);
        }
        m28394y();
    }

    public void setCheckedIconVisible(boolean z) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28370F1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28328T1(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28366G2(i);
        }
        m28419C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C5564a aVar = this.f10706o;
        if (aVar != null) {
            aVar.m28366G2(i);
        }
        m28419C();
    }
}
