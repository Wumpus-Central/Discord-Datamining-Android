package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.DynamicAnimation;

/* renamed from: androidx.dynamicanimation.animation.b */
/* loaded from: classes.dex */
public final class C2851b {

    /* renamed from: a */
    double f3812a;

    /* renamed from: b */
    double f3813b;

    /* renamed from: c */
    private boolean f3814c;

    /* renamed from: d */
    private double f3815d;

    /* renamed from: e */
    private double f3816e;

    /* renamed from: f */
    private double f3817f;

    /* renamed from: g */
    private double f3818g;

    /* renamed from: h */
    private double f3819h;

    /* renamed from: i */
    private double f3820i;

    /* renamed from: j */
    private final DynamicAnimation.C2843p f3821j;

    public C2851b() {
        this.f3812a = Math.sqrt(1500.0d);
        this.f3813b = 0.5d;
        this.f3814c = false;
        this.f3820i = Double.MAX_VALUE;
        this.f3821j = new DynamicAnimation.C2843p();
    }

    /* renamed from: b */
    private void m36495b() {
        if (!this.f3814c) {
            if (this.f3820i != Double.MAX_VALUE) {
                double d = this.f3813b;
                if (d > 1.0d) {
                    double d2 = this.f3812a;
                    this.f3817f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                    double d3 = this.f3813b;
                    double d4 = this.f3812a;
                    this.f3818g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.f3819h = this.f3812a * Math.sqrt(1.0d - (d * d));
                }
                this.f3814c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: a */
    public float m36496a() {
        return (float) this.f3820i;
    }

    /* renamed from: c */
    public boolean m36494c(float f, float f2) {
        if (Math.abs(f2) >= this.f3816e || Math.abs(f - m36496a()) >= this.f3815d) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public C2851b m36493d(float f) {
        if (f >= 0.0f) {
            this.f3813b = f;
            this.f3814c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public C2851b m36492e(float f) {
        this.f3820i = f;
        return this;
    }

    /* renamed from: f */
    public C2851b m36491f(float f) {
        if (f > 0.0f) {
            this.f3812a = Math.sqrt(f);
            this.f3814c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m36490g(double d) {
        double abs = Math.abs(d);
        this.f3815d = abs;
        this.f3816e = abs * 62.5d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public DynamicAnimation.C2843p m36489h(double d, double d2, long j) {
        double d3;
        double d4;
        m36495b();
        double d5 = j / 1000.0d;
        double d6 = d - this.f3820i;
        double d7 = this.f3813b;
        if (d7 > 1.0d) {
            double d8 = this.f3818g;
            double d9 = this.f3817f;
            double d10 = d6 - (((d8 * d6) - d2) / (d8 - d9));
            double d11 = ((d6 * d8) - d2) / (d8 - d9);
            d4 = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.f3817f * d5) * d11);
            double d12 = this.f3818g;
            double pow = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.f3817f;
            d3 = pow + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f3812a;
            double d15 = d2 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            d4 = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double pow2 = d16 * Math.pow(2.718281828459045d, (-this.f3812a) * d5);
            double d17 = this.f3812a;
            d3 = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (pow2 * (-d17));
        } else {
            double d18 = 1.0d / this.f3819h;
            double d19 = this.f3812a;
            double d20 = d18 * ((d7 * d19 * d6) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.f3819h * d5) * d6) + (Math.sin(this.f3819h * d5) * d20));
            double d21 = this.f3812a;
            double d22 = this.f3813b;
            double pow4 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d23 = this.f3819h;
            double sin = (-d23) * d6 * Math.sin(d23 * d5);
            double d24 = this.f3819h;
            d3 = ((-d21) * pow3 * d22) + (pow4 * (sin + (d20 * d24 * Math.cos(d24 * d5))));
            d4 = pow3;
        }
        DynamicAnimation.C2843p pVar = this.f3821j;
        pVar.f3798a = (float) (d4 + this.f3820i);
        pVar.f3799b = (float) d3;
        return pVar;
    }

    public C2851b(float f) {
        this.f3812a = Math.sqrt(1500.0d);
        this.f3813b = 0.5d;
        this.f3814c = false;
        this.f3820i = Double.MAX_VALUE;
        this.f3821j = new DynamicAnimation.C2843p();
        this.f3820i = f;
    }
}
