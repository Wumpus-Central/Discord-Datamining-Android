package p288q;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.AbstractC1883m;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import p272p.C11502b;
import p288q.C11862k3;
import p308r.C12267f0;

/* renamed from: q.x1 */
/* loaded from: classes.dex */
final class C11945x1 implements C11862k3.AbstractC11864b {

    /* renamed from: a */
    private final C12267f0 f26726a;

    /* renamed from: c */
    private C2114c.C2115a<Void> f26728c;

    /* renamed from: b */
    private Rect f26727b = null;

    /* renamed from: d */
    private Rect f26729d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11945x1(C12267f0 f0Var) {
        this.f26726a = f0Var;
    }

    /* renamed from: h */
    private static Rect m8192h(Rect rect, float f) {
        float width = rect.width() / f;
        float height = rect.height() / f;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    /* renamed from: i */
    private Rect m8191i() {
        return (Rect) C2517g.m37588g((Rect) this.f26726a.m7252a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: a */
    public void mo8199a(TotalCaptureResult totalCaptureResult) {
        Rect rect;
        if (this.f26728c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                rect = null;
            } else {
                rect = (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            }
            Rect rect2 = this.f26729d;
            if (rect2 != null && rect2.equals(rect)) {
                this.f26728c.m38961c(null);
                this.f26728c = null;
                this.f26729d = null;
            }
        }
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: b */
    public void mo8198b(float f, C2114c.C2115a<Void> aVar) {
        this.f26727b = m8192h(m8191i(), f);
        C2114c.C2115a<Void> aVar2 = this.f26728c;
        if (aVar2 != null) {
            aVar2.m38958f(new AbstractC1883m.C1884a("There is a new zoomRatio being set"));
        }
        this.f26729d = this.f26727b;
        this.f26728c = aVar;
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: c */
    public float mo8197c() {
        return 1.0f;
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: d */
    public void mo8196d() {
        this.f26729d = null;
        this.f26727b = null;
        C2114c.C2115a<Void> aVar = this.f26728c;
        if (aVar != null) {
            aVar.m38958f(new AbstractC1883m.C1884a("Camera is not active."));
            this.f26728c = null;
        }
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: e */
    public float mo8195e() {
        Float f = (Float) this.f26726a.m7252a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        if (f.floatValue() < mo8197c()) {
            return mo8197c();
        }
        return f.floatValue();
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: f */
    public Rect mo8194f() {
        Rect rect = this.f26727b;
        return rect != null ? rect : m8191i();
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: g */
    public void mo8193g(C11502b.C11503a aVar) {
        Rect rect = this.f26727b;
        if (rect != null) {
            aVar.m9553e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }
}
