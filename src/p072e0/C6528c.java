package p072e0;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C1915r1;
import androidx.camera.core.ImageProxy;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.core.util.C2517g;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p120gc.AbstractFutureC7576b;
import p272p.C11501a;
import p390w.AbstractC13629l1;
import p390w.AbstractC13645o0;
import p390w.C13676u;

/* renamed from: e0.c */
/* loaded from: classes.dex */
public final class C6528c implements AbstractC13645o0, AbstractC6536i {

    /* renamed from: a */
    private final PreviewImageProcessorImpl f13671a;

    /* renamed from: b */
    private C6535h f13672b = new C6535h();

    public C6528c(PreviewImageProcessorImpl previewImageProcessorImpl) {
        this.f13671a = previewImageProcessorImpl;
    }

    @Override // p390w.AbstractC13645o0
    /* renamed from: a */
    public void mo291a(Surface surface, int i) {
        if (this.f13672b.m25353c()) {
            try {
                this.f13671a.onOutputSurface(surface, i);
                this.f13671a.onImageFormatUpdate(35);
            } finally {
                this.f13672b.m25355a();
            }
        }
    }

    @Override // p390w.AbstractC13645o0
    /* renamed from: b */
    public void mo290b(AbstractC13629l1 l1Var) {
        TotalCaptureResult totalCaptureResult;
        List<Integer> a = l1Var.mo3127a();
        boolean z = true;
        if (a.size() != 1) {
            z = false;
        }
        C2517g.m37593b(z, "Processing preview bundle must be 1, but found " + a.size());
        AbstractFutureC7576b<ImageProxy> b = l1Var.mo3126b(a.get(0).intValue());
        C2517g.m37594a(b.isDone());
        try {
            ImageProxy imageProxy = b.get();
            Image r0 = imageProxy.mo39699r0();
            CaptureResult a2 = C11501a.m9565a(C13676u.m3080a(imageProxy.mo39604p0()));
            if (a2 instanceof TotalCaptureResult) {
                totalCaptureResult = (TotalCaptureResult) a2;
            } else {
                totalCaptureResult = null;
            }
            if (r0 != null && this.f13672b.m25353c()) {
                try {
                    this.f13671a.process(r0, totalCaptureResult);
                } finally {
                    this.f13672b.m25355a();
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            C1915r1.m39525c("AdaptingPreviewProcesso", "Unable to retrieve ImageProxy from bundle");
        }
    }

    @Override // p390w.AbstractC13645o0
    /* renamed from: c */
    public void mo289c(Size size) {
        if (this.f13672b.m25353c()) {
            try {
                this.f13671a.onResolutionUpdate(size);
            } finally {
                this.f13672b.m25355a();
            }
        }
    }

    @Override // p072e0.AbstractC6536i
    public void close() {
        this.f13672b.m25354b();
    }
}
