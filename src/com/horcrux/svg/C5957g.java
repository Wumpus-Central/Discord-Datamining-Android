package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.g */
/* loaded from: classes6.dex */
public class C5957g extends RenderableView {

    /* renamed from: k */
    private SVGLength f11856k;

    /* renamed from: l */
    private SVGLength f11857l;

    /* renamed from: m */
    private SVGLength f11858m;

    /* renamed from: n */
    private SVGLength f11859n;

    public C5957g(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public void m26804a(Dynamic dynamic) {
        this.f11856k = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: b */
    public void m26803b(Double d) {
        this.f11856k = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: c */
    public void m26802c(String str) {
        this.f11856k = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: d */
    public void m26801d(Dynamic dynamic) {
        this.f11857l = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: e */
    public void m26800e(Double d) {
        this.f11857l = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: f */
    public void m26799f(String str) {
        this.f11857l = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: g */
    public void m26798g(Dynamic dynamic) {
        this.f11858m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f11856k);
        double relativeOnHeight = relativeOnHeight(this.f11857l);
        double relativeOnWidth2 = relativeOnWidth(this.f11858m);
        double relativeOnHeight2 = relativeOnHeight(this.f11859n);
        double d = relativeOnWidth - relativeOnWidth2;
        double d2 = relativeOnHeight - relativeOnHeight2;
        double d3 = relativeOnWidth2 + relativeOnWidth;
        double d4 = relativeOnHeight2 + relativeOnHeight;
        path.addOval(new RectF((float) d, (float) d2, (float) d3, (float) d4), Path.Direction.CW);
        ArrayList<C5983s> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C5983s(EnumC5955f.kCGPathElementMoveToPoint, new C5991w[]{new C5991w(relativeOnWidth, d2)}));
        ArrayList<C5983s> arrayList2 = this.elements;
        EnumC5955f fVar = EnumC5955f.kCGPathElementAddLineToPoint;
        arrayList2.add(new C5983s(fVar, new C5991w[]{new C5991w(relativeOnWidth, d2), new C5991w(d3, relativeOnHeight)}));
        this.elements.add(new C5983s(fVar, new C5991w[]{new C5991w(d3, relativeOnHeight), new C5991w(relativeOnWidth, d4)}));
        this.elements.add(new C5983s(fVar, new C5991w[]{new C5991w(relativeOnWidth, d4), new C5991w(d, relativeOnHeight)}));
        this.elements.add(new C5983s(fVar, new C5991w[]{new C5991w(d, relativeOnHeight), new C5991w(relativeOnWidth, d2)}));
        return path;
    }

    /* renamed from: h */
    public void m26797h(Double d) {
        this.f11858m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: i */
    public void m26796i(String str) {
        this.f11858m = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: j */
    public void m26795j(Dynamic dynamic) {
        this.f11859n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: k */
    public void m26794k(Double d) {
        this.f11859n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: l */
    public void m26793l(String str) {
        this.f11859n = SVGLength.m26887e(str);
        invalidate();
    }
}
