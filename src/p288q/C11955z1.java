package p288q;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.AbstractC1883m;
import androidx.concurrent.futures.C2114c;
import java.util.concurrent.Executor;
import p272p.C11502b;
import p288q.C11935w;
import p308r.C12267f0;

/* renamed from: q.z1 */
/* loaded from: classes.dex */
public class C11955z1 {

    /* renamed from: a */
    private final C11935w f26761a;

    /* renamed from: b */
    private final C11786a2 f26762b;

    /* renamed from: c */
    private final Executor f26763c;

    /* renamed from: d */
    private boolean f26764d = false;

    /* renamed from: e */
    private C2114c.C2115a<Integer> f26765e;

    /* renamed from: f */
    private C11935w.AbstractC11938c f26766f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11955z1(C11935w wVar, C12267f0 f0Var, Executor executor) {
        this.f26761a = wVar;
        this.f26762b = new C11786a2(f0Var, 0);
        this.f26763c = executor;
    }

    /* renamed from: a */
    private void m8145a() {
        C2114c.C2115a<Integer> aVar = this.f26765e;
        if (aVar != null) {
            aVar.m38958f(new AbstractC1883m.C1884a("Cancelled by another setExposureCompensationIndex()"));
            this.f26765e = null;
        }
        C11935w.AbstractC11938c cVar = this.f26766f;
        if (cVar != null) {
            this.f26761a.m8256a0(cVar);
            this.f26766f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m8144b(boolean z) {
        if (z != this.f26764d) {
            this.f26764d = z;
            if (!z) {
                this.f26762b.m8622b(0);
                m8145a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m8143c(C11502b.C11503a aVar) {
        aVar.m9553e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f26762b.m8623a()));
    }
}
