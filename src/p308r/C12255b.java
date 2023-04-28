package p308r;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: r.b */
/* loaded from: classes.dex */
public class C12255b {
    /* renamed from: a */
    public static void m7261a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
