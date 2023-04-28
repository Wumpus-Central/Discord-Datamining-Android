package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import lb.C10395a;

/* renamed from: com.google.android.material.progressindicator.c */
/* loaded from: classes3.dex */
final class C5677c extends AbstractC5689h<C5682e> {

    /* renamed from: c */
    private int f11100c = 1;

    /* renamed from: d */
    private float f11101d;

    /* renamed from: e */
    private float f11102e;

    /* renamed from: f */
    private float f11103f;

    public C5677c(C5682e eVar) {
        super(eVar);
    }

    /* renamed from: h */
    private void m27796h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f11103f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    /* renamed from: i */
    private int m27795i() {
        S s = this.f11140a;
        return ((C5682e) s).f11119g + (((C5682e) s).f11120h * 2);
    }

    @Override // com.google.android.material.progressindicator.AbstractC5689h
    /* renamed from: a */
    public void mo27752a(Canvas canvas, float f) {
        S s;
        int i;
        S s2 = this.f11140a;
        float f2 = (((C5682e) s2).f11119g / 2.0f) + ((C5682e) s2).f11120h;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        if (((C5682e) this.f11140a).f11121i == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.f11100c = i;
        this.f11101d = ((C5682e) s).f11094a * f;
        this.f11102e = ((C5682e) s).f11095b * f;
        this.f11103f = (((C5682e) s).f11119g - ((C5682e) s).f11094a) / 2.0f;
        if ((this.f11141b.mo27735j() && ((C5682e) this.f11140a).f11098e == 2) || (this.f11141b.mo27736i() && ((C5682e) this.f11140a).f11099f == 1)) {
            this.f11103f += ((1.0f - f) * ((C5682e) this.f11140a).f11094a) / 2.0f;
        } else if ((this.f11141b.mo27735j() && ((C5682e) this.f11140a).f11098e == 1) || (this.f11141b.mo27736i() && ((C5682e) this.f11140a).f11099f == 2)) {
            this.f11103f -= ((1.0f - f) * ((C5682e) this.f11140a).f11094a) / 2.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC5689h
    /* renamed from: b */
    public void mo27751b(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f11101d);
            int i2 = this.f11100c;
            float f4 = f * 360.0f * i2;
            if (f2 >= f) {
                f3 = f2 - f;
            } else {
                f3 = (1.0f + f2) - f;
            }
            float f5 = f3 * 360.0f * i2;
            float f6 = this.f11103f;
            canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
            if (this.f11102e > 0.0f && Math.abs(f5) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                m27796h(canvas, paint, this.f11101d, this.f11102e, f4);
                m27796h(canvas, paint, this.f11101d, this.f11102e, f4 + f5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC5689h
    /* renamed from: c */
    public void mo27750c(Canvas canvas, Paint paint) {
        int a = C10395a.m13520a(((C5682e) this.f11140a).f11097d, this.f11141b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.f11101d);
        float f = this.f11103f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.AbstractC5689h
    /* renamed from: d */
    public int mo27749d() {
        return m27795i();
    }

    @Override // com.google.android.material.progressindicator.AbstractC5689h
    /* renamed from: e */
    public int mo27748e() {
        return m27795i();
    }
}
