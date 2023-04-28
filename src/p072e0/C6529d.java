package p072e0;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.AbstractC1876k1;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.impl.RequestUpdateProcessorImpl;
import androidx.core.util.C2517g;
import p272p.C11501a;
import p390w.AbstractC13599g1;
import p390w.C13676u;

/* renamed from: e0.d */
/* loaded from: classes.dex */
public final class C6529d implements AbstractC13599g1, AbstractC6536i {

    /* renamed from: a */
    private final PreviewExtenderImpl f13673a;

    /* renamed from: b */
    private final RequestUpdateProcessorImpl f13674b;

    /* renamed from: c */
    private C6535h f13675c = new C6535h();

    public C6529d(PreviewExtenderImpl previewExtenderImpl) {
        boolean z;
        if (previewExtenderImpl.getProcessorType() == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37593b(z, "AdaptingRequestUpdateProcess can only adapt extender with PROCESSOR_TYPE_REQUEST_UPDATE_ONLY ProcessorType.");
        this.f13673a = previewExtenderImpl;
        this.f13674b = previewExtenderImpl.getProcessor();
    }

    @Override // p390w.AbstractC13599g1
    /* renamed from: a */
    public boolean mo3262a(AbstractC1876k1 k1Var) {
        boolean z = false;
        if (!this.f13675c.m25353c()) {
            return false;
        }
        try {
            CaptureResult a = C11501a.m9565a(C13676u.m3080a(k1Var));
            if (a instanceof TotalCaptureResult) {
                if (this.f13674b.process((TotalCaptureResult) a) != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.f13675c.m25355a();
        }
    }

    @Override // p072e0.AbstractC6536i
    public void close() {
        this.f13675c.m25354b();
    }
}
