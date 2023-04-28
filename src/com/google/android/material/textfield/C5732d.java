package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import p422xb.C14038g;
import p422xb.C14045k;

/* renamed from: com.google.android.material.textfield.d */
/* loaded from: classes3.dex */
class C5732d extends C14038g {

    /* renamed from: J */
    private final Paint f37605J;

    /* renamed from: K */
    private final RectF f37606K;

    C5732d() {
        this(null);
    }

    /* renamed from: p0 */
    private void m27557p0() {
        this.f37605J.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f37605J.setColor(-1);
        this.f37605J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public boolean m27561l0() {
        return !this.f37606K.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void m27560m0() {
        m27559n0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: n0 */
    void m27559n0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f37606K;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void m27558o0(RectF rectF) {
        m27559n0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p422xb.C14038g
    /* renamed from: r */
    public void mo1952r(Canvas canvas) {
        if (this.f37606K.isEmpty()) {
            super.mo1952r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f37606K);
        } else {
            canvas.clipRect(this.f37606K, Region.Op.DIFFERENCE);
        }
        super.mo1952r(canvas);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5732d(C14045k kVar) {
        super(kVar == null ? new C14045k() : kVar);
        this.f37605J = new Paint(1);
        m27557p0();
        this.f37606K = new RectF();
    }
}
