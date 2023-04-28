package com.facebook.imagepipeline.producers;

import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.w */
/* loaded from: classes7.dex */
public class C5042w implements AbstractC5011n0 {

    /* renamed from: a */
    private final AbstractC5013o0 f8647a;

    /* renamed from: b */
    private final AbstractC5011n0 f8648b;

    public C5042w(AbstractC5013o0 o0Var, AbstractC5011n0 n0Var) {
        this.f8647a = o0Var;
        this.f8648b = n0Var;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: b */
    public void mo2246b(ProducerContext producerContext, String str, boolean z) {
        AbstractC5013o0 o0Var = this.f8647a;
        if (o0Var != null) {
            o0Var.onUltimateProducerReached(producerContext.getId(), str, z);
        }
        AbstractC5011n0 n0Var = this.f8648b;
        if (n0Var != null) {
            n0Var.mo2246b(producerContext, str, z);
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: c */
    public void mo2245c(ProducerContext producerContext, String str, Map<String, String> map) {
        AbstractC5013o0 o0Var = this.f8647a;
        if (o0Var != null) {
            o0Var.onProducerFinishWithCancellation(producerContext.getId(), str, map);
        }
        AbstractC5011n0 n0Var = this.f8648b;
        if (n0Var != null) {
            n0Var.mo2245c(producerContext, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: d */
    public void mo2244d(ProducerContext producerContext, String str) {
        AbstractC5013o0 o0Var = this.f8647a;
        if (o0Var != null) {
            o0Var.onProducerStart(producerContext.getId(), str);
        }
        AbstractC5011n0 n0Var = this.f8648b;
        if (n0Var != null) {
            n0Var.mo2244d(producerContext, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: f */
    public boolean mo2243f(ProducerContext producerContext, String str) {
        boolean z;
        AbstractC5011n0 n0Var;
        AbstractC5013o0 o0Var = this.f8647a;
        if (o0Var != null) {
            z = o0Var.requiresExtraMap(producerContext.getId());
        } else {
            z = false;
        }
        if (z || (n0Var = this.f8648b) == null) {
            return z;
        }
        return n0Var.mo2243f(producerContext, str);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: h */
    public void mo2242h(ProducerContext producerContext, String str, String str2) {
        AbstractC5013o0 o0Var = this.f8647a;
        if (o0Var != null) {
            o0Var.onProducerEvent(producerContext.getId(), str, str2);
        }
        AbstractC5011n0 n0Var = this.f8648b;
        if (n0Var != null) {
            n0Var.mo2242h(producerContext, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: j */
    public void mo2241j(ProducerContext producerContext, String str, Map<String, String> map) {
        AbstractC5013o0 o0Var = this.f8647a;
        if (o0Var != null) {
            o0Var.onProducerFinishWithSuccess(producerContext.getId(), str, map);
        }
        AbstractC5011n0 n0Var = this.f8648b;
        if (n0Var != null) {
            n0Var.mo2241j(producerContext, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5011n0
    /* renamed from: k */
    public void mo2240k(ProducerContext producerContext, String str, Throwable th2, Map<String, String> map) {
        AbstractC5013o0 o0Var = this.f8647a;
        if (o0Var != null) {
            o0Var.onProducerFinishWithFailure(producerContext.getId(), str, th2, map);
        }
        AbstractC5011n0 n0Var = this.f8648b;
        if (n0Var != null) {
            n0Var.mo2240k(producerContext, str, th2, map);
        }
    }
}
