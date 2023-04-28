package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.AbstractC3285b;
import com.reactnativecommunity.webview.RNCWebViewManager;
import lb.C10395a;
import p102fb.C7103c;
import p237n1.C10690b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.d */
/* loaded from: classes3.dex */
public final class C5678d extends AbstractC5690i<ObjectAnimator> {

    /* renamed from: l */
    private static final int[] f11104l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    private static final int[] f11105m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    private static final int[] f11106n = {RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 2350, 3700, 5050};

    /* renamed from: o */
    private static final Property<C5678d, Float> f11107o = new C5681c(Float.class, "animationFraction");

    /* renamed from: p */
    private static final Property<C5678d, Float> f11108p = new C0160d(Float.class, "completeEndFraction");

    /* renamed from: d */
    private ObjectAnimator f11109d;

    /* renamed from: e */
    private ObjectAnimator f11110e;

    /* renamed from: g */
    private final AbstractC5676b f11112g;

    /* renamed from: i */
    private float f11114i;

    /* renamed from: j */
    private float f11115j;

    /* renamed from: h */
    private int f11113h = 0;

    /* renamed from: k */
    AbstractC3285b f11116k = null;

    /* renamed from: f */
    private final C10690b f11111f = new C10690b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.d$a */
    /* loaded from: classes3.dex */
    public class C5679a extends AnimatorListenerAdapter {
        C5679a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C5678d dVar = C5678d.this;
            dVar.f11113h = (dVar.f11113h + 4) % C5678d.this.f11112g.f11096c.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.d$b */
    /* loaded from: classes3.dex */
    public class C5680b extends AnimatorListenerAdapter {
        C5680b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C5678d.this.mo27745a();
            C5678d dVar = C5678d.this;
            AbstractC3285b bVar = dVar.f11116k;
            if (bVar != null) {
                bVar.mo27801a(dVar.f11142a);
            }
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$c */
    /* loaded from: classes3.dex */
    class C5681c extends Property<C5678d, Float> {
        C5681c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C5678d dVar) {
            return Float.valueOf(dVar.m27788o());
        }

        /* renamed from: b */
        public void set(C5678d dVar, Float f) {
            dVar.m27783t(f.floatValue());
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$d */
    /* loaded from: classes3.dex */
    class C0160d extends Property<C5678d, Float> {
        C0160d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C5678d dVar) {
            return Float.valueOf(dVar.m27787p());
        }

        /* renamed from: b */
        public void set(C5678d dVar, Float f) {
            dVar.m27782u(f.floatValue());
        }
    }

    public C5678d(C5682e eVar) {
        super(1);
        this.f11112g = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public float m27788o() {
        return this.f11114i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public float m27787p() {
        return this.f11115j;
    }

    /* renamed from: q */
    private void m27786q() {
        if (this.f11109d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f11107o, 0.0f, 1.0f);
            this.f11109d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f11109d.setInterpolator(null);
            this.f11109d.setRepeatCount(-1);
            this.f11109d.addListener(new C5679a());
        }
        if (this.f11110e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f11108p, 0.0f, 1.0f);
            this.f11110e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f11110e.setInterpolator(this.f11111f);
            this.f11110e.addListener(new C5680b());
        }
    }

    /* renamed from: r */
    private void m27785r(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float b = m27744b(i, f11106n[i2], 333);
            if (b >= 0.0f && b <= 1.0f) {
                int i3 = i2 + this.f11113h;
                int[] iArr = this.f11112g.f11096c;
                int length = i3 % iArr.length;
                this.f11144c[0] = C7103c.m23394b().evaluate(this.f11111f.getInterpolation(b), Integer.valueOf(C10395a.m13520a(iArr[length], this.f11142a.getAlpha())), Integer.valueOf(C10395a.m13520a(this.f11112g.f11096c[(length + 1) % iArr.length], this.f11142a.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m27782u(float f) {
        this.f11115j = f;
    }

    /* renamed from: v */
    private void m27781v(int i) {
        float[] fArr = this.f11143b;
        float f = this.f11114i;
        fArr[0] = (f * 1520.0f) - 20.0f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float b = m27744b(i, f11104l[i2], 667);
            float[] fArr2 = this.f11143b;
            fArr2[1] = fArr2[1] + (this.f11111f.getInterpolation(b) * 250.0f);
            float b2 = m27744b(i, f11105m[i2], 667);
            float[] fArr3 = this.f11143b;
            fArr3[0] = fArr3[0] + (this.f11111f.getInterpolation(b2) * 250.0f);
        }
        float[] fArr4 = this.f11143b;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = f2 + ((f3 - f2) * this.f11115j);
        fArr4[0] = f4;
        fArr4[0] = f4 / 360.0f;
        fArr4[1] = f3 / 360.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC5690i
    /* renamed from: a */
    public void mo27745a() {
        ObjectAnimator objectAnimator = this.f11109d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC5690i
    /* renamed from: c */
    public void mo27743c() {
        m27784s();
    }

    @Override // com.google.android.material.progressindicator.AbstractC5690i
    /* renamed from: d */
    public void mo27742d(AbstractC3285b bVar) {
        this.f11116k = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC5690i
    /* renamed from: f */
    public void mo27740f() {
        ObjectAnimator objectAnimator = this.f11110e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f11142a.isVisible()) {
                this.f11110e.start();
            } else {
                mo27745a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC5690i
    /* renamed from: g */
    public void mo27739g() {
        m27786q();
        m27784s();
        this.f11109d.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC5690i
    /* renamed from: h */
    public void mo27738h() {
        this.f11116k = null;
    }

    /* renamed from: s */
    void m27784s() {
        this.f11113h = 0;
        this.f11144c[0] = C10395a.m13520a(this.f11112g.f11096c[0], this.f11142a.getAlpha());
        this.f11115j = 0.0f;
    }

    /* renamed from: t */
    void m27783t(float f) {
        this.f11114i = f;
        int i = (int) (f * 5400.0f);
        m27781v(i);
        m27785r(i);
        this.f11142a.invalidateSelf();
    }
}
