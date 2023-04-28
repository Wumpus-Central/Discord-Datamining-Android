package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C2549a;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p071e.C6525a;
import p083eb.C6803b;
import p083eb.C6804c;
import p083eb.C6805d;
import p083eb.C6807f;
import p083eb.C6809h;
import p083eb.C6811j;
import p083eb.C6812k;
import p366ub.C13242c;

/* loaded from: classes3.dex */
class ClockFaceView extends C5779c implements ClockHandView.AbstractC5769c {

    /* renamed from: A */
    private final ColorStateList f37607A;

    /* renamed from: n */
    private final ClockHandView f11369n;

    /* renamed from: o */
    private final Rect f11370o;

    /* renamed from: p */
    private final RectF f11371p;

    /* renamed from: q */
    private final SparseArray<TextView> f11372q;

    /* renamed from: r */
    private final C2549a f11373r;

    /* renamed from: s */
    private final int[] f11374s;

    /* renamed from: t */
    private final float[] f11375t;

    /* renamed from: u */
    private final int f11376u;

    /* renamed from: v */
    private final int f11377v;

    /* renamed from: w */
    private final int f11378w;

    /* renamed from: x */
    private final int f11379x;

    /* renamed from: y */
    private String[] f11380y;

    /* renamed from: z */
    private float f11381z;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    /* loaded from: classes3.dex */
    class ViewTreeObserver$OnPreDrawListenerC5765a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC5765a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo27388d(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f11369n.m27406g()) - ClockFaceView.this.f11376u);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    /* loaded from: classes3.dex */
    class C5766b extends C2549a {
        C5766b() {
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int intValue = ((Integer) view.getTag(C6807f.f14605n)).intValue();
            if (intValue > 0) {
                accessibilityNodeInfoCompat.m37416E0((View) ClockFaceView.this.f11372q.get(intValue - 1));
            }
            accessibilityNodeInfoCompat.m37383d0(AccessibilityNodeInfoCompat.C2558c.m37331b(0, 1, intValue, 1, false, view.isSelected()));
            accessibilityNodeInfoCompat.m37387b0(true);
            accessibilityNodeInfoCompat.m37388b(AccessibilityNodeInfoCompat.C2556a.f3561i);
        }

        @Override // androidx.core.view.C2549a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            float x = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            ClockFaceView.this.f11369n.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x, height, 0));
            ClockFaceView.this.f11369n.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x, height, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14549w);
    }

    /* renamed from: k */
    private void m27417k() {
        RectF d = this.f11369n.m27409d();
        for (int i = 0; i < this.f11372q.size(); i++) {
            TextView textView = this.f11372q.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f11370o);
                offsetDescendantRectToMyCoords(textView, this.f11370o);
                textView.setSelected(d.contains(this.f11370o.centerX(), this.f11370o.centerY()));
                textView.getPaint().setShader(m27416l(d, this.f11370o, textView));
                textView.invalidate();
            }
        }
    }

    /* renamed from: l */
    private RadialGradient m27416l(RectF rectF, Rect rect, TextView textView) {
        this.f11371p.set(rect);
        this.f11371p.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (!RectF.intersects(rectF, this.f11371p)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f11371p.left, rectF.centerY() - this.f11371p.top, rectF.width() * 0.5f, this.f11374s, this.f11375t, Shader.TileMode.CLAMP);
    }

    /* renamed from: m */
    private static float m27415m(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    /* renamed from: o */
    private void m27413o(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f11372q.size();
        for (int i2 = 0; i2 < Math.max(this.f11380y.length, size); i2++) {
            TextView textView = this.f11372q.get(i2);
            if (i2 >= this.f11380y.length) {
                removeView(textView);
                this.f11372q.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C6809h.f14624d, (ViewGroup) this, false);
                    this.f11372q.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f11380y[i2]);
                textView.setTag(C6807f.f14605n, Integer.valueOf(i2));
                C2733w0.m36990q0(textView, this.f11373r);
                textView.setTextColor(this.f37607A);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.f11380y[i2]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.AbstractC5769c
    /* renamed from: a */
    public void mo27399a(float f, boolean z) {
        if (Math.abs(this.f11381z - f) > 0.001f) {
            this.f11381z = f;
            m27417k();
        }
    }

    @Override // com.google.android.material.timepicker.C5779c
    /* renamed from: d */
    public void mo27388d(int i) {
        if (i != m27389c()) {
            super.mo27388d(i);
            this.f11369n.m27403j(m27389c());
        }
    }

    /* renamed from: n */
    public void m27414n(String[] strArr, int i) {
        this.f11380y = strArr;
        m27413o(i);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.m37408I0(accessibilityNodeInfo).m37385c0(AccessibilityNodeInfoCompat.C2557b.m37333b(1, this.f11380y.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m27417k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int m = (int) (this.f11379x / m27415m(this.f11377v / displayMetrics.heightPixels, this.f11378w / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
        setMeasuredDimension(m, m);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11370o = new Rect();
        this.f11371p = new RectF();
        this.f11372q = new SparseArray<>();
        this.f11375t = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6812k.f14799p1, i, C6811j.f14675u);
        Resources resources = getResources();
        ColorStateList a = C13242c.m4241a(context, obtainStyledAttributes, C6812k.f14815r1);
        this.f37607A = a;
        LayoutInflater.from(context).inflate(C6809h.f14625e, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C6807f.f14600i);
        this.f11369n = clockHandView;
        this.f11376u = resources.getDimensionPixelSize(C6805d.f14568j);
        int colorForState = a.getColorForState(new int[]{16842913}, a.getDefaultColor());
        this.f11374s = new int[]{colorForState, colorForState, a.getDefaultColor()};
        clockHandView.m27411b(this);
        int defaultColor = C6525a.m25365a(context, C6804c.f14554b).getDefaultColor();
        ColorStateList a2 = C13242c.m4241a(context, obtainStyledAttributes, C6812k.f14807q1);
        setBackgroundColor(a2 != null ? a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC5765a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f11373r = new C5766b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m27414n(strArr, 0);
        this.f11377v = resources.getDimensionPixelSize(C6805d.f14581w);
        this.f11378w = resources.getDimensionPixelSize(C6805d.f14582x);
        this.f11379x = resources.getDimensionPixelSize(C6805d.f14570l);
    }
}
