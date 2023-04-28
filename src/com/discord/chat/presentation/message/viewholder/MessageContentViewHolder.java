package com.discord.chat.presentation.message.viewholder;

import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\u009b\u0002\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t2\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000b2*\u0010\u000f\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\tø\u0001\u0000R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m15073d2 = {"Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;", "messageContentItem", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onLinkClicked", "Lkotlin/Function1;", "onLinkLongClicked", "Lkotlin/Function3;", "", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lkotlin/Function0;", "onTapSpoiler", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "onTapSeeMore", "bind", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "messageContentView", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "getMessageContentView", "()Lcom/discord/chat/presentation/message/view/MessageContentView;", "<init>", "(Lcom/discord/chat/presentation/message/view/MessageContentView;)V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MessageContentViewHolder extends MessagePartViewHolder {
    private final MessageContentView messageContentView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageContentViewHolder(MessageContentView messageContentView) {
        super(messageContentView, null);
        C9677q.m14633g(messageContentView, "messageContentView");
        this.messageContentView = messageContentView;
    }

    public final void bind(MessageContentAccessory messageContentItem, Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked, Function1<? super LinkContentNode, Unit> onLinkLongClicked, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function4<? super String, ? super String, ? super String, ? super String, Unit> onLongPressChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, Function0<Unit> onTapSpoiler, Function1<? super String, Unit> onTapTimestamp, Function1<? super EmojiContentNode, Unit> onTapEmoji, Function1<? super MessageId, Unit> onTapSeeMore) {
        C9677q.m14633g(messageContentItem, "messageContentItem");
        C9677q.m14633g(onLinkClicked, "onLinkClicked");
        C9677q.m14633g(onLinkLongClicked, "onLinkLongClicked");
        C9677q.m14633g(onTapChannel, "onTapChannel");
        C9677q.m14633g(onLongPressChannel, "onLongPressChannel");
        C9677q.m14633g(onTapMention, "onTapMention");
        C9677q.m14633g(onTapCommand, "onTapCommand");
        C9677q.m14633g(onLongPressCommand, "onLongPressCommand");
        C9677q.m14633g(onTapSpoiler, "onTapSpoiler");
        C9677q.m14633g(onTapTimestamp, "onTapTimestamp");
        C9677q.m14633g(onTapEmoji, "onTapEmoji");
        C9677q.m14633g(onTapSeeMore, "onTapSeeMore");
        this.messageContentView.setTextColor(messageContentItem.getMessageTextColor());
        DiscordFontUtilsKt.setDiscordFont(this.messageContentView, messageContentItem.getMessageFont());
        SetTextSizeSpKt.setTextSizeSp(this.messageContentView, messageContentItem.getTextSizeSp());
        MessageContentView messageContentView = this.messageContentView;
        StructurableText messageContent = messageContentItem.getMessageContent();
        String str = messageContentItem.mo41765getMessageId3Eiw7ao();
        boolean shouldAnimateEmoji = messageContentItem.getShouldAnimateEmoji();
        boolean shouldShowRoleDot = messageContentItem.getShouldShowRoleDot();
        boolean shouldShowRoleOnName = messageContentItem.getShouldShowRoleOnName();
        int bottomSpacingPx = messageContentItem.getBottomSpacingPx();
        String editedLabel = messageContentItem.getEditedLabel();
        Truncation truncation = messageContentItem.getTruncation();
        messageContentView.m41864setMessageContent2i9KL1s(messageContent, str, shouldAnimateEmoji, shouldShowRoleDot, shouldShowRoleOnName, onLinkClicked, onLinkLongClicked, onTapChannel, onLongPressChannel, onTapMention, onTapCommand, onLongPressCommand, onTapSpoiler, onTapTimestamp, onTapEmoji, onTapSeeMore, new MessageContentViewHolder$bind$1(messageContentItem), bottomSpacingPx, messageContentItem.getConstrainedWidth(), editedLabel, truncation, messageContentItem.getTheme());
    }

    public final MessageContentView getMessageContentView() {
        return this.messageContentView;
    }
}
