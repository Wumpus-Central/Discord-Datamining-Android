package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.reactevents.ViewResizeMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "index", "", "attachment", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "attachmentViewHolder", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MessageAccessoriesAdapter$onBindViewHolder$22 extends s implements Function3<Integer, MessageAccessory, MessagePartViewHolder, Unit> {
    final /* synthetic */ MessageAccessoriesAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAccessoriesAdapter$onBindViewHolder$22(MessageAccessoriesAdapter messageAccessoriesAdapter) {
        super(3);
        this.this$0 = messageAccessoriesAdapter;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, MessageAccessory messageAccessory, MessagePartViewHolder messagePartViewHolder) {
        invoke(num.intValue(), messageAccessory, messagePartViewHolder);
        return Unit.f22042a;
    }

    public final void invoke(int i10, MessageAccessory attachment, MessagePartViewHolder attachmentViewHolder) {
        Double valueOf;
        q.g(attachment, "attachment");
        q.g(attachmentViewHolder, "attachmentViewHolder");
        String str = attachment.mo202getMessageId3Eiw7ao();
        if (attachment instanceof ImageAttachmentMessageAccessory) {
            valueOf = null;
        } else if (attachment instanceof VideoAttachmentMessageAccessory) {
            valueOf = Double.valueOf(((VideoAttachmentMessageAccessory) attachment).getPortal());
        } else {
            throw new IllegalStateException(("Unsupported accessory: " + attachment).toString());
        }
        this.this$0.m184onMediaClickedl3ndGo(attachmentViewHolder, str, i10, "attachment", valueOf, null, ViewResizeMode.Cover);
    }
}
