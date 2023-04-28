package p288q;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.AbstractC1883m;
import androidx.concurrent.futures.C2114c;
import androidx.core.util.C2517g;
import p272p.C11502b;
import p288q.C11862k3;
import p308r.C12267f0;

/* renamed from: q.c */
/* loaded from: classes.dex */
final class C11794c implements C11862k3.AbstractC11864b {

    /* renamed from: a */
    private final C12267f0 f26320a;

    /* renamed from: b */
    private final Range<Float> f26321b;

    /* renamed from: d */
    private C2114c.C2115a<Void> f26323d;

    /* renamed from: c */
    private float f26322c = 1.0f;

    /* renamed from: e */
    private float f26324e = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11794c(C12267f0 f0Var) {
        CameraCharacteristics.Key key;
        this.f26320a = f0Var;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f26321b = (Range) f0Var.m7252a(key);
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: a */
    public void mo8199a(TotalCaptureResult totalCaptureResult) {
        Float f;
        CaptureRequest.Key key;
        if (this.f26323d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f = (Float) request.get(key);
            }
            if (f != null) {
                if (this.f26324e == f.floatValue()) {
                    this.f26323d.m38961c(null);
                    this.f26323d = null;
                }
            }
        }
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: b */
    public void mo8198b(float f, C2114c.C2115a<Void> aVar) {
        this.f26322c = f;
        C2114c.C2115a<Void> aVar2 = this.f26323d;
        if (aVar2 != null) {
            aVar2.m38958f(new AbstractC1883m.C1884a("There is a new zoomRatio being set"));
        }
        this.f26324e = this.f26322c;
        this.f26323d = aVar;
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: c */
    public float mo8197c() {
        return this.f26321b.getLower().floatValue();
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: d */
    public void mo8196d() {
        this.f26322c = 1.0f;
        C2114c.C2115a<Void> aVar = this.f26323d;
        if (aVar != null) {
            aVar.m38958f(new AbstractC1883m.C1884a("Camera is not active."));
            this.f26323d = null;
        }
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: e */
    public float mo8195e() {
        return this.f26321b.getUpper().floatValue();
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: f */
    public Rect mo8194f() {
        return (Rect) C2517g.m37588g((Rect) this.f26320a.m7252a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // p288q.C11862k3.AbstractC11864b
    /* renamed from: g */
    public void mo8193g(C11502b.C11503a aVar) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        aVar.m9553e(key, Float.valueOf(this.f26322c));
    }
}
