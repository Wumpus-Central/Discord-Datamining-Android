package p308r;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.z0 */
/* loaded from: classes.dex */
public class C12316z0 extends C12258b1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12316z0(Context context) {
        super(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C12316z0 m7158g(Context context) {
        return new C12316z0(context);
    }

    /* renamed from: h */
    private boolean m7157h(Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && m7156i(th2);
    }

    /* renamed from: i */
    private static boolean m7156i(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    /* renamed from: j */
    private void m7155j(Throwable th2) {
        throw new C12275i(10001, th2);
    }

    @Override // p308r.C12258b1, p308r.C12306v0.AbstractC12308b
    /* renamed from: a */
    public void mo7162a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f27576a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // p308r.C12258b1, p308r.C12306v0.AbstractC12308b
    /* renamed from: b */
    public CameraCharacteristics mo7161b(String str) {
        try {
            return super.mo7161b(str);
        } catch (RuntimeException e) {
            if (m7157h(e)) {
                m7155j(e);
            }
            throw e;
        }
    }

    @Override // p308r.C12258b1, p308r.C12306v0.AbstractC12308b
    /* renamed from: c */
    public void mo7160c(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f27576a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw C12275i.m7228e(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (SecurityException e3) {
        } catch (RuntimeException e4) {
            if (m7157h(e4)) {
                m7155j(e4);
            }
            throw e4;
        }
    }

    @Override // p308r.C12258b1, p308r.C12306v0.AbstractC12308b
    /* renamed from: e */
    public void mo7159e(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f27576a.unregisterAvailabilityCallback(availabilityCallback);
    }
}
