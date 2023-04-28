package p288q;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.core.util.C2517g;
import p390w.AbstractC13615k;
import p390w.C13632m;
import p390w.C13671s2;

/* renamed from: q.n1 */
/* loaded from: classes.dex */
final class C11880n1 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    private final AbstractC13615k f26527a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11880n1(AbstractC13615k kVar) {
        if (kVar != null) {
            this.f26527a = kVar;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C13671s2 s2Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C2517g.m37593b(tag instanceof C13671s2, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            s2Var = (C13671s2) tag;
        } else {
            s2Var = C13671s2.m3091a();
        }
        this.f26527a.mo3171b(new C11824h(s2Var, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f26527a.mo3170c(new C13632m(C13632m.EnumC13633a.ERROR));
    }
}
