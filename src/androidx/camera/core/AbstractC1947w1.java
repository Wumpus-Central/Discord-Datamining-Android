package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;

/* renamed from: androidx.camera.core.w1 */
/* loaded from: classes.dex */
public abstract class AbstractC1947w1 {

    /* renamed from: a */
    private Rational f2019a;

    public AbstractC1947w1() {
        this(null);
    }

    /* renamed from: d */
    public static float m39444d() {
        return 0.15f;
    }

    /* renamed from: a */
    protected abstract PointF mo39116a(float f, float f2);

    /* renamed from: b */
    public final C1935v1 m39446b(float f, float f2) {
        return m39445c(f, f2, m39444d());
    }

    /* renamed from: c */
    public final C1935v1 m39445c(float f, float f2, float f3) {
        PointF a = mo39116a(f, f2);
        return new C1935v1(a.x, a.y, f3, this.f2019a);
    }

    public AbstractC1947w1(Rational rational) {
        this.f2019a = rational;
    }
}
