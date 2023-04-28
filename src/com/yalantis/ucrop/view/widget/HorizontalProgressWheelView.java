package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.C2337a;
import gf.C7581a;
import gf.C7582b;

/* loaded from: classes8.dex */
public class HorizontalProgressWheelView extends View {

    /* renamed from: k */
    private final Rect f13084k;

    /* renamed from: l */
    private AbstractC6378a f13085l;

    /* renamed from: m */
    private float f13086m;

    /* renamed from: n */
    private Paint f13087n;

    /* renamed from: o */
    private Paint f13088o;

    /* renamed from: p */
    private int f13089p;

    /* renamed from: q */
    private int f13090q;

    /* renamed from: r */
    private int f13091r;

    /* renamed from: s */
    private boolean f13092s;

    /* renamed from: t */
    private float f13093t;

    /* renamed from: u */
    private int f13094u;

    /* renamed from: com.yalantis.ucrop.view.widget.HorizontalProgressWheelView$a */
    /* loaded from: classes8.dex */
    public interface AbstractC6378a {
        /* renamed from: a */
        void mo25647a();

        /* renamed from: b */
        void mo25646b();

        /* renamed from: c */
        void mo25645c(float f, float f2);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m25649a() {
        this.f13094u = C2337a.m38135c(getContext(), C7581a.f16457m);
        this.f13089p = getContext().getResources().getDimensionPixelSize(C7582b.f16466i);
        this.f13090q = getContext().getResources().getDimensionPixelSize(C7582b.f16463f);
        this.f13091r = getContext().getResources().getDimensionPixelSize(C7582b.f16464g);
        Paint paint = new Paint(1);
        this.f13087n = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f13087n.setStrokeWidth(this.f13089p);
        this.f13087n.setColor(getResources().getColor(C7581a.f16451g));
        Paint paint2 = new Paint(this.f13087n);
        this.f13088o = paint2;
        paint2.setColor(this.f13094u);
        this.f13088o.setStrokeCap(Paint.Cap.ROUND);
        this.f13088o.setStrokeWidth(getContext().getResources().getDimensionPixelSize(C7582b.f16467j));
    }

    /* renamed from: b */
    private void m25648b(MotionEvent motionEvent, float f) {
        this.f13093t -= f;
        postInvalidate();
        this.f13086m = motionEvent.getX();
        AbstractC6378a aVar = this.f13085l;
        if (aVar != null) {
            aVar.mo25645c(-f, this.f13093t);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.f13084k);
        int width = this.f13084k.width();
        int i = this.f13089p;
        int i2 = this.f13091r;
        int i3 = width / (i + i2);
        float f = this.f13093t % (i2 + i);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i3 / 4;
            if (i4 < i5) {
                this.f13087n.setAlpha((int) ((i4 / i5) * 255.0f));
            } else if (i4 > (i3 * 3) / 4) {
                this.f13087n.setAlpha((int) (((i3 - i4) / i5) * 255.0f));
            } else {
                this.f13087n.setAlpha(255);
            }
            float f2 = -f;
            Rect rect = this.f13084k;
            float f3 = rect.left + f2 + ((this.f13089p + this.f13091r) * i4);
            float centerY = rect.centerY() - (this.f13090q / 4.0f);
            Rect rect2 = this.f13084k;
            canvas.drawLine(f3, centerY, f2 + rect2.left + ((this.f13089p + this.f13091r) * i4), rect2.centerY() + (this.f13090q / 4.0f), this.f13087n);
        }
        canvas.drawLine(this.f13084k.centerX(), this.f13084k.centerY() - (this.f13090q / 2.0f), this.f13084k.centerX(), (this.f13090q / 2.0f) + this.f13084k.centerY(), this.f13088o);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13086m = motionEvent.getX();
        } else if (action == 1) {
            AbstractC6378a aVar = this.f13085l;
            if (aVar != null) {
                this.f13092s = false;
                aVar.mo25647a();
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f13086m;
            if (x != 0.0f) {
                if (!this.f13092s) {
                    this.f13092s = true;
                    AbstractC6378a aVar2 = this.f13085l;
                    if (aVar2 != null) {
                        aVar2.mo25646b();
                    }
                }
                m25648b(motionEvent, x);
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i) {
        this.f13094u = i;
        this.f13088o.setColor(i);
        invalidate();
    }

    public void setScrollingListener(AbstractC6378a aVar) {
        this.f13085l = aVar;
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13084k = new Rect();
        m25649a();
    }
}
