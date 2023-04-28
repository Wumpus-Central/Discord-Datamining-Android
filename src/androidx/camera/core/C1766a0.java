package androidx.camera.core;

import android.os.Handler;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p390w.AbstractC13579c0;
import p390w.AbstractC13584d0;
import p390w.AbstractC13662r0;
import p390w.AbstractC13692w1;
import p390w.AbstractC13702y2;
import p390w.C13582c2;
import p390w.C13604h2;
import p390w.C13696x1;
import p451z.AbstractC14506i;
import p451z.C14505h;

/* renamed from: androidx.camera.core.a0 */
/* loaded from: classes.dex */
public final class C1766a0 implements AbstractC14506i<C1961z> {

    /* renamed from: w */
    private final C13582c2 f1597w;

    /* renamed from: x */
    static final AbstractC13662r0.AbstractC13663a<AbstractC13584d0.AbstractC13585a> f1594x = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.appConfig.cameraFactoryProvider", AbstractC13584d0.AbstractC13585a.class);

    /* renamed from: y */
    static final AbstractC13662r0.AbstractC13663a<AbstractC13579c0.AbstractC13580a> f1595y = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.appConfig.deviceSurfaceManagerProvider", AbstractC13579c0.AbstractC13580a.class);

    /* renamed from: z */
    static final AbstractC13662r0.AbstractC13663a<AbstractC13702y2.AbstractC13705c> f1596z = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.appConfig.useCaseConfigFactoryProvider", AbstractC13702y2.AbstractC13705c.class);

    /* renamed from: A */
    static final AbstractC13662r0.AbstractC13663a<Executor> f35312A = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: B */
    static final AbstractC13662r0.AbstractC13663a<Handler> f35313B = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: C */
    static final AbstractC13662r0.AbstractC13663a<Integer> f35314C = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: D */
    static final AbstractC13662r0.AbstractC13663a<C1921t> f35315D = AbstractC13662r0.AbstractC13663a.m3102a("camerax.core.appConfig.availableCamerasLimiter", C1921t.class);

    /* renamed from: androidx.camera.core.a0$a */
    /* loaded from: classes.dex */
    public static final class C1767a {

        /* renamed from: a */
        private final C13696x1 f1598a;

        public C1767a() {
            this(C13696x1.m3002J());
        }

        /* renamed from: b */
        private AbstractC13692w1 m39891b() {
            return this.f1598a;
        }

        /* renamed from: a */
        public C1766a0 m39892a() {
            return new C1766a0(C13582c2.m3310H(this.f1598a));
        }

        /* renamed from: c */
        public C1767a m39890c(AbstractC13584d0.AbstractC13585a aVar) {
            m39891b().mo2999u(C1766a0.f1594x, aVar);
            return this;
        }

        /* renamed from: d */
        public C1767a m39889d(AbstractC13579c0.AbstractC13580a aVar) {
            m39891b().mo2999u(C1766a0.f1595y, aVar);
            return this;
        }

        /* renamed from: e */
        public C1767a m39888e(Class<C1961z> cls) {
            m39891b().mo2999u(AbstractC14506i.f32900t, cls);
            if (m39891b().mo2977a(AbstractC14506i.f32899s, null) == null) {
                m39887f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: f */
        public C1767a m39887f(String str) {
            m39891b().mo2999u(AbstractC14506i.f32899s, str);
            return this;
        }

        /* renamed from: g */
        public C1767a m39886g(AbstractC13702y2.AbstractC13705c cVar) {
            m39891b().mo2999u(C1766a0.f1596z, cVar);
            return this;
        }

        private C1767a(C13696x1 x1Var) {
            this.f1598a = x1Var;
            Class cls = (Class) x1Var.mo2977a(AbstractC14506i.f32900t, null);
            if (cls == null || cls.equals(C1961z.class)) {
                m39888e(C1961z.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* renamed from: androidx.camera.core.a0$b */
    /* loaded from: classes.dex */
    public interface AbstractC1768b {
        C1766a0 getCameraXConfig();
    }

    C1766a0(C13582c2 c2Var) {
        this.f1597w = c2Var;
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: A */
    public /* synthetic */ Object mo2987A(AbstractC13662r0.AbstractC13663a aVar, AbstractC13662r0.EnumC13665c cVar) {
        return C13604h2.m3249h(this, aVar, cVar);
    }

    /* renamed from: F */
    public C1921t m39898F(C1921t tVar) {
        return (C1921t) this.f1597w.mo2977a(f35315D, tVar);
    }

    /* renamed from: G */
    public Executor m39897G(Executor executor) {
        return (Executor) this.f1597w.mo2977a(f35312A, executor);
    }

    /* renamed from: H */
    public AbstractC13584d0.AbstractC13585a m39896H(AbstractC13584d0.AbstractC13585a aVar) {
        return (AbstractC13584d0.AbstractC13585a) this.f1597w.mo2977a(f1594x, aVar);
    }

    /* renamed from: I */
    public AbstractC13579c0.AbstractC13580a m39895I(AbstractC13579c0.AbstractC13580a aVar) {
        return (AbstractC13579c0.AbstractC13580a) this.f1597w.mo2977a(f1595y, aVar);
    }

    /* renamed from: J */
    public Handler m39894J(Handler handler) {
        return (Handler) this.f1597w.mo2977a(f35313B, handler);
    }

    /* renamed from: K */
    public AbstractC13702y2.AbstractC13705c m39893K(AbstractC13702y2.AbstractC13705c cVar) {
        return (AbstractC13702y2.AbstractC13705c) this.f1597w.mo2977a(f1596z, cVar);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: a */
    public /* synthetic */ Object mo2977a(AbstractC13662r0.AbstractC13663a aVar, Object obj) {
        return C13604h2.m3250g(this, aVar, obj);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: b */
    public /* synthetic */ Object mo2976b(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3251f(this, aVar);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: c */
    public /* synthetic */ Set mo2975c() {
        return C13604h2.m3252e(this);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: d */
    public /* synthetic */ AbstractC13662r0.EnumC13665c mo2974d(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3254c(this, aVar);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: e */
    public /* synthetic */ boolean mo2973e(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3256a(this, aVar);
    }

    @Override // p390w.AbstractC13608i2
    /* renamed from: i */
    public AbstractC13662r0 mo2970i() {
        return this.f1597w;
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: l */
    public /* synthetic */ void mo2967l(String str, AbstractC13662r0.AbstractC13664b bVar) {
        C13604h2.m3255b(this, str, bVar);
    }

    @Override // p451z.AbstractC14506i
    /* renamed from: m */
    public /* synthetic */ String mo303m(String str) {
        return C14505h.m304a(this, str);
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: x */
    public /* synthetic */ Set mo2959x(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3253d(this, aVar);
    }
}
