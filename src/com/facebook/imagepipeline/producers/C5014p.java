package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p022b2.AbstractC3371d;
import p022b2.C3373f;
import p278p5.AbstractC11543f;
import p278p5.C11538e;
import p380v5.C13434e;
import p394w3.C13733f;

/* renamed from: com.facebook.imagepipeline.producers.p */
/* loaded from: classes7.dex */
public class C5014p implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    private final C11538e f8563a;

    /* renamed from: b */
    private final C11538e f8564b;

    /* renamed from: c */
    private final AbstractC11543f f8565c;

    /* renamed from: d */
    private final AbstractC5001l0<C13434e> f8566d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.p$a */
    /* loaded from: classes7.dex */
    public class C5015a implements AbstractC3371d<C13434e, Void> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5011n0 f8567a;

        /* renamed from: b */
        final /* synthetic */ ProducerContext f8568b;

        /* renamed from: c */
        final /* synthetic */ Consumer f8569c;

        C5015a(AbstractC5011n0 n0Var, ProducerContext producerContext, Consumer consumer) {
            this.f8567a = n0Var;
            this.f8568b = producerContext;
            this.f8569c = consumer;
        }

        /* renamed from: b */
        public Void mo30992a(C3373f<C13434e> fVar) {
            if (C5014p.m30996f(fVar)) {
                this.f8567a.mo2245c(this.f8568b, "DiskCacheProducer", null);
                this.f8569c.mo31200a();
            } else if (fVar.m34568n()) {
                this.f8567a.mo2240k(this.f8568b, "DiskCacheProducer", fVar.m34573i(), null);
                C5014p.this.f8566d.mo30917b(this.f8569c, this.f8568b);
            } else {
                C13434e j = fVar.m34572j();
                if (j != null) {
                    AbstractC5011n0 n0Var = this.f8567a;
                    ProducerContext producerContext = this.f8568b;
                    n0Var.mo2241j(producerContext, "DiskCacheProducer", C5014p.m30997e(n0Var, producerContext, true, j.m3714R()));
                    this.f8567a.mo2246b(this.f8568b, "DiskCacheProducer", true);
                    this.f8568b.mo31164g("disk");
                    this.f8569c.mo31198c(1.0f);
                    this.f8569c.mo31199b(j, 1);
                    j.close();
                } else {
                    AbstractC5011n0 n0Var2 = this.f8567a;
                    ProducerContext producerContext2 = this.f8568b;
                    n0Var2.mo2241j(producerContext2, "DiskCacheProducer", C5014p.m30997e(n0Var2, producerContext2, false, 0));
                    C5014p.this.f8566d.mo30917b(this.f8569c, this.f8568b);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.p$b */
    /* loaded from: classes7.dex */
    public class C5016b extends C4965e {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f8571a;

        C5016b(AtomicBoolean atomicBoolean) {
            this.f8571a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
        /* renamed from: b */
        public void mo30945b() {
            this.f8571a.set(true);
        }
    }

    public C5014p(C11538e eVar, C11538e eVar2, AbstractC11543f fVar, AbstractC5001l0<C13434e> l0Var) {
        this.f8563a = eVar;
        this.f8564b = eVar2;
        this.f8565c = fVar;
        this.f8566d = l0Var;
    }

    /* renamed from: e */
    static Map<String, String> m30997e(AbstractC5011n0 n0Var, ProducerContext producerContext, boolean z, int i) {
        if (!n0Var.mo2243f(producerContext, "DiskCacheProducer")) {
            return null;
        }
        if (z) {
            return C13733f.m2851of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return C13733f.m2852of("cached_value_found", String.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m30996f(C3373f<?> fVar) {
        if (fVar.m34570l() || (fVar.m34568n() && (fVar.m34573i() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m30995g(Consumer<C13434e> consumer, ProducerContext producerContext) {
        if (producerContext.mo31155p().m30904b() >= ImageRequest.RequestLevel.DISK_CACHE.m30904b()) {
            producerContext.mo31166e("disk", "nil-result_read");
            consumer.mo31199b(null, 1);
            return;
        }
        this.f8566d.mo30917b(consumer, producerContext);
    }

    /* renamed from: h */
    private AbstractC3371d<C13434e, Void> m30994h(Consumer<C13434e> consumer, ProducerContext producerContext) {
        return new C5015a(producerContext.mo31163h(), producerContext, consumer);
    }

    /* renamed from: i */
    private void m30993i(AtomicBoolean atomicBoolean, ProducerContext producerContext) {
        producerContext.mo31168c(new C5016b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        boolean z;
        C11538e eVar;
        ImageRequest l = producerContext.mo31159l();
        if (!l.isDiskCacheEnabled()) {
            m30995g(consumer, producerContext);
            return;
        }
        producerContext.mo31163h().mo2244d(producerContext, "DiskCacheProducer");
        CacheKey d = this.f8565c.mo9394d(l, producerContext.mo31170a());
        if (l.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eVar = this.f8564b;
        } else {
            eVar = this.f8563a;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        eVar.m9420n(d, atomicBoolean).m34577e(m30994h(consumer, producerContext));
        m30993i(atomicBoolean, producerContext);
    }
}
