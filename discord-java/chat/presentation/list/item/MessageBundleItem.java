package com.discord.chat.presentation.list.item;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/list/item/MessageBundleItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "Lcom/discord/chat/presentation/list/item/MessageBundleConversationItem;", "Lcom/discord/chat/presentation/list/item/MessageBundleMessageItem;", "Lcom/discord/chat/presentation/list/item/MessageBundleViewMoreItem;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MessageBundleItem extends ChatListItem {

    /* renamed from: id  reason: collision with root package name */
    private final String f7252id;

    private MessageBundleItem(String str) {
        super(str, null);
        this.f7252id = str;
    }

    public /* synthetic */ MessageBundleItem(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.discord.chat.presentation.list.item.ChatListItem
    public String getId() {
        return this.f7252id;
    }
}
