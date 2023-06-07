package com.discord.chat.presentation.message.view.botuikit.components;

import com.discord.image.fresco.postprocessors.PostProcessor;
import com.facebook.imagepipeline.request.BasePostprocessor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SelectComponentView$postProcessor$2 extends s implements Function0<BasePostprocessor> {
    public static final SelectComponentView$postProcessor$2 INSTANCE = new SelectComponentView$postProcessor$2();

    SelectComponentView$postProcessor$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BasePostprocessor invoke() {
        return PostProcessor.Circle.INSTANCE.create();
    }
}
