package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import p170j5.C9490c;
import p278p5.AbstractC11543f;
import p278p5.C11538e;
import p380v5.C13434e;

/* renamed from: com.facebook.imagepipeline.producers.q */
/* loaded from: classes7.dex */
public class C5018q implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    private final C11538e f8574a;

    /* renamed from: b */
    private final C11538e f8575b;

    /* renamed from: c */
    private final AbstractC11543f f8576c;

    /* renamed from: d */
    private final AbstractC5001l0<C13434e> f8577d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.imagepipeline.producers.q$b */
    /* loaded from: classes7.dex */
    public static class C5020b extends AbstractC5012o<C13434e, C13434e> {

        /* renamed from: c */
        private final ProducerContext f8578c;

        /* renamed from: d */
        private final C11538e f8579d;

        /* renamed from: e */
        private final C11538e f8580e;

        /* renamed from: f */
        private final AbstractC11543f f8581f;

        /* renamed from: p */
        public void mo30912h(C13434e eVar, int i) {
            this.f8578c.mo31163h().mo2244d(this.f8578c, "DiskCacheWriteProducer");
            if (AbstractC4954b.m31196e(i) || eVar == null || AbstractC4954b.m31193l(i, 10) || eVar.m3698t() == C9490c.f21023c) {
                this.f8578c.mo31163h().mo2241j(this.f8578c, "DiskCacheWriteProducer", null);
                m31000o().mo31199b(eVar, i);
                return;
            }
            ImageRequest l = this.f8578c.mo31159l();
            CacheKey d = this.f8581f.mo9394d(l, this.f8578c.mo31170a());
            if (l.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
                this.f8580e.m9418p(d, eVar);
            } else {
                this.f8579d.m9418p(d, eVar);
            }
            this.f8578c.mo31163h().mo2241j(this.f8578c, "DiskCacheWriteProducer", null);
            m31000o().mo31199b(eVar, i);
        }

        private C5020b(Consumer<C13434e> consumer, ProducerContext producerContext, C11538e eVar, C11538e eVar2, AbstractC11543f fVar) {
            super(consumer);
            this.f8578c = producerContext;
            this.f8579d = eVar;
            this.f8580e = eVar2;
            this.f8581f = fVar;
        }
    }

    public C5018q(C11538e eVar, C11538e eVar2, AbstractC11543f fVar, AbstractC5001l0<C13434e> l0Var) {
        this.f8574a = eVar;
        this.f8575b = eVar2;
        this.f8576c = fVar;
        this.f8577d = l0Var;
    }

    /* renamed from: c */
    private void m30990c(Consumer<C13434e> consumer, ProducerContext producerContext) {
        if (producerContext.mo31155p().m30904b() >= ImageRequest.RequestLevel.DISK_CACHE.m30904b()) {
            producerContext.mo31166e("disk", "nil-result_write");
            consumer.mo31199b(null, 1);
            return;
        }
        if (producerContext.mo31159l().isDiskCacheEnabled()) {
            consumer = new C5020b(consumer, producerContext, this.f8574a, this.f8575b, this.f8576c);
        }
        this.f8577d.mo30917b(consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        m30990c(consumer, producerContext);
    }
}
