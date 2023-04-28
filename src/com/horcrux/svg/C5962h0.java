package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.h0 */
/* loaded from: classes6.dex */
public class C5962h0 extends C5986t0 {

    /* renamed from: A */
    private SVGLength f37620A;

    /* renamed from: B */
    private EnumC5979p0 f37621B = EnumC5979p0.align;

    /* renamed from: C */
    private EnumC5984s0 f37622C = EnumC5984s0.exact;

    /* renamed from: x */
    private String f11884x;

    /* renamed from: y */
    private EnumC5982r0 f11885y;

    /* renamed from: z */
    private EnumC5981q0 f11886z;

    public C5962h0(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.C5986t0
    /* renamed from: B */
    public void mo26615B(String str) {
        this.f37621B = EnumC5979p0.valueOf(str);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public EnumC5981q0 m26775M() {
        return this.f11886z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public EnumC5982r0 m26774N() {
        return this.f11885y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public SVGLength m26773O() {
        return this.f37620A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public Path m26772P(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f11884x);
        if (!(definedTemplate instanceof RenderableView)) {
            return null;
        }
        return ((RenderableView) definedTemplate).getPath(canvas, paint);
    }

    /* renamed from: Q */
    public void m26771Q(String str) {
        this.f11884x = str;
        invalidate();
    }

    /* renamed from: R */
    public void m26770R(String str) {
        this.f11886z = EnumC5981q0.valueOf(str);
        invalidate();
    }

    /* renamed from: S */
    public void m26769S(String str) {
        this.f11885y = EnumC5982r0.valueOf(str);
        invalidate();
    }

    /* renamed from: T */
    public void m26768T(String str) {
        this.f37622C = EnumC5984s0.valueOf(str);
        invalidate();
    }

    /* renamed from: U */
    public void m26767U(Dynamic dynamic) {
        this.f37620A = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: V */
    public void m26766V(Double d) {
        this.f37620A = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: W */
    public void m26765W(String str) {
        this.f37620A = SVGLength.m26887e(str);
        invalidate();
    }

    @Override // com.horcrux.svg.C5986t0, com.horcrux.svg.C5969l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f) {
        mo26730a(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5969l
    /* renamed from: f */
    public void mo26726f() {
    }

    @Override // com.horcrux.svg.C5986t0, com.horcrux.svg.C5969l
    /* renamed from: g */
    void mo26603g() {
    }

    @Override // com.horcrux.svg.C5986t0, com.horcrux.svg.C5969l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return m26600m(canvas, paint);
    }
}
