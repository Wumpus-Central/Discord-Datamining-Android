package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/list/item/AutomodSystemMessageItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "allowChildGestures", "", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Z)V", "getAllowChildGestures", "()Z", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageContext", "()Lcom/discord/chat/presentation/root/MessageContext;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AutomodSystemMessageItem extends ChatListItem {
    private final boolean allowChildGestures;
    private final Message message;
    private final MessageContext messageContext;

    
    
    public  AutomodSystemMessageItem(com.discord.chat.bridge.Message r16, com.discord.chat.presentation.root.MessageContext r17, boolean r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.item.AutomodSystemMessageItem.<init>(com.discord.chat.bridge.Message, com.discord.chat.presentation.root.MessageContext, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static  AutomodSystemMessageItem copy$default(AutomodSystemMessageItem automodSystemMessageItem, Message message, MessageContext messageContext, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            message = automodSystemMessageItem.message;
        }
        if ((i10 & 2) != 0) {
            messageContext = automodSystemMessageItem.messageContext;
        }
        if ((i10 & 4) != 0) {
            z10 = automodSystemMessageItem.allowChildGestures;
        }
        return automodSystemMessageItem.copy(message, messageContext, z10);
    }

    public final Message component1() {
        return this.message;
    }

    public final MessageContext component2() {
        return this.messageContext;
    }

    public final boolean component3() {
        return this.allowChildGestures;
    }

    public final AutomodSystemMessageItem copy(Message message, MessageContext messageContext, boolean z10) {
        q.g(message, "message");
        q.g(messageContext, "messageContext");
        return new AutomodSystemMessageItem(message, messageContext, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutomodSystemMessageItem)) {
            return false;
        }
        AutomodSystemMessageItem automodSystemMessageItem = (AutomodSystemMessageItem) obj;
        return q.b(this.message, automodSystemMessageItem.message) && q.b(this.messageContext, automodSystemMessageItem.messageContext) && this.allowChildGestures == automodSystemMessageItem.allowChildGestures;
    }

    public final boolean getAllowChildGestures() {
        return this.allowChildGestures;
    }

    public final Message getMessage() {
        return this.message;
    }

    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    public int hashCode() {
        int hashCode = ((this.message.hashCode() * 31) + this.messageContext.hashCode()) * 31;
        boolean z10 = this.allowChildGestures;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return hashCode + i10;
    }

    public String toString() {
        Message message = this.message;
        MessageContext messageContext = this.messageContext;
        boolean z10 = this.allowChildGestures;
        return "AutomodSystemMessageItem(message=" + message + ", messageContext=" + messageContext + ", allowChildGestures=" + z10 + ")";
    }

    
    public AutomodSystemMessageItem(Message message, MessageContext messageContext, boolean z10) {
        super(MessageId.m597toStringimpl(message.m16getId3Eiw7ao()), null);
        q.g(message, "message");
        q.g(messageContext, "messageContext");
        this.message = message;
        this.messageContext = messageContext;
        this.allowChildGestures = z10;
        if (!MessageKt.isAutomodSystemMessage(message)) {
            throw new IllegalArgumentException("Only automod system messages are allowed".toString());
        }
    }
}
