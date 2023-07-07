package com.discord.chat.presentation.list.delegate.messagebundling;

import android.content.Context;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.presentation.events.CreateChatReactEventsKt;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.reactevents.ChatViewEventHandler;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getEventHandler", "Lcom/discord/chat/reactevents/ChatViewEventHandler;", "Lcom/discord/chat/presentation/list/item/MessageItem;", "context", "Landroid/content/Context;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageBundleDelegateUtilsKt {
    private static final ReactEvents reactEvents;

    static {
        ReactEvents createChatReactEvents = CreateChatReactEventsKt.createChatReactEvents();
        createChatReactEvents.exportEventConstants();
        reactEvents = createChatReactEvents;
    }

    public static final ChatViewEventHandler getEventHandler(MessageItem messageItem, final Context context) {
        q.g(messageItem, "<this>");
        q.g(context, "context");
        final ReactEvents reactEvents2 = reactEvents;
        final MessageBundleDelegateUtilsKt$getEventHandler$2 messageBundleDelegateUtilsKt$getEventHandler$2 = new MessageBundleDelegateUtilsKt$getEventHandler$2(messageItem);
        return new ChatViewEventHandler(context, reactEvents2, messageBundleDelegateUtilsKt$getEventHandler$2) { // from class: com.discord.chat.presentation.list.delegate.messagebundling.MessageBundleDelegateUtilsKt$getEventHandler$1
            private final Function4<MessageId, ChannelId, Integer, MediaType, Unit> onMessageLongPressed;
            private final Function2<MessageId, ChannelId, Unit> onMessageTapped;

            @Override // com.discord.chat.reactevents.ChatViewEventHandler, com.discord.chat.presentation.events.ChatEventHandler
            public Function4<MessageId, ChannelId, Integer, MediaType, Unit> getOnMessageLongPressed() {
                return this.onMessageLongPressed;
            }

            @Override // com.discord.chat.reactevents.ChatViewEventHandler, com.discord.chat.presentation.events.ChatEventHandler
            public Function2<MessageId, ChannelId, Unit> getOnMessageTapped() {
                return this.onMessageTapped;
            }
        };
    }
}
