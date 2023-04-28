package p124h0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.os.HandlerThread;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.C1915r1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p272p.C11502b;
import p374v.C13382h;
import p390w.AbstractC13587d2;
import p390w.AbstractC13630l2;
import p390w.AbstractC13689w0;
import p390w.C13619k2;
import p390w.C13637m2;
import p410x.C13905a;

/* renamed from: h0.l */
/* loaded from: classes.dex */
abstract class AbstractC7734l implements AbstractC13630l2 {

    /* renamed from: b */
    private HandlerThread f16769b;

    /* renamed from: e */
    private String f16772e;

    /* renamed from: a */
    private Map<Integer, ImageReader> f16768a = new HashMap();

    /* renamed from: c */
    private List<AbstractC13689w0> f16770c = new ArrayList();

    /* renamed from: d */
    private final Object f16771d = new Object();

    @Override // p390w.AbstractC13630l2
    /* renamed from: b */
    public final void mo3166b() {
        C1915r1.m39525c("SessionProcessorBase", "deInitSession: cameraId=" + this.f16772e);
        mo21550i();
        synchronized (this.f16771d) {
            for (AbstractC13689w0 w0Var : this.f16770c) {
                w0Var.m3023c();
            }
            this.f16770c.clear();
            this.f16768a.clear();
        }
        HandlerThread handlerThread = this.f16769b;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f16769b = null;
        }
    }

    @Override // p390w.AbstractC13630l2
    /* renamed from: e */
    public final C13619k2 mo3163e(AbstractC1911r rVar, AbstractC13587d2 d2Var, AbstractC13587d2 d2Var2, AbstractC13587d2 d2Var3) {
        C13382h b = C13382h.m3786b(rVar);
        AbstractC7728g j = mo21549j(b.m3783e(), b.m3784d(), d2Var, d2Var2, d2Var3);
        synchronized (this.f16771d) {
            for (AbstractC7722e eVar : j.mo21554c()) {
                if (eVar instanceof AbstractC7735m) {
                    this.f16770c.add(new C13637m2(((AbstractC7735m) eVar).getSurface(), eVar.getId()));
                } else if (eVar instanceof AbstractC7731i) {
                    AbstractC7731i iVar = (AbstractC7731i) eVar;
                    final ImageReader newInstance = ImageReader.newInstance(iVar.getSize().getWidth(), iVar.getSize().getHeight(), iVar.mo21553a(), iVar.mo21552b());
                    this.f16768a.put(Integer.valueOf(eVar.getId()), newInstance);
                    C13637m2 m2Var = new C13637m2(newInstance.getSurface(), eVar.getId());
                    m2Var.m3017i().mo1409a(new Runnable() { // from class: h0.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            newInstance.close();
                        }
                    }, C13905a.m2339a());
                    this.f16770c.add(m2Var);
                } else if (eVar instanceof AbstractC7732j) {
                    throw new UnsupportedOperationException("MultiResolutionImageReader not supported");
                }
            }
        }
        C13619k2.C13621b bVar = new C13619k2.C13621b();
        synchronized (this.f16771d) {
            for (AbstractC13689w0 w0Var : this.f16770c) {
                bVar.m3187k(w0Var);
            }
        }
        C11502b.C11503a aVar = new C11502b.C11503a();
        for (CaptureRequest.Key<?> key : j.mo21555b().keySet()) {
            aVar.m9553e(key, j.mo21555b().get(key));
        }
        bVar.m3181q(aVar.m9555b());
        bVar.m3180r(j.mo21556a());
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.f16769b = handlerThread;
        handlerThread.start();
        this.f16772e = b.m3783e();
        C1915r1.m39527a("SessionProcessorBase", "initSession: cameraId=" + this.f16772e);
        return bVar.m3185m();
    }

    /* renamed from: i */
    protected abstract void mo21550i();

    /* renamed from: j */
    protected abstract AbstractC7728g mo21549j(String str, Map<String, CameraCharacteristics> map, AbstractC13587d2 d2Var, AbstractC13587d2 d2Var2, AbstractC13587d2 d2Var3);
}
