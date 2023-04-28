package p308r;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import p308r.C12270g0;
import p328s.C12754q;

/* renamed from: r.g0 */
/* loaded from: classes.dex */
public final class C12270g0 {

    /* renamed from: a */
    private final AbstractC12271a f27583a;

    /* renamed from: r.g0$a */
    /* loaded from: classes.dex */
    interface AbstractC12271a {
        /* renamed from: a */
        void mo7187a(C12754q qVar);
    }

    /* renamed from: r.g0$b */
    /* loaded from: classes.dex */
    static final class C12272b extends CameraDevice.StateCallback {

        /* renamed from: a */
        final CameraDevice.StateCallback f27584a;

        /* renamed from: b */
        private final Executor f27585b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C12272b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f27585b = executor;
            this.f27584a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m7237e(CameraDevice cameraDevice) {
            this.f27584a.onClosed(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m7236f(CameraDevice cameraDevice) {
            this.f27584a.onDisconnected(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m7235g(CameraDevice cameraDevice, int i) {
            this.f27584a.onError(cameraDevice, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m7234h(CameraDevice cameraDevice) {
            this.f27584a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f27585b.execute(new Runnable() { // from class: r.h0
                @Override // java.lang.Runnable
                public final void run() {
                    C12270g0.C12272b.this.m7237e(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f27585b.execute(new Runnable() { // from class: r.i0
                @Override // java.lang.Runnable
                public final void run() {
                    C12270g0.C12272b.this.m7236f(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i) {
            this.f27585b.execute(new Runnable() { // from class: r.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C12270g0.C12272b.this.m7235g(cameraDevice, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f27585b.execute(new Runnable() { // from class: r.j0
                @Override // java.lang.Runnable
                public final void run() {
                    C12270g0.C12272b.this.m7234h(cameraDevice);
                }
            });
        }
    }

    private C12270g0(CameraDevice cameraDevice, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f27583a = new C12295q0(cameraDevice);
        } else if (i >= 24) {
            this.f27583a = C12291o0.m7189g(cameraDevice, handler);
        } else {
            this.f27583a = C12285l0.m7192f(cameraDevice, handler);
        }
    }

    /* renamed from: b */
    public static C12270g0 m7242b(CameraDevice cameraDevice, Handler handler) {
        return new C12270g0(cameraDevice, handler);
    }

    /* renamed from: a */
    public void m7243a(C12754q qVar) {
        this.f27583a.mo7187a(qVar);
    }
}
