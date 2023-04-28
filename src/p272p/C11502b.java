package p272p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.AbstractC1807f0;
import p374v.C13385k;
import p390w.AbstractC13662r0;
import p390w.AbstractC13692w1;
import p390w.C13582c2;
import p390w.C13696x1;

/* renamed from: p.b */
/* loaded from: classes.dex */
public final class C11502b extends C13385k {

    /* renamed from: x */
    public static final AbstractC13662r0.AbstractC13663a<Integer> f25636x = AbstractC13662r0.AbstractC13663a.m3102a("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: y */
    public static final AbstractC13662r0.AbstractC13663a<CameraDevice.StateCallback> f25637y = AbstractC13662r0.AbstractC13663a.m3102a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: z */
    public static final AbstractC13662r0.AbstractC13663a<CameraCaptureSession.StateCallback> f25638z = AbstractC13662r0.AbstractC13663a.m3102a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: A */
    public static final AbstractC13662r0.AbstractC13663a<CameraCaptureSession.CaptureCallback> f39032A = AbstractC13662r0.AbstractC13663a.m3102a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: B */
    public static final AbstractC13662r0.AbstractC13663a<C11505d> f39033B = AbstractC13662r0.AbstractC13663a.m3102a("camera2.cameraEvent.callback", C11505d.class);

    /* renamed from: C */
    public static final AbstractC13662r0.AbstractC13663a<Object> f39034C = AbstractC13662r0.AbstractC13663a.m3102a("camera2.captureRequest.tag", Object.class);

    /* renamed from: D */
    public static final AbstractC13662r0.AbstractC13663a<String> f39035D = AbstractC13662r0.AbstractC13663a.m3102a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: p.b$a */
    /* loaded from: classes.dex */
    public static final class C11503a implements AbstractC1807f0<C11502b> {

        /* renamed from: a */
        private final C13696x1 f25639a = C13696x1.m3002J();

        @Override // androidx.camera.core.AbstractC1807f0
        /* renamed from: a */
        public AbstractC13692w1 mo3781a() {
            return this.f25639a;
        }

        /* renamed from: b */
        public C11502b m9555b() {
            return new C11502b(C13582c2.m3310H(this.f25639a));
        }

        /* renamed from: c */
        public C11503a m9554c(AbstractC13662r0 r0Var) {
            for (AbstractC13662r0.AbstractC13663a<?> aVar : r0Var.mo2975c()) {
                this.f25639a.mo2999u(aVar, r0Var.mo2976b(aVar));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public <ValueT> C11503a m9553e(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f25639a.mo2999u(C11502b.m9564F(key), valuet);
            return this;
        }
    }

    /* renamed from: p.b$b */
    /* loaded from: classes.dex */
    public static final class C0366b<T> {

        /* renamed from: a */
        AbstractC1807f0<T> f25640a;

        public C0366b(AbstractC1807f0<T> f0Var) {
            this.f25640a = f0Var;
        }

        /* renamed from: a */
        public C0366b<T> m9552a(C11505d dVar) {
            this.f25640a.mo3781a().mo2999u(C11502b.f39033B, dVar);
            return this;
        }
    }

    public C11502b(AbstractC13662r0 r0Var) {
        super(r0Var);
    }

    /* renamed from: F */
    public static AbstractC13662r0.AbstractC13663a<Object> m9564F(CaptureRequest.Key<?> key) {
        return AbstractC13662r0.AbstractC13663a.m3101b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    /* renamed from: G */
    public C11505d m9563G(C11505d dVar) {
        return (C11505d) mo2970i().mo2977a(f39033B, dVar);
    }

    /* renamed from: H */
    public C13385k m9562H() {
        return C13385k.C13386a.m3778e(mo2970i()).m3779c();
    }

    /* renamed from: I */
    public Object m9561I(Object obj) {
        return mo2970i().mo2977a(f39034C, obj);
    }

    /* renamed from: J */
    public int m9560J(int i) {
        return ((Integer) mo2970i().mo2977a(f25636x, Integer.valueOf(i))).intValue();
    }

    /* renamed from: K */
    public CameraDevice.StateCallback m9559K(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) mo2970i().mo2977a(f25637y, stateCallback);
    }

    /* renamed from: L */
    public String m9558L(String str) {
        return (String) mo2970i().mo2977a(f39035D, str);
    }

    /* renamed from: M */
    public CameraCaptureSession.CaptureCallback m9557M(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) mo2970i().mo2977a(f39032A, captureCallback);
    }

    /* renamed from: N */
    public CameraCaptureSession.StateCallback m9556N(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) mo2970i().mo2977a(f25638z, stateCallback);
    }
}
