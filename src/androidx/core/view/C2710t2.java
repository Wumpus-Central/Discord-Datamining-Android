package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p002a1.C1239e;

/* renamed from: androidx.core.view.t2 */
/* loaded from: classes.dex */
public final class C2710t2 {

    /* renamed from: a */
    private C2718e f3610a;

    /* renamed from: androidx.core.view.t2$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2712b {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        public AbstractC2712b(int i) {
            this.mDispatchMode = i;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(C2710t2 t2Var) {
        }

        public void onPrepare(C2710t2 t2Var) {
        }

        public abstract WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<C2710t2> list);

        public C2711a onStart(C2710t2 t2Var, C2711a aVar) {
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.t2$c */
    /* loaded from: classes.dex */
    public static class C2713c extends C2718e {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.view.t2$c$a */
        /* loaded from: classes.dex */
        public static class View$OnApplyWindowInsetsListenerC2714a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            final AbstractC2712b f3613a;

            /* renamed from: b */
            private WindowInsetsCompat f3614b;

            /* renamed from: androidx.core.view.t2$c$a$a */
            /* loaded from: classes.dex */
            class C0046a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                final /* synthetic */ C2710t2 f3615a;

                /* renamed from: b */
                final /* synthetic */ WindowInsetsCompat f3616b;

                /* renamed from: c */
                final /* synthetic */ WindowInsetsCompat f3617c;

                /* renamed from: d */
                final /* synthetic */ int f3618d;

                /* renamed from: e */
                final /* synthetic */ View f3619e;

                C0046a(C2710t2 t2Var, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i, View view) {
                    this.f3615a = t2Var;
                    this.f3616b = windowInsetsCompat;
                    this.f3617c = windowInsetsCompat2;
                    this.f3618d = i;
                    this.f3619e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f3615a.m37117d(valueAnimator.getAnimatedFraction());
                    C2713c.m37106i(this.f3619e, C2713c.m37102m(this.f3616b, this.f3617c, this.f3615a.m37119b(), this.f3618d), Collections.singletonList(this.f3615a));
                }
            }

            /* renamed from: androidx.core.view.t2$c$a$b */
            /* loaded from: classes.dex */
            class C2715b extends AnimatorListenerAdapter {

                /* renamed from: a */
                final /* synthetic */ C2710t2 f3621a;

                /* renamed from: b */
                final /* synthetic */ View f3622b;

                C2715b(C2710t2 t2Var, View view) {
                    this.f3621a = t2Var;
                    this.f3622b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f3621a.m37117d(1.0f);
                    C2713c.m37108g(this.f3622b, this.f3621a);
                }
            }

            /* renamed from: androidx.core.view.t2$c$a$c */
            /* loaded from: classes.dex */
            class RunnableC0047c implements Runnable {

                /* renamed from: k */
                final /* synthetic */ View f3624k;

                /* renamed from: l */
                final /* synthetic */ C2710t2 f3625l;

                /* renamed from: m */
                final /* synthetic */ C2711a f3626m;

                /* renamed from: n */
                final /* synthetic */ ValueAnimator f3627n;

                RunnableC0047c(View view, C2710t2 t2Var, C2711a aVar, ValueAnimator valueAnimator) {
                    this.f3624k = view;
                    this.f3625l = t2Var;
                    this.f3626m = aVar;
                    this.f3627n = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C2713c.m37105j(this.f3624k, this.f3625l, this.f3626m);
                    this.f3627n.start();
                }
            }

            View$OnApplyWindowInsetsListenerC2714a(View view, AbstractC2712b bVar) {
                WindowInsetsCompat windowInsetsCompat;
                this.f3613a = bVar;
                WindowInsetsCompat I = C2733w0.m37049I(view);
                if (I != null) {
                    windowInsetsCompat = new WindowInsetsCompat.C2531b(I).m37499a();
                } else {
                    windowInsetsCompat = null;
                }
                this.f3614b = windowInsetsCompat;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f3614b = WindowInsetsCompat.m37501z(windowInsets, view);
                    return C2713c.m37104k(view, windowInsets);
                }
                WindowInsetsCompat z = WindowInsetsCompat.m37501z(windowInsets, view);
                if (this.f3614b == null) {
                    this.f3614b = C2733w0.m37049I(view);
                }
                if (this.f3614b == null) {
                    this.f3614b = z;
                    return C2713c.m37104k(view, windowInsets);
                }
                AbstractC2712b l = C2713c.m37103l(view);
                if (l != null && Objects.equals(l.mDispachedInsets, windowInsets)) {
                    return C2713c.m37104k(view, windowInsets);
                }
                int d = C2713c.m37111d(z, this.f3614b);
                if (d == 0) {
                    return C2713c.m37104k(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = this.f3614b;
                C2710t2 t2Var = new C2710t2(d, new DecelerateInterpolator(), 160L);
                t2Var.m37117d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(t2Var.m37120a());
                C2711a e = C2713c.m37110e(z, windowInsetsCompat, d);
                C2713c.m37107h(view, t2Var, windowInsets, false);
                duration.addUpdateListener(new C0046a(t2Var, z, windowInsetsCompat, d, view));
                duration.addListener(new C2715b(t2Var, view));
                ViewTreeObserver$OnPreDrawListenerC2722u0.m37085a(view, new RunnableC0047c(view, t2Var, e, duration));
                this.f3614b = z;
                return C2713c.m37104k(view, windowInsets);
            }
        }

        C2713c(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: d */
        static int m37111d(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!windowInsetsCompat.m37521f(i2).equals(windowInsetsCompat2.m37521f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        /* renamed from: e */
        static C2711a m37110e(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i) {
            Insets f = windowInsetsCompat.m37521f(i);
            Insets f2 = windowInsetsCompat2.m37521f(i);
            return new C2711a(Insets.m37935b(Math.min(f.f3326a, f2.f3326a), Math.min(f.f3327b, f2.f3327b), Math.min(f.f3328c, f2.f3328c), Math.min(f.f3329d, f2.f3329d)), Insets.m37935b(Math.max(f.f3326a, f2.f3326a), Math.max(f.f3327b, f2.f3327b), Math.max(f.f3328c, f2.f3328c), Math.max(f.f3329d, f2.f3329d)));
        }

        /* renamed from: f */
        private static View.OnApplyWindowInsetsListener m37109f(View view, AbstractC2712b bVar) {
            return new View$OnApplyWindowInsetsListenerC2714a(view, bVar);
        }

        /* renamed from: g */
        static void m37108g(View view, C2710t2 t2Var) {
            AbstractC2712b l = m37103l(view);
            if (l != null) {
                l.onEnd(t2Var);
                if (l.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m37108g(viewGroup.getChildAt(i), t2Var);
                }
            }
        }

        /* renamed from: h */
        static void m37107h(View view, C2710t2 t2Var, WindowInsets windowInsets, boolean z) {
            AbstractC2712b l = m37103l(view);
            if (l != null) {
                l.mDispachedInsets = windowInsets;
                if (!z) {
                    l.onPrepare(t2Var);
                    if (l.getDispatchMode() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m37107h(viewGroup.getChildAt(i), t2Var, windowInsets, z);
                }
            }
        }

        /* renamed from: i */
        static void m37106i(View view, WindowInsetsCompat windowInsetsCompat, List<C2710t2> list) {
            AbstractC2712b l = m37103l(view);
            if (l != null) {
                windowInsetsCompat = l.onProgress(windowInsetsCompat, list);
                if (l.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m37106i(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        /* renamed from: j */
        static void m37105j(View view, C2710t2 t2Var, C2711a aVar) {
            AbstractC2712b l = m37103l(view);
            if (l != null) {
                l.onStart(t2Var, aVar);
                if (l.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m37105j(viewGroup.getChildAt(i), t2Var, aVar);
                }
            }
        }

        /* renamed from: k */
        static WindowInsets m37104k(View view, WindowInsets windowInsets) {
            if (view.getTag(C1239e.f35048Z) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: l */
        static AbstractC2712b m37103l(View view) {
            Object tag = view.getTag(C1239e.f33g0);
            if (tag instanceof View$OnApplyWindowInsetsListenerC2714a) {
                return ((View$OnApplyWindowInsetsListenerC2714a) tag).f3613a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: m */
        static WindowInsetsCompat m37102m(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f, int i) {
            WindowInsetsCompat.C2531b bVar = new WindowInsetsCompat.C2531b(windowInsetsCompat);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    bVar.m37498b(i2, windowInsetsCompat.m37521f(i2));
                } else {
                    Insets f2 = windowInsetsCompat.m37521f(i2);
                    Insets f3 = windowInsetsCompat2.m37521f(i2);
                    float f4 = 1.0f - f;
                    bVar.m37498b(i2, WindowInsetsCompat.m37510q(f2, (int) (((f2.f3326a - f3.f3326a) * f4) + 0.5d), (int) (((f2.f3327b - f3.f3327b) * f4) + 0.5d), (int) (((f2.f3328c - f3.f3328c) * f4) + 0.5d), (int) (((f2.f3329d - f3.f3329d) * f4) + 0.5d)));
                }
            }
            return bVar.m37499a();
        }

        /* renamed from: n */
        static void m37101n(View view, AbstractC2712b bVar) {
            Object tag = view.getTag(C1239e.f35048Z);
            if (bVar == null) {
                view.setTag(C1239e.f33g0, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener f = m37109f(view, bVar);
            view.setTag(C1239e.f33g0, f);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.t2$e */
    /* loaded from: classes.dex */
    public static class C2718e {

        /* renamed from: a */
        private final int f3634a;

        /* renamed from: b */
        private float f3635b;

        /* renamed from: c */
        private final Interpolator f3636c;

        /* renamed from: d */
        private final long f3637d;

        C2718e(int i, Interpolator interpolator, long j) {
            this.f3634a = i;
            this.f3636c = interpolator;
            this.f3637d = j;
        }

        /* renamed from: a */
        public long mo37095a() {
            return this.f3637d;
        }

        /* renamed from: b */
        public float mo37094b() {
            Interpolator interpolator = this.f3636c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f3635b);
            }
            return this.f3635b;
        }

        /* renamed from: c */
        public void mo37093c(float f) {
            this.f3635b = f;
        }
    }

    public C2710t2(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3610a = new C2716d(i, interpolator, j);
        } else {
            this.f3610a = new C2713c(i, interpolator, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m37118c(View view, AbstractC2712b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            C2716d.m37097g(view, bVar);
        } else {
            C2713c.m37101n(view, bVar);
        }
    }

    /* renamed from: e */
    static C2710t2 m37116e(WindowInsetsAnimation windowInsetsAnimation) {
        return new C2710t2(windowInsetsAnimation);
    }

    /* renamed from: a */
    public long m37120a() {
        return this.f3610a.mo37095a();
    }

    /* renamed from: b */
    public float m37119b() {
        return this.f3610a.mo37094b();
    }

    /* renamed from: d */
    public void m37117d(float f) {
        this.f3610a.mo37093c(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.t2$d */
    /* loaded from: classes.dex */
    public static class C2716d extends C2718e {

        /* renamed from: e */
        private final WindowInsetsAnimation f3629e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.view.t2$d$a */
        /* loaded from: classes.dex */
        public static class C2717a extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            private final AbstractC2712b f3630a;

            /* renamed from: b */
            private List<C2710t2> f3631b;

            /* renamed from: c */
            private ArrayList<C2710t2> f3632c;

            /* renamed from: d */
            private final HashMap<WindowInsetsAnimation, C2710t2> f3633d = new HashMap<>();

            C2717a(AbstractC2712b bVar) {
                super(bVar.getDispatchMode());
                this.f3630a = bVar;
            }

            /* renamed from: a */
            private C2710t2 m37096a(WindowInsetsAnimation windowInsetsAnimation) {
                C2710t2 t2Var = this.f3633d.get(windowInsetsAnimation);
                if (t2Var != null) {
                    return t2Var;
                }
                C2710t2 e = C2710t2.m37116e(windowInsetsAnimation);
                this.f3633d.put(windowInsetsAnimation, e);
                return e;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f3630a.onEnd(m37096a(windowInsetsAnimation));
                this.f3633d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f3630a.onPrepare(m37096a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<C2710t2> arrayList = this.f3632c;
                if (arrayList == null) {
                    ArrayList<C2710t2> arrayList2 = new ArrayList<>(list.size());
                    this.f3632c = arrayList2;
                    this.f3631b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    C2710t2 a = m37096a(windowInsetsAnimation);
                    fraction = windowInsetsAnimation.getFraction();
                    a.m37117d(fraction);
                    this.f3632c.add(a);
                }
                return this.f3630a.onProgress(WindowInsetsCompat.m37502y(windowInsets), this.f3631b).m37503x();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f3630a.onStart(m37096a(windowInsetsAnimation), C2711a.m37112d(bounds)).m37113c();
            }
        }

        C2716d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f3629e = windowInsetsAnimation;
        }

        /* renamed from: d */
        public static WindowInsetsAnimation.Bounds m37100d(C2711a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.m37115a().m37932e(), aVar.m37114b().m37932e());
        }

        /* renamed from: e */
        public static Insets m37099e(WindowInsetsAnimation.Bounds bounds) {
            android.graphics.Insets upperBound;
            upperBound = bounds.getUpperBound();
            return Insets.m37933d(upperBound);
        }

        /* renamed from: f */
        public static Insets m37098f(WindowInsetsAnimation.Bounds bounds) {
            android.graphics.Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return Insets.m37933d(lowerBound);
        }

        /* renamed from: g */
        public static void m37097g(View view, AbstractC2712b bVar) {
            C2717a aVar;
            if (bVar != null) {
                aVar = new C2717a(bVar);
            } else {
                aVar = null;
            }
            view.setWindowInsetsAnimationCallback(aVar);
        }

        @Override // androidx.core.view.C2710t2.C2718e
        /* renamed from: a */
        public long mo37095a() {
            long durationMillis;
            durationMillis = this.f3629e.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.C2710t2.C2718e
        /* renamed from: b */
        public float mo37094b() {
            float interpolatedFraction;
            interpolatedFraction = this.f3629e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.C2710t2.C2718e
        /* renamed from: c */
        public void mo37093c(float f) {
            this.f3629e.setFraction(f);
        }

        C2716d(int i, Interpolator interpolator, long j) {
            this(new WindowInsetsAnimation(i, interpolator, j));
        }
    }

    /* renamed from: androidx.core.view.t2$a */
    /* loaded from: classes.dex */
    public static final class C2711a {

        /* renamed from: a */
        private final Insets f3611a;

        /* renamed from: b */
        private final Insets f3612b;

        public C2711a(Insets insets, Insets insets2) {
            this.f3611a = insets;
            this.f3612b = insets2;
        }

        /* renamed from: d */
        public static C2711a m37112d(WindowInsetsAnimation.Bounds bounds) {
            return new C2711a(bounds);
        }

        /* renamed from: a */
        public Insets m37115a() {
            return this.f3611a;
        }

        /* renamed from: b */
        public Insets m37114b() {
            return this.f3612b;
        }

        /* renamed from: c */
        public WindowInsetsAnimation.Bounds m37113c() {
            return C2716d.m37100d(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f3611a + " upper=" + this.f3612b + "}";
        }

        private C2711a(WindowInsetsAnimation.Bounds bounds) {
            this.f3611a = C2716d.m37098f(bounds);
            this.f3612b = C2716d.m37099e(bounds);
        }
    }

    private C2710t2(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3610a = new C2716d(windowInsetsAnimation);
        }
    }
}
