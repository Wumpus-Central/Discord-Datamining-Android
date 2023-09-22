package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.presentation.root.MessageContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/list/item/SystemMessageItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "backgroundHighlight", "Lcom/discord/chat/bridge/BackgroundHighlight;", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/BackgroundHighlight;)V", "getBackgroundHighlight", "()Lcom/discord/chat/bridge/BackgroundHighlight;", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageContext", "()Lcom/discord/chat/presentation/root/MessageContext;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SystemMessageItem extends ChatListItem {
    private final BackgroundHighlight backgroundHighlight;
    private final Message message;
    private final MessageContext messageContext;

    public  SystemMessageItem(Message message, MessageContext messageContext, BackgroundHighlight backgroundHighlight, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(message, messageContext, (i10 & 4) != 0 ? null : backgroundHighlight);
    }

    public static  SystemMessageItem copy$default(SystemMessageItem systemMessageItem, Message message, MessageContext messageContext, BackgroundHighlight backgroundHighlight, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            message = systemMessageItem.message;
        }
        if ((i10 & 2) != 0) {
            messageContext = systemMessageItem.messageContext;
        }
        if ((i10 & 4) != 0) {
            backgroundHighlight = systemMessageItem.backgroundHighlight;
        }
        return systemMessageItem.copy(message, messageContext, backgroundHighlight);
    }

    public final Message component1() {
        return this.message;
    }

    public final MessageContext component2() {
        return this.messageContext;
    }

    public final BackgroundHighlight component3() {
        return this.backgroundHighlight;
    }

    public final SystemMessageItem copy(Message message, MessageContext messageContext, BackgroundHighlight backgroundHighlight) {
        q.h(message, "message");
        q.h(messageContext, "messageContext");
        return new SystemMessageItem(message, messageContext, backgroundHighlight);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemMessageItem)) {
            return false;
        }
        SystemMessageItem systemMessageItem = (SystemMessageItem) obj;
        return q.c(this.message, systemMessageItem.message) && q.c(this.messageContext, systemMessageItem.messageContext) && q.c(this.backgroundHighlight, systemMessageItem.backgroundHighlight);
    }

    public final BackgroundHighlight getBackgroundHighlight() {
        return this.backgroundHighlight;
    }

    public final Message getMessage() {
        return this.message;
    }

    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    public int hashCode() {
        int hashCode = ((this.message.hashCode() * 31) + this.messageContext.hashCode()) * 31;
        BackgroundHighlight backgroundHighlight = this.backgroundHighlight;
        return hashCode + (backgroundHighlight == null ? 0 : backgroundHighlight.hashCode());
    }

    public String toString() {
        Message message = this.message;
        MessageContext messageContext = this.messageContext;
        BackgroundHighlight backgroundHighlight = this.backgroundHighlight;
        return "SystemMessageItem(message=" + message + ", messageContext=" + messageContext + ", backgroundHighlight=" + backgroundHighlight + ")";
    }

    
    public SystemMessageItem(Message message, MessageContext messageContext, BackgroundHighlight backgroundHighlight) {
        super(message.m24getId3Eiw7ao(), null);
        q.h(message, "message");
        q.h(messageContext, "messageContext");
        this.message = message;
        this.messageContext = messageContext;
        this.backgroundHighlight = backgroundHighlight;
        if (!MessageKt.isSystemMessage(message)) {
            throw new IllegalArgumentException("Only system messages are allowed".toString());
        }
    }
}
