package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.h */
/* loaded from: classes7.dex */
public class C4818h extends C4816f {

    /* renamed from: l */
    private int f7752l;

    /* renamed from: m */
    private int f7753m;

    /* renamed from: n */
    private final Matrix f7754n = new Matrix();

    /* renamed from: o */
    private final RectF f7755o = new RectF();

    /* renamed from: k */
    final Matrix f7751k = new Matrix();

    public C4818h(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f7752l = i - (i % 90);
        this.f7753m = (i2 < 0 || i2 > 8) ? 0 : i2;
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        if (this.f7752l > 0 || !((i = this.f7753m) == 0 || i == 1)) {
            int save = canvas.save();
            canvas.concat(this.f7751k);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = this.f7753m;
        if (i == 5 || i == 7 || this.f7752l % 180 != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = this.f7753m;
        if (i == 5 || i == 7 || this.f7752l % 180 != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.drawable.C4816f, com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        if (!this.f7751k.isIdentity()) {
            matrix.preConcat(this.f7751k);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i;
        Drawable current = getCurrent();
        int i2 = this.f7752l;
        if (i2 > 0 || !((i = this.f7753m) == 0 || i == 1)) {
            int i3 = this.f7753m;
            if (i3 == 2) {
                this.f7751k.setScale(-1.0f, 1.0f);
            } else if (i3 == 7) {
                this.f7751k.setRotate(270.0f, rect.centerX(), rect.centerY());
                this.f7751k.postScale(-1.0f, 1.0f);
            } else if (i3 == 4) {
                this.f7751k.setScale(1.0f, -1.0f);
            } else if (i3 != 5) {
                this.f7751k.setRotate(i2, rect.centerX(), rect.centerY());
            } else {
                this.f7751k.setRotate(270.0f, rect.centerX(), rect.centerY());
                this.f7751k.postScale(1.0f, -1.0f);
            }
            this.f7754n.reset();
            this.f7751k.invert(this.f7754n);
            this.f7755o.set(rect);
            this.f7754n.mapRect(this.f7755o);
            RectF rectF = this.f7755o;
            current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            return;
        }
        current.setBounds(rect);
    }
}
