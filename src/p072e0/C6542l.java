package p072e0;

import android.content.Context;
import android.os.Build;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1813g1;
import androidx.camera.core.C1915r1;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p272p.AbstractC11504c;
import p272p.C11502b;
import p272p.C11505d;
import p374v.C13382h;
import p390w.AbstractC13634m0;
import p390w.AbstractC13651p0;
import p390w.AbstractC13662r0;
import p390w.C13594f1;
import p390w.C13639n0;

/* renamed from: e0.l */
/* loaded from: classes.dex */
public class C6542l {

    /* renamed from: d */
    static final AbstractC13662r0.AbstractC13663a<Integer> f13697d = AbstractC13662r0.AbstractC13663a.m3102a("camerax.extensions.imageCaptureConfigProvider.mode", Integer.class);

    /* renamed from: a */
    private final AbstractC6547n f13698a;

    /* renamed from: b */
    private final Context f13699b;

    /* renamed from: c */
    private final int f13700c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0.l$a */
    /* loaded from: classes.dex */
    public static class C6543a extends AbstractC11504c implements AbstractC1948w2.AbstractC1950b, AbstractC13634m0 {

        /* renamed from: a */
        private final ImageCaptureExtenderImpl f13701a;

        /* renamed from: b */
        private final Context f13702b;

        /* renamed from: c */
        private final AtomicBoolean f13703c = new AtomicBoolean(true);

        /* renamed from: d */
        private final Object f13704d = new Object();

        /* renamed from: e */
        private volatile int f13705e = 0;

        /* renamed from: f */
        private volatile boolean f13706f = false;

        C6543a(ImageCaptureExtenderImpl imageCaptureExtenderImpl, Context context) {
            this.f13701a = imageCaptureExtenderImpl;
            this.f13702b = context;
        }

        /* renamed from: h */
        private void m25345h() {
            if (this.f13703c.get()) {
                this.f13701a.onDeInit();
                this.f13703c.set(false);
            }
        }

        @Override // androidx.camera.core.AbstractC1948w2.AbstractC1950b
        /* renamed from: a */
        public void mo25342a() {
            synchronized (this.f13704d) {
                this.f13706f = true;
                if (this.f13705e == 0) {
                    m25345h();
                }
            }
        }

        @Override // androidx.camera.core.AbstractC1948w2.AbstractC1950b
        /* renamed from: b */
        public void mo25341b(AbstractC1911r rVar) {
            if (this.f13703c.get()) {
                this.f13701a.onInit(C13382h.m3786b(rVar).m3783e(), C13382h.m3787a(rVar), this.f13702b);
            }
        }

        @Override // p390w.AbstractC13634m0
        /* renamed from: c */
        public List<AbstractC13651p0> mo3159c() {
            List<CaptureStageImpl> captureStages;
            if (!this.f13703c.get() || (captureStages = this.f13701a.getCaptureStages()) == null || captureStages.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (CaptureStageImpl captureStageImpl : captureStages) {
                arrayList.add(new C6527b(captureStageImpl));
            }
            return arrayList;
        }

        @Override // p272p.AbstractC11504c
        /* renamed from: d */
        public C13639n0 mo9551d() {
            CaptureStageImpl onDisableSession;
            try {
                if (!this.f13703c.get() || (onDisableSession = this.f13701a.onDisableSession()) == null) {
                    synchronized (this.f13704d) {
                        this.f13705e--;
                        if (this.f13705e == 0 && this.f13706f) {
                            m25345h();
                        }
                    }
                    return null;
                }
                C13639n0 a = new C6527b(onDisableSession).mo3114a();
                synchronized (this.f13704d) {
                    this.f13705e--;
                    if (this.f13705e == 0 && this.f13706f) {
                        m25345h();
                    }
                }
                return a;
            } catch (Throwable th2) {
                synchronized (this.f13704d) {
                    this.f13705e--;
                    if (this.f13705e == 0 && this.f13706f) {
                        m25345h();
                    }
                    throw th2;
                }
            }
        }

        @Override // p272p.AbstractC11504c
        /* renamed from: e */
        public C13639n0 mo9550e() {
            CaptureStageImpl onEnableSession;
            try {
                if (!this.f13703c.get() || (onEnableSession = this.f13701a.onEnableSession()) == null) {
                    synchronized (this.f13704d) {
                        this.f13705e++;
                    }
                    return null;
                }
                C13639n0 a = new C6527b(onEnableSession).mo3114a();
                synchronized (this.f13704d) {
                    this.f13705e++;
                }
                return a;
            } catch (Throwable th2) {
                synchronized (this.f13704d) {
                    this.f13705e++;
                    throw th2;
                }
            }
        }

        @Override // p272p.AbstractC11504c
        /* renamed from: f */
        public C13639n0 mo9549f() {
            CaptureStageImpl onPresetSession;
            if (!this.f13703c.get() || (onPresetSession = this.f13701a.onPresetSession()) == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return new C6527b(onPresetSession).mo3114a();
            }
            C1915r1.m39517k("ImageCaptureConfigProvider", "The CaptureRequest parameters returned from onPresetSession() will be passed to the camera device as part of the capture session via SessionConfiguration#setSessionParameters(CaptureRequest) which only supported from API level 28!");
            return null;
        }
    }

    public C6542l(int i, AbstractC6547n nVar, Context context) {
        this.f13700c = i;
        this.f13698a = nVar;
        this.f13699b = context;
    }

    /* renamed from: a */
    public C13594f1 m25347a() {
        C1813g1.C1818e eVar = new C1813g1.C1818e();
        m25346b(eVar, this.f13700c, this.f13698a, this.f13699b);
        return eVar.mo2998d();
    }

    /* renamed from: b */
    void m25346b(C1813g1.C1818e eVar, int i, AbstractC6547n nVar, Context context) {
        if (nVar instanceof C6532g) {
            ImageCaptureExtenderImpl i2 = ((C6532g) nVar).m25359i();
            CaptureProcessorImpl captureProcessor = i2.getCaptureProcessor();
            if (captureProcessor != null) {
                eVar.m39734j(new C6526a(captureProcessor));
            }
            if (i2.getMaxCaptureStage() > 0) {
                eVar.m39733k(i2.getMaxCaptureStage());
            }
            C6543a aVar = new C6543a(i2, context);
            new C11502b.C0366b(eVar).m9552a(new C11505d(aVar));
            eVar.m39725s(aVar);
            eVar.m39736h(aVar);
        }
        eVar.mo3781a().mo2999u(f13697d, Integer.valueOf(i));
        eVar.m39732l(nVar.mo25339a());
    }
}
