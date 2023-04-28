package p288q;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q.j1 */
/* loaded from: classes.dex */
public final class C11851j1 {

    /* renamed from: q.j1$a */
    /* loaded from: classes.dex */
    private static final class C11852a extends CameraDevice.StateCallback {

        /* renamed from: a */
        private final List<CameraDevice.StateCallback> f26474a = new ArrayList();

        C11852a(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof C11853b)) {
                    this.f26474a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f26474a) {
                stateCallback.onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f26474a) {
                stateCallback.onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            for (CameraDevice.StateCallback stateCallback : this.f26474a) {
                stateCallback.onError(cameraDevice, i);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f26474a) {
                stateCallback.onOpened(cameraDevice);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q.j1$b */
    /* loaded from: classes.dex */
    public static final class C11853b extends CameraDevice.StateCallback {
        C11853b() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    /* renamed from: a */
    public static CameraDevice.StateCallback m8450a(List<CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return m8449b();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new C11852a(list);
    }

    /* renamed from: b */
    public static CameraDevice.StateCallback m8449b() {
        return new C11853b();
    }
}
