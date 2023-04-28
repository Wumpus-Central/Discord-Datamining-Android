package com.otaliastudios.zoom;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\n\u0012\b\b\u0002\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u001c\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0007J\u0011\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002J!\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\nHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006\""}, m15073d2 = {"Lcom/otaliastudios/zoom/ScaledPoint;", "", "", "x", "y", "", "g", "scaledPoint", "e", "f", "", "scale", "Lcom/otaliastudios/zoom/AbsolutePoint;", "outPoint", "j", "(FLcom/otaliastudios/zoom/AbsolutePoint;)Lcom/otaliastudios/zoom/AbsolutePoint;", "a", "", "toString", "", "hashCode", "other", "", "equals", "F", "c", "()F", "h", "(F)V", "b", "d", "i", "<init>", "(FF)V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ScaledPoint {

    /* renamed from: a */
    private float f12386a;

    /* renamed from: b */
    private float f12387b;

    public ScaledPoint() {
        this(0.0f, 0.0f, 3, null);
    }

    public ScaledPoint(float f, float f2) {
        this.f12386a = f;
        this.f12387b = f2;
    }

    /* renamed from: b */
    public static /* synthetic */ ScaledPoint m26349b(ScaledPoint scaledPoint, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = scaledPoint.f12386a;
        }
        if ((i & 2) != 0) {
            f2 = scaledPoint.f12387b;
        }
        return scaledPoint.m26350a(f, f2);
    }

    /* renamed from: k */
    public static /* synthetic */ AbsolutePoint m26340k(ScaledPoint scaledPoint, float f, AbsolutePoint absolutePoint, int i, Object obj) {
        if ((i & 2) != 0) {
            absolutePoint = new AbsolutePoint(0.0f, 0.0f, 3, null);
        }
        return scaledPoint.m26341j(f, absolutePoint);
    }

    /* renamed from: a */
    public final ScaledPoint m26350a(float f, float f2) {
        return new ScaledPoint(f, f2);
    }

    /* renamed from: c */
    public final float m26348c() {
        return this.f12386a;
    }

    /* renamed from: d */
    public final float m26347d() {
        return this.f12387b;
    }

    /* renamed from: e */
    public final ScaledPoint m26346e(ScaledPoint scaledPoint) {
        C9971q.m14633g(scaledPoint, "scaledPoint");
        return new ScaledPoint(this.f12386a - scaledPoint.f12386a, this.f12387b - scaledPoint.f12387b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaledPoint)) {
            return false;
        }
        ScaledPoint scaledPoint = (ScaledPoint) obj;
        return C9971q.m14638b(Float.valueOf(this.f12386a), Float.valueOf(scaledPoint.f12386a)) && C9971q.m14638b(Float.valueOf(this.f12387b), Float.valueOf(scaledPoint.f12387b));
    }

    /* renamed from: f */
    public final ScaledPoint m26345f(ScaledPoint scaledPoint) {
        C9971q.m14633g(scaledPoint, "scaledPoint");
        return new ScaledPoint(this.f12386a + scaledPoint.f12386a, this.f12387b + scaledPoint.f12387b);
    }

    /* renamed from: g */
    public final void m26344g(Number x, Number y) {
        C9971q.m14633g(x, "x");
        C9971q.m14633g(y, "y");
        this.f12386a = x.floatValue();
        this.f12387b = y.floatValue();
    }

    /* renamed from: h */
    public final void m26343h(float f) {
        this.f12386a = f;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f12386a) * 31) + Float.floatToIntBits(this.f12387b);
    }

    /* renamed from: i */
    public final void m26342i(float f) {
        this.f12387b = f;
    }

    /* renamed from: j */
    public final AbsolutePoint m26341j(float f, AbsolutePoint outPoint) {
        C9971q.m14633g(outPoint, "outPoint");
        outPoint.m26355h(Float.valueOf(this.f12386a / f), Float.valueOf(this.f12387b / f));
        return outPoint;
    }

    public String toString() {
        return "ScaledPoint(x=" + this.f12386a + ", y=" + this.f12387b + ')';
    }

    public /* synthetic */ ScaledPoint(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
