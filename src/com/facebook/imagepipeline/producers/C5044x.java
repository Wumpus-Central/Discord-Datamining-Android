package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.listener.RequestListener;
import p416x5.AbstractC13937d;

/* renamed from: com.facebook.imagepipeline.producers.x */
/* loaded from: classes7.dex */
public class C5044x extends C5042w implements AbstractC13937d {

    /* renamed from: c */
    private final RequestListener f8652c;

    /* renamed from: d */
    private final AbstractC13937d f8653d;

    public C5044x(RequestListener requestListener, AbstractC13937d dVar) {
        super(requestListener, dVar);
        this.f8652c = requestListener;
        this.f8653d = dVar;
    }

    @Override // p416x5.AbstractC13937d
    /* renamed from: a */
    public void mo2236a(ProducerContext producerContext) {
        RequestListener requestListener = this.f8652c;
        if (requestListener != null) {
            requestListener.onRequestStart(producerContext.mo31159l(), producerContext.mo31170a(), producerContext.getId(), producerContext.mo31157n());
        }
        AbstractC13937d dVar = this.f8653d;
        if (dVar != null) {
            dVar.mo2236a(producerContext);
        }
    }

    @Override // p416x5.AbstractC13937d
    /* renamed from: e */
    public void mo2235e(ProducerContext producerContext) {
        RequestListener requestListener = this.f8652c;
        if (requestListener != null) {
            requestListener.onRequestSuccess(producerContext.mo31159l(), producerContext.getId(), producerContext.mo31157n());
        }
        AbstractC13937d dVar = this.f8653d;
        if (dVar != null) {
            dVar.mo2235e(producerContext);
        }
    }

    @Override // p416x5.AbstractC13937d
    /* renamed from: g */
    public void mo2234g(ProducerContext producerContext) {
        RequestListener requestListener = this.f8652c;
        if (requestListener != null) {
            requestListener.onRequestCancellation(producerContext.getId());
        }
        AbstractC13937d dVar = this.f8653d;
        if (dVar != null) {
            dVar.mo2234g(producerContext);
        }
    }

    @Override // p416x5.AbstractC13937d
    /* renamed from: i */
    public void mo2233i(ProducerContext producerContext, Throwable th2) {
        RequestListener requestListener = this.f8652c;
        if (requestListener != null) {
            requestListener.onRequestFailure(producerContext.mo31159l(), producerContext.getId(), th2, producerContext.mo31157n());
        }
        AbstractC13937d dVar = this.f8653d;
        if (dVar != null) {
            dVar.mo2233i(producerContext, th2);
        }
    }
}
