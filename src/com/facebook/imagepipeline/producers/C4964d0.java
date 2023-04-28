package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.util.concurrent.Executor;
import p380v5.C13434e;
import p455z3.AbstractC14537h;

/* renamed from: com.facebook.imagepipeline.producers.d0 */
/* loaded from: classes7.dex */
public class C4964d0 extends AbstractC4960c0 {
    public C4964d0(Executor executor, AbstractC14537h hVar) {
        super(executor, hVar);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: d */
    protected C13434e mo30910d(ImageRequest imageRequest) {
        return m31173e(new FileInputStream(imageRequest.getSourceFile().toString()), (int) imageRequest.getSourceFile().length());
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: f */
    protected String mo30909f() {
        return "LocalFileFetchProducer";
    }
}
