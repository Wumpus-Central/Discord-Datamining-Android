package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.attachment.AttachmentType;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.primitives.MessageFlag;
import com.discord.primitives.MessageFlagKt;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¨\u0006\u000b"}, d2 = {"createAttachmentAccessory", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lcom/discord/chat/bridge/attachment/Attachment;", "message", "Lcom/discord/chat/bridge/Message;", "index", "", "constrainedWidth", "radiusPx", "onLongClick", "Landroid/view/View$OnLongClickListener;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CreateAttachmentAccessoryKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            try {
                iArr[AttachmentType.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachmentType.File.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AttachmentType.Audio.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MessageAccessory createAttachmentAccessory(Attachment attachment, Message message, int i10, int i11, int i12, View.OnLongClickListener onLongClickListener) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        FileAttachmentMessageAccessory fileAttachmentMessageAccessory;
        q.g(attachment, "<this>");
        q.g(message, "message");
        SpoilerAttributes forAttachment = SpoilerAttributes.Companion.forAttachment(attachment, message, i10);
        if (!q.b(message.isCurrentUserMessageAuthor(), Boolean.TRUE) || (str = message.m17getNonceN_6c4I0()) == null) {
            str = message.m16getId3Eiw7ao();
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[attachment.type().ordinal()];
        if (i13 == 1) {
            Boolean useAttachmentGridLayout = message.getUseAttachmentGridLayout();
            if (useAttachmentGridLayout != null) {
                z10 = useAttachmentGridLayout.booleanValue();
            } else {
                z10 = false;
            }
            return new ImageAttachmentMessageAccessory(str, i10, attachment, i11, i12, forAttachment, onLongClickListener, z10, message.getAttachmentsOpacity(), null);
        } else if (i13 != 2) {
            if (i13 == 3) {
                fileAttachmentMessageAccessory = new FileAttachmentMessageAccessory(str, i10, attachment, forAttachment, attachment.getUploaderId(), attachment.getUploaderItemId(), message.getAttachmentsOpacity(), null);
            } else if (i13 != 4) {
                throw new nf.q();
            } else if (MessageFlagKt.hasMessageFlag(Long.valueOf(message.getFlags()), MessageFlag.IS_VOICE_MESSAGE)) {
                return new AudioAttachmentMessageAccessory(str, message.m13getAuthorIdwUX8bhU(), i10, attachment, message.getAttachmentsOpacity(), null);
            } else {
                fileAttachmentMessageAccessory = new FileAttachmentMessageAccessory(str, i10, attachment, forAttachment, attachment.getUploaderId(), attachment.getUploaderItemId(), message.getAttachmentsOpacity(), null);
            }
            return fileAttachmentMessageAccessory;
        } else {
            Boolean useAttachmentGridLayout2 = message.getUseAttachmentGridLayout();
            if (useAttachmentGridLayout2 != null) {
                z11 = useAttachmentGridLayout2.booleanValue();
            } else {
                z11 = false;
            }
            Boolean useAttachmentUploadPreview = message.getUseAttachmentUploadPreview();
            if (useAttachmentUploadPreview != null) {
                z12 = useAttachmentUploadPreview.booleanValue();
            } else {
                z12 = false;
            }
            if (!z12 || attachment.getProgress() == null) {
                z13 = false;
            } else {
                z13 = true;
            }
            return new VideoAttachmentMessageAccessory(str, i10, attachment, i11, i12, forAttachment, onLongClickListener, z11, z13, message.getAttachmentsOpacity(), null);
        }
    }
}