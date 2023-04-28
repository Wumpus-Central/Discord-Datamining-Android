package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.d0 */
/* loaded from: classes6.dex */
class C5952d0 extends C5969l {

    /* renamed from: m */
    private float f11844m;

    /* renamed from: n */
    private float f11845n;

    /* renamed from: o */
    private float f11846o;

    /* renamed from: p */
    private float f11847p;

    /* renamed from: q */
    private String f11848q;

    /* renamed from: r */
    private int f11849r;

    public C5952d0(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5969l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        saveDefinition();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m26807k(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.f11848q != null) {
            float f4 = this.f11844m;
            float f5 = this.mScale;
            float f6 = this.f11845n;
            canvas.concat(C5990v0.m26557a(new RectF(f4 * f5, f6 * f5, (f4 + this.f11846o) * f5, (f6 + this.f11847p) * f5), new RectF(0.0f, 0.0f, f2, f3), this.f11848q, this.f11849r));
            super.draw(canvas, paint, f);
        }
    }

    public void setAlign(String str) {
        this.f11848q = str;
        invalidate();
    }

    public void setMeetOrSlice(int i) {
        this.f11849r = i;
        invalidate();
    }

    public void setMinX(float f) {
        this.f11844m = f;
        invalidate();
    }

    public void setMinY(float f) {
        this.f11845n = f;
        invalidate();
    }

    public void setVbHeight(float f) {
        this.f11847p = f;
        invalidate();
    }

    public void setVbWidth(float f) {
        this.f11846o = f;
        invalidate();
    }
}
