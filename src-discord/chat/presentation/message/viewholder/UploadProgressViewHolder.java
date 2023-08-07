package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.UploadProgress;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.uploadprogress.UploadProgressView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/UploadProgressViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "uploadProgressView", "Lcom/discord/chat/presentation/uploadprogress/UploadProgressView;", "(Lcom/discord/chat/presentation/uploadprogress/UploadProgressView;)V", "bind", "", "uploadProgress", "Lcom/discord/chat/bridge/UploadProgress;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class UploadProgressViewHolder extends MessagePartViewHolder {
    private final UploadProgressView uploadProgressView;

    
    public UploadProgressViewHolder(UploadProgressView uploadProgressView) {
        super(uploadProgressView, null);
        q.h(uploadProgressView, "uploadProgressView");
        this.uploadProgressView = uploadProgressView;
    }

    public final void bind(UploadProgress uploadProgress, ChatEventHandler eventHandler) {
        q.h(uploadProgress, "uploadProgress");
        q.h(eventHandler, "eventHandler");
        this.uploadProgressView.set(uploadProgress.getHeaderText(), uploadProgress.getHeaderColor(), uploadProgress.getBackgroundColor(), (int) (uploadProgress.getProgress() * 100), uploadProgress.getProgressStartColor(), uploadProgress.getProgressTrackColor(), uploadProgress.getIconTintColor(), new UploadProgressViewHolder$bind$1(eventHandler, uploadProgress));
    }
}
