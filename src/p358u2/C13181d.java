package p358u2;

/* renamed from: u2.d */
/* loaded from: classes.dex */
public class C13181d {

    /* renamed from: a */
    private float f29565a;

    /* renamed from: b */
    private float f29566b;

    public C13181d(float f, float f2) {
        this.f29565a = f;
        this.f29566b = f2;
    }

    /* renamed from: a */
    public boolean m4400a(float f, float f2) {
        return this.f29565a == f && this.f29566b == f2;
    }

    /* renamed from: b */
    public float m4399b() {
        return this.f29565a;
    }

    /* renamed from: c */
    public float m4398c() {
        return this.f29566b;
    }

    /* renamed from: d */
    public void m4397d(float f, float f2) {
        this.f29565a = f;
        this.f29566b = f2;
    }

    public String toString() {
        return m4399b() + "x" + m4398c();
    }

    public C13181d() {
        this(1.0f, 1.0f);
    }
}
