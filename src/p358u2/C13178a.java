package p358u2;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import p126h2.C7762i;

/* renamed from: u2.a */
/* loaded from: classes.dex */
public class C13178a<T> {

    /* renamed from: a */
    private final C7762i f29539a;

    /* renamed from: b */
    public final T f29540b;

    /* renamed from: c */
    public T f29541c;

    /* renamed from: d */
    public final Interpolator f29542d;

    /* renamed from: e */
    public final Interpolator f29543e;

    /* renamed from: f */
    public final Interpolator f29544f;

    /* renamed from: g */
    public final float f29545g;

    /* renamed from: h */
    public Float f29546h;

    /* renamed from: i */
    private float f29547i;

    /* renamed from: j */
    private float f29548j;

    /* renamed from: k */
    private int f29549k;

    /* renamed from: l */
    private int f29550l;

    /* renamed from: m */
    private float f29551m;

    /* renamed from: n */
    private float f29552n;

    /* renamed from: o */
    public PointF f29553o;

    /* renamed from: p */
    public PointF f29554p;

    public C13178a(C7762i iVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f29547i = -3987645.8f;
        this.f29548j = -3987645.8f;
        this.f29549k = 784923401;
        this.f29550l = 784923401;
        this.f29551m = Float.MIN_VALUE;
        this.f29552n = Float.MIN_VALUE;
        this.f29553o = null;
        this.f29554p = null;
        this.f29539a = iVar;
        this.f29540b = t;
        this.f29541c = t2;
        this.f29542d = interpolator;
        this.f29543e = null;
        this.f29544f = null;
        this.f29545g = f;
        this.f29546h = f2;
    }

    /* renamed from: a */
    public boolean m4419a(float f) {
        return f >= m4415e() && f < m4418b();
    }

    /* renamed from: b */
    public float m4418b() {
        if (this.f29539a == null) {
            return 1.0f;
        }
        if (this.f29552n == Float.MIN_VALUE) {
            if (this.f29546h == null) {
                this.f29552n = 1.0f;
            } else {
                this.f29552n = m4415e() + ((this.f29546h.floatValue() - this.f29545g) / this.f29539a.m21399e());
            }
        }
        return this.f29552n;
    }

    /* renamed from: c */
    public float m4417c() {
        if (this.f29548j == -3987645.8f) {
            this.f29548j = ((Float) this.f29541c).floatValue();
        }
        return this.f29548j;
    }

    /* renamed from: d */
    public int m4416d() {
        if (this.f29550l == 784923401) {
            this.f29550l = ((Integer) this.f29541c).intValue();
        }
        return this.f29550l;
    }

    /* renamed from: e */
    public float m4415e() {
        C7762i iVar = this.f29539a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f29551m == Float.MIN_VALUE) {
            this.f29551m = (this.f29545g - iVar.m21388p()) / this.f29539a.m21399e();
        }
        return this.f29551m;
    }

    /* renamed from: f */
    public float m4414f() {
        if (this.f29547i == -3987645.8f) {
            this.f29547i = ((Float) this.f29540b).floatValue();
        }
        return this.f29547i;
    }

    /* renamed from: g */
    public int m4413g() {
        if (this.f29549k == 784923401) {
            this.f29549k = ((Integer) this.f29540b).intValue();
        }
        return this.f29549k;
    }

    /* renamed from: h */
    public boolean m4412h() {
        return this.f29542d == null && this.f29543e == null && this.f29544f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f29540b + ", endValue=" + this.f29541c + ", startFrame=" + this.f29545g + ", endFrame=" + this.f29546h + ", interpolator=" + this.f29542d + '}';
    }

    public C13178a(C7762i iVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.f29547i = -3987645.8f;
        this.f29548j = -3987645.8f;
        this.f29549k = 784923401;
        this.f29550l = 784923401;
        this.f29551m = Float.MIN_VALUE;
        this.f29552n = Float.MIN_VALUE;
        this.f29553o = null;
        this.f29554p = null;
        this.f29539a = iVar;
        this.f29540b = t;
        this.f29541c = t2;
        this.f29542d = null;
        this.f29543e = interpolator;
        this.f29544f = interpolator2;
        this.f29545g = f;
        this.f29546h = f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C13178a(C7762i iVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f29547i = -3987645.8f;
        this.f29548j = -3987645.8f;
        this.f29549k = 784923401;
        this.f29550l = 784923401;
        this.f29551m = Float.MIN_VALUE;
        this.f29552n = Float.MIN_VALUE;
        this.f29553o = null;
        this.f29554p = null;
        this.f29539a = iVar;
        this.f29540b = t;
        this.f29541c = t2;
        this.f29542d = interpolator;
        this.f29543e = interpolator2;
        this.f29544f = interpolator3;
        this.f29545g = f;
        this.f29546h = f2;
    }

    public C13178a(T t) {
        this.f29547i = -3987645.8f;
        this.f29548j = -3987645.8f;
        this.f29549k = 784923401;
        this.f29550l = 784923401;
        this.f29551m = Float.MIN_VALUE;
        this.f29552n = Float.MIN_VALUE;
        this.f29553o = null;
        this.f29554p = null;
        this.f29539a = null;
        this.f29540b = t;
        this.f29541c = t;
        this.f29542d = null;
        this.f29543e = null;
        this.f29544f = null;
        this.f29545g = Float.MIN_VALUE;
        this.f29546h = Float.valueOf(Float.MAX_VALUE);
    }
}
