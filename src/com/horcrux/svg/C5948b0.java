package com.horcrux.svg;

import android.annotation.SuppressLint;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.b0 */
/* loaded from: classes6.dex */
public class C5948b0 extends RenderableView {

    /* renamed from: k */
    private SVGLength f11835k;

    /* renamed from: l */
    private SVGLength f11836l;

    /* renamed from: m */
    private SVGLength f11837m;

    /* renamed from: n */
    private SVGLength f11838n;

    /* renamed from: o */
    private SVGLength f11839o;

    /* renamed from: p */
    private SVGLength f11840p;

    public C5948b0(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public void m26825a(Dynamic dynamic) {
        this.f11838n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: b */
    public void m26824b(Double d) {
        this.f11838n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: c */
    public void m26823c(String str) {
        this.f11838n = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: d */
    public void m26822d(Dynamic dynamic) {
        this.f11839o = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: e */
    public void m26821e(Double d) {
        this.f11839o = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: f */
    public void m26820f(String str) {
        this.f11839o = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: g */
    public void m26819g(Dynamic dynamic) {
        this.f11840p = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Path getPath(android.graphics.Canvas r20, android.graphics.Paint r21) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5948b0.getPath(android.graphics.Canvas, android.graphics.Paint):android.graphics.Path");
    }

    /* renamed from: h */
    public void m26818h(Double d) {
        this.f11840p = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: i */
    public void m26817i(String str) {
        this.f11840p = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: j */
    public void m26816j(Dynamic dynamic) {
        this.f11837m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: k */
    public void m26815k(Double d) {
        this.f11837m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: l */
    public void m26814l(String str) {
        this.f11837m = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: m */
    public void m26813m(Dynamic dynamic) {
        this.f11835k = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: n */
    public void m26812n(Double d) {
        this.f11835k = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: o */
    public void m26811o(String str) {
        this.f11835k = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: p */
    public void m26810p(Dynamic dynamic) {
        this.f11836l = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: q */
    public void m26809q(Double d) {
        this.f11836l = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: r */
    public void m26808r(String str) {
        this.f11836l = SVGLength.m26887e(str);
        invalidate();
    }
}
