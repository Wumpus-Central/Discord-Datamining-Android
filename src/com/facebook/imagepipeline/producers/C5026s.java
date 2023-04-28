package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import p007a6.C1271b;
import p170j5.C9490c;
import p278p5.AbstractC11543f;
import p278p5.AbstractC11564s;
import p380v5.C13434e;
import p394w3.C13733f;
import p455z3.AbstractC14535g;

/* renamed from: com.facebook.imagepipeline.producers.s */
/* loaded from: classes7.dex */
public class C5026s implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    private final AbstractC11564s<CacheKey, AbstractC14535g> f8599a;

    /* renamed from: b */
    private final AbstractC11543f f8600b;

    /* renamed from: c */
    private final AbstractC5001l0<C13434e> f8601c;

    /* renamed from: com.facebook.imagepipeline.producers.s$a */
    /* loaded from: classes7.dex */
    private static class C5027a extends AbstractC5012o<C13434e, C13434e> {

        /* renamed from: c */
        private final AbstractC11564s<CacheKey, AbstractC14535g> f8602c;

        /* renamed from: d */
        private final CacheKey f8603d;

        /* renamed from: e */
        private final boolean f8604e;

        /* renamed from: f */
        private final boolean f8605f;

        public C5027a(Consumer<C13434e> consumer, AbstractC11564s<CacheKey, AbstractC14535g> sVar, CacheKey cacheKey, boolean z, boolean z2) {
            super(consumer);
            this.f8602c = sVar;
            this.f8603d = cacheKey;
            this.f8604e = z;
            this.f8605f = z2;
        }

        /* renamed from: p */
        public void mo30912h(C13434e eVar, int i) {
            CloseableReference<AbstractC14535g> closeableReference;
            boolean d;
            try {
                if (C1271b.m41491d()) {
                    C1271b.m41494a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!AbstractC4954b.m31196e(i) && eVar != null && !AbstractC4954b.m31193l(i, 10) && eVar.m3698t() != C9490c.f21023c) {
                    CloseableReference<AbstractC14535g> l = eVar.m3703l();
                    if (l != null) {
                        if (!this.f8605f || !this.f8604e) {
                            closeableReference = null;
                        } else {
                            closeableReference = this.f8602c.mo9355b(this.f8603d, l);
                        }
                        CloseableReference.m32025t(l);
                        if (closeableReference != null) {
                            C13434e eVar2 = new C13434e(closeableReference);
                            eVar2.m3705i(eVar);
                            CloseableReference.m32025t(closeableReference);
                            m31000o().mo31198c(1.0f);
                            m31000o().mo31199b(eVar2, i);
                            C13434e.m3706h(eVar2);
                            if (!d) {
                                return;
                            }
                            return;
                        }
                    }
                    m31000o().mo31199b(eVar, i);
                    if (C1271b.m41491d()) {
                        C1271b.m41493b();
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

    public C5026s(AbstractC11564s<CacheKey, AbstractC14535g> sVar, AbstractC11543f fVar, AbstractC5001l0<C13434e> l0Var) {
        this.f8599a = sVar;
        this.f8600b = fVar;
        this.f8601c = l0Var;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        Map<String, String> map;
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("EncodedMemoryCacheProducer#produceResults");
            }
            AbstractC5011n0 h = producerContext.mo31163h();
            h.mo2244d(producerContext, "EncodedMemoryCacheProducer");
            CacheKey d = this.f8600b.mo9394d(producerContext.mo31159l(), producerContext.mo31170a());
            CloseableReference<AbstractC14535g> closeableReference = this.f8599a.get(d);
            Map<String, String> map2 = null;
            if (closeableReference != null) {
                C13434e eVar = new C13434e(closeableReference);
                if (h.mo2243f(producerContext, "EncodedMemoryCacheProducer")) {
                    map2 = C13733f.m2852of("cached_value_found", "true");
                }
                h.mo2241j(producerContext, "EncodedMemoryCacheProducer", map2);
                h.mo2246b(producerContext, "EncodedMemoryCacheProducer", true);
                producerContext.mo31164g("memory_encoded");
                consumer.mo31198c(1.0f);
                consumer.mo31199b(eVar, 1);
                C13434e.m3706h(eVar);
                CloseableReference.m32025t(closeableReference);
            } else if (producerContext.mo31155p().m30904b() >= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.m30904b()) {
                if (h.mo2243f(producerContext, "EncodedMemoryCacheProducer")) {
                    map = C13733f.m2852of("cached_value_found", "false");
                } else {
                    map = null;
                }
                h.mo2241j(producerContext, "EncodedMemoryCacheProducer", map);
                h.mo2246b(producerContext, "EncodedMemoryCacheProducer", false);
                producerContext.mo31166e("memory_encoded", "nil-result");
                consumer.mo31199b(null, 1);
                CloseableReference.m32025t(closeableReference);
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
            } else {
                C5027a aVar = new C5027a(consumer, this.f8599a, d, producerContext.mo31159l().isMemoryCacheEnabled(), producerContext.mo31167d().mo6954D().m31393q());
                if (h.mo2243f(producerContext, "EncodedMemoryCacheProducer")) {
                    map2 = C13733f.m2852of("cached_value_found", "false");
                }
                h.mo2241j(producerContext, "EncodedMemoryCacheProducer", map2);
                this.f8601c.mo30917b(aVar, producerContext);
                CloseableReference.m32025t(closeableReference);
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
            }
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }
}
