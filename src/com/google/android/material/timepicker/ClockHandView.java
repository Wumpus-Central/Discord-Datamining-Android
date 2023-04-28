package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.C2733w0;
import java.util.ArrayList;
import java.util.List;
import p083eb.C6803b;
import p083eb.C6805d;
import p083eb.C6811j;
import p083eb.C6812k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClockHandView extends View {

    /* renamed from: k */
    private ValueAnimator f11384k;

    /* renamed from: l */
    private boolean f11385l;

    /* renamed from: m */
    private float f11386m;

    /* renamed from: n */
    private float f11387n;

    /* renamed from: o */
    private boolean f11388o;

    /* renamed from: p */
    private int f11389p;

    /* renamed from: q */
    private final List<AbstractC5769c> f11390q;

    /* renamed from: r */
    private final int f11391r;

    /* renamed from: s */
    private final float f11392s;

    /* renamed from: t */
    private final Paint f11393t;

    /* renamed from: u */
    private final RectF f11394u;

    /* renamed from: v */
    private final int f11395v;

    /* renamed from: w */
    private float f11396w;

    /* renamed from: x */
    private boolean f11397x;

    /* renamed from: y */
    private double f11398y;

    /* renamed from: z */
    private int f11399z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    /* loaded from: classes3.dex */
    public class C5767a implements ValueAnimator.AnimatorUpdateListener {
        C5767a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m27400m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    /* loaded from: classes3.dex */
    public class C5768b extends AnimatorListenerAdapter {
        C5768b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    /* loaded from: classes3.dex */
    public interface AbstractC5769c {
        /* renamed from: a */
        void mo27399a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14549w);
    }

    /* renamed from: c */
    private void m27410c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.f11393t.setStrokeWidth(0.0f);
        canvas.drawCircle((this.f11399z * ((float) Math.cos(this.f11398y))) + width2, (this.f11399z * ((float) Math.sin(this.f11398y))) + f, this.f11391r, this.f11393t);
        double sin = Math.sin(this.f11398y);
        double cos = Math.cos(this.f11398y);
        this.f11393t.setStrokeWidth(this.f11395v);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f11393t);
        canvas.drawCircle(width2, f, this.f11392s, this.f11393t);
    }

    /* renamed from: e */
    private int m27408e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            return degrees + 360;
        }
        return degrees;
    }

    /* renamed from: h */
    private Pair<Float, Float> m27405h(float f) {
        float f2 = m27407f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    /* renamed from: i */
    private boolean m27404i(float f, float f2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float e = m27408e(f, f2);
        boolean z5 = false;
        if (m27407f() != e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && z4) {
            return true;
        }
        if (!z4 && !z) {
            return false;
        }
        if (z3 && this.f11385l) {
            z5 = true;
        }
        m27401l(e, z5);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m27400m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f11396w = f2;
        this.f11398y = Math.toRadians(f2 - 90.0f);
        float width = (getWidth() / 2) + (this.f11399z * ((float) Math.cos(this.f11398y)));
        float height = (getHeight() / 2) + (this.f11399z * ((float) Math.sin(this.f11398y)));
        RectF rectF = this.f11394u;
        int i = this.f11391r;
        rectF.set(width - i, height - i, width + i, height + i);
        for (AbstractC5769c cVar : this.f11390q) {
            cVar.mo27399a(f2, z);
        }
        invalidate();
    }

    /* renamed from: b */
    public void m27411b(AbstractC5769c cVar) {
        this.f11390q.add(cVar);
    }

    /* renamed from: d */
    public RectF m27409d() {
        return this.f11394u;
    }

    /* renamed from: f */
    public float m27407f() {
        return this.f11396w;
    }

    /* renamed from: g */
    public int m27406g() {
        return this.f11391r;
    }

    /* renamed from: j */
    public void m27403j(int i) {
        this.f11399z = i;
        invalidate();
    }

    /* renamed from: k */
    public void m27402k(float f) {
        m27401l(f, false);
    }

    /* renamed from: l */
    public void m27401l(float f, boolean z) {
        ValueAnimator valueAnimator = this.f11384k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m27400m(f, false);
            return;
        }
        Pair<Float, Float> h = m27405h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h.first).floatValue(), ((Float) h.second).floatValue());
        this.f11384k = ofFloat;
        ofFloat.setDuration(200L);
        this.f11384k.addUpdateListener(new C5767a());
        this.f11384k.addListener(new C5768b());
        this.f11384k.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m27410c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m27402k(m27407f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.f11386m = x;
            this.f11387n = y;
            this.f11388o = true;
            this.f11397x = false;
            z2 = true;
            z3 = false;
            z = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.f11386m);
            int i2 = (int) (y - this.f11387n);
            if ((i * i) + (i2 * i2) > this.f11389p) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f11388o = z4;
            z3 = this.f11397x;
            if (actionMasked == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            z = z5;
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
            z = false;
        }
        this.f11397x |= m27404i(x, y, z3, z2, z);
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11390q = new ArrayList();
        Paint paint = new Paint();
        this.f11393t = paint;
        this.f11394u = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6812k.f14823s1, i, C6811j.f14675u);
        this.f11399z = obtainStyledAttributes.getDimensionPixelSize(C6812k.f14839u1, 0);
        this.f11391r = obtainStyledAttributes.getDimensionPixelSize(C6812k.f14847v1, 0);
        Resources resources = getResources();
        this.f11395v = resources.getDimensionPixelSize(C6805d.f14569k);
        this.f11392s = resources.getDimensionPixelSize(C6805d.f14567i);
        int color = obtainStyledAttributes.getColor(C6812k.f14831t1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m27402k(0.0f);
        this.f11389p = ViewConfiguration.get(context).getScaledTouchSlop();
        C2733w0.m37064A0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
