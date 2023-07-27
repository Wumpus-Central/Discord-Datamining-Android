package com.discord.chat.presentation.list.item;

import ff.n;
import ff.p;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0082\u0001\r\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/list/item/ChatListItem;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "recyclerItemId", "", "getRecyclerItemId", "()J", "recyclerItemId$delegate", "Lkotlin/Lazy;", "Lcom/discord/chat/presentation/list/item/AutomodSystemMessageItem;", "Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;", "Lcom/discord/chat/presentation/list/item/CallSystemMessageItem;", "Lcom/discord/chat/presentation/list/item/DeserializationErrorChatListItem;", "Lcom/discord/chat/presentation/list/item/DeserializationErrorMessageItem;", "Lcom/discord/chat/presentation/list/item/EmbeddedActivityChatListItem;", "Lcom/discord/chat/presentation/list/item/LoadingChatListItem;", "Lcom/discord/chat/presentation/list/item/MessageBundleItem;", "Lcom/discord/chat/presentation/list/item/MessageItem;", "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "Lcom/discord/chat/presentation/list/item/SeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/SummarySeparatorChatListItem;", "Lcom/discord/chat/presentation/list/item/SystemMessageItem;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public abstract class ChatListItem {

    
    private final String f6931id;
    private final Lazy recyclerItemId$delegate;

    private ChatListItem(String str) {
        Lazy a10;
        this.f6931id = str;
        a10 = n.a(p.NONE, new ChatListItem$recyclerItemId$2(this));
        this.recyclerItemId$delegate = a10;
    }

    public  ChatListItem(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getId() {
        return this.f6931id;
    }

    public final long getRecyclerItemId() {
        return ((Number) this.recyclerItemId$delegate.getValue()).longValue();
    }
}
