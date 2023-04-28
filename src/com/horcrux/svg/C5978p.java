package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.p */
/* loaded from: classes6.dex */
public class C5978p extends C5969l {

    /* renamed from: m */
    private SVGLength f12001m;

    /* renamed from: n */
    private SVGLength f12002n;

    /* renamed from: o */
    private SVGLength f12003o;

    /* renamed from: p */
    private SVGLength f12004p;

    /* renamed from: q */
    private String f12005q;

    /* renamed from: r */
    private String f12006r;

    /* renamed from: s */
    private float f12007s;

    /* renamed from: t */
    private float f12008t;

    /* renamed from: u */
    private float f12009u;

    /* renamed from: v */
    private float f12010v;

    /* renamed from: w */
    String f12011w;

    /* renamed from: x */
    int f12012x;

    /* renamed from: y */
    Matrix f12013y = new Matrix();

    public C5978p(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m26674k(Canvas canvas, Paint paint, float f, C5994y yVar, float f2) {
        double d;
        int saveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.f12013y.reset();
        C5991w wVar = yVar.f12089b;
        this.f12013y.setTranslate((float) wVar.f12078a, (float) wVar.f12079b);
        if ("auto".equals(this.f12006r)) {
            d = -1.0d;
        } else {
            d = Double.parseDouble(this.f12006r);
        }
        if (d == -1.0d) {
            d = yVar.f12090c;
        }
        this.f12013y.preRotate(((float) d) + 180.0f);
        if ("strokeWidth".equals(this.f12005q)) {
            Matrix matrix = this.f12013y;
            float f3 = this.mScale;
            matrix.preScale(f2 / f3, f2 / f3);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) (relativeOnWidth(this.f12003o) / this.mScale), (float) (relativeOnHeight(this.f12004p) / this.mScale));
        if (this.f12011w != null) {
            float f4 = this.f12007s;
            float f5 = this.mScale;
            float f6 = this.f12008t;
            Matrix a = C5990v0.m26557a(new RectF(f4 * f5, f6 * f5, (f4 + this.f12009u) * f5, (f6 + this.f12010v) * f5), rectF, this.f12011w, this.f12012x);
            float[] fArr = new float[9];
            a.getValues(fArr);
            this.f12013y.preScale(fArr[0], fArr[4]);
        }
        this.f12013y.preTranslate((float) (-relativeOnWidth(this.f12001m)), (float) (-relativeOnHeight(this.f12002n)));
        canvas.concat(this.f12013y);
        mo26730a(canvas, paint, f);
        restoreCanvas(canvas, saveAndSetupCanvas);
    }

    /* renamed from: l */
    public void m26673l(Dynamic dynamic) {
        this.f12004p = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: m */
    public void m26672m(Double d) {
        this.f12004p = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: n */
    public void m26671n(String str) {
        this.f12004p = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: o */
    public void m26670o(String str) {
        this.f12005q = str;
        invalidate();
    }

    /* renamed from: p */
    public void m26669p(Dynamic dynamic) {
        this.f12003o = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: q */
    public void m26668q(Double d) {
        this.f12003o = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: r */
    public void m26667r(String str) {
        this.f12003o = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: s */
    public void m26666s(String str) {
        this.f12006r = str;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5969l, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    public void setAlign(String str) {
        this.f12011w = str;
        invalidate();
    }

    public void setMeetOrSlice(int i) {
        this.f12012x = i;
        invalidate();
    }

    public void setMinX(float f) {
        this.f12007s = f;
        invalidate();
    }

    public void setMinY(float f) {
        this.f12008t = f;
        invalidate();
    }

    public void setVbHeight(float f) {
        this.f12010v = f;
        invalidate();
    }

    public void setVbWidth(float f) {
        this.f12009u = f;
        invalidate();
    }

    /* renamed from: t */
    public void m26665t(Dynamic dynamic) {
        this.f12001m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: u */
    public void m26664u(Double d) {
        this.f12001m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: v */
    public void m26663v(String str) {
        this.f12001m = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: w */
    public void m26662w(Dynamic dynamic) {
        this.f12002n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: x */
    public void m26661x(Double d) {
        this.f12002n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: y */
    public void m26660y(String str) {
        this.f12002n = SVGLength.m26887e(str);
        invalidate();
    }
}
