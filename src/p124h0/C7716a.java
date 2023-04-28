package p124h0;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import java.util.HashMap;
import java.util.Map;
import p374v.C13385k;
import p390w.AbstractC13587d2;
import p390w.AbstractC13614j2;
import p390w.AbstractC13630l2;
import p390w.AbstractC13662r0;

/* renamed from: h0.a */
/* loaded from: classes.dex */
public class C7716a extends AbstractC7734l {

    /* renamed from: f */
    private final SessionProcessorImpl f16740f;

    /* renamed from: g */
    private final Context f16741g;

    /* renamed from: h0.a$a */
    /* loaded from: classes.dex */
    private static class C0244a implements OutputSurfaceImpl {

        /* renamed from: a */
        private final AbstractC13587d2 f16742a;

        C0244a(AbstractC13587d2 d2Var) {
            this.f16742a = d2Var;
        }
    }

    /* renamed from: h0.a$b */
    /* loaded from: classes.dex */
    private class C7717b implements RequestProcessorImpl {

        /* renamed from: a */
        private final AbstractC13614j2 f16743a;

        C7717b(AbstractC13614j2 j2Var) {
            this.f16743a = j2Var;
        }
    }

    /* renamed from: h0.a$c */
    /* loaded from: classes.dex */
    private static class C7718c implements SessionProcessorImpl.CaptureCallback {

        /* renamed from: a */
        private final AbstractC13630l2.AbstractC13631a f16745a;

        C7718c(AbstractC13630l2.AbstractC13631a aVar) {
            this.f16745a = aVar;
        }
    }

    public C7716a(SessionProcessorImpl sessionProcessorImpl, Context context) {
        this.f16740f = sessionProcessorImpl;
        this.f16741g = context;
    }

    /* renamed from: l */
    private AbstractC7728g m21573l(Camera2SessionConfigImpl camera2SessionConfigImpl) {
        C7729h hVar = new C7729h();
        for (Camera2OutputConfigImpl camera2OutputConfigImpl : camera2SessionConfigImpl.getOutputConfigs()) {
            hVar.m21560a(C7723f.m21571b(camera2OutputConfigImpl).m21572a());
        }
        for (CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            hVar.m21559b(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        hVar.m21557d(camera2SessionConfigImpl.getSessionTemplateId());
        return hVar.m21558c();
    }

    @Override // p390w.AbstractC13630l2
    /* renamed from: a */
    public void mo3167a() {
        this.f16740f.onCaptureSessionEnd();
    }

    @Override // p390w.AbstractC13630l2
    /* renamed from: c */
    public void mo3165c(AbstractC13614j2 j2Var) {
        this.f16740f.onCaptureSessionStart(new C7717b(j2Var));
    }

    @Override // p390w.AbstractC13630l2
    /* renamed from: d */
    public int mo3164d(AbstractC13630l2.AbstractC13631a aVar) {
        return this.f16740f.startCapture(new C7718c(aVar));
    }

    @Override // p390w.AbstractC13630l2
    /* renamed from: f */
    public int mo3162f(AbstractC13630l2.AbstractC13631a aVar) {
        return this.f16740f.startRepeating(new C7718c(aVar));
    }

    @Override // p390w.AbstractC13630l2
    /* renamed from: g */
    public void mo3161g(AbstractC13662r0 r0Var) {
        HashMap hashMap = new HashMap();
        C13385k c = C13385k.C13386a.m3778e(r0Var).m3779c();
        for (AbstractC13662r0.AbstractC13663a aVar : c.mo2975c()) {
            hashMap.put((CaptureRequest.Key) aVar.mo3099d(), c.mo2976b(aVar));
        }
        this.f16740f.setParameters(hashMap);
    }

    @Override // p124h0.AbstractC7734l
    /* renamed from: i */
    protected void mo21550i() {
        this.f16740f.deInitSession();
    }

    @Override // p124h0.AbstractC7734l
    /* renamed from: j */
    protected AbstractC7728g mo21549j(String str, Map<String, CameraCharacteristics> map, AbstractC13587d2 d2Var, AbstractC13587d2 d2Var2, AbstractC13587d2 d2Var3) {
        OutputSurfaceImpl outputSurfaceImpl;
        SessionProcessorImpl sessionProcessorImpl = this.f16740f;
        Context context = this.f16741g;
        C0244a aVar = new C0244a(d2Var);
        C0244a aVar2 = new C0244a(d2Var2);
        if (d2Var3 == null) {
            outputSurfaceImpl = null;
        } else {
            outputSurfaceImpl = new C0244a(d2Var3);
        }
        return m21573l(sessionProcessorImpl.initSession(str, map, context, aVar, aVar2, outputSurfaceImpl));
    }
}
