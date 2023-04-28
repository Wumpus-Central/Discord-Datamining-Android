package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.o */
/* loaded from: classes7.dex */
public abstract class AbstractC5012o<I, O> extends AbstractC4954b<I> {

    /* renamed from: b */
    private final Consumer<O> f8562b;

    public AbstractC5012o(Consumer<O> consumer) {
        this.f8562b = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4954b
    /* renamed from: f */
    protected void mo30932f() {
        this.f8562b.mo31200a();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4954b
    /* renamed from: g */
    protected void mo30913g(Throwable th2) {
        this.f8562b.onFailure(th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.AbstractC4954b
    /* renamed from: i */
    public void mo31001i(float f) {
        this.f8562b.mo31198c(f);
    }

    /* renamed from: o */
    public Consumer<O> m31000o() {
        return this.f8562b;
    }
}
