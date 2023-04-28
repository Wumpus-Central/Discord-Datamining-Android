package p308r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* renamed from: r.f */
/* loaded from: classes.dex */
public class C12266f {
    /* renamed from: a */
    public static <T> OutputConfiguration m7254a(Size size, Class<T> cls) {
        return new OutputConfiguration(size, cls);
    }

    /* renamed from: b */
    public static void m7253b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
