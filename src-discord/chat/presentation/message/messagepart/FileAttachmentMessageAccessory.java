package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BH\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u001e\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0018J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0015Jd\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "attachmentIndex", "", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "uploaderId", "", "uploaderItemId", "attachmentsOpacity", "", "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAttachment", "()Lcom/discord/chat/bridge/attachment/Attachment;", "getAttachmentIndex", "()I", "getAttachmentsOpacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "getUploaderId", "getUploaderItemId", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "copy-dB0-bEw", "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class FileAttachmentMessageAccessory extends MessageAccessory {
    private final Attachment attachment;
    private final int attachmentIndex;
    private final Float attachmentsOpacity;
    private final String messageId;
    private final SpoilerAttributes spoilerAttributes;
    private final String uploaderId;
    private final String uploaderItemId;

    
    
    private FileAttachmentMessageAccessory(java.lang.String r3, int r4, com.discord.chat.bridge.attachment.Attachment r5, com.discord.chat.bridge.spoiler.SpoilerAttributes r6, java.lang.String r7, java.lang.String r8, java.lang.Float r9) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory.<init>(java.lang.String, int, com.discord.chat.bridge.attachment.Attachment, com.discord.chat.bridge.spoiler.SpoilerAttributes, java.lang.String, java.lang.String, java.lang.Float):void");
    }

    public  FileAttachmentMessageAccessory(String str, int i10, Attachment attachment, SpoilerAttributes spoilerAttributes, String str2, String str3, Float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, attachment, spoilerAttributes, str2, str3, f10);
    }

    
    public static  FileAttachmentMessageAccessory m238copydB0bEw$default(FileAttachmentMessageAccessory fileAttachmentMessageAccessory, String str, int i10, Attachment attachment, SpoilerAttributes spoilerAttributes, String str2, String str3, Float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fileAttachmentMessageAccessory.mo217getMessageId3Eiw7ao();
        }
        if ((i11 & 2) != 0) {
            i10 = fileAttachmentMessageAccessory.attachmentIndex;
        }
        if ((i11 & 4) != 0) {
            attachment = fileAttachmentMessageAccessory.attachment;
        }
        if ((i11 & 8) != 0) {
            spoilerAttributes = fileAttachmentMessageAccessory.spoilerAttributes;
        }
        if ((i11 & 16) != 0) {
            str2 = fileAttachmentMessageAccessory.uploaderId;
        }
        if ((i11 & 32) != 0) {
            str3 = fileAttachmentMessageAccessory.uploaderItemId;
        }
        if ((i11 & 64) != 0) {
            f10 = fileAttachmentMessageAccessory.attachmentsOpacity;
        }
        return fileAttachmentMessageAccessory.m240copydB0bEw(str, i10, attachment, spoilerAttributes, str2, str3, f10);
    }

    
    public final String m239component13Eiw7ao() {
        return mo217getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.attachmentIndex;
    }

    public final Attachment component3() {
        return this.attachment;
    }

    public final SpoilerAttributes component4() {
        return this.spoilerAttributes;
    }

    public final String component5() {
        return this.uploaderId;
    }

    public final String component6() {
        return this.uploaderItemId;
    }

    public final Float component7() {
        return this.attachmentsOpacity;
    }

    
    public final FileAttachmentMessageAccessory m240copydB0bEw(String messageId, int i10, Attachment attachment, SpoilerAttributes spoilerAttributes, String str, String str2, Float f10) {
        q.g(messageId, "messageId");
        q.g(attachment, "attachment");
        return new FileAttachmentMessageAccessory(messageId, i10, attachment, spoilerAttributes, str, str2, f10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileAttachmentMessageAccessory)) {
            return false;
        }
        FileAttachmentMessageAccessory fileAttachmentMessageAccessory = (FileAttachmentMessageAccessory) obj;
        return MessageId.m596equalsimpl0(mo217getMessageId3Eiw7ao(), fileAttachmentMessageAccessory.mo217getMessageId3Eiw7ao()) && this.attachmentIndex == fileAttachmentMessageAccessory.attachmentIndex && q.b(this.attachment, fileAttachmentMessageAccessory.attachment) && q.b(this.spoilerAttributes, fileAttachmentMessageAccessory.spoilerAttributes) && q.b(this.uploaderId, fileAttachmentMessageAccessory.uploaderId) && q.b(this.uploaderItemId, fileAttachmentMessageAccessory.uploaderItemId) && q.b(this.attachmentsOpacity, fileAttachmentMessageAccessory.attachmentsOpacity);
    }

    public final Attachment getAttachment() {
        return this.attachment;
    }

    public final int getAttachmentIndex() {
        return this.attachmentIndex;
    }

    public final Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    @Override 
    
    public String mo217getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    public final String getUploaderId() {
        return this.uploaderId;
    }

    public final String getUploaderItemId() {
        return this.uploaderItemId;
    }

    public int hashCode() {
        int i10 = ((((MessageId.m597hashCodeimpl(mo217getMessageId3Eiw7ao()) * 31) + this.attachmentIndex) * 31) + this.attachment.hashCode()) * 31;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        int i11 = 0;
        int hashCode = (i10 + (spoilerAttributes == null ? 0 : spoilerAttributes.hashCode())) * 31;
        String str = this.uploaderId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uploaderItemId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f10 = this.attachmentsOpacity;
        if (f10 != null) {
            i11 = f10.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        String str = MessageId.m598toStringimpl(mo217getMessageId3Eiw7ao());
        int i10 = this.attachmentIndex;
        Attachment attachment = this.attachment;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        String str2 = this.uploaderId;
        String str3 = this.uploaderItemId;
        Float f10 = this.attachmentsOpacity;
        return "FileAttachmentMessageAccessory(messageId=" + str + ", attachmentIndex=" + i10 + ", attachment=" + attachment + ", spoilerAttributes=" + spoilerAttributes + ", uploaderId=" + str2 + ", uploaderItemId=" + str3 + ", attachmentsOpacity=" + f10 + ")";
    }
}
