package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.C5944a;
import p414x3.C13925a;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.a0 */
/* loaded from: classes6.dex */
public class C5946a0 extends C5951d {

    /* renamed from: t */
    private static final float[] f11822t = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: k */
    private SVGLength f11823k;

    /* renamed from: l */
    private SVGLength f11824l;

    /* renamed from: m */
    private SVGLength f11825m;

    /* renamed from: n */
    private SVGLength f11826n;

    /* renamed from: o */
    private SVGLength f11827o;

    /* renamed from: p */
    private SVGLength f11828p;

    /* renamed from: q */
    private ReadableArray f11829q;

    /* renamed from: r */
    private C5944a.EnumC5945b f11830r;

    /* renamed from: s */
    private Matrix f11831s = null;

    public C5946a0(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public void m26855a(Dynamic dynamic) {
        this.f11827o = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: b */
    public void m26854b(Double d) {
        this.f11827o = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: c */
    public void m26853c(String str) {
        this.f11827o = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: d */
    public void m26852d(Dynamic dynamic) {
        this.f11828p = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: e */
    public void m26851e(Double d) {
        this.f11828p = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: f */
    public void m26850f(String str) {
        this.f11828p = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: g */
    public void m26849g(Dynamic dynamic) {
        this.f11823k = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: h */
    public void m26848h(Double d) {
        this.f11823k = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: i */
    public void m26847i(String str) {
        this.f11823k = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: j */
    public void m26846j(Dynamic dynamic) {
        this.f11824l = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: k */
    public void m26845k(Double d) {
        this.f11824l = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: l */
    public void m26844l(String str) {
        this.f11824l = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: m */
    public void m26843m(ReadableArray readableArray) {
        this.f11829q = readableArray;
        invalidate();
    }

    /* renamed from: n */
    public void m26842n(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f11822t;
            int c = C5992x.m26554c(readableArray, fArr, this.mScale);
            if (c == 6) {
                if (this.f11831s == null) {
                    this.f11831s = new Matrix();
                }
                this.f11831s.setValues(fArr);
            } else if (c != -1) {
                C13925a.m2304H(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f11831s = null;
        }
        invalidate();
    }

    /* renamed from: o */
    public void m26841o(int i) {
        if (i == 0) {
            this.f11830r = C5944a.EnumC5945b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.f11830r = C5944a.EnumC5945b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    /* renamed from: p */
    public void m26840p(Dynamic dynamic) {
        this.f11825m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: q */
    public void m26839q(Double d) {
        this.f11825m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: r */
    public void m26838r(String str) {
        this.f11825m = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: s */
    public void m26837s(Dynamic dynamic) {
        this.f11826n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            C5944a aVar = new C5944a(C5944a.EnumC0171a.RADIAL_GRADIENT, new SVGLength[]{this.f11823k, this.f11824l, this.f11825m, this.f11826n, this.f11827o, this.f11828p}, this.f11830r);
            aVar.m26860e(this.f11829q);
            Matrix matrix = this.f11831s;
            if (matrix != null) {
                aVar.m26859f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f11830r == C5944a.EnumC5945b.USER_SPACE_ON_USE) {
                aVar.m26857h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    /* renamed from: t */
    public void m26836t(Double d) {
        this.f11826n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: u */
    public void m26835u(String str) {
        this.f11826n = SVGLength.m26887e(str);
        invalidate();
    }
}
