package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.C2733w0;
import com.google.android.material.internal.C5663n;
import p083eb.C6803b;
import p083eb.C6811j;
import p422xb.C14038g;
import p422xb.C14042h;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: j0 */
    private static final int f10469j0 = C6811j.f14676v;

    /* renamed from: k0 */
    private static final ImageView.ScaleType[] f10470k0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: e0 */
    private Integer f10471e0;

    /* renamed from: f0 */
    private boolean f10472f0;

    /* renamed from: g0 */
    private boolean f10473g0;

    /* renamed from: h0 */
    private ImageView.ScaleType f10474h0;

    /* renamed from: i0 */
    private Boolean f10475i0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f37992L);
    }

    /* renamed from: R */
    private Pair<Integer, Integer> m28768R(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: S */
    private void m28767S(Context context) {
        int i;
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C14038g gVar = new C14038g();
            if (background != null) {
                i = ((ColorDrawable) background).getColor();
            } else {
                i = 0;
            }
            gVar.m1981Y(ColorStateList.valueOf(i));
            gVar.m1991O(context);
            gVar.m1982X(C2733w0.m36979w(this));
            C2733w0.m36982u0(this, gVar);
        }
    }

    /* renamed from: T */
    private void m28766T(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* renamed from: U */
    private void m28765U() {
        if (this.f10472f0 || this.f10473g0) {
            TextView e = C5663n.m27832e(this);
            TextView c = C5663n.m27834c(this);
            if (e != null || c != null) {
                Pair<Integer, Integer> R = m28768R(e, c);
                if (this.f10472f0 && e != null) {
                    m28766T(e, R);
                }
                if (this.f10473g0 && c != null) {
                    m28766T(c, R);
                }
            }
        }
    }

    /* renamed from: V */
    private Drawable m28764V(Drawable drawable) {
        if (drawable == null || this.f10471e0 == null) {
            return drawable;
        }
        Drawable r = C2400a.m37825r(drawable.mutate());
        C2400a.m37829n(r, this.f10471e0.intValue());
        return r;
    }

    /* renamed from: W */
    private void m28763W() {
        ImageView b = C5663n.m27835b(this);
        if (b != null) {
            Boolean bool = this.f10475i0;
            if (bool != null) {
                b.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f10474h0;
            if (scaleType != null) {
                b.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f10474h0;
    }

    public Integer getNavigationIconTint() {
        return this.f10471e0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14042h.m1939e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m28765U();
        m28763W();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C14042h.m1940d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f10475i0;
        if (bool == null || bool.booleanValue() != z) {
            this.f10475i0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f10474h0 != scaleType) {
            this.f10474h0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m28764V(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f10471e0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f10473g0 != z) {
            this.f10473g0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f10472f0 != z) {
            this.f10472f0 = z;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f10469j0
            android.content.Context r8 = p462zb.C14615a.m126c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p083eb.C6812k.f38179S3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C5662m.m27838h(r0, r1, r2, r3, r4, r5)
            int r10 = p083eb.C6812k.f38203V3
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L_0x0029
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = p083eb.C6812k.f38218X3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f10472f0 = r10
            int r10 = p083eb.C6812k.f38211W3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f10473g0 = r10
            int r10 = p083eb.C6812k.f38195U3
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L_0x004a
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.f10470k0
            int r1 = r0.length
            if (r10 >= r1) goto L_0x004a
            r10 = r0[r10]
            r7.f10474h0 = r10
        L_0x004a:
            int r10 = p083eb.C6812k.f38187T3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x005c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f10475i0 = r10
        L_0x005c:
            r9.recycle()
            r7.m28767S(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
