package p308r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.C1915r1;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.List;
import p308r.C12270g0;
import p328s.C12735b;
import p328s.C12754q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.r0 */
/* loaded from: classes.dex */
public class C12297r0 implements C12270g0.AbstractC12271a {

    /* renamed from: a */
    final CameraDevice f27635a;

    /* renamed from: b */
    final Object f27636b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.r0$a */
    /* loaded from: classes.dex */
    public static class C12298a {

        /* renamed from: a */
        final Handler f27637a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C12298a(Handler handler) {
            this.f27637a = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12297r0(CameraDevice cameraDevice, Object obj) {
        this.f27635a = (CameraDevice) C2517g.m37588g(cameraDevice);
        this.f27636b = obj;
    }

    /* renamed from: b */
    private static void m7186b(CameraDevice cameraDevice, List<C12735b> list) {
        String id2 = cameraDevice.getId();
        for (C12735b bVar : list) {
            String a = bVar.m5587a();
            if (a != null && !a.isEmpty()) {
                C1915r1.m39517k("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + a + ". Ignoring.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m7185c(CameraDevice cameraDevice, C12754q qVar) {
        C2517g.m37588g(cameraDevice);
        C2517g.m37588g(qVar);
        C2517g.m37588g(qVar.m5559e());
        List<C12735b> c = qVar.m5561c();
        if (c == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        } else if (qVar.m5563a() != null) {
            m7186b(cameraDevice, c);
        } else {
            throw new IllegalArgumentException("Invalid executor");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static List<Surface> m7183e(List<C12735b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C12735b bVar : list) {
            arrayList.add(bVar.m5586b());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m7184d(CameraDevice cameraDevice, List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        try {
            cameraDevice.createCaptureSession(list, stateCallback, handler);
        } catch (CameraAccessException e) {
            throw C12275i.m7228e(e);
        }
    }
}
