package com.discord.chat.presentation.message.messagepart;

import android.view.View;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BV\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0019\u0010%\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001cJ\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u0018Jv\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0005HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "attachmentIndex", "", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "constrainedWidth", "radiusPx", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "onLongClick", "Landroid/view/View$OnLongClickListener;", "useNewAltTextButton", "", "attachmentsOpacity", "", "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAttachment", "()Lcom/discord/chat/bridge/attachment/Attachment;", "getAttachmentIndex", "()I", "getAttachmentsOpacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getConstrainedWidth", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getOnLongClick", "()Landroid/view/View$OnLongClickListener;", "getRadiusPx", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "getUseNewAltTextButton", "()Z", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-IwdeaXA", "(Ljava/lang/String;ILcom/discord/chat/bridge/attachment/Attachment;IILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;ZLjava/lang/Float;)Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageAttachmentMessageAccessory extends MessageAccessory {
    private final Attachment attachment;
    private final int attachmentIndex;
    private final Float attachmentsOpacity;
    private final int constrainedWidth;
    private final String messageId;
    private final View.OnLongClickListener onLongClick;
    private final int radiusPx;
    private final SpoilerAttributes spoilerAttributes;
    private final boolean useNewAltTextButton;

    private ImageAttachmentMessageAccessory(String str, int i10, Attachment attachment, int i11, int i12, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, boolean z10, Float f10) {
        super(str, "image attachment " + i10, null);
        this.messageId = str;
        this.attachmentIndex = i10;
        this.attachment = attachment;
        this.constrainedWidth = i11;
        this.radiusPx = i12;
        this.spoilerAttributes = spoilerAttributes;
        this.onLongClick = onLongClickListener;
        this.useNewAltTextButton = z10;
        this.attachmentsOpacity = f10;
    }

    public /* synthetic */ ImageAttachmentMessageAccessory(String str, int i10, Attachment attachment, int i11, int i12, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, boolean z10, Float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, attachment, i11, i12, spoilerAttributes, onLongClickListener, z10, f10);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m248component13Eiw7ao() {
        return mo202getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.attachmentIndex;
    }

    public final Attachment component3() {
        return this.attachment;
    }

    public final int component4() {
        return this.constrainedWidth;
    }

    public final int component5() {
        return this.radiusPx;
    }

    public final SpoilerAttributes component6() {
        return this.spoilerAttributes;
    }

    public final View.OnLongClickListener component7() {
        return this.onLongClick;
    }

    public final boolean component8() {
        return this.useNewAltTextButton;
    }

    public final Float component9() {
        return this.attachmentsOpacity;
    }

    /* renamed from: copy-IwdeaXA  reason: not valid java name */
    public final ImageAttachmentMessageAccessory m249copyIwdeaXA(String messageId, int i10, Attachment attachment, int i11, int i12, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, boolean z10, Float f10) {
        q.g(messageId, "messageId");
        q.g(attachment, "attachment");
        return new ImageAttachmentMessageAccessory(messageId, i10, attachment, i11, i12, spoilerAttributes, onLongClickListener, z10, f10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageAttachmentMessageAccessory)) {
            return false;
        }
        ImageAttachmentMessageAccessory imageAttachmentMessageAccessory = (ImageAttachmentMessageAccessory) obj;
        return MessageId.m562equalsimpl0(mo202getMessageId3Eiw7ao(), imageAttachmentMessageAccessory.mo202getMessageId3Eiw7ao()) && this.attachmentIndex == imageAttachmentMessageAccessory.attachmentIndex && q.b(this.attachment, imageAttachmentMessageAccessory.attachment) && this.constrainedWidth == imageAttachmentMessageAccessory.constrainedWidth && this.radiusPx == imageAttachmentMessageAccessory.radiusPx && q.b(this.spoilerAttributes, imageAttachmentMessageAccessory.spoilerAttributes) && q.b(this.onLongClick, imageAttachmentMessageAccessory.onLongClick) && this.useNewAltTextButton == imageAttachmentMessageAccessory.useNewAltTextButton && q.b(this.attachmentsOpacity, imageAttachmentMessageAccessory.attachmentsOpacity);
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

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo202getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final View.OnLongClickListener getOnLongClick() {
        return this.onLongClick;
    }

    public final int getRadiusPx() {
        return this.radiusPx;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    public final boolean getUseNewAltTextButton() {
        return this.useNewAltTextButton;
    }

    public int hashCode() {
        int i10 = ((((((((MessageId.m563hashCodeimpl(mo202getMessageId3Eiw7ao()) * 31) + this.attachmentIndex) * 31) + this.attachment.hashCode()) * 31) + this.constrainedWidth) * 31) + this.radiusPx) * 31;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        int i11 = 0;
        int hashCode = (i10 + (spoilerAttributes == null ? 0 : spoilerAttributes.hashCode())) * 31;
        View.OnLongClickListener onLongClickListener = this.onLongClick;
        int hashCode2 = (hashCode + (onLongClickListener == null ? 0 : onLongClickListener.hashCode())) * 31;
        boolean z10 = this.useNewAltTextButton;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = (hashCode2 + i12) * 31;
        Float f10 = this.attachmentsOpacity;
        if (f10 != null) {
            i11 = f10.hashCode();
        }
        return i15 + i11;
    }

    public String toString() {
        String str = MessageId.m564toStringimpl(mo202getMessageId3Eiw7ao());
        int i10 = this.attachmentIndex;
        Attachment attachment = this.attachment;
        int i11 = this.constrainedWidth;
        int i12 = this.radiusPx;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        View.OnLongClickListener onLongClickListener = this.onLongClick;
        boolean z10 = this.useNewAltTextButton;
        Float f10 = this.attachmentsOpacity;
        return "ImageAttachmentMessageAccessory(messageId=" + str + ", attachmentIndex=" + i10 + ", attachment=" + attachment + ", constrainedWidth=" + i11 + ", radiusPx=" + i12 + ", spoilerAttributes=" + spoilerAttributes + ", onLongClick=" + onLongClickListener + ", useNewAltTextButton=" + z10 + ", attachmentsOpacity=" + f10 + ")";
    }
}
