package com.discord.chat.presentation.list.item;

import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/list/item/MessageBundleMessageItem;", "Lcom/discord/chat/presentation/list/item/MessageBundleItem;", "messageItem", "Lcom/discord/chat/presentation/list/item/MessageItem;", "(Lcom/discord/chat/presentation/list/item/MessageItem;)V", "getMessageItem", "()Lcom/discord/chat/presentation/list/item/MessageItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageBundleMessageItem extends MessageBundleItem {
    private final MessageItem messageItem;

    
    public MessageBundleMessageItem(MessageItem messageItem) {
        super(MessageId.m642toStringimpl(messageItem.getMessage().m24getId3Eiw7ao()), null);
        q.h(messageItem, "messageItem");
        this.messageItem = messageItem;
    }

    public static  MessageBundleMessageItem copy$default(MessageBundleMessageItem messageBundleMessageItem, MessageItem messageItem, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            messageItem = messageBundleMessageItem.messageItem;
        }
        return messageBundleMessageItem.copy(messageItem);
    }

    public final MessageItem component1() {
        return this.messageItem;
    }

    public final MessageBundleMessageItem copy(MessageItem messageItem) {
        q.h(messageItem, "messageItem");
        return new MessageBundleMessageItem(messageItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessageBundleMessageItem) && q.c(this.messageItem, ((MessageBundleMessageItem) obj).messageItem);
    }

    public final MessageItem getMessageItem() {
        return this.messageItem;
    }

    public int hashCode() {
        return this.messageItem.hashCode();
    }

    public String toString() {
        MessageItem messageItem = this.messageItem;
        return "MessageBundleMessageItem(messageItem=" + messageItem + ")";
    }
}
