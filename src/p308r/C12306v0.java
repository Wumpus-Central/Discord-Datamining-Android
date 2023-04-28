package p308r;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.core.impl.utils.C1868q;
import java.util.Map;
import java.util.concurrent.Executor;
import p308r.C12306v0;

/* renamed from: r.v0 */
/* loaded from: classes.dex */
public final class C12306v0 {

    /* renamed from: a */
    private final AbstractC12308b f27651a;

    /* renamed from: b */
    private final Map<String, C12267f0> f27652b = new ArrayMap(4);

    /* renamed from: r.v0$a */
    /* loaded from: classes.dex */
    static final class C12307a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        private final Executor f27653a;

        /* renamed from: b */
        final CameraManager.AvailabilityCallback f27654b;

        /* renamed from: c */
        private final Object f27655c = new Object();

        /* renamed from: d */
        private boolean f27656d = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C12307a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f27653a = executor;
            this.f27654b = availabilityCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m7172d() {
            C12273h.m7233a(this.f27654b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m7171e(String str) {
            this.f27654b.onCameraAvailable(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m7170f(String str) {
            this.f27654b.onCameraUnavailable(str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public void m7169g() {
            synchronized (this.f27655c) {
                this.f27656d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f27655c) {
                if (!this.f27656d) {
                    this.f27653a.execute(new Runnable() { // from class: r.s0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C12306v0.C12307a.this.m7172d();
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f27655c) {
                if (!this.f27656d) {
                    this.f27653a.execute(new Runnable() { // from class: r.u0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C12306v0.C12307a.this.m7171e(str);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f27655c) {
                if (!this.f27656d) {
                    this.f27653a.execute(new Runnable() { // from class: r.t0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C12306v0.C12307a.this.m7170f(str);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: r.v0$b */
    /* loaded from: classes.dex */
    public interface AbstractC12308b {
        /* renamed from: a */
        void mo7162a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        /* renamed from: b */
        CameraCharacteristics mo7161b(String str);

        /* renamed from: c */
        void mo7160c(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        /* renamed from: d */
        String[] mo7168d();

        /* renamed from: e */
        void mo7159e(CameraManager.AvailabilityCallback availabilityCallback);
    }

    private C12306v0(AbstractC12308b bVar) {
        this.f27651a = bVar;
    }

    /* renamed from: a */
    public static C12306v0 m7182a(Context context) {
        return m7181b(context, C1868q.m39615a());
    }

    /* renamed from: b */
    public static C12306v0 m7181b(Context context, Handler handler) {
        return new C12306v0(C12310w0.m7167a(context, handler));
    }

    /* renamed from: c */
    public C12267f0 m7180c(String str) {
        C12267f0 f0Var;
        synchronized (this.f27652b) {
            f0Var = this.f27652b.get(str);
            if (f0Var == null) {
                try {
                    f0Var = C12267f0.m7248e(this.f27651a.mo7161b(str));
                    this.f27652b.put(str, f0Var);
                } catch (AssertionError e) {
                    throw new C12275i(10002, e.getMessage(), e);
                }
            }
        }
        return f0Var;
    }

    /* renamed from: d */
    public String[] m7179d() {
        return this.f27651a.mo7168d();
    }

    /* renamed from: e */
    public void m7178e(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f27651a.mo7160c(str, executor, stateCallback);
    }

    /* renamed from: f */
    public void m7177f(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f27651a.mo7162a(executor, availabilityCallback);
    }

    /* renamed from: g */
    public void m7176g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f27651a.mo7159e(availabilityCallback);
    }
}
