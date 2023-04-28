package com.facebook.imagepipeline.producers;

import p007a6.C1271b;
import p394w3.C13740j;
import p396w5.C13749a;

/* renamed from: com.facebook.imagepipeline.producers.u0 */
/* loaded from: classes7.dex */
public class C5034u0<T> implements AbstractC5001l0<T> {

    /* renamed from: a */
    private final AbstractC5001l0<T> f8625a;

    /* renamed from: b */
    private final AbstractC5041v0 f8626b;

    /* renamed from: com.facebook.imagepipeline.producers.u0$a */
    /* loaded from: classes7.dex */
    class C5035a extends AbstractC5028s0<T> {

        /* renamed from: p */
        final /* synthetic */ AbstractC5011n0 f8627p;

        /* renamed from: q */
        final /* synthetic */ ProducerContext f8628q;

        /* renamed from: r */
        final /* synthetic */ Consumer f8629r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5035a(Consumer consumer, AbstractC5011n0 n0Var, ProducerContext producerContext, String str, AbstractC5011n0 n0Var2, ProducerContext producerContext2, Consumer consumer2) {
            super(consumer, n0Var, producerContext, str);
            this.f8627p = n0Var2;
            this.f8628q = producerContext2;
            this.f8629r = consumer2;
        }

        @Override // p359u3.AbstractRunnableC13189g
        /* renamed from: b */
        protected void mo4381b(T t) {
        }

        @Override // p359u3.AbstractRunnableC13189g
        /* renamed from: c */
        protected T mo4380c() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC5028s0, p359u3.AbstractRunnableC13189g
        /* renamed from: f */
        public void mo4377f(T t) {
            this.f8627p.mo2241j(this.f8628q, "BackgroundThreadHandoffProducer", null);
            C5034u0.this.f8625a.mo30917b(this.f8629r, this.f8628q);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.u0$b */
    /* loaded from: classes7.dex */
    class C5036b extends C4965e {

        /* renamed from: a */
        final /* synthetic */ AbstractC5028s0 f8631a;

        C5036b(AbstractC5028s0 s0Var) {
            this.f8631a = s0Var;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
        /* renamed from: b */
        public void mo30945b() {
            this.f8631a.m4382a();
            C5034u0.this.f8626b.mo30938a(this.f8631a);
        }
    }

    public C5034u0(AbstractC5001l0<T> l0Var, AbstractC5041v0 v0Var) {
        this.f8625a = (AbstractC5001l0) C13740j.m2834g(l0Var);
        this.f8626b = v0Var;
    }

    /* renamed from: e */
    private static String m30956e(ProducerContext producerContext) {
        if (!C13749a.m2819b()) {
            return null;
        }
        return "ThreadHandoffProducer_produceResults_" + producerContext.getId();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<T> consumer, ProducerContext producerContext) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("ThreadHandoffProducer#produceResults");
            }
            AbstractC5011n0 h = producerContext.mo31163h();
            C5035a aVar = new C5035a(consumer, h, producerContext, "BackgroundThreadHandoffProducer", h, producerContext, consumer);
            producerContext.mo31168c(new C5036b(aVar));
            this.f8626b.mo30937b(C13749a.m2820a(aVar, m30956e(producerContext)));
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }
}
