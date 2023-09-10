package com.discord.chat.presentation.root;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.SwipeActionsType;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.MessageFrameType;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.bridge.truncation.Truncation;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getMessageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "Lcom/discord/chat/bridge/row/MessageRow;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class MessageContextKt {
    public static final MessageContext getMessageContext(MessageRow messageRow) {
        MessageFrameType messageFrameType;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        q.h(messageRow, "<this>");
        MessageFrame messageFrame = messageRow.getMessageFrame();
        if (messageFrame != null) {
            messageFrameType = messageFrame.getType();
        } else {
            messageFrameType = null;
        }
        if (messageFrameType == MessageFrameType.JUMP_MESSAGE_FRAME) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean canAddNewReactions = messageRow.getCanAddNewReactions();
        Boolean bool = Boolean.TRUE;
        boolean c10 = q.c(canAddNewReactions, bool);
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
        if (!(messageRow.getMessage() instanceof Message) || !q.c(((Message) messageRow.getMessage()).getUseAttachmentGridLayout(), bool)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!(messageRow.getMessage() instanceof Message) || !q.c(((Message) messageRow.getMessage()).getUseAttachmentUploadPreview(), bool)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (messageRow.getSwipeActions() == SwipeActionsType.REPLY || messageRow.getSwipeActions() == SwipeActionsType.REPLY_EDIT) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (messageRow.getSwipeActions() == SwipeActionsType.REPLY_EDIT) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!(messageRow.getMessage() instanceof Message) || !q.c(((Message) messageRow.getMessage()).getUseAddBurstReaction(), bool)) {
            z15 = false;
        } else {
            z15 = true;
        }
        return new MessageContext(z10, c10, addReactionLabel, addNewReactionAccessibilityLabel, str, reactionsTheme, truncation, z11, z12, z13, z14, z15);
    }
}
