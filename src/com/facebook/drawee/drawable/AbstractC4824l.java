package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p007a6.C1271b;
import p394w3.C13740j;

/* renamed from: com.facebook.drawee.drawable.l */
/* loaded from: classes7.dex */
public abstract class AbstractC4824l extends Drawable implements AbstractC4819i, AbstractC4827o {

    /* renamed from: F */
    Matrix f37159F;

    /* renamed from: G */
    Matrix f37160G;

    /* renamed from: M */
    private TransformCallback f37166M;

    /* renamed from: k */
    private final Drawable f7776k;

    /* renamed from: u */
    float[] f7786u;

    /* renamed from: z */
    RectF f7791z;

    /* renamed from: l */
    protected boolean f7777l = false;

    /* renamed from: m */
    protected boolean f7778m = false;

    /* renamed from: n */
    protected float f7779n = 0.0f;

    /* renamed from: o */
    protected final Path f7780o = new Path();

    /* renamed from: p */
    protected boolean f7781p = true;

    /* renamed from: q */
    protected int f7782q = 0;

    /* renamed from: r */
    protected final Path f7783r = new Path();

    /* renamed from: s */
    private final float[] f7784s = new float[8];

    /* renamed from: t */
    final float[] f7785t = new float[8];

    /* renamed from: v */
    final RectF f7787v = new RectF();

    /* renamed from: w */
    final RectF f7788w = new RectF();

    /* renamed from: x */
    final RectF f7789x = new RectF();

    /* renamed from: y */
    final RectF f7790y = new RectF();

    /* renamed from: A */
    final Matrix f37154A = new Matrix();

    /* renamed from: B */
    final Matrix f37155B = new Matrix();

    /* renamed from: C */
    final Matrix f37156C = new Matrix();

    /* renamed from: D */
    final Matrix f37157D = new Matrix();

    /* renamed from: E */
    final Matrix f37158E = new Matrix();

    /* renamed from: H */
    final Matrix f37161H = new Matrix();

    /* renamed from: I */
    private float f37162I = 0.0f;

    /* renamed from: J */
    private boolean f37163J = false;

    /* renamed from: K */
    private boolean f37164K = false;

    /* renamed from: L */
    private boolean f37165L = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4824l(Drawable drawable) {
        this.f7776k = drawable;
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: a */
    public void mo31807a(boolean z) {
        this.f7777l = z;
        this.f37165L = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: b */
    public void mo31806b(float f) {
        if (this.f37162I != f) {
            this.f37162I = f;
            this.f37165L = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: c */
    public void mo31805c(float f) {
        boolean z;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2832i(z);
        Arrays.fill(this.f7784s, f);
        if (i != 0) {
            z2 = true;
        }
        this.f7778m = z2;
        this.f37165L = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f7776k.clearColorFilter();
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: d */
    public void mo31804d(boolean z) {
        if (this.f37164K != z) {
            this.f37164K = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("RoundedDrawable#draw");
        }
        this.f7776k.draw(canvas);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: e */
    public void mo31803e(boolean z) {
        if (this.f37163J != z) {
            this.f37163J = z;
            this.f37165L = true;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public boolean m31802f() {
        return this.f37164K;
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: g */
    public void mo31801g(float[] fArr) {
        boolean z;
        boolean z2;
        if (fArr == null) {
            Arrays.fill(this.f7784s, 0.0f);
            this.f7778m = false;
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13740j.m2838c(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f7784s, 0, 8);
            this.f7778m = false;
            for (int i = 0; i < 8; i++) {
                boolean z3 = this.f7778m;
                if (fArr[i] > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f7778m = z3 | z2;
            }
        }
        this.f37165L = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7776k.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f7776k.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f7776k.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f7776k.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f7776k.getOpacity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo31800h() {
        return this.f7777l || this.f7778m || this.f7779n > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void m31799i() {
        float f;
        float[] fArr;
        if (this.f37165L) {
            this.f7783r.reset();
            RectF rectF = this.f7787v;
            float f2 = this.f7779n;
            rectF.inset(f2 / 2.0f, f2 / 2.0f);
            if (this.f7777l) {
                this.f7783r.addCircle(this.f7787v.centerX(), this.f7787v.centerY(), Math.min(this.f7787v.width(), this.f7787v.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.f7785t;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.f7784s[i] + this.f37162I) - (this.f7779n / 2.0f);
                    i++;
                }
                this.f7783r.addRoundRect(this.f7787v, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f7787v;
            float f3 = this.f7779n;
            rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
            this.f7780o.reset();
            float f4 = this.f37162I;
            if (this.f37163J) {
                f = this.f7779n;
            } else {
                f = 0.0f;
            }
            float f5 = f4 + f;
            this.f7787v.inset(f5, f5);
            if (this.f7777l) {
                this.f7780o.addCircle(this.f7787v.centerX(), this.f7787v.centerY(), Math.min(this.f7787v.width(), this.f7787v.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f37163J) {
                if (this.f7786u == null) {
                    this.f7786u = new float[8];
                }
                for (int i2 = 0; i2 < this.f7785t.length; i2++) {
                    this.f7786u[i2] = this.f7784s[i2] - this.f7779n;
                }
                this.f7780o.addRoundRect(this.f7787v, this.f7786u, Path.Direction.CW);
            } else {
                this.f7780o.addRoundRect(this.f7787v, this.f7784s, Path.Direction.CW);
            }
            float f6 = -f5;
            this.f7787v.inset(f6, f6);
            this.f7780o.setFillType(Path.FillType.WINDING);
            this.f37165L = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void m31798j() {
        Matrix matrix;
        TransformCallback transformCallback = this.f37166M;
        if (transformCallback != null) {
            transformCallback.getTransform(this.f37156C);
            this.f37166M.getRootBounds(this.f7787v);
        } else {
            this.f37156C.reset();
            this.f7787v.set(getBounds());
        }
        this.f7789x.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f7790y.set(this.f7776k.getBounds());
        this.f37154A.setRectToRect(this.f7789x, this.f7790y, Matrix.ScaleToFit.FILL);
        if (this.f37163J) {
            RectF rectF = this.f7791z;
            if (rectF == null) {
                this.f7791z = new RectF(this.f7787v);
            } else {
                rectF.set(this.f7787v);
            }
            RectF rectF2 = this.f7791z;
            float f = this.f7779n;
            rectF2.inset(f, f);
            if (this.f37159F == null) {
                this.f37159F = new Matrix();
            }
            this.f37159F.setRectToRect(this.f7787v, this.f7791z, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.f37159F;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.f37156C.equals(this.f37157D) || !this.f37154A.equals(this.f37155B) || ((matrix = this.f37159F) != null && !matrix.equals(this.f37160G))) {
            this.f7781p = true;
            this.f37156C.invert(this.f37158E);
            this.f37161H.set(this.f37156C);
            if (this.f37163J) {
                this.f37161H.postConcat(this.f37159F);
            }
            this.f37161H.preConcat(this.f37154A);
            this.f37157D.set(this.f37156C);
            this.f37155B.set(this.f37154A);
            if (this.f37163J) {
                Matrix matrix3 = this.f37160G;
                if (matrix3 == null) {
                    this.f37160G = new Matrix(this.f37159F);
                } else {
                    matrix3.set(this.f37159F);
                }
            } else {
                Matrix matrix4 = this.f37160G;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (!this.f7787v.equals(this.f7788w)) {
            this.f37165L = true;
            this.f7788w.set(this.f7787v);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f7776k.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f7776k.setAlpha(i);
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    public void setBorder(int i, float f) {
        if (this.f7782q != i || this.f7779n != f) {
            this.f7782q = i;
            this.f7779n = f;
            this.f37165L = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f7776k.setColorFilter(i, mode);
    }

    @Override // com.facebook.drawee.drawable.AbstractC4827o
    public void setTransformCallback(TransformCallback transformCallback) {
        this.f37166M = transformCallback;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7776k.setColorFilter(colorFilter);
    }
}
