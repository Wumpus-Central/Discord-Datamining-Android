package p288q;

import android.hardware.camera2.CameraCaptureSession;
import p390w.AbstractC13615k;

/* renamed from: q.o1 */
/* loaded from: classes.dex */
final class C11884o1 extends AbstractC13615k {

    /* renamed from: a */
    private final CameraCaptureSession.CaptureCallback f26535a;

    private C11884o1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f26535a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C11884o1 m8402d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C11884o1(captureCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public CameraCaptureSession.CaptureCallback m8401e() {
        return this.f26535a;
    }
}
