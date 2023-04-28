package androidx.camera.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1770a2;
import androidx.camera.core.C1936v2;
import androidx.camera.core.impl.utils.C1869r;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import p390w.AbstractC13589e0;
import p390w.AbstractC13597g0;
import p390w.AbstractC13599g1;
import p390w.AbstractC13607i1;
import p390w.AbstractC13615k;
import p390w.AbstractC13617k1;
import p390w.AbstractC13645o0;
import p390w.AbstractC13651p0;
import p390w.AbstractC13662r0;
import p390w.AbstractC13672t;
import p390w.AbstractC13689w0;
import p390w.AbstractC13692w1;
import p390w.AbstractC13697x2;
import p390w.AbstractC13702y2;
import p390w.C13582c2;
import p390w.C13591e2;
import p390w.C13619k2;
import p390w.C13656q0;
import p390w.C13696x1;
import p410x.C13905a;
import p451z.AbstractC14506i;
import p451z.AbstractC14510m;
import p451z.C14496b;

/* renamed from: androidx.camera.core.a2 */
/* loaded from: classes.dex */
public final class C1770a2 extends AbstractC1948w2 {

    /* renamed from: r */
    public static final C1773c f1601r = new C1773c();

    /* renamed from: s */
    private static final Executor f1602s = C13905a.m2336d();

    /* renamed from: l */
    private AbstractC1774d f1603l;

    /* renamed from: n */
    private AbstractC13689w0 f1605n;

    /* renamed from: o */
    C1936v2 f1606o;

    /* renamed from: q */
    private Size f1608q;

    /* renamed from: m */
    private Executor f1604m = f1602s;

    /* renamed from: p */
    private boolean f1607p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.a2$a */
    /* loaded from: classes.dex */
    public class C1771a extends AbstractC13615k {

        /* renamed from: a */
        final /* synthetic */ AbstractC13599g1 f1609a;

        C1771a(AbstractC13599g1 g1Var) {
            this.f1609a = g1Var;
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: b */
        public void mo3171b(AbstractC13672t tVar) {
            super.mo3171b(tVar);
            if (this.f1609a.mo3262a(new C14496b(tVar))) {
                C1770a2.this.m39420u();
            }
        }
    }

    /* renamed from: androidx.camera.core.a2$b */
    /* loaded from: classes.dex */
    public static final class C1772b implements AbstractC13697x2.AbstractC13698a<C1770a2, C13591e2, C1772b>, AbstractC13617k1.AbstractC13618a<C1772b> {

        /* renamed from: a */
        private final C13696x1 f1611a;

        public C1772b() {
            this(C13696x1.m3002J());
        }

        /* renamed from: f */
        static C1772b m39871f(AbstractC13662r0 r0Var) {
            return new C1772b(C13696x1.m3001K(r0Var));
        }

        @Override // androidx.camera.core.AbstractC1807f0
        /* renamed from: a */
        public AbstractC13692w1 mo3781a() {
            return this.f1611a;
        }

        /* renamed from: e */
        public C1770a2 m39872e() {
            if (mo3781a().mo2977a(AbstractC13617k1.f30420f, null) == null || mo3781a().mo2977a(AbstractC13617k1.f30422h, null) == null) {
                return new C1770a2(mo2998d());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        /* renamed from: g */
        public C13591e2 mo2998d() {
            return new C13591e2(C13582c2.m3310H(this.f1611a));
        }

        /* renamed from: h */
        public C1772b m39869h(AbstractC13645o0 o0Var) {
            mo3781a().mo2999u(C13591e2.f30384y, o0Var);
            return this;
        }

        /* renamed from: i */
        public C1772b m39868i(AbstractC13599g1 g1Var) {
            mo3781a().mo2999u(C13591e2.f30383x, g1Var);
            return this;
        }

        /* renamed from: j */
        public C1772b m39867j(List<Pair<Integer, Size[]>> list) {
            mo3781a().mo2999u(AbstractC13617k1.f30425k, list);
            return this;
        }

        /* renamed from: k */
        public C1772b m39866k(int i) {
            mo3781a().mo2999u(AbstractC13697x2.f30589p, Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public C1772b m39865l(int i) {
            mo3781a().mo2999u(AbstractC13617k1.f30420f, Integer.valueOf(i));
            return this;
        }

        /* renamed from: m */
        public C1772b m39864m(Class<C1770a2> cls) {
            mo3781a().mo2999u(AbstractC14506i.f32900t, cls);
            if (mo3781a().mo2977a(AbstractC14506i.f32899s, null) == null) {
                m39863n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: n */
        public C1772b m39863n(String str) {
            mo3781a().mo2999u(AbstractC14506i.f32899s, str);
            return this;
        }

        /* renamed from: o */
        public C1772b mo3208c(Size size) {
            mo3781a().mo2999u(AbstractC13617k1.f30422h, size);
            return this;
        }

        /* renamed from: p */
        public C1772b mo3209b(int i) {
            mo3781a().mo2999u(AbstractC13617k1.f30421g, Integer.valueOf(i));
            return this;
        }

        /* renamed from: q */
        public C1772b m39860q(AbstractC1948w2.AbstractC1950b bVar) {
            mo3781a().mo2999u(AbstractC14510m.f32902v, bVar);
            return this;
        }

        private C1772b(C13696x1 x1Var) {
            this.f1611a = x1Var;
            Class cls = (Class) x1Var.mo2977a(AbstractC14506i.f32900t, null);
            if (cls == null || cls.equals(C1770a2.class)) {
                m39864m(C1770a2.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* renamed from: androidx.camera.core.a2$c */
    /* loaded from: classes.dex */
    public static final class C1773c {

        /* renamed from: a */
        private static final C13591e2 f1612a = new C1772b().m39866k(2).m39865l(0).mo2998d();

        /* renamed from: a */
        public C13591e2 m39859a() {
            return f1612a;
        }
    }

    /* renamed from: androidx.camera.core.a2$d */
    /* loaded from: classes.dex */
    public interface AbstractC1774d {
        /* renamed from: a */
        void mo341a(C1936v2 v2Var);
    }

    C1770a2(C13591e2 e2Var) {
        super(e2Var);
    }

    /* renamed from: N */
    private Rect m39882N(Size size) {
        if (m39427n() != null) {
            return m39427n();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m39880P(String str, C13591e2 e2Var, Size size, C13619k2 k2Var, C13619k2.EnumC13624e eVar) {
        if (m39426o(str)) {
            m39440I(m39883M(str, e2Var, size).m3185m());
            m39422s();
        }
    }

    /* renamed from: R */
    private boolean m39878R() {
        final C1936v2 v2Var = this.f1606o;
        final AbstractC1774d dVar = this.f1603l;
        if (dVar == null || v2Var == null) {
            return false;
        }
        this.f1604m.execute(new Runnable() { // from class: androidx.camera.core.z1
            @Override // java.lang.Runnable
            public final void run() {
                C1770a2.AbstractC1774d.this.mo341a(v2Var);
            }
        });
        return true;
    }

    /* renamed from: S */
    private void m39877S() {
        AbstractC13597g0 c = m39436c();
        AbstractC1774d dVar = this.f1603l;
        Rect N = m39882N(this.f1608q);
        C1936v2 v2Var = this.f1606o;
        if (c != null && dVar != null && N != null) {
            v2Var.m39458x(C1936v2.AbstractC1943g.m39447d(N, m39430j(c), m39881O()));
        }
    }

    /* renamed from: W */
    private void m39873W(String str, C13591e2 e2Var, Size size) {
        m39440I(m39883M(str, e2Var, size).m3185m());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: A */
    public AbstractC13697x2<?> mo20570A(AbstractC13589e0 e0Var, AbstractC13697x2.AbstractC13698a<?, ?, ?> aVar) {
        if (aVar.mo3781a().mo2977a(C13591e2.f30384y, null) != null) {
            aVar.mo3781a().mo2999u(AbstractC13607i1.f30410e, 35);
        } else {
            aVar.mo3781a().mo2999u(AbstractC13607i1.f30410e, 34);
        }
        return aVar.mo2998d();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: D */
    protected Size mo20567D(Size size) {
        this.f1608q = size;
        m39873W(m39434e(), (C13591e2) m39433f(), this.f1608q);
        return size;
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: H */
    public void mo20566H(Rect rect) {
        super.mo20566H(rect);
        m39877S();
    }

    /* renamed from: M */
    C13619k2.C13621b m39883M(final String str, final C13591e2 e2Var, final Size size) {
        boolean z;
        C1869r.m39614a();
        C13619k2.C13621b o = C13619k2.C13621b.m3183o(e2Var);
        AbstractC13645o0 F = e2Var.m3285F(null);
        AbstractC13689w0 w0Var = this.f1605n;
        if (w0Var != null) {
            w0Var.m3023c();
        }
        AbstractC13597g0 c = m39436c();
        if (F != null) {
            z = true;
        } else {
            z = false;
        }
        C1936v2 v2Var = new C1936v2(size, c, z);
        this.f1606o = v2Var;
        if (m39878R()) {
            m39877S();
        } else {
            this.f1607p = true;
        }
        if (F != null) {
            AbstractC13651p0.C13652a aVar = new AbstractC13651p0.C13652a();
            final HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String num = Integer.toString(aVar.hashCode());
            C1826g2 g2Var = new C1826g2(size.getWidth(), size.getHeight(), e2Var.mo2969j(), new Handler(handlerThread.getLooper()), aVar, F, v2Var.m39471k(), num);
            o.m3194d(g2Var.m39709r());
            g2Var.m3017i().mo1409a(new Runnable() { // from class: androidx.camera.core.x1
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quitSafely();
                }
            }, C13905a.m2339a());
            this.f1605n = g2Var;
            o.m3186l(num, Integer.valueOf(aVar.getId()));
        } else {
            AbstractC13599g1 G = e2Var.m3284G(null);
            if (G != null) {
                o.m3194d(new C1771a(G));
            }
            this.f1605n = v2Var.m39471k();
        }
        o.m3187k(this.f1605n);
        o.m3192f(new C13619k2.AbstractC13622c() { // from class: androidx.camera.core.y1
            @Override // p390w.C13619k2.AbstractC13622c
            /* renamed from: a */
            public final void mo3179a(C13619k2 k2Var, C13619k2.EnumC13624e eVar) {
                C1770a2.this.m39880P(str, e2Var, size, k2Var, eVar);
            }
        });
        return o;
    }

    /* renamed from: O */
    public int m39881O() {
        return m39428l();
    }

    /* renamed from: T */
    public void m39876T(AbstractC1774d dVar) {
        m39875U(f1602s, dVar);
    }

    /* renamed from: U */
    public void m39875U(Executor executor, AbstractC1774d dVar) {
        C1869r.m39614a();
        if (dVar == null) {
            this.f1603l = null;
            m39423r();
            return;
        }
        this.f1603l = dVar;
        this.f1604m = executor;
        m39424q();
        if (this.f1607p) {
            if (m39878R()) {
                m39877S();
                this.f1607p = false;
            }
        } else if (m39437b() != null) {
            m39873W(m39434e(), (C13591e2) m39433f(), m39437b());
            m39422s();
        }
    }

    /* renamed from: V */
    public void m39874V(int i) {
        if (m39441G(i)) {
            m39877S();
        }
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: g */
    public AbstractC13697x2<?> mo20549g(boolean z, AbstractC13702y2 y2Var) {
        AbstractC13662r0 a = y2Var.mo2994a(AbstractC13702y2.EnumC13704b.PREVIEW);
        if (z) {
            a = C13656q0.m3108b(a, f1601r.m39859a());
        }
        if (a == null) {
            return null;
        }
        return mo20548m(a).mo2998d();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: m */
    public AbstractC13697x2.AbstractC13698a<?, ?, ?> mo20548m(AbstractC13662r0 r0Var) {
        return C1772b.m39871f(r0Var);
    }

    public String toString() {
        return "Preview:" + m39431i();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: z */
    public void mo20546z() {
        AbstractC13689w0 w0Var = this.f1605n;
        if (w0Var != null) {
            w0Var.m3023c();
        }
        this.f1606o = null;
    }
}
