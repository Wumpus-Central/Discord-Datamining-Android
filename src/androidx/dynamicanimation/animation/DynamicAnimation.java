package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.C2733w0;
import androidx.dynamicanimation.animation.C2847a;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import p166j1.AbstractC9460a;
import p166j1.C9461b;

/* loaded from: classes.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements C2847a.AbstractC2848b {

    /* renamed from: m */
    public static final AbstractC2846s f3770m = new C2834g("translationX");

    /* renamed from: n */
    public static final AbstractC2846s f3771n = new C2835h("translationY");

    /* renamed from: o */
    public static final AbstractC2846s f3772o = new C2836i("translationZ");

    /* renamed from: p */
    public static final AbstractC2846s f3773p = new C2837j(ViewProps.SCALE_X);

    /* renamed from: q */
    public static final AbstractC2846s f3774q = new C2838k(ViewProps.SCALE_Y);

    /* renamed from: r */
    public static final AbstractC2846s f3775r = new C2839l(ViewProps.ROTATION);

    /* renamed from: s */
    public static final AbstractC2846s f3776s = new C2840m("rotationX");

    /* renamed from: t */
    public static final AbstractC2846s f3777t = new C2841n("rotationY");

    /* renamed from: u */
    public static final AbstractC2846s f3778u = new C2842o("x");

    /* renamed from: v */
    public static final AbstractC2846s f3779v = new C2828a("y");

    /* renamed from: w */
    public static final AbstractC2846s f3780w = new C2829b("z");

    /* renamed from: x */
    public static final AbstractC2846s f3781x = new C2830c("alpha");

    /* renamed from: y */
    public static final AbstractC2846s f3782y = new C2831d("scrollX");

    /* renamed from: z */
    public static final AbstractC2846s f3783z = new C2832e("scrollY");

    /* renamed from: a */
    float f3784a;

    /* renamed from: b */
    float f3785b;

    /* renamed from: c */
    boolean f3786c;

    /* renamed from: d */
    final Object f3787d;

    /* renamed from: e */
    final AbstractC9460a f3788e;

    /* renamed from: f */
    boolean f3789f;

    /* renamed from: g */
    float f3790g;

    /* renamed from: h */
    float f3791h;

    /* renamed from: i */
    private long f3792i;

    /* renamed from: j */
    private float f3793j;

    /* renamed from: k */
    private final ArrayList<AbstractC2844q> f3794k;

    /* renamed from: l */
    private final ArrayList<AbstractC2845r> f3795l;

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$a */
    /* loaded from: classes.dex */
    static class C2828a extends AbstractC2846s {
        C2828a(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getY();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$b */
    /* loaded from: classes.dex */
    static class C2829b extends AbstractC2846s {
        C2829b(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return C2733w0.m37039N(view);
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            C2733w0.m37038N0(view, f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$c */
    /* loaded from: classes.dex */
    static class C2830c extends AbstractC2846s {
        C2830c(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getAlpha();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$d */
    /* loaded from: classes.dex */
    static class C2831d extends AbstractC2846s {
        C2831d(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getScrollX();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$e */
    /* loaded from: classes.dex */
    static class C2832e extends AbstractC2846s {
        C2832e(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getScrollY();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$f */
    /* loaded from: classes.dex */
    class C2833f extends AbstractC9460a {

        /* renamed from: b */
        final /* synthetic */ C9461b f3796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2833f(String str, C9461b bVar) {
            super(str);
            this.f3796b = bVar;
        }

        @Override // p166j1.AbstractC9460a
        /* renamed from: a */
        public float mo16199a(Object obj) {
            return this.f3796b.m16197a();
        }

        @Override // p166j1.AbstractC9460a
        /* renamed from: b */
        public void mo16198b(Object obj, float f) {
            this.f3796b.m16196b(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$g */
    /* loaded from: classes.dex */
    static class C2834g extends AbstractC2846s {
        C2834g(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getTranslationX();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$h */
    /* loaded from: classes.dex */
    static class C2835h extends AbstractC2846s {
        C2835h(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getTranslationY();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$i */
    /* loaded from: classes.dex */
    static class C2836i extends AbstractC2846s {
        C2836i(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return C2733w0.m37043L(view);
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            C2733w0.m37044K0(view, f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$j */
    /* loaded from: classes.dex */
    static class C2837j extends AbstractC2846s {
        C2837j(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getScaleX();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$k */
    /* loaded from: classes.dex */
    static class C2838k extends AbstractC2846s {
        C2838k(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getScaleY();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$l */
    /* loaded from: classes.dex */
    static class C2839l extends AbstractC2846s {
        C2839l(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getRotation();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$m */
    /* loaded from: classes.dex */
    static class C2840m extends AbstractC2846s {
        C2840m(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getRotationX();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$n */
    /* loaded from: classes.dex */
    static class C2841n extends AbstractC2846s {
        C2841n(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getRotationY();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$o */
    /* loaded from: classes.dex */
    static class C2842o extends AbstractC2846s {
        C2842o(String str) {
            super(str, null);
        }

        /* renamed from: c */
        public float mo16199a(View view) {
            return view.getX();
        }

        /* renamed from: d */
        public void mo16198b(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$p */
    /* loaded from: classes.dex */
    static class C2843p {

        /* renamed from: a */
        float f3798a;

        /* renamed from: b */
        float f3799b;
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$q */
    /* loaded from: classes.dex */
    public interface AbstractC2844q {
        /* renamed from: a */
        void m36517a(DynamicAnimation dynamicAnimation, boolean z, float f, float f2);
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$r */
    /* loaded from: classes.dex */
    public interface AbstractC2845r {
        void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2);
    }

    /* renamed from: androidx.dynamicanimation.animation.DynamicAnimation$s */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2846s extends AbstractC9460a<View> {
        /* synthetic */ AbstractC2846s(String str, C2834g gVar) {
            this(str);
        }

        private AbstractC2846s(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DynamicAnimation(C9461b bVar) {
        this.f3784a = 0.0f;
        this.f3785b = Float.MAX_VALUE;
        this.f3786c = false;
        this.f3789f = false;
        this.f3790g = Float.MAX_VALUE;
        this.f3791h = -Float.MAX_VALUE;
        this.f3792i = 0L;
        this.f3794k = new ArrayList<>();
        this.f3795l = new ArrayList<>();
        this.f3787d = null;
        this.f3788e = new C2833f("FloatValueHolder", bVar);
        this.f3793j = 1.0f;
    }

    /* renamed from: d */
    private void m36554d(boolean z) {
        this.f3789f = false;
        C2847a.m36503d().m36500g(this);
        this.f3792i = 0L;
        this.f3786c = false;
        for (int i = 0; i < this.f3794k.size(); i++) {
            if (this.f3794k.get(i) != null) {
                this.f3794k.get(i).m36517a(this, z, this.f3785b, this.f3784a);
            }
        }
        m36550h(this.f3794k);
    }

    /* renamed from: e */
    private float m36553e() {
        return this.f3788e.mo16199a(this.f3787d);
    }

    /* renamed from: h */
    private static <T> void m36550h(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: m */
    private void m36546m() {
        if (!this.f3789f) {
            this.f3789f = true;
            if (!this.f3786c) {
                this.f3785b = m36553e();
            }
            float f = this.f3785b;
            if (f > this.f3790g || f < this.f3791h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C2847a.m36503d().m36506a(this, 0L);
        }
    }

    @Override // androidx.dynamicanimation.animation.C2847a.AbstractC2848b
    /* renamed from: a */
    public boolean mo36498a(long j) {
        long j2 = this.f3792i;
        if (j2 == 0) {
            this.f3792i = j;
            m36549i(this.f3785b);
            return false;
        }
        this.f3792i = j;
        boolean n = mo36514n(j - j2);
        float min = Math.min(this.f3785b, this.f3790g);
        this.f3785b = min;
        float max = Math.max(min, this.f3791h);
        this.f3785b = max;
        m36549i(max);
        if (n) {
            m36554d(false);
        }
        return n;
    }

    /* renamed from: b */
    public T m36555b(AbstractC2845r rVar) {
        if (!m36551g()) {
            if (!this.f3795l.contains(rVar)) {
                this.f3795l.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    /* renamed from: c */
    public void mo36516c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f3789f) {
            m36554d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m36552f() {
        return this.f3793j * 0.75f;
    }

    /* renamed from: g */
    public boolean m36551g() {
        return this.f3789f;
    }

    /* renamed from: i */
    void m36549i(float f) {
        this.f3788e.mo16198b(this.f3787d, f);
        for (int i = 0; i < this.f3795l.size(); i++) {
            if (this.f3795l.get(i) != null) {
                this.f3795l.get(i).onAnimationUpdate(this, this.f3785b, this.f3784a);
            }
        }
        m36550h(this.f3795l);
    }

    /* renamed from: j */
    public T m36548j(float f) {
        this.f3785b = f;
        this.f3786c = true;
        return this;
    }

    /* renamed from: k */
    public T m36547k(float f) {
        this.f3784a = f;
        return this;
    }

    /* renamed from: l */
    public void mo36515l() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f3789f) {
            m36546m();
        }
    }

    /* renamed from: n */
    abstract boolean mo36514n(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public <K> DynamicAnimation(K k, AbstractC9460a<K> aVar) {
        this.f3784a = 0.0f;
        this.f3785b = Float.MAX_VALUE;
        this.f3786c = false;
        this.f3789f = false;
        this.f3790g = Float.MAX_VALUE;
        this.f3791h = -Float.MAX_VALUE;
        this.f3792i = 0L;
        this.f3794k = new ArrayList<>();
        this.f3795l = new ArrayList<>();
        this.f3787d = k;
        this.f3788e = aVar;
        if (aVar == f3775r || aVar == f3776s || aVar == f3777t) {
            this.f3793j = 0.1f;
        } else if (aVar == f3781x) {
            this.f3793j = 0.00390625f;
        } else if (aVar == f3773p || aVar == f3774q) {
            this.f3793j = 0.00390625f;
        } else {
            this.f3793j = 1.0f;
        }
    }
}
