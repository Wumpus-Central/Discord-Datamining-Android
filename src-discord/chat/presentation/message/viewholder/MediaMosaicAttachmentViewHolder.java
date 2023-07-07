package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.view.MediaMosaicView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014JP\u0010\f\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/MediaMosaicAttachmentViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "attachments", "", "constrainedWidth", "Lkotlin/Function1;", "", "onAttachmentSpoilerClicked", "Lkotlin/Function3;", "onAttachmentClicked", "bind", "Lcom/discord/chat/presentation/message/view/MediaMosaicView;", "view", "Lcom/discord/chat/presentation/message/view/MediaMosaicView;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "<init>", "(Lcom/discord/chat/presentation/message/view/MediaMosaicView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MediaMosaicAttachmentViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final MediaMosaicView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaMosaicAttachmentViewHolder(MediaMosaicView view, ChatEventHandler eventHandler) {
        super(view, null);
        q.g(view, "view");
        q.g(eventHandler, "eventHandler");
        this.view = view;
        this.eventHandler = eventHandler;
    }

    public final void bind(List<? extends MessageAccessory> attachments, int i10, Function1<? super Integer, Unit> onAttachmentSpoilerClicked, Function3<? super Integer, ? super MessageAccessory, ? super MessagePartViewHolder, Unit> onAttachmentClicked) {
        q.g(attachments, "attachments");
        q.g(onAttachmentSpoilerClicked, "onAttachmentSpoilerClicked");
        q.g(onAttachmentClicked, "onAttachmentClicked");
        this.view.setAttachments(attachments, i10, this.eventHandler, onAttachmentSpoilerClicked, onAttachmentClicked);
    }
}
