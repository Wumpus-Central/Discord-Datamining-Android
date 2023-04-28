package p308r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.a0 */
/* loaded from: classes.dex */
public class C12253a0 extends C12256b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12253a0(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // p308r.C12256b0, p308r.C12277j.AbstractC12278a
    /* renamed from: b */
    public int mo7222b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        int captureBurstRequests;
        captureBurstRequests = this.f27573a.captureBurstRequests(list, executor, captureCallback);
        return captureBurstRequests;
    }

    @Override // p308r.C12256b0, p308r.C12277j.AbstractC12278a
    /* renamed from: c */
    public int mo7221c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        int singleRepeatingRequest;
        singleRepeatingRequest = this.f27573a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
        return singleRepeatingRequest;
    }
}
