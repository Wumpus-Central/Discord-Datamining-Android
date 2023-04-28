package p223m2;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* renamed from: m2.a */
/* loaded from: classes.dex */
public class C10469a {

    /* renamed from: a */
    private final PointF f23103a;

    /* renamed from: b */
    private final PointF f23104b;

    /* renamed from: c */
    private final PointF f23105c;

    public C10469a() {
        this.f23103a = new PointF();
        this.f23104b = new PointF();
        this.f23105c = new PointF();
    }

    /* renamed from: a */
    public PointF m13110a() {
        return this.f23103a;
    }

    /* renamed from: b */
    public PointF m13109b() {
        return this.f23104b;
    }

    /* renamed from: c */
    public PointF m13108c() {
        return this.f23105c;
    }

    /* renamed from: d */
    public void m13107d(float f, float f2) {
        this.f23103a.set(f, f2);
    }

    /* renamed from: e */
    public void m13106e(float f, float f2) {
        this.f23104b.set(f, f2);
    }

    /* renamed from: f */
    public void m13105f(float f, float f2) {
        this.f23105c.set(f, f2);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f23105c.x), Float.valueOf(this.f23105c.y), Float.valueOf(this.f23103a.x), Float.valueOf(this.f23103a.y), Float.valueOf(this.f23104b.x), Float.valueOf(this.f23104b.y));
    }

    public C10469a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f23103a = pointF;
        this.f23104b = pointF2;
        this.f23105c = pointF3;
    }
}
