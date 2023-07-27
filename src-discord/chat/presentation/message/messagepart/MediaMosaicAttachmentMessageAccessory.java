package com.discord.chat.presentation.message.messagepart;

import com.discord.primitives.MessageId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "attachments", "", "constrainedWidth", "", "(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAttachments", "()Ljava/util/List;", "getConstrainedWidth", "()I", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;Ljava/util/List;I)Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MediaMosaicAttachmentMessageAccessory extends MessageAccessory {
    private final List<MessageAccessory> attachments;
    private final int constrainedWidth;
    private final String messageId;

    
    private MediaMosaicAttachmentMessageAccessory(String str, List<? extends MessageAccessory> list, int i10) {
        super(str, "multimedia attachment", null);
        this.messageId = str;
        this.attachments = list;
        this.constrainedWidth = i10;
    }

    public  MediaMosaicAttachmentMessageAccessory(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i10);
    }

    
    
    public static  MediaMosaicAttachmentMessageAccessory m267copyu7_MRrM$default(MediaMosaicAttachmentMessageAccessory mediaMosaicAttachmentMessageAccessory, String str, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mediaMosaicAttachmentMessageAccessory.mo216getMessageId3Eiw7ao();
        }
        if ((i11 & 2) != 0) {
            list = mediaMosaicAttachmentMessageAccessory.attachments;
        }
        if ((i11 & 4) != 0) {
            i10 = mediaMosaicAttachmentMessageAccessory.constrainedWidth;
        }
        return mediaMosaicAttachmentMessageAccessory.m269copyu7_MRrM(str, list, i10);
    }

    
    public final String m268component13Eiw7ao() {
        return mo216getMessageId3Eiw7ao();
    }

    public final List<MessageAccessory> component2() {
        return this.attachments;
    }

    public final int component3() {
        return this.constrainedWidth;
    }

    
    public final MediaMosaicAttachmentMessageAccessory m269copyu7_MRrM(String messageId, List<? extends MessageAccessory> attachments, int i10) {
        q.g(messageId, "messageId");
        q.g(attachments, "attachments");
        return new MediaMosaicAttachmentMessageAccessory(messageId, attachments, i10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMosaicAttachmentMessageAccessory)) {
            return false;
        }
        MediaMosaicAttachmentMessageAccessory mediaMosaicAttachmentMessageAccessory = (MediaMosaicAttachmentMessageAccessory) obj;
        return MessageId.m595equalsimpl0(mo216getMessageId3Eiw7ao(), mediaMosaicAttachmentMessageAccessory.mo216getMessageId3Eiw7ao()) && q.b(this.attachments, mediaMosaicAttachmentMessageAccessory.attachments) && this.constrainedWidth == mediaMosaicAttachmentMessageAccessory.constrainedWidth;
    }

    public final List<MessageAccessory> getAttachments() {
        return this.attachments;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    @Override 
    
    public String mo216getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((MessageId.m596hashCodeimpl(mo216getMessageId3Eiw7ao()) * 31) + this.attachments.hashCode()) * 31) + this.constrainedWidth;
    }

    public String toString() {
        String str = MessageId.m597toStringimpl(mo216getMessageId3Eiw7ao());
        List<MessageAccessory> list = this.attachments;
        int i10 = this.constrainedWidth;
        return "MediaMosaicAttachmentMessageAccessory(messageId=" + str + ", attachments=" + list + ", constrainedWidth=" + i10 + ")";
    }
}
