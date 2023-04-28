package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import com.horcrux.svg.C5944a;
import p414x3.C13925a;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.v */
/* loaded from: classes6.dex */
public class C5989v extends C5969l {

    /* renamed from: z */
    private static final float[] f12064z = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: m */
    private SVGLength f12065m;

    /* renamed from: n */
    private SVGLength f12066n;

    /* renamed from: o */
    private SVGLength f12067o;

    /* renamed from: p */
    private SVGLength f12068p;

    /* renamed from: q */
    private C5944a.EnumC5945b f12069q;

    /* renamed from: r */
    private C5944a.EnumC5945b f12070r;

    /* renamed from: s */
    private float f12071s;

    /* renamed from: t */
    private float f12072t;

    /* renamed from: u */
    private float f12073u;

    /* renamed from: v */
    private float f12074v;

    /* renamed from: w */
    String f12075w;

    /* renamed from: x */
    int f12076x;

    /* renamed from: y */
    private Matrix f12077y = null;

    public C5989v(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF getViewBox() {
        float f = this.f12071s;
        float f2 = this.mScale;
        float f3 = this.f12072t;
        return new RectF(f * f2, f3 * f2, (f + this.f12073u) * f2, (f3 + this.f12074v) * f2);
    }

    /* renamed from: k */
    public void m26572k(Dynamic dynamic) {
        this.f12068p = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: l */
    public void m26571l(Double d) {
        this.f12068p = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: m */
    public void m26570m(String str) {
        this.f12068p = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: n */
    public void m26569n(int i) {
        if (i == 0) {
            this.f12070r = C5944a.EnumC5945b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.f12070r = C5944a.EnumC5945b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    /* renamed from: o */
    public void m26568o(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f12064z;
            int c = C5992x.m26554c(readableArray, fArr, this.mScale);
            if (c == 6) {
                if (this.f12077y == null) {
                    this.f12077y = new Matrix();
                }
                this.f12077y.setValues(fArr);
            } else if (c != -1) {
                C13925a.m2304H(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f12077y = null;
        }
        invalidate();
    }

    /* renamed from: p */
    public void m26567p(int i) {
        if (i == 0) {
            this.f12069q = C5944a.EnumC5945b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.f12069q = C5944a.EnumC5945b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    /* renamed from: q */
    public void m26566q(Dynamic dynamic) {
        this.f12067o = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: r */
    public void m26565r(Double d) {
        this.f12067o = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: s */
    public void m26564s(String str) {
        this.f12067o = SVGLength.m26887e(str);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5969l, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            C5944a aVar = new C5944a(C5944a.EnumC0171a.PATTERN, new SVGLength[]{this.f12065m, this.f12066n, this.f12067o, this.f12068p}, this.f12069q);
            aVar.m26861d(this.f12070r);
            aVar.m26858g(this);
            Matrix matrix = this.f12077y;
            if (matrix != null) {
                aVar.m26859f(matrix);
            }
            SvgView svgView = getSvgView();
            C5944a.EnumC5945b bVar = this.f12069q;
            C5944a.EnumC5945b bVar2 = C5944a.EnumC5945b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f12070r == bVar2) {
                aVar.m26857h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f12075w = str;
        invalidate();
    }

    public void setMeetOrSlice(int i) {
        this.f12076x = i;
        invalidate();
    }

    public void setMinX(float f) {
        this.f12071s = f;
        invalidate();
    }

    public void setMinY(float f) {
        this.f12072t = f;
        invalidate();
    }

    public void setVbHeight(float f) {
        this.f12074v = f;
        invalidate();
    }

    public void setVbWidth(float f) {
        this.f12073u = f;
        invalidate();
    }

    /* renamed from: t */
    public void m26563t(Dynamic dynamic) {
        this.f12065m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: u */
    public void m26562u(Double d) {
        this.f12065m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: v */
    public void m26561v(String str) {
        this.f12065m = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: w */
    public void m26560w(Dynamic dynamic) {
        this.f12066n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: x */
    public void m26559x(Double d) {
        this.f12066n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: y */
    public void m26558y(String str) {
        this.f12066n = SVGLength.m26887e(str);
        invalidate();
    }
}
