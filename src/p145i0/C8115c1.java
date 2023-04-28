package p145i0;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1936v2;
import androidx.camera.core.impl.utils.C1869r;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p120gc.AbstractFutureC7576b;
import p145i0.AbstractC8139h1;
import p145i0.AbstractC8205z0;
import p145i0.C8115c1;
import p165j0.C9459a;
import p390w.AbstractC13568a2;
import p390w.AbstractC13589e0;
import p390w.AbstractC13597g0;
import p390w.AbstractC13615k;
import p390w.AbstractC13617k1;
import p390w.AbstractC13662r0;
import p390w.AbstractC13672t;
import p390w.AbstractC13689w0;
import p390w.AbstractC13692w1;
import p390w.AbstractC13697x2;
import p390w.AbstractC13702y2;
import p390w.C13582c2;
import p390w.C13619k2;
import p390w.C13656q0;
import p390w.C13696x1;
import p410x.C13905a;
import p431y.AbstractC14182c;
import p431y.C14186f;
import p451z.AbstractC14506i;

/* renamed from: i0.c1 */
/* loaded from: classes.dex */
public final class C8115c1<T extends AbstractC8139h1> extends AbstractC1948w2 {

    /* renamed from: s */
    private static final C8120d f17557s = new C8120d();

    /* renamed from: m */
    AbstractC13689w0 f17559m;

    /* renamed from: q */
    private C1936v2 f17563q;

    /* renamed from: l */
    final Object f17558l = new Object();

    /* renamed from: n */
    AbstractC8205z0 f17560n = AbstractC8205z0.f17743b;

    /* renamed from: o */
    C13619k2.C13621b f17561o = new C13619k2.C13621b();

    /* renamed from: p */
    C2114c.C2115a<Void> f17562p = null;

    /* renamed from: r */
    private final AbstractC13568a2.AbstractC13569a<AbstractC8205z0> f17564r = new C8117b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.c1$a */
    /* loaded from: classes.dex */
    public class C8116a extends AbstractC13615k {
        C8116a() {
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: b */
        public void mo3171b(AbstractC13672t tVar) {
            Object c;
            super.mo3171b(tVar);
            synchronized (C8115c1.this.f17558l) {
                if (!(C8115c1.this.f17562p == null || (c = tVar.mo3085c().m3089c("androidx.camera.video.VideoCapture.streamUpdate")) == null || ((Integer) c).intValue() != C8115c1.this.f17562p.hashCode())) {
                    C8115c1.this.f17562p.m38961c(null);
                    C8115c1.this.f17562p = null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.c1$b */
    /* loaded from: classes.dex */
    public class C8117b implements AbstractC13568a2.AbstractC13569a<AbstractC8205z0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i0.c1$b$a */
        /* loaded from: classes.dex */
        public class C8118a implements AbstractC14182c<Void> {

            /* renamed from: a */
            final /* synthetic */ boolean f17567a;

            /* renamed from: b */
            final /* synthetic */ ScheduledFuture f17568b;

            C8118a(boolean z, ScheduledFuture scheduledFuture) {
                this.f17567a = z;
                this.f17568b = scheduledFuture;
            }

            /* renamed from: b */
            public void mo1412a(Void r2) {
                AbstractC8139h1.EnumC8140a aVar;
                AbstractC8139h1 T = C8115c1.this.m20556T();
                if (this.f17567a) {
                    aVar = AbstractC8139h1.EnumC8140a.ACTIVE_STREAMING;
                } else {
                    aVar = AbstractC8139h1.EnumC8140a.ACTIVE_NON_STREAMING;
                }
                T.mo20454d(aVar);
                this.f17568b.cancel(true);
            }

            @Override // p431y.AbstractC14182c
            public void onFailure(Throwable th2) {
                AbstractC8139h1.EnumC8140a aVar;
                C1915r1.m39526b("VideoCapture", "The surface update future didn't complete.", th2);
                AbstractC8139h1 T = C8115c1.this.m20556T();
                if (this.f17567a) {
                    aVar = AbstractC8139h1.EnumC8140a.ACTIVE_STREAMING;
                } else {
                    aVar = AbstractC8139h1.EnumC8140a.ACTIVE_NON_STREAMING;
                }
                T.mo20454d(aVar);
                this.f17568b.cancel(true);
            }
        }

        C8117b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ Object m20543d(AtomicReference atomicReference, C2114c.C2115a aVar) {
            C8115c1.this.f17561o.m3186l("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
            synchronized (C8115c1.this.f17558l) {
                C2114c.C2115a<Void> aVar2 = C8115c1.this.f17562p;
                if (aVar2 != null) {
                    aVar2.m38958f(new RuntimeException("A newer surface update is completed."));
                }
                C8115c1.this.f17562p = aVar;
                atomicReference.set(aVar);
            }
            return "androidx.camera.video.VideoCapture.streamUpdate";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m20542e(AbstractFutureC7576b bVar, AtomicReference atomicReference) {
            if (!bVar.isDone()) {
                ((C2114c.C2115a) atomicReference.get()).m38958f(new TimeoutException("The surface isn't updated within: 1000"));
                synchronized (C8115c1.this.f17558l) {
                    if (C8115c1.this.f17562p == atomicReference.get()) {
                        C8115c1.this.f17562p = null;
                    }
                }
            }
        }

        /* renamed from: f */
        public void mo3341a(AbstractC8205z0 z0Var) {
            boolean z;
            if (z0Var == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            } else if (C8115c1.this.m39436c() != null) {
                if (C8115c1.this.f17560n.mo20308b() != z0Var.mo20308b()) {
                    C8115c1.this.f17561o.m3184n();
                    if (z0Var.mo20308b() == AbstractC8205z0.EnumC8206a.ACTIVE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C8115c1 c1Var = C8115c1.this;
                        c1Var.f17561o.m3187k(c1Var.f17559m);
                    } else {
                        C8115c1 c1Var2 = C8115c1.this;
                        c1Var2.f17561o.m3190h(c1Var2.f17559m);
                    }
                    final AtomicReference atomicReference = new AtomicReference();
                    final AbstractFutureC7576b a = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: i0.d1
                        @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                        /* renamed from: a */
                        public final Object mo1403a(C2114c.C2115a aVar) {
                            Object d;
                            d = C8115c1.C8117b.this.m20543d(atomicReference, aVar);
                            return d;
                        }
                    });
                    C14186f.m1427b(a, new C8118a(z, C13905a.m2335e().schedule(new Runnable() { // from class: i0.e1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8115c1.C8117b.this.m20542e(a, atomicReference);
                        }
                    }, 1000L, TimeUnit.MILLISECONDS)), C13905a.m2339a());
                    C8115c1 c1Var3 = C8115c1.this;
                    c1Var3.m39440I(c1Var3.f17561o.m3185m());
                    C8115c1.this.m39420u();
                }
                Integer a2 = C8115c1.this.f17560n.mo20309a();
                if (a2.equals(AbstractC8205z0.f17742a) || a2.equals(z0Var.mo20309a())) {
                    C8115c1.this.f17560n = z0Var;
                    return;
                }
                C8115c1 c1Var4 = C8115c1.this;
                c1Var4.m20554V(c1Var4.m39434e(), (C9459a) C8115c1.this.m39433f(), C8115c1.this.m39437b());
            }
        }

        @Override // p390w.AbstractC13568a2.AbstractC13569a
        public void onError(Throwable th2) {
            C1915r1.m39516l("VideoCapture", "Receive onError from StreamState observer", th2);
        }
    }

    /* renamed from: i0.c1$c */
    /* loaded from: classes.dex */
    public static final class C8119c<T extends AbstractC8139h1> implements AbstractC13697x2.AbstractC13698a<C8115c1<T>, C9459a<T>, C8119c<T>>, AbstractC13617k1.AbstractC13618a<C8119c<T>> {

        /* renamed from: a */
        private final C13696x1 f17570a;

        C8119c(T t) {
            this(m20538f(t));
        }

        /* renamed from: f */
        private static <T extends AbstractC8139h1> C13696x1 m20538f(T t) {
            C13696x1 J = C13696x1.m3002J();
            J.mo2999u(C9459a.f20840x, t);
            return J;
        }

        /* renamed from: g */
        static C8119c<? extends AbstractC8139h1> m20537g(AbstractC13662r0 r0Var) {
            return new C8119c<>(C13696x1.m3001K(r0Var));
        }

        @Override // androidx.camera.core.AbstractC1807f0
        /* renamed from: a */
        public AbstractC13692w1 mo3781a() {
            return this.f17570a;
        }

        /* renamed from: e */
        public C8115c1<T> m20539e() {
            return new C8115c1<>(mo2998d());
        }

        /* renamed from: h */
        public C9459a<T> mo2998d() {
            return new C9459a<>(C13582c2.m3310H(this.f17570a));
        }

        /* renamed from: i */
        public C8119c<T> m20535i(int i) {
            mo3781a().mo2999u(AbstractC13697x2.f30589p, Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public C8119c<T> m20534j(Class<C8115c1<T>> cls) {
            mo3781a().mo2999u(AbstractC14506i.f32900t, cls);
            if (mo3781a().mo2977a(AbstractC14506i.f32899s, null) == null) {
                m20533k(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: k */
        public C8119c<T> m20533k(String str) {
            mo3781a().mo2999u(AbstractC14506i.f32899s, str);
            return this;
        }

        /* renamed from: l */
        public C8119c<T> mo3208c(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        /* renamed from: m */
        public C8119c<T> mo3209b(int i) {
            mo3781a().mo2999u(AbstractC13617k1.f30421g, Integer.valueOf(i));
            return this;
        }

        private C8119c(C13696x1 x1Var) {
            this.f17570a = x1Var;
            if (x1Var.mo2973e(C9459a.f20840x)) {
                Class cls = (Class) x1Var.mo2977a(AbstractC14506i.f32900t, null);
                if (cls == null || cls.equals(C8115c1.class)) {
                    m20534j(C8115c1.class);
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            throw new IllegalArgumentException("VideoOutput is required");
        }
    }

    /* renamed from: i0.c1$d */
    /* loaded from: classes.dex */
    public static final class C8120d {

        /* renamed from: a */
        private static final AbstractC8139h1 f17571a;

        /* renamed from: b */
        private static final C9459a<?> f17572b;

        static {
            AbstractC8139h1 f1Var = new AbstractC8139h1() { // from class: i0.f1
                @Override // p145i0.AbstractC8139h1
                /* renamed from: a */
                public final void mo20460a(C1936v2 v2Var) {
                    v2Var.m39457y();
                }

                @Override // p145i0.AbstractC8139h1
                /* renamed from: b */
                public /* synthetic */ AbstractC13568a2 mo20458b() {
                    return C8136g1.m20525a(this);
                }

                @Override // p145i0.AbstractC8139h1
                /* renamed from: c */
                public /* synthetic */ AbstractC13568a2 mo20456c() {
                    return C8136g1.m20524b(this);
                }

                @Override // p145i0.AbstractC8139h1
                /* renamed from: d */
                public /* synthetic */ void mo20454d(AbstractC8139h1.EnumC8140a aVar) {
                    C8136g1.m20523c(this, aVar);
                }
            };
            f17571a = f1Var;
            f17572b = (C9459a<T>) new C8119c(f1Var).m20535i(3).mo2998d();
        }

        /* renamed from: a */
        public C9459a<?> m20530a() {
            return f17572b;
        }
    }

    C8115c1(C9459a<T> aVar) {
        super(aVar);
    }

    /* renamed from: O */
    private void m20561O() {
        C1869r.m39614a();
        AbstractC13689w0 w0Var = this.f17559m;
        if (w0Var != null) {
            w0Var.m3023c();
            this.f17559m = null;
        }
        this.f17563q = null;
        this.f17560n = AbstractC8205z0.f17743b;
    }

    /* renamed from: P */
    private C13619k2.C13621b m20560P(final String str, final C9459a<T> aVar, final Size size) {
        C1869r.m39614a();
        this.f17563q = new C1936v2(size, m39436c(), false);
        aVar.m16200F().mo20460a(this.f17563q);
        m20553W(size);
        AbstractC13689w0 k = this.f17563q.m39471k();
        this.f17559m = k;
        k.m3011o(MediaCodec.class);
        C13619k2.C13621b o = C13619k2.C13621b.m3183o(aVar);
        if (((AbstractC8205z0) m20559Q(m20556T().mo20456c(), AbstractC8205z0.f17743b)).mo20308b() == AbstractC8205z0.EnumC8206a.ACTIVE) {
            o.m3187k(this.f17559m);
            m20556T().mo20454d(AbstractC8139h1.EnumC8140a.ACTIVE_STREAMING);
        } else {
            o.m3190h(this.f17559m);
            m20556T().mo20454d(AbstractC8139h1.EnumC8140a.ACTIVE_NON_STREAMING);
        }
        o.m3192f(new C13619k2.AbstractC13622c() { // from class: i0.b1
            @Override // p390w.C13619k2.AbstractC13622c
            /* renamed from: a */
            public final void mo3179a(C13619k2 k2Var, C13619k2.EnumC13624e eVar) {
                C8115c1.this.m20555U(str, aVar, size, k2Var, eVar);
            }
        });
        o.m3189i(new C8116a());
        return o;
    }

    /* renamed from: Q */
    private static <T> T m20559Q(AbstractC13568a2<T> a2Var, T t) {
        AbstractFutureC7576b<T> c = a2Var.mo3077c();
        if (!c.isDone()) {
            return t;
        }
        try {
            return c.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: R */
    private Rect m20558R(Size size) {
        if (m39427n() != null) {
            return m39427n();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* renamed from: S */
    private AbstractC8183q m20557S() {
        return (AbstractC8183q) m20559Q(m20556T().mo20458b(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m20555U(String str, C9459a aVar, Size size, C13619k2 k2Var, C13619k2.EnumC13624e eVar) {
        m20554V(str, aVar, size);
    }

    /* renamed from: W */
    private void m20553W(Size size) {
        AbstractC13597g0 c = m39436c();
        C1936v2 v2Var = this.f17563q;
        Rect R = m20558R(size);
        if (c != null && v2Var != null && R != null) {
            v2Var.m39458x(C1936v2.AbstractC1943g.m39447d(R, m39430j(c), m39428l()));
        }
    }

    /* renamed from: Y */
    private void m20551Y(AbstractC13589e0 e0Var, AbstractC13697x2.AbstractC13698a<?, ?, ?> aVar) {
        boolean z;
        AbstractC8183q S = m20557S();
        if (S != null) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37593b(z, "Unable to update target resolution by null MediaSpec.");
        if (C8198w.m20321i(e0Var).isEmpty()) {
            C1915r1.m39517k("VideoCapture", "Can't find any supported quality on the device.");
            return;
        }
        C8198w e = S.mo20361d().mo20506e();
        List<C8194v> g = e.m20323g(e0Var);
        C1915r1.m39527a("VideoCapture", "Found selectedQualities " + g + " by " + e);
        if (!g.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C8194v vVar : g) {
                arrayList.add(C8198w.m20322h(e0Var, vVar));
            }
            C1915r1.m39527a("VideoCapture", "Set supported resolutions = " + arrayList);
            aVar.mo3781a().mo2999u(AbstractC13617k1.f30425k, Arrays.asList(Pair.create(Integer.valueOf(m39432h()), (Size[]) arrayList.toArray(new Size[0]))));
            return;
        }
        throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
    }

    /* renamed from: Z */
    public static <T extends AbstractC8139h1> C8115c1<T> m20550Z(T t) {
        return new C8119c((AbstractC8139h1) C2517g.m37588g(t)).m20539e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: A */
    public AbstractC13697x2<?> mo20570A(AbstractC13589e0 e0Var, AbstractC13697x2.AbstractC13698a<?, ?, ?> aVar) {
        m20551Y(e0Var, aVar);
        return aVar.mo2998d();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: B */
    public void mo20569B() {
        super.mo20569B();
        m20556T().mo20454d(AbstractC8139h1.EnumC8140a.ACTIVE_NON_STREAMING);
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: C */
    public void mo20568C() {
        synchronized (this.f17558l) {
            C2114c.C2115a<Void> aVar = this.f17562p;
            if (aVar != null) {
                aVar.m38958f(new RuntimeException("VideoCapture is detached from the camera."));
                this.f17562p = null;
            }
        }
        m20556T().mo20454d(AbstractC8139h1.EnumC8140a.INACTIVE);
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: D */
    protected Size mo20567D(Size size) {
        Object obj;
        C1915r1.m39527a("VideoCapture", "suggestedResolution = " + size);
        String e = m39434e();
        C9459a<T> aVar = (C9459a) m39433f();
        Size[] sizeArr = null;
        List h = aVar.mo2971h(null);
        if (h != null) {
            Iterator it = h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).intValue() == m39432h() && (obj = pair.second) != null) {
                    sizeArr = (Size[]) obj;
                    break;
                }
            }
        }
        if (sizeArr != null) {
            int width = size.getWidth() * size.getHeight();
            int length = sizeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size2 = sizeArr[i];
                if (Objects.equals(size2, size)) {
                    break;
                } else if (size2.getWidth() * size2.getHeight() < width) {
                    C1915r1.m39527a("VideoCapture", "Find a higher priority resolution: " + size2);
                    size = size2;
                    break;
                } else {
                    i++;
                }
            }
        }
        C13619k2.C13621b P = m20560P(e, aVar, size);
        this.f17561o = P;
        m39440I(P.m3185m());
        m39424q();
        return size;
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: H */
    public void mo20566H(Rect rect) {
        super.mo20566H(rect);
        m20553W(m39437b());
    }

    /* renamed from: T */
    public T m20556T() {
        return (T) ((C9459a) m39433f()).m16200F();
    }

    /* renamed from: V */
    void m20554V(String str, C9459a<T> aVar, Size size) {
        m20561O();
        if (m39426o(str)) {
            C13619k2.C13621b P = m20560P(str, aVar, size);
            this.f17561o = P;
            m39440I(P.m3185m());
            m39422s();
        }
    }

    /* renamed from: X */
    public void m20552X(int i) {
        if (m39441G(i)) {
            m20553W(m39437b());
        }
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: g */
    public AbstractC13697x2<?> mo20549g(boolean z, AbstractC13702y2 y2Var) {
        AbstractC13662r0 a = y2Var.mo2994a(AbstractC13702y2.EnumC13704b.VIDEO_CAPTURE);
        if (z) {
            a = C13656q0.m3108b(a, f17557s.m20530a());
        }
        if (a == null) {
            return null;
        }
        return mo20548m(a).mo2998d();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: m */
    public AbstractC13697x2.AbstractC13698a<?, ?, ?> mo20548m(AbstractC13662r0 r0Var) {
        return C8119c.m20537g(r0Var);
    }

    public String toString() {
        return "VideoCapture:" + m39431i();
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: w */
    public void mo20547w() {
        m20556T().mo20456c().mo3078b(C13905a.m2336d(), this.f17564r);
    }

    @Override // androidx.camera.core.AbstractC1948w2
    /* renamed from: z */
    public void mo20546z() {
        m20561O();
        m20556T().mo20456c().mo3076d(this.f17564r);
    }
}
