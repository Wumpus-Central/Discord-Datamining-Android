package p308r;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.a1 */
/* loaded from: classes.dex */
public class C12254a1 extends C12316z0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12254a1(Context context) {
        super(context);
    }

    @Override // p308r.C12316z0, p308r.C12258b1, p308r.C12306v0.AbstractC12308b
    /* renamed from: b */
    public CameraCharacteristics mo7161b(String str) {
        try {
            return this.f27576a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw C12275i.m7228e(e);
        }
    }

    @Override // p308r.C12316z0, p308r.C12258b1, p308r.C12306v0.AbstractC12308b
    /* renamed from: c */
    public void mo7160c(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f27576a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw C12275i.m7228e(e);
        }
    }
}
