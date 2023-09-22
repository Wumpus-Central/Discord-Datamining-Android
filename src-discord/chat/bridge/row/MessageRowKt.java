package com.discord.chat.bridge.row;

import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.bridge.ErrorMessage;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageBase;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.MessageFrameType;
import com.discord.chat.presentation.list.item.AutomodSystemMessageItem;
import com.discord.chat.presentation.list.item.CallSystemMessageItem;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.DeserializationErrorMessageItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.list.item.SystemMessageItem;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.root.MessageContextKt;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aY\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000f\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0010¨\u0006\u0011"}, d2 = {"toChatListMessageItem", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "Lcom/discord/chat/bridge/MessageBase;", "messageFrame", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "allowChildGestures", "", "isHighlight", "renderContentOnly", "reactTag", "", "backgroundHighlight", "Lcom/discord/chat/bridge/BackgroundHighlight;", "(Lcom/discord/chat/bridge/MessageBase;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZZLjava/lang/Integer;Lcom/discord/chat/bridge/BackgroundHighlight;)Lcom/discord/chat/presentation/list/item/ChatListItem;", "Lcom/discord/chat/bridge/row/MessageRow;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class MessageRowKt {
    public static final ChatListItem toChatListMessageItem(MessageRow messageRow) {
        q.h(messageRow, "<this>");
        MessageBase message = messageRow.getMessage();
        MessageFrame messageFrame = messageRow.getMessageFrame();
        MessageFrame messageFrame2 = messageRow.getMessageFrame();
        return toChatListMessageItem(message, messageFrame, MessageContextKt.getMessageContext(messageRow), (messageFrame2 != null ? messageFrame2.getType() : null) != MessageFrameType.JUMP_MESSAGE_FRAME, messageRow.isHighlight(), messageRow.getRenderContentOnly(), messageRow.getReactTag(), messageRow.getBackgroundHighlight());
    }

    public static final ChatListItem toChatListMessageItem(MessageBase messageBase, MessageFrame messageFrame, MessageContext messageContext, boolean z10, boolean z11, boolean z12, Integer num, BackgroundHighlight backgroundHighlight) {
        q.h(messageBase, "<this>");
        q.h(messageContext, "messageContext");
        if (messageBase instanceof Message) {
            Message message = (Message) messageBase;
            return MessageKt.isSystemMessage(message) ? MessageKt.isCallMessage(message) ? new CallSystemMessageItem(message) : new SystemMessageItem(message, messageContext, backgroundHighlight) : MessageKt.isAutomodSystemMessage(message) ? new AutomodSystemMessageItem(message, messageContext, z10) : new MessageItem(message, messageFrame, messageContext, z10, z11, backgroundHighlight, num, z12);
        } else if (messageBase instanceof ErrorMessage) {
            return new DeserializationErrorMessageItem((ErrorMessage) messageBase);
        } else {
            throw new pf.q();
        }
    }
}
