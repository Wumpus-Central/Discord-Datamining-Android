package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;
import p380v5.C13434e;
import p394w3.C13740j;

/* renamed from: com.facebook.imagepipeline.producers.y0 */
/* loaded from: classes7.dex */
public class C5056y0 implements AbstractC5001l0<C13434e> {

    /* renamed from: a */
    private final AbstractC5059z0<C13434e>[] f8681a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.imagepipeline.producers.y0$a */
    /* loaded from: classes7.dex */
    public class C5057a extends AbstractC5012o<C13434e, C13434e> {

        /* renamed from: c */
        private final ProducerContext f8682c;

        /* renamed from: d */
        private final int f8683d;

        /* renamed from: e */
        private final ResizeOptions f8684e;

        public C5057a(Consumer<C13434e> consumer, ProducerContext producerContext, int i) {
            super(consumer);
            this.f8682c = producerContext;
            this.f8683d = i;
            this.f8684e = producerContext.mo31159l().getResizeOptions();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5012o, com.facebook.imagepipeline.producers.AbstractC4954b
        /* renamed from: g */
        protected void mo30913g(Throwable th2) {
            if (!C5056y0.this.m30914e(this.f8683d + 1, m31000o(), this.f8682c)) {
                m31000o().onFailure(th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: p */
        public void mo30912h(C13434e eVar, int i) {
            if (eVar != null && (AbstractC4954b.m31196e(i) || C4953a1.m31201c(eVar, this.f8684e))) {
                m31000o().mo31199b(eVar, i);
            } else if (AbstractC4954b.m31197d(i)) {
                C13434e.m3706h(eVar);
                if (!C5056y0.this.m30914e(this.f8683d + 1, m31000o(), this.f8682c)) {
                    m31000o().mo31199b(null, 1);
                }
            }
        }
    }

    public C5056y0(AbstractC5059z0<C13434e>... z0VarArr) {
        AbstractC5059z0<C13434e>[] z0VarArr2 = (AbstractC5059z0[]) C13740j.m2834g(z0VarArr);
        this.f8681a = z0VarArr2;
        C13740j.m2836e(0, z0VarArr2.length);
    }

    /* renamed from: d */
    private int m30915d(int i, ResizeOptions resizeOptions) {
        while (true) {
            AbstractC5059z0<C13434e>[] z0VarArr = this.f8681a;
            if (i >= z0VarArr.length) {
                return -1;
            }
            if (z0VarArr[i].mo30906a(resizeOptions)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m30914e(int i, Consumer<C13434e> consumer, ProducerContext producerContext) {
        int d = m30915d(i, producerContext.mo31159l().getResizeOptions());
        if (d == -1) {
            return false;
        }
        this.f8681a[d].mo30917b(new C5057a(consumer, producerContext, d), producerContext);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        if (producerContext.mo31159l().getResizeOptions() == null) {
            consumer.mo31199b(null, 1);
        } else if (!m30914e(0, consumer, producerContext)) {
            consumer.mo31199b(null, 1);
        }
    }
}
