package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.n */
/* loaded from: classes6.dex */
public class C5974n extends RenderableView {

    /* renamed from: k */
    private SVGLength f11978k;

    /* renamed from: l */
    private SVGLength f11979l;

    /* renamed from: m */
    private SVGLength f11980m;

    /* renamed from: n */
    private SVGLength f11981n;

    public C5974n(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public void m26702a(Dynamic dynamic) {
        this.f11978k = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: b */
    public void m26701b(Double d) {
        this.f11978k = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: c */
    public void m26700c(String str) {
        this.f11978k = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: d */
    public void m26699d(Dynamic dynamic) {
        this.f11980m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: e */
    public void m26698e(Double d) {
        this.f11980m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: f */
    public void m26697f(String str) {
        this.f11980m = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: g */
    public void m26696g(Dynamic dynamic) {
        this.f11979l = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f11978k);
        double relativeOnHeight = relativeOnHeight(this.f11979l);
        double relativeOnWidth2 = relativeOnWidth(this.f11980m);
        double relativeOnHeight2 = relativeOnHeight(this.f11981n);
        path.moveTo((float) relativeOnWidth, (float) relativeOnHeight);
        path.lineTo((float) relativeOnWidth2, (float) relativeOnHeight2);
        ArrayList<C5983s> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C5983s(EnumC5955f.kCGPathElementMoveToPoint, new C5991w[]{new C5991w(relativeOnWidth, relativeOnHeight)}));
        this.elements.add(new C5983s(EnumC5955f.kCGPathElementAddLineToPoint, new C5991w[]{new C5991w(relativeOnWidth2, relativeOnHeight2)}));
        return path;
    }

    /* renamed from: h */
    public void m26695h(Double d) {
        this.f11979l = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: i */
    public void m26694i(String str) {
        this.f11979l = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: j */
    public void m26693j(Dynamic dynamic) {
        this.f11981n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: k */
    public void m26692k(Double d) {
        this.f11981n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: l */
    public void m26691l(String str) {
        this.f11981n = SVGLength.m26887e(str);
        invalidate();
    }
}
