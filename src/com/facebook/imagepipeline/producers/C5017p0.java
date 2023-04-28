package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p380v5.C13434e;
import p394w3.C13740j;
import p455z3.AbstractC14537h;

/* renamed from: com.facebook.imagepipeline.producers.p0 */
/* loaded from: classes7.dex */
public class C5017p0 extends AbstractC4960c0 {

    /* renamed from: c */
    private final ContentResolver f8573c;

    public C5017p0(Executor executor, AbstractC14537h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f8573c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: d */
    protected C13434e mo30910d(ImageRequest imageRequest) {
        InputStream openInputStream = this.f8573c.openInputStream(imageRequest.getSourceUri());
        C13740j.m2833h(openInputStream, "ContentResolver returned null InputStream");
        return m31173e(openInputStream, -1);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: f */
    protected String mo30909f() {
        return "QualifiedResourceFetchProducer";
    }
}
