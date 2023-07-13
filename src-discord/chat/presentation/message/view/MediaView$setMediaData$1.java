package com.discord.chat.presentation.message.view;

import com.discord.chat.databinding.MediaViewBinding;
import com.discord.chat.presentation.message.utils.SetMediaImagePlaceholderStatesKt;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MediaView$setMediaData$1 extends s implements Function1<PipelineDraweeControllerBuilder, Unit> {
    final  MediaView this$0;

    
    
    public MediaView$setMediaData$1(MediaView mediaView) {
        super(1);
        this.this$0 = mediaView;
    }

    @Override 
    public   Unit invoke(PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder) {
        invoke2(pipelineDraweeControllerBuilder);
        return Unit.f20663a;
    }

    
    public final void invoke2(PipelineDraweeControllerBuilder setOptionalImageUrl) {
        MediaViewBinding mediaViewBinding;
        q.g(setOptionalImageUrl, "$this$setOptionalImageUrl");
        mediaViewBinding = this.this$0.binding;
        SimpleDraweeView simpleDraweeView = mediaViewBinding.inlineMediaImagePreview;
        q.f(simpleDraweeView, "binding.inlineMediaImagePreview");
        SetMediaImagePlaceholderStatesKt.setMediaImagePlaceholderStates(setOptionalImageUrl, simpleDraweeView);
    }
}
