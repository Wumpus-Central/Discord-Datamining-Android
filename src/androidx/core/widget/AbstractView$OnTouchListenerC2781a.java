package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C2733w0;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC2781a implements View.OnTouchListener {

    /* renamed from: B */
    private static final int f35672B = ViewConfiguration.getTapTimeout();

    /* renamed from: A */
    private boolean f35673A;

    /* renamed from: m */
    final View f3689m;

    /* renamed from: n */
    private Runnable f3690n;

    /* renamed from: q */
    private int f3693q;

    /* renamed from: r */
    private int f3694r;

    /* renamed from: v */
    private boolean f3698v;

    /* renamed from: w */
    boolean f3699w;

    /* renamed from: x */
    boolean f3700x;

    /* renamed from: y */
    boolean f3701y;

    /* renamed from: z */
    private boolean f3702z;

    /* renamed from: k */
    final C0048a f3687k = new C0048a();

    /* renamed from: l */
    private final Interpolator f3688l = new AccelerateInterpolator();

    /* renamed from: o */
    private float[] f3691o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f3692p = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: s */
    private float[] f3695s = {0.0f, 0.0f};

    /* renamed from: t */
    private float[] f3696t = {0.0f, 0.0f};

    /* renamed from: u */
    private float[] f3697u = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    public static class C0048a {

        /* renamed from: a */
        private int f3703a;

        /* renamed from: b */
        private int f3704b;

        /* renamed from: c */
        private float f3705c;

        /* renamed from: d */
        private float f3706d;

        /* renamed from: j */
        private float f3712j;

        /* renamed from: k */
        private int f3713k;

        /* renamed from: e */
        private long f3707e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f3711i = -1;

        /* renamed from: f */
        private long f3708f = 0;

        /* renamed from: g */
        private int f3709g = 0;

        /* renamed from: h */
        private int f3710h = 0;

        C0048a() {
        }

        /* renamed from: e */
        private float m36744e(long j) {
            long j2 = this.f3707e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f3711i;
            if (j3 < 0 || j < j3) {
                return AbstractView$OnTouchListenerC2781a.m36765e(((float) (j - j2)) / this.f3703a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f3712j;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerC2781a.m36765e(((float) (j - j3)) / this.f3713k, 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m36742g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void m36748a() {
            if (this.f3708f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m36742g(m36744e(currentAnimationTimeMillis));
                this.f3708f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f3708f)) * g;
                this.f3709g = (int) (this.f3705c * f);
                this.f3710h = (int) (f * this.f3706d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int m36747b() {
            return this.f3709g;
        }

        /* renamed from: c */
        public int m36746c() {
            return this.f3710h;
        }

        /* renamed from: d */
        public int m36745d() {
            float f = this.f3705c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int m36743f() {
            float f = this.f3706d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean m36741h() {
            if (this.f3711i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= this.f3711i + this.f3713k) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public void m36740i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3713k = AbstractView$OnTouchListenerC2781a.m36764f((int) (currentAnimationTimeMillis - this.f3707e), 0, this.f3704b);
            this.f3712j = m36744e(currentAnimationTimeMillis);
            this.f3711i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m36739j(int i) {
            this.f3704b = i;
        }

        /* renamed from: k */
        public void m36738k(int i) {
            this.f3703a = i;
        }

        /* renamed from: l */
        public void m36737l(float f, float f2) {
            this.f3705c = f;
            this.f3706d = f2;
        }

        /* renamed from: m */
        public void m36736m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3707e = currentAnimationTimeMillis;
            this.f3711i = -1L;
            this.f3708f = currentAnimationTimeMillis;
            this.f3712j = 0.5f;
            this.f3709g = 0;
            this.f3710h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes.dex */
    public class RunnableC2782b implements Runnable {
        RunnableC2782b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC2781a aVar = AbstractView$OnTouchListenerC2781a.this;
            if (aVar.f3701y) {
                if (aVar.f3699w) {
                    aVar.f3699w = false;
                    aVar.f3687k.m36736m();
                }
                C0048a aVar2 = AbstractView$OnTouchListenerC2781a.this.f3687k;
                if (aVar2.m36741h() || !AbstractView$OnTouchListenerC2781a.this.m36750u()) {
                    AbstractView$OnTouchListenerC2781a.this.f3701y = false;
                    return;
                }
                AbstractView$OnTouchListenerC2781a aVar3 = AbstractView$OnTouchListenerC2781a.this;
                if (aVar3.f3700x) {
                    aVar3.f3700x = false;
                    aVar3.m36767c();
                }
                aVar2.m36748a();
                AbstractView$OnTouchListenerC2781a.this.mo36700j(aVar2.m36747b(), aVar2.m36746c());
                C2733w0.m37006i0(AbstractView$OnTouchListenerC2781a.this.f3689m, this);
            }
        }
    }

    public AbstractView$OnTouchListenerC2781a(View view) {
        this.f3689m = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m36756o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m36755p(f3, f3);
        m36759l(1);
        m36757n(Float.MAX_VALUE, Float.MAX_VALUE);
        m36752s(0.2f, 0.2f);
        m36751t(1.0f, 1.0f);
        m36760k(f35672B);
        m36753r(500);
        m36754q(500);
    }

    /* renamed from: d */
    private float m36766d(int i, float f, float f2, float f3) {
        float h = m36762h(this.f3691o[i], f2, this.f3692p[i], f);
        int i2 = (h > 0.0f ? 1 : (h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f3695s[i];
        float f5 = this.f3696t[i];
        float f6 = this.f3697u[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m36765e(h * f7, f5, f6);
        }
        return -m36765e((-h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m36765e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m36764f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m36763g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f3693q;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f3701y && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: h */
    private float m36762h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m36765e(f * f2, 0.0f, f3);
        float g = m36763g(f2 - f4, e) - m36763g(f4, e);
        if (g < 0.0f) {
            f5 = -this.f3688l.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f3688l.getInterpolation(g);
        }
        return m36765e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m36761i() {
        if (this.f3699w) {
            this.f3701y = false;
        } else {
            this.f3687k.m36740i();
        }
    }

    /* renamed from: v */
    private void m36749v() {
        int i;
        if (this.f3690n == null) {
            this.f3690n = new RunnableC2782b();
        }
        this.f3701y = true;
        this.f3699w = true;
        if (this.f3698v || (i = this.f3694r) <= 0) {
            this.f3690n.run();
        } else {
            C2733w0.m37004j0(this.f3689m, this.f3690n, i);
        }
        this.f3698v = true;
    }

    /* renamed from: a */
    public abstract boolean mo36702a(int i);

    /* renamed from: b */
    public abstract boolean mo36701b(int i);

    /* renamed from: c */
    void m36767c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3689m.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo36700j(int i, int i2);

    /* renamed from: k */
    public AbstractView$OnTouchListenerC2781a m36760k(int i) {
        this.f3694r = i;
        return this;
    }

    /* renamed from: l */
    public AbstractView$OnTouchListenerC2781a m36759l(int i) {
        this.f3693q = i;
        return this;
    }

    /* renamed from: m */
    public AbstractView$OnTouchListenerC2781a m36758m(boolean z) {
        if (this.f3702z && !z) {
            m36761i();
        }
        this.f3702z = z;
        return this;
    }

    /* renamed from: n */
    public AbstractView$OnTouchListenerC2781a m36757n(float f, float f2) {
        float[] fArr = this.f3692p;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public AbstractView$OnTouchListenerC2781a m36756o(float f, float f2) {
        float[] fArr = this.f3697u;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3702z
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m36761i()
            goto L_0x0058
        L_0x001a:
            r5.f3700x = r2
            r5.f3698v = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3689m
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m36766d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3689m
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m36766d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3687k
            r7.m36737l(r0, r6)
            boolean r6 = r5.f3701y
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.m36750u()
            if (r6 == 0) goto L_0x0058
            r5.m36749v()
        L_0x0058:
            boolean r6 = r5.f35673A
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f3701y
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC2781a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractView$OnTouchListenerC2781a m36755p(float f, float f2) {
        float[] fArr = this.f3696t;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractView$OnTouchListenerC2781a m36754q(int i) {
        this.f3687k.m36739j(i);
        return this;
    }

    /* renamed from: r */
    public AbstractView$OnTouchListenerC2781a m36753r(int i) {
        this.f3687k.m36738k(i);
        return this;
    }

    /* renamed from: s */
    public AbstractView$OnTouchListenerC2781a m36752s(float f, float f2) {
        float[] fArr = this.f3691o;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public AbstractView$OnTouchListenerC2781a m36751t(float f, float f2) {
        float[] fArr = this.f3695s;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m36750u() {
        C0048a aVar = this.f3687k;
        int f = aVar.m36743f();
        int d = aVar.m36745d();
        if ((f == 0 || !mo36701b(f)) && (d == 0 || !mo36702a(d))) {
            return false;
        }
        return true;
    }
}
