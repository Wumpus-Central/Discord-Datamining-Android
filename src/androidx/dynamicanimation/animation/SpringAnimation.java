package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.DynamicAnimation;
import p166j1.AbstractC9460a;
import p166j1.C9461b;

/* loaded from: classes.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {

    /* renamed from: A */
    private C2851b f35675A;

    /* renamed from: B */
    private float f35676B;

    /* renamed from: C */
    private boolean f35677C;

    public SpringAnimation(C9461b bVar) {
        super(bVar);
        this.f35675A = null;
        this.f35676B = Float.MAX_VALUE;
        this.f35677C = false;
    }

    /* renamed from: s */
    private void m36509s() {
        C2851b bVar = this.f35675A;
        if (bVar != null) {
            double a = bVar.m36496a();
            if (a > this.f3790g) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a < this.f3791h) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: c */
    public void mo36516c() {
        super.mo36516c();
        float f = this.f35676B;
        if (f != Float.MAX_VALUE) {
            C2851b bVar = this.f35675A;
            if (bVar == null) {
                this.f35675A = new C2851b(f);
            } else {
                bVar.m36492e(f);
            }
            this.f35676B = Float.MAX_VALUE;
        }
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: l */
    public void mo36515l() {
        m36509s();
        this.f35675A.m36490g(m36552f());
        super.mo36515l();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: n */
    boolean mo36514n(long j) {
        if (this.f35677C) {
            float f = this.f35676B;
            if (f != Float.MAX_VALUE) {
                this.f35675A.m36492e(f);
                this.f35676B = Float.MAX_VALUE;
            }
            this.f3785b = this.f35675A.m36496a();
            this.f3784a = 0.0f;
            this.f35677C = false;
            return true;
        }
        if (this.f35676B != Float.MAX_VALUE) {
            long j2 = j / 2;
            DynamicAnimation.C2843p h = this.f35675A.m36489h(this.f3785b, this.f3784a, j2);
            this.f35675A.m36492e(this.f35676B);
            this.f35676B = Float.MAX_VALUE;
            DynamicAnimation.C2843p h2 = this.f35675A.m36489h(h.f3798a, h.f3799b, j2);
            this.f3785b = h2.f3798a;
            this.f3784a = h2.f3799b;
        } else {
            DynamicAnimation.C2843p h3 = this.f35675A.m36489h(this.f3785b, this.f3784a, j);
            this.f3785b = h3.f3798a;
            this.f3784a = h3.f3799b;
        }
        float max = Math.max(this.f3785b, this.f3791h);
        this.f3785b = max;
        float min = Math.min(max, this.f3790g);
        this.f3785b = min;
        if (!m36510r(min, this.f3784a)) {
            return false;
        }
        this.f3785b = this.f35675A.m36496a();
        this.f3784a = 0.0f;
        return true;
    }

    /* renamed from: o */
    public void m36513o(float f) {
        if (m36551g()) {
            this.f35676B = f;
            return;
        }
        if (this.f35675A == null) {
            this.f35675A = new C2851b(f);
        }
        this.f35675A.m36492e(f);
        mo36515l();
    }

    /* renamed from: p */
    public boolean m36512p() {
        return this.f35675A.f3813b > 0.0d;
    }

    /* renamed from: q */
    public C2851b m36511q() {
        return this.f35675A;
    }

    /* renamed from: r */
    boolean m36510r(float f, float f2) {
        return this.f35675A.m36494c(f, f2);
    }

    /* renamed from: t */
    public SpringAnimation m36508t(C2851b bVar) {
        this.f35675A = bVar;
        return this;
    }

    /* renamed from: u */
    public void m36507u() {
        if (!m36512p()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.f3789f) {
            this.f35677C = true;
        }
    }

    public <K> SpringAnimation(K k, AbstractC9460a<K> aVar) {
        super(k, aVar);
        this.f35675A = null;
        this.f35676B = Float.MAX_VALUE;
        this.f35677C = false;
    }

    public <K> SpringAnimation(K k, AbstractC9460a<K> aVar, float f) {
        super(k, aVar);
        this.f35675A = null;
        this.f35676B = Float.MAX_VALUE;
        this.f35677C = false;
        this.f35675A = new C2851b(f);
    }
}
