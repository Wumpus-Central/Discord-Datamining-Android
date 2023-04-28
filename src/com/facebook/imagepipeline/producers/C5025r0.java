package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import p314r5.AbstractC12393g;

/* renamed from: com.facebook.imagepipeline.producers.r0 */
/* loaded from: classes7.dex */
public class C5025r0 extends C4963d {
    public C5025r0(ImageRequest imageRequest, ProducerContext producerContext) {
        this(imageRequest, producerContext.getId(), producerContext.mo31165f(), producerContext.mo31163h(), producerContext.mo31170a(), producerContext.mo31155p(), producerContext.mo31157n(), producerContext.mo31162i(), producerContext.mo31161j(), producerContext.mo31167d());
    }

    public C5025r0(ImageRequest imageRequest, String str, AbstractC5011n0 n0Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, AbstractC12393g gVar) {
        super(imageRequest, str, n0Var, obj, requestLevel, z, z2, priority, gVar);
    }

    public C5025r0(ImageRequest imageRequest, String str, String str2, AbstractC5011n0 n0Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, AbstractC12393g gVar) {
        super(imageRequest, str, str2, n0Var, obj, requestLevel, z, z2, priority, gVar);
    }
}
