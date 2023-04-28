package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import p278p5.AbstractC11543f;
import p278p5.AbstractC11564s;
import p380v5.AbstractC13432c;

/* renamed from: com.facebook.imagepipeline.producers.f */
/* loaded from: classes7.dex */
public class C4967f extends C4976h {
    public C4967f(AbstractC11564s<CacheKey, AbstractC13432c> sVar, AbstractC11543f fVar, AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        super(sVar, fVar, l0Var);
    }

    @Override // com.facebook.imagepipeline.producers.C4976h
    /* renamed from: d */
    protected String mo31101d() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.C4976h
    /* renamed from: e */
    protected String mo31100e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C4976h
    /* renamed from: g */
    protected Consumer<CloseableReference<AbstractC13432c>> mo31098g(Consumer<CloseableReference<AbstractC13432c>> consumer, CacheKey cacheKey, boolean z) {
        return consumer;
    }
}
