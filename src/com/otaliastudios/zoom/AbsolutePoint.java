package com.otaliastudios.zoom;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010%J\u001c\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000J\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J!\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\u0004\u001a\u00020\fHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006&"}, m15073d2 = {"Lcom/otaliastudios/zoom/AbsolutePoint;", "", "", "x", "y", "", "h", "p", "g", "absolutePoint", "e", "f", "", "scale", "Lcom/otaliastudios/zoom/ScaledPoint;", "outPoint", "i", "(FLcom/otaliastudios/zoom/ScaledPoint;)Lcom/otaliastudios/zoom/ScaledPoint;", "a", "", "toString", "", "hashCode", "other", "", "equals", "F", "c", "()F", "setX", "(F)V", "b", "d", "setY", "<init>", "(FF)V", "point", "(Lcom/otaliastudios/zoom/AbsolutePoint;)V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class AbsolutePoint {

    /* renamed from: a */
    private float f12376a;

    /* renamed from: b */
    private float f12377b;

    public AbsolutePoint() {
        this(0.0f, 0.0f, 3, null);
    }

    public AbsolutePoint(float f, float f2) {
        this.f12376a = f;
        this.f12377b = f2;
    }

    /* renamed from: b */
    public static /* synthetic */ AbsolutePoint m26361b(AbsolutePoint absolutePoint, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = absolutePoint.f12376a;
        }
        if ((i & 2) != 0) {
            f2 = absolutePoint.f12377b;
        }
        return absolutePoint.m26362a(f, f2);
    }

    /* renamed from: j */
    public static /* synthetic */ ScaledPoint m26353j(AbsolutePoint absolutePoint, float f, ScaledPoint scaledPoint, int i, Object obj) {
        if ((i & 2) != 0) {
            scaledPoint = new ScaledPoint(0.0f, 0.0f, 3, null);
        }
        return absolutePoint.m26354i(f, scaledPoint);
    }

    /* renamed from: a */
    public final AbsolutePoint m26362a(float f, float f2) {
        return new AbsolutePoint(f, f2);
    }

    /* renamed from: c */
    public final float m26360c() {
        return this.f12376a;
    }

    /* renamed from: d */
    public final float m26359d() {
        return this.f12377b;
    }

    /* renamed from: e */
    public final AbsolutePoint m26358e(AbsolutePoint absolutePoint) {
        C9971q.m14633g(absolutePoint, "absolutePoint");
        return new AbsolutePoint(this.f12376a - absolutePoint.f12376a, this.f12377b - absolutePoint.f12377b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsolutePoint)) {
            return false;
        }
        AbsolutePoint absolutePoint = (AbsolutePoint) obj;
        return C9971q.m14638b(Float.valueOf(this.f12376a), Float.valueOf(absolutePoint.f12376a)) && C9971q.m14638b(Float.valueOf(this.f12377b), Float.valueOf(absolutePoint.f12377b));
    }

    /* renamed from: f */
    public final AbsolutePoint m26357f(AbsolutePoint absolutePoint) {
        C9971q.m14633g(absolutePoint, "absolutePoint");
        return new AbsolutePoint(this.f12376a + absolutePoint.f12376a, this.f12377b + absolutePoint.f12377b);
    }

    /* renamed from: g */
    public final void m26356g(AbsolutePoint p) {
        C9971q.m14633g(p, "p");
        m26355h(Float.valueOf(p.f12376a), Float.valueOf(p.f12377b));
    }

    /* renamed from: h */
    public final void m26355h(Number x, Number y) {
        C9971q.m14633g(x, "x");
        C9971q.m14633g(y, "y");
        this.f12376a = x.floatValue();
        this.f12377b = y.floatValue();
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f12376a) * 31) + Float.floatToIntBits(this.f12377b);
    }

    /* renamed from: i */
    public final ScaledPoint m26354i(float f, ScaledPoint outPoint) {
        C9971q.m14633g(outPoint, "outPoint");
        outPoint.m26344g(Float.valueOf(this.f12376a * f), Float.valueOf(this.f12377b * f));
        return outPoint;
    }

    public String toString() {
        return "AbsolutePoint(x=" + this.f12376a + ", y=" + this.f12377b + ')';
    }

    public /* synthetic */ AbsolutePoint(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbsolutePoint(AbsolutePoint point) {
        this(point.f12376a, point.f12377b);
        C9971q.m14633g(point, "point");
    }
}
