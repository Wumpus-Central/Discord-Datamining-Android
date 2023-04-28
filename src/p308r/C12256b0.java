package p308r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.core.util.C2517g;
import java.util.List;
import java.util.concurrent.Executor;
import p308r.C12277j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.b0 */
/* loaded from: classes.dex */
public class C12256b0 implements C12277j.AbstractC12278a {

    /* renamed from: a */
    final CameraCaptureSession f27573a;

    /* renamed from: b */
    final Object f27574b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.b0$a */
    /* loaded from: classes.dex */
    public static class C12257a {

        /* renamed from: a */
        final Handler f27575a;

        C12257a(Handler handler) {
            this.f27575a = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12256b0(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f27573a = (CameraCaptureSession) C2517g.m37588g(cameraCaptureSession);
        this.f27574b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C12277j.AbstractC12278a m7260d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C12256b0(cameraCaptureSession, new C12257a(handler));
    }

    @Override // p308r.C12277j.AbstractC12278a
    /* renamed from: a */
    public CameraCaptureSession mo7223a() {
        return this.f27573a;
    }

    @Override // p308r.C12277j.AbstractC12278a
    /* renamed from: b */
    public int mo7222b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f27573a.captureBurst(list, new C12277j.C12279b(executor, captureCallback), ((C12257a) this.f27574b).f27575a);
    }

    @Override // p308r.C12277j.AbstractC12278a
    /* renamed from: c */
    public int mo7221c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f27573a.setRepeatingRequest(captureRequest, new C12277j.C12279b(executor, captureCallback), ((C12257a) this.f27574b).f27575a);
    }
}
