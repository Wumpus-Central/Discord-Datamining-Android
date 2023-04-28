package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p394w3.C13740j;

/* renamed from: com.facebook.drawee.drawable.k */
/* loaded from: classes7.dex */
public class C4821k extends C4816f implements AbstractC4819i {

    /* renamed from: m */
    private RectF f7758m;

    /* renamed from: n */
    private Matrix f7759n;

    /* renamed from: k */
    EnumC4823b f7756k = EnumC4823b.OVERLAY_COLOR;

    /* renamed from: l */
    private final RectF f7757l = new RectF();

    /* renamed from: o */
    private final float[] f7760o = new float[8];

    /* renamed from: p */
    final float[] f7761p = new float[8];

    /* renamed from: q */
    final Paint f7762q = new Paint(1);

    /* renamed from: r */
    private boolean f7763r = false;

    /* renamed from: s */
    private float f7764s = 0.0f;

    /* renamed from: t */
    private int f7765t = 0;

    /* renamed from: u */
    private int f7766u = 0;

    /* renamed from: v */
    private float f7767v = 0.0f;

    /* renamed from: w */
    private boolean f7768w = false;

    /* renamed from: x */
    private boolean f7769x = false;

    /* renamed from: y */
    private final Path f7770y = new Path();

    /* renamed from: z */
    private final Path f7771z = new Path();

    /* renamed from: A */
    private final RectF f37153A = new RectF();

    /* renamed from: com.facebook.drawee.drawable.k$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C4822a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7772a;

        static {
            int[] iArr = new int[EnumC4823b.values().length];
            f7772a = iArr;
            try {
                iArr[EnumC4823b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7772a[EnumC4823b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.facebook.drawee.drawable.k$b */
    /* loaded from: classes7.dex */
    public enum EnumC4823b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public C4821k(Drawable drawable) {
        super((Drawable) C13740j.m2834g(drawable));
    }

    /* renamed from: j */
    private void m31808j() {
        float[] fArr;
        this.f7770y.reset();
        this.f7771z.reset();
        this.f37153A.set(getBounds());
        RectF rectF = this.f37153A;
        float f = this.f7767v;
        rectF.inset(f, f);
        if (this.f7756k == EnumC4823b.OVERLAY_COLOR) {
            this.f7770y.addRect(this.f37153A, Path.Direction.CW);
        }
        if (this.f7763r) {
            this.f7770y.addCircle(this.f37153A.centerX(), this.f37153A.centerY(), Math.min(this.f37153A.width(), this.f37153A.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f7770y.addRoundRect(this.f37153A, this.f7760o, Path.Direction.CW);
        }
        RectF rectF2 = this.f37153A;
        float f2 = this.f7767v;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.f37153A;
        float f3 = this.f7764s;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.f7763r) {
            this.f7771z.addCircle(this.f37153A.centerX(), this.f37153A.centerY(), Math.min(this.f37153A.width(), this.f37153A.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f7761p;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.f7760o[i] + this.f7767v) - (this.f7764s / 2.0f);
                i++;
            }
            this.f7771z.addRoundRect(this.f37153A, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f37153A;
        float f4 = this.f7764s;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: a */
    public void mo31807a(boolean z) {
        this.f7763r = z;
        m31808j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: b */
    public void mo31806b(float f) {
        this.f7767v = f;
        m31808j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: c */
    public void mo31805c(float f) {
        Arrays.fill(this.f7760o, f);
        m31808j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: d */
    public void mo31804d(boolean z) {
        if (this.f7769x != z) {
            this.f7769x = z;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f7757l.set(getBounds());
        int i = C4822a.f7772a[this.f7756k.ordinal()];
        if (i == 1) {
            int save = canvas.save();
            canvas.clipPath(this.f7770y);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i == 2) {
            if (this.f7768w) {
                RectF rectF = this.f7758m;
                if (rectF == null) {
                    this.f7758m = new RectF(this.f7757l);
                    this.f7759n = new Matrix();
                } else {
                    rectF.set(this.f7757l);
                }
                RectF rectF2 = this.f7758m;
                float f = this.f7764s;
                rectF2.inset(f, f);
                this.f7759n.setRectToRect(this.f7757l, this.f7758m, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f7757l);
                canvas.concat(this.f7759n);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f7762q.setStyle(Paint.Style.FILL);
            this.f7762q.setColor(this.f7766u);
            this.f7762q.setStrokeWidth(0.0f);
            this.f7762q.setFilterBitmap(m31810h());
            this.f7770y.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f7770y, this.f7762q);
            if (this.f7763r) {
                float width = ((this.f7757l.width() - this.f7757l.height()) + this.f7764s) / 2.0f;
                float height = ((this.f7757l.height() - this.f7757l.width()) + this.f7764s) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f7757l;
                    float f2 = rectF3.left;
                    canvas.drawRect(f2, rectF3.top, f2 + width, rectF3.bottom, this.f7762q);
                    RectF rectF4 = this.f7757l;
                    float f3 = rectF4.right;
                    canvas.drawRect(f3 - width, rectF4.top, f3, rectF4.bottom, this.f7762q);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f7757l;
                    float f4 = rectF5.left;
                    float f5 = rectF5.top;
                    canvas.drawRect(f4, f5, rectF5.right, f5 + height, this.f7762q);
                    RectF rectF6 = this.f7757l;
                    float f6 = rectF6.left;
                    float f7 = rectF6.bottom;
                    canvas.drawRect(f6, f7 - height, rectF6.right, f7, this.f7762q);
                }
            }
        }
        if (this.f7765t != 0) {
            this.f7762q.setStyle(Paint.Style.STROKE);
            this.f7762q.setColor(this.f7765t);
            this.f7762q.setStrokeWidth(this.f7764s);
            this.f7770y.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f7771z, this.f7762q);
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: e */
    public void mo31803e(boolean z) {
        this.f7768w = z;
        m31808j();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    /* renamed from: g */
    public void mo31801g(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f7760o, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13740j.m2838c(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f7760o, 0, 8);
        }
        m31808j();
        invalidateSelf();
    }

    /* renamed from: h */
    public boolean m31810h() {
        return this.f7769x;
    }

    /* renamed from: i */
    public void m31809i(int i) {
        this.f7766u = i;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m31808j();
    }

    @Override // com.facebook.drawee.drawable.AbstractC4819i
    public void setBorder(int i, float f) {
        this.f7765t = i;
        this.f7764s = f;
        m31808j();
        invalidateSelf();
    }
}
