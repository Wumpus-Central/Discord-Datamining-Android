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
/* renamed from: com.horcrux.svg.b */
/* loaded from: classes6.dex */
public class C5947b extends RenderableView {

    /* renamed from: k */
    private SVGLength f11832k;

    /* renamed from: l */
    private SVGLength f11833l;

    /* renamed from: m */
    private SVGLength f11834m;

    public C5947b(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public void m26834a(Dynamic dynamic) {
        this.f11832k = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: b */
    public void m26833b(Double d) {
        this.f11832k = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: c */
    public void m26832c(String str) {
        this.f11832k = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: d */
    public void m26831d(Dynamic dynamic) {
        this.f11833l = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: e */
    public void m26830e(Double d) {
        this.f11833l = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: f */
    public void m26829f(String str) {
        this.f11833l = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: g */
    public void m26828g(Dynamic dynamic) {
        this.f11834m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double relativeOnWidth = relativeOnWidth(this.f11832k);
        double relativeOnHeight = relativeOnHeight(this.f11833l);
        double relativeOnOther = relativeOnOther(this.f11834m);
        path.addCircle((float) relativeOnWidth, (float) relativeOnHeight, (float) relativeOnOther, Path.Direction.CW);
        ArrayList<C5983s> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d = relativeOnHeight - relativeOnOther;
        arrayList.add(new C5983s(EnumC5955f.kCGPathElementMoveToPoint, new C5991w[]{new C5991w(relativeOnWidth, d)}));
        ArrayList<C5983s> arrayList2 = this.elements;
        EnumC5955f fVar = EnumC5955f.kCGPathElementAddLineToPoint;
        double d2 = relativeOnWidth + relativeOnOther;
        arrayList2.add(new C5983s(fVar, new C5991w[]{new C5991w(relativeOnWidth, d), new C5991w(d2, relativeOnHeight)}));
        double d3 = relativeOnHeight + relativeOnOther;
        this.elements.add(new C5983s(fVar, new C5991w[]{new C5991w(d2, relativeOnHeight), new C5991w(relativeOnWidth, d3)}));
        double d4 = relativeOnWidth - relativeOnOther;
        this.elements.add(new C5983s(fVar, new C5991w[]{new C5991w(relativeOnWidth, d3), new C5991w(d4, relativeOnHeight)}));
        this.elements.add(new C5983s(fVar, new C5991w[]{new C5991w(d4, relativeOnHeight), new C5991w(relativeOnWidth, d)}));
        return path;
    }

    /* renamed from: h */
    public void m26827h(Double d) {
        this.f11834m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: i */
    public void m26826i(String str) {
        this.f11834m = SVGLength.m26887e(str);
        invalidate();
    }
}
