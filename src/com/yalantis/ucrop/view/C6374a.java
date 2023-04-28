package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import com.yalantis.ucrop.task.BitmapCropTask;
import com.yalantis.ucrop.view.C6376b;
import gf.C7588h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p001if.b;
import p001if.d;
import p139hf.AbstractC8010a;
import p139hf.AbstractC8012c;
import p200kf.C9855b;
import p200kf.C9863g;

/* renamed from: com.yalantis.ucrop.view.a */
/* loaded from: classes8.dex */
public class C6374a extends C6376b {

    /* renamed from: A */
    private final Matrix f37724A;

    /* renamed from: B */
    private float f37725B;

    /* renamed from: C */
    private float f37726C;

    /* renamed from: D */
    private AbstractC8012c f37727D;

    /* renamed from: E */
    private Runnable f37728E;

    /* renamed from: F */
    private Runnable f37729F;

    /* renamed from: G */
    private float f37730G;

    /* renamed from: H */
    private float f37731H;

    /* renamed from: I */
    private int f37732I;

    /* renamed from: J */
    private int f37733J;

    /* renamed from: K */
    private long f37734K;

    /* renamed from: z */
    private final RectF f13042z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yalantis.ucrop.view.a$a */
    /* loaded from: classes8.dex */
    public static class RunnableC0187a implements Runnable {

        /* renamed from: k */
        private final WeakReference<C6374a> f13043k;

        /* renamed from: l */
        private final long f13044l;

        /* renamed from: m */
        private final long f13045m = System.currentTimeMillis();

        /* renamed from: n */
        private final float f13046n;

        /* renamed from: o */
        private final float f13047o;

        /* renamed from: p */
        private final float f13048p;

        /* renamed from: q */
        private final float f13049q;

        /* renamed from: r */
        private final float f13050r;

        /* renamed from: s */
        private final float f13051s;

        /* renamed from: t */
        private final boolean f13052t;

        public RunnableC0187a(C6374a aVar, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.f13043k = new WeakReference<>(aVar);
            this.f13044l = j;
            this.f13046n = f;
            this.f13047o = f2;
            this.f13048p = f3;
            this.f13049q = f4;
            this.f13050r = f5;
            this.f13051s = f6;
            this.f13052t = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6374a aVar = this.f13043k.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f13044l, System.currentTimeMillis() - this.f13045m);
                float b = C9855b.m15189b(min, 0.0f, this.f13048p, (float) this.f13044l);
                float b2 = C9855b.m15189b(min, 0.0f, this.f13049q, (float) this.f13044l);
                float a = C9855b.m15190a(min, 0.0f, this.f13051s, (float) this.f13044l);
                if (min < ((float) this.f13044l)) {
                    float[] fArr = aVar.f13061l;
                    aVar.m25661m(b - (fArr[0] - this.f13046n), b2 - (fArr[1] - this.f13047o));
                    if (!this.f13052t) {
                        aVar.m25685D(this.f13050r + a, aVar.f13042z.centerX(), aVar.f13042z.centerY());
                    }
                    if (!aVar.m25676v()) {
                        aVar.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.a$b */
    /* loaded from: classes8.dex */
    private static class RunnableC6375b implements Runnable {

        /* renamed from: k */
        private final WeakReference<C6374a> f13053k;

        /* renamed from: l */
        private final long f13054l;

        /* renamed from: m */
        private final long f13055m = System.currentTimeMillis();

        /* renamed from: n */
        private final float f13056n;

        /* renamed from: o */
        private final float f13057o;

        /* renamed from: p */
        private final float f13058p;

        /* renamed from: q */
        private final float f13059q;

        public RunnableC6375b(C6374a aVar, long j, float f, float f2, float f3, float f4) {
            this.f13053k = new WeakReference<>(aVar);
            this.f13054l = j;
            this.f13056n = f;
            this.f13057o = f2;
            this.f13058p = f3;
            this.f13059q = f4;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6374a aVar = this.f13053k.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f13054l, System.currentTimeMillis() - this.f13055m);
                float a = C9855b.m15190a(min, 0.0f, this.f13057o, (float) this.f13054l);
                if (min < ((float) this.f13054l)) {
                    aVar.m25685D(this.f13056n + a, this.f13058p, this.f13059q);
                    aVar.post(this);
                    return;
                }
                aVar.m25672z();
            }
        }
    }

    public C6374a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    private void m25688A(float f, float f2) {
        float width = this.f13042z.width();
        float height = this.f13042z.height();
        float max = Math.max(this.f13042z.width() / f, this.f13042z.height() / f2);
        RectF rectF = this.f13042z;
        float f3 = ((height - (f2 * max)) / 2.0f) + rectF.top;
        this.f13063n.reset();
        this.f13063n.postScale(max, max);
        this.f13063n.postTranslate(((width - (f * max)) / 2.0f) + rectF.left, f3);
        setImageMatrix(this.f13063n);
    }

    /* renamed from: q */
    private float[] m25681q() {
        this.f37724A.reset();
        this.f37724A.setRotate(-getCurrentAngle());
        float[] fArr = this.f13060k;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] b = C9863g.m15167b(this.f13042z);
        this.f37724A.mapPoints(copyOf);
        this.f37724A.mapPoints(b);
        RectF d = C9863g.m15165d(copyOf);
        RectF d2 = C9863g.m15165d(b);
        float f = d.left - d2.left;
        float f2 = d.top - d2.top;
        float f3 = d.right - d2.right;
        float f4 = d.bottom - d2.bottom;
        float[] fArr2 = new float[4];
        if (f <= 0.0f) {
            f = 0.0f;
        }
        fArr2[0] = f;
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        fArr2[1] = f2;
        if (f3 >= 0.0f) {
            f3 = 0.0f;
        }
        fArr2[2] = f3;
        if (f4 >= 0.0f) {
            f4 = 0.0f;
        }
        fArr2[3] = f4;
        this.f37724A.reset();
        this.f37724A.setRotate(getCurrentAngle());
        this.f37724A.mapPoints(fArr2);
        return fArr2;
    }

    /* renamed from: r */
    private void m25680r() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            m25679s(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    /* renamed from: s */
    private void m25679s(float f, float f2) {
        float min = Math.min(Math.min(this.f13042z.width() / f, this.f13042z.width() / f2), Math.min(this.f13042z.height() / f2, this.f13042z.height() / f));
        this.f37731H = min;
        this.f37730G = min * this.f37726C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public void m25687B(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float currentScale = getCurrentScale();
        RunnableC6375b bVar = new RunnableC6375b(this, j, currentScale, f - currentScale, f2, f3);
        this.f37729F = bVar;
        post(bVar);
    }

    /* renamed from: C */
    public void m25686C(float f) {
        m25685D(f, this.f13042z.centerX(), this.f13042z.centerY());
    }

    /* renamed from: D */
    public void m25685D(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            mo25662l(f / getCurrentScale(), f2, f3);
        }
    }

    /* renamed from: E */
    public void m25684E(float f) {
        m25683F(f, this.f13042z.centerX(), this.f13042z.centerY());
    }

    /* renamed from: F */
    public void m25683F(float f, float f2, float f3) {
        if (f >= getMinScale()) {
            mo25662l(f / getCurrentScale(), f2, f3);
        }
    }

    public AbstractC8012c getCropBoundsChangeListener() {
        return this.f37727D;
    }

    public float getMaxScale() {
        return this.f37730G;
    }

    public float getMinScale() {
        return this.f37731H;
    }

    public float getTargetAspectRatio() {
        return this.f37725B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yalantis.ucrop.view.C6376b
    /* renamed from: j */
    public void mo25664j() {
        int i;
        int i2;
        int i3;
        super.mo25664j();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            if (this.f37725B == 0.0f) {
                this.f37725B = intrinsicWidth / intrinsicHeight;
            }
            int i4 = this.f13064o;
            float f = this.f37725B;
            int i5 = (int) (i4 / f);
            int i6 = this.f13065p;
            if (i5 > i6) {
                this.f13042z.set((i4 - ((int) (i6 * f))) / 2, 0.0f, i2 + i3, i6);
            } else {
                this.f13042z.set(0.0f, (i6 - i5) / 2, i4, i5 + i);
            }
            m25679s(intrinsicWidth, intrinsicHeight);
            m25688A(intrinsicWidth, intrinsicHeight);
            AbstractC8012c cVar = this.f37727D;
            if (cVar != null) {
                cVar.mo20857a(this.f37725B);
            }
            C6376b.AbstractC0188b bVar = this.f13066q;
            if (bVar != null) {
                bVar.mo25656c(getCurrentScale());
                this.f13066q.mo25655d(getCurrentAngle());
            }
        }
    }

    @Override // com.yalantis.ucrop.view.C6376b
    /* renamed from: l */
    public void mo25662l(float f, float f2, float f3) {
        if (f > 1.0f && getCurrentScale() * f <= getMaxScale()) {
            super.mo25662l(f, f2, f3);
        } else if (f < 1.0f && getCurrentScale() * f >= getMinScale()) {
            super.mo25662l(f, f2, f3);
        }
    }

    public void setCropBoundsChangeListener(AbstractC8012c cVar) {
        this.f37727D = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.f37725B = rectF.width() / rectF.height();
        this.f13042z.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        m25680r();
        m25672z();
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        float f2;
        float f3;
        if (this.f13070u && !m25676v()) {
            float[] fArr = this.f13061l;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float currentScale = getCurrentScale();
            float centerX = this.f13042z.centerX() - f4;
            float centerY = this.f13042z.centerY() - f5;
            this.f37724A.reset();
            this.f37724A.setTranslate(centerX, centerY);
            float[] fArr2 = this.f13060k;
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            this.f37724A.mapPoints(copyOf);
            boolean w = m25675w(copyOf);
            if (w) {
                float[] q = m25681q();
                f2 = -(q[1] + q[3]);
                f3 = -(q[0] + q[2]);
                f = 0.0f;
            } else {
                RectF rectF = new RectF(this.f13042z);
                this.f37724A.reset();
                this.f37724A.setRotate(getCurrentAngle());
                this.f37724A.mapRect(rectF);
                float[] c = C9863g.m15166c(this.f13060k);
                f3 = centerX;
                f = (Math.max(rectF.width() / c[0], rectF.height() / c[1]) * currentScale) - currentScale;
                f2 = centerY;
            }
            if (z) {
                RunnableC0187a aVar = new RunnableC0187a(this, this.f37734K, f4, f5, f3, f2, currentScale, f, w);
                this.f37728E = aVar;
                post(aVar);
                return;
            }
            m25661m(f3, f2);
            if (!w) {
                m25685D(currentScale + f, this.f13042z.centerX(), this.f13042z.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j) {
        if (j > 0) {
            this.f37734K = j;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxResultImageSizeX(int i) {
        this.f37732I = i;
    }

    public void setMaxResultImageSizeY(int i) {
        this.f37733J = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.f37726C = f;
    }

    public void setTargetAspectRatio(float f) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.f37725B = f;
            return;
        }
        if (f == 0.0f) {
            this.f37725B = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        } else {
            this.f37725B = f;
        }
        AbstractC8012c cVar = this.f37727D;
        if (cVar != null) {
            cVar.mo20857a(this.f37725B);
        }
    }

    /* renamed from: t */
    public void m25678t() {
        removeCallbacks(this.f37728E);
        removeCallbacks(this.f37729F);
    }

    /* renamed from: u */
    public void m25677u(Bitmap.CompressFormat compressFormat, int i, AbstractC8010a aVar) {
        m25678t();
        setImageToWrapCropBounds(false);
        new BitmapCropTask(getViewBitmap(), new d(this.f13042z, C9863g.m15165d(this.f13060k), getCurrentScale(), getCurrentAngle()), new b(this.f37732I, this.f37733J, compressFormat, i, getImageInputPath(), getImageOutputPath(), getExifInfo()), aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: v */
    protected boolean m25676v() {
        return m25675w(this.f13060k);
    }

    /* renamed from: w */
    protected boolean m25675w(float[] fArr) {
        this.f37724A.reset();
        this.f37724A.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.f37724A.mapPoints(copyOf);
        float[] b = C9863g.m15167b(this.f13042z);
        this.f37724A.mapPoints(b);
        return C9863g.m15165d(copyOf).contains(C9863g.m15165d(b));
    }

    /* renamed from: x */
    public void m25674x(float f) {
        m25663k(f, this.f13042z.centerX(), this.f13042z.centerY());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public void m25673y(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(C7588h.f38393V, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(C7588h.f38394W, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.f37725B = 0.0f;
        } else {
            this.f37725B = abs / abs2;
        }
    }

    /* renamed from: z */
    public void m25672z() {
        setImageToWrapCropBounds(true);
    }

    public C6374a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13042z = new RectF();
        this.f37724A = new Matrix();
        this.f37726C = 10.0f;
        this.f37729F = null;
        this.f37732I = 0;
        this.f37733J = 0;
        this.f37734K = 500L;
    }
}
