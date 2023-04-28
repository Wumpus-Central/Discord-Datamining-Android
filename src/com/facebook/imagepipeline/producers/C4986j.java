package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import p007a6.C1271b;
import p278p5.AbstractC11543f;
import p278p5.AbstractC11564s;
import p278p5.C11537d;
import p278p5.C11538e;
import p380v5.AbstractC13432c;
import p455z3.AbstractC14535g;

/* renamed from: com.facebook.imagepipeline.producers.j */
/* loaded from: classes7.dex */
public class C4986j implements AbstractC5001l0<CloseableReference<AbstractC13432c>> {

    /* renamed from: a */
    private final AbstractC11564s<CacheKey, AbstractC14535g> f8480a;

    /* renamed from: b */
    private final C11538e f8481b;

    /* renamed from: c */
    private final C11538e f8482c;

    /* renamed from: d */
    private final AbstractC11543f f8483d;

    /* renamed from: e */
    private final AbstractC5001l0<CloseableReference<AbstractC13432c>> f8484e;

    /* renamed from: f */
    private final C11537d<CacheKey> f8485f;

    /* renamed from: g */
    private final C11537d<CacheKey> f8486g;

    /* renamed from: com.facebook.imagepipeline.producers.j$a */
    /* loaded from: classes7.dex */
    private static class C4987a extends AbstractC5012o<CloseableReference<AbstractC13432c>, CloseableReference<AbstractC13432c>> {

        /* renamed from: c */
        private final ProducerContext f8487c;

        /* renamed from: d */
        private final AbstractC11564s<CacheKey, AbstractC14535g> f8488d;

        /* renamed from: e */
        private final C11538e f8489e;

        /* renamed from: f */
        private final C11538e f8490f;

        /* renamed from: g */
        private final AbstractC11543f f8491g;

        /* renamed from: h */
        private final C11537d<CacheKey> f8492h;

        /* renamed from: i */
        private final C11537d<CacheKey> f8493i;

        public C4987a(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext, AbstractC11564s<CacheKey, AbstractC14535g> sVar, C11538e eVar, C11538e eVar2, AbstractC11543f fVar, C11537d<CacheKey> dVar, C11537d<CacheKey> dVar2) {
            super(consumer);
            this.f8487c = producerContext;
            this.f8488d = sVar;
            this.f8489e = eVar;
            this.f8490f = eVar2;
            this.f8491g = fVar;
            this.f8492h = dVar;
            this.f8493i = dVar2;
        }

        /* renamed from: p */
        public void mo30912h(CloseableReference<AbstractC13432c> closeableReference, int i) {
            boolean d;
            boolean z;
            C11538e eVar;
            try {
                if (C1271b.m41491d()) {
                    C1271b.m41494a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!AbstractC4954b.m31196e(i) && closeableReference != null && !AbstractC4954b.m31193l(i, 8)) {
                    ImageRequest l = this.f8487c.mo31159l();
                    CacheKey d2 = this.f8491g.mo9394d(l, this.f8487c.mo31170a());
                    String str = (String) this.f8487c.mo31156o("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f8487c.mo31167d().mo6954D().m31392r() && !this.f8492h.m9434b(d2)) {
                            this.f8488d.mo9356a(d2);
                            this.f8492h.m9435a(d2);
                        }
                        if (this.f8487c.mo31167d().mo6954D().m31394p() && !this.f8493i.m9434b(d2)) {
                            if (l.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                eVar = this.f8490f;
                            } else {
                                eVar = this.f8489e;
                            }
                            eVar.m9426h(d2);
                            this.f8493i.m9435a(d2);
                        }
                    }
                    m31000o().mo31199b(closeableReference, i);
                    if (!d) {
                        return;
                    }
                    return;
                }
                m31000o().mo31199b(closeableReference, i);
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

    public C4986j(AbstractC11564s<CacheKey, AbstractC14535g> sVar, C11538e eVar, C11538e eVar2, AbstractC11543f fVar, C11537d<CacheKey> dVar, C11537d<CacheKey> dVar2, AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        this.f8480a = sVar;
        this.f8481b = eVar;
        this.f8482c = eVar2;
        this.f8483d = fVar;
        this.f8485f = dVar;
        this.f8486g = dVar2;
        this.f8484e = l0Var;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("BitmapProbeProducer#produceResults");
            }
            AbstractC5011n0 h = producerContext.mo31163h();
            h.mo2244d(producerContext, m31067c());
            C4987a aVar = new C4987a(consumer, producerContext, this.f8480a, this.f8481b, this.f8482c, this.f8483d, this.f8485f, this.f8486g);
            h.mo2241j(producerContext, "BitmapProbeProducer", null);
            if (C1271b.m41491d()) {
                C1271b.m41494a("mInputProducer.produceResult");
            }
            this.f8484e.mo30917b(aVar, producerContext);
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
    protected String m31067c() {
        return "BitmapProbeProducer";
    }
}
