package p308r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.core.util.C2517g;
import p328s.C12754q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.q0 */
/* loaded from: classes.dex */
public class C12295q0 extends C12291o0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12295q0(CameraDevice cameraDevice) {
        super((CameraDevice) C2517g.m37588g(cameraDevice), null);
    }

    @Override // p308r.C12291o0, p308r.C12285l0, p308r.C12270g0.AbstractC12271a
    /* renamed from: a */
    public void mo7187a(C12754q qVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) qVar.m5555i();
        C2517g.m37588g(sessionConfiguration);
        try {
            this.f27635a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw C12275i.m7228e(e);
        }
    }
}
