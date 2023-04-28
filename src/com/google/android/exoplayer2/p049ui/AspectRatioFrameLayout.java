package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p042c9.C3792l;

/* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout */
/* loaded from: classes5.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: k */
    private final RunnableC5261c f9558k;

    /* renamed from: l */
    private float f9559l;

    /* renamed from: m */
    private int f9560m;

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    /* loaded from: classes5.dex */
    public interface AbstractC5260b {
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c */
    /* loaded from: classes5.dex */
    private final class RunnableC5261c implements Runnable {

        /* renamed from: k */
        private float f9561k;

        /* renamed from: l */
        private float f9562l;

        /* renamed from: m */
        private boolean f9563m;

        /* renamed from: n */
        private boolean f9564n;

        private RunnableC5261c() {
        }

        /* renamed from: a */
        public void m29813a(float f, float f2, boolean z) {
            this.f9561k = f;
            this.f9562l = f2;
            this.f9563m = z;
            if (!this.f9564n) {
                this.f9564n = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9564n = false;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9560m = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3792l.f6262a, 0, 0);
            try {
                this.f9560m = obtainStyledAttributes.getInt(C3792l.f6263b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f9558k = new RunnableC5261c();
    }

    public int getResizeMode() {
        return this.f9560m;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f9559l > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f3 = measuredWidth;
            float f4 = measuredHeight;
            float f5 = f3 / f4;
            float f6 = (this.f9559l / f5) - 1.0f;
            if (Math.abs(f6) <= 0.01f) {
                this.f9558k.m29813a(this.f9559l, f5, false);
                return;
            }
            int i3 = this.f9560m;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        f = this.f9559l;
                    } else if (i3 == 4) {
                        if (f6 > 0.0f) {
                            f = this.f9559l;
                        } else {
                            f2 = this.f9559l;
                        }
                    }
                    measuredWidth = (int) (f4 * f);
                } else {
                    f2 = this.f9559l;
                }
                measuredHeight = (int) (f3 / f2);
            } else if (f6 > 0.0f) {
                f2 = this.f9559l;
                measuredHeight = (int) (f3 / f2);
            } else {
                f = this.f9559l;
                measuredWidth = (int) (f4 * f);
            }
            this.f9558k.m29813a(this.f9559l, f5, true);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public void setAspectRatio(float f) {
        if (this.f9559l != f) {
            this.f9559l = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(AbstractC5260b bVar) {
    }

    public void setResizeMode(int i) {
        if (this.f9560m != i) {
            this.f9560m = i;
            requestLayout();
        }
    }
}
