package com.discord.image.fresco;

import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SetOptionalImageUrlKt$setOptionalImageUrl$1 extends s implements Function1<PipelineDraweeControllerBuilder, Unit> {
    public static final SetOptionalImageUrlKt$setOptionalImageUrl$1 INSTANCE = new SetOptionalImageUrlKt$setOptionalImageUrl$1();

    SetOptionalImageUrlKt$setOptionalImageUrl$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder) {
        invoke2(pipelineDraweeControllerBuilder);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder) {
        q.g(pipelineDraweeControllerBuilder, "$this$null");
    }
}