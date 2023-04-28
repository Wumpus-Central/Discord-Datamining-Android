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
/* renamed from: com.horcrux.svg.o */
/* loaded from: classes6.dex */
public class C5976o extends C5951d {

    /* renamed from: r */
    private static final float[] f11990r = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: k */
    private SVGLength f11991k;

    /* renamed from: l */
    private SVGLength f11992l;

    /* renamed from: m */
    private SVGLength f11993m;

    /* renamed from: n */
    private SVGLength f11994n;

    /* renamed from: o */
    private ReadableArray f11995o;

    /* renamed from: p */
    private C5944a.EnumC5945b f11996p;

    /* renamed from: q */
    private Matrix f11997q = null;

    public C5976o(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public void m26689a(ReadableArray readableArray) {
        this.f11995o = readableArray;
        invalidate();
    }

    /* renamed from: b */
    public void m26688b(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f11990r;
            int c = C5992x.m26554c(readableArray, fArr, this.mScale);
            if (c == 6) {
                if (this.f11997q == null) {
                    this.f11997q = new Matrix();
                }
                this.f11997q.setValues(fArr);
            } else if (c != -1) {
                C13925a.m2304H(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f11997q = null;
        }
        invalidate();
    }

    /* renamed from: c */
    public void m26687c(int i) {
        if (i == 0) {
            this.f11996p = C5944a.EnumC5945b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.f11996p = C5944a.EnumC5945b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    /* renamed from: d */
    public void m26686d(Dynamic dynamic) {
        this.f11991k = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: e */
    public void m26685e(Double d) {
        this.f11991k = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: f */
    public void m26684f(String str) {
        this.f11991k = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: g */
    public void m26683g(Dynamic dynamic) {
        this.f11993m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: h */
    public void m26682h(Double d) {
        this.f11993m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: i */
    public void m26681i(String str) {
        this.f11993m = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: j */
    public void m26680j(Dynamic dynamic) {
        this.f11992l = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: k */
    public void m26679k(Double d) {
        this.f11992l = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: l */
    public void m26678l(String str) {
        this.f11992l = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: m */
    public void m26677m(Dynamic dynamic) {
        this.f11994n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: n */
    public void m26676n(Double d) {
        this.f11994n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: o */
    public void m26675o(String str) {
        this.f11994n = SVGLength.m26887e(str);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            C5944a aVar = new C5944a(C5944a.EnumC0171a.LINEAR_GRADIENT, new SVGLength[]{this.f11991k, this.f11992l, this.f11993m, this.f11994n}, this.f11996p);
            aVar.m26860e(this.f11995o);
            Matrix matrix = this.f11997q;
            if (matrix != null) {
                aVar.m26859f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f11996p == C5944a.EnumC5945b.USER_SPACE_ON_USE) {
                aVar.m26857h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }
}
