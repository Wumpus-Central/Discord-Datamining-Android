package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2731w;
import androidx.core.view.C2733w0;
import com.facebook.react.uimanager.ViewDefaults;
import p083eb.C6807f;
import p083eb.C6812k;

/* renamed from: com.google.android.material.internal.e */
/* loaded from: classes3.dex */
public class C5648e extends ViewGroup {

    /* renamed from: k */
    private int f11030k;

    /* renamed from: l */
    private int f11031l;

    /* renamed from: m */
    private boolean f11032m;

    /* renamed from: n */
    private int f11033n;

    public C5648e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m27872a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: d */
    private void m27869d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C6812k.f38161Q1, 0, 0);
        this.f11030k = obtainStyledAttributes.getDimensionPixelSize(C6812k.f38177S1, 0);
        this.f11031l = obtainStyledAttributes.getDimensionPixelSize(C6812k.f38169R1, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public int m27871b(View view) {
        Object tag = view.getTag(C6807f.f38020F);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    /* renamed from: c */
    public boolean mo27870c() {
        return this.f11032m;
    }

    protected int getItemSpacing() {
        return this.f11031l;
    }

    protected int getLineSpacing() {
        return this.f11030k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getRowCount() {
        return this.f11033n;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (getChildCount() == 0) {
            this.f11033n = 0;
            return;
        }
        this.f11033n = 1;
        if (C2733w0.m37063B(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        if (z2) {
            i6 = getPaddingLeft();
        } else {
            i6 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i9 = (i3 - i) - i6;
        int i10 = i5;
        int i11 = paddingTop;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C6807f.f38020F, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = C2731w.m37076b(marginLayoutParams);
                    i8 = C2731w.m37077a(marginLayoutParams);
                } else {
                    i8 = 0;
                    i7 = 0;
                }
                int measuredWidth = i10 + i7 + childAt.getMeasuredWidth();
                if (!this.f11032m && measuredWidth > i9) {
                    i11 = this.f11030k + paddingTop;
                    this.f11033n++;
                    i10 = i5;
                }
                childAt.setTag(C6807f.f38020F, Integer.valueOf(this.f11033n - 1));
                int i13 = i10 + i7;
                int measuredWidth2 = childAt.getMeasuredWidth() + i13;
                int measuredHeight = childAt.getMeasuredHeight() + i11;
                if (z2) {
                    childAt.layout(i9 - measuredWidth2, i11, (i9 - i10) - i7, measuredHeight);
                } else {
                    childAt.layout(i13, i11, measuredWidth2, measuredHeight);
                }
                i10 += i7 + i8 + childAt.getMeasuredWidth() + this.f11031l;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i3 = size;
        } else {
            i3 = ViewDefaults.NUMBER_OF_LINES;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (paddingLeft + i5 + childAt.getMeasuredWidth() <= paddingRight || mo27870c()) {
                    i6 = paddingLeft;
                } else {
                    i6 = getPaddingLeft();
                    i7 = this.f11030k + paddingTop;
                }
                int measuredWidth = i6 + i5 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i6 + i5 + i4 + childAt.getMeasuredWidth() + this.f11031l;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m27872a(size, mode, i8 + getPaddingRight()), m27872a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f11031l = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f11030k = i;
    }

    public void setSingleLine(boolean z) {
        this.f11032m = z;
    }

    public C5648e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11032m = false;
        m27869d(context, attributeSet);
    }
}
