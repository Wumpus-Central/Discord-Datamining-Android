package p062d9;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p062d9.C6406a;

/* renamed from: d9.i */
/* loaded from: classes5.dex */
class View$OnTouchListenerC6416i extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C6406a.AbstractC0189a {

    /* renamed from: m */
    private final AbstractC6417a f13460m;

    /* renamed from: n */
    private final float f13461n;

    /* renamed from: o */
    private final GestureDetector f13462o;

    /* renamed from: q */
    private AbstractC6411e f13464q;

    /* renamed from: k */
    private final PointF f13458k = new PointF();

    /* renamed from: l */
    private final PointF f13459l = new PointF();

    /* renamed from: p */
    private volatile float f13463p = 3.1415927f;

    /* renamed from: d9.i$a */
    /* loaded from: classes5.dex */
    interface AbstractC6417a {
        /* renamed from: b */
        void mo25579b(PointF pointF);
    }

    public View$OnTouchListenerC6416i(Context context, AbstractC6417a aVar, float f) {
        this.f13460m = aVar;
        this.f13461n = f;
        this.f13462o = new GestureDetector(context, this);
    }

    @Override // p062d9.C6406a.AbstractC0189a
    /* renamed from: a */
    public void mo25581a(float[] fArr, float f) {
        this.f13463p = -f;
    }

    /* renamed from: b */
    public void m25580b(AbstractC6411e eVar) {
        this.f13464q = eVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f13458k.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f13458k.x) / this.f13461n;
        float y = motionEvent2.getY();
        PointF pointF = this.f13458k;
        float f3 = (y - pointF.y) / this.f13461n;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f13463p;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f13459l;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = pointF2.y + (sin * x) + (cos * f3);
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        this.f13460m.mo25579b(this.f13459l);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        AbstractC6411e eVar = this.f13464q;
        if (eVar != null) {
            return eVar.onSingleTapUp(motionEvent);
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f13462o.onTouchEvent(motionEvent);
    }
}
