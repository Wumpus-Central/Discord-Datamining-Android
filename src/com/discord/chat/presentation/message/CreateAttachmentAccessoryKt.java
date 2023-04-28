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
import kotlin.jvm.internal.C9971q;
import nf.C11088q;

@Metadata(m15074d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¨\u0006\u000b"}, m15073d2 = {"createAttachmentAccessory", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lcom/discord/chat/bridge/attachment/Attachment;", "message", "Lcom/discord/chat/bridge/Message;", "index", "", "constrainedWidth", "radiusPx", "onLongClick", "Landroid/view/View$OnLongClickListener;", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class CreateAttachmentAccessoryKt {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
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

    public static final MessageAccessory createAttachmentAccessory(Attachment attachment, Message message, int i, int i2, int i3, View.OnLongClickListener onLongClickListener) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        FileAttachmentMessageAccessory fileAttachmentMessageAccessory;
        C9971q.m14633g(attachment, "<this>");
        C9971q.m14633g(message, "message");
        SpoilerAttributes forAttachment = SpoilerAttributes.Companion.forAttachment(attachment, message, i);
        if (!C9971q.m14638b(message.isCurrentUserMessageAuthor(), Boolean.TRUE) || (str = message.m41580getNonceN_6c4I0()) == null) {
            str = message.m41579getId3Eiw7ao();
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[attachment.type().ordinal()];
        if (i4 == 1) {
            Boolean useAttachmentGridLayout = message.getUseAttachmentGridLayout();
            if (useAttachmentGridLayout != null) {
                z = useAttachmentGridLayout.booleanValue();
            } else {
                z = false;
            }
            return new ImageAttachmentMessageAccessory(str, i, attachment, i2, i3, forAttachment, onLongClickListener, z, message.getAttachmentsOpacity(), null);
        } else if (i4 != 2) {
            if (i4 == 3) {
                fileAttachmentMessageAccessory = new FileAttachmentMessageAccessory(str, i, attachment, forAttachment, attachment.getUploaderId(), attachment.getUploaderItemId(), message.getAttachmentsOpacity(), null);
            } else if (i4 != 4) {
                throw new C11088q();
            } else if (MessageFlagKt.hasMessageFlag(Long.valueOf(message.getFlags()), MessageFlag.IS_VOICE_MESSAGE)) {
                return new AudioAttachmentMessageAccessory(str, message.m41576getAuthorIdwUX8bhU(), i, attachment, message.getAttachmentsOpacity(), null);
            } else {
                fileAttachmentMessageAccessory = new FileAttachmentMessageAccessory(str, i, attachment, forAttachment, attachment.getUploaderId(), attachment.getUploaderItemId(), message.getAttachmentsOpacity(), null);
            }
            return fileAttachmentMessageAccessory;
        } else {
            Boolean useAttachmentGridLayout2 = message.getUseAttachmentGridLayout();
            if (useAttachmentGridLayout2 != null) {
                z2 = useAttachmentGridLayout2.booleanValue();
            } else {
                z2 = false;
            }
            Boolean useAttachmentUploadPreview = message.getUseAttachmentUploadPreview();
            if (useAttachmentUploadPreview != null) {
                z3 = useAttachmentUploadPreview.booleanValue();
            } else {
                z3 = false;
            }
            if (!z3 || attachment.getProgress() == null) {
                z4 = false;
            } else {
                z4 = true;
            }
            return new VideoAttachmentMessageAccessory(str, i, attachment, i2, i3, forAttachment, onLongClickListener, z2, z4, message.getAttachmentsOpacity(), null);
        }
    }
}
