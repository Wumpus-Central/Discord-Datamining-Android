package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.view.ImageAttachmentView;
import com.discord.chat.presentation.message.view.UploadContext;
import com.discord.primitives.MessageId;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u00ad\u0001\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001b0\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ImageAttachmentViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachment", "", "maxWidthPx", "maxHeightPx", "radiusPx", "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", ViewProps.RESIZE_MODE, "Landroid/view/View$OnClickListener;", "onClicked", "Landroid/view/View$OnLongClickListener;", "onLongClicked", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "", "useNewAltTextButton", "", "attachmentsOpacity", "showRemixButton", "isPartOfMosaic", "remixButtonIconColor", "remixButtonBackgroundColor", "Lcom/discord/primitives/MessageId;", "messageId", "Lkotlin/Function1;", "", "onTapRemix", "bind-Nlw0kPk", "(Lcom/discord/chat/bridge/attachment/Attachment;IIILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;ZLjava/lang/Float;ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "bind", "Lcom/discord/chat/presentation/message/view/ImageAttachmentView;", "view", "Lcom/discord/chat/presentation/message/view/ImageAttachmentView;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "<init>", "(Lcom/discord/chat/presentation/message/view/ImageAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class ImageAttachmentViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final ImageAttachmentView view;

    
    public ImageAttachmentViewHolder(ImageAttachmentView view, ChatEventHandler eventHandler) {
        super(view, null);
        q.h(view, "view");
        q.h(eventHandler, "eventHandler");
        this.view = view;
        this.eventHandler = eventHandler;
    }

    
    public final void m359bindNlw0kPk(Attachment attachment, int i10, int i11, int i12, MediaContainingViewResizer.ResizeMode resizeMode, View.OnClickListener onClicked, View.OnLongClickListener onLongClickListener, SpoilerConfig spoilerConfig, boolean z10, Float f10, boolean z11, boolean z12, Integer num, Integer num2, String str, Function1<? super MessageId, Unit> onTapRemix) {
        q.h(attachment, "attachment");
        q.h(resizeMode, "resizeMode");
        q.h(onClicked, "onClicked");
        q.h(onTapRemix, "onTapRemix");
        String uploaderId = attachment.getUploaderId();
        String uploaderItemId = attachment.getUploaderItemId();
        this.view.setContent(attachment.getUrl(), attachment.getWidth(), attachment.getHeight(), i11, i10, resizeMode, attachment.isSpoiler(), spoilerConfig, i12, attachment.getProgress(), new ImageAttachmentViewHolder$bind$onCancelUpload$1(uploaderId, uploaderItemId, this), new UploadContext(uploaderId, uploaderItemId), f10, attachment.getObscure(), z12 ? null : attachment.getObscureDescription());
        boolean z13 = false;
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.view, false, onClicked, 1, null);
        if (onLongClickListener != null) {
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this.view, false, onLongClickListener, 1, null);
        }
        this.view.setDescription(attachment.getDescription(), attachment.getHint());
        this.view.showAltTextButton(z10 && attachment.getShowDescription(), attachment.getDescription(), new ImageAttachmentViewHolder$bind$2(this.eventHandler));
        ImageAttachmentView imageAttachmentView = this.view;
        if (!z10 && attachment.getShowDescription()) {
            z13 = true;
        }
        imageAttachmentView.showDescription(z13, attachment.getDescription());
        this.view.m331maybeShowRemixButtoncUe2JkQ(z11, attachment.isSpoiler(), num, num2, str, onTapRemix);
        this.view.updateMarginStart(z11, attachment.isSpoiler(), z12);
        this.view.setRole(attachment.getRole());
    }
}
