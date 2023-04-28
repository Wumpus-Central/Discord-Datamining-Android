package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import p007a6.C1271b;
import p170j5.C9490c;
import p278p5.AbstractC11543f;
import p278p5.C11537d;
import p278p5.C11538e;
import p380v5.C13434e;

/* renamed from: com.facebook.imagepipeline.producers.t */
/* loaded from: classes7.dex */
public class C5029t implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    private final C11538e f8610a;

    /* renamed from: b */
    private final C11538e f8611b;

    /* renamed from: c */
    private final AbstractC11543f f8612c;

    /* renamed from: d */
    private final AbstractC5001l0<C13434e> f8613d;

    /* renamed from: e */
    private final C11537d<CacheKey> f8614e;

    /* renamed from: f */
    private final C11537d<CacheKey> f8615f;

    /* renamed from: com.facebook.imagepipeline.producers.t$a */
    /* loaded from: classes7.dex */
    private static class C5030a extends AbstractC5012o<C13434e, C13434e> {

        /* renamed from: c */
        private final ProducerContext f8616c;

        /* renamed from: d */
        private final C11538e f8617d;

        /* renamed from: e */
        private final C11538e f8618e;

        /* renamed from: f */
        private final AbstractC11543f f8619f;

        /* renamed from: g */
        private final C11537d<CacheKey> f8620g;

        /* renamed from: h */
        private final C11537d<CacheKey> f8621h;

        public C5030a(Consumer<C13434e> consumer, ProducerContext producerContext, C11538e eVar, C11538e eVar2, AbstractC11543f fVar, C11537d<CacheKey> dVar, C11537d<CacheKey> dVar2) {
            super(consumer);
            this.f8616c = producerContext;
            this.f8617d = eVar;
            this.f8618e = eVar2;
            this.f8619f = fVar;
            this.f8620g = dVar;
            this.f8621h = dVar2;
        }

        /* renamed from: p */
        public void mo30912h(C13434e eVar, int i) {
            boolean d;
            boolean z;
            C11538e eVar2;
            try {
                if (C1271b.m41491d()) {
                    C1271b.m41494a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!AbstractC4954b.m31196e(i) && eVar != null && !AbstractC4954b.m31193l(i, 10) && eVar.m3698t() != C9490c.f21023c) {
                    ImageRequest l = this.f8616c.mo31159l();
                    CacheKey d2 = this.f8619f.mo9394d(l, this.f8616c.mo31170a());
                    this.f8620g.m9435a(d2);
                    if ("memory_encoded".equals(this.f8616c.mo31156o("origin"))) {
                        if (!this.f8621h.m9434b(d2)) {
                            if (l.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                eVar2 = this.f8618e;
                            } else {
                                eVar2 = this.f8617d;
                            }
                            eVar2.m9426h(d2);
                            this.f8621h.m9435a(d2);
                        }
                    } else if ("disk".equals(this.f8616c.mo31156o("origin"))) {
                        this.f8621h.m9435a(d2);
                    }
                    m31000o().mo31199b(eVar, i);
                    if (!d) {
                        return;
                    }
                    return;
                }
                m31000o().mo31199b(eVar, i);
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
            } finally {
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
            }
        }
    }

    public C5029t(C11538e eVar, C11538e eVar2, AbstractC11543f fVar, C11537d dVar, C11537d dVar2, AbstractC5001l0<C13434e> l0Var) {
        this.f8610a = eVar;
        this.f8611b = eVar2;
        this.f8612c = fVar;
        this.f8614e = dVar;
        this.f8615f = dVar2;
        this.f8613d = l0Var;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("EncodedProbeProducer#produceResults");
            }
            AbstractC5011n0 h = producerContext.mo31163h();
            h.mo2244d(producerContext, m30960c());
            C5030a aVar = new C5030a(consumer, producerContext, this.f8610a, this.f8611b, this.f8612c, this.f8614e, this.f8615f);
            h.mo2241j(producerContext, "EncodedProbeProducer", null);
            if (C1271b.m41491d()) {
                C1271b.m41494a("mInputProducer.produceResult");
            }
            this.f8613d.mo30917b(aVar, producerContext);
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* renamed from: c */
    protected String m30960c() {
        return "EncodedProbeProducer";
    }
}
