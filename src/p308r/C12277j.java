package p308r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import p308r.C12277j;

/* renamed from: r.j */
/* loaded from: classes.dex */
public final class C12277j {

    /* renamed from: a */
    private final AbstractC12278a f27594a;

    /* renamed from: r.j$a */
    /* loaded from: classes.dex */
    interface AbstractC12278a {
        /* renamed from: a */
        CameraCaptureSession mo7223a();

        /* renamed from: b */
        int mo7222b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        /* renamed from: c */
        int mo7221c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* renamed from: r.j$b */
    /* loaded from: classes.dex */
    static final class C12279b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final CameraCaptureSession.CaptureCallback f27595a;

        /* renamed from: b */
        private final Executor f27596b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C12279b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f27596b = executor;
            this.f27595a = captureCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m7213h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            C12262d.m7256a(this.f27595a, cameraCaptureSession, captureRequest, surface, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m7212i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f27595a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m7211j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f27595a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m7210k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f27595a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m7209l(CameraCaptureSession cameraCaptureSession, int i) {
            this.f27595a.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m7208m(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f27595a.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m7207n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f27595a.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
            this.f27596b.execute(new Runnable() { // from class: r.l
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12279b.this.m7213h(cameraCaptureSession, captureRequest, surface, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f27596b.execute(new Runnable() { // from class: r.o
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12279b.this.m7212i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f27596b.execute(new Runnable() { // from class: r.q
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12279b.this.m7211j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f27596b.execute(new Runnable() { // from class: r.n
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12279b.this.m7210k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i) {
            this.f27596b.execute(new Runnable() { // from class: r.k
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12279b.this.m7209l(cameraCaptureSession, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.f27596b.execute(new Runnable() { // from class: r.m
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12279b.this.m7208m(cameraCaptureSession, i, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
            this.f27596b.execute(new Runnable() { // from class: r.p
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12279b.this.m7207n(cameraCaptureSession, captureRequest, j, j2);
                }
            });
        }
    }

    /* renamed from: r.j$c */
    /* loaded from: classes.dex */
    static final class C12280c extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        final CameraCaptureSession.StateCallback f27597a;

        /* renamed from: b */
        private final Executor f27598b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C12280c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f27598b = executor;
            this.f27597a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m7199h(CameraCaptureSession cameraCaptureSession) {
            this.f27597a.onActive(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m7198i(CameraCaptureSession cameraCaptureSession) {
            C12266f.m7253b(this.f27597a, cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m7197j(CameraCaptureSession cameraCaptureSession) {
            this.f27597a.onClosed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m7196k(CameraCaptureSession cameraCaptureSession) {
            this.f27597a.onConfigureFailed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m7195l(CameraCaptureSession cameraCaptureSession) {
            this.f27597a.onConfigured(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m7194m(CameraCaptureSession cameraCaptureSession) {
            this.f27597a.onReady(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m7193n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C12255b.m7261a(this.f27597a, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f27598b.execute(new Runnable() { // from class: r.u
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12280c.this.m7199h(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f27598b.execute(new Runnable() { // from class: r.t
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12280c.this.m7198i(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f27598b.execute(new Runnable() { // from class: r.s
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12280c.this.m7197j(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f27598b.execute(new Runnable() { // from class: r.v
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12280c.this.m7196k(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f27598b.execute(new Runnable() { // from class: r.r
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12280c.this.m7195l(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f27598b.execute(new Runnable() { // from class: r.w
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12280c.this.m7194m(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f27598b.execute(new Runnable() { // from class: r.x
                @Override // java.lang.Runnable
                public final void run() {
                    C12277j.C12280c.this.m7193n(cameraCaptureSession, surface);
                }
            });
        }
    }

    private C12277j(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27594a = new C12253a0(cameraCaptureSession);
        } else {
            this.f27594a = C12256b0.m7260d(cameraCaptureSession, handler);
        }
    }

    /* renamed from: d */
    public static C12277j m7224d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C12277j(cameraCaptureSession, handler);
    }

    /* renamed from: a */
    public int m7227a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f27594a.mo7222b(list, executor, captureCallback);
    }

    /* renamed from: b */
    public int m7226b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f27594a.mo7221c(captureRequest, executor, captureCallback);
    }

    /* renamed from: c */
    public CameraCaptureSession m7225c() {
        return this.f27594a.mo7223a();
    }
}
