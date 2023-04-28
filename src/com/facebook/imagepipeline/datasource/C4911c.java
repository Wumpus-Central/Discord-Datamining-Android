package com.facebook.imagepipeline.datasource;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.producers.AbstractC5001l0;
import com.facebook.imagepipeline.producers.C5025r0;
import com.facebook.imagepipeline.producers.ProducerContext;
import p007a6.C1271b;
import p416x5.AbstractC13937d;

/* renamed from: com.facebook.imagepipeline.datasource.c */
/* loaded from: classes7.dex */
public class C4911c<T> extends AbstractC4909a<CloseableReference<T>> {
    private C4911c(AbstractC5001l0<CloseableReference<T>> l0Var, C5025r0 r0Var, AbstractC13937d dVar) {
        super(l0Var, r0Var, dVar);
    }

    /* renamed from: I */
    public static <T> DataSource<CloseableReference<T>> m31329I(AbstractC5001l0<CloseableReference<T>> l0Var, C5025r0 r0Var, AbstractC13937d dVar) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("CloseableProducerToDataSourceAdapter#create");
        }
        C4911c cVar = new C4911c(l0Var, r0Var, dVar);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public void mo31325h(CloseableReference<T> closeableReference) {
        CloseableReference.m32025t(closeableReference);
    }

    /* renamed from: J */
    public CloseableReference<T> mo31326g() {
        return CloseableReference.m32027r((CloseableReference) super.mo31326g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public void mo31331F(CloseableReference<T> closeableReference, int i, ProducerContext producerContext) {
        super.mo31331F(CloseableReference.m32027r(closeableReference), i, producerContext);
    }
}
