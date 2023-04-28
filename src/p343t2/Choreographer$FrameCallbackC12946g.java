package p343t2;

import android.view.Choreographer;
import p126h2.C7742c;
import p126h2.C7762i;

/* renamed from: t2.g */
/* loaded from: classes.dex */
public class Choreographer$FrameCallbackC12946g extends AbstractC12942c implements Choreographer.FrameCallback {

    /* renamed from: t */
    private C7762i f29035t;

    /* renamed from: m */
    private float f29028m = 1.0f;

    /* renamed from: n */
    private boolean f29029n = false;

    /* renamed from: o */
    private long f29030o = 0;

    /* renamed from: p */
    private float f29031p = 0.0f;

    /* renamed from: q */
    private int f29032q = 0;

    /* renamed from: r */
    private float f29033r = -2.14748365E9f;

    /* renamed from: s */
    private float f29034s = 2.14748365E9f;

    /* renamed from: u */
    protected boolean f29036u = false;

    /* renamed from: F */
    private void m5002F() {
        if (this.f29035t != null) {
            float f = this.f29031p;
            if (f < this.f29033r || f > this.f29034s) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f29033r), Float.valueOf(this.f29034s), Float.valueOf(this.f29031p)));
            }
        }
    }

    /* renamed from: m */
    private float m4996m() {
        C7762i iVar = this.f29035t;
        if (iVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / iVar.m21395i()) / Math.abs(this.f29028m);
    }

    /* renamed from: r */
    private boolean m4992r() {
        return m4993q() < 0.0f;
    }

    /* renamed from: A */
    public void m5007A(float f) {
        if (this.f29031p != f) {
            this.f29031p = C12948i.m4981b(f, m4994o(), m4995n());
            this.f29030o = 0L;
            m5020f();
        }
    }

    /* renamed from: B */
    public void m5006B(float f) {
        m5005C(this.f29033r, f);
    }

    /* renamed from: C */
    public void m5005C(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            C7762i iVar = this.f29035t;
            if (iVar == null) {
                f3 = -3.4028235E38f;
            } else {
                f3 = iVar.m21388p();
            }
            C7762i iVar2 = this.f29035t;
            if (iVar2 == null) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = iVar2.m21398f();
            }
            float b = C12948i.m4981b(f, f3, f4);
            float b2 = C12948i.m4981b(f2, f3, f4);
            if (b != this.f29033r || b2 != this.f29034s) {
                this.f29033r = b;
                this.f29034s = b2;
                m5007A((int) C12948i.m4981b(this.f29031p, b, b2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    /* renamed from: D */
    public void m5004D(int i) {
        m5005C(i, (int) this.f29034s);
    }

    /* renamed from: E */
    public void m5003E(float f) {
        this.f29028m = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p343t2.AbstractC12942c
    /* renamed from: a */
    public void mo5001a() {
        super.mo5001a();
        m5023c(m4992r());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        mo5001a();
        m4988v();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float f;
        float f2;
        m4989u();
        if (this.f29035t != null && isRunning()) {
            C7742c.m21543a("LottieValueAnimator#doFrame");
            long j2 = this.f29030o;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float m = ((float) j3) / m4996m();
            float f3 = this.f29031p;
            if (m4992r()) {
                m = -m;
            }
            float f4 = f3 + m;
            this.f29031p = f4;
            boolean z = !C12948i.m4979d(f4, m4994o(), m4995n());
            this.f29031p = C12948i.m4981b(this.f29031p, m4994o(), m4995n());
            this.f29030o = j;
            m5020f();
            if (z) {
                if (getRepeatCount() == -1 || this.f29032q < getRepeatCount()) {
                    m5022d();
                    this.f29032q++;
                    if (getRepeatMode() == 2) {
                        this.f29029n = !this.f29029n;
                        m4985y();
                    } else {
                        if (m4992r()) {
                            f = m4995n();
                        } else {
                            f = m4994o();
                        }
                        this.f29031p = f;
                    }
                    this.f29030o = j;
                } else {
                    if (this.f29028m < 0.0f) {
                        f2 = m4994o();
                    } else {
                        f2 = m4995n();
                    }
                    this.f29031p = f2;
                    m4988v();
                    m5023c(m4992r());
                }
            }
            m5002F();
            C7742c.m21542b("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float o;
        float n;
        float o2;
        if (this.f29035t == null) {
            return 0.0f;
        }
        if (m4992r()) {
            o = m4995n() - this.f29031p;
            n = m4995n();
            o2 = m4994o();
        } else {
            o = this.f29031p - m4994o();
            n = m4995n();
            o2 = m4994o();
        }
        return o / (n - o2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m4998k());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C7762i iVar = this.f29035t;
        if (iVar == null) {
            return 0L;
        }
        return iVar.m21400d();
    }

    /* renamed from: h */
    public void m5000h() {
        this.f29035t = null;
        this.f29033r = -2.14748365E9f;
        this.f29034s = 2.14748365E9f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f29036u;
    }

    /* renamed from: j */
    public void m4999j() {
        m4988v();
        m5023c(m4992r());
    }

    /* renamed from: k */
    public float m4998k() {
        C7762i iVar = this.f29035t;
        if (iVar == null) {
            return 0.0f;
        }
        return (this.f29031p - iVar.m21388p()) / (this.f29035t.m21398f() - this.f29035t.m21388p());
    }

    /* renamed from: l */
    public float m4997l() {
        return this.f29031p;
    }

    /* renamed from: n */
    public float m4995n() {
        C7762i iVar = this.f29035t;
        if (iVar == null) {
            return 0.0f;
        }
        float f = this.f29034s;
        if (f == 2.14748365E9f) {
            return iVar.m21398f();
        }
        return f;
    }

    /* renamed from: o */
    public float m4994o() {
        C7762i iVar = this.f29035t;
        if (iVar == null) {
            return 0.0f;
        }
        float f = this.f29033r;
        if (f == -2.14748365E9f) {
            return iVar.m21388p();
        }
        return f;
    }

    /* renamed from: q */
    public float m4993q() {
        return this.f29028m;
    }

    /* renamed from: s */
    public void m4991s() {
        m4988v();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f29029n) {
            this.f29029n = false;
            m4985y();
        }
    }

    /* renamed from: t */
    public void m4990t() {
        float f;
        this.f29036u = true;
        m5021e(m4992r());
        if (m4992r()) {
            f = m4995n();
        } else {
            f = m4994o();
        }
        m5007A((int) f);
        this.f29030o = 0L;
        this.f29032q = 0;
        m4989u();
    }

    /* renamed from: u */
    protected void m4989u() {
        if (isRunning()) {
            m4987w(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: v */
    protected void m4988v() {
        m4987w(true);
    }

    /* renamed from: w */
    protected void m4987w(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f29036u = false;
        }
    }

    /* renamed from: x */
    public void m4986x() {
        this.f29036u = true;
        m4989u();
        this.f29030o = 0L;
        if (m4992r() && m4997l() == m4994o()) {
            this.f29031p = m4995n();
        } else if (!m4992r() && m4997l() == m4995n()) {
            this.f29031p = m4994o();
        }
    }

    /* renamed from: y */
    public void m4985y() {
        m5003E(-m4993q());
    }

    /* renamed from: z */
    public void m4984z(C7762i iVar) {
        boolean z;
        if (this.f29035t == null) {
            z = true;
        } else {
            z = false;
        }
        this.f29035t = iVar;
        if (z) {
            m5005C(Math.max(this.f29033r, iVar.m21388p()), Math.min(this.f29034s, iVar.m21398f()));
        } else {
            m5005C((int) iVar.m21388p(), (int) iVar.m21398f());
        }
        float f = this.f29031p;
        this.f29031p = 0.0f;
        m5007A((int) f);
        m5020f();
    }
}
