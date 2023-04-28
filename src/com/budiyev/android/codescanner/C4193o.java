package com.budiyev.android.codescanner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* renamed from: com.budiyev.android.codescanner.o */
/* loaded from: classes.dex */
final class C4193o extends View {

    /* renamed from: k */
    private final Paint f7136k;

    /* renamed from: l */
    private final Paint f7137l;

    /* renamed from: m */
    private final Path f7138m;

    /* renamed from: n */
    private C4187l f7139n;

    /* renamed from: o */
    private int f7140o = 0;

    /* renamed from: p */
    private int f7141p = 0;

    /* renamed from: q */
    private float f7142q = 1.0f;

    /* renamed from: r */
    private float f7143r = 1.0f;

    /* renamed from: s */
    private float f7144s = 0.75f;

    /* renamed from: t */
    private float f7145t = 0.5f;

    /* renamed from: u */
    private boolean f7146u = true;

    /* renamed from: v */
    private boolean f7147v = true;

    public C4193o(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f7136k = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f7137l = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f7138m = path;
    }

    /* renamed from: k */
    private void m32373k() {
        m32372l(getWidth(), getHeight());
    }

    /* renamed from: l */
    private void m32372l(int i, int i2) {
        int i3;
        int i4;
        if (i > 0 && i2 > 0) {
            float f = i;
            float f2 = i2;
            float f3 = this.f7142q / this.f7143r;
            float f4 = this.f7144s;
            if (f / f2 <= f3) {
                i4 = Math.round(f * f4);
                i3 = Math.round(i4 / f3);
            } else {
                i3 = Math.round(f2 * f4);
                i4 = Math.round(i3 * f3);
            }
            int i5 = (i - i4) / 2;
            int round = Math.round((i2 - i3) * this.f7145t);
            this.f7139n = new C4187l(i5, round, i4 + i5, i3 + round);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float m32383a() {
        return this.f7143r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m32382b() {
        return this.f7142q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m32381c() {
        return this.f7137l.getColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m32380d() {
        return this.f7141p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m32379e() {
        return this.f7140o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C4187l m32378f() {
        return this.f7139n;
    }

    /* renamed from: g */
    public float m32377g() {
        return this.f7144s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m32376h() {
        return (int) this.f7137l.getStrokeWidth();
    }

    /* renamed from: i */
    public float m32375i() {
        return this.f7145t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m32374j() {
        return this.f7136k.getColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m32371m(float f, float f2) {
        this.f7142q = f;
        this.f7143r = f2;
        m32373k();
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m32370n(float f) {
        this.f7143r = f;
        m32373k();
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m32369o(float f) {
        this.f7142q = f;
        m32373k();
        if (isLaidOut()) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        C4187l lVar = this.f7139n;
        if (lVar != null) {
            int width = getWidth();
            int height = getHeight();
            float g = lVar.m32409g();
            float e = lVar.m32411e();
            float f = lVar.m32410f();
            float c = lVar.m32413c();
            float f2 = this.f7140o;
            float f3 = this.f7141p;
            boolean z = this.f7146u;
            boolean z2 = this.f7147v;
            Path path = this.f7138m;
            if (f3 > 0.0f) {
                float min = Math.min(f3, Math.max(f2 - 1.0f, 0.0f));
                if (z) {
                    path.reset();
                    float f4 = g + min;
                    path.moveTo(e, f4);
                    float f5 = e + min;
                    path.quadTo(e, g, f5, g);
                    float f6 = f - min;
                    path.lineTo(f6, g);
                    path.quadTo(f, g, f, f4);
                    float f7 = c - min;
                    path.lineTo(f, f7);
                    path.quadTo(f, c, f6, c);
                    path.lineTo(f5, c);
                    path.quadTo(e, c, e, f7);
                    path.lineTo(e, f4);
                    path.moveTo(0.0f, 0.0f);
                    float f8 = width;
                    path.lineTo(f8, 0.0f);
                    float f9 = height;
                    path.lineTo(f8, f9);
                    path.lineTo(0.0f, f9);
                    path.lineTo(0.0f, 0.0f);
                    canvas.drawPath(path, this.f7136k);
                }
                if (z2) {
                    path.reset();
                    float f10 = g + f2;
                    path.moveTo(e, f10);
                    float f11 = g + min;
                    path.lineTo(e, f11);
                    float f12 = e + min;
                    path.quadTo(e, g, f12, g);
                    float f13 = e + f2;
                    path.lineTo(f13, g);
                    float f14 = f - f2;
                    path.moveTo(f14, g);
                    float f15 = f - min;
                    path.lineTo(f15, g);
                    path.quadTo(f, g, f, f11);
                    path.lineTo(f, f10);
                    float f16 = c - f2;
                    path.moveTo(f, f16);
                    float f17 = c - min;
                    path.lineTo(f, f17);
                    path.quadTo(f, c, f15, c);
                    path.lineTo(f14, c);
                    path.moveTo(f13, c);
                    path.lineTo(f12, c);
                    path.quadTo(e, c, e, f17);
                    path.lineTo(e, f16);
                    canvas.drawPath(path, this.f7137l);
                    return;
                }
                return;
            }
            if (z) {
                path.reset();
                path.moveTo(e, g);
                path.lineTo(f, g);
                path.lineTo(f, c);
                path.lineTo(e, c);
                path.lineTo(e, g);
                path.moveTo(0.0f, 0.0f);
                float f18 = width;
                path.lineTo(f18, 0.0f);
                float f19 = height;
                path.lineTo(f18, f19);
                path.lineTo(0.0f, f19);
                path.lineTo(0.0f, 0.0f);
                canvas.drawPath(path, this.f7136k);
            }
            if (z2) {
                path.reset();
                float f20 = g + f2;
                path.moveTo(e, f20);
                path.lineTo(e, g);
                float f21 = e + f2;
                path.lineTo(f21, g);
                float f22 = f - f2;
                path.moveTo(f22, g);
                path.lineTo(f, g);
                path.lineTo(f, f20);
                float f23 = c - f2;
                path.moveTo(f, f23);
                path.lineTo(f, c);
                path.lineTo(f22, c);
                path.moveTo(f21, c);
                path.lineTo(e, c);
                path.lineTo(e, f23);
                canvas.drawPath(path, this.f7137l);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m32372l(i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m32372l(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m32368p(int i) {
        this.f7137l.setColor(i);
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m32367q(boolean z) {
        Paint.Cap cap;
        Paint paint = this.f7137l;
        if (z) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m32366r(int i) {
        this.f7141p = i;
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m32365s(int i) {
        this.f7140o = i;
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m32364t(float f) {
        this.f7144s = f;
        m32373k();
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m32363u(int i) {
        this.f7137l.setStrokeWidth(i);
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* renamed from: v */
    public void m32362v(float f) {
        this.f7145t = f;
        m32373k();
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m32361w(boolean z) {
        this.f7147v = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m32360x(int i) {
        this.f7136k.setColor(i);
        if (isLaidOut()) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m32359y(boolean z) {
        this.f7146u = z;
        if (isLaidOut()) {
            invalidate();
        }
    }
}
