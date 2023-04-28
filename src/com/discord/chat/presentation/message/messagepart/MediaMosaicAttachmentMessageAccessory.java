package com.discord.chat.presentation.message.messagepart;

import com.discord.primitives.MessageId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m15073d2 = {"Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "attachments", "", "constrainedWidth", "", "(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAttachments", "()Ljava/util/List;", "getConstrainedWidth", "()I", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;Ljava/util/List;I)Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MediaMosaicAttachmentMessageAccessory extends MessageAccessory {
    private final List<MessageAccessory> attachments;
    private final int constrainedWidth;
    private final String messageId;

    /* JADX WARN: Multi-variable type inference failed */
    private MediaMosaicAttachmentMessageAccessory(String str, List<? extends MessageAccessory> list, int i) {
        super(str, "multimedia attachment", null);
        this.messageId = str;
        this.attachments = list;
        this.constrainedWidth = i;
    }

    public /* synthetic */ MediaMosaicAttachmentMessageAccessory(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-u7_MRrM$default  reason: not valid java name */
    public static /* synthetic */ MediaMosaicAttachmentMessageAccessory m41816copyu7_MRrM$default(MediaMosaicAttachmentMessageAccessory mediaMosaicAttachmentMessageAccessory, String str, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mediaMosaicAttachmentMessageAccessory.mo41765getMessageId3Eiw7ao();
        }
        if ((i2 & 2) != 0) {
            list = mediaMosaicAttachmentMessageAccessory.attachments;
        }
        if ((i2 & 4) != 0) {
            i = mediaMosaicAttachmentMessageAccessory.constrainedWidth;
        }
        return mediaMosaicAttachmentMessageAccessory.m41818copyu7_MRrM(str, list, i);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41817component13Eiw7ao() {
        return mo41765getMessageId3Eiw7ao();
    }

    public final List<MessageAccessory> component2() {
        return this.attachments;
    }

    public final int component3() {
        return this.constrainedWidth;
    }

    /* renamed from: copy-u7_MRrM  reason: not valid java name */
    public final MediaMosaicAttachmentMessageAccessory m41818copyu7_MRrM(String messageId, List<? extends MessageAccessory> attachments, int i) {
        C9677q.m14633g(messageId, "messageId");
        C9677q.m14633g(attachments, "attachments");
        return new MediaMosaicAttachmentMessageAccessory(messageId, attachments, i, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMosaicAttachmentMessageAccessory)) {
            return false;
        }
        MediaMosaicAttachmentMessageAccessory mediaMosaicAttachmentMessageAccessory = (MediaMosaicAttachmentMessageAccessory) obj;
        return MessageId.m42119equalsimpl0(mo41765getMessageId3Eiw7ao(), mediaMosaicAttachmentMessageAccessory.mo41765getMessageId3Eiw7ao()) && C9677q.m14638b(this.attachments, mediaMosaicAttachmentMessageAccessory.attachments) && this.constrainedWidth == mediaMosaicAttachmentMessageAccessory.constrainedWidth;
    }

    public final List<MessageAccessory> getAttachments() {
        return this.attachments;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41765getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((MessageId.m42120hashCodeimpl(mo41765getMessageId3Eiw7ao()) * 31) + this.attachments.hashCode()) * 31) + this.constrainedWidth;
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(mo41765getMessageId3Eiw7ao());
        List<MessageAccessory> list = this.attachments;
        int i = this.constrainedWidth;
        return "MediaMosaicAttachmentMessageAccessory(messageId=" + str + ", attachments=" + list + ", constrainedWidth=" + i + ")";
    }
}
