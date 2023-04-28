package p374v;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.AbstractC1883m;
import androidx.concurrent.futures.C2114c;
import java.util.concurrent.Executor;
import p120gc.AbstractFutureC7576b;
import p272p.C11502b;
import p288q.C11935w;
import p390w.AbstractC13662r0;
import p431y.C14186f;

/* renamed from: v.g */
/* loaded from: classes.dex */
public final class C13381g {

    /* renamed from: c */
    private final C11935w f29956c;

    /* renamed from: d */
    final Executor f29957d;

    /* renamed from: g */
    C2114c.C2115a<Void> f29960g;

    /* renamed from: a */
    private boolean f29954a = false;

    /* renamed from: b */
    private boolean f29955b = false;

    /* renamed from: e */
    final Object f29958e = new Object();

    /* renamed from: f */
    private C11502b.C11503a f29959f = new C11502b.C11503a();

    /* renamed from: h */
    private final C11935w.AbstractC11938c f29961h = new C11935w.AbstractC11938c() { // from class: v.d
        @Override // p288q.C11935w.AbstractC11938c
        /* renamed from: a */
        public final boolean mo3810a(TotalCaptureResult totalCaptureResult) {
            boolean q;
            q = C13381g.this.m3793q(totalCaptureResult);
            return q;
        }
    };

    public C13381g(C11935w wVar, Executor executor) {
        this.f29956c = wVar;
        this.f29957d = executor;
    }

    /* renamed from: h */
    private void m3802h(C13385k kVar) {
        synchronized (this.f29958e) {
            for (AbstractC13662r0.AbstractC13663a aVar : kVar.mo2975c()) {
                this.f29959f.mo3781a().mo2999u(aVar, kVar.mo2976b(aVar));
            }
        }
    }

    /* renamed from: j */
    private void m3800j() {
        synchronized (this.f29958e) {
            this.f29959f = new C11502b.C11503a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m3796n(final C2114c.C2115a aVar) {
        this.f29957d.execute(new Runnable() { // from class: v.e
            @Override // java.lang.Runnable
            public final void run() {
                C13381g.this.m3797m(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m3794p(final C2114c.C2115a aVar) {
        this.f29957d.execute(new Runnable() { // from class: v.f
            @Override // java.lang.Runnable
            public final void run() {
                C13381g.this.m3795o(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ boolean m3793q(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            androidx.concurrent.futures.c$a<java.lang.Void> r0 = r2.f29960g
            r1 = 0
            if (r0 == 0) goto L_0x0032
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof p390w.C13671s2
            if (r0 == 0) goto L_0x0032
            w.s2 r3 = (p390w.C13671s2) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.m3089c(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0032
            androidx.concurrent.futures.c$a<java.lang.Void> r0 = r2.f29960g
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0032
            androidx.concurrent.futures.c$a<java.lang.Void> r3 = r2.f29960g
            r2.f29960g = r1
            goto L_0x0033
        L_0x0032:
            r3 = r1
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            r3.m38961c(r1)
        L_0x0038:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p374v.C13381g.m3793q(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m3792r(boolean z) {
        if (this.f29954a != z) {
            this.f29954a = z;
            if (!z) {
                C2114c.C2115a<Void> aVar = this.f29960g;
                if (aVar != null) {
                    aVar.m38958f(new AbstractC1883m.C1884a("The camera control has became inactive."));
                    this.f29960g = null;
                }
            } else if (this.f29955b) {
                m3788v();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m3795o(C2114c.C2115a<Void> aVar) {
        this.f29955b = true;
        C2114c.C2115a<Void> aVar2 = this.f29960g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f29960g = aVar;
        if (this.f29954a) {
            m3788v();
        }
        if (aVar2 != null) {
            aVar2.m38958f(new AbstractC1883m.C1884a("Camera2CameraControl was updated with new options."));
        }
    }

    /* renamed from: v */
    private void m3788v() {
        this.f29956c.m8249h0();
        this.f29955b = false;
    }

    /* renamed from: g */
    public AbstractFutureC7576b<Void> m3803g(C13385k kVar) {
        m3802h(kVar);
        return C14186f.m1419j(C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: v.c
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object n;
                n = C13381g.this.m3796n(aVar);
                return n;
            }
        }));
    }

    /* renamed from: i */
    public AbstractFutureC7576b<Void> m3801i() {
        m3800j();
        return C14186f.m1419j(C2114c.m38964a(new C2114c.AbstractC0030c() { // from class: v.b
            @Override // androidx.concurrent.futures.C2114c.AbstractC0030c
            /* renamed from: a */
            public final Object mo1403a(C2114c.C2115a aVar) {
                Object p;
                p = C13381g.this.m3794p(aVar);
                return p;
            }
        }));
    }

    /* renamed from: k */
    public C11502b m3799k() {
        C11502b b;
        synchronized (this.f29958e) {
            if (this.f29960g != null) {
                this.f29959f.mo3781a().mo2999u(C11502b.f39034C, Integer.valueOf(this.f29960g.hashCode()));
            }
            b = this.f29959f.m9555b();
        }
        return b;
    }

    /* renamed from: l */
    public C11935w.AbstractC11938c m3798l() {
        return this.f29961h;
    }

    /* renamed from: s */
    public void m3791s(final boolean z) {
        this.f29957d.execute(new Runnable() { // from class: v.a
            @Override // java.lang.Runnable
            public final void run() {
                C13381g.this.m3792r(z);
            }
        });
    }
}
