package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.producers.C5049y;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.C5064a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p007a6.C1271b;
import p026b6.C3385a;
import p076e4.C6700a;
import p076e4.C6706f;
import p170j5.C9489b;
import p314r5.C12387a;
import p346t5.AbstractC12962c;
import p346t5.AbstractC12964e;
import p346t5.C12965f;
import p380v5.AbstractC13431b;
import p380v5.AbstractC13432c;
import p380v5.AbstractC13438i;
import p380v5.C13433d;
import p380v5.C13434e;
import p380v5.C13437h;
import p394w3.C13733f;
import p394w3.C13740j;
import p455z3.AbstractC14529a;

/* renamed from: com.facebook.imagepipeline.producers.m */
/* loaded from: classes7.dex */
public class C5002m implements AbstractC5001l0<CloseableReference<AbstractC13432c>> {

    /* renamed from: a */
    private final AbstractC14529a f8526a;

    /* renamed from: b */
    private final Executor f8527b;

    /* renamed from: c */
    private final AbstractC12962c f8528c;

    /* renamed from: d */
    private final AbstractC12964e f8529d;

    /* renamed from: e */
    private final AbstractC5001l0<C13434e> f8530e;

    /* renamed from: f */
    private final boolean f8531f;

    /* renamed from: g */
    private final boolean f8532g;

    /* renamed from: h */
    private final boolean f8533h;

    /* renamed from: i */
    private final int f8534i;

    /* renamed from: j */
    private final C12387a f8535j;

    /* renamed from: k */
    private final Runnable f8536k;

    /* renamed from: l */
    private final Supplier<Boolean> f8537l;

    /* renamed from: com.facebook.imagepipeline.producers.m$a */
    /* loaded from: classes7.dex */
    private class C5003a extends AbstractC5005c {
        public C5003a(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext, boolean z, int i) {
            super(consumer, producerContext, z, i);
        }

        @Override // com.facebook.imagepipeline.producers.C5002m.AbstractC5005c
        /* renamed from: H */
        protected synchronized boolean mo31016H(C13434e eVar, int i) {
            if (AbstractC4954b.m31196e(i)) {
                return false;
            }
            return super.mo31016H(eVar, i);
        }

        @Override // com.facebook.imagepipeline.producers.C5002m.AbstractC5005c
        /* renamed from: w */
        protected int mo31008w(C13434e eVar) {
            return eVar.m3714R();
        }

        @Override // com.facebook.imagepipeline.producers.C5002m.AbstractC5005c
        /* renamed from: x */
        protected AbstractC13438i mo31007x() {
            return C13437h.m3694d(0, false, false);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.m$b */
    /* loaded from: classes7.dex */
    private class C5004b extends AbstractC5005c {

        /* renamed from: j */
        private final C12965f f8539j;

        /* renamed from: k */
        private final AbstractC12964e f8540k;

        /* renamed from: l */
        private int f8541l = 0;

        public C5004b(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext, C12965f fVar, AbstractC12964e eVar, boolean z, int i) {
            super(consumer, producerContext, z, i);
            this.f8539j = (C12965f) C13740j.m2834g(fVar);
            this.f8540k = (AbstractC12964e) C13740j.m2834g(eVar);
        }

        @Override // com.facebook.imagepipeline.producers.C5002m.AbstractC5005c
        /* renamed from: H */
        protected synchronized boolean mo31016H(C13434e eVar, int i) {
            boolean H = super.mo31016H(eVar, i);
            if ((AbstractC4954b.m31196e(i) || AbstractC4954b.m31192m(i, 8)) && !AbstractC4954b.m31192m(i, 4) && C13434e.m3704j0(eVar) && eVar.m3698t() == C9489b.f21011a) {
                if (!this.f8539j.m4932g(eVar)) {
                    return false;
                }
                int d = this.f8539j.m4935d();
                int i2 = this.f8541l;
                if (d <= i2) {
                    return false;
                }
                if (d < this.f8540k.mo4931a(i2) && !this.f8539j.m4934e()) {
                    return false;
                }
                this.f8541l = d;
            }
            return H;
        }

        @Override // com.facebook.imagepipeline.producers.C5002m.AbstractC5005c
        /* renamed from: w */
        protected int mo31008w(C13434e eVar) {
            return this.f8539j.m4936c();
        }

        @Override // com.facebook.imagepipeline.producers.C5002m.AbstractC5005c
        /* renamed from: x */
        protected AbstractC13438i mo31007x() {
            return this.f8540k.mo4930b(this.f8539j.m4935d());
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.m$c */
    /* loaded from: classes7.dex */
    private abstract class AbstractC5005c extends AbstractC5012o<C13434e, CloseableReference<AbstractC13432c>> {

        /* renamed from: d */
        private final ProducerContext f8544d;

        /* renamed from: e */
        private final AbstractC5011n0 f8545e;

        /* renamed from: f */
        private final ImageDecodeOptions f8546f;

        /* renamed from: h */
        private final C5049y f8548h;

        /* renamed from: c */
        private final String f8543c = "ProgressiveDecoder";

        /* renamed from: g */
        private boolean f8547g = false;

        /* renamed from: com.facebook.imagepipeline.producers.m$c$a */
        /* loaded from: classes7.dex */
        class C5006a implements C5049y.AbstractC5053d {

            /* renamed from: a */
            final /* synthetic */ C5002m f8550a;

            /* renamed from: b */
            final /* synthetic */ ProducerContext f8551b;

            /* renamed from: c */
            final /* synthetic */ int f8552c;

            C5006a(C5002m mVar, ProducerContext producerContext, int i) {
                this.f8550a = mVar;
                this.f8551b = producerContext;
                this.f8552c = i;
            }

            @Override // com.facebook.imagepipeline.producers.C5049y.AbstractC5053d
            /* renamed from: a */
            public void mo30919a(C13434e eVar, int i) {
                if (eVar != null) {
                    AbstractC5005c.this.f8544d.mo31169b("image_format", eVar.m3698t().m16144a());
                    if (C5002m.this.f8531f || !AbstractC4954b.m31192m(i, 16)) {
                        ImageRequest l = this.f8551b.mo31159l();
                        if (C5002m.this.f8532g || !C6706f.m24597m(l.getSourceUri())) {
                            eVar.m3717M0(C3385a.m34544b(l.getRotationOptions(), l.getResizeOptions(), eVar, this.f8552c));
                        }
                    }
                    if (this.f8551b.mo31167d().mo6954D().m31384z()) {
                        AbstractC5005c.this.m31019E(eVar);
                    }
                    AbstractC5005c.this.m31010u(eVar, i);
                }
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.m$c$b */
        /* loaded from: classes7.dex */
        class C5007b extends C4965e {

            /* renamed from: a */
            final /* synthetic */ C5002m f8554a;

            /* renamed from: b */
            final /* synthetic */ boolean f8555b;

            C5007b(C5002m mVar, boolean z) {
                this.f8554a = mVar;
                this.f8555b = z;
            }

            @Override // com.facebook.imagepipeline.producers.C4965e, com.facebook.imagepipeline.producers.AbstractC5008m0
            /* renamed from: a */
            public void mo30969a() {
                if (AbstractC5005c.this.f8544d.mo31162i()) {
                    AbstractC5005c.this.f8548h.m30923h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
            /* renamed from: b */
            public void mo30945b() {
                if (this.f8555b) {
                    AbstractC5005c.this.m31006y();
                }
            }
        }

        public AbstractC5005c(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext, boolean z, int i) {
            super(consumer);
            this.f8544d = producerContext;
            this.f8545e = producerContext.mo31163h();
            ImageDecodeOptions imageDecodeOptions = producerContext.mo31159l().getImageDecodeOptions();
            this.f8546f = imageDecodeOptions;
            this.f8548h = new C5049y(C5002m.this.f8527b, new C5006a(C5002m.this, producerContext, i), imageDecodeOptions.f8126a);
            producerContext.mo31168c(new C5007b(C5002m.this, z));
        }

        /* renamed from: A */
        private void m31023A(AbstractC13432c cVar, int i) {
            CloseableReference<AbstractC13432c> b = C5002m.this.f8535j.m6973b(cVar);
            try {
                m31020D(AbstractC4954b.m31197d(i));
                m31000o().mo31199b(b, i);
            } finally {
                CloseableReference.m32025t(b);
            }
        }

        /* renamed from: B */
        private AbstractC13432c m31022B(C13434e eVar, int i, AbstractC13438i iVar) {
            boolean z;
            if (C5002m.this.f8536k == null || !((Boolean) C5002m.this.f8537l.get()).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            try {
                return C5002m.this.f8528c.mo4939a(eVar, i, iVar, this.f8546f);
            } catch (OutOfMemoryError e) {
                if (z) {
                    C5002m.this.f8536k.run();
                    System.gc();
                    return C5002m.this.f8528c.mo4939a(eVar, i, iVar, this.f8546f);
                }
                throw e;
            }
        }

        /* renamed from: C */
        private synchronized boolean m31021C() {
            return this.f8547g;
        }

        /* renamed from: D */
        private void m31020D(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f8547g) {
                        m31000o().mo31198c(1.0f);
                        this.f8547g = true;
                        this.f8548h.m30928c();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public void m31019E(C13434e eVar) {
            if (eVar.m3698t() == C9489b.f21011a) {
                eVar.m3717M0(C3385a.m34543c(eVar, C5064a.m30861c(this.f8546f.f8132g), 104857600));
            }
        }

        /* renamed from: G */
        private void m31017G(C13434e eVar, AbstractC13432c cVar) {
            Bitmap.Config config;
            this.f8544d.mo31169b("encoded_width", Integer.valueOf(eVar.getWidth()));
            this.f8544d.mo31169b("encoded_height", Integer.valueOf(eVar.getHeight()));
            this.f8544d.mo31169b("encoded_size", Integer.valueOf(eVar.m3714R()));
            if (cVar instanceof AbstractC13431b) {
                Bitmap n = ((AbstractC13431b) cVar).mo3732n();
                if (n == null) {
                    config = null;
                } else {
                    config = n.getConfig();
                }
                this.f8544d.mo31169b("bitmap_config", String.valueOf(config));
            }
            if (cVar != null) {
                cVar.m3736l(this.f8544d.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(7:62|25|(3:(9:(14:29|(12:34|61|36|63|37|65|38|(1:40)|41|42|43|44)|35|61|36|63|37|65|38|(0)|41|42|43|44)|(12:34|61|36|63|37|65|38|(0)|41|42|43|44)|65|38|(0)|41|42|43|44)|63|37)|30|35|61|36) */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f5, code lost:
            r2 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
        /* renamed from: u */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31010u(p380v5.C13434e r21, int r22) {
            /*
                Method dump skipped, instructions count: 322
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C5002m.AbstractC5005c.m31010u(v5.e, int):void");
        }

        /* renamed from: v */
        private Map<String, String> m31009v(AbstractC13432c cVar, long j, AbstractC13438i iVar, boolean z, String str, String str2, String str3, String str4) {
            Bitmap n;
            if (!this.f8545e.mo2243f(this.f8544d, "DecodeProducer")) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(iVar.mo3692b());
            String valueOf3 = String.valueOf(z);
            if (cVar instanceof C13433d) {
                C13740j.m2834g(((C13433d) cVar).mo3732n());
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", n.getWidth() + "x" + n.getHeight());
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                hashMap.put("byteCount", n.getByteCount() + "");
                return C13733f.m2853a(hashMap);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put("imageFormat", str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            return C13733f.m2853a(hashMap2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public void m31006y() {
            m31020D(true);
            m31000o().mo31200a();
        }

        /* renamed from: z */
        private void m31005z(Throwable th2) {
            m31020D(true);
            m31000o().onFailure(th2);
        }

        /* renamed from: F */
        public void mo30912h(C13434e eVar, int i) {
            boolean d;
            try {
                if (C1271b.m41491d()) {
                    C1271b.m41494a("DecodeProducer#onNewResultImpl");
                }
                boolean d2 = AbstractC4954b.m31197d(i);
                if (d2) {
                    if (eVar == null) {
                        m31005z(new C6700a("Encoded image is null."));
                        if (!d) {
                            return;
                        }
                        return;
                    } else if (!eVar.m3708f0()) {
                        m31005z(new C6700a("Encoded image is not valid."));
                        if (C1271b.m41491d()) {
                            C1271b.m41493b();
                            return;
                        }
                        return;
                    }
                }
                if (mo31016H(eVar, i)) {
                    boolean m = AbstractC4954b.m31192m(i, 4);
                    if (d2 || m || this.f8544d.mo31162i()) {
                        this.f8548h.m30923h();
                    }
                    if (C1271b.m41491d()) {
                        C1271b.m41493b();
                    }
                } else if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
            } finally {
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
            }
        }

        /* renamed from: H */
        protected boolean mo31016H(C13434e eVar, int i) {
            return this.f8548h.m30920k(eVar, i);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5012o, com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: f */
        public void mo30932f() {
            m31006y();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5012o, com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: g */
        public void mo30913g(Throwable th2) {
            m31005z(th2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC5012o, com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: i */
        public void mo31001i(float f) {
            super.mo31001i(f * 0.99f);
        }

        /* renamed from: w */
        protected abstract int mo31008w(C13434e eVar);

        /* renamed from: x */
        protected abstract AbstractC13438i mo31007x();
    }

    public C5002m(AbstractC14529a aVar, Executor executor, AbstractC12962c cVar, AbstractC12964e eVar, boolean z, boolean z2, boolean z3, AbstractC5001l0<C13434e> l0Var, int i, C12387a aVar2, Runnable runnable, Supplier<Boolean> supplier) {
        this.f8526a = (AbstractC14529a) C13740j.m2834g(aVar);
        this.f8527b = (Executor) C13740j.m2834g(executor);
        this.f8528c = (AbstractC12962c) C13740j.m2834g(cVar);
        this.f8529d = (AbstractC12964e) C13740j.m2834g(eVar);
        this.f8531f = z;
        this.f8532g = z2;
        this.f8530e = (AbstractC5001l0) C13740j.m2834g(l0Var);
        this.f8533h = z3;
        this.f8534i = i;
        this.f8535j = aVar2;
        this.f8536k = runnable;
        this.f8537l = supplier;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext) {
        Consumer<C13434e> consumer2;
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("DecodeProducer#produceResults");
            }
            if (!C6706f.m24597m(producerContext.mo31159l().getSourceUri())) {
                consumer2 = new C5003a(consumer, producerContext, this.f8533h, this.f8534i);
            } else {
                consumer2 = new C5004b(consumer, producerContext, new C12965f(this.f8526a), this.f8529d, this.f8533h, this.f8534i);
            }
            this.f8530e.mo30917b(consumer2, producerContext);
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }
}
