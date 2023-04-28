package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import p278p5.AbstractC11543f;
import p380v5.C13434e;

/* renamed from: com.facebook.imagepipeline.producers.r */
/* loaded from: classes7.dex */
public class C5024r extends AbstractC4972g0<Pair<CacheKey, ImageRequest.RequestLevel>, C13434e> {

    /* renamed from: f */
    private final AbstractC11543f f8598f;

    public C5024r(AbstractC11543f fVar, boolean z, AbstractC5001l0 l0Var) {
        super(l0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z);
        this.f8598f = fVar;
    }

    /* renamed from: l */
    public C13434e mo30968g(C13434e eVar) {
        return C13434e.m3707g(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public Pair<CacheKey, ImageRequest.RequestLevel> mo30967j(ProducerContext producerContext) {
        return Pair.create(this.f8598f.mo9394d(producerContext.mo31159l(), producerContext.mo31170a()), producerContext.mo31155p());
    }
}
