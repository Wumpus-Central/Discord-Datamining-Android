package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m15073d2 = {"Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "(Ljava/lang/String;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageContext", "()Lcom/discord/chat/presentation/root/MessageContext;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;)Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
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

    public /* synthetic */ FlaggedMessageEmbedAccessory(String str, Message message, MessageContext messageContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, message, messageContext);
    }

    /* renamed from: copy-u7_MRrM$default  reason: not valid java name */
    public static /* synthetic */ FlaggedMessageEmbedAccessory m41792copyu7_MRrM$default(FlaggedMessageEmbedAccessory flaggedMessageEmbedAccessory, String str, Message message, MessageContext messageContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flaggedMessageEmbedAccessory.mo41765getMessageId3Eiw7ao();
        }
        if ((i & 2) != 0) {
            message = flaggedMessageEmbedAccessory.message;
        }
        if ((i & 4) != 0) {
            messageContext = flaggedMessageEmbedAccessory.messageContext;
        }
        return flaggedMessageEmbedAccessory.m41794copyu7_MRrM(str, message, messageContext);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41793component13Eiw7ao() {
        return mo41765getMessageId3Eiw7ao();
    }

    public final Message component2() {
        return this.message;
    }

    public final MessageContext component3() {
        return this.messageContext;
    }

    /* renamed from: copy-u7_MRrM  reason: not valid java name */
    public final FlaggedMessageEmbedAccessory m41794copyu7_MRrM(String messageId, Message message, MessageContext messageContext) {
        C9677q.m14633g(messageId, "messageId");
        C9677q.m14633g(message, "message");
        C9677q.m14633g(messageContext, "messageContext");
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
        return MessageId.m42119equalsimpl0(mo41765getMessageId3Eiw7ao(), flaggedMessageEmbedAccessory.mo41765getMessageId3Eiw7ao()) && C9677q.m14638b(this.message, flaggedMessageEmbedAccessory.message) && C9677q.m14638b(this.messageContext, flaggedMessageEmbedAccessory.messageContext);
    }

    public final Message getMessage() {
        return this.message;
    }

    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41765getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((MessageId.m42120hashCodeimpl(mo41765getMessageId3Eiw7ao()) * 31) + this.message.hashCode()) * 31) + this.messageContext.hashCode();
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(mo41765getMessageId3Eiw7ao());
        Message message = this.message;
        MessageContext messageContext = this.messageContext;
        return "FlaggedMessageEmbedAccessory(messageId=" + str + ", message=" + message + ", messageContext=" + messageContext + ")";
    }
}
