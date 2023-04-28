package p288q;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.core.AbstractC1883m;
import androidx.camera.core.C1811g0;
import androidx.camera.core.C1829h0;
import androidx.camera.core.C1915r1;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import p120gc.AbstractFutureC7576b;
import p272p.C11502b;
import p288q.C11935w;
import p308r.C12267f0;
import p355u.C13161a;
import p355u.C13162b;
import p374v.C13381g;
import p374v.C13385k;
import p390w.AbstractC13571b0;
import p390w.AbstractC13615k;
import p390w.AbstractC13662r0;
import p390w.AbstractC13672t;
import p390w.C13600g2;
import p390w.C13619k2;
import p390w.C13632m;
import p390w.C13639n0;
import p390w.C13671s2;
import p410x.C13905a;
import p431y.AbstractC14179a;
import p431y.C14183d;
import p431y.C14186f;

/* renamed from: q.w */
/* loaded from: classes.dex */
public class C11935w implements AbstractC13571b0 {

    /* renamed from: b */
    final C11937b f26686b;

    /* renamed from: c */
    final Executor f26687c;

    /* renamed from: e */
    private final C12267f0 f26689e;

    /* renamed from: f */
    private final AbstractC13571b0.AbstractC13574c f26690f;

    /* renamed from: g */
    private final C13619k2.C13621b f26691g;

    /* renamed from: h */
    private final C11828h2 f26692h;

    /* renamed from: i */
    private final C11862k3 f26693i;

    /* renamed from: j */
    private final C11831h3 f26694j;

    /* renamed from: k */
    private final C11955z1 f26695k;

    /* renamed from: l */
    private final C13381g f26696l;

    /* renamed from: m */
    private final C11901r0 f26697m;

    /* renamed from: q */
    private final C13161a f26701q;

    /* renamed from: w */
    private final C11936a f26707w;

    /* renamed from: d */
    private final Object f26688d = new Object();

    /* renamed from: n */
    private int f26698n = 0;

    /* renamed from: o */
    private volatile boolean f26699o = false;

    /* renamed from: p */
    private volatile int f26700p = 2;

    /* renamed from: r */
    private final C13162b f26702r = new C13162b();

    /* renamed from: s */
    private final AtomicLong f26703s = new AtomicLong(0);

    /* renamed from: t */
    private volatile AbstractFutureC7576b<Void> f26704t = C14186f.m1421h(null);

    /* renamed from: u */
    private int f26705u = 1;

    /* renamed from: v */
    private long f26706v = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.w$a */
    /* loaded from: classes.dex */
    public static final class C11936a extends AbstractC13615k {

        /* renamed from: a */
        Set<AbstractC13615k> f26708a = new HashSet();

        /* renamed from: b */
        Map<AbstractC13615k, Executor> f26709b = new ArrayMap();

        C11936a() {
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: a */
        public void mo3172a() {
            for (final AbstractC13615k kVar : this.f26708a) {
                try {
                    this.f26709b.get(kVar).execute(new Runnable() { // from class: q.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC13615k.this.mo3172a();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C1915r1.m39524d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: b */
        public void mo3171b(final AbstractC13672t tVar) {
            for (final AbstractC13615k kVar : this.f26708a) {
                try {
                    this.f26709b.get(kVar).execute(new Runnable() { // from class: q.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC13615k.this.mo3171b(tVar);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C1915r1.m39524d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // p390w.AbstractC13615k
        /* renamed from: c */
        public void mo3170c(final C13632m mVar) {
            for (final AbstractC13615k kVar : this.f26708a) {
                try {
                    this.f26709b.get(kVar).execute(new Runnable() { // from class: q.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC13615k.this.mo3170c(mVar);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C1915r1.m39524d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }

        /* renamed from: g */
        void m8225g(Executor executor, AbstractC13615k kVar) {
            this.f26708a.add(kVar);
            this.f26709b.put(kVar, executor);
        }

        /* renamed from: k */
        void m8221k(AbstractC13615k kVar) {
            this.f26708a.remove(kVar);
            this.f26709b.remove(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.w$b */
    /* loaded from: classes.dex */
    public static final class C11937b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final Set<AbstractC11938c> f26710a = new HashSet();

        /* renamed from: b */
        private final Executor f26711b;

        C11937b(Executor executor) {
            this.f26711b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m8218c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (AbstractC11938c cVar : this.f26710a) {
                if (cVar.mo3810a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (!hashSet.isEmpty()) {
                this.f26710a.removeAll(hashSet);
            }
        }

        /* renamed from: b */
        void m8219b(AbstractC11938c cVar) {
            this.f26710a.add(cVar);
        }

        /* renamed from: d */
        void m8217d(AbstractC11938c cVar) {
            this.f26710a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f26711b.execute(new Runnable() { // from class: q.x
                @Override // java.lang.Runnable
                public final void run() {
                    C11935w.C11937b.this.m8218c(totalCaptureResult);
                }
            });
        }
    }

    /* renamed from: q.w$c */
    /* loaded from: classes.dex */
    public interface AbstractC11938c {
        /* renamed from: a */
        boolean mo3810a(TotalCaptureResult totalCaptureResult);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11935w(C12267f0 f0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, AbstractC13571b0.AbstractC13574c cVar, C13600g2 g2Var) {
        C13619k2.C13621b bVar = new C13619k2.C13621b();
        this.f26691g = bVar;
        C11936a aVar = new C11936a();
        this.f26707w = aVar;
        this.f26689e = f0Var;
        this.f26690f = cVar;
        this.f26687c = executor;
        C11937b bVar2 = new C11937b(executor);
        this.f26686b = bVar2;
        bVar.m3180r(this.f26705u);
        bVar.m3189i(C11884o1.m8402d(bVar2));
        bVar.m3189i(aVar);
        this.f26695k = new C11955z1(this, f0Var, executor);
        this.f26692h = new C11828h2(this, scheduledExecutorService, executor, g2Var);
        this.f26693i = new C11862k3(this, f0Var, executor);
        this.f26694j = new C11831h3(this, f0Var, executor);
        this.f26701q = new C13161a(g2Var);
        this.f26696l = new C13381g(this, executor);
        this.f26697m = new C11901r0(this, f0Var, g2Var, executor);
        executor.execute(new Runnable() { // from class: q.p
            @Override // java.lang.Runnable
            public final void run() {
                C11935w.this.m8263T();
            }
        });
    }

    /* renamed from: H */
    private int m8275H(int i) {
        int[] iArr = (int[]) this.f26689e.m7252a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m8269N(i, iArr)) {
            return i;
        }
        if (m8269N(1, iArr)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: M */
    private boolean m8270M() {
        return m8273J() > 0;
    }

    /* renamed from: N */
    private boolean m8269N(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static boolean m8268O(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        if (!(tag instanceof C13671s2) || (l = (Long) ((C13671s2) tag).m3089c("CameraControlSessionUpdateId")) == null || l.longValue() < j) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static /* synthetic */ void m8266Q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m8265R(Executor executor, AbstractC13615k kVar) {
        this.f26707w.m8225g(executor, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static /* synthetic */ void m8264S() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m8263T() {
        m8235t(this.f26696l.m3798l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m8262U(AbstractC13615k kVar) {
        this.f26707w.m8221k(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ AbstractFutureC7576b m8261V(List list, int i, int i2, int i3, Void r5) {
        return this.f26697m.m8340d(list, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m8260W(C2114c.C2115a aVar) {
        C14186f.m1418k(m8244k0(m8246j0()), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ Object m8259X(final C2114c.C2115a aVar) {
        this.f26687c.execute(new Runnable() { // from class: q.r
            @Override // java.lang.Runnable
            public final void run() {
                C11935w.this.m8260W(aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static /* synthetic */ boolean m8258Y(long j, C2114c.C2115a aVar, TotalCaptureResult totalCaptureResult) {
        if (!m8268O(totalCaptureResult, j)) {
            return false;
        }
        aVar.m38961c(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ Object m8257Z(final long j, final C2114c.C2115a aVar) {
        m8235t(new AbstractC11938c() { // from class: q.i
            @Override // p288q.C11935w.AbstractC11938c
            /* renamed from: a */
            public final boolean mo3810a(TotalCaptureResult totalCaptureResult) {
                boolean Y;
                Y = C11935w.m8258Y(j, aVar, totalCaptureResult);
                return Y;
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    /* renamed from: k0 */
    private AbstractFutureC7576b<Void> m8244k0(final long j) {
        return C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: q.j
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object Z;
                Z = C11935w.this.m8257Z(j, aVar);
                return Z;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public int m8282A() {
        Integer num = (Integer) this.f26689e.m7252a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public int m8281B() {
        Integer num = (Integer) this.f26689e.m7252a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public int m8280C() {
        Integer num = (Integer) this.f26689e.m7252a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: D */
    public C13619k2 m8279D() {
        this.f26691g.m3180r(this.f26705u);
        this.f26691g.m3181q(m8278E());
        Object I = this.f26696l.m3799k().m9561I(null);
        if (I != null && (I instanceof Integer)) {
            this.f26691g.m3186l("Camera2CameraControl", I);
        }
        this.f26691g.m3186l("CameraControlSessionUpdateId", Long.valueOf(this.f26706v));
        return this.f26691g.m3185m();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[LOOP:0: B:12:0x006a->B:14:0x0070, LOOP_END] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p390w.AbstractC13662r0 m8278E() {
        /*
            r7 = this;
            p.b$a r0 = new p.b$a
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.m9553e(r1, r3)
            q.h2 r1 = r7.f26692h
            r1.m8566g(r0)
            u.a r1 = r7.f26701q
            r1.m4437a(r0)
            q.k3 r1 = r7.f26693i
            r1.m8437c(r0)
            boolean r1 = r7.f26699o
            r3 = 2
            if (r1 == 0) goto L_0x002d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.m9553e(r1, r3)
            goto L_0x0033
        L_0x002d:
            int r1 = r7.f26700p
            if (r1 == 0) goto L_0x0037
            if (r1 == r2) goto L_0x0035
        L_0x0033:
            r1 = r2
            goto L_0x003d
        L_0x0035:
            r1 = 3
            goto L_0x003d
        L_0x0037:
            u.b r1 = r7.f26702r
            int r1 = r1.m4436a(r3)
        L_0x003d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.m8277F(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.m9553e(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.m8275H(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.m9553e(r1, r2)
            q.z1 r1 = r7.f26695k
            r1.m8143c(r0)
            v.g r1 = r7.f26696l
            p.b r1 = r1.m3799k()
            java.util.Set r2 = r1.mo2975c()
            java.util.Iterator r2 = r2.iterator()
        L_0x006a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r2.next()
            w.r0$a r3 = (p390w.AbstractC13662r0.AbstractC13663a) r3
            w.w1 r4 = r0.mo3781a()
            w.r0$c r5 = p390w.AbstractC13662r0.EnumC13665c.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.mo2976b(r3)
            r4.mo3003E(r3, r5, r6)
            goto L_0x006a
        L_0x0084:
            p.b r0 = r0.m9555b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p288q.C11935w.m8278E():w.r0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public int m8277F(int i) {
        int[] iArr = (int[]) this.f26689e.m7252a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m8269N(i, iArr)) {
            return i;
        }
        if (m8269N(1, iArr)) {
            return 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public int m8276G(int i) {
        int[] iArr = (int[]) this.f26689e.m7252a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m8269N(i, iArr)) {
            return i;
        }
        if (m8269N(4, iArr)) {
            return 4;
        }
        if (m8269N(1, iArr)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: I */
    public C11831h3 m8274I() {
        return this.f26694j;
    }

    /* renamed from: J */
    int m8273J() {
        int i;
        synchronized (this.f26688d) {
            i = this.f26698n;
        }
        return i;
    }

    /* renamed from: K */
    public C11862k3 m8272K() {
        return this.f26693i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m8271L() {
        synchronized (this.f26688d) {
            this.f26698n++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean m8267P() {
        return this.f26699o;
    }

    @Override // p390w.AbstractC13571b0
    /* renamed from: a */
    public AbstractFutureC7576b<List<Void>> mo3340a(final List<C13639n0> list, final int i, final int i2) {
        if (!m8270M()) {
            C1915r1.m39517k("Camera2CameraControlImp", "Camera is not active.");
            return C14186f.m1423f(new AbstractC1883m.C1884a("Camera is not active."));
        }
        final int y = m8230y();
        return C14183d.m1433b(this.f26704t).m1429f(new AbstractC14179a() { // from class: q.o
            @Override // p431y.AbstractC14179a
            public final AbstractFutureC7576b apply(Object obj) {
                AbstractFutureC7576b V;
                V = C11935w.this.m8261V(list, i, y, i2, (Void) obj);
                return V;
            }
        }, this.f26687c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void m8256a0(AbstractC11938c cVar) {
        this.f26686b.m8217d(cVar);
    }

    @Override // p390w.AbstractC13571b0
    /* renamed from: b */
    public void mo3339b(AbstractC13662r0 r0Var) {
        this.f26696l.m3803g(C13385k.C13386a.m3778e(r0Var).m3779c()).mo1409a(new Runnable() { // from class: q.q
            @Override // java.lang.Runnable
            public final void run() {
                C11935w.m8266Q();
            }
        }, C13905a.m2339a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m8255b0(final AbstractC13615k kVar) {
        this.f26687c.execute(new Runnable() { // from class: q.k
            @Override // java.lang.Runnable
            public final void run() {
                C11935w.this.m8262U(kVar);
            }
        });
    }

    @Override // androidx.camera.core.AbstractC1883m
    /* renamed from: c */
    public AbstractFutureC7576b<Void> mo3338c(float f) {
        if (!m8270M()) {
            return C14186f.m1423f(new AbstractC1883m.C1884a("Camera is not active."));
        }
        return C14186f.m1419j(this.f26693i.m8428l(f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m8254c0() {
        m8251f0(1);
    }

    @Override // p390w.AbstractC13571b0
    /* renamed from: d */
    public Rect mo3337d() {
        return (Rect) C2517g.m37588g((Rect) this.f26689e.m7252a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m8253d0(boolean z) {
        this.f26692h.m8580E(z);
        this.f26693i.m8429k(z);
        this.f26694j.m8537j(z);
        this.f26695k.m8144b(z);
        this.f26696l.m3791s(z);
    }

    @Override // p390w.AbstractC13571b0
    /* renamed from: e */
    public void mo3336e(int i) {
        if (!m8270M()) {
            C1915r1.m39517k("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f26700p = i;
        this.f26704t = m8248i0();
    }

    /* renamed from: e0 */
    public void m8252e0(Rational rational) {
        this.f26692h.m8579F(rational);
    }

    @Override // androidx.camera.core.AbstractC1883m
    /* renamed from: f */
    public AbstractFutureC7576b<Void> mo3335f(boolean z) {
        if (!m8270M()) {
            return C14186f.m1423f(new AbstractC1883m.C1884a("Camera is not active."));
        }
        return C14186f.m1419j(this.f26694j.m8543d(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void m8251f0(int i) {
        this.f26705u = i;
        this.f26692h.m8578G(i);
        this.f26697m.m8341c(this.f26705u);
    }

    @Override // p390w.AbstractC13571b0
    /* renamed from: g */
    public AbstractC13662r0 mo3334g() {
        return this.f26696l.m3799k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void m8250g0(List<C13639n0> list) {
        this.f26690f.mo3330b(list);
    }

    @Override // androidx.camera.core.AbstractC1883m
    /* renamed from: h */
    public AbstractFutureC7576b<C1829h0> mo3333h(C1811g0 g0Var) {
        if (!m8270M()) {
            return C14186f.m1423f(new AbstractC1883m.C1884a("Camera is not active."));
        }
        return C14186f.m1419j(this.f26692h.m8576I(g0Var));
    }

    /* renamed from: h0 */
    public void m8249h0() {
        this.f26687c.execute(new Runnable() { // from class: q.s
            @Override // java.lang.Runnable
            public final void run() {
                C11935w.this.m8246j0();
            }
        });
    }

    @Override // p390w.AbstractC13571b0
    /* renamed from: i */
    public void mo3332i() {
        this.f26696l.m3801i().mo1409a(new Runnable() { // from class: q.m
            @Override // java.lang.Runnable
            public final void run() {
                C11935w.m8264S();
            }
        }, C13905a.m2339a());
    }

    /* renamed from: i0 */
    AbstractFutureC7576b<Void> m8248i0() {
        return C14186f.m1419j(C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: q.l
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object X;
                X = C11935w.this.m8259X(aVar);
                return X;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public long m8246j0() {
        this.f26706v = this.f26703s.getAndIncrement();
        this.f26690f.mo3331a();
        return this.f26706v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m8235t(AbstractC11938c cVar) {
        this.f26686b.m8219b(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m8234u(final Executor executor, final AbstractC13615k kVar) {
        this.f26687c.execute(new Runnable() { // from class: q.n
            @Override // java.lang.Runnable
            public final void run() {
                C11935w.this.m8265R(executor, kVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m8233v() {
        synchronized (this.f26688d) {
            int i = this.f26698n;
            if (i != 0) {
                this.f26698n = i - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m8232w(boolean z) {
        this.f26699o = z;
        if (!z) {
            C13639n0.C13640a aVar = new C13639n0.C13640a();
            aVar.m3130o(this.f26705u);
            aVar.m3129p(true);
            C11502b.C11503a aVar2 = new C11502b.C11503a();
            aVar2.m9553e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m8277F(1)));
            aVar2.m9553e(CaptureRequest.FLASH_MODE, 0);
            aVar.m3140e(aVar2.m9555b());
            m8250g0(Collections.singletonList(aVar.m3137h()));
        }
        m8246j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public Rect m8231x() {
        return this.f26693i.m8435e();
    }

    /* renamed from: y */
    public int m8230y() {
        return this.f26700p;
    }

    /* renamed from: z */
    public C11828h2 m8229z() {
        return this.f26692h;
    }
}
