package p072e0;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p272p.C11501a;
import p390w.AbstractC13629l1;
import p390w.AbstractC13645o0;
import p390w.AbstractC13672t;
import p390w.C13676u;

/* renamed from: e0.a */
/* loaded from: classes.dex */
public final class C6526a implements AbstractC13645o0 {

    /* renamed from: a */
    private final CaptureProcessorImpl f13668a;

    public C6526a(CaptureProcessorImpl captureProcessorImpl) {
        this.f13668a = captureProcessorImpl;
    }

    @Override // p390w.AbstractC13645o0
    /* renamed from: a */
    public void mo291a(Surface surface, int i) {
        this.f13668a.onOutputSurface(surface, i);
        this.f13668a.onImageFormatUpdate(i);
    }

    @Override // p390w.AbstractC13645o0
    /* renamed from: b */
    public void mo290b(AbstractC13629l1 l1Var) {
        AbstractC13672t a;
        CaptureResult a2;
        List<Integer> a3 = l1Var.mo3127a();
        HashMap hashMap = new HashMap();
        for (Integer num : a3) {
            try {
                ImageProxy imageProxy = l1Var.mo3126b(num.intValue()).get(5L, TimeUnit.SECONDS);
                if (imageProxy.mo39699r0() != null && (a = C13676u.m3080a(imageProxy.mo39604p0())) != null && (a2 = C11501a.m9565a(a)) != null) {
                    hashMap.put(num, new Pair(imageProxy.mo39699r0(), (TotalCaptureResult) a2));
                } else {
                    return;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                return;
            }
        }
        this.f13668a.process(hashMap);
    }

    @Override // p390w.AbstractC13645o0
    /* renamed from: c */
    public void mo289c(Size size) {
        this.f13668a.onResolutionUpdate(size);
    }
}
