package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p394w3.C13740j;

/* renamed from: com.facebook.drawee.drawable.a */
/* loaded from: classes7.dex */
public class C4810a extends Drawable implements Drawable.Callback, TransformCallback, AbstractC4827o {

    /* renamed from: k */
    private TransformCallback f7725k;

    /* renamed from: m */
    private final Drawable[] f7727m;

    /* renamed from: n */
    private final AbstractC4812c[] f7728n;

    /* renamed from: l */
    private final DrawableProperties f7726l = new DrawableProperties();

    /* renamed from: o */
    private final Rect f7729o = new Rect();

    /* renamed from: p */
    private boolean f7730p = false;

    /* renamed from: q */
    private boolean f7731q = false;

    /* renamed from: r */
    private boolean f7732r = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.drawee.drawable.a$a */
    /* loaded from: classes7.dex */
    public class C0113a implements AbstractC4812c {

        /* renamed from: k */
        final /* synthetic */ int f7733k;

        C0113a(int i) {
            this.f7733k = i;
        }

        @Override // com.facebook.drawee.drawable.AbstractC4812c
        public Drawable getDrawable() {
            return C4810a.this.m31841b(this.f7733k);
        }

        @Override // com.facebook.drawee.drawable.AbstractC4812c
        public Drawable setDrawable(Drawable drawable) {
            return C4810a.this.m31838e(this.f7733k, drawable);
        }
    }

    public C4810a(Drawable[] drawableArr) {
        int i = 0;
        C13740j.m2834g(drawableArr);
        this.f7727m = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f7727m;
            if (i < drawableArr2.length) {
                C4813d.m31832d(drawableArr2[i], this, this);
                i++;
            } else {
                this.f7728n = new AbstractC4812c[drawableArr2.length];
                return;
            }
        }
    }

    /* renamed from: a */
    private AbstractC4812c m31842a(int i) {
        return new C0113a(i);
    }

    /* renamed from: b */
    public Drawable m31841b(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        if (i >= this.f7727m.length) {
            z2 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z2));
        return this.f7727m[i];
    }

    /* renamed from: c */
    public AbstractC4812c m31840c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        if (i >= this.f7728n.length) {
            z2 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z2));
        AbstractC4812c[] cVarArr = this.f7728n;
        if (cVarArr[i] == null) {
            cVarArr[i] = m31842a(i);
        }
        return this.f7728n[i];
    }

    /* renamed from: d */
    public int m31839d() {
        return this.f7727m.length;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public Drawable m31838e(int i, Drawable drawable) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        if (i >= this.f7727m.length) {
            z2 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z2));
        Drawable drawable2 = this.f7727m[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f7732r) {
                drawable.mutate();
            }
            C4813d.m31832d(this.f7727m[i], null, null);
            C4813d.m31832d(drawable, null, null);
            C4813d.m31831e(drawable, this.f7726l);
            C4813d.m31835a(drawable, this);
            C4813d.m31832d(drawable, this, this);
            this.f7731q = false;
            this.f7727m[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f7727m.length == 0) {
            return -2;
        }
        int i = 1;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i >= drawableArr.length) {
                return i2;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Drawable.resolveOpacity(i2, drawable.getOpacity());
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f7729o;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getRootBounds(RectF rectF) {
        TransformCallback transformCallback = this.f7725k;
        if (transformCallback != null) {
            transformCallback.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix matrix) {
        TransformCallback transformCallback = this.f7725k;
        if (transformCallback != null) {
            transformCallback.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f7731q) {
            this.f7730p = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f7727m;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f7730p;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f7730p = z2 | z;
                i++;
            }
            this.f7731q = true;
        }
        return this.f7730p;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.f7732r = true;
                return this;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f7726l.m31851b(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7726l.m31850c(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f7726l.m31849d(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f7726l.m31848e(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4827o
    public void setTransformCallback(TransformCallback transformCallback) {
        this.f7725k = transformCallback;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f7727m;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
