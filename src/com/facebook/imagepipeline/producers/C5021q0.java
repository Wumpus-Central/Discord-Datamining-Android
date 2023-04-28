package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.producers.C5049y;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p026b6.AbstractC3387c;
import p026b6.AbstractC3388d;
import p026b6.C3386b;
import p026b6.C3389e;
import p076e4.EnumC6704e;
import p170j5.C9489b;
import p170j5.C9490c;
import p380v5.C13434e;
import p394w3.C13733f;
import p394w3.C13740j;
import p455z3.AbstractC14537h;
import p455z3.AbstractC14539j;

/* renamed from: com.facebook.imagepipeline.producers.q0 */
/* loaded from: classes7.dex */
public class C5021q0 implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    private final Executor f8582a;

    /* renamed from: b */
    private final AbstractC14537h f8583b;

    /* renamed from: c */
    private final AbstractC5001l0<C13434e> f8584c;

    /* renamed from: d */
    private final boolean f8585d;

    /* renamed from: e */
    private final AbstractC3388d f8586e;

    /* renamed from: com.facebook.imagepipeline.producers.q0$a */
    /* loaded from: classes7.dex */
    private class C5022a extends AbstractC5012o<C13434e, C13434e> {

        /* renamed from: c */
        private final boolean f8587c;

        /* renamed from: d */
        private final AbstractC3388d f8588d;

        /* renamed from: e */
        private final ProducerContext f8589e;

        /* renamed from: f */
        private boolean f8590f = false;

        /* renamed from: g */
        private final C5049y f8591g;

        /* renamed from: com.facebook.imagepipeline.producers.q0$a$a */
        /* loaded from: classes7.dex */
        class C0125a implements C5049y.AbstractC5053d {

            /* renamed from: a */
            final /* synthetic */ C5021q0 f8593a;

            C0125a(C5021q0 q0Var) {
                this.f8593a = q0Var;
            }

            @Override // com.facebook.imagepipeline.producers.C5049y.AbstractC5053d
            /* renamed from: a */
            public void mo30919a(C13434e eVar, int i) {
                C5022a aVar = C5022a.this;
                aVar.m30974v(eVar, i, (AbstractC3387c) C13740j.m2834g(aVar.f8588d.createImageTranscoder(eVar.m3698t(), C5022a.this.f8587c)));
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.q0$a$b */
        /* loaded from: classes7.dex */
        class C5023b extends C4965e {

            /* renamed from: a */
            final /* synthetic */ C5021q0 f8595a;

            /* renamed from: b */
            final /* synthetic */ Consumer f8596b;

            C5023b(C5021q0 q0Var, Consumer consumer) {
                this.f8595a = q0Var;
                this.f8596b = consumer;
            }

            @Override // com.facebook.imagepipeline.producers.C4965e, com.facebook.imagepipeline.producers.AbstractC5008m0
            /* renamed from: a */
            public void mo30969a() {
                if (C5022a.this.f8589e.mo31162i()) {
                    C5022a.this.f8591g.m30923h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
            /* renamed from: b */
            public void mo30945b() {
                C5022a.this.f8591g.m30928c();
                C5022a.this.f8590f = true;
                this.f8596b.mo31200a();
            }
        }

        C5022a(Consumer<C13434e> consumer, ProducerContext producerContext, boolean z, AbstractC3388d dVar) {
            super(consumer);
            this.f8589e = producerContext;
            Boolean resizingAllowedOverride = producerContext.mo31159l().getResizingAllowedOverride();
            this.f8587c = resizingAllowedOverride != null ? resizingAllowedOverride.booleanValue() : z;
            this.f8588d = dVar;
            this.f8591g = new C5049y(C5021q0.this.f8582a, new C0125a(C5021q0.this), 100);
            producerContext.mo31168c(new C5023b(C5021q0.this, consumer));
        }

        /* renamed from: A */
        private C13434e m30982A(C13434e eVar) {
            if (this.f8589e.mo31159l().getRotationOptions().m31495c() || eVar.m3723H() == 0 || eVar.m3723H() == -1) {
                return eVar;
            }
            return m30972x(eVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public void m30974v(C13434e eVar, int i, AbstractC3387c cVar) {
            this.f8589e.mo31163h().mo2244d(this.f8589e, "ResizeAndRotateProducer");
            ImageRequest l = this.f8589e.mo31159l();
            AbstractC14539j c = C5021q0.this.f8583b.mo261c();
            try {
                C3386b c2 = cVar.mo31259c(eVar, c, l.getRotationOptions(), l.getResizeOptions(), null, 85);
                if (c2.m34539a() != 2) {
                    Map<String, String> y = m30971y(eVar, l.getResizeOptions(), c2, cVar.mo31261a());
                    CloseableReference S = CloseableReference.m32035S(c.mo258b());
                    try {
                        C13434e eVar2 = new C13434e(S);
                        eVar2.m3719K0(C9489b.f21011a);
                        eVar2.m3697w0();
                        this.f8589e.mo31163h().mo2241j(this.f8589e, "ResizeAndRotateProducer", y);
                        if (c2.m34539a() != 1) {
                            i |= 16;
                        }
                        m31000o().mo31199b(eVar2, i);
                        C13434e.m3706h(eVar2);
                    } finally {
                        CloseableReference.m32025t(S);
                    }
                } else {
                    throw new RuntimeException("Error while transcoding the image");
                }
            } catch (Exception e) {
                this.f8589e.mo31163h().mo2240k(this.f8589e, "ResizeAndRotateProducer", e, null);
                if (AbstractC4954b.m31197d(i)) {
                    m31000o().onFailure(e);
                }
            } finally {
                c.close();
            }
        }

        /* renamed from: w */
        private void m30973w(C13434e eVar, int i, C9490c cVar) {
            C13434e eVar2;
            if (cVar == C9489b.f21011a || cVar == C9489b.f21021k) {
                eVar2 = m30982A(eVar);
            } else {
                eVar2 = m30970z(eVar);
            }
            m31000o().mo31199b(eVar2, i);
        }

        /* renamed from: x */
        private C13434e m30972x(C13434e eVar, int i) {
            C13434e g = C13434e.m3707g(eVar);
            if (g != null) {
                g.m3718L0(i);
            }
            return g;
        }

        /* renamed from: y */
        private Map<String, String> m30971y(C13434e eVar, ResizeOptions resizeOptions, C3386b bVar, String str) {
            String str2;
            if (!this.f8589e.mo31163h().mo2243f(this.f8589e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = eVar.getWidth() + "x" + eVar.getHeight();
            if (resizeOptions != null) {
                str2 = resizeOptions.f8141a + "x" + resizeOptions.f8142b;
            } else {
                str2 = "Unspecified";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Image format", String.valueOf(eVar.m3698t()));
            hashMap.put("Original size", str3);
            hashMap.put("Requested size", str2);
            hashMap.put("queueTime", String.valueOf(this.f8591g.m30925f()));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(bVar));
            return C13733f.m2853a(hashMap);
        }

        /* renamed from: z */
        private C13434e m30970z(C13434e eVar) {
            RotationOptions rotationOptions = this.f8589e.mo31159l().getRotationOptions();
            if (rotationOptions.m31491g() || !rotationOptions.m31492f()) {
                return eVar;
            }
            return m30972x(eVar, rotationOptions.m31493e());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: B */
        public void mo30912h(C13434e eVar, int i) {
            if (!this.f8590f) {
                boolean d = AbstractC4954b.m31197d(i);
                if (eVar != null) {
                    C9490c t = eVar.m3698t();
                    EnumC6704e h = C5021q0.m30983h(this.f8589e.mo31159l(), eVar, (AbstractC3387c) C13740j.m2834g(this.f8588d.createImageTranscoder(t, this.f8587c)));
                    if (!d && h == EnumC6704e.UNSET) {
                        return;
                    }
                    if (h != EnumC6704e.YES) {
                        m30973w(eVar, i, t);
                    } else if (this.f8591g.m30920k(eVar, i)) {
                        if (d || this.f8589e.mo31162i()) {
                            this.f8591g.m30923h();
                        }
                    }
                } else if (d) {
                    m31000o().mo31199b(null, 1);
                }
            }
        }
    }

    public C5021q0(Executor executor, AbstractC14537h hVar, AbstractC5001l0<C13434e> l0Var, boolean z, AbstractC3388d dVar) {
        this.f8582a = (Executor) C13740j.m2834g(executor);
        this.f8583b = (AbstractC14537h) C13740j.m2834g(hVar);
        this.f8584c = (AbstractC5001l0) C13740j.m2834g(l0Var);
        this.f8586e = (AbstractC3388d) C13740j.m2834g(dVar);
        this.f8585d = z;
    }

    /* renamed from: f */
    private static boolean m30985f(RotationOptions rotationOptions, C13434e eVar) {
        if (rotationOptions.m31495c() || (C3389e.m34534e(rotationOptions, eVar) == 0 && !m30984g(rotationOptions, eVar))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m30984g(RotationOptions rotationOptions, C13434e eVar) {
        if (rotationOptions.m31492f() && !rotationOptions.m31495c()) {
            return C3389e.f5417a.contains(Integer.valueOf(eVar.m3700r()));
        }
        eVar.m3721I0(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static EnumC6704e m30983h(ImageRequest imageRequest, C13434e eVar, AbstractC3387c cVar) {
        boolean z;
        if (eVar == null || eVar.m3698t() == C9490c.f21023c) {
            return EnumC6704e.UNSET;
        }
        if (!cVar.mo31260b(eVar.m3698t())) {
            return EnumC6704e.NO;
        }
        if (m30985f(imageRequest.getRotationOptions(), eVar) || cVar.mo31258d(eVar, imageRequest.getRotationOptions(), imageRequest.getResizeOptions())) {
            z = true;
        } else {
            z = false;
        }
        return EnumC6704e.m24610c(z);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        this.f8584c.mo30917b(new C5022a(consumer, producerContext, this.f8585d, this.f8586e), producerContext);
    }
}
