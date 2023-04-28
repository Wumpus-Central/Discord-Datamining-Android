package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import p007a6.C1271b;
import p278p5.AbstractC11543f;
import p278p5.AbstractC11564s;
import p380v5.AbstractC13432c;
import p380v5.AbstractC13436g;
import p380v5.AbstractC13438i;
import p394w3.C13733f;

/* renamed from: com.facebook.imagepipeline.producers.h */
/* loaded from: classes7.dex */
public class C4976h implements AbstractC5001l0<CloseableReference<AbstractC13432c>> {

    /* renamed from: a */
    private final AbstractC11564s<CacheKey, AbstractC13432c> f8446a;

    /* renamed from: b */
    private final AbstractC11543f f8447b;

    /* renamed from: c */
    private final AbstractC5001l0<CloseableReference<AbstractC13432c>> f8448c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.h$a */
    /* loaded from: classes7.dex */
    public class C4977a extends AbstractC5012o<CloseableReference<AbstractC13432c>, CloseableReference<AbstractC13432c>> {

        /* renamed from: c */
        final /* synthetic */ CacheKey f8449c;

        /* renamed from: d */
        final /* synthetic */ boolean f8450d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4977a(Consumer consumer, CacheKey cacheKey, boolean z) {
            super(consumer);
            this.f8449c = cacheKey;
            this.f8450d = z;
        }

        /* renamed from: p */
        public void mo30912h(CloseableReference<AbstractC13432c> closeableReference, int i) {
            CloseableReference<AbstractC13432c> closeableReference2;
            boolean d;
            try {
                if (C1271b.m41491d()) {
                    C1271b.m41494a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean d2 = AbstractC4954b.m31197d(i);
                CloseableReference<AbstractC13432c> closeableReference3 = null;
                if (closeableReference == null) {
                    if (d2) {
                        m31000o().mo31199b(null, i);
                    }
                    if (!d) {
                        return;
                    }
                    return;
                }
                if (!closeableReference.m32039C().mo3738h() && !AbstractC4954b.m31192m(i, 8)) {
                    if (!d2 && (closeableReference2 = C4976h.this.f8446a.get(this.f8449c)) != null) {
                        AbstractC13438i b = closeableReference.m32039C().mo3734b();
                        AbstractC13438i b2 = closeableReference2.m32039C().mo3734b();
                        if (b2.mo3693a() || b2.mo3691c() >= b.mo3691c()) {
                            m31000o().mo31199b(closeableReference2, i);
                            CloseableReference.m32025t(closeableReference2);
                            if (C1271b.m41491d()) {
                                C1271b.m41493b();
                                return;
                            }
                            return;
                        }
                        CloseableReference.m32025t(closeableReference2);
                    }
                    if (this.f8450d) {
                        closeableReference3 = C4976h.this.f8446a.mo9355b(this.f8449c, closeableReference);
                    }
                    if (d2) {
                        m31000o().mo31198c(1.0f);
                    }
                    Consumer<CloseableReference<AbstractC13432c>> o = m31000o();
                    if (closeableReference3 != null) {
                        closeableReference = closeableReference3;
                    }
                    o.mo31199b(closeableReference, i);
                    CloseableReference.m32025t(closeableReference3);
                    if (C1271b.m41491d()) {
                        C1271b.m41493b();
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

    public C4976h(AbstractC11564s<CacheKey, AbstractC13432c> sVar, AbstractC11543f fVar, AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var) {
        this.f8446a = sVar;
        this.f8447b = fVar;
        this.f8448c = l0Var;
    }

    /* renamed from: f */
    private static void m31099f(AbstractC13436g gVar, ProducerContext producerContext) {
        producerContext.mo31158m(gVar.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext) {
        Map<String, String> map;
        boolean d;
        Map<String, String> map2;
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("BitmapMemoryCacheProducer#produceResults");
            }
            AbstractC5011n0 h = producerContext.mo31163h();
            h.mo2244d(producerContext, mo31100e());
            CacheKey a = this.f8447b.mo9397a(producerContext.mo31159l(), producerContext.mo31170a());
            CloseableReference<AbstractC13432c> closeableReference = this.f8446a.get(a);
            Map<String, String> map3 = null;
            if (closeableReference != null) {
                m31099f(closeableReference.m32039C(), producerContext);
                boolean a2 = closeableReference.m32039C().mo3734b().mo3693a();
                if (a2) {
                    String e = mo31100e();
                    if (h.mo2243f(producerContext, mo31100e())) {
                        map2 = C13733f.m2852of("cached_value_found", "true");
                    } else {
                        map2 = null;
                    }
                    h.mo2241j(producerContext, e, map2);
                    h.mo2246b(producerContext, mo31100e(), true);
                    producerContext.mo31166e("memory_bitmap", mo31101d());
                    consumer.mo31198c(1.0f);
                }
                consumer.mo31199b(closeableReference, AbstractC4954b.m31194k(a2));
                closeableReference.close();
                if (a2) {
                    if (!d) {
                        return;
                    }
                    return;
                }
            }
            if (producerContext.mo31155p().m30904b() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.m30904b()) {
                String e2 = mo31100e();
                if (h.mo2243f(producerContext, mo31100e())) {
                    map = C13733f.m2852of("cached_value_found", "false");
                } else {
                    map = null;
                }
                h.mo2241j(producerContext, e2, map);
                h.mo2246b(producerContext, mo31100e(), false);
                producerContext.mo31166e("memory_bitmap", mo31101d());
                consumer.mo31199b(null, 1);
                if (C1271b.m41491d()) {
                    C1271b.m41493b();
                    return;
                }
                return;
            }
            Consumer<CloseableReference<AbstractC13432c>> g = mo31098g(consumer, a, producerContext.mo31159l().isMemoryCacheEnabled());
            String e3 = mo31100e();
            if (h.mo2243f(producerContext, mo31100e())) {
                map3 = C13733f.m2852of("cached_value_found", "false");
            }
            h.mo2241j(producerContext, e3, map3);
            if (C1271b.m41491d()) {
                C1271b.m41494a("mInputProducer.produceResult");
            }
            this.f8448c.mo30917b(g, producerContext);
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* renamed from: d */
    protected String mo31101d() {
        return "pipe_bg";
    }

    /* renamed from: e */
    protected String mo31100e() {
        return "BitmapMemoryCacheProducer";
    }

    /* renamed from: g */
    protected Consumer<CloseableReference<AbstractC13432c>> mo31098g(Consumer<CloseableReference<AbstractC13432c>> consumer, CacheKey cacheKey, boolean z) {
        return new C4977a(consumer, cacheKey, z);
    }
}
