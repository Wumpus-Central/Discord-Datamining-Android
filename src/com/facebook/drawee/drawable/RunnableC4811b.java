package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import p394w3.C13740j;

/* renamed from: com.facebook.drawee.drawable.b */
/* loaded from: classes7.dex */
public class RunnableC4811b extends C4816f implements Runnable {

    /* renamed from: k */
    private int f7735k;

    /* renamed from: l */
    private boolean f7736l;

    /* renamed from: m */
    float f7737m;

    /* renamed from: n */
    private boolean f7738n;

    public RunnableC4811b(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    /* renamed from: h */
    private int m31837h() {
        return (int) ((20.0f / this.f7735k) * 360.0f);
    }

    /* renamed from: i */
    private void m31836i() {
        if (!this.f7738n) {
            this.f7738n = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = i - i2;
        int i4 = bounds.bottom;
        int i5 = bounds.top;
        int i6 = i4 - i5;
        float f = this.f7737m;
        if (!this.f7736l) {
            f = 360.0f - f;
        }
        canvas.rotate(f, i2 + (i3 / 2), i5 + (i6 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        m31836i();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7738n = false;
        this.f7737m += m31837h();
        invalidateSelf();
    }

    public RunnableC4811b(Drawable drawable, int i, boolean z) {
        super((Drawable) C13740j.m2834g(drawable));
        this.f7737m = 0.0f;
        this.f7738n = false;
        this.f7735k = i;
        this.f7736l = z;
    }
}
