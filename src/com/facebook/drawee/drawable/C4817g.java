package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.g */
/* loaded from: classes7.dex */
public class C4817g extends C4816f {

    /* renamed from: k */
    private Matrix f7747k;

    /* renamed from: l */
    private Matrix f7748l;

    /* renamed from: m */
    private int f7749m;

    /* renamed from: n */
    private int f7750n;

    /* renamed from: h */
    private void m31813h() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f7749m = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f7750n = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f7748l = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f7748l = this.f7747k;
    }

    /* renamed from: i */
    private void m31812i() {
        if (this.f7749m != getCurrent().getIntrinsicWidth() || this.f7750n != getCurrent().getIntrinsicHeight()) {
            m31813h();
        }
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m31812i();
        if (this.f7748l != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f7748l);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.drawable.C4816f, com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix matrix) {
        super.getTransform(matrix);
        Matrix matrix2 = this.f7748l;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m31813h();
    }

    @Override // com.facebook.drawee.drawable.C4816f
    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m31813h();
        return current;
    }
}
