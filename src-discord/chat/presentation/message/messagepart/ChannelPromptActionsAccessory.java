package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ChannelPromptActionsAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "message", "Lcom/discord/chat/bridge/Message;", "(Lcom/discord/chat/bridge/Message;)V", "getMessage", "()Lcom/discord/chat/bridge/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ChannelPromptActionsAccessory extends MessageAccessory {
    private final Message message;

    
    public ChannelPromptActionsAccessory(Message message) {
        super(message.m24getId3Eiw7ao(), "channel deadchat prompt actions", null);
        q.h(message, "message");
        this.message = message;
    }

    public static  ChannelPromptActionsAccessory copy$default(ChannelPromptActionsAccessory channelPromptActionsAccessory, Message message, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            message = channelPromptActionsAccessory.message;
        }
        return channelPromptActionsAccessory.copy(message);
    }

    public final Message component1() {
        return this.message;
    }

    public final ChannelPromptActionsAccessory copy(Message message) {
        q.h(message, "message");
        return new ChannelPromptActionsAccessory(message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelPromptActionsAccessory) && q.c(this.message, ((ChannelPromptActionsAccessory) obj).message);
    }

    public final Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        Message message = this.message;
        return "ChannelPromptActionsAccessory(message=" + message + ")";
    }
}