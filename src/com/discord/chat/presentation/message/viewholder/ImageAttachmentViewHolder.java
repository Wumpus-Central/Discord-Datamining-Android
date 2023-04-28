package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.view.ImageAttachmentView;
import com.discord.chat.presentation.message.view.UploadContext;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006Ja\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/chat/presentation/message/viewholder/ImageAttachmentViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "view", "Lcom/discord/chat/presentation/message/view/ImageAttachmentView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/ImageAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "bind", "", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "maxWidthPx", "", "maxHeightPx", "radiusPx", ViewProps.RESIZE_MODE, "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "onClicked", "Landroid/view/View$OnClickListener;", "onLongClicked", "Landroid/view/View$OnLongClickListener;", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "useNewAltTextButton", "", "attachmentsOpacity", "", "(Lcom/discord/chat/bridge/attachment/Attachment;IIILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;ZLjava/lang/Float;)V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ImageAttachmentViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final ImageAttachmentView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAttachmentViewHolder(ImageAttachmentView view, ChatEventHandler eventHandler) {
        super(view, null);
        C9971q.m14633g(view, "view");
        C9971q.m14633g(eventHandler, "eventHandler");
        this.view = view;
        this.eventHandler = eventHandler;
    }

    public final void bind(Attachment attachment, int i, int i2, int i3, MediaContainingViewResizer.ResizeMode resizeMode, View.OnClickListener onClicked, View.OnLongClickListener onLongClickListener, SpoilerConfig spoilerConfig, boolean z, Float f) {
        boolean z2;
        C9971q.m14633g(attachment, "attachment");
        C9971q.m14633g(resizeMode, "resizeMode");
        C9971q.m14633g(onClicked, "onClicked");
        String uploaderId = attachment.getUploaderId();
        String uploaderItemId = attachment.getUploaderItemId();
        this.view.setContent(attachment.getUrl(), attachment.getWidth(), attachment.getHeight(), i2, i, resizeMode, attachment.isSpoiler(), spoilerConfig, i3, attachment.getProgress(), new ImageAttachmentViewHolder$bind$onCancelUpload$1(uploaderId, uploaderItemId, this), new UploadContext(uploaderId, uploaderItemId), f);
        boolean z3 = false;
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.view, false, onClicked, 1, null);
        if (onLongClickListener != null) {
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this.view, false, onLongClickListener, 1, null);
        }
        this.view.setDescription(attachment.getDescription(), attachment.getHint());
        ImageAttachmentView imageAttachmentView = this.view;
        if (!z || !attachment.getShowDescription()) {
            z2 = false;
        } else {
            z2 = true;
        }
        imageAttachmentView.showAltTextButton(z2, attachment.getDescription(), new ImageAttachmentViewHolder$bind$1(this.eventHandler));
        ImageAttachmentView imageAttachmentView2 = this.view;
        if (!z && attachment.getShowDescription()) {
            z3 = true;
        }
        imageAttachmentView2.showDescription(z3, attachment.getDescription());
        this.view.setRole(attachment.getRole());
    }
}
