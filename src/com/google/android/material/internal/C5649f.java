package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C1733v0;
import p083eb.C6812k;

/* renamed from: com.google.android.material.internal.f */
/* loaded from: classes3.dex */
public class C5649f extends C1733v0 {

    /* renamed from: A */
    private final Rect f37552A;

    /* renamed from: B */
    private final Rect f37553B;

    /* renamed from: C */
    private int f37554C;

    /* renamed from: D */
    protected boolean f37555D;

    /* renamed from: E */
    boolean f37556E;

    /* renamed from: z */
    private Drawable f11034z;

    public C5649f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f11034z;
        if (drawable != null) {
            if (this.f37556E) {
                this.f37556E = false;
                Rect rect = this.f37552A;
                Rect rect2 = this.f37553B;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f37555D) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f37554C, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f11034z;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11034z;
        if (drawable != null && drawable.isStateful()) {
            this.f11034z.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f11034z;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f37554C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11034z;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C1733v0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f37556E = z | this.f37556E;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f37556E = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f11034z;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f11034z);
            }
            this.f11034z = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f37554C == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f37554C != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f37554C = i;
            if (i == 119 && this.f11034z != null) {
                this.f11034z.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11034z;
    }

    public C5649f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37552A = new Rect();
        this.f37553B = new Rect();
        this.f37554C = 119;
        this.f37555D = true;
        this.f37556E = false;
        TypedArray h = C5662m.m27838h(context, attributeSet, C6812k.f38201V1, i, 0, new int[0]);
        this.f37554C = h.getInt(C6812k.f38216X1, this.f37554C);
        Drawable drawable = h.getDrawable(C6812k.f38209W1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f37555D = h.getBoolean(C6812k.f38223Y1, true);
        h.recycle();
    }
}
