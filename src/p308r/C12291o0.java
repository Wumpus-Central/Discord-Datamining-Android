package p308r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.core.util.C2517g;
import java.util.List;
import p308r.C12277j;
import p308r.C12297r0;
import p328s.C12732a;
import p328s.C12735b;
import p328s.C12754q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.o0 */
/* loaded from: classes.dex */
public class C12291o0 extends C12285l0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12291o0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C12291o0 m7189g(CameraDevice cameraDevice, Handler handler) {
        return new C12291o0(cameraDevice, new C12297r0.C12298a(handler));
    }

    @Override // p308r.C12285l0, p308r.C12270g0.AbstractC12271a
    /* renamed from: a */
    public void mo7187a(C12754q qVar) {
        C12297r0.m7185c(this.f27635a, qVar);
        C12277j.C12280c cVar = new C12277j.C12280c(qVar.m5563a(), qVar.m5559e());
        List<C12735b> c = qVar.m5561c();
        Handler handler = ((C12297r0.C12298a) C2517g.m37588g((C12297r0.C12298a) this.f27636b)).f27637a;
        C12732a b = qVar.m5562b();
        try {
            if (b != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b.m5590a();
                C2517g.m37588g(inputConfiguration);
                this.f27635a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C12754q.m5557g(c), cVar, handler);
            } else if (qVar.m5560d() == 1) {
                this.f27635a.createConstrainedHighSpeedCaptureSession(C12297r0.m7183e(c), cVar, handler);
            } else {
                this.f27635a.createCaptureSessionByOutputConfigurations(C12754q.m5557g(c), cVar, handler);
            }
        } catch (CameraAccessException e) {
            throw C12275i.m7228e(e);
        }
    }
}
