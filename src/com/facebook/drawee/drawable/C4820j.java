package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;
import p007a6.C1271b;

/* renamed from: com.facebook.drawee.drawable.j */
/* loaded from: classes7.dex */
public class C4820j extends AbstractC4824l {

    /* renamed from: N */
    private final Paint f37149N;

    /* renamed from: O */
    private final Paint f37150O;

    /* renamed from: P */
    private final Bitmap f37151P;

    /* renamed from: Q */
    private WeakReference<Bitmap> f37152Q;

    public C4820j(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f37149N = paint2;
        Paint paint3 = new Paint(1);
        this.f37150O = paint3;
        this.f37151P = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: k */
    private void m31811k() {
        WeakReference<Bitmap> weakReference = this.f37152Q;
        if (weakReference == null || weakReference.get() != this.f37151P) {
            this.f37152Q = new WeakReference<>(this.f37151P);
            Paint paint = this.f37149N;
            Bitmap bitmap = this.f37151P;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f7781p = true;
        }
        if (this.f7781p) {
            this.f37149N.getShader().setLocalMatrix(this.f37161H);
            this.f7781p = false;
        }
        this.f37149N.setFilterBitmap(m31802f());
    }

    @Override // com.facebook.drawee.drawable.AbstractC4824l, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("RoundedBitmapDrawable#draw");
        }
        if (!mo31800h()) {
            super.draw(canvas);
            if (C1271b.m41491d()) {
                C1271b.m41493b();
                return;
            }
            return;
        }
        m31798j();
        m31799i();
        m31811k();
        int save = canvas.save();
        canvas.concat(this.f37158E);
        canvas.drawPath(this.f7780o, this.f37149N);
        float f = this.f7779n;
        if (f > 0.0f) {
            this.f37150O.setStrokeWidth(f);
            this.f37150O.setColor(C4813d.m31833c(this.f7782q, this.f37149N.getAlpha()));
            canvas.drawPath(this.f7783r, this.f37150O);
        }
        canvas.restoreToCount(save);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.drawee.drawable.AbstractC4824l
    /* renamed from: h */
    public boolean mo31800h() {
        return super.mo31800h() && this.f37151P != null;
    }

    @Override // com.facebook.drawee.drawable.AbstractC4824l, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f37149N.getAlpha()) {
            this.f37149N.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4824l, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f37149N.setColorFilter(colorFilter);
    }
}
