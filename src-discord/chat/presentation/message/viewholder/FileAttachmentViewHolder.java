package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.FileAttachmentView;
import com.discord.chat.presentation.message.view.UploadContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;", "fileAttachmentItem", "Lkotlin/Function2;", "", "", "onClick", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "", "attachmentsOpacity", "bind", "(Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;Lkotlin/jvm/functions/Function2;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;Ljava/lang/Float;)V", "Lcom/discord/chat/presentation/message/view/FileAttachmentView;", "view", "Lcom/discord/chat/presentation/message/view/FileAttachmentView;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "<init>", "(Lcom/discord/chat/presentation/message/view/FileAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class FileAttachmentViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final FileAttachmentView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAttachmentViewHolder(FileAttachmentView view, ChatEventHandler eventHandler) {
        super(view, null);
        q.g(view, "view");
        q.g(eventHandler, "eventHandler");
        this.view = view;
        this.eventHandler = eventHandler;
    }

    public final void bind(FileAttachmentMessageAccessory fileAttachmentItem, Function2<? super String, ? super String, Unit> onClick, SpoilerConfig spoilerConfig, Float f10) {
        q.g(fileAttachmentItem, "fileAttachmentItem");
        q.g(onClick, "onClick");
        Attachment attachment = fileAttachmentItem.getAttachment();
        String uploaderId = attachment.getUploaderId();
        String uploaderItemId = attachment.getUploaderItemId();
        this.view.setContent(attachment.getFilename(), attachment.getSize(), attachment.getUrl(), onClick, attachment.isSpoiler(), spoilerConfig, attachment.getProgress(), new FileAttachmentViewHolder$bind$onCancelUpload$1(uploaderId, uploaderItemId, this), new UploadContext(uploaderId, uploaderItemId), f10);
    }
}
