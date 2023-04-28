package p288q;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.core.C1915r1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p374v.C13385k;
import p390w.AbstractC13662r0;
import p390w.AbstractC13689w0;
import p390w.C13639n0;

/* renamed from: q.c1 */
/* loaded from: classes.dex */
class C11796c1 {
    /* renamed from: a */
    private static void m8609a(CaptureRequest.Builder builder, AbstractC13662r0 r0Var) {
        C13385k c = C13385k.C13386a.m3778e(r0Var).m3779c();
        for (AbstractC13662r0.AbstractC13663a aVar : c.mo2975c()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.mo3099d();
            try {
                builder.set(key, c.mo2976b(aVar));
            } catch (IllegalArgumentException unused) {
                C1915r1.m39525c("CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    /* renamed from: b */
    public static CaptureRequest m8608b(C13639n0 n0Var, CameraDevice cameraDevice, Map<AbstractC13689w0, Surface> map) {
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> d = m8606d(n0Var.m3148d(), map);
        if (d.isEmpty()) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(n0Var.m3146f());
        m8609a(createCaptureRequest, n0Var.m3149c());
        AbstractC13662r0 c = n0Var.m3149c();
        AbstractC13662r0.AbstractC13663a<Integer> aVar = C13639n0.f30458g;
        if (c.mo2973e(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) n0Var.m3149c().mo2976b(aVar));
        }
        AbstractC13662r0 c2 = n0Var.m3149c();
        AbstractC13662r0.AbstractC13663a<Integer> aVar2 = C13639n0.f30459h;
        if (c2.mo2973e(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) n0Var.m3149c().mo2976b(aVar2)).byteValue()));
        }
        for (Surface surface : d) {
            createCaptureRequest.addTarget(surface);
        }
        createCaptureRequest.setTag(n0Var.m3147e());
        return createCaptureRequest.build();
    }

    /* renamed from: c */
    public static CaptureRequest m8607c(C13639n0 n0Var, CameraDevice cameraDevice) {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(n0Var.m3146f());
        m8609a(createCaptureRequest, n0Var.m3149c());
        return createCaptureRequest.build();
    }

    /* renamed from: d */
    private static List<Surface> m8606d(List<AbstractC13689w0> list, Map<AbstractC13689w0, Surface> map) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC13689w0 w0Var : list) {
            Surface surface = map.get(w0Var);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        return arrayList;
    }
}
