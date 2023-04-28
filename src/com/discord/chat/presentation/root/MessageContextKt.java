package com.discord.chat.presentation.root;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.MessageFrameType;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.bridge.truncation.Truncation;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m15073d2 = {"getMessageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "Lcom/discord/chat/bridge/row/MessageRow;", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageContextKt {
    public static final MessageContext getMessageContext(MessageRow messageRow) {
        MessageFrameType messageFrameType;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C9971q.m14633g(messageRow, "<this>");
        MessageFrame messageFrame = messageRow.getMessageFrame();
        if (messageFrame != null) {
            messageFrameType = messageFrame.getType();
        } else {
            messageFrameType = null;
        }
        if (messageFrameType == MessageFrameType.JUMP_MESSAGE_FRAME) {
            z = true;
        } else {
            z = false;
        }
        Boolean canAddNewReactions = messageRow.getCanAddNewReactions();
        Boolean bool = Boolean.TRUE;
        boolean b = C9971q.m14638b(canAddNewReactions, bool);
        String addReactionLabel = messageRow.getAddReactionLabel();
        String str = "";
        if (addReactionLabel == null) {
            addReactionLabel = str;
        }
        String addNewReactionAccessibilityLabel = messageRow.getAddNewReactionAccessibilityLabel();
        if (addNewReactionAccessibilityLabel == null) {
            addNewReactionAccessibilityLabel = str;
        }
        String addNewBurstReactionAccessibilityLabel = messageRow.getAddNewBurstReactionAccessibilityLabel();
        if (addNewBurstReactionAccessibilityLabel != null) {
            str = addNewBurstReactionAccessibilityLabel;
        }
        ReactionsTheme reactionsTheme = messageRow.getReactionsTheme();
        Truncation truncation = messageRow.getTruncation();
        if (!(messageRow.getMessage() instanceof Message) || !C9971q.m14638b(((Message) messageRow.getMessage()).getUseAttachmentGridLayout(), bool)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(messageRow.getMessage() instanceof Message) || !C9971q.m14638b(((Message) messageRow.getMessage()).getUseAttachmentUploadPreview(), bool)) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean enableSwipeToReply = messageRow.getEnableSwipeToReply();
        if (!(messageRow.getMessage() instanceof Message) || !C9971q.m14638b(((Message) messageRow.getMessage()).getUseSortedReactions(), bool)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!(messageRow.getMessage() instanceof Message) || !C9971q.m14638b(((Message) messageRow.getMessage()).getUseAddBurstReaction(), bool)) {
            z5 = false;
        } else {
            z5 = true;
        }
        return new MessageContext(z, b, addReactionLabel, addNewReactionAccessibilityLabel, str, reactionsTheme, truncation, z2, z3, enableSwipeToReply, z4, z5);
    }
}
