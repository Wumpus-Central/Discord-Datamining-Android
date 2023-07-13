package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.UploadProgress;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class UploadProgressViewHolder$bind$1 extends s implements Function0<Unit> {
    final  ChatEventHandler $eventHandler;
    final  UploadProgress $uploadProgress;

    
    
    public UploadProgressViewHolder$bind$1(ChatEventHandler chatEventHandler, UploadProgress uploadProgress) {
        super(0);
        this.$eventHandler = chatEventHandler;
        this.$uploadProgress = uploadProgress;
    }

    @Override 
    
    public final void invoke2() {
        this.$eventHandler.onTapUploadProgressClose(this.$uploadProgress.getFileId());
    }
}
