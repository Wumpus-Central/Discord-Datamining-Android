package com.horcrux.svg;

import android.annotation.SuppressLint;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.C5944a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.q */
/* loaded from: classes6.dex */
class C5980q extends C5969l {

    /* renamed from: m */
    SVGLength f12017m;

    /* renamed from: n */
    SVGLength f12018n;

    /* renamed from: o */
    SVGLength f12019o;

    /* renamed from: p */
    SVGLength f12020p;

    /* renamed from: q */
    private C5944a.EnumC5945b f12021q;

    /* renamed from: r */
    private C5944a.EnumC5945b f12022r;

    public C5980q(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: k */
    public void m26659k(Dynamic dynamic) {
        this.f12020p = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: l */
    public void m26658l(Double d) {
        this.f12020p = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: m */
    public void m26657m(String str) {
        this.f12020p = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: n */
    public void m26656n(int i) {
        if (i == 0) {
            this.f12022r = C5944a.EnumC5945b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.f12022r = C5944a.EnumC5945b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    /* renamed from: o */
    public void m26655o(int i) {
        if (i == 0) {
            this.f12021q = C5944a.EnumC5945b.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.f12021q = C5944a.EnumC5945b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    /* renamed from: p */
    public void m26654p(Dynamic dynamic) {
        this.f12019o = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: q */
    public void m26653q(Double d) {
        this.f12019o = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: r */
    public void m26652r(String str) {
        this.f12019o = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: s */
    public void m26651s(Dynamic dynamic) {
        this.f12017m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.C5969l, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }

    /* renamed from: t */
    public void m26650t(Double d) {
        this.f12017m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: u */
    public void m26649u(String str) {
        this.f12017m = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: v */
    public void m26648v(Dynamic dynamic) {
        this.f12018n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: w */
    public void m26647w(Double d) {
        this.f12018n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: x */
    public void m26646x(String str) {
        this.f12018n = SVGLength.m26887e(str);
        invalidate();
    }
}
