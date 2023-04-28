package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import gf.C7581a;
import gf.C7582b;
import gf.C7588h;
import p139hf.AbstractC8013d;
import p200kf.C9863g;

/* loaded from: classes8.dex */
public class OverlayView extends View {

    /* renamed from: A */
    private Paint f37712A;

    /* renamed from: B */
    private Paint f37713B;

    /* renamed from: C */
    private Paint f37714C;

    /* renamed from: D */
    private int f37715D;

    /* renamed from: E */
    private float f37716E;

    /* renamed from: F */
    private float f37717F;

    /* renamed from: G */
    private int f37718G;

    /* renamed from: H */
    private int f37719H;

    /* renamed from: I */
    private int f37720I;

    /* renamed from: J */
    private int f37721J;

    /* renamed from: K */
    private AbstractC8013d f37722K;

    /* renamed from: L */
    private boolean f37723L;

    /* renamed from: k */
    private final RectF f13022k;

    /* renamed from: l */
    private final RectF f13023l;

    /* renamed from: m */
    protected int f13024m;

    /* renamed from: n */
    protected int f13025n;

    /* renamed from: o */
    protected float[] f13026o;

    /* renamed from: p */
    protected float[] f13027p;

    /* renamed from: q */
    private int f13028q;

    /* renamed from: r */
    private int f13029r;

    /* renamed from: s */
    private float f13030s;

    /* renamed from: t */
    private float[] f13031t;

    /* renamed from: u */
    private boolean f13032u;

    /* renamed from: v */
    private boolean f13033v;

    /* renamed from: w */
    private boolean f13034w;

    /* renamed from: x */
    private int f13035x;

    /* renamed from: y */
    private Path f13036y;

    /* renamed from: z */
    private Paint f13037z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private int m25699c(float f, float f2) {
        double d = this.f37719H;
        int i = -1;
        for (int i2 = 0; i2 < 8; i2 += 2) {
            double sqrt = Math.sqrt(Math.pow(f - this.f13026o[i2], 2.0d) + Math.pow(f2 - this.f13026o[i2 + 1], 2.0d));
            if (sqrt < d) {
                i = i2 / 2;
                d = sqrt;
            }
        }
        if (this.f37715D != 1 || i >= 0 || !this.f13022k.contains(f, f2)) {
            return i;
        }
        return 4;
    }

    /* renamed from: e */
    private void m25697e(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C7588h.f16506a0, getResources().getDimensionPixelSize(C7582b.f16458a));
        int color = typedArray.getColor(C7588h.f38397Z, getResources().getColor(C7581a.f16447c));
        this.f37713B.setStrokeWidth(dimensionPixelSize);
        this.f37713B.setColor(color);
        this.f37713B.setStyle(Paint.Style.STROKE);
        this.f37714C.setStrokeWidth(dimensionPixelSize * 3);
        this.f37714C.setColor(color);
        this.f37714C.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: f */
    private void m25696f(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C7588h.f16514e0, getResources().getDimensionPixelSize(C7582b.f16459b));
        int color = typedArray.getColor(C7588h.f16508b0, getResources().getColor(C7581a.f16448d));
        this.f37712A.setStrokeWidth(dimensionPixelSize);
        this.f37712A.setColor(color);
        this.f13028q = typedArray.getInt(C7588h.f16512d0, 2);
        this.f13029r = typedArray.getInt(C7588h.f16510c0, 2);
    }

    /* renamed from: i */
    private void m25693i(float f, float f2) {
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        this.f13023l.set(this.f13022k);
        int i = this.f37718G;
        boolean z2 = true;
        if (i == 0) {
            RectF rectF = this.f13023l;
            RectF rectF2 = this.f13022k;
            rectF.set(f, f2, rectF2.right, rectF2.bottom);
        } else if (i == 1) {
            RectF rectF3 = this.f13023l;
            RectF rectF4 = this.f13022k;
            rectF3.set(rectF4.left, f2, f, rectF4.bottom);
        } else if (i == 2) {
            RectF rectF5 = this.f13023l;
            RectF rectF6 = this.f13022k;
            rectF5.set(rectF6.left, rectF6.top, f, f2);
        } else if (i == 3) {
            RectF rectF7 = this.f13023l;
            RectF rectF8 = this.f13022k;
            rectF7.set(f, rectF8.top, rectF8.right, f2);
        } else if (i == 4) {
            this.f13023l.offset(f - this.f37716E, f2 - this.f37717F);
            if (this.f13023l.left > getLeft() && this.f13023l.top > getTop() && this.f13023l.right < getRight() && this.f13023l.bottom < getBottom()) {
                this.f13022k.set(this.f13023l);
                m25692j();
                postInvalidate();
                return;
            }
            return;
        }
        if (this.f13023l.height() >= this.f37720I) {
            z = true;
        } else {
            z = false;
        }
        if (this.f13023l.width() < this.f37720I) {
            z2 = false;
        }
        RectF rectF9 = this.f13022k;
        if (z2) {
            f3 = this.f13023l.left;
        } else {
            f3 = rectF9.left;
        }
        if (z) {
            f4 = this.f13023l.top;
        } else {
            f4 = rectF9.top;
        }
        if (z2) {
            f5 = this.f13023l.right;
        } else {
            f5 = rectF9.right;
        }
        if (z) {
            f6 = this.f13023l.bottom;
        } else {
            f6 = rectF9.bottom;
        }
        rectF9.set(f3, f4, f5, f6);
        if (z || z2) {
            m25692j();
            postInvalidate();
        }
    }

    /* renamed from: j */
    private void m25692j() {
        this.f13026o = C9863g.m15167b(this.f13022k);
        this.f13027p = C9863g.m15168a(this.f13022k);
        this.f13031t = null;
        this.f13036y.reset();
        this.f13036y.addCircle(this.f13022k.centerX(), this.f13022k.centerY(), Math.min(this.f13022k.width(), this.f13022k.height()) / 2.0f, Path.Direction.CW);
    }

    /* renamed from: a */
    protected void m25701a(Canvas canvas) {
        int i;
        int i2;
        if (this.f13033v) {
            if (this.f13031t == null && !this.f13022k.isEmpty()) {
                this.f13031t = new float[(this.f13028q * 4) + (this.f13029r * 4)];
                int i3 = 0;
                for (int i4 = 0; i4 < this.f13028q; i4++) {
                    float[] fArr = this.f13031t;
                    int i5 = i3 + 1;
                    RectF rectF = this.f13022k;
                    fArr[i3] = rectF.left;
                    int i6 = i5 + 1;
                    float f = i4 + 1.0f;
                    float height = rectF.height() * (f / (this.f13028q + 1));
                    RectF rectF2 = this.f13022k;
                    fArr[i5] = height + rectF2.top;
                    float[] fArr2 = this.f13031t;
                    int i7 = i6 + 1;
                    fArr2[i6] = rectF2.right;
                    i3 = i7 + 1;
                    fArr2[i7] = (rectF2.height() * (f / (this.f13028q + 1))) + this.f13022k.top;
                }
                for (int i8 = 0; i8 < this.f13029r; i8++) {
                    float[] fArr3 = this.f13031t;
                    int i9 = i3 + 1;
                    float f2 = i8 + 1.0f;
                    float width = this.f13022k.width() * (f2 / (this.f13029r + 1));
                    RectF rectF3 = this.f13022k;
                    fArr3[i3] = width + rectF3.left;
                    float[] fArr4 = this.f13031t;
                    int i10 = i9 + 1;
                    fArr4[i9] = rectF3.top;
                    int i11 = i10 + 1;
                    float width2 = rectF3.width() * (f2 / (this.f13029r + 1));
                    RectF rectF4 = this.f13022k;
                    fArr4[i10] = width2 + rectF4.left;
                    i3 = i11 + 1;
                    this.f13031t[i11] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f13031t;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f37712A);
            }
        }
        if (this.f13032u) {
            canvas.drawRect(this.f13022k, this.f37713B);
        }
        if (this.f37715D != 0) {
            canvas.save();
            this.f13023l.set(this.f13022k);
            this.f13023l.inset(this.f37721J, -i);
            canvas.clipRect(this.f13023l, Region.Op.DIFFERENCE);
            this.f13023l.set(this.f13022k);
            this.f13023l.inset(-i2, this.f37721J);
            canvas.clipRect(this.f13023l, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f13022k, this.f37714C);
            canvas.restore();
        }
    }

    /* renamed from: b */
    protected void m25700b(Canvas canvas) {
        canvas.save();
        if (this.f13034w) {
            canvas.clipPath(this.f13036y, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f13022k, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f13035x);
        canvas.restore();
        if (this.f13034w) {
            canvas.drawCircle(this.f13022k.centerX(), this.f13022k.centerY(), Math.min(this.f13022k.width(), this.f13022k.height()) / 2.0f, this.f13037z);
        }
    }

    /* renamed from: d */
    protected void m25698d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void m25695g(TypedArray typedArray) {
        this.f13034w = typedArray.getBoolean(C7588h.f38395X, false);
        int color = typedArray.getColor(C7588h.f38396Y, getResources().getColor(C7581a.f16449e));
        this.f13035x = color;
        this.f13037z.setColor(color);
        this.f13037z.setStyle(Paint.Style.STROKE);
        this.f13037z.setStrokeWidth(1.0f);
        m25697e(typedArray);
        this.f13032u = typedArray.getBoolean(C7588h.f16516f0, true);
        m25696f(typedArray);
        this.f13033v = typedArray.getBoolean(C7588h.f16518g0, true);
    }

    public RectF getCropViewRect() {
        return this.f13022k;
    }

    public int getFreestyleCropMode() {
        return this.f37715D;
    }

    public AbstractC8013d getOverlayViewChangeListener() {
        return this.f37722K;
    }

    /* renamed from: h */
    public void m25694h() {
        int i = this.f13024m;
        float f = this.f13030s;
        int i2 = (int) (i / f);
        int i3 = this.f13025n;
        if (i2 > i3) {
            int i4 = (int) (i3 * f);
            int i5 = (i - i4) / 2;
            this.f13022k.set(getPaddingLeft() + i5, getPaddingTop(), getPaddingLeft() + i4 + i5, getPaddingTop() + this.f13025n);
        } else {
            int i6 = (i3 - i2) / 2;
            this.f13022k.set(getPaddingLeft(), getPaddingTop() + i6, getPaddingLeft() + this.f13024m, getPaddingTop() + i2 + i6);
        }
        AbstractC8013d dVar = this.f37722K;
        if (dVar != null) {
            dVar.mo20856a(this.f13022k);
        }
        m25692j();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m25700b(canvas);
        m25701a(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f13024m = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f13025n = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.f37723L) {
                this.f37723L = false;
                setTargetAspectRatio(this.f13030s);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f13022k.isEmpty() && this.f37715D != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int c = m25699c(x, y);
                this.f37718G = c;
                if (c != -1) {
                    z = true;
                }
                if (!z) {
                    this.f37716E = -1.0f;
                    this.f37717F = -1.0f;
                } else if (this.f37716E < 0.0f) {
                    this.f37716E = x;
                    this.f37717F = y;
                }
                return z;
            } else if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.f37718G != -1) {
                float min = Math.min(Math.max(x, getPaddingLeft()), getWidth() - getPaddingRight());
                float min2 = Math.min(Math.max(y, getPaddingTop()), getHeight() - getPaddingBottom());
                m25693i(min, min2);
                this.f37716E = min;
                this.f37717F = min2;
                return true;
            } else if ((motionEvent.getAction() & 255) == 1) {
                this.f37716E = -1.0f;
                this.f37717F = -1.0f;
                this.f37718G = -1;
                AbstractC8013d dVar = this.f37722K;
                if (dVar != null) {
                    dVar.mo20856a(this.f13022k);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z) {
        this.f13034w = z;
    }

    public void setCropFrameColor(int i) {
        this.f37713B.setColor(i);
    }

    public void setCropFrameStrokeWidth(int i) {
        this.f37713B.setStrokeWidth(i);
    }

    public void setCropGridColor(int i) {
        this.f37712A.setColor(i);
    }

    public void setCropGridColumnCount(int i) {
        this.f13029r = i;
        this.f13031t = null;
    }

    public void setCropGridCornerColor(int i) {
        this.f37714C.setColor(i);
    }

    public void setCropGridRowCount(int i) {
        this.f13028q = i;
        this.f13031t = null;
    }

    public void setCropGridStrokeWidth(int i) {
        this.f37712A.setStrokeWidth(i);
    }

    public void setDimmedColor(int i) {
        this.f13035x = i;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.f37715D = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.f37715D = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(AbstractC8013d dVar) {
        this.f37722K = dVar;
    }

    public void setShowCropFrame(boolean z) {
        this.f13032u = z;
    }

    public void setShowCropGrid(boolean z) {
        this.f13033v = z;
    }

    public void setTargetAspectRatio(float f) {
        this.f13030s = f;
        if (this.f13024m > 0) {
            m25694h();
            postInvalidate();
            return;
        }
        this.f37723L = true;
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13022k = new RectF();
        this.f13023l = new RectF();
        this.f13031t = null;
        this.f13036y = new Path();
        this.f13037z = new Paint(1);
        this.f37712A = new Paint(1);
        this.f37713B = new Paint(1);
        this.f37714C = new Paint(1);
        this.f37715D = 0;
        this.f37716E = -1.0f;
        this.f37717F = -1.0f;
        this.f37718G = -1;
        this.f37719H = getResources().getDimensionPixelSize(C7582b.f16461d);
        this.f37720I = getResources().getDimensionPixelSize(C7582b.f16462e);
        this.f37721J = getResources().getDimensionPixelSize(C7582b.f16460c);
        m25698d();
    }
}
