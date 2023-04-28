package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import p278p5.AbstractC11543f;
import p380v5.AbstractC13432c;

/* renamed from: com.facebook.imagepipeline.producers.g */
/* loaded from: classes7.dex */
public class C4971g extends AbstractC4972g0<Pair<CacheKey, ImageRequest.RequestLevel>, CloseableReference<AbstractC13432c>> {

    /* renamed from: f */
    private final AbstractC11543f f8429f;

    public C4971g(AbstractC11543f fVar, AbstractC5001l0 l0Var) {
        super(l0Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f8429f = fVar;
    }

    /* renamed from: l */
    public CloseableReference<AbstractC13432c> mo30968g(CloseableReference<AbstractC13432c> closeableReference) {
        return CloseableReference.m32027r(closeableReference);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public Pair<CacheKey, ImageRequest.RequestLevel> mo30967j(ProducerContext producerContext) {
        return Pair.create(this.f8429f.mo9397a(producerContext.mo31159l(), producerContext.mo31170a()), producerContext.mo31155p());
    }
}
