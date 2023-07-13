package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "message", "Lcom/discord/chat/bridge/Message;", "autoModerationContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "(Ljava/lang/String;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/automod/AutoModerationContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAutoModerationContext", "()Lcom/discord/chat/bridge/automod/AutoModerationContext;", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/automod/AutoModerationContext;)Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class FlaggedMessageActionBarAccessory extends MessageAccessory {
    private final AutoModerationContext autoModerationContext;
    private final Message message;
    private final String messageId;

    private FlaggedMessageActionBarAccessory(String str, Message message, AutoModerationContext autoModerationContext) {
        super(str, "flagged message actions", null);
        this.messageId = str;
        this.message = message;
        this.autoModerationContext = autoModerationContext;
    }

    public  FlaggedMessageActionBarAccessory(String str, Message message, AutoModerationContext autoModerationContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, message, autoModerationContext);
    }

    
    public static  FlaggedMessageActionBarAccessory m239copyu7_MRrM$default(FlaggedMessageActionBarAccessory flaggedMessageActionBarAccessory, String str, Message message, AutoModerationContext autoModerationContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = flaggedMessageActionBarAccessory.mo215getMessageId3Eiw7ao();
        }
        if ((i10 & 2) != 0) {
            message = flaggedMessageActionBarAccessory.message;
        }
        if ((i10 & 4) != 0) {
            autoModerationContext = flaggedMessageActionBarAccessory.autoModerationContext;
        }
        return flaggedMessageActionBarAccessory.m241copyu7_MRrM(str, message, autoModerationContext);
    }

    
    public final String m240component13Eiw7ao() {
        return mo215getMessageId3Eiw7ao();
    }

    public final Message component2() {
        return this.message;
    }

    public final AutoModerationContext component3() {
        return this.autoModerationContext;
    }

    
    public final FlaggedMessageActionBarAccessory m241copyu7_MRrM(String messageId, Message message, AutoModerationContext autoModerationContext) {
        q.g(messageId, "messageId");
        q.g(message, "message");
        q.g(autoModerationContext, "autoModerationContext");
        return new FlaggedMessageActionBarAccessory(messageId, message, autoModerationContext, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlaggedMessageActionBarAccessory)) {
            return false;
        }
        FlaggedMessageActionBarAccessory flaggedMessageActionBarAccessory = (FlaggedMessageActionBarAccessory) obj;
        return MessageId.m594equalsimpl0(mo215getMessageId3Eiw7ao(), flaggedMessageActionBarAccessory.mo215getMessageId3Eiw7ao()) && q.b(this.message, flaggedMessageActionBarAccessory.message) && q.b(this.autoModerationContext, flaggedMessageActionBarAccessory.autoModerationContext);
    }

    public final AutoModerationContext getAutoModerationContext() {
        return this.autoModerationContext;
    }

    public final Message getMessage() {
        return this.message;
    }

    @Override 
    
    public String mo215getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((MessageId.m595hashCodeimpl(mo215getMessageId3Eiw7ao()) * 31) + this.message.hashCode()) * 31) + this.autoModerationContext.hashCode();
    }

    public String toString() {
        String str = MessageId.m596toStringimpl(mo215getMessageId3Eiw7ao());
        Message message = this.message;
        AutoModerationContext autoModerationContext = this.autoModerationContext;
        return "FlaggedMessageActionBarAccessory(messageId=" + str + ", message=" + message + ", autoModerationContext=" + autoModerationContext + ")";
    }
}
