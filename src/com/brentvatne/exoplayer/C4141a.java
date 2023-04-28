package com.brentvatne.exoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.brentvatne.exoplayer.a */
/* loaded from: classes.dex */
public final class C4141a extends FrameLayout {

    /* renamed from: k */
    private float f6936k;

    /* renamed from: l */
    private int f6937l;

    public C4141a(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m32660a() {
        this.f6936k = 0.0f;
    }

    public float getAspectRatio() {
        return this.f6936k;
    }

    public int getResizeMode() {
        return this.f6937l;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f6936k != 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f3 = measuredWidth;
            float f4 = measuredHeight;
            float f5 = (this.f6936k / (f3 / f4)) - 1.0f;
            if (Math.abs(f5) > 0.01f) {
                int i3 = this.f6937l;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                int i4 = (int) (this.f6936k * f4);
                                if (i4 < measuredWidth) {
                                    float f6 = i4;
                                    float f7 = f3 / f6;
                                    measuredWidth = (int) (f6 * f7);
                                    measuredHeight = (int) (f4 * f7);
                                } else {
                                    measuredWidth = i4;
                                }
                            } else if (f5 > 0.0f) {
                                f = this.f6936k;
                            } else {
                                f2 = this.f6936k;
                            }
                        }
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                    }
                    f2 = this.f6936k;
                    measuredWidth = (int) (f4 * f2);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                }
                f = this.f6936k;
                measuredHeight = (int) (f3 / f);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public void setAspectRatio(float f) {
        if (this.f6936k != f) {
            this.f6936k = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.f6937l != i) {
            this.f6937l = i;
            requestLayout();
        }
    }

    public C4141a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6937l = 0;
    }
}
