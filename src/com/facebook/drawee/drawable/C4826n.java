package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.ScalingUtils;
import p394w3.C13736i;
import p394w3.C13740j;

/* renamed from: com.facebook.drawee.drawable.n */
/* loaded from: classes7.dex */
public class C4826n extends C4816f {

    /* renamed from: k */
    ScalingUtils.ScaleType f7792k;

    /* renamed from: l */
    Object f7793l;

    /* renamed from: p */
    Matrix f7797p;

    /* renamed from: m */
    PointF f7794m = null;

    /* renamed from: n */
    int f7795n = 0;

    /* renamed from: o */
    int f7796o = 0;

    /* renamed from: q */
    private Matrix f7798q = new Matrix();

    public C4826n(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        super((Drawable) C13740j.m2834g(drawable));
        this.f7792k = scaleType;
    }

    /* renamed from: i */
    private void m31796i() {
        boolean z;
        ScalingUtils.ScaleType scaleType = this.f7792k;
        boolean z2 = true;
        if (scaleType instanceof ScalingUtils.AbstractC4809m) {
            Object state = ((ScalingUtils.AbstractC4809m) scaleType).getState();
            if (state == null || !state.equals(this.f7793l)) {
                z = true;
            } else {
                z = false;
            }
            this.f7793l = state;
        } else {
            z = false;
        }
        if (this.f7795n == getCurrent().getIntrinsicWidth() && this.f7796o == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            m31797h();
        }
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m31796i();
        if (this.f7797p != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f7797p);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.drawable.C4816f, com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        m31796i();
        Matrix matrix2 = this.f7797p;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: h */
    void m31797h() {
        float f;
        float f2;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f7795n = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f7796o = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f7797p = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f7797p = null;
        } else if (this.f7792k == ScalingUtils.ScaleType.f7703a) {
            current.setBounds(bounds);
            this.f7797p = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            ScalingUtils.ScaleType scaleType = this.f7792k;
            Matrix matrix = this.f7798q;
            PointF pointF = this.f7794m;
            if (pointF != null) {
                f = pointF.x;
            } else {
                f = 0.5f;
            }
            if (pointF != null) {
                f2 = pointF.y;
            } else {
                f2 = 0.5f;
            }
            scaleType.getTransform(matrix, bounds, intrinsicWidth, intrinsicHeight, f, f2);
            this.f7797p = this.f7798q;
        }
    }

    /* renamed from: j */
    public PointF m31795j() {
        return this.f7794m;
    }

    /* renamed from: k */
    public ScalingUtils.ScaleType m31794k() {
        return this.f7792k;
    }

    /* renamed from: l */
    public void m31793l(PointF pointF) {
        if (!C13736i.m2848a(this.f7794m, pointF)) {
            if (pointF == null) {
                this.f7794m = null;
            } else {
                if (this.f7794m == null) {
                    this.f7794m = new PointF();
                }
                this.f7794m.set(pointF);
            }
            m31797h();
            invalidateSelf();
        }
    }

    /* renamed from: m */
    public void m31792m(ScalingUtils.ScaleType scaleType) {
        if (!C13736i.m2848a(this.f7792k, scaleType)) {
            this.f7792k = scaleType;
            this.f7793l = null;
            m31797h();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        m31797h();
    }

    @Override // com.facebook.drawee.drawable.C4816f
    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m31797h();
        return current;
    }
}
