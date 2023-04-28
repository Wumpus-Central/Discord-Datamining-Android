package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.i */
/* loaded from: classes6.dex */
public class C5963i extends C5969l {

    /* renamed from: m */
    SVGLength f11887m;

    /* renamed from: n */
    SVGLength f11888n;

    /* renamed from: o */
    SVGLength f11889o;

    /* renamed from: p */
    SVGLength f11890p;

    /* renamed from: q */
    Bitmap f11891q = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);

    /* renamed from: r */
    Canvas f11892r = new Canvas(this.f11891q);

    public C5963i(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5969l
    /* renamed from: a */
    public void mo26730a(Canvas canvas, Paint paint, float f) {
        mo26603g();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C5980q)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!ViewProps.NONE.equals(virtualView.mDisplay)) {
                        boolean z = virtualView instanceof RenderableView;
                        if (z) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, saveAndSetupCanvas);
                        if (z) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    childAt.draw(canvas);
                }
            }
        }
        setClientRect(rectF);
        mo26726f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f11892r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5969l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        canvas.translate((float) relativeOnWidth(this.f11887m), (float) relativeOnHeight(this.f11888n));
        canvas.clipRect(0.0f, 0.0f, (float) relativeOnWidth(this.f11889o), (float) relativeOnHeight(this.f11890p));
        super.draw(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(this.f11892r, view, j);
    }

    /* renamed from: k */
    public void m26764k(Dynamic dynamic) {
        this.f11890p = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: l */
    public void m26763l(Double d) {
        this.f11890p = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: m */
    public void m26762m(String str) {
        this.f11890p = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: n */
    public void m26761n(Dynamic dynamic) {
        this.f11889o = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: o */
    public void m26760o(Double d) {
        this.f11889o = SVGLength.m26888d(d);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    /* renamed from: p */
    public void m26759p(String str) {
        this.f11889o = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: q */
    public void m26758q(Dynamic dynamic) {
        this.f11887m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: r */
    public void m26757r(Double d) {
        this.f11887m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: s */
    public void m26756s(String str) {
        this.f11887m = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: t */
    public void m26755t(Dynamic dynamic) {
        this.f11888n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: u */
    public void m26754u(Double d) {
        this.f11888n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: v */
    public void m26753v(String str) {
        this.f11888n = SVGLength.m26887e(str);
        invalidate();
    }
}
