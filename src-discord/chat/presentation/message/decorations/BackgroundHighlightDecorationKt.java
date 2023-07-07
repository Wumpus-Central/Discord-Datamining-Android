package com.discord.chat.presentation.message.decorations;

import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.list.item.SystemMessageItem;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"getBackgroundHighlight", "Lcom/discord/chat/bridge/BackgroundHighlight;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BackgroundHighlightDecorationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final BackgroundHighlight getBackgroundHighlight(ChatListItem chatListItem) {
        if (chatListItem instanceof MessageItem) {
            return ((MessageItem) chatListItem).getBackgroundHighlight();
        }
        if (chatListItem instanceof SystemMessageItem) {
            return ((SystemMessageItem) chatListItem).getBackgroundHighlight();
        }
        return null;
    }
}
