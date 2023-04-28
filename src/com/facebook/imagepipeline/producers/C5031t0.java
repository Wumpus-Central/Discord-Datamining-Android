package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.t0 */
/* loaded from: classes7.dex */
public class C5031t0<T> implements AbstractC5001l0<Void> {

    /* renamed from: a */
    private final AbstractC5001l0<T> f8622a;

    /* renamed from: com.facebook.imagepipeline.producers.t0$a */
    /* loaded from: classes7.dex */
    class C5032a extends AbstractC5012o<T, Void> {
        C5032a(Consumer consumer) {
            super(consumer);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: h */
        protected void mo30912h(T t, int i) {
            if (AbstractC4954b.m31197d(i)) {
                m31000o().mo31199b(null, i);
            }
        }
    }

    public C5031t0(AbstractC5001l0<T> l0Var) {
        this.f8622a = l0Var;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<Void> consumer, ProducerContext producerContext) {
        this.f8622a.mo30917b(new C5032a(consumer), producerContext);
    }
}
