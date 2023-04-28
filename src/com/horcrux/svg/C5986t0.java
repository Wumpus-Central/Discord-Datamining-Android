package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.t0 */
/* loaded from: classes6.dex */
public class C5986t0 extends C5969l {

    /* renamed from: q */
    private EnumC5964i0 f12051q;

    /* renamed from: r */
    private ArrayList<SVGLength> f12052r;

    /* renamed from: s */
    private ArrayList<SVGLength> f12053s;

    /* renamed from: t */
    private ArrayList<SVGLength> f12054t;

    /* renamed from: u */
    private ArrayList<SVGLength> f12055u;

    /* renamed from: v */
    private ArrayList<SVGLength> f12056v;

    /* renamed from: m */
    SVGLength f12047m = null;

    /* renamed from: n */
    SVGLength f12048n = null;

    /* renamed from: o */
    private String f12049o = null;

    /* renamed from: p */
    EnumC5977o0 f12050p = EnumC5977o0.spacing;

    /* renamed from: w */
    double f12057w = Double.NaN;

    public C5986t0(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: A */
    public void m26616A(String str) {
        this.f12050p = EnumC5977o0.valueOf(str);
        invalidate();
    }

    /* renamed from: B */
    public void mo26615B(String str) {
        this.f12051q = EnumC5964i0.m26752a(str);
        invalidate();
    }

    /* renamed from: C */
    public void m26614C(Dynamic dynamic) {
        this.f12052r = SVGLength.m26891a(dynamic);
        invalidate();
    }

    /* renamed from: D */
    public void m26613D(ReadableArray readableArray) {
        this.f12052r = SVGLength.m26890b(readableArray);
        invalidate();
    }

    /* renamed from: E */
    public void m26612E(Dynamic dynamic) {
        this.f12053s = SVGLength.m26891a(dynamic);
        invalidate();
    }

    /* renamed from: F */
    public void m26611F(ReadableArray readableArray) {
        this.f12053s = SVGLength.m26890b(readableArray);
        invalidate();
    }

    /* renamed from: G */
    public void m26610G(Dynamic dynamic) {
        this.f12054t = SVGLength.m26891a(dynamic);
        invalidate();
    }

    /* renamed from: H */
    public void m26609H(ReadableArray readableArray) {
        this.f12054t = SVGLength.m26890b(readableArray);
        invalidate();
    }

    /* renamed from: I */
    public void m26608I(Dynamic dynamic) {
        this.f12048n = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: J */
    public void m26607J(Double d) {
        this.f12048n = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: K */
    public void m26606K(String str) {
        this.f12048n = SVGLength.m26887e(str);
        invalidate();
    }

    /* renamed from: L */
    public void m26605L(String str) {
        if (str != null) {
            String trim = str.trim();
            int lastIndexOf = trim.lastIndexOf(32);
            try {
                this.f12051q = EnumC5964i0.m26752a(trim.substring(lastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f12051q = EnumC5964i0.baseline;
            }
            try {
                this.f12049o = trim.substring(0, lastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f12049o = null;
            }
        } else {
            this.f12051q = EnumC5964i0.baseline;
            this.f12049o = null;
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.f12057w = Double.NaN;
        super.clearCache();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5969l
    /* renamed from: d */
    public Path mo26604d(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5969l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        m26723j(canvas);
        clip(canvas, paint);
        m26600m(canvas, paint);
        mo26603g();
        mo26730a(canvas, paint, f);
        mo26726f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5969l
    /* renamed from: g */
    public void mo26603g() {
        boolean z;
        if ((this instanceof C5962h0) || (this instanceof C5958g0)) {
            z = false;
        } else {
            z = true;
        }
        m26727e().m26736p(z, this, this.f11945k, this.f12052r, this.f12053s, this.f12055u, this.f12056v, this.f12054t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5969l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        m26723j(canvas);
        return m26600m(canvas, paint);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (((VirtualView) this).mPath != null) {
            super.invalidate();
            m26597p().clearChildCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public EnumC5964i0 m26602k() {
        EnumC5964i0 i0Var;
        if (this.f12051q == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof C5986t0) && (i0Var = ((C5986t0) parent).f12051q) != null) {
                    this.f12051q = i0Var;
                    return i0Var;
                }
            }
        }
        if (this.f12051q == null) {
            this.f12051q = EnumC5964i0.baseline;
        }
        return this.f12051q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public String m26601l() {
        String str;
        if (this.f12049o == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof C5986t0) && (str = ((C5986t0) parent).f12049o) != null) {
                    this.f12049o = str;
                    return str;
                }
            }
        }
        return this.f12049o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Path m26600m(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        mo26603g();
        ((VirtualView) this).mPath = super.getPath(canvas, paint);
        mo26726f();
        return ((VirtualView) this).mPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public double mo26599n(Paint paint) {
        if (!Double.isNaN(this.f12057w)) {
            return this.f12057w;
        }
        double d = 0.0d;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C5986t0) {
                d += ((C5986t0) childAt).mo26599n(paint);
            }
        }
        this.f12057w = d;
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C5986t0 m26598o() {
        ArrayList<C5960h> arrayList = m26727e().f11909a;
        ViewParent parent = getParent();
        C5986t0 t0Var = this;
        for (int size = arrayList.size() - 1; size >= 0 && (parent instanceof C5986t0) && arrayList.get(size).f11876j != EnumC5973m0.start && t0Var.f12052r == null; size--) {
            t0Var = (C5986t0) parent;
            parent = t0Var.getParent();
        }
        return t0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C5986t0 m26597p() {
        ViewParent parent = getParent();
        C5986t0 t0Var = this;
        while (parent instanceof C5986t0) {
            t0Var = (C5986t0) parent;
            parent = t0Var.getParent();
        }
        return t0Var;
    }

    /* renamed from: q */
    public void m26596q(Dynamic dynamic) {
        this.f12049o = SVGLength.m26886f(dynamic);
        invalidate();
    }

    /* renamed from: r */
    public void m26595r(Double d) {
        this.f12049o = String.valueOf(d);
        invalidate();
    }

    /* renamed from: s */
    public void m26594s(String str) {
        this.f12049o = str;
        invalidate();
    }

    /* renamed from: t */
    public void m26593t(Dynamic dynamic) {
        this.f12055u = SVGLength.m26891a(dynamic);
        invalidate();
    }

    /* renamed from: u */
    public void m26592u(ReadableArray readableArray) {
        this.f12055u = SVGLength.m26890b(readableArray);
        invalidate();
    }

    /* renamed from: v */
    public void m26591v(Dynamic dynamic) {
        this.f12056v = SVGLength.m26891a(dynamic);
        invalidate();
    }

    /* renamed from: w */
    public void m26590w(ReadableArray readableArray) {
        this.f12056v = SVGLength.m26890b(readableArray);
        invalidate();
    }

    /* renamed from: x */
    public void m26589x(Dynamic dynamic) {
        this.f12047m = SVGLength.m26889c(dynamic);
        invalidate();
    }

    /* renamed from: y */
    public void m26588y(Double d) {
        this.f12047m = SVGLength.m26888d(d);
        invalidate();
    }

    /* renamed from: z */
    public void m26587z(String str) {
        this.f12047m = SVGLength.m26887e(str);
        invalidate();
    }
}
