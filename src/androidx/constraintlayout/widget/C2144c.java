package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public class C2144c extends ViewGroup {

    /* renamed from: k */
    ConstraintSet f2796k;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C2145a generateDefaultLayoutParams() {
        return new C2145a(-2, -2);
    }

    /* renamed from: b */
    public C2145a generateLayoutParams(AttributeSet attributeSet) {
        return new C2145a(getContext(), attributeSet);
    }

    public ConstraintSet getConstraintSet() {
        if (this.f2796k == null) {
            this.f2796k = new ConstraintSet();
        }
        this.f2796k.m38793h(this);
        return this.f2796k;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* loaded from: classes.dex */
    public static class C2145a extends ConstraintLayout.LayoutParams {

        /* renamed from: A0 */
        public float f35451A0;

        /* renamed from: B0 */
        public float f35452B0;

        /* renamed from: p0 */
        public float f2797p0;

        /* renamed from: q0 */
        public boolean f2798q0;

        /* renamed from: r0 */
        public float f2799r0;

        /* renamed from: s0 */
        public float f2800s0;

        /* renamed from: t0 */
        public float f2801t0;

        /* renamed from: u0 */
        public float f2802u0;

        /* renamed from: v0 */
        public float f2803v0;

        /* renamed from: w0 */
        public float f2804w0;

        /* renamed from: x0 */
        public float f2805x0;

        /* renamed from: y0 */
        public float f2806y0;

        /* renamed from: z0 */
        public float f2807z0;

        public C2145a(int i, int i2) {
            super(i, i2);
            this.f2797p0 = 1.0f;
            this.f2798q0 = false;
            this.f2799r0 = 0.0f;
            this.f2800s0 = 0.0f;
            this.f2801t0 = 0.0f;
            this.f2802u0 = 0.0f;
            this.f2803v0 = 1.0f;
            this.f2804w0 = 1.0f;
            this.f2805x0 = 0.0f;
            this.f2806y0 = 0.0f;
            this.f2807z0 = 0.0f;
            this.f35451A0 = 0.0f;
            this.f35452B0 = 0.0f;
        }

        public C2145a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2797p0 = 1.0f;
            this.f2798q0 = false;
            this.f2799r0 = 0.0f;
            this.f2800s0 = 0.0f;
            this.f2801t0 = 0.0f;
            this.f2802u0 = 0.0f;
            this.f2803v0 = 1.0f;
            this.f2804w0 = 1.0f;
            this.f2805x0 = 0.0f;
            this.f2806y0 = 0.0f;
            this.f2807z0 = 0.0f;
            this.f35451A0 = 0.0f;
            this.f35452B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2148f.f2907o2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2148f.f2913p2) {
                    this.f2797p0 = obtainStyledAttributes.getFloat(index, this.f2797p0);
                } else if (index == C2148f.f35456A2) {
                    this.f2799r0 = obtainStyledAttributes.getFloat(index, this.f2799r0);
                    this.f2798q0 = true;
                } else if (index == C2148f.f2961x2) {
                    this.f2801t0 = obtainStyledAttributes.getFloat(index, this.f2801t0);
                } else if (index == C2148f.f2967y2) {
                    this.f2802u0 = obtainStyledAttributes.getFloat(index, this.f2802u0);
                } else if (index == C2148f.f2955w2) {
                    this.f2800s0 = obtainStyledAttributes.getFloat(index, this.f2800s0);
                } else if (index == C2148f.f2943u2) {
                    this.f2803v0 = obtainStyledAttributes.getFloat(index, this.f2803v0);
                } else if (index == C2148f.f2949v2) {
                    this.f2804w0 = obtainStyledAttributes.getFloat(index, this.f2804w0);
                } else if (index == C2148f.f2919q2) {
                    this.f2805x0 = obtainStyledAttributes.getFloat(index, this.f2805x0);
                } else if (index == C2148f.f2925r2) {
                    this.f2806y0 = obtainStyledAttributes.getFloat(index, this.f2806y0);
                } else if (index == C2148f.f2931s2) {
                    this.f2807z0 = obtainStyledAttributes.getFloat(index, this.f2807z0);
                } else if (index == C2148f.f2937t2) {
                    this.f35451A0 = obtainStyledAttributes.getFloat(index, this.f35451A0);
                } else if (index == C2148f.f2973z2) {
                    this.f35452B0 = obtainStyledAttributes.getFloat(index, this.f35452B0);
                }
            }
        }
    }
}
