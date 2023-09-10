package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B4\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0019\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u001cJ\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0010JL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "authorId", "Lcom/discord/primitives/UserId;", "index", "", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachmentsOpacity", "", "(Ljava/lang/String;Lcom/discord/primitives/UserId;ILcom/discord/chat/bridge/attachment/Attachment;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAttachment", "()Lcom/discord/chat/bridge/attachment/Attachment;", "getAttachmentsOpacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAuthorId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getIndex", "()I", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component2-wUX8bhU", "component3", "component4", "component5", "copy", "copy-D2GGZos", "(Ljava/lang/String;Lcom/discord/primitives/UserId;ILcom/discord/chat/bridge/attachment/Attachment;Ljava/lang/Float;)Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class AudioAttachmentMessageAccessory extends MessageAccessory {
    private final Attachment attachment;
    private final Float attachmentsOpacity;
    private final UserId authorId;
    private final int index;
    private final String messageId;

    private AudioAttachmentMessageAccessory(String str, UserId userId, int i10, Attachment attachment, Float f10) {
        super(str, "audio attachment " + i10, null);
        this.messageId = str;
        this.authorId = userId;
        this.index = i10;
        this.attachment = attachment;
        this.attachmentsOpacity = f10;
    }

    public  AudioAttachmentMessageAccessory(String str, UserId userId, int i10, Attachment attachment, Float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, userId, i10, attachment, f10);
    }

    
    public static  AudioAttachmentMessageAccessory m237copyD2GGZos$default(AudioAttachmentMessageAccessory audioAttachmentMessageAccessory, String str, UserId userId, int i10, Attachment attachment, Float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = audioAttachmentMessageAccessory.mo233getMessageId3Eiw7ao();
        }
        if ((i11 & 2) != 0) {
            userId = audioAttachmentMessageAccessory.authorId;
        }
        if ((i11 & 4) != 0) {
            i10 = audioAttachmentMessageAccessory.index;
        }
        if ((i11 & 8) != 0) {
            attachment = audioAttachmentMessageAccessory.attachment;
        }
        if ((i11 & 16) != 0) {
            f10 = audioAttachmentMessageAccessory.attachmentsOpacity;
        }
        return audioAttachmentMessageAccessory.m240copyD2GGZos(str, userId, i10, attachment, f10);
    }

    
    public final String m238component13Eiw7ao() {
        return mo233getMessageId3Eiw7ao();
    }

    
    public final UserId m239component2wUX8bhU() {
        return this.authorId;
    }

    public final int component3() {
        return this.index;
    }

    public final Attachment component4() {
        return this.attachment;
    }

    public final Float component5() {
        return this.attachmentsOpacity;
    }

    
    public final AudioAttachmentMessageAccessory m240copyD2GGZos(String messageId, UserId userId, int i10, Attachment attachment, Float f10) {
        q.h(messageId, "messageId");
        q.h(attachment, "attachment");
        return new AudioAttachmentMessageAccessory(messageId, userId, i10, attachment, f10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAttachmentMessageAccessory)) {
            return false;
        }
        AudioAttachmentMessageAccessory audioAttachmentMessageAccessory = (AudioAttachmentMessageAccessory) obj;
        return MessageId.m628equalsimpl0(mo233getMessageId3Eiw7ao(), audioAttachmentMessageAccessory.mo233getMessageId3Eiw7ao()) && q.c(this.authorId, audioAttachmentMessageAccessory.authorId) && this.index == audioAttachmentMessageAccessory.index && q.c(this.attachment, audioAttachmentMessageAccessory.attachment) && q.c(this.attachmentsOpacity, audioAttachmentMessageAccessory.attachmentsOpacity);
    }

    public final Attachment getAttachment() {
        return this.attachment;
    }

    public final Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    
    public final UserId m241getAuthorIdwUX8bhU() {
        return this.authorId;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override 
    
    public String mo233getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        int i10 = MessageId.m629hashCodeimpl(mo233getMessageId3Eiw7ao()) * 31;
        UserId userId = this.authorId;
        int i11 = 0;
        int i12 = (((((i10 + (userId == null ? 0 : UserId.m667hashCodeimpl(userId.m671unboximpl()))) * 31) + this.index) * 31) + this.attachment.hashCode()) * 31;
        Float f10 = this.attachmentsOpacity;
        if (f10 != null) {
            i11 = f10.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        String str = MessageId.m630toStringimpl(mo233getMessageId3Eiw7ao());
        UserId userId = this.authorId;
        int i10 = this.index;
        Attachment attachment = this.attachment;
        Float f10 = this.attachmentsOpacity;
        return "AudioAttachmentMessageAccessory(messageId=" + str + ", authorId=" + userId + ", index=" + i10 + ", attachment=" + attachment + ", attachmentsOpacity=" + f10 + ")";
    }
}
