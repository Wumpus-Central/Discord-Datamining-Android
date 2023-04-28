package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p380v5.AbstractC13432c;

/* renamed from: com.facebook.imagepipeline.producers.n */
/* loaded from: classes7.dex */
public class C5009n implements AbstractC5001l0<CloseableReference<AbstractC13432c>> {

    /* renamed from: a */
    private final AbstractC5001l0<CloseableReference<AbstractC13432c>> f8557a;

    /* renamed from: b */
    private final ScheduledExecutorService f8558b;

    /* renamed from: com.facebook.imagepipeline.producers.n$a */
    /* loaded from: classes7.dex */
    class RunnableC5010a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ Consumer f8559k;

        /* renamed from: l */
        final /* synthetic */ ProducerContext f8560l;

        RunnableC5010a(Consumer consumer, ProducerContext producerContext) {
            this.f8559k = consumer;
            this.f8560l = producerContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5009n.this.f8557a.mo30917b(this.f8559k, this.f8560l);
        }
    }

    public C5009n(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f8557a = l0Var;
        this.f8558b = scheduledExecutorService;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext) {
        ImageRequest l = producerContext.mo31159l();
        ScheduledExecutorService scheduledExecutorService = this.f8558b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new RunnableC5010a(consumer, producerContext), l.getDelayMs(), TimeUnit.MILLISECONDS);
        } else {
            this.f8557a.mo30917b(consumer, producerContext);
        }
    }
}
