package p308r;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Set;

/* renamed from: r.d0 */
/* loaded from: classes.dex */
class C12263d0 extends C12265e0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12263d0(CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }

    @Override // p308r.C12265e0, p308r.C12267f0.AbstractC12268a
    /* renamed from: c */
    public Set<String> mo7245c() {
        Set<String> physicalCameraIds;
        physicalCameraIds = this.f27580a.getPhysicalCameraIds();
        return physicalCameraIds;
    }
}
