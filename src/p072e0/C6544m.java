package p072e0;

import android.content.Context;
import android.os.Build;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.AbstractC1948w2;
import androidx.camera.core.C1770a2;
import androidx.camera.core.C1915r1;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import p272p.AbstractC11504c;
import p272p.C11502b;
import p272p.C11505d;
import p374v.C13382h;
import p390w.AbstractC13662r0;
import p390w.C13591e2;
import p390w.C13639n0;

/* renamed from: e0.m */
/* loaded from: classes.dex */
public class C6544m {

    /* renamed from: d */
    static final AbstractC13662r0.AbstractC13663a<Integer> f13707d = AbstractC13662r0.AbstractC13663a.m3102a("camerax.extensions.previewConfigProvider.mode", Integer.class);

    /* renamed from: a */
    private final AbstractC6547n f13708a;

    /* renamed from: b */
    private final Context f13709b;

    /* renamed from: c */
    private final int f13710c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0.m$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C6545a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13711a;

        static {
            int[] iArr = new int[PreviewExtenderImpl.ProcessorType.values().length];
            f13711a = iArr;
            try {
                iArr[PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13711a[PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0.m$b */
    /* loaded from: classes.dex */
    public static class C6546b extends AbstractC11504c implements AbstractC1948w2.AbstractC1950b {

        /* renamed from: a */
        final PreviewExtenderImpl f13712a;

        /* renamed from: b */
        private final Context f13713b;

        /* renamed from: c */
        final AbstractC6536i f13714c;

        /* renamed from: d */
        volatile boolean f13715d = true;

        /* renamed from: e */
        final Object f13716e = new Object();

        /* renamed from: f */
        private volatile int f13717f = 0;

        /* renamed from: g */
        private volatile boolean f13718g = false;

        C6546b(PreviewExtenderImpl previewExtenderImpl, Context context, AbstractC6536i iVar) {
            this.f13712a = previewExtenderImpl;
            this.f13713b = context;
            this.f13714c = iVar;
        }

        /* renamed from: h */
        private void m25340h() {
            synchronized (this.f13716e) {
                if (this.f13715d) {
                    AbstractC6536i iVar = this.f13714c;
                    if (iVar != null) {
                        iVar.close();
                    }
                    this.f13712a.onDeInit();
                    this.f13715d = false;
                }
            }
        }

        @Override // androidx.camera.core.AbstractC1948w2.AbstractC1950b
        /* renamed from: a */
        public void mo25342a() {
            synchronized (this.f13716e) {
                this.f13718g = true;
                if (this.f13717f == 0) {
                    m25340h();
                }
            }
        }

        @Override // androidx.camera.core.AbstractC1948w2.AbstractC1950b
        /* renamed from: b */
        public void mo25341b(AbstractC1911r rVar) {
            synchronized (this.f13716e) {
                if (this.f13715d) {
                    this.f13712a.onInit(C13382h.m3786b(rVar).m3783e(), C13382h.m3787a(rVar), this.f13713b);
                }
            }
        }

        @Override // p272p.AbstractC11504c
        /* renamed from: d */
        public C13639n0 mo9551d() {
            CaptureStageImpl onDisableSession;
            try {
                synchronized (this.f13716e) {
                    if (!this.f13715d || (onDisableSession = this.f13712a.onDisableSession()) == null) {
                        synchronized (this.f13716e) {
                            this.f13717f--;
                            if (this.f13717f == 0 && this.f13718g) {
                                m25340h();
                            }
                        }
                        return null;
                    }
                    C13639n0 a = new C6527b(onDisableSession).mo3114a();
                    synchronized (this.f13716e) {
                        this.f13717f--;
                        if (this.f13717f == 0 && this.f13718g) {
                            m25340h();
                        }
                    }
                    return a;
                }
            } catch (Throwable th2) {
                synchronized (this.f13716e) {
                    this.f13717f--;
                    if (this.f13717f == 0 && this.f13718g) {
                        m25340h();
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
                synchronized (this.f13716e) {
                    if (!this.f13715d || (onEnableSession = this.f13712a.onEnableSession()) == null) {
                        synchronized (this.f13716e) {
                            this.f13717f++;
                        }
                        return null;
                    }
                    C13639n0 a = new C6527b(onEnableSession).mo3114a();
                    synchronized (this.f13716e) {
                        this.f13717f++;
                    }
                    return a;
                }
            } catch (Throwable th2) {
                synchronized (this.f13716e) {
                    this.f13717f++;
                    throw th2;
                }
            }
        }

        @Override // p272p.AbstractC11504c
        /* renamed from: f */
        public C13639n0 mo9549f() {
            synchronized (this.f13716e) {
                CaptureStageImpl onPresetSession = this.f13712a.onPresetSession();
                if (onPresetSession != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return new C6527b(onPresetSession).mo3114a();
                    }
                    C1915r1.m39517k("PreviewConfigProvider", "The CaptureRequest parameters returned from onPresetSession() will be passed to the camera device as part of the capture session via SessionConfiguration#setSessionParameters(CaptureRequest) which only supported from API level 28!");
                }
                return null;
            }
        }

        @Override // p272p.AbstractC11504c
        /* renamed from: g */
        public C13639n0 mo9548g() {
            CaptureStageImpl captureStage;
            synchronized (this.f13716e) {
                if (!this.f13715d || (captureStage = this.f13712a.getCaptureStage()) == null) {
                    return null;
                }
                return new C6527b(captureStage).mo3114a();
            }
        }
    }

    public C6544m(int i, AbstractC6547n nVar, Context context) {
        this.f13710c = i;
        this.f13708a = nVar;
        this.f13709b = context;
    }

    /* renamed from: a */
    public C13591e2 m25344a() {
        C1770a2.C1772b bVar = new C1770a2.C1772b();
        m25343b(bVar, this.f13710c, this.f13708a, this.f13709b);
        return bVar.mo2998d();
    }

    /* renamed from: b */
    void m25343b(C1770a2.C1772b bVar, int i, AbstractC6547n nVar, Context context) {
        AbstractC1948w2.AbstractC1950b bVar2;
        AbstractC1948w2.AbstractC1950b bVar3;
        if (nVar instanceof C6532g) {
            PreviewExtenderImpl k = ((C6532g) nVar).m25357k();
            int i2 = C6545a.f13711a[k.getProcessorType().ordinal()];
            if (i2 == 1) {
                C6529d dVar = new C6529d(k);
                bVar.m39868i(dVar);
                bVar3 = new C6546b(k, context, dVar);
            } else if (i2 != 2) {
                bVar2 = new C6546b(k, context, null);
                new C11502b.C0366b(bVar).m9552a(new C11505d(bVar2));
                bVar.m39860q(bVar2);
            } else {
                C6528c cVar = new C6528c(k.getProcessor());
                bVar.m39869h(cVar);
                bVar3 = new C6546b(k, context, cVar);
            }
            bVar2 = bVar3;
            new C11502b.C0366b(bVar).m9552a(new C11505d(bVar2));
            bVar.m39860q(bVar2);
        }
        bVar.mo3781a().mo2999u(f13707d, Integer.valueOf(i));
        bVar.m39867j(nVar.mo25338b());
    }
}
