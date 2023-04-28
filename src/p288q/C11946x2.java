package p288q;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.C1915r1;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p120gc.AbstractFutureC7576b;
import p288q.AbstractC11912r2;
import p288q.C11798c3;
import p308r.C12270g0;
import p308r.C12277j;
import p328s.C12735b;
import p328s.C12754q;
import p390w.AbstractC13689w0;
import p390w.C13575b1;
import p410x.C13905a;
import p431y.AbstractC14179a;
import p431y.AbstractC14182c;
import p431y.C14183d;
import p431y.C14186f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.x2 */
/* loaded from: classes.dex */
public class C11946x2 extends AbstractC11912r2.AbstractC11913a implements AbstractC11912r2, C11798c3.AbstractC11800b {

    /* renamed from: b */
    final C11940w1 f26731b;

    /* renamed from: c */
    final Handler f26732c;

    /* renamed from: d */
    final Executor f26733d;

    /* renamed from: e */
    private final ScheduledExecutorService f26734e;

    /* renamed from: f */
    AbstractC11912r2.AbstractC11913a f26735f;

    /* renamed from: g */
    C12277j f26736g;

    /* renamed from: h */
    AbstractFutureC7576b<Void> f26737h;

    /* renamed from: i */
    C2114c.C2115a<Void> f26738i;

    /* renamed from: j */
    private AbstractFutureC7576b<List<Surface>> f26739j;

    /* renamed from: a */
    final Object f26730a = new Object();

    /* renamed from: k */
    private List<AbstractC13689w0> f26740k = null;

    /* renamed from: l */
    private boolean f26741l = false;

    /* renamed from: m */
    private boolean f26742m = false;

    /* renamed from: n */
    private boolean f26743n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.x2$a */
    /* loaded from: classes.dex */
    public class C11947a implements AbstractC14182c<Void> {
        C11947a() {
        }

        /* renamed from: b */
        public void mo1412a(Void r1) {
        }

        @Override // p431y.AbstractC14182c
        public void onFailure(Throwable th2) {
            C11946x2.this.mo8178d();
            C11946x2 x2Var = C11946x2.this;
            x2Var.f26731b.m8207j(x2Var);
        }
    }

    /* renamed from: q.x2$b */
    /* loaded from: classes.dex */
    class C11948b extends CameraCaptureSession.StateCallback {
        C11948b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            C11946x2.this.m8190A(cameraCaptureSession);
            C11946x2 x2Var = C11946x2.this;
            x2Var.mo8181a(x2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            C11946x2.this.m8190A(cameraCaptureSession);
            C11946x2 x2Var = C11946x2.this;
            x2Var.mo8167o(x2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            C11946x2.this.m8190A(cameraCaptureSession);
            C11946x2 x2Var = C11946x2.this;
            x2Var.mo8166p(x2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C2114c.C2115a<Void> aVar;
            try {
                C11946x2.this.m8190A(cameraCaptureSession);
                C11946x2 x2Var = C11946x2.this;
                x2Var.mo8165q(x2Var);
                synchronized (C11946x2.this.f26730a) {
                    C2517g.m37587h(C11946x2.this.f26738i, "OpenCaptureSession completer should not null");
                    C11946x2 x2Var2 = C11946x2.this;
                    aVar = x2Var2.f26738i;
                    x2Var2.f26738i = null;
                }
                aVar.m38958f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th2) {
                synchronized (C11946x2.this.f26730a) {
                    C2517g.m37587h(C11946x2.this.f26738i, "OpenCaptureSession completer should not null");
                    C11946x2 x2Var3 = C11946x2.this;
                    C2114c.C2115a<Void> aVar2 = x2Var3.f26738i;
                    x2Var3.f26738i = null;
                    aVar2.m38958f(new IllegalStateException("onConfigureFailed"));
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C2114c.C2115a<Void> aVar;
            try {
                C11946x2.this.m8190A(cameraCaptureSession);
                C11946x2 x2Var = C11946x2.this;
                x2Var.mo8164r(x2Var);
                synchronized (C11946x2.this.f26730a) {
                    C2517g.m37587h(C11946x2.this.f26738i, "OpenCaptureSession completer should not null");
                    C11946x2 x2Var2 = C11946x2.this;
                    aVar = x2Var2.f26738i;
                    x2Var2.f26738i = null;
                }
                aVar.m38961c(null);
            } catch (Throwable th2) {
                synchronized (C11946x2.this.f26730a) {
                    C2517g.m37587h(C11946x2.this.f26738i, "OpenCaptureSession completer should not null");
                    C11946x2 x2Var3 = C11946x2.this;
                    C2114c.C2115a<Void> aVar2 = x2Var3.f26738i;
                    x2Var3.f26738i = null;
                    aVar2.m38961c(null);
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            C11946x2.this.m8190A(cameraCaptureSession);
            C11946x2 x2Var = C11946x2.this;
            x2Var.mo8163s(x2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C11946x2.this.m8190A(cameraCaptureSession);
            C11946x2 x2Var = C11946x2.this;
            x2Var.mo8161u(x2Var, surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11946x2(C11940w1 w1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f26731b = w1Var;
        this.f26732c = handler;
        this.f26733d = executor;
        this.f26734e = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m8187D() {
        mo8162t(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m8186E(AbstractC11912r2 r2Var) {
        this.f26731b.m8209h(this);
        mo8162t(r2Var);
        this.f26735f.mo8166p(r2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m8185F(AbstractC11912r2 r2Var) {
        this.f26735f.mo8162t(r2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ Object m8184G(List list, C12270g0 g0Var, C12754q qVar, C2114c.C2115a aVar) {
        boolean z;
        String str;
        synchronized (this.f26730a) {
            m8189B(list);
            if (this.f26738i == null) {
                z = true;
            } else {
                z = false;
            }
            C2517g.m37585j(z, "The openCaptureSessionCompleter can only set once!");
            this.f26738i = aVar;
            g0Var.m7243a(qVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ AbstractFutureC7576b m8183H(List list, List list2) {
        C1915r1.m39527a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        if (list2.contains(null)) {
            return C14186f.m1423f(new AbstractC13689w0.C13690a("Surface closed", (AbstractC13689w0) list.get(list2.indexOf(null))));
        }
        if (list2.isEmpty()) {
            return C14186f.m1423f(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return C14186f.m1421h(list2);
    }

    /* renamed from: A */
    void m8190A(CameraCaptureSession cameraCaptureSession) {
        if (this.f26736g == null) {
            this.f26736g = C12277j.m7224d(cameraCaptureSession, this.f26732c);
        }
    }

    /* renamed from: B */
    void m8189B(List<AbstractC13689w0> list) {
        synchronized (this.f26730a) {
            m8182I();
            C13575b1.m3324f(list);
            this.f26740k = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m8188C() {
        boolean z;
        synchronized (this.f26730a) {
            if (this.f26737h != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: I */
    void m8182I() {
        synchronized (this.f26730a) {
            List<AbstractC13689w0> list = this.f26740k;
            if (list != null) {
                C13575b1.m3325e(list);
                this.f26740k = null;
            }
        }
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: a */
    public void mo8181a(AbstractC11912r2 r2Var) {
        this.f26735f.mo8181a(r2Var);
    }

    @Override // p288q.C11798c3.AbstractC11800b
    /* renamed from: b */
    public Executor mo8180b() {
        return this.f26733d;
    }

    @Override // p288q.AbstractC11912r2
    /* renamed from: c */
    public AbstractC11912r2.AbstractC11913a mo8179c() {
        return this;
    }

    public void close() {
        C2517g.m37587h(this.f26736g, "Need to call openCaptureSession before using this API.");
        this.f26731b.m8208i(this);
        this.f26736g.m7225c().close();
        mo8180b().execute(new Runnable() { // from class: q.v2
            @Override // java.lang.Runnable
            public final void run() {
                C11946x2.this.m8187D();
            }
        });
    }

    @Override // p288q.AbstractC11912r2
    /* renamed from: d */
    public void mo8178d() {
        m8182I();
    }

    @Override // p288q.AbstractC11912r2
    /* renamed from: e */
    public void mo8177e() {
        C2517g.m37587h(this.f26736g, "Need to call openCaptureSession before using this API.");
        this.f26736g.m7225c().abortCaptures();
    }

    @Override // p288q.AbstractC11912r2
    /* renamed from: f */
    public CameraDevice mo8176f() {
        C2517g.m37588g(this.f26736g);
        return this.f26736g.m7225c().getDevice();
    }

    /* renamed from: g */
    public int mo8175g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        C2517g.m37587h(this.f26736g, "Need to call openCaptureSession before using this API.");
        return this.f26736g.m7226b(captureRequest, mo8180b(), captureCallback);
    }

    /* renamed from: h */
    public AbstractFutureC7576b<List<Surface>> mo8174h(final List<AbstractC13689w0> list, long j) {
        synchronized (this.f26730a) {
            if (this.f26742m) {
                return C14186f.m1423f(new CancellationException("Opener is disabled"));
            }
            C14183d f = C14183d.m1433b(C13575b1.m3319k(list, false, j, mo8180b(), this.f26734e)).m1429f(new AbstractC14179a() { // from class: q.s2
                @Override // p431y.AbstractC14179a
                public final AbstractFutureC7576b apply(Object obj) {
                    AbstractFutureC7576b H;
                    H = C11946x2.this.m8183H(list, (List) obj);
                    return H;
                }
            }, mo8180b());
            this.f26739j = f;
            return C14186f.m1419j(f);
        }
    }

    /* renamed from: i */
    public AbstractFutureC7576b<Void> mo8173i(CameraDevice cameraDevice, final C12754q qVar, final List<AbstractC13689w0> list) {
        synchronized (this.f26730a) {
            if (this.f26742m) {
                return C14186f.m1423f(new CancellationException("Opener is disabled"));
            }
            this.f26731b.m8205l(this);
            final C12270g0 b = C12270g0.m7242b(cameraDevice, this.f26732c);
            AbstractFutureC7576b<Void> a = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: q.t2
                @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                /* renamed from: a */
                public final Object mo1403a(C2114c.C2115a aVar) {
                    Object G;
                    G = C11946x2.this.m8184G(list, b, qVar, aVar);
                    return G;
                }
            });
            this.f26737h = a;
            C14186f.m1427b(a, new C11947a(), C13905a.m2339a());
            return C14186f.m1419j(this.f26737h);
        }
    }

    /* renamed from: j */
    public AbstractFutureC7576b<Void> mo8172j(String str) {
        return C14186f.m1421h(null);
    }

    @Override // p288q.AbstractC11912r2
    /* renamed from: k */
    public int mo8171k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        C2517g.m37587h(this.f26736g, "Need to call openCaptureSession before using this API.");
        return this.f26736g.m7227a(list, mo8180b(), captureCallback);
    }

    @Override // p288q.AbstractC11912r2
    /* renamed from: l */
    public C12277j mo8170l() {
        C2517g.m37588g(this.f26736g);
        return this.f26736g;
    }

    @Override // p288q.C11798c3.AbstractC11800b
    /* renamed from: m */
    public C12754q mo8169m(int i, List<C12735b> list, AbstractC11912r2.AbstractC11913a aVar) {
        this.f26735f = aVar;
        return new C12754q(i, list, mo8180b(), new C11948b());
    }

    @Override // p288q.AbstractC11912r2
    /* renamed from: n */
    public void mo8168n() {
        C2517g.m37587h(this.f26736g, "Need to call openCaptureSession before using this API.");
        this.f26736g.m7225c().stopRepeating();
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: o */
    public void mo8167o(AbstractC11912r2 r2Var) {
        this.f26735f.mo8167o(r2Var);
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: p */
    public void mo8166p(final AbstractC11912r2 r2Var) {
        AbstractFutureC7576b<Void> bVar;
        synchronized (this.f26730a) {
            if (!this.f26741l) {
                this.f26741l = true;
                C2517g.m37587h(this.f26737h, "Need to call openCaptureSession before using this API.");
                bVar = this.f26737h;
            } else {
                bVar = null;
            }
        }
        mo8178d();
        if (bVar != null) {
            bVar.mo1409a(new Runnable() { // from class: q.u2
                @Override // java.lang.Runnable
                public final void run() {
                    C11946x2.this.m8186E(r2Var);
                }
            }, C13905a.m2339a());
        }
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: q */
    public void mo8165q(AbstractC11912r2 r2Var) {
        mo8178d();
        this.f26731b.m8207j(this);
        this.f26735f.mo8165q(r2Var);
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: r */
    public void mo8164r(AbstractC11912r2 r2Var) {
        this.f26731b.m8206k(this);
        this.f26735f.mo8164r(r2Var);
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: s */
    public void mo8163s(AbstractC11912r2 r2Var) {
        this.f26735f.mo8163s(r2Var);
    }

    public boolean stop() {
        boolean z;
        AbstractFutureC7576b<List<Surface>> bVar = null;
        try {
            synchronized (this.f26730a) {
                if (!this.f26742m) {
                    AbstractFutureC7576b<List<Surface>> bVar2 = this.f26739j;
                    if (bVar2 != null) {
                        bVar = bVar2;
                    }
                    this.f26742m = true;
                }
                if (!m8188C()) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        } finally {
            if (bVar != null) {
                bVar.cancel(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: t */
    public void mo8162t(final AbstractC11912r2 r2Var) {
        AbstractFutureC7576b<Void> bVar;
        synchronized (this.f26730a) {
            if (!this.f26743n) {
                this.f26743n = true;
                C2517g.m37587h(this.f26737h, "Need to call openCaptureSession before using this API.");
                bVar = this.f26737h;
            } else {
                bVar = null;
            }
        }
        if (bVar != null) {
            bVar.mo1409a(new Runnable() { // from class: q.w2
                @Override // java.lang.Runnable
                public final void run() {
                    C11946x2.this.m8185F(r2Var);
                }
            }, C13905a.m2339a());
        }
    }

    @Override // p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: u */
    public void mo8161u(AbstractC11912r2 r2Var, Surface surface) {
        this.f26735f.mo8161u(r2Var, surface);
    }
}
