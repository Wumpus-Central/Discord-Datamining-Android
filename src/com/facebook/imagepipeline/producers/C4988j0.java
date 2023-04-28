package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.AbstractC5062a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.Map;
import p278p5.AbstractC11543f;
import p278p5.AbstractC11564s;
import p380v5.AbstractC13432c;
import p394w3.C13733f;

/* renamed from: com.facebook.imagepipeline.producers.j0 */
/* loaded from: classes7.dex */
public class C4988j0 implements AbstractC5001l0<CloseableReference<AbstractC13432c>> {

    /* renamed from: a */
    private final AbstractC11564s<CacheKey, AbstractC13432c> f8494a;

    /* renamed from: b */
    private final AbstractC11543f f8495b;

    /* renamed from: c */
    private final AbstractC5001l0<CloseableReference<AbstractC13432c>> f8496c;

    /* renamed from: com.facebook.imagepipeline.producers.j0$a */
    /* loaded from: classes7.dex */
    public static class C4989a extends AbstractC5012o<CloseableReference<AbstractC13432c>, CloseableReference<AbstractC13432c>> {

        /* renamed from: c */
        private final CacheKey f8497c;

        /* renamed from: d */
        private final boolean f8498d;

        /* renamed from: e */
        private final AbstractC11564s<CacheKey, AbstractC13432c> f8499e;

        /* renamed from: f */
        private final boolean f8500f;

        public C4989a(Consumer<CloseableReference<AbstractC13432c>> consumer, CacheKey cacheKey, boolean z, AbstractC11564s<CacheKey, AbstractC13432c> sVar, boolean z2) {
            super(consumer);
            this.f8497c = cacheKey;
            this.f8498d = z;
            this.f8499e = sVar;
            this.f8500f = z2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: p */
        public void mo30912h(CloseableReference<AbstractC13432c> closeableReference, int i) {
            CloseableReference<AbstractC13432c> closeableReference2 = null;
            if (closeableReference == null) {
                if (AbstractC4954b.m31197d(i)) {
                    m31000o().mo31199b(null, i);
                }
            } else if (!AbstractC4954b.m31196e(i) || this.f8498d) {
                if (this.f8500f) {
                    closeableReference2 = this.f8499e.mo9355b(this.f8497c, closeableReference);
                }
                try {
                    m31000o().mo31198c(1.0f);
                    Consumer<CloseableReference<AbstractC13432c>> o = m31000o();
                    if (closeableReference2 != null) {
                        closeableReference = closeableReference2;
                    }
                    o.mo31199b(closeableReference, i);
                } finally {
                    CloseableReference.m32025t(closeableReference2);
                }
            }
        }
    }

    public C4988j0(AbstractC11564s<CacheKey, AbstractC13432c> sVar, AbstractC11543f fVar, AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        this.f8494a = sVar;
        this.f8495b = fVar;
        this.f8496c = l0Var;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext) {
        AbstractC5011n0 h = producerContext.mo31163h();
        ImageRequest l = producerContext.mo31159l();
        Object a = producerContext.mo31170a();
        Postprocessor postprocessor = l.getPostprocessor();
        if (postprocessor == null || postprocessor.getPostprocessorCacheKey() == null) {
            this.f8496c.mo30917b(consumer, producerContext);
            return;
        }
        h.mo2244d(producerContext, m31065c());
        CacheKey c = this.f8495b.mo9395c(l, a);
        CloseableReference<AbstractC13432c> closeableReference = this.f8494a.get(c);
        Map<String, String> map = null;
        if (closeableReference != null) {
            String c2 = m31065c();
            if (h.mo2243f(producerContext, m31065c())) {
                map = C13733f.m2852of("cached_value_found", "true");
            }
            h.mo2241j(producerContext, c2, map);
            h.mo2246b(producerContext, "PostprocessedBitmapMemoryCacheProducer", true);
            producerContext.mo31166e("memory_bitmap", "postprocessed");
            consumer.mo31198c(1.0f);
            consumer.mo31199b(closeableReference, 1);
            closeableReference.close();
            return;
        }
        C4989a aVar = new C4989a(consumer, c, postprocessor instanceof AbstractC5062a, this.f8494a, producerContext.mo31159l().isMemoryCacheEnabled());
        String c3 = m31065c();
        if (h.mo2243f(producerContext, m31065c())) {
            map = C13733f.m2852of("cached_value_found", "false");
        }
        h.mo2241j(producerContext, c3, map);
        this.f8496c.mo30917b(aVar, producerContext);
    }

    /* renamed from: c */
    protected String m31065c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
