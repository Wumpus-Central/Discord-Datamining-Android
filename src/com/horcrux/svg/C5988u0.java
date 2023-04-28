package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import p414x3.C13925a;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.u0 */
/* loaded from: classes6.dex */
public class C5988u0 extends RenderableView {

    /* renamed from: k */
    private String f12059k;

    /* renamed from: l */
    private SVGLength f12060l;

    /* renamed from: m */
    private SVGLength f12061m;

    /* renamed from: n */
    private SVGLength f12062n;

    /* renamed from: o */
    private SVGLength f12063o;

    public C5988u0(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public void m26585a(Dynamic dynamic) {
        this.f12063o = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: b */
    public void m26584b(Double d) {
        this.f12063o = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: c */
    public void m26583c(String str) {
        this.f12063o = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: d */
    public void m26582d(String str) {
        this.f12059k = str;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f12059k);
        if (definedTemplate == null) {
            C13925a.m2304H(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f12059k + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f12060l), (float) relativeOnHeight(this.f12061m));
        boolean z = definedTemplate instanceof RenderableView;
        if (z) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int saveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof C5952d0) {
            ((C5952d0) definedTemplate).m26807k(canvas, paint, f, (float) relativeOnWidth(this.f12062n), (float) relativeOnHeight(this.f12063o));
        } else {
            definedTemplate.draw(canvas, paint, f * this.mOpacity);
        }
        setClientRect(definedTemplate.getClientRect());
        definedTemplate.restoreCanvas(canvas, saveAndSetupCanvas);
        if (z) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    /* renamed from: e */
    public void m26581e(Dynamic dynamic) {
        this.f12062n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: f */
    public void m26580f(Double d) {
        this.f12062n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: g */
    public void m26579g(String str) {
        this.f12062n = SVGLength.m26887e(str);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f12059k);
        if (definedTemplate == null) {
            C13925a.m2304H(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f12059k + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f12060l), (float) relativeOnHeight(this.f12061m));
        path.transform(matrix, path2);
        return path2;
    }

    /* renamed from: h */
    public void m26578h(Dynamic dynamic) {
        this.f12060l = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f12059k);
            if (definedTemplate == null) {
                C13925a.m2304H(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f12059k + " is not defined.");
                return -1;
            }
            int hitTest = definedTemplate.hitTest(fArr2);
            if (hitTest != -1) {
                if (definedTemplate.isResponsible() || hitTest != definedTemplate.getId()) {
                    return hitTest;
                }
                return getId();
            }
        }
        return -1;
    }

    /* renamed from: i */
    public void m26577i(Double d) {
        this.f12060l = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: j */
    public void m26576j(String str) {
        this.f12060l = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: k */
    public void m26575k(Dynamic dynamic) {
        this.f12061m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: l */
    public void m26574l(Double d) {
        this.f12061m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: m */
    public void m26573m(String str) {
        this.f12061m = SVGLength.m26887e(str);
        invalidate();
    }
}
