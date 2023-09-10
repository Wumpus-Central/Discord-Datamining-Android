package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.interaction.InteractionStatus;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/InteractionStatusMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "interactionStatus", "Lcom/discord/chat/bridge/interaction/InteractionStatus;", "(Ljava/lang/String;Lcom/discord/chat/bridge/interaction/InteractionStatus;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getInteractionStatus", "()Lcom/discord/chat/bridge/interaction/InteractionStatus;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/interaction/InteractionStatus;)Lcom/discord/chat/presentation/message/messagepart/InteractionStatusMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class InteractionStatusMessageAccessory extends MessageAccessory {
    private final InteractionStatus interactionStatus;
    private final String messageId;

    private InteractionStatusMessageAccessory(String str, InteractionStatus interactionStatus) {
        super(str, "interaction status", null);
        this.messageId = str;
        this.interactionStatus = interactionStatus;
    }

    public  InteractionStatusMessageAccessory(String str, InteractionStatus interactionStatus, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interactionStatus);
    }

    
    public static  InteractionStatusMessageAccessory m281copyntcYbpo$default(InteractionStatusMessageAccessory interactionStatusMessageAccessory, String str, InteractionStatus interactionStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = interactionStatusMessageAccessory.mo233getMessageId3Eiw7ao();
        }
        if ((i10 & 2) != 0) {
            interactionStatus = interactionStatusMessageAccessory.interactionStatus;
        }
        return interactionStatusMessageAccessory.m283copyntcYbpo(str, interactionStatus);
    }

    
    public final String m282component13Eiw7ao() {
        return mo233getMessageId3Eiw7ao();
    }

    public final InteractionStatus component2() {
        return this.interactionStatus;
    }

    
    public final InteractionStatusMessageAccessory m283copyntcYbpo(String messageId, InteractionStatus interactionStatus) {
        q.h(messageId, "messageId");
        q.h(interactionStatus, "interactionStatus");
        return new InteractionStatusMessageAccessory(messageId, interactionStatus, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionStatusMessageAccessory)) {
            return false;
        }
        InteractionStatusMessageAccessory interactionStatusMessageAccessory = (InteractionStatusMessageAccessory) obj;
        return MessageId.m628equalsimpl0(mo233getMessageId3Eiw7ao(), interactionStatusMessageAccessory.mo233getMessageId3Eiw7ao()) && q.c(this.interactionStatus, interactionStatusMessageAccessory.interactionStatus);
    }

    public final InteractionStatus getInteractionStatus() {
        return this.interactionStatus;
    }

    @Override 
    
    public String mo233getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (MessageId.m629hashCodeimpl(mo233getMessageId3Eiw7ao()) * 31) + this.interactionStatus.hashCode();
    }

    public String toString() {
        String str = MessageId.m630toStringimpl(mo233getMessageId3Eiw7ao());
        InteractionStatus interactionStatus = this.interactionStatus;
        return "InteractionStatusMessageAccessory(messageId=" + str + ", interactionStatus=" + interactionStatus + ")";
    }
}
