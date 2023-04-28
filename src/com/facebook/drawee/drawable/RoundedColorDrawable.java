package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p394w3.C13740j;

/* loaded from: classes7.dex */
public class RoundedColorDrawable extends Drawable implements AbstractC4819i {

    /* renamed from: m */
    float[] f7690m;

    /* renamed from: k */
    private final float[] f7688k = new float[8];

    /* renamed from: l */
    final float[] f7689l = new float[8];

    /* renamed from: n */
    final Paint f7691n = new Paint(1);

    /* renamed from: o */
    private boolean f7692o = false;

    /* renamed from: p */
    private float f7693p = 0.0f;

    /* renamed from: q */
    private float f7694q = 0.0f;

    /* renamed from: r */
    private int f7695r = 0;

    /* renamed from: s */
    private boolean f7696s = false;

    /* renamed from: t */
    private boolean f7697t = false;

    /* renamed from: u */
    final Path f7698u = new Path();

    /* renamed from: v */
    final Path f7699v = new Path();

    /* renamed from: w */
    private int f7700w = 0;

    /* renamed from: x */
    private final RectF f7701x = new RectF();

    /* renamed from: y */
    private int f7702y = 255;

    public RoundedColorDrawable(int i) {
        m31845i(i);
    }

    @TargetApi(11)
    /* renamed from: f */
    public static RoundedColorDrawable m31847f(ColorDrawable colorDrawable) {
        return new RoundedColorDrawable(colorDrawable.getColor());
    }

    /* renamed from: j */
    private void m31844j() {
        float f;
        float[] fArr;
        float[] fArr2;
        this.f7698u.reset();
        this.f7699v.reset();
        this.f7701x.set(getBounds());
        RectF rectF = this.f7701x;
        float f2 = this.f7693p;
        rectF.inset(f2 / 2.0f, f2 / 2.0f);
        int i = 0;
        if (this.f7692o) {
            this.f7699v.addCircle(this.f7701x.centerX(), this.f7701x.centerY(), Math.min(this.f7701x.width(), this.f7701x.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr2 = this.f7689l;
                if (i2 >= fArr2.length) {
                    break;
                }
                fArr2[i2] = (this.f7688k[i2] + this.f7694q) - (this.f7693p / 2.0f);
                i2++;
            }
            this.f7699v.addRoundRect(this.f7701x, fArr2, Path.Direction.CW);
        }
        RectF rectF2 = this.f7701x;
        float f3 = this.f7693p;
        rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
        float f4 = this.f7694q;
        if (this.f7696s) {
            f = this.f7693p;
        } else {
            f = 0.0f;
        }
        float f5 = f4 + f;
        this.f7701x.inset(f5, f5);
        if (this.f7692o) {
            this.f7698u.addCircle(this.f7701x.centerX(), this.f7701x.centerY(), Math.min(this.f7701x.width(), this.f7701x.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f7696s) {
            if (this.f7690m == null) {
                this.f7690m = new float[8];
            }
            while (true) {
                fArr = this.f7690m;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = this.f7688k[i] - this.f7693p;
                i++;
            }
            this.f7698u.addRoundRect(this.f7701x, fArr, Path.Direction.CW);
        } else {
            this.f7698u.addRoundRect(this.f7701x, this.f7688k, Path.Direction.CW);
        }
        float f6 = -f5;
        this.f7701x.inset(f6, f6);
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: a */
    public void mo31807a(boolean z) {
        this.f7692o = z;
        m31844j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: b */
    public void mo31806b(float f) {
        if (this.f7694q != f) {
            this.f7694q = f;
            m31844j();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: c */
    public void mo31805c(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2838c(z, "radius should be non negative");
        Arrays.fill(this.f7688k, f);
        m31844j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: d */
    public void mo31804d(boolean z) {
        if (this.f7697t != z) {
            this.f7697t = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f7691n.setColor(C4813d.m31833c(this.f7700w, this.f7702y));
        this.f7691n.setStyle(Paint.Style.FILL);
        this.f7691n.setFilterBitmap(m31846h());
        canvas.drawPath(this.f7698u, this.f7691n);
        if (this.f7693p != 0.0f) {
            this.f7691n.setColor(C4813d.m31833c(this.f7695r, this.f7702y));
            this.f7691n.setStyle(Paint.Style.STROKE);
            this.f7691n.setStrokeWidth(this.f7693p);
            canvas.drawPath(this.f7699v, this.f7691n);
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: e */
    public void mo31803e(boolean z) {
        if (this.f7696s != z) {
            this.f7696s = z;
            m31844j();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: g */
    public void mo31801g(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f7688k, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13740j.m2838c(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f7688k, 0, 8);
        }
        m31844j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7702y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C4813d.m31834b(C4813d.m31833c(this.f7700w, this.f7702y));
    }

    /* renamed from: h */
    public boolean m31846h() {
        return this.f7697t;
    }

    /* renamed from: i */
    public void m31845i(int i) {
        if (this.f7700w != i) {
            this.f7700w = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m31844j();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f7702y) {
            this.f7702y = i;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    public void setBorder(int i, float f) {
        if (this.f7695r != i) {
            this.f7695r = i;
            invalidateSelf();
        }
        if (this.f7693p != f) {
            this.f7693p = f;
            m31844j();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
