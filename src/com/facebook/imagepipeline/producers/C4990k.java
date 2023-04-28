package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import p380v5.C13434e;

/* renamed from: com.facebook.imagepipeline.producers.k */
/* loaded from: classes7.dex */
public class C4990k implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    private final AbstractC5001l0<C13434e> f8501a;

    /* renamed from: b */
    private final AbstractC5001l0<C13434e> f8502b;

    /* renamed from: com.facebook.imagepipeline.producers.k$b */
    /* loaded from: classes7.dex */
    private class C4992b extends AbstractC5012o<C13434e, C13434e> {

        /* renamed from: c */
        private ProducerContext f8503c;

        @Override // com.facebook.imagepipeline.producers.AbstractC5012o, com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: g */
        protected void mo30913g(Throwable th2) {
            C4990k.this.f8502b.mo30917b(m31000o(), this.f8503c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: p */
        public void mo30912h(C13434e eVar, int i) {
            ImageRequest l = this.f8503c.mo31159l();
            boolean d = AbstractC4954b.m31197d(i);
            boolean c = C4953a1.m31201c(eVar, l.getResizeOptions());
            if (eVar != null && (c || l.getLocalThumbnailPreviewsEnabled())) {
                if (!d || !c) {
                    m31000o().mo31199b(eVar, AbstractC4954b.m31191n(i, 1));
                } else {
                    m31000o().mo31199b(eVar, i);
                }
            }
            if (d && !c) {
                C13434e.m3706h(eVar);
                C4990k.this.f8502b.mo30917b(m31000o(), this.f8503c);
            }
        }

        private C4992b(Consumer<C13434e> consumer, ProducerContext producerContext) {
            super(consumer);
            this.f8503c = producerContext;
        }
    }

    public C4990k(AbstractC5001l0<C13434e> l0Var, AbstractC5001l0<C13434e> l0Var2) {
        this.f8501a = l0Var;
        this.f8502b = l0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        this.f8501a.mo30917b(new C4992b(consumer, producerContext), producerContext);
    }
}
