package p288q;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.C1915r1;
import androidx.concurrent.futures.C2114c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p120gc.AbstractFutureC7576b;
import p328s.C12754q;
import p390w.AbstractC13689w0;
import p410x.C13905a;
import p431y.AbstractC14179a;
import p431y.C14183d;
import p431y.C14186f;

/* renamed from: q.b3 */
/* loaded from: classes.dex */
class C11792b3 extends C11946x2 {

    /* renamed from: p */
    private final Set<String> f26311p;

    /* renamed from: q */
    private final AbstractFutureC7576b<Void> f26312q;

    /* renamed from: r */
    C2114c.C2115a<Void> f26313r;

    /* renamed from: s */
    private List<AbstractC13689w0> f26314s;

    /* renamed from: t */
    AbstractFutureC7576b<Void> f26315t;

    /* renamed from: u */
    AbstractFutureC7576b<List<Surface>> f26316u;

    /* renamed from: v */
    private boolean f26317v;

    /* renamed from: o */
    private final Object f26310o = new Object();

    /* renamed from: w */
    private final CameraCaptureSession.CaptureCallback f26318w = new C11793a();

    /* renamed from: q.b3$a */
    /* loaded from: classes.dex */
    class C11793a extends CameraCaptureSession.CaptureCallback {
        C11793a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            C2114c.C2115a<Void> aVar = C11792b3.this.f26313r;
            if (aVar != null) {
                aVar.m38960d();
                C11792b3.this.f26313r = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            C2114c.C2115a<Void> aVar = C11792b3.this.f26313r;
            if (aVar != null) {
                aVar.m38961c(null);
                C11792b3.this.f26313r = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11792b3(Set<String> set, C11940w1 w1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(w1Var, executor, scheduledExecutorService, handler);
        this.f26311p = set;
        if (set.contains("wait_for_request")) {
            this.f26312q = C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: q.y2
                @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
                /* renamed from: a */
                public final Object mo1403a(C2114c.C2115a aVar) {
                    Object R;
                    R = C11792b3.this.m8611R(aVar);
                    return R;
                }
            });
        } else {
            this.f26312q = C14186f.m1421h(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m8620D() {
        m8615N("Session call super.close()");
        super.close();
    }

    /* renamed from: O */
    static void m8614O(Set<AbstractC11912r2> set) {
        for (AbstractC11912r2 r2Var : set) {
            r2Var.mo8179c().mo8166p(r2Var);
        }
    }

    /* renamed from: P */
    private void m8613P(Set<AbstractC11912r2> set) {
        for (AbstractC11912r2 r2Var : set) {
            r2Var.mo8179c().mo8165q(r2Var);
        }
    }

    /* renamed from: Q */
    private List<AbstractFutureC7576b<Void>> m8612Q(String str, List<AbstractC11912r2> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC11912r2 r2Var : list) {
            arrayList.add(r2Var.mo8172j(str));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ Object m8611R(C2114c.C2115a aVar) {
        this.f26313r = aVar;
        return "StartStreamingFuture[session=" + this + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ AbstractFutureC7576b m8610S(CameraDevice cameraDevice, C12754q qVar, List list, List list2) {
        return super.mo8173i(cameraDevice, qVar, list);
    }

    /* renamed from: M */
    void m8616M() {
        synchronized (this.f26310o) {
            if (this.f26314s == null) {
                m8615N("deferrableSurface == null, maybe forceClose, skip close");
                return;
            }
            if (this.f26311p.contains("deferrableSurface_close")) {
                for (AbstractC13689w0 w0Var : this.f26314s) {
                    w0Var.m3023c();
                }
                m8615N("deferrableSurface closed");
            }
        }
    }

    /* renamed from: N */
    void m8615N(String str) {
        C1915r1.m39527a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // p288q.C11946x2, p288q.AbstractC11912r2
    public void close() {
        m8615N("Session call close()");
        if (this.f26311p.contains("wait_for_request")) {
            synchronized (this.f26310o) {
                if (!this.f26317v) {
                    this.f26312q.cancel(true);
                }
            }
        }
        this.f26312q.mo1409a(new Runnable() { // from class: q.z2
            @Override // java.lang.Runnable
            public final void run() {
                C11792b3.this.m8620D();
            }
        }, mo8180b());
    }

    @Override // p288q.C11946x2, p288q.AbstractC11912r2
    /* renamed from: g */
    public int mo8175g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int g;
        if (!this.f26311p.contains("wait_for_request")) {
            return super.mo8175g(captureRequest, captureCallback);
        }
        synchronized (this.f26310o) {
            this.f26317v = true;
            g = super.mo8175g(captureRequest, C11877n0.m8404b(this.f26318w, captureCallback));
        }
        return g;
    }

    @Override // p288q.C11946x2, p288q.C11798c3.AbstractC11800b
    /* renamed from: h */
    public AbstractFutureC7576b<List<Surface>> mo8174h(List<AbstractC13689w0> list, long j) {
        AbstractFutureC7576b<List<Surface>> j2;
        synchronized (this.f26310o) {
            this.f26314s = list;
            j2 = C14186f.m1419j(super.mo8174h(list, j));
        }
        return j2;
    }

    @Override // p288q.C11946x2, p288q.C11798c3.AbstractC11800b
    /* renamed from: i */
    public AbstractFutureC7576b<Void> mo8173i(final CameraDevice cameraDevice, final C12754q qVar, final List<AbstractC13689w0> list) {
        AbstractFutureC7576b<Void> j;
        synchronized (this.f26310o) {
            C14183d f = C14183d.m1433b(C14186f.m1415n(m8612Q("wait_for_request", this.f26731b.m8212e()))).m1429f(new AbstractC14179a() { // from class: q.a3
                @Override // p431y.AbstractC14179a
                public final AbstractFutureC7576b apply(Object obj) {
                    AbstractFutureC7576b S;
                    S = C11792b3.this.m8610S(cameraDevice, qVar, list, (List) obj);
                    return S;
                }
            }, C13905a.m2339a());
            this.f26315t = f;
            j = C14186f.m1419j(f);
        }
        return j;
    }

    @Override // p288q.C11946x2, p288q.AbstractC11912r2
    /* renamed from: j */
    public AbstractFutureC7576b<Void> mo8172j(String str) {
        str.hashCode();
        if (!str.equals("wait_for_request")) {
            return super.mo8172j(str);
        }
        return C14186f.m1419j(this.f26312q);
    }

    @Override // p288q.C11946x2, p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: p */
    public void mo8166p(AbstractC11912r2 r2Var) {
        m8616M();
        m8615N("onClosed()");
        super.mo8166p(r2Var);
    }

    @Override // p288q.C11946x2, p288q.AbstractC11912r2.AbstractC11913a
    /* renamed from: r */
    public void mo8164r(AbstractC11912r2 r2Var) {
        AbstractC11912r2 next;
        AbstractC11912r2 next2;
        m8615N("Session onConfigured()");
        if (this.f26311p.contains("force_close")) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<AbstractC11912r2> it = this.f26731b.m8211f().iterator();
            while (it.hasNext() && (next2 = it.next()) != r2Var) {
                linkedHashSet.add(next2);
            }
            m8613P(linkedHashSet);
        }
        super.mo8164r(r2Var);
        if (this.f26311p.contains("force_close")) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<AbstractC11912r2> it2 = this.f26731b.m8213d().iterator();
            while (it2.hasNext() && (next = it2.next()) != r2Var) {
                linkedHashSet2.add(next);
            }
            m8614O(linkedHashSet2);
        }
    }

    @Override // p288q.C11946x2, p288q.C11798c3.AbstractC11800b
    public boolean stop() {
        boolean stop;
        synchronized (this.f26310o) {
            if (m8188C()) {
                m8616M();
            } else {
                AbstractFutureC7576b<Void> bVar = this.f26315t;
                if (bVar != null) {
                    bVar.cancel(true);
                }
                AbstractFutureC7576b<List<Surface>> bVar2 = this.f26316u;
                if (bVar2 != null) {
                    bVar2.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
