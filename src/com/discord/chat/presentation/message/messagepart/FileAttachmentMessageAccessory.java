package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BH\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u001e\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0018J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0015Jd\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, m15073d2 = {"Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "attachmentIndex", "", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "uploaderId", "", "uploaderItemId", "attachmentsOpacity", "", "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAttachment", "()Lcom/discord/chat/bridge/attachment/Attachment;", "getAttachmentIndex", "()I", "getAttachmentsOpacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "getUploaderId", "getUploaderItemId", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "copy-dB0-bEw", "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class FileAttachmentMessageAccessory extends MessageAccessory {
    private final Attachment attachment;
    private final int attachmentIndex;
    private final Float attachmentsOpacity;
    private final String messageId;
    private final SpoilerAttributes spoilerAttributes;
    private final String uploaderId;
    private final String uploaderItemId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private FileAttachmentMessageAccessory(java.lang.String r3, int r4, com.discord.chat.bridge.attachment.Attachment r5, com.discord.chat.bridge.spoiler.SpoilerAttributes r6, java.lang.String r7, java.lang.String r8, java.lang.Float r9) {
        /*
            r2 = this;
            java.lang.String r0 = "file attachment "
            if (r7 == 0) goto L_0x001a
            if (r8 == 0) goto L_0x001a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r8)
            goto L_0x0025
        L_0x001a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
        L_0x0025:
            java.lang.String r0 = r1.toString()
            r1 = 0
            r2.<init>(r3, r0, r1)
            r2.messageId = r3
            r2.attachmentIndex = r4
            r2.attachment = r5
            r2.spoilerAttributes = r6
            r2.uploaderId = r7
            r2.uploaderItemId = r8
            r2.attachmentsOpacity = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory.<init>(java.lang.String, int, com.discord.chat.bridge.attachment.Attachment, com.discord.chat.bridge.spoiler.SpoilerAttributes, java.lang.String, java.lang.String, java.lang.Float):void");
    }

    public /* synthetic */ FileAttachmentMessageAccessory(String str, int i, Attachment attachment, SpoilerAttributes spoilerAttributes, String str2, String str3, Float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, attachment, spoilerAttributes, str2, str3, f);
    }

    /* renamed from: copy-dB0-bEw$default  reason: not valid java name */
    public static /* synthetic */ FileAttachmentMessageAccessory m41786copydB0bEw$default(FileAttachmentMessageAccessory fileAttachmentMessageAccessory, String str, int i, Attachment attachment, SpoilerAttributes spoilerAttributes, String str2, String str3, Float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fileAttachmentMessageAccessory.mo41765getMessageId3Eiw7ao();
        }
        if ((i2 & 2) != 0) {
            i = fileAttachmentMessageAccessory.attachmentIndex;
        }
        if ((i2 & 4) != 0) {
            attachment = fileAttachmentMessageAccessory.attachment;
        }
        if ((i2 & 8) != 0) {
            spoilerAttributes = fileAttachmentMessageAccessory.spoilerAttributes;
        }
        if ((i2 & 16) != 0) {
            str2 = fileAttachmentMessageAccessory.uploaderId;
        }
        if ((i2 & 32) != 0) {
            str3 = fileAttachmentMessageAccessory.uploaderItemId;
        }
        if ((i2 & 64) != 0) {
            f = fileAttachmentMessageAccessory.attachmentsOpacity;
        }
        return fileAttachmentMessageAccessory.m41788copydB0bEw(str, i, attachment, spoilerAttributes, str2, str3, f);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41787component13Eiw7ao() {
        return mo41765getMessageId3Eiw7ao();
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

    /* renamed from: copy-dB0-bEw  reason: not valid java name */
    public final FileAttachmentMessageAccessory m41788copydB0bEw(String messageId, int i, Attachment attachment, SpoilerAttributes spoilerAttributes, String str, String str2, Float f) {
        C9677q.m14633g(messageId, "messageId");
        C9677q.m14633g(attachment, "attachment");
        return new FileAttachmentMessageAccessory(messageId, i, attachment, spoilerAttributes, str, str2, f, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileAttachmentMessageAccessory)) {
            return false;
        }
        FileAttachmentMessageAccessory fileAttachmentMessageAccessory = (FileAttachmentMessageAccessory) obj;
        return MessageId.m42119equalsimpl0(mo41765getMessageId3Eiw7ao(), fileAttachmentMessageAccessory.mo41765getMessageId3Eiw7ao()) && this.attachmentIndex == fileAttachmentMessageAccessory.attachmentIndex && C9677q.m14638b(this.attachment, fileAttachmentMessageAccessory.attachment) && C9677q.m14638b(this.spoilerAttributes, fileAttachmentMessageAccessory.spoilerAttributes) && C9677q.m14638b(this.uploaderId, fileAttachmentMessageAccessory.uploaderId) && C9677q.m14638b(this.uploaderItemId, fileAttachmentMessageAccessory.uploaderItemId) && C9677q.m14638b(this.attachmentsOpacity, fileAttachmentMessageAccessory.attachmentsOpacity);
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

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41765getMessageId3Eiw7ao() {
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
        int i = ((((MessageId.m42120hashCodeimpl(mo41765getMessageId3Eiw7ao()) * 31) + this.attachmentIndex) * 31) + this.attachment.hashCode()) * 31;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        int i2 = 0;
        int hashCode = (i + (spoilerAttributes == null ? 0 : spoilerAttributes.hashCode())) * 31;
        String str = this.uploaderId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uploaderItemId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.attachmentsOpacity;
        if (f != null) {
            i2 = f.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(mo41765getMessageId3Eiw7ao());
        int i = this.attachmentIndex;
        Attachment attachment = this.attachment;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        String str2 = this.uploaderId;
        String str3 = this.uploaderItemId;
        Float f = this.attachmentsOpacity;
        return "FileAttachmentMessageAccessory(messageId=" + str + ", attachmentIndex=" + i + ", attachment=" + attachment + ", spoilerAttributes=" + spoilerAttributes + ", uploaderId=" + str2 + ", uploaderItemId=" + str3 + ", attachmentsOpacity=" + f + ")";
    }
}
