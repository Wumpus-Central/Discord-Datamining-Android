package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "(Ljava/lang/String;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageContext", "()Lcom/discord/chat/presentation/root/MessageContext;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;)Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class FlaggedMessageEmbedAccessory extends MessageAccessory {
    private final Message message;
    private final MessageContext messageContext;
    private final String messageId;

    private FlaggedMessageEmbedAccessory(String str, Message message, MessageContext messageContext) {
        super(str, "flagged-message-embed", null);
        this.messageId = str;
        this.message = message;
        this.messageContext = messageContext;
    }

    public  FlaggedMessageEmbedAccessory(String str, Message message, MessageContext messageContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, message, messageContext);
    }

    
    public static  FlaggedMessageEmbedAccessory m259copyu7_MRrM$default(FlaggedMessageEmbedAccessory flaggedMessageEmbedAccessory, String str, Message message, MessageContext messageContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = flaggedMessageEmbedAccessory.mo232getMessageId3Eiw7ao();
        }
        if ((i10 & 2) != 0) {
            message = flaggedMessageEmbedAccessory.message;
        }
        if ((i10 & 4) != 0) {
            messageContext = flaggedMessageEmbedAccessory.messageContext;
        }
        return flaggedMessageEmbedAccessory.m261copyu7_MRrM(str, message, messageContext);
    }

    
    public final String m260component13Eiw7ao() {
        return mo232getMessageId3Eiw7ao();
    }

    public final Message component2() {
        return this.message;
    }

    public final MessageContext component3() {
        return this.messageContext;
    }

    
    public final FlaggedMessageEmbedAccessory m261copyu7_MRrM(String messageId, Message message, MessageContext messageContext) {
        q.h(messageId, "messageId");
        q.h(message, "message");
        q.h(messageContext, "messageContext");
        return new FlaggedMessageEmbedAccessory(messageId, message, messageContext, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlaggedMessageEmbedAccessory)) {
            return false;
        }
        FlaggedMessageEmbedAccessory flaggedMessageEmbedAccessory = (FlaggedMessageEmbedAccessory) obj;
        return MessageId.m621equalsimpl0(mo232getMessageId3Eiw7ao(), flaggedMessageEmbedAccessory.mo232getMessageId3Eiw7ao()) && q.c(this.message, flaggedMessageEmbedAccessory.message) && q.c(this.messageContext, flaggedMessageEmbedAccessory.messageContext);
    }

    public final Message getMessage() {
        return this.message;
    }

    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    @Override 
    
    public String mo232getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((MessageId.m622hashCodeimpl(mo232getMessageId3Eiw7ao()) * 31) + this.message.hashCode()) * 31) + this.messageContext.hashCode();
    }

    public String toString() {
        String str = MessageId.m623toStringimpl(mo232getMessageId3Eiw7ao());
        Message message = this.message;
        MessageContext messageContext = this.messageContext;
        return "FlaggedMessageEmbedAccessory(messageId=" + str + ", message=" + message + ", messageContext=" + messageContext + ")";
    }
}
