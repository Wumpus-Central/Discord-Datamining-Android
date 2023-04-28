package com.facebook.imagepipeline.producers;

import p380v5.C13434e;

/* renamed from: com.facebook.imagepipeline.producers.a */
/* loaded from: classes7.dex */
public class C4950a implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    private final AbstractC5001l0<C13434e> f8379a;

    /* renamed from: com.facebook.imagepipeline.producers.a$b */
    /* loaded from: classes7.dex */
    private static class C4951b extends AbstractC5012o<C13434e, C13434e> {
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: p */
        public void mo30912h(C13434e eVar, int i) {
            if (eVar == null) {
                m31000o().mo31199b(null, i);
                return;
            }
            if (!C13434e.m3709b0(eVar)) {
                eVar.m3697w0();
            }
            m31000o().mo31199b(eVar, i);
        }

        private C4951b(Consumer<C13434e> consumer) {
            super(consumer);
        }
    }

    public C4950a(AbstractC5001l0<C13434e> l0Var) {
        this.f8379a = l0Var;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        this.f8379a.mo30917b(new C4951b(consumer), producerContext);
    }
}
