package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import p380v5.AbstractC13432c;
import p380v5.C13433d;
import p394w3.C13740j;

/* renamed from: com.facebook.imagepipeline.producers.i */
/* loaded from: classes7.dex */
public class C4980i implements AbstractC5001l0<CloseableReference<AbstractC13432c>> {

    /* renamed from: a */
    private final AbstractC5001l0<CloseableReference<AbstractC13432c>> f8457a;

    /* renamed from: b */
    private final int f8458b;

    /* renamed from: c */
    private final int f8459c;

    /* renamed from: d */
    private final boolean f8460d;

    /* renamed from: com.facebook.imagepipeline.producers.i$a */
    /* loaded from: classes7.dex */
    private static class C4981a extends AbstractC5012o<CloseableReference<AbstractC13432c>, CloseableReference<AbstractC13432c>> {

        /* renamed from: c */
        private final int f8461c;

        /* renamed from: d */
        private final int f8462d;

        C4981a(Consumer<CloseableReference<AbstractC13432c>> consumer, int i, int i2) {
            super(consumer);
            this.f8461c = i;
            this.f8462d = i2;
        }

        /* renamed from: p */
        private void m31082p(CloseableReference<AbstractC13432c> closeableReference) {
            AbstractC13432c C;
            Bitmap n;
            int rowBytes;
            if (closeableReference != null && closeableReference.m32037Q() && (C = closeableReference.m32039C()) != null && !C.isClosed() && (C instanceof C13433d) && (n = ((C13433d) C).mo3732n()) != null && (rowBytes = n.getRowBytes() * n.getHeight()) >= this.f8461c && rowBytes <= this.f8462d) {
                n.prepareToDraw();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: q */
        public void mo30912h(CloseableReference<AbstractC13432c> closeableReference, int i) {
            m31082p(closeableReference);
            m31000o().mo31199b(closeableReference, i);
        }
    }

    public C4980i(AbstractC5001l0<CloseableReference<AbstractC13432c>> l0Var, int i, int i2, boolean z) {
        boolean z2;
        if (i <= i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13740j.m2839b(Boolean.valueOf(z2));
        this.f8457a = (AbstractC5001l0) C13740j.m2834g(l0Var);
        this.f8458b = i;
        this.f8459c = i2;
        this.f8460d = z;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext) {
        if (!producerContext.mo31157n() || this.f8460d) {
            this.f8457a.mo30917b(new C4981a(consumer, this.f8458b, this.f8459c), producerContext);
        } else {
            this.f8457a.mo30917b(consumer, producerContext);
        }
    }
}
