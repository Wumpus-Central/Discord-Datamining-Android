package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.UploadContext;
import com.discord.chat.presentation.message.view.VideoAttachmentView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u007f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "view", "Lcom/discord/chat/presentation/message/view/VideoAttachmentView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/VideoAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "bind", "", "videoAttachmentItem", "Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;", "maxWidthPx", "", "maxHeightPx", "radiusPx", "onClicked", "Lkotlin/Function1;", "", "onLongClicked", "Landroid/view/View$OnLongClickListener;", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "portal", "canPlayInline", "", "useNewAltTextButton", "hideMediaPlayButton", "attachmentsOpacity", "", "(Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;IIILkotlin/jvm/functions/Function1;Landroid/view/View$OnLongClickListener;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;DZZZLjava/lang/Float;)V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class VideoAttachmentViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final VideoAttachmentView view;

    
    public VideoAttachmentViewHolder(VideoAttachmentView view, ChatEventHandler eventHandler) {
        super(view, null);
        q.g(view, "view");
        q.g(eventHandler, "eventHandler");
        this.view = view;
        this.eventHandler = eventHandler;
    }

    public final void bind(VideoAttachmentMessageAccessory videoAttachmentItem, int i10, int i11, int i12, Function1<? super Double, Unit> onClicked, View.OnLongClickListener onLongClickListener, SpoilerConfig spoilerConfig, double d10, boolean z10, boolean z11, boolean z12, Float f10) {
        q.g(videoAttachmentItem, "videoAttachmentItem");
        q.g(onClicked, "onClicked");
        Attachment attachment = videoAttachmentItem.getAttachment();
        String uploaderId = attachment.getUploaderId();
        String uploaderItemId = attachment.getUploaderItemId();
        VideoAttachmentViewHolder$bind$onCancelUpload$1 videoAttachmentViewHolder$bind$onCancelUpload$1 = new VideoAttachmentViewHolder$bind$onCancelUpload$1(uploaderId, uploaderItemId, this);
        VideoAttachmentView videoAttachmentView = this.view;
        String videoUrl = attachment.getVideoUrl();
        q.d(videoUrl);
        videoAttachmentView.setContent(videoUrl, attachment.getUrl(), attachment.getWidth(), attachment.getHeight(), i10, i11, i12, attachment.isSpoiler(), spoilerConfig, d10, z10, attachment.getProgress(), z12, videoAttachmentViewHolder$bind$onCancelUpload$1, new UploadContext(uploaderId, uploaderItemId), f10);
        this.view.setDescription(attachment.getDescription(), attachment.getHint());
        boolean z13 = true;
        this.view.showAltTextButton(z11 && attachment.getShowDescription(), attachment.getDescription(), new VideoAttachmentViewHolder$bind$1(this.eventHandler));
        VideoAttachmentView videoAttachmentView2 = this.view;
        if (z11 || !attachment.getShowDescription()) {
            z13 = false;
        }
        videoAttachmentView2.showDescription(z13, attachment.getDescription());
        this.view.setRole(attachment.getRole());
        this.view.setOnMediaClickListeners(onClicked, onLongClickListener);
    }
}
