package com.discord.chat.presentation.message.view;

import com.discord.chat.databinding.VideoAttachmentViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class VideoAttachmentView$setContent$2 extends s implements Function0<Unit> {
    final  Boolean $isObscure;
    final  VideoAttachmentView this$0;

    
    
    public VideoAttachmentView$setContent$2(Boolean bool, VideoAttachmentView videoAttachmentView) {
        super(0);
        this.$isObscure = bool;
        this.this$0 = videoAttachmentView;
    }

    @Override 
    
    public final void invoke2() {
        VideoAttachmentViewBinding videoAttachmentViewBinding;
        if (q.c(this.$isObscure, Boolean.TRUE)) {
            videoAttachmentViewBinding = this.this$0.binding;
            videoAttachmentViewBinding.obscureOverlay.makeHideButtonHidden();
        }
    }
}
