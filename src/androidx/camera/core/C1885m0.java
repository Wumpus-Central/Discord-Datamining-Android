package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.C1885m0;
import androidx.camera.core.impl.utils.C1869r;
import androidx.core.util.C2517g;
import com.discord.media.utils.DiscordVideoMediaSource;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;
import p020b0.AbstractC3339d;
import p390w.AbstractC13589e0;
import p390w.AbstractC13597g0;
import p390w.AbstractC13617k1;
import p390w.AbstractC13662r0;
import p390w.AbstractC13689w0;
import p390w.AbstractC13692w1;
import p390w.AbstractC13697x2;
import p390w.AbstractC13702y2;
import p390w.C13582c2;
import p390w.C13590e1;
import p390w.C13619k2;
import p390w.C13642n1;
import p390w.C13656q0;
import p390w.C13696x1;
import p410x.C13905a;
import p451z.AbstractC14506i;
import p451z.AbstractC14508k;

/* renamed from: androidx.camera.core.m0 */
/* loaded from: classes.dex */
public final class C1885m0 extends AbstractC1948w2 {

    /* renamed from: p */
    public static final C1889d f1882p = new C1889d();

    /* renamed from: q */
    private static final Boolean f1883q = null;

    /* renamed from: l */
    final AbstractC1903p0 f1884l;

    /* renamed from: m */
    private final Object f1885m = new Object();

    /* renamed from: n */
    private AbstractC1886a f1886n;

    /* renamed from: o */
    private AbstractC13689w0 f1887o;

    /* renamed from: androidx.camera.core.m0$a */
    /* loaded from: classes.dex */
    public interface AbstractC1886a {
        /* renamed from: a */
        void mo26382a(ImageProxy imageProxy);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.m0$b */
    /* loaded from: classes.dex */
    public @interface AbstractC1887b {
    }

    /* renamed from: androidx.camera.core.m0$c */
    /* loaded from: classes.dex */
    public static final class C1888c implements AbstractC13617k1.AbstractC13618a<C1888c>, AbstractC13697x2.AbstractC13698a<C1885m0, C13590e1, C1888c> {

        /* renamed from: a */
        private final C13696x1 f1888a;

        public C1888c() {
            this(C13696x1.m3002J());
        }

        /* renamed from: f */
        static C1888c m39581f(AbstractC13662r0 r0Var) {
            return new C1888c(C13696x1.m3001K(r0Var));
        }

        @Override // androidx.camera.core.AbstractC1807f0
        /* renamed from: a */
        public AbstractC13692w1 mo3781a() {
            return this.f1888a;
        }

        /* renamed from: e */
        public C1885m0 m39582e() {
            if (mo3781a().mo2977a(AbstractC13617k1.f30420f, null) == null || mo3781a().mo2977a(AbstractC13617k1.f30422h, null) == null) {
                return new C1885m0(mo2998d());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        /* renamed from: g */
        public C13590e1 mo2998d() {
            return new C13590e1(C13582c2.m3310H(this.f1888a));
        }

        /* renamed from: h */
        public C1888c m39579h(Executor executor) {
            mo3781a().mo2999u(AbstractC14508k.f32901u, executor);
            return this;
        }

        /* renamed from: i */
        public C1888c m39578i(int i) {
            mo3781a().mo2999u(C13590e1.f30379x, Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public C1888c m39577j(Size size) {
            mo3781a().mo2999u(AbstractC13617k1.f30423i, size);
            return this;
        }

        /* renamed from: k */
        public C1888c m39576k(int i) {
            mo3781a().mo2999u(AbstractC13697x2.f30589p, Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public C1888c m39575l(int i) {
            mo3781a().mo2999u(AbstractC13617k1.f30420f, Integer.valueOf(i));
            return this;
        }

        /* renamed from: m */
        public C1888c m39574m(Class<C1885m0> cls) {
            mo3781a().mo2999u(AbstractC14506i.f32900t, cls);
            if (mo3781a().mo2977a(AbstractC14506i.f32899s, null) == null) {
                m39573n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: n */
        public C1888c m39573n(String str) {
            mo3781a().mo2999u(AbstractC14506i.f32899s, str);
            return this;
        }

        /* renamed from: o */
        public C1888c mo3208c(Size size) {
            mo3781a().mo2999u(AbstractC13617k1.f30422h, size);
            return this;
        }

        /* renamed from: p */
        public C1888c mo3209b(int i) {
            mo3781a().mo2999u(AbstractC13617k1.f30421g, Integer.valueOf(i));
            return this;
        }

        private C1888c(C13696x1 x1Var) {
            this.f1888a = x1Var;
            Class cls = (Class) x1Var.mo2977a(AbstractC14506i.f32900t, null);
            if (cls == null || cls.equals(C1885m0.class)) {
                m39574m(C1885m0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* renamed from: androidx.camera.core.m0$d */
    /* loaded from: classes.dex */
    public static final class C1889d {

        /* renamed from: a */
        private static final Size f1889a;

        /* renamed from: b */
        private static final C13590e1 f1890b;

        static {
            Size size = new Size(DiscordVideoMediaSource.DEFAULT_WIDTH, DiscordVideoMediaSource.DEFAULT_HEIGHT);
            f1889a = size;
            f1890b = new C1888c().m39577j(size).m39576k(1).m39575l(0).mo2998d();
        }

        /* renamed from: a */
        public C13590e1 m39570a() {
            return f1890b;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.m0$e */
    /* loaded from: classes.dex */
    public @interface AbstractC1890e {
    }

    C1885m0(C13590e1 e1Var) {
        super(e1Var);
        if (((C13590e1) m39433f()).m3291G(0) == 1) {
            this.f1884l = new C1907q0();
        } else {
            this.f1884l = new C1912r0(e1Var.m3292F(C13905a.m2338b()));
        }
        this.f1884l.m39546u(m39591S());
        this.f1884l.m39545v(m39589U());
    }

    /* renamed from: T */
    private boolean m39590T(AbstractC13597g0 g0Var) {
        if (!m39589U() || m39430j(g0Var) % 180 == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static /* synthetic */ void m39588V(C1873j2 j2Var, C1873j2 j2Var2) {
        j2Var.m39607k();
        if (j2Var2 != null) {
            j2Var2.m39607k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m39587W(String str, C13590e1 e1Var, Size size, C13619k2 k2Var, C13619k2.EnumC13624e eVar) {
        m39596N();
        this.f1884l.mo39534g();
        if (m39426o(str)) {
            m39440I(m39595O(str, e1Var, size).m3185m());
            m39422s();
        }
    }

    /* renamed from: a0 */
    private void m39583a0() {
        AbstractC13597g0 c = m39436c();
        if (c != null) {
            this.f1884l.m39543x(m39430j(c));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: A */
    public AbstractC13697x2<?> mo20570A(AbstractC13589e0 e0Var, AbstractC13697x2.AbstractC13698a<?, ?, ?> aVar) {
        Boolean R = m39592R();
        boolean a = e0Var.mo3294e().m3261a(AbstractC3339d.class);
        AbstractC1903p0 p0Var = this.f1884l;
        if (R != null) {
            a = R.booleanValue();
        }
        p0Var.m39547t(a);
        return super.mo20570A(e0Var, aVar);
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: D */
    protected Size mo20567D(Size size) {
        m39440I(m39595O(m39434e(), (C13590e1) m39433f(), size).m3185m());
        return size;
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: F */
    public void mo39442F(Matrix matrix) {
        this.f1884l.m39542y(matrix);
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: H */
    public void mo20566H(Rect rect) {
        super.mo20566H(rect);
        this.f1884l.m39541z(rect);
    }

    /* renamed from: N */
    void m39596N() {
        C1869r.m39614a();
        AbstractC13689w0 w0Var = this.f1887o;
        if (w0Var != null) {
            w0Var.m3023c();
            this.f1887o = null;
        }
    }

    /* renamed from: O */
    C13619k2.C13621b m39595O(final String str, final C13590e1 e1Var, final Size size) {
        int i;
        final C1873j2 j2Var;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        final C1873j2 j2Var2;
        C1869r.m39614a();
        Executor executor = (Executor) C2517g.m37588g(e1Var.m3292F(C13905a.m2338b()));
        boolean z3 = true;
        if (m39594P() == 1) {
            i = m39593Q();
        } else {
            i = 4;
        }
        if (e1Var.m3289I() != null) {
            j2Var = new C1873j2(e1Var.m3289I().m39569a(size.getWidth(), size.getHeight(), m39432h(), i, 0L));
        } else {
            j2Var = new C1873j2(C1900o1.m39564a(size.getWidth(), size.getHeight(), m39432h(), i));
        }
        if (m39436c() != null) {
            z = m39590T(m39436c());
        } else {
            z = false;
        }
        if (z) {
            i2 = size.getHeight();
        } else {
            i2 = size.getWidth();
        }
        if (z) {
            i3 = size.getWidth();
        } else {
            i3 = size.getHeight();
        }
        if (m39591S() == 2) {
            i4 = 1;
        } else {
            i4 = 35;
        }
        if (m39432h() == 35 && m39591S() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m39432h() != 35 || ((m39436c() == null || m39430j(m39436c()) == 0) && !Boolean.TRUE.equals(m39592R()))) {
            z3 = false;
        }
        if (z2 || z3) {
            j2Var2 = new C1873j2(C1900o1.m39564a(i2, i3, i4, j2Var.mo3157b()));
        } else {
            j2Var2 = null;
        }
        if (j2Var2 != null) {
            this.f1884l.m39544w(j2Var2);
        }
        m39583a0();
        j2Var.mo3154f(this.f1884l, executor);
        C13619k2.C13621b o = C13619k2.C13621b.m3183o(e1Var);
        AbstractC13689w0 w0Var = this.f1887o;
        if (w0Var != null) {
            w0Var.m3023c();
        }
        C13642n1 n1Var = new C13642n1(j2Var.getSurface(), size, m39432h());
        this.f1887o = n1Var;
        n1Var.m3017i().mo1409a(new Runnable() { // from class: androidx.camera.core.j0
            @Override // java.lang.Runnable
            public final void run() {
                C1885m0.m39588V(C1873j2.this, j2Var2);
            }
        }, C13905a.m2336d());
        o.m3187k(this.f1887o);
        o.m3192f(new C13619k2.AbstractC13622c() { // from class: androidx.camera.core.k0
            @Override // p390w.C13619k2.AbstractC13622c
            /* renamed from: a */
            public final void mo3179a(C13619k2 k2Var, C13619k2.EnumC13624e eVar) {
                C1885m0.this.m39587W(str, e1Var, size, k2Var, eVar);
            }
        });
        return o;
    }

    /* renamed from: P */
    public int m39594P() {
        return ((C13590e1) m39433f()).m3291G(0);
    }

    /* renamed from: Q */
    public int m39593Q() {
        return ((C13590e1) m39433f()).m3290H(6);
    }

    /* renamed from: R */
    public Boolean m39592R() {
        return ((C13590e1) m39433f()).m3288J(f1883q);
    }

    /* renamed from: S */
    public int m39591S() {
        return ((C13590e1) m39433f()).m3287K(1);
    }

    /* renamed from: U */
    public boolean m39589U() {
        return ((C13590e1) m39433f()).m3286L(Boolean.FALSE).booleanValue();
    }

    /* renamed from: Y */
    public void m39585Y(Executor executor, final AbstractC1886a aVar) {
        synchronized (this.f1885m) {
            this.f1884l.m39548s(executor, new AbstractC1886a() { // from class: androidx.camera.core.l0
                @Override // androidx.camera.core.C1885m0.AbstractC1886a
                /* renamed from: a */
                public final void mo26382a(ImageProxy imageProxy) {
                    C1885m0.AbstractC1886a.this.mo26382a(imageProxy);
                }
            });
            if (this.f1886n == null) {
                m39424q();
            }
            this.f1886n = aVar;
        }
    }

    /* renamed from: Z */
    public void m39584Z(int i) {
        if (m39441G(i)) {
            m39583a0();
        }
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: g */
    public AbstractC13697x2<?> mo20549g(boolean z, AbstractC13702y2 y2Var) {
        AbstractC13662r0 a = y2Var.mo2994a(AbstractC13702y2.EnumC13704b.IMAGE_ANALYSIS);
        if (z) {
            a = C13656q0.m3108b(a, f1882p.m39570a());
        }
        if (a == null) {
            return null;
        }
        return mo20548m(a).mo2998d();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: m */
    public AbstractC13697x2.AbstractC13698a<?, ?, ?> mo20548m(AbstractC13662r0 r0Var) {
        return C1888c.m39581f(r0Var);
    }

    public String toString() {
        return "ImageAnalysis:" + m39431i();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: w */
    public void mo20547w() {
        this.f1884l.m39559f();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: z */
    public void mo20546z() {
        m39596N();
        this.f1884l.m39556j();
    }
}
