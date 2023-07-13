package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class FileAttachmentViewHolder$bind$onCancelUpload$1 extends s implements Function0<Unit> {
    final  String $uploadItemId;
    final  String $uploaderId;
    final  FileAttachmentViewHolder this$0;

    
    
    public FileAttachmentViewHolder$bind$onCancelUpload$1(String str, String str2, FileAttachmentViewHolder fileAttachmentViewHolder) {
        super(0);
        this.$uploaderId = str;
        this.$uploadItemId = str2;
        this.this$0 = fileAttachmentViewHolder;
    }

    @Override 
    
    public final void invoke2() {
        ChatEventHandler chatEventHandler;
        if (this.$uploaderId != null && this.$uploadItemId != null) {
            chatEventHandler = this.this$0.eventHandler;
            chatEventHandler.onTapCancelUploadItem(this.$uploaderId, this.$uploadItemId);
        }
    }
}
